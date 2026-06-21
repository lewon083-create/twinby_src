package io.sentry.util;

import com.google.android.gms.internal.ads.om1;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class LoadClass {
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$isClassAvailableLazy$0(String str, ILogger iLogger) {
        return Boolean.valueOf(isClassAvailable(str, iLogger));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$isClassAvailableLazy$1(String str, SentryOptions sentryOptions) {
        return Boolean.valueOf(isClassAvailable(str, sentryOptions));
    }

    public boolean isClassAvailable(@NotNull String str, @Nullable ILogger iLogger) {
        return loadClass(str, iLogger) != null;
    }

    public LazyEvaluator<Boolean> isClassAvailableLazy(@NotNull String str, @Nullable ILogger iLogger) {
        return new LazyEvaluator<>(new a(this, str, iLogger, 0));
    }

    @Nullable
    public Class<?> loadClass(@NotNull String str, @Nullable ILogger iLogger) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            if (iLogger == null) {
                return null;
            }
            iLogger.log(SentryLevel.INFO, om1.k("Class not available: ", str), new Object[0]);
            return null;
        } catch (UnsatisfiedLinkError e3) {
            if (iLogger == null) {
                return null;
            }
            iLogger.log(SentryLevel.ERROR, "Failed to load (UnsatisfiedLinkError) " + str, e3);
            return null;
        } catch (Throwable th2) {
            if (iLogger == null) {
                return null;
            }
            iLogger.log(SentryLevel.ERROR, "Failed to initialize " + str, th2);
            return null;
        }
    }

    public boolean isClassAvailable(@NotNull String str, @Nullable SentryOptions sentryOptions) {
        return isClassAvailable(str, sentryOptions != null ? sentryOptions.getLogger() : null);
    }

    public LazyEvaluator<Boolean> isClassAvailableLazy(@NotNull String str, @Nullable SentryOptions sentryOptions) {
        return new LazyEvaluator<>(new a(this, str, sentryOptions, 1));
    }
}
