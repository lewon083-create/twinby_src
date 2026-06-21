package hk;

import com.google.android.gms.internal.measurement.h5;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class n0 extends f1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f20694f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f20695g;

    public /* synthetic */ n0(int i, Object obj) {
        this.f20694f = i;
        this.f20695g = obj;
    }

    @Override // hk.f1
    public final boolean j() {
        switch (this.f20694f) {
        }
        return false;
    }

    @Override // hk.f1
    public final void k(Throwable th2) {
        int i = this.f20694f;
        Object obj = this.f20695g;
        switch (i) {
            case 0:
                ((m0) obj).a();
                break;
            case 1:
                ((Function1) obj).invoke(th2);
                break;
            default:
                g1 g1Var = (g1) obj;
                Object obj2 = k1.f20683b.get(i());
                if (!(obj2 instanceof t)) {
                    ij.k kVar = ij.m.f21341c;
                    g1Var.resumeWith(c0.s(obj2));
                } else {
                    ij.k kVar2 = ij.m.f21341c;
                    g1Var.resumeWith(h5.s(((t) obj2).f20711a));
                }
                break;
        }
    }
}
