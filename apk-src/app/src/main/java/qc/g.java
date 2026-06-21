package qc;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends nc.g {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f32012z = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public f f32013y;

    @Override // nc.g
    public final void e(Canvas canvas) {
        if (this.f32013y.f32011q.isEmpty()) {
            super.e(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.f32013y.f32011q);
        } else {
            canvas.clipRect(this.f32013y.f32011q, Region.Op.DIFFERENCE);
        }
        super.e(canvas);
        canvas.restore();
    }

    @Override // nc.g, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f32013y = new f(this.f32013y);
        return this;
    }

    public final void n(float f10, float f11, float f12, float f13) {
        RectF rectF = this.f32013y.f32011q;
        if (f10 == rectF.left && f11 == rectF.top && f12 == rectF.right && f13 == rectF.bottom) {
            return;
        }
        rectF.set(f10, f11, f12, f13);
        invalidateSelf();
    }
}
