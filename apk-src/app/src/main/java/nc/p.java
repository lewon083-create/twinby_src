package nc;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends r {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final RectF f29276h = new RectF();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f29277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f29278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f29279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f29280e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f29281f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f29282g;

    public p(float f10, float f11, float f12, float f13) {
        this.f29277b = f10;
        this.f29278c = f11;
        this.f29279d = f12;
        this.f29280e = f13;
    }

    @Override // nc.r
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f29285a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        float f10 = this.f29279d;
        float f11 = this.f29280e;
        RectF rectF = f29276h;
        rectF.set(this.f29277b, this.f29278c, f10, f11);
        path.arcTo(rectF, this.f29281f, this.f29282g, false);
        path.transform(matrix);
    }
}
