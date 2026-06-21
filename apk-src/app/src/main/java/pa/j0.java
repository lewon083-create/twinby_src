package pa;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends x {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f31382g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(e eVar, int i, Bundle bundle) {
        super(eVar, i, bundle);
        this.f31382g = eVar;
    }

    @Override // pa.x
    public final boolean a() {
        this.f31382g.f31335j.a(ma.b.f28759g);
        return true;
    }

    @Override // pa.x
    public final void b(ma.b bVar) {
        e eVar = this.f31382g;
        eVar.getClass();
        eVar.f31335j.a(bVar);
        System.currentTimeMillis();
    }
}
