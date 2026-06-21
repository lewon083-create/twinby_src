package yads;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class jy2 extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Iterator f40015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ky2 f40016e;

    public jy2(ky2 ky2Var) {
        this.f40016e = ky2Var;
        this.f40015d = ky2Var.f40380b.iterator();
    }

    @Override // yads.g
    public final Object a() {
        while (this.f40015d.hasNext()) {
            Object next = this.f40015d.next();
            if (this.f40016e.f40381c.contains(next)) {
                return next;
            }
        }
        this.f38583b = 3;
        return null;
    }
}
