package wl;

import com.google.android.gms.internal.ads.kv0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class k0 extends l0 {
    public k0() {
        this.f35458l = new vl.b();
        this.f7316c = 2;
    }

    @Override // wl.l0, com.google.android.gms.internal.ads.kv0
    public final /* bridge */ /* synthetic */ kv0 m() {
        m();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.kv0
    public final String toString() {
        vl.b bVar = this.f35458l;
        if (bVar == null || bVar.f34909b <= 0) {
            return "<" + w() + ">";
        }
        return "<" + w() + " " + this.f35458l.toString() + ">";
    }

    @Override // wl.l0
    /* JADX INFO: renamed from: z */
    public final l0 m() {
        super.m();
        this.f35458l = new vl.b();
        return this;
    }
}
