package nc;

import android.graphics.Matrix;
import android.graphics.Path;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f29283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f29284c;

    @Override // nc.r
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f29285a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f29283b, this.f29284c);
        path.transform(matrix);
    }
}
