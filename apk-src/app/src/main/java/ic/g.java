package ic;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f21268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextPaint f21269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21271d;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f21276j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Layout.Alignment f21272e = Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f21273f = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f21274g = 1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f21275h = 1;
    public boolean i = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextUtils.TruncateAt f21277k = null;

    public g(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f21268a = charSequence;
        this.f21269b = textPaint;
        this.f21270c = i;
        this.f21271d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f21268a == null) {
            this.f21268a = "";
        }
        int iMax = Math.max(0, this.f21270c);
        CharSequence charSequenceEllipsize = this.f21268a;
        int i = this.f21273f;
        TextPaint textPaint = this.f21269b;
        if (i == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, this.f21277k);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f21271d);
        this.f21271d = iMin;
        if (this.f21276j && this.f21273f == 1) {
            this.f21272e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
        builderObtain.setAlignment(this.f21272e);
        builderObtain.setIncludePad(this.i);
        builderObtain.setTextDirection(this.f21276j ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f21277k;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f21273f);
        float f10 = this.f21274g;
        if (f10 != 1.0f) {
            builderObtain.setLineSpacing(0.0f, f10);
        }
        if (this.f21273f > 1) {
            builderObtain.setHyphenationFrequency(this.f21275h);
        }
        return builderObtain.build();
    }
}
