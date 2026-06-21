package yads;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class nl2 implements tf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bk3 f41288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f41289b = kotlin.collections.s.g(new ml2(ak3.f36760b, 0.25f), new ml2(ak3.f36761c, 0.5f), new ml2(ak3.f36762d, 0.75f));

    public nl2(ck3 ck3Var) {
        this.f41288a = ck3Var;
    }

    @Override // yads.tf3
    public final void a(long j10, long j11) {
        if (j10 != 0) {
            Iterator it = this.f41289b.iterator();
            while (it.hasNext()) {
                ml2 ml2Var = (ml2) it.next();
                if (ml2Var.f40955b * j10 <= j11) {
                    this.f41288a.a(ml2Var.f40954a);
                    it.remove();
                }
            }
        }
    }
}
