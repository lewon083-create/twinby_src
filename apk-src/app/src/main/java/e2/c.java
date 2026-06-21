package e2;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f16023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextDirectionHeuristic f16024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16026d;

    public c(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            a7.e.i(textPaint).setBreakStrategy(i).setHyphenationFrequency(i10).setTextDirection(textDirectionHeuristic).build();
        }
        this.f16023a = textPaint;
        this.f16024b = textDirectionHeuristic;
        this.f16025c = i;
        this.f16026d = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        int i = cVar.f16025c;
        TextPaint textPaint = cVar.f16023a;
        if (this.f16025c != i || this.f16026d != cVar.f16026d) {
            return false;
        }
        TextPaint textPaint2 = this.f16023a;
        if (textPaint2.getTextSize() != textPaint.getTextSize() || textPaint2.getTextScaleX() != textPaint.getTextScaleX() || textPaint2.getTextSkewX() != textPaint.getTextSkewX() || textPaint2.getLetterSpacing() != textPaint.getLetterSpacing() || !TextUtils.equals(textPaint2.getFontFeatureSettings(), textPaint.getFontFeatureSettings()) || textPaint2.getFlags() != textPaint.getFlags() || !textPaint2.getTextLocales().equals(textPaint.getTextLocales())) {
            return false;
        }
        if (textPaint2.getTypeface() == null) {
            if (textPaint.getTypeface() != null) {
                return false;
            }
        } else if (!textPaint2.getTypeface().equals(textPaint.getTypeface())) {
            return false;
        }
        return this.f16024b == cVar.f16024b;
    }

    public final int hashCode() {
        TextPaint textPaint = this.f16023a;
        return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f16024b, Integer.valueOf(this.f16025c), Integer.valueOf(this.f16026d));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        StringBuilder sb3 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f16023a;
        sb3.append(textPaint.getTextSize());
        sb2.append(sb3.toString());
        sb2.append(", textScaleX=" + textPaint.getTextScaleX());
        sb2.append(", textSkewX=" + textPaint.getTextSkewX());
        sb2.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb2.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        int i = Build.VERSION.SDK_INT;
        sb2.append(", textLocale=" + textPaint.getTextLocales());
        sb2.append(", typeface=" + textPaint.getTypeface());
        if (i >= 26) {
            sb2.append(", variationSettings=" + textPaint.getFontVariationSettings());
        }
        sb2.append(", textDir=" + this.f16024b);
        sb2.append(", breakStrategy=" + this.f16025c);
        sb2.append(", hyphenationFrequency=" + this.f16026d);
        sb2.append("}");
        return sb2.toString();
    }

    public c(PrecomputedText.Params params) {
        this.f16023a = params.getTextPaint();
        this.f16024b = params.getTextDirection();
        this.f16025c = params.getBreakStrategy();
        this.f16026d = params.getHyphenationFrequency();
    }
}
