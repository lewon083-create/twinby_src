package io.sentry.util;

import io.sentry.CheckIn;
import io.sentry.CheckInStatus;
import io.sentry.DateUtils;
import io.sentry.FilterString;
import io.sentry.IScopes;
import io.sentry.ISentryLifecycleToken;
import io.sentry.MonitorConfig;
import io.sentry.Sentry;
import io.sentry.protocol.SentryId;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class CheckInUtils {
    public static boolean isIgnored(@Nullable List<FilterString> list, @NotNull String str) {
        if (list != null && !list.isEmpty()) {
            Iterator<FilterString> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().getFilterString().equalsIgnoreCase(str)) {
                    return true;
                }
            }
            Iterator<FilterString> it2 = list.iterator();
            while (it2.hasNext()) {
                if (it2.next().matches(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static <U> U withCheckIn(@NotNull String str, @Nullable String str2, @Nullable MonitorConfig monitorConfig, @NotNull Callable<U> callable) {
        ISentryLifecycleToken iSentryLifecycleTokenMakeCurrent = Sentry.forkedScopes("CheckInUtils").makeCurrent();
        try {
            IScopes currentScopes = Sentry.getCurrentScopes();
            long jCurrentTimeMillis = System.currentTimeMillis();
            TracingUtils.startNewTrace(currentScopes);
            CheckIn checkIn = new CheckIn(str, CheckInStatus.IN_PROGRESS);
            if (monitorConfig != null) {
                checkIn.setMonitorConfig(monitorConfig);
            }
            if (str2 != null) {
                checkIn.setEnvironment(str2);
            }
            SentryId sentryIdCaptureCheckIn = currentScopes.captureCheckIn(checkIn);
            try {
                U uCall = callable.call();
                CheckIn checkIn2 = new CheckIn(sentryIdCaptureCheckIn, str, CheckInStatus.OK);
                if (str2 != null) {
                    checkIn2.setEnvironment(str2);
                }
                checkIn2.setDuration(Double.valueOf(DateUtils.millisToSeconds(System.currentTimeMillis() - jCurrentTimeMillis)));
                currentScopes.captureCheckIn(checkIn2);
                if (iSentryLifecycleTokenMakeCurrent != null) {
                    iSentryLifecycleTokenMakeCurrent.close();
                }
                return uCall;
            } finally {
            }
        } catch (Throwable th2) {
            if (iSentryLifecycleTokenMakeCurrent != null) {
                try {
                    iSentryLifecycleTokenMakeCurrent.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public static <U> U withCheckIn(@NotNull String str, @Nullable MonitorConfig monitorConfig, @NotNull Callable<U> callable) {
        return (U) withCheckIn(str, null, monitorConfig, callable);
    }

    public static <U> U withCheckIn(@NotNull String str, @Nullable String str2, @NotNull Callable<U> callable) {
        return (U) withCheckIn(str, str2, null, callable);
    }

    public static <U> U withCheckIn(@NotNull String str, @NotNull Callable<U> callable) {
        return (U) withCheckIn(str, null, null, callable);
    }
}
