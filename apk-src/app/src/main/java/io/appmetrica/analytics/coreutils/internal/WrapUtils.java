package io.appmetrica.analytics.coreutils.internal;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class WrapUtils {
    public static double getFiniteDoubleOrDefault(double d10, double d11) {
        return Double.isFinite(d10) ? d10 : d11;
    }

    public static double getFiniteDoubleOrDefaultNullable(Double d10, double d11) {
        return d10 == null ? d11 : getFiniteDoubleOrDefault(d10.doubleValue(), d11);
    }

    public static long getMillisOrDefault(Long l10, @NonNull TimeUnit timeUnit, long j10) {
        return l10 == null ? j10 : timeUnit.toMillis(l10.longValue());
    }

    @NonNull
    public static <T> T getOrDefault(T t10, @NonNull T t11) {
        return t10 == null ? t11 : t10;
    }

    @NonNull
    public static String getOrDefaultIfEmpty(String str, @NonNull String str2) {
        return TextUtils.isEmpty(str) ? str2 : str;
    }

    public static <T> T getOrDefaultNullable(T t10, T t11) {
        return t10 == null ? t11 : t10;
    }

    public static String getOrDefaultNullableIfEmpty(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : str;
    }

    @NonNull
    public static <T> String wrapToTag(T t10) {
        return t10 == null ? "<null>" : t10.toString().isEmpty() ? "<empty>" : t10.toString();
    }
}
