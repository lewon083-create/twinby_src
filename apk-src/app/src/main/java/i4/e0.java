package i4;

import yads.af;
import yads.kb0;
import yads.of1;
import yads.pe2;
import yads.ye;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e0 implements m3.g, of1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f20879d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f20880e;

    public /* synthetic */ e0(i0 i0Var, u uVar, f4.g gVar, int i) {
        this.f20878c = i0Var;
        this.f20879d = uVar;
        this.f20880e = gVar;
        this.f20877b = i;
    }

    @Override // m3.g
    public void accept(Object obj) {
        i0 i0Var = (i0) this.f20878c;
        ((j0) obj).f(i0Var.f20926a, i0Var.f20927b, (u) this.f20879d, (f4.g) this.f20880e, this.f20877b);
    }

    @Override // yads.of1
    public void invoke(Object obj) {
        kb0.a((ye) this.f20878c, this.f20877b, (pe2) this.f20879d, (pe2) this.f20880e, (af) obj);
    }

    public /* synthetic */ e0(ye yeVar, int i, pe2 pe2Var, pe2 pe2Var2) {
        this.f20878c = yeVar;
        this.f20877b = i;
        this.f20879d = pe2Var;
        this.f20880e = pe2Var2;
    }
}
