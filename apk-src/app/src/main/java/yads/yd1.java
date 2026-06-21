package yads;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class yd1 extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Iterator f45025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qg2 f45026e;

    public yd1(Iterator it, qg2 qg2Var) {
        this.f45025d = it;
        this.f45026e = qg2Var;
    }

    @Override // yads.g
    public final Object a() {
        while (this.f45025d.hasNext()) {
            Object next = this.f45025d.next();
            if (this.f45026e.apply(next)) {
                return next;
            }
        }
        this.f38583b = 3;
        return null;
    }
}
