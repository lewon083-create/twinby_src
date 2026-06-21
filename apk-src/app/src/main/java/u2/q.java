package u2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.style.ReplacementSpan;
import com.google.firebase.messaging.y;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends ReplacementSpan {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f34063c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint.FontMetricsInt f34062b = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f34064d = 1.0f;

    public q(k kVar) {
        f2.g.g(kVar, "metadata cannot be null");
        this.f34063c = kVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        h.a().getClass();
        k kVar = this.f34063c;
        y yVar = kVar.f34042b;
        Typeface typeface = (Typeface) yVar.f14902e;
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        canvas.drawText((char[]) yVar.f14900c, kVar.f34041a * 2, 2, f10, i12, paint);
        paint.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i10, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f34062b;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        k kVar = this.f34063c;
        this.f34064d = fAbs / (kVar.b().a(14) != 0 ? ((ByteBuffer) r8.f19839e).getShort(r1 + r8.f19836b) : (short) 0);
        v2.a aVarB = kVar.b();
        int iA = aVarB.a(14);
        if (iA != 0) {
            ((ByteBuffer) aVarB.f19839e).getShort(iA + aVarB.f19836b);
        }
        short s10 = (short) ((kVar.b().a(12) != 0 ? ((ByteBuffer) r5.f19839e).getShort(r7 + r5.f19836b) : (short) 0) * this.f34064d);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s10;
    }
}
