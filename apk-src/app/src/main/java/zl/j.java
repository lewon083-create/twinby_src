package zl;

import yads.b53;
import yads.fe0;
import yads.ho0;
import yads.pe0;
import yads.sn0;
import yads.uf1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j implements b53 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f46593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f46594c;

    public /* synthetic */ j(int i, Object obj) {
        this.f46593b = i;
        this.f46594c = obj;
    }

    @Override // yads.b53
    public final Object get() {
        switch (this.f46593b) {
            case 0:
                return fe0.a((Class) this.f46594c);
            case 1:
                return ((ho0) this.f46594c).c();
            case 2:
                return sn0.a((uf1) this.f46594c);
            default:
                return sn0.b((pe0) this.f46594c);
        }
    }
}
