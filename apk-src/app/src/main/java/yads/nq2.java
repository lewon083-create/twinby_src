package yads;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class nq2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DecimalFormat f41344a;

    public nq2() {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setGroupingSeparator(' ');
        this.f41344a = new DecimalFormat("#,###,###", decimalFormatSymbols);
    }

    public final String a(String str) throws b12 {
        try {
            StringBuilder sb2 = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if (!CharsKt.b(cCharAt)) {
                    sb2.append(cCharAt);
                }
            }
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return this.f41344a.format(Long.parseLong(string));
        } catch (NumberFormatException unused) {
            Intrinsics.checkNotNullExpressionValue(String.format("Could not parse review count value. Review Count value is %s", Arrays.copyOf(new Object[]{str}, 1)), "format(...)");
            throw new b12("Native Ad json has not required attributes");
        }
    }
}
