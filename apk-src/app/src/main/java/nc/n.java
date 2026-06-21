package nc;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f29272c;

    public n(p pVar) {
        this.f29272c = pVar;
    }

    @Override // nc.s
    public final void a(Matrix matrix, mc.a aVar, int i, Canvas canvas) {
        float f10;
        p pVar = this.f29272c;
        float f11 = pVar.f29281f;
        float f12 = pVar.f29282g;
        RectF rectF = new RectF(pVar.f29277b, pVar.f29278c, pVar.f29279d, pVar.f29280e);
        Paint paint = aVar.f28823b;
        boolean z5 = f12 < 0.0f;
        Path path = aVar.f28828g;
        int[] iArr = mc.a.f28820k;
        if (z5) {
            iArr[0] = 0;
            iArr[1] = aVar.f28827f;
            iArr[2] = aVar.f28826e;
            iArr[3] = aVar.f28825d;
            f10 = 0.0f;
        } else {
            path.rewind();
            f10 = 0.0f;
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f11, f12);
            path.close();
            float f13 = -i;
            rectF.inset(f13, f13);
            iArr[0] = 0;
            iArr[1] = aVar.f28825d;
            iArr[2] = aVar.f28826e;
            iArr[3] = aVar.f28827f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= f10) {
            return;
        }
        float f14 = 1.0f - (i / fWidth);
        float[] fArr = mc.a.f28821l;
        fArr[1] = f14;
        fArr[2] = ((1.0f - f14) / 2.0f) + f14;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z5) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, aVar.f28829h);
        }
        canvas.drawArc(rectF, f11, f12, true, paint);
        canvas.restore();
    }
}
