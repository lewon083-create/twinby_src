package i0;

import java.util.Enumeration;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements Enumeration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20781b;

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        switch (this.f20780a) {
            case 0:
                int i = this.f20781b;
                n[] nVarArr = l.f20789c;
                if (i < 4) {
                }
                break;
            default:
                int i10 = this.f20781b;
                n[] nVarArr2 = l.f20789c;
                if (i10 < 4) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        switch (this.f20780a) {
            case 0:
                HashMap map = new HashMap();
                for (n nVar : l.f20790d[this.f20781b]) {
                    map.put(nVar.f20803b, nVar);
                }
                this.f20781b++;
                return map;
            default:
                this.f20781b++;
                return new HashMap();
        }
    }
}
