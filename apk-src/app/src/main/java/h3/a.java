package h3;

import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import androidx.lifecycle.u;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends d0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ka.d f20364n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public u f20365o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public b f20366p;

    public a(ka.d dVar) {
        this.f20364n = dVar;
        if (dVar.f27307a != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        dVar.f27307a = this;
    }

    @Override // androidx.lifecycle.d0
    public final void g() {
        ka.d dVar = this.f20364n;
        dVar.f27308b = true;
        dVar.f27310d = false;
        dVar.f27309c = false;
        dVar.i.drainPermits();
        dVar.c();
    }

    @Override // androidx.lifecycle.d0
    public final void h() {
        this.f20364n.f27308b = false;
    }

    @Override // androidx.lifecycle.d0
    public final void j(e0 e0Var) {
        super.j(e0Var);
        this.f20365o = null;
        this.f20366p = null;
    }

    public final void l() {
        u uVar = this.f20365o;
        b bVar = this.f20366p;
        if (uVar == null || bVar == null) {
            return;
        }
        super.j(bVar);
        e(uVar, bVar);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("LoaderInfo{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" #0 : ");
        Class<?> cls = this.f20364n.getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append("}}");
        return sb2.toString();
    }
}
