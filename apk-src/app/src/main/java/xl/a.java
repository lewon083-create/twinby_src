package xl;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends c {
    public a(List list) {
        this.f36265a.addAll(list);
        this.f36266b = this.f36265a.size();
    }

    @Override // xl.m
    public final boolean a(vl.k kVar, vl.k kVar2) {
        for (int i = 0; i < this.f36266b; i++) {
            if (!((m) this.f36265a.get(i)).a(kVar, kVar2)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return tl.a.e(" ", this.f36265a);
    }

    public a(m... mVarArr) {
        this(Arrays.asList(mVarArr));
    }
}
