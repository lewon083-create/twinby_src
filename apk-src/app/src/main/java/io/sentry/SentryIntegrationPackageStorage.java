package io.sentry;

import io.sentry.protocol.SentryPackage;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class SentryIntegrationPackageStorage {

    @Nullable
    private static volatile SentryIntegrationPackageStorage INSTANCE;
    private final Set<String> integrations = new CopyOnWriteArraySet();
    private final Set<SentryPackage> packages = new CopyOnWriteArraySet();

    @NotNull
    private static final AutoClosableReentrantLock staticLock = new AutoClosableReentrantLock();

    @Nullable
    private static volatile Boolean mixedVersionsDetected = null;

    @NotNull
    private static final AutoClosableReentrantLock mixedVersionsLock = new AutoClosableReentrantLock();

    private SentryIntegrationPackageStorage() {
    }

    @NotNull
    public static SentryIntegrationPackageStorage getInstance() {
        if (INSTANCE == null) {
            ISentryLifecycleToken iSentryLifecycleTokenAcquire = staticLock.acquire();
            try {
                if (INSTANCE == null) {
                    INSTANCE = new SentryIntegrationPackageStorage();
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
        return INSTANCE;
    }

    public void addIntegration(@NotNull String str) {
        Objects.requireNonNull(str, "integration is required.");
        this.integrations.add(str);
    }

    public void addPackage(@NotNull String str, @NotNull String str2) {
        Objects.requireNonNull(str, "name is required.");
        Objects.requireNonNull(str2, "version is required.");
        this.packages.add(new SentryPackage(str, str2));
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = mixedVersionsLock.acquire();
        try {
            mixedVersionsDetected = null;
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

    public boolean checkForMixedVersions(@NotNull ILogger iLogger) {
        Boolean bool = mixedVersionsDetected;
        if (bool != null) {
            return bool.booleanValue();
        }
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = mixedVersionsLock.acquire();
        try {
            boolean z5 = false;
            for (SentryPackage sentryPackage : this.packages) {
                if (sentryPackage.getName().startsWith("maven:io.sentry:") && !"8.41.0".equalsIgnoreCase(sentryPackage.getVersion())) {
                    iLogger.log(SentryLevel.ERROR, "The Sentry SDK has been configured with mixed versions. Expected %s to match core SDK version %s but was %s", sentryPackage.getName(), "8.41.0", sentryPackage.getVersion());
                    z5 = true;
                }
            }
            if (z5) {
                SentryLevel sentryLevel = SentryLevel.ERROR;
                iLogger.log(sentryLevel, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                iLogger.log(sentryLevel, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                iLogger.log(sentryLevel, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                iLogger.log(sentryLevel, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
            }
            mixedVersionsDetected = Boolean.valueOf(z5);
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            return z5;
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

    public void clearStorage() {
        this.integrations.clear();
        this.packages.clear();
    }

    @NotNull
    public Set<String> getIntegrations() {
        return this.integrations;
    }

    @NotNull
    public Set<SentryPackage> getPackages() {
        return this.packages;
    }
}
