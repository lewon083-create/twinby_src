package nc;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f29273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f29274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f29275e;

    public o(q qVar, float f10, float f11) {
        this.f29273c = qVar;
        this.f29274d = f10;
        this.f29275e = f11;
    }

    @Override // nc.s
    public final void a(Matrix matrix, mc.a aVar, int i, Canvas canvas) {
        q qVar = this.f29273c;
        float f10 = qVar.f29284c;
        float f11 = this.f29275e;
        float f12 = qVar.f29283b;
        float f13 = this.f29274d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f10 - f11, f12 - f13), 0.0f);
        Matrix matrix2 = this.f29287a;
        matrix2.set(matrix);
        matrix2.preTranslate(f13, f11);
        matrix2.preRotate(b());
        aVar.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int i10 = aVar.f28827f;
        int[] iArr = mc.a.i;
        iArr[0] = i10;
        iArr[1] = aVar.f28826e;
        iArr[2] = aVar.f28825d;
        Paint paint = aVar.f28824c;
        float f14 = rectF.left;
        paint.setShader(new LinearGradient(f14, rectF.top, f14, rectF.bottom, iArr, mc.a.f28819j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        q qVar = this.f29273c;
        return (float) Math.toDegrees(Math.atan((qVar.f29284c - this.f29275e) / (qVar.f29283b - this.f29274d)));
    }
}
