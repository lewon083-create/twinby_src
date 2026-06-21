package qc;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends nc.f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final RectF f32011q;

    public f(nc.k kVar, RectF rectF) {
        super(kVar);
        this.f32011q = rectF;
    }

    @Override // nc.f, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        g gVar = new g(this);
        gVar.f32013y = this;
        gVar.invalidateSelf();
        return gVar;
    }

    public f(f fVar) {
        super(fVar);
        this.f32011q = fVar.f32011q;
    }
}
