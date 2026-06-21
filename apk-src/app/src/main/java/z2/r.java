package z2;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends com.google.android.gms.internal.auth.m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f45948c;

    public r(t tVar) {
        this.f45948c = tVar;
    }

    @Override // com.google.android.gms.internal.auth.m
    public final View o(int i) {
        t tVar = this.f45948c;
        View view = tVar.G;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + tVar + " does not have a view");
    }

    @Override // com.google.android.gms.internal.auth.m
    public final boolean p() {
        return this.f45948c.G != null;
    }
}
