package io.appmetrica.analytics.billinginterface.internal;

import androidx.annotation.NonNull;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class Period {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f21597a = Pattern.compile("P(\\d+)(\\S+)");
    public final int number;

    @NonNull
    public final TimeUnit timeUnit;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public enum TimeUnit {
        TIME_UNIT_UNKNOWN,
        DAY,
        WEEK,
        MONTH,
        YEAR
    }

    public Period(int i, @NonNull TimeUnit timeUnit) {
        this.number = i;
        this.timeUnit = timeUnit;
    }

    public static Period parse(@NonNull String str) {
        Matcher matcher = f21597a.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        String strGroup = matcher.group(1);
        String strGroup2 = matcher.group(2);
        if (strGroup == null || strGroup2 == null) {
            return null;
        }
        try {
            int i = Integer.parseInt(strGroup);
            char cCharAt = strGroup2.charAt(0);
            return new Period(i, cCharAt != 'D' ? cCharAt != 'M' ? cCharAt != 'W' ? cCharAt != 'Y' ? TimeUnit.TIME_UNIT_UNKNOWN : TimeUnit.YEAR : TimeUnit.WEEK : TimeUnit.MONTH : TimeUnit.DAY);
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Period period = (Period) obj;
        return this.number == period.number && this.timeUnit == period.timeUnit;
    }

    public int hashCode() {
        return this.timeUnit.hashCode() + (this.number * 31);
    }

    @NonNull
    public String toString() {
        return "Period{number=" + this.number + "timeUnit=" + this.timeUnit + "}";
    }
}
