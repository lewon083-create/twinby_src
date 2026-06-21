package io.sentry.android.core.internal.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Handler;
import androidx.annotation.NonNull;
import io.sentry.IConnectionStatusProvider;
import io.sentry.ILogger;
import io.sentry.ISentryLifecycleToken;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.core.AppState;
import io.sentry.android.core.BuildInfoProvider;
import io.sentry.android.core.ContextUtils;
import io.sentry.transport.ICurrentDateProvider;
import io.sentry.util.AutoClosableReentrantLock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class AndroidConnectionStatusProvider implements IConnectionStatusProvider, AppState.AppStateListener {
    private static final long CACHE_TTL_MS = 120000;

    @Nullable
    private static volatile ConnectivityManager connectivityManager;

    @NotNull
    private final BuildInfoProvider buildInfoProvider;

    @Nullable
    private volatile NetworkCapabilities cachedNetworkCapabilities;

    @NotNull
    private final List<IConnectionStatusProvider.IConnectionStatusObserver> connectionStatusObservers;

    @NotNull
    private final Context context;

    @Nullable
    private volatile Network currentNetwork;

    @Nullable
    private final Handler handler;

    @NotNull
    private final AtomicBoolean isConnected;
    private volatile long lastCacheUpdateTime;

    @NotNull
    private final AutoClosableReentrantLock lock;

    @Nullable
    private volatile ConnectivityManager.NetworkCallback networkCallback;

    @NotNull
    private final SentryOptions options;

    @NotNull
    private final ICurrentDateProvider timeProvider;

    @NotNull
    private static final AutoClosableReentrantLock connectivityManagerLock = new AutoClosableReentrantLock();

    @NotNull
    private static final AutoClosableReentrantLock childCallbacksLock = new AutoClosableReentrantLock();

    @NotNull
    private static final List<ConnectivityManager.NetworkCallback> childCallbacks = new ArrayList();
    private static final int[] transports = {1, 0, 3, 2};
    private static final int[] capabilities = new int[2];

    public AndroidConnectionStatusProvider(@NotNull Context context, @NotNull SentryOptions sentryOptions, @NotNull BuildInfoProvider buildInfoProvider, @NotNull ICurrentDateProvider iCurrentDateProvider) {
        this(context, sentryOptions, buildInfoProvider, iCurrentDateProvider, null);
    }

    public static boolean addNetworkCallback(@NotNull Context context, @NotNull ILogger iLogger, @NotNull BuildInfoProvider buildInfoProvider, @NotNull ConnectivityManager.NetworkCallback networkCallback) {
        if (buildInfoProvider.getSdkInfoVersion() < 24) {
            iLogger.log(SentryLevel.DEBUG, "NetworkCallbacks need Android N+.", new Object[0]);
            return false;
        }
        if (!Permissions.hasPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
            iLogger.log(SentryLevel.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return false;
        }
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = childCallbacksLock.acquire();
        try {
            childCallbacks.add(networkCallback);
            if (iSentryLifecycleTokenAcquire == null) {
                return true;
            }
            iSentryLifecycleTokenAcquire.close();
            return true;
        } catch (Throwable th2) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ensureNetworkCallbackRegistered, reason: merged with bridge method [inline-methods] */
    public void lambda$new$0() {
        if (ContextUtils.isForegroundImportance() && this.networkCallback == null) {
            ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
            try {
                if (this.networkCallback != null) {
                    if (iSentryLifecycleTokenAcquire != null) {
                        iSentryLifecycleTokenAcquire.close();
                        return;
                    }
                    return;
                }
                ConnectivityManager.NetworkCallback networkCallback = new ConnectivityManager.NetworkCallback() { // from class: io.sentry.android.core.internal.util.AndroidConnectionStatusProvider.1
                    private void clearCacheAndNotifyObservers() {
                        AndroidConnectionStatusProvider.this.isConnected.set(false);
                        ISentryLifecycleToken iSentryLifecycleTokenAcquire2 = AndroidConnectionStatusProvider.this.lock.acquire();
                        try {
                            AndroidConnectionStatusProvider.this.cachedNetworkCapabilities = null;
                            AndroidConnectionStatusProvider.this.currentNetwork = null;
                            AndroidConnectionStatusProvider androidConnectionStatusProvider = AndroidConnectionStatusProvider.this;
                            androidConnectionStatusProvider.lastCacheUpdateTime = androidConnectionStatusProvider.timeProvider.getCurrentTimeMillis();
                            AndroidConnectionStatusProvider.this.options.getLogger().log(SentryLevel.DEBUG, "Cache cleared - network lost/unavailable", new Object[0]);
                            Iterator it = AndroidConnectionStatusProvider.this.connectionStatusObservers.iterator();
                            while (it.hasNext()) {
                                ((IConnectionStatusProvider.IConnectionStatusObserver) it.next()).onConnectionStatusChanged(IConnectionStatusProvider.ConnectionStatus.DISCONNECTED);
                            }
                            if (iSentryLifecycleTokenAcquire2 != null) {
                                iSentryLifecycleTokenAcquire2.close();
                            }
                        } catch (Throwable th2) {
                            if (iSentryLifecycleTokenAcquire2 != null) {
                                try {
                                    iSentryLifecycleTokenAcquire2.close();
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                            }
                            throw th2;
                        }
                    }

                    private boolean hasSignificantCapabilityChanges(@NotNull NetworkCapabilities networkCapabilities, @NotNull NetworkCapabilities networkCapabilities2) {
                        for (int i : AndroidConnectionStatusProvider.capabilities) {
                            if (i != 0 && networkCapabilities.hasCapability(i) != networkCapabilities2.hasCapability(i)) {
                                return true;
                            }
                        }
                        return false;
                    }

                    private boolean hasSignificantTransportChanges(@NotNull NetworkCapabilities networkCapabilities, @NotNull NetworkCapabilities networkCapabilities2) {
                        for (int i : AndroidConnectionStatusProvider.transports) {
                            if (networkCapabilities.hasTransport(i) != networkCapabilities2.hasTransport(i)) {
                                return true;
                            }
                        }
                        return false;
                    }

                    private boolean isSignificantChange(@Nullable NetworkCapabilities networkCapabilities) {
                        NetworkCapabilities networkCapabilities2 = AndroidConnectionStatusProvider.this.cachedNetworkCapabilities;
                        if ((networkCapabilities2 == null) != (networkCapabilities == null)) {
                            return true;
                        }
                        if (networkCapabilities2 == null && networkCapabilities == null) {
                            return false;
                        }
                        return hasSignificantCapabilityChanges(networkCapabilities2, networkCapabilities) || hasSignificantTransportChanges(networkCapabilities2, networkCapabilities);
                    }

                    private void updateCacheAndNotifyObservers(@Nullable Network network, @Nullable NetworkCapabilities networkCapabilities) {
                        if (isSignificantChange(networkCapabilities)) {
                            AndroidConnectionStatusProvider.this.updateCache(networkCapabilities);
                            IConnectionStatusProvider.ConnectionStatus connectionStatusFromCache = AndroidConnectionStatusProvider.this.getConnectionStatusFromCache();
                            ISentryLifecycleToken iSentryLifecycleTokenAcquire2 = AndroidConnectionStatusProvider.this.lock.acquire();
                            try {
                                Iterator it = AndroidConnectionStatusProvider.this.connectionStatusObservers.iterator();
                                while (it.hasNext()) {
                                    ((IConnectionStatusProvider.IConnectionStatusObserver) it.next()).onConnectionStatusChanged(connectionStatusFromCache);
                                }
                                if (iSentryLifecycleTokenAcquire2 != null) {
                                    iSentryLifecycleTokenAcquire2.close();
                                }
                            } catch (Throwable th2) {
                                if (iSentryLifecycleTokenAcquire2 != null) {
                                    try {
                                        iSentryLifecycleTokenAcquire2.close();
                                    } catch (Throwable th3) {
                                        th2.addSuppressed(th3);
                                    }
                                }
                                throw th2;
                            }
                        }
                    }

                    @Override // android.net.ConnectivityManager.NetworkCallback
                    public void onAvailable(@NotNull Network network) {
                        AndroidConnectionStatusProvider.this.currentNetwork = network;
                        if (AndroidConnectionStatusProvider.this.isConnected.getAndSet(true)) {
                            return;
                        }
                        ISentryLifecycleToken iSentryLifecycleTokenAcquire2 = AndroidConnectionStatusProvider.childCallbacksLock.acquire();
                        try {
                            Iterator it = AndroidConnectionStatusProvider.childCallbacks.iterator();
                            while (it.hasNext()) {
                                ((ConnectivityManager.NetworkCallback) it.next()).onAvailable(network);
                            }
                            if (iSentryLifecycleTokenAcquire2 != null) {
                                iSentryLifecycleTokenAcquire2.close();
                            }
                        } catch (Throwable th2) {
                            if (iSentryLifecycleTokenAcquire2 != null) {
                                try {
                                    iSentryLifecycleTokenAcquire2.close();
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                            }
                            throw th2;
                        }
                    }

                    @Override // android.net.ConnectivityManager.NetworkCallback
                    public void onCapabilitiesChanged(@NonNull Network network, @NonNull NetworkCapabilities networkCapabilities) {
                        if (network.equals(AndroidConnectionStatusProvider.this.currentNetwork)) {
                            updateCacheAndNotifyObservers(network, networkCapabilities);
                            ISentryLifecycleToken iSentryLifecycleTokenAcquire2 = AndroidConnectionStatusProvider.childCallbacksLock.acquire();
                            try {
                                Iterator it = AndroidConnectionStatusProvider.childCallbacks.iterator();
                                while (it.hasNext()) {
                                    ((ConnectivityManager.NetworkCallback) it.next()).onCapabilitiesChanged(network, networkCapabilities);
                                }
                                if (iSentryLifecycleTokenAcquire2 != null) {
                                    iSentryLifecycleTokenAcquire2.close();
                                }
                            } catch (Throwable th2) {
                                if (iSentryLifecycleTokenAcquire2 != null) {
                                    try {
                                        iSentryLifecycleTokenAcquire2.close();
                                    } catch (Throwable th3) {
                                        th2.addSuppressed(th3);
                                    }
                                }
                                throw th2;
                            }
                        }
                    }

                    @Override // android.net.ConnectivityManager.NetworkCallback
                    public void onLost(@NotNull Network network) {
                        if (network.equals(AndroidConnectionStatusProvider.this.currentNetwork)) {
                            clearCacheAndNotifyObservers();
                            ISentryLifecycleToken iSentryLifecycleTokenAcquire2 = AndroidConnectionStatusProvider.childCallbacksLock.acquire();
                            try {
                                Iterator it = AndroidConnectionStatusProvider.childCallbacks.iterator();
                                while (it.hasNext()) {
                                    ((ConnectivityManager.NetworkCallback) it.next()).onLost(network);
                                }
                                if (iSentryLifecycleTokenAcquire2 != null) {
                                    iSentryLifecycleTokenAcquire2.close();
                                }
                            } catch (Throwable th2) {
                                if (iSentryLifecycleTokenAcquire2 != null) {
                                    try {
                                        iSentryLifecycleTokenAcquire2.close();
                                    } catch (Throwable th3) {
                                        th2.addSuppressed(th3);
                                    }
                                }
                                throw th2;
                            }
                        }
                    }

                    @Override // android.net.ConnectivityManager.NetworkCallback
                    public void onUnavailable() {
                        clearCacheAndNotifyObservers();
                        ISentryLifecycleToken iSentryLifecycleTokenAcquire2 = AndroidConnectionStatusProvider.childCallbacksLock.acquire();
                        try {
                            Iterator it = AndroidConnectionStatusProvider.childCallbacks.iterator();
                            while (it.hasNext()) {
                                ((ConnectivityManager.NetworkCallback) it.next()).onUnavailable();
                            }
                            if (iSentryLifecycleTokenAcquire2 != null) {
                                iSentryLifecycleTokenAcquire2.close();
                            }
                        } catch (Throwable th2) {
                            if (iSentryLifecycleTokenAcquire2 != null) {
                                try {
                                    iSentryLifecycleTokenAcquire2.close();
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                            }
                            throw th2;
                        }
                    }
                };
                if (registerNetworkCallback(this.context, this.options.getLogger(), this.buildInfoProvider, this.handler, networkCallback)) {
                    this.networkCallback = networkCallback;
                    this.options.getLogger().log(SentryLevel.DEBUG, "Network callback registered successfully", new Object[0]);
                } else {
                    this.options.getLogger().log(SentryLevel.WARNING, "Failed to register network callback", new Object[0]);
                }
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                }
            } catch (Throwable th2) {
                if (iSentryLifecycleTokenAcquire != null) {
                    try {
                        iSentryLifecycleTokenAcquire.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    @NotNull
    public static List<ConnectivityManager.NetworkCallback> getChildCallbacks() {
        return childCallbacks;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NotNull
    public IConnectionStatusProvider.ConnectionStatus getConnectionStatusFromCache() {
        if (this.cachedNetworkCapabilities != null) {
            return isNetworkEffectivelyConnected(this.cachedNetworkCapabilities) ? IConnectionStatusProvider.ConnectionStatus.CONNECTED : IConnectionStatusProvider.ConnectionStatus.DISCONNECTED;
        }
        ConnectivityManager connectivityManager2 = getConnectivityManager(this.context, this.options.getLogger());
        return connectivityManager2 != null ? getConnectionStatus(this.context, connectivityManager2, this.options.getLogger()) : IConnectionStatusProvider.ConnectionStatus.UNKNOWN;
    }

    @Nullable
    private String getConnectionTypeFromCache() {
        NetworkCapabilities networkCapabilities = this.cachedNetworkCapabilities;
        return networkCapabilities != null ? getConnectionType(networkCapabilities) : getConnectionType(this.context, this.options.getLogger(), this.buildInfoProvider);
    }

    @Nullable
    private static ConnectivityManager getConnectivityManager(@NotNull Context context, @NotNull ILogger iLogger) {
        if (connectivityManager != null) {
            return connectivityManager;
        }
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = connectivityManagerLock.acquire();
        try {
            if (connectivityManager != null) {
                ConnectivityManager connectivityManager2 = connectivityManager;
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                }
                return connectivityManager2;
            }
            connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                iLogger.log(SentryLevel.INFO, "ConnectivityManager is null and cannot check network status", new Object[0]);
            }
            ConnectivityManager connectivityManager3 = connectivityManager;
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            return connectivityManager3;
        } catch (Throwable th2) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    private boolean isCacheValid() {
        return this.timeProvider.getCurrentTimeMillis() - this.lastCacheUpdateTime < CACHE_TTL_MS;
    }

    @SuppressLint({"InlinedApi"})
    private boolean isNetworkEffectivelyConnected(@Nullable NetworkCapabilities networkCapabilities) {
        if (networkCapabilities == null) {
            return false;
        }
        boolean zHasCapability = networkCapabilities.hasCapability(12);
        if (this.buildInfoProvider.getSdkInfoVersion() >= 23) {
            zHasCapability = zHasCapability && networkCapabilities.hasCapability(16);
        }
        if (!zHasCapability) {
            return false;
        }
        for (int i : transports) {
            if (networkCapabilities.hasTransport(i)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$close$1() {
        unregisterNetworkCallback(true);
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = childCallbacksLock.acquire();
        try {
            childCallbacks.clear();
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            iSentryLifecycleTokenAcquire = connectivityManagerLock.acquire();
            try {
                connectivityManager = null;
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                }
                AppState.getInstance().removeAppStateListener(this);
            } finally {
            }
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onBackground$3() {
        unregisterNetworkCallback(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onForeground$2() {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire;
        updateCache(null);
        IConnectionStatusProvider.ConnectionStatus connectionStatusFromCache = getConnectionStatusFromCache();
        if (connectionStatusFromCache == IConnectionStatusProvider.ConnectionStatus.DISCONNECTED) {
            this.isConnected.set(false);
            iSentryLifecycleTokenAcquire = childCallbacksLock.acquire();
            try {
                Iterator<ConnectivityManager.NetworkCallback> it = childCallbacks.iterator();
                while (it.hasNext()) {
                    it.next().onLost(null);
                }
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                }
            } finally {
            }
        }
        iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            Iterator<IConnectionStatusProvider.IConnectionStatusObserver> it2 = this.connectionStatusObservers.iterator();
            while (it2.hasNext()) {
                it2.next().onConnectionStatusChanged(connectionStatusFromCache);
            }
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            lambda$new$0();
        } finally {
        }
    }

    @SuppressLint({"MissingPermission", "NewApi"})
    public static boolean registerNetworkCallback(@NotNull Context context, @NotNull ILogger iLogger, @NotNull BuildInfoProvider buildInfoProvider, @Nullable Handler handler, @NotNull ConnectivityManager.NetworkCallback networkCallback) {
        if (buildInfoProvider.getSdkInfoVersion() < 24) {
            iLogger.log(SentryLevel.DEBUG, "NetworkCallbacks need Android N+.", new Object[0]);
            return false;
        }
        ConnectivityManager connectivityManager2 = getConnectivityManager(context, iLogger);
        if (connectivityManager2 == null) {
            return false;
        }
        if (!Permissions.hasPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
            iLogger.log(SentryLevel.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return false;
        }
        try {
            if (handler != null) {
                connectivityManager2.registerDefaultNetworkCallback(networkCallback, handler);
                return true;
            }
            connectivityManager2.registerDefaultNetworkCallback(networkCallback);
            return true;
        } catch (Throwable th2) {
            iLogger.log(SentryLevel.WARNING, "registerDefaultNetworkCallback failed", th2);
            return false;
        }
    }

    public static void removeNetworkCallback(@NotNull ConnectivityManager.NetworkCallback networkCallback) {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = childCallbacksLock.acquire();
        try {
            childCallbacks.remove(networkCallback);
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
        } catch (Throwable th2) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    private void submitSafe(@NotNull Runnable runnable) {
        try {
            this.options.getExecutorService().submit(runnable);
        } catch (Throwable th2) {
            this.options.getLogger().log(SentryLevel.ERROR, "AndroidConnectionStatusProvider submit failed", th2);
        }
    }

    private void unregisterNetworkCallback(boolean z5) {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        if (z5) {
            try {
                this.connectionStatusObservers.clear();
            } catch (Throwable th2) {
                if (iSentryLifecycleTokenAcquire != null) {
                    try {
                        iSentryLifecycleTokenAcquire.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
        ConnectivityManager.NetworkCallback networkCallback = this.networkCallback;
        this.networkCallback = null;
        if (networkCallback != null) {
            unregisterNetworkCallback(this.context, this.options.getLogger(), networkCallback);
        }
        this.cachedNetworkCapabilities = null;
        this.currentNetwork = null;
        this.lastCacheUpdateTime = 0L;
        if (iSentryLifecycleTokenAcquire != null) {
            iSentryLifecycleTokenAcquire.close();
        }
        this.options.getLogger().log(SentryLevel.DEBUG, "Network callback unregistered", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"NewApi", "MissingPermission"})
    public void updateCache(@Nullable NetworkCapabilities networkCapabilities) {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            if (networkCapabilities != null) {
                this.cachedNetworkCapabilities = networkCapabilities;
            } else {
                if (!Permissions.hasPermission(this.context, "android.permission.ACCESS_NETWORK_STATE")) {
                    this.options.getLogger().log(SentryLevel.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
                    this.cachedNetworkCapabilities = null;
                    this.lastCacheUpdateTime = this.timeProvider.getCurrentTimeMillis();
                    if (iSentryLifecycleTokenAcquire != null) {
                        iSentryLifecycleTokenAcquire.close();
                        return;
                    }
                    return;
                }
                if (this.buildInfoProvider.getSdkInfoVersion() < 23) {
                    this.cachedNetworkCapabilities = null;
                    this.lastCacheUpdateTime = this.timeProvider.getCurrentTimeMillis();
                    if (iSentryLifecycleTokenAcquire != null) {
                        iSentryLifecycleTokenAcquire.close();
                        return;
                    }
                    return;
                }
                ConnectivityManager connectivityManager2 = getConnectivityManager(this.context, this.options.getLogger());
                if (connectivityManager2 != null) {
                    Network activeNetwork = connectivityManager2.getActiveNetwork();
                    this.cachedNetworkCapabilities = activeNetwork != null ? connectivityManager2.getNetworkCapabilities(activeNetwork) : null;
                } else {
                    this.cachedNetworkCapabilities = null;
                }
            }
            this.lastCacheUpdateTime = this.timeProvider.getCurrentTimeMillis();
            this.options.getLogger().log(SentryLevel.DEBUG, "Cache updated - Status: " + getConnectionStatusFromCache() + ", Type: " + getConnectionTypeFromCache(), new Object[0]);
        } catch (Throwable th2) {
            try {
                this.options.getLogger().log(SentryLevel.WARNING, "Failed to update connection status cache", th2);
                this.cachedNetworkCapabilities = null;
                this.lastCacheUpdateTime = this.timeProvider.getCurrentTimeMillis();
            } catch (Throwable th3) {
                if (iSentryLifecycleTokenAcquire != null) {
                    try {
                        iSentryLifecycleTokenAcquire.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        }
        if (iSentryLifecycleTokenAcquire != null) {
            iSentryLifecycleTokenAcquire.close();
        }
    }

    @Override // io.sentry.IConnectionStatusProvider
    public boolean addConnectionStatusObserver(@NotNull IConnectionStatusProvider.IConnectionStatusObserver iConnectionStatusObserver) {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            this.connectionStatusObservers.add(iConnectionStatusObserver);
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            lambda$new$0();
            return this.networkCallback != null;
        } catch (Throwable th2) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        submitSafe(new a(this, 1));
    }

    @Nullable
    public NetworkCapabilities getCachedNetworkCapabilities() {
        return this.cachedNetworkCapabilities;
    }

    @Override // io.sentry.IConnectionStatusProvider
    @NotNull
    public IConnectionStatusProvider.ConnectionStatus getConnectionStatus() {
        if (!isCacheValid()) {
            updateCache(null);
        }
        return getConnectionStatusFromCache();
    }

    @Override // io.sentry.IConnectionStatusProvider
    @Nullable
    public String getConnectionType() {
        if (!isCacheValid()) {
            updateCache(null);
        }
        return getConnectionTypeFromCache();
    }

    @Nullable
    public ConnectivityManager.NetworkCallback getNetworkCallback() {
        return this.networkCallback;
    }

    @NotNull
    public List<IConnectionStatusProvider.IConnectionStatusObserver> getStatusObservers() {
        return this.connectionStatusObservers;
    }

    @Override // io.sentry.android.core.AppState.AppStateListener
    public void onBackground() {
        if (this.networkCallback == null) {
            return;
        }
        submitSafe(new a(this, 0));
    }

    @Override // io.sentry.android.core.AppState.AppStateListener
    public void onForeground() {
        if (this.networkCallback != null) {
            return;
        }
        submitSafe(new a(this, 2));
    }

    @Override // io.sentry.IConnectionStatusProvider
    public void removeConnectionStatusObserver(@NotNull IConnectionStatusProvider.IConnectionStatusObserver iConnectionStatusObserver) {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            this.connectionStatusObservers.remove(iConnectionStatusObserver);
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
        } catch (Throwable th2) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @SuppressLint({"InlinedApi"})
    public AndroidConnectionStatusProvider(@NotNull Context context, @NotNull SentryOptions sentryOptions, @NotNull BuildInfoProvider buildInfoProvider, @NotNull ICurrentDateProvider iCurrentDateProvider, @Nullable Handler handler) {
        this.lock = new AutoClosableReentrantLock();
        this.lastCacheUpdateTime = 0L;
        this.isConnected = new AtomicBoolean(false);
        this.context = ContextUtils.getApplicationContext(context);
        this.options = sentryOptions;
        this.buildInfoProvider = buildInfoProvider;
        this.timeProvider = iCurrentDateProvider;
        this.handler = handler;
        this.connectionStatusObservers = new ArrayList();
        int[] iArr = capabilities;
        iArr[0] = 12;
        if (buildInfoProvider.getSdkInfoVersion() >= 23) {
            iArr[1] = 16;
        }
        submitSafe(new a(this, 3));
        AppState.getInstance().addAppStateListener(this);
    }

    @NotNull
    private static IConnectionStatusProvider.ConnectionStatus getConnectionStatus(@NotNull Context context, @NotNull ConnectivityManager connectivityManager2, @NotNull ILogger iLogger) {
        if (!Permissions.hasPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
            iLogger.log(SentryLevel.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return IConnectionStatusProvider.ConnectionStatus.NO_PERMISSION;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager2.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                iLogger.log(SentryLevel.INFO, "NetworkInfo is null, there's no active network.", new Object[0]);
                return IConnectionStatusProvider.ConnectionStatus.DISCONNECTED;
            }
            if (activeNetworkInfo.isConnected()) {
                return IConnectionStatusProvider.ConnectionStatus.CONNECTED;
            }
            return IConnectionStatusProvider.ConnectionStatus.DISCONNECTED;
        } catch (Throwable th2) {
            iLogger.log(SentryLevel.WARNING, "Could not retrieve Connection Status", th2);
            return IConnectionStatusProvider.ConnectionStatus.UNKNOWN;
        }
    }

    @SuppressLint({"ObsoleteSdkInt", "MissingPermission", "NewApi"})
    @Nullable
    public static String getConnectionType(@NotNull Context context, @NotNull ILogger iLogger, @NotNull BuildInfoProvider buildInfoProvider) {
        boolean zHasTransport;
        boolean zHasTransport2;
        ConnectivityManager connectivityManager2 = getConnectivityManager(context, iLogger);
        if (connectivityManager2 == null) {
            return null;
        }
        boolean z5 = false;
        if (!Permissions.hasPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
            iLogger.log(SentryLevel.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return null;
        }
        try {
            zHasTransport = true;
            if (buildInfoProvider.getSdkInfoVersion() >= 23) {
                Network activeNetwork = connectivityManager2.getActiveNetwork();
                if (activeNetwork == null) {
                    iLogger.log(SentryLevel.INFO, "Network is null and cannot check network status", new Object[0]);
                    return null;
                }
                NetworkCapabilities networkCapabilities = connectivityManager2.getNetworkCapabilities(activeNetwork);
                if (networkCapabilities == null) {
                    iLogger.log(SentryLevel.INFO, "NetworkCapabilities is null and cannot check network type", new Object[0]);
                    return null;
                }
                boolean zHasTransport3 = networkCapabilities.hasTransport(3);
                zHasTransport2 = networkCapabilities.hasTransport(1);
                zHasTransport = networkCapabilities.hasTransport(0);
                z5 = zHasTransport3;
            } else {
                NetworkInfo activeNetworkInfo = connectivityManager2.getActiveNetworkInfo();
                if (activeNetworkInfo == null) {
                    iLogger.log(SentryLevel.INFO, "NetworkInfo is null, there's no active network.", new Object[0]);
                    return null;
                }
                int type = activeNetworkInfo.getType();
                if (type == 0) {
                    zHasTransport2 = false;
                } else if (type != 1) {
                    if (type != 9) {
                        zHasTransport2 = false;
                    } else {
                        zHasTransport2 = false;
                        z5 = true;
                    }
                    zHasTransport = zHasTransport2;
                } else {
                    zHasTransport2 = true;
                    zHasTransport = false;
                }
            }
        } catch (Throwable th2) {
            iLogger.log(SentryLevel.ERROR, "Failed to retrieve network info", th2);
        }
        if (z5) {
            return "ethernet";
        }
        if (zHasTransport2) {
            return "wifi";
        }
        if (zHasTransport) {
            return "cellular";
        }
        return null;
    }

    @SuppressLint({"NewApi"})
    public static void unregisterNetworkCallback(@NotNull Context context, @NotNull ILogger iLogger, @NotNull ConnectivityManager.NetworkCallback networkCallback) {
        ConnectivityManager connectivityManager2 = getConnectivityManager(context, iLogger);
        if (connectivityManager2 == null) {
            return;
        }
        try {
            connectivityManager2.unregisterNetworkCallback(networkCallback);
        } catch (Throwable th2) {
            iLogger.log(SentryLevel.WARNING, "unregisterNetworkCallback failed", th2);
        }
    }

    @Nullable
    public static String getConnectionType(@NotNull NetworkCapabilities networkCapabilities) {
        if (networkCapabilities.hasTransport(3)) {
            return "ethernet";
        }
        if (networkCapabilities.hasTransport(1)) {
            return "wifi";
        }
        if (networkCapabilities.hasTransport(0)) {
            return "cellular";
        }
        return null;
    }
}
