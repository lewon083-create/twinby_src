package com.yandex.div.internal;

import androidx.annotation.NonNull;
import com.yandex.div.logging.Severity;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class Log {
    private static volatile boolean sEnabled = false;
    private static volatile Severity sSeverity = Severity.VERBOSE;

    public static void e(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        if (isAtLeast(Severity.ERROR)) {
            android.util.Log.e(str, str2, th2);
        }
    }

    public static boolean isAtLeast(Severity severity) {
        if (isEnabled()) {
            return sSeverity.isAtLeast(severity);
        }
        return false;
    }

    public static boolean isEnabled() {
        return sEnabled;
    }
}
