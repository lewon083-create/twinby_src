package io.sentry;

import com.google.android.gms.internal.ads.om1;
import io.sentry.vendor.gson.internal.bind.util.ISO8601Utils;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class DateUtils {
    private DateUtils() {
    }

    public static long dateToNanos(@NotNull Date date) {
        return millisToNanos(date.getTime());
    }

    public static double dateToSeconds(@NotNull Date date) {
        return millisToSeconds(date.getTime());
    }

    @NotNull
    public static BigDecimal doubleToBigDecimal(@NotNull Double d10) {
        return BigDecimal.valueOf(d10.doubleValue()).setScale(6, RoundingMode.DOWN);
    }

    @NotNull
    public static Date getCurrentDateTime() {
        return Calendar.getInstance(ISO8601Utils.TIMEZONE_UTC).getTime();
    }

    @NotNull
    public static Date getDateTime(@NotNull String str) {
        try {
            return ISO8601Utils.parse(str, new ParsePosition(0));
        } catch (ParseException unused) {
            throw new IllegalArgumentException(om1.k("timestamp is not ISO format ", str));
        }
    }

    @NotNull
    public static Date getDateTimeWithMillisPrecision(@NotNull String str) {
        try {
            return getDateTime(new BigDecimal(str).setScale(3, RoundingMode.DOWN).movePointRight(3).longValue());
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException(om1.k("timestamp is not millis format ", str));
        }
    }

    @NotNull
    public static String getTimestamp(@NotNull Date date) {
        return ISO8601Utils.format(date, true);
    }

    public static long millisToNanos(long j10) {
        return j10 * 1000000;
    }

    public static double millisToSeconds(double d10) {
        return d10 / 1000.0d;
    }

    public static Date nanosToDate(long j10) {
        return getDateTime(Double.valueOf(nanosToMillis(j10)).longValue());
    }

    public static double nanosToMillis(double d10) {
        return d10 / 1000000.0d;
    }

    public static double nanosToSeconds(long j10) {
        return j10 / 1.0E9d;
    }

    public static long secondsToNanos(@NotNull long j10) {
        return j10 * 1000000000;
    }

    @Nullable
    public static Date toUtilDate(@Nullable SentryDate sentryDate) {
        if (sentryDate == null) {
            return null;
        }
        return toUtilDateNotNull(sentryDate);
    }

    @NotNull
    public static Date toUtilDateNotNull(@NotNull SentryDate sentryDate) {
        return nanosToDate(sentryDate.nanoTimestamp());
    }

    @NotNull
    public static Date getDateTime(long j10) {
        Calendar calendar = Calendar.getInstance(ISO8601Utils.TIMEZONE_UTC);
        calendar.setTimeInMillis(j10);
        return calendar.getTime();
    }
}
