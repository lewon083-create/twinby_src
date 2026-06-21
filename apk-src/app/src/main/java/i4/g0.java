package i4;

import java.io.IOException;
import yads.af;
import yads.jm1;
import yads.kb0;
import yads.of1;
import yads.xf1;
import yads.ye;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g0 implements m3.g, of1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IOException f20904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f20905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f20906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f20907e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f20908f;

    public /* synthetic */ g0(Object obj, Object obj2, Object obj3, IOException iOException, boolean z5) {
        this.f20906d = obj;
        this.f20907e = obj2;
        this.f20908f = obj3;
        this.f20904b = iOException;
        this.f20905c = z5;
    }

    @Override // m3.g
    public void accept(Object obj) {
        i0 i0Var = (i0) this.f20906d;
        ((j0) obj).m(i0Var.f20926a, i0Var.f20927b, (u) this.f20907e, (f4.g) this.f20908f, this.f20904b, this.f20905c);
    }

    @Override // yads.of1
    public void invoke(Object obj) {
        kb0.a((ye) this.f20906d, (xf1) this.f20907e, (jm1) this.f20908f, this.f20904b, this.f20905c, (af) obj);
    }
}
