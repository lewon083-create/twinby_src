package ad;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends e0 {
    @Override // ad.e0
    public final e0 a(Object obj) {
        obj.getClass();
        b(obj);
        return this;
    }

    public final o0 g() {
        int i = this.f787b;
        if (i == 0) {
            int i10 = o0.f846d;
            return i1.f812k;
        }
        if (i != 1) {
            o0 o0VarQ = o0.q(i, this.f786a);
            this.f787b = o0VarQ.size();
            this.f788c = true;
            return o0VarQ;
        }
        Object obj = this.f786a[0];
        Objects.requireNonNull(obj);
        int i11 = o0.f846d;
        return new o1(obj);
    }
}
