package yads;

import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class u10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f43517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f43518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f43519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f43520d;

    public /* synthetic */ u10(View view, float f10, float f11, float f12, float f13) {
        this(view, f10, f11, f12, f13, new RectF(), new Path());
    }

    public static float[] a(float f10, float f11, float f12, float f13) {
        if (f10 > 0.0f || f11 > 0.0f || f12 > 0.0f || f13 > 0.0f) {
            return new float[]{f10, f10, f11, f11, f12, f12, f13, f13};
        }
        return null;
    }

    public final void a() {
        if (this.f43520d != null) {
            int measuredWidth = this.f43517a.getMeasuredWidth();
            int measuredHeight = this.f43517a.getMeasuredHeight();
            int paddingLeft = this.f43517a.getPaddingLeft();
            int paddingTop = this.f43517a.getPaddingTop();
            int paddingRight = measuredWidth - this.f43517a.getPaddingRight();
            int paddingBottom = measuredHeight - this.f43517a.getPaddingBottom();
            if (paddingLeft >= paddingRight || paddingTop >= paddingBottom) {
                return;
            }
            this.f43518b.set(paddingLeft, paddingTop, paddingRight, paddingBottom);
            this.f43519c.reset();
            this.f43519c.addRoundRect(this.f43518b, this.f43520d, Path.Direction.CW);
        }
    }

    public u10(View view, float f10, float f11, float f12, float f13, RectF rectF, Path path) {
        this.f43517a = view;
        this.f43518b = rectF;
        this.f43519c = path;
        this.f43520d = a(f10, f11, f12, f13);
    }
}
