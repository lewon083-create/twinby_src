package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.annotation.NonNull;
import io.sentry.Breadcrumb;
import io.sentry.DateUtils;
import io.sentry.Hint;
import io.sentry.ILogger;
import io.sentry.IScopes;
import io.sentry.ISentryLifecycleToken;
import io.sentry.Integration;
import io.sentry.SentryDateProvider;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.TypeCheckHint;
import io.sentry.android.core.internal.util.AndroidConnectionStatusProvider;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.IntegrationUtils;
import io.sentry.util.Objects;
import java.io.Closeable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class NetworkBreadcrumbsIntegration implements Integration, Closeable {

    @NotNull
    private final BuildInfoProvider buildInfoProvider;

    @NotNull
    private final Context context;

    @NotNull
    private final AutoClosableReentrantLock lock = new AutoClosableReentrantLock();

    @Nullable
    volatile NetworkBreadcrumbsNetworkCallback networkCallback;

    @Nullable
    private SentryOptions options;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static class NetworkBreadcrumbConnectionDetail {
        final int downBandwidth;
        final boolean isVpn;
        final int signalStrength;
        private long timestampNanos;

        @NotNull
        final String type;
        final int upBandwidth;

        @SuppressLint({"NewApi"})
        public NetworkBreadcrumbConnectionDetail(@NotNull NetworkCapabilities networkCapabilities, @NotNull BuildInfoProvider buildInfoProvider, long j10) {
            Objects.requireNonNull(networkCapabilities, "NetworkCapabilities is required");
            Objects.requireNonNull(buildInfoProvider, "BuildInfoProvider is required");
            this.downBandwidth = networkCapabilities.getLinkDownstreamBandwidthKbps();
            this.upBandwidth = networkCapabilities.getLinkUpstreamBandwidthKbps();
            int signalStrength = buildInfoProvider.getSdkInfoVersion() >= 29 ? networkCapabilities.getSignalStrength() : 0;
            this.signalStrength = signalStrength > -100 ? signalStrength : 0;
            this.isVpn = networkCapabilities.hasTransport(4);
            String connectionType = AndroidConnectionStatusProvider.getConnectionType(networkCapabilities);
            this.type = connectionType == null ? "" : connectionType;
            this.timestampNanos = j10;
        }

        public boolean isSimilar(@NotNull NetworkBreadcrumbConnectionDetail networkBreadcrumbConnectionDetail) {
            int iAbs = Math.abs(this.signalStrength - networkBreadcrumbConnectionDetail.signalStrength);
            int iAbs2 = Math.abs(this.downBandwidth - networkBreadcrumbConnectionDetail.downBandwidth);
            int iAbs3 = Math.abs(this.upBandwidth - networkBreadcrumbConnectionDetail.upBandwidth);
            boolean z5 = DateUtils.nanosToMillis((double) Math.abs(this.timestampNanos - networkBreadcrumbConnectionDetail.timestampNanos)) < 5000.0d;
            return this.isVpn == networkBreadcrumbConnectionDetail.isVpn && this.type.equals(networkBreadcrumbConnectionDetail.type) && (z5 || iAbs <= 5) && (z5 || (((double) iAbs2) > Math.max(1000.0d, ((double) Math.abs(this.downBandwidth)) * 0.1d) ? 1 : (((double) iAbs2) == Math.max(1000.0d, ((double) Math.abs(this.downBandwidth)) * 0.1d) ? 0 : -1)) <= 0) && (z5 || (((double) iAbs3) > Math.max(1000.0d, ((double) Math.abs(this.upBandwidth)) * 0.1d) ? 1 : (((double) iAbs3) == Math.max(1000.0d, ((double) Math.abs(this.upBandwidth)) * 0.1d) ? 0 : -1)) <= 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class NetworkBreadcrumbsNetworkCallback extends ConnectivityManager.NetworkCallback {

        @NotNull
        final BuildInfoProvider buildInfoProvider;

        @NotNull
        final SentryDateProvider dateProvider;

        @Nullable
        NetworkCapabilities lastCapabilities = null;
        long lastCapabilityNanos = 0;

        @NotNull
        final IScopes scopes;

        public NetworkBreadcrumbsNetworkCallback(@NotNull IScopes iScopes, @NotNull BuildInfoProvider buildInfoProvider, @NotNull SentryDateProvider sentryDateProvider) {
            this.scopes = (IScopes) Objects.requireNonNull(iScopes, "Scopes are required");
            this.buildInfoProvider = (BuildInfoProvider) Objects.requireNonNull(buildInfoProvider, "BuildInfoProvider is required");
            this.dateProvider = (SentryDateProvider) Objects.requireNonNull(sentryDateProvider, "SentryDateProvider is required");
        }

        private Breadcrumb createBreadcrumb(String str) {
            Breadcrumb breadcrumb = new Breadcrumb();
            breadcrumb.setType("system");
            breadcrumb.setCategory("network.event");
            breadcrumb.setData("action", str);
            breadcrumb.setLevel(SentryLevel.INFO);
            return breadcrumb;
        }

        @Nullable
        private NetworkBreadcrumbConnectionDetail getNewConnectionDetails(@Nullable NetworkCapabilities networkCapabilities, @NotNull NetworkCapabilities networkCapabilities2, long j10, long j11) {
            if (networkCapabilities == null) {
                return new NetworkBreadcrumbConnectionDetail(networkCapabilities2, this.buildInfoProvider, j11);
            }
            NetworkBreadcrumbConnectionDetail networkBreadcrumbConnectionDetail = new NetworkBreadcrumbConnectionDetail(networkCapabilities, this.buildInfoProvider, j10);
            NetworkBreadcrumbConnectionDetail networkBreadcrumbConnectionDetail2 = new NetworkBreadcrumbConnectionDetail(networkCapabilities2, this.buildInfoProvider, j11);
            if (networkBreadcrumbConnectionDetail.isSimilar(networkBreadcrumbConnectionDetail2)) {
                return null;
            }
            return networkBreadcrumbConnectionDetail2;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(@NonNull Network network) {
            this.scopes.addBreadcrumb(createBreadcrumb("NETWORK_AVAILABLE"));
            this.lastCapabilities = null;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(@NonNull Network network, @NonNull NetworkCapabilities networkCapabilities) {
            long jNanoTimestamp = this.dateProvider.now().nanoTimestamp();
            NetworkBreadcrumbConnectionDetail newConnectionDetails = getNewConnectionDetails(this.lastCapabilities, networkCapabilities, this.lastCapabilityNanos, jNanoTimestamp);
            if (newConnectionDetails == null) {
                return;
            }
            this.lastCapabilities = networkCapabilities;
            this.lastCapabilityNanos = jNanoTimestamp;
            Breadcrumb breadcrumbCreateBreadcrumb = createBreadcrumb("NETWORK_CAPABILITIES_CHANGED");
            breadcrumbCreateBreadcrumb.setData("download_bandwidth", Integer.valueOf(newConnectionDetails.downBandwidth));
            breadcrumbCreateBreadcrumb.setData("upload_bandwidth", Integer.valueOf(newConnectionDetails.upBandwidth));
            breadcrumbCreateBreadcrumb.setData("vpn_active", Boolean.valueOf(newConnectionDetails.isVpn));
            breadcrumbCreateBreadcrumb.setData("network_type", newConnectionDetails.type);
            int i = newConnectionDetails.signalStrength;
            if (i != 0) {
                breadcrumbCreateBreadcrumb.setData("signal_strength", Integer.valueOf(i));
            }
            Hint hint = new Hint();
            hint.set(TypeCheckHint.ANDROID_NETWORK_CAPABILITIES, newConnectionDetails);
            this.scopes.addBreadcrumb(breadcrumbCreateBreadcrumb, hint);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(@NonNull Network network) {
            this.scopes.addBreadcrumb(createBreadcrumb("NETWORK_LOST"));
            this.lastCapabilities = null;
        }
    }

    public NetworkBreadcrumbsIntegration(@NotNull Context context, @NotNull BuildInfoProvider buildInfoProvider) {
        this.context = (Context) Objects.requireNonNull(ContextUtils.getApplicationContext(context), "Context is required");
        this.buildInfoProvider = (BuildInfoProvider) Objects.requireNonNull(buildInfoProvider, "BuildInfoProvider is required");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            NetworkBreadcrumbsNetworkCallback networkBreadcrumbsNetworkCallback = this.networkCallback;
            this.networkCallback = null;
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            if (networkBreadcrumbsNetworkCallback != null) {
                AndroidConnectionStatusProvider.removeNetworkCallback(networkBreadcrumbsNetworkCallback);
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

    @Override // io.sentry.Integration
    public void register(@NotNull IScopes iScopes, @NotNull SentryOptions sentryOptions) {
        Objects.requireNonNull(iScopes, "Scopes are required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) Objects.requireNonNull(sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null, "SentryAndroidOptions is required");
        this.options = sentryOptions;
        ILogger logger = sentryOptions.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        logger.log(sentryLevel, "NetworkBreadcrumbsIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()));
        if (sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()) {
            if (this.buildInfoProvider.getSdkInfoVersion() < 24) {
                sentryOptions.getLogger().log(sentryLevel, "NetworkCallbacks need Android N+.", new Object[0]);
                return;
            }
            ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
            try {
                this.networkCallback = new NetworkBreadcrumbsNetworkCallback(iScopes, this.buildInfoProvider, sentryOptions.getDateProvider());
                if (AndroidConnectionStatusProvider.addNetworkCallback(this.context, sentryOptions.getLogger(), this.buildInfoProvider, this.networkCallback)) {
                    sentryOptions.getLogger().log(sentryLevel, "NetworkBreadcrumbsIntegration installed.", new Object[0]);
                    IntegrationUtils.addIntegrationToSdkVersion("NetworkBreadcrumbs");
                } else {
                    sentryOptions.getLogger().log(sentryLevel, "NetworkBreadcrumbsIntegration not installed.", new Object[0]);
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
}
