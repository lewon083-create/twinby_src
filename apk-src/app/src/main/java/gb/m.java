package gb;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SimpleDateFormat f20094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final StringBuilder f20095b;

    static {
        Locale locale = Locale.ROOT;
        f20094a = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", locale);
        new SimpleDateFormat("MM-dd HH:mm:ss", locale);
        f20095b = new StringBuilder(33);
    }

    public static void a(long j10, StringBuilder sb2) {
        if (j10 == 0) {
            sb2.append("0s");
            return;
        }
        sb2.ensureCapacity(sb2.length() + 27);
        boolean z5 = false;
        if (j10 < 0) {
            sb2.append("-");
            if (j10 != Long.MIN_VALUE) {
                j10 = -j10;
            } else {
                j10 = Long.MAX_VALUE;
                z5 = true;
            }
        }
        if (j10 >= 86400000) {
            sb2.append(j10 / 86400000);
            sb2.append("d");
            j10 %= 86400000;
        }
        if (true == z5) {
            j10 = 25975808;
        }
        if (j10 >= 3600000) {
            sb2.append(j10 / 3600000);
            sb2.append("h");
            j10 %= 3600000;
        }
        if (j10 >= 60000) {
            sb2.append(j10 / 60000);
            sb2.append("m");
            j10 %= 60000;
        }
        if (j10 >= 1000) {
            sb2.append(j10 / 1000);
            sb2.append("s");
            j10 %= 1000;
        }
        if (j10 > 0) {
            sb2.append(j10);
            sb2.append("ms");
        }
    }
}
