package kc;

import android.graphics.Typeface;
import com.google.android.gms.internal.measurement.d4;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends w1.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d4 f27356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f27357f;

    public b(d dVar, d4 d4Var) {
        this.f27357f = dVar;
        this.f27356e = d4Var;
    }

    @Override // w1.b
    public final void e(int i) {
        this.f27357f.f27372m = true;
        this.f27356e.s(i);
    }

    @Override // w1.b
    public final void f(Typeface typeface) {
        d dVar = this.f27357f;
        dVar.f27373n = Typeface.create(typeface, dVar.f27363c);
        dVar.f27372m = true;
        this.f27356e.t(dVar.f27373n, false);
    }
}
