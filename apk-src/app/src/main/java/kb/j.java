package kb;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DecimalFormat f27346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final DecimalFormat f27347b;

    static {
        Locale locale = Locale.ROOT;
        f27346a = new DecimalFormat(".000000", DecimalFormatSymbols.getInstance(locale));
        DecimalFormat decimalFormat = new DecimalFormat(".##", DecimalFormatSymbols.getInstance(locale));
        f27347b = decimalFormat;
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
    }
}
