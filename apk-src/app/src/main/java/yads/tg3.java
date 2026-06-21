package yads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class tg3 implements vo2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vo2 f43323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f43324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ug3 f43325c;

    public tg3(ug3 ug3Var, vo2 vo2Var, Object obj) {
        this.f43325c = ug3Var;
        this.f43323a = vo2Var;
        this.f43324b = obj;
    }

    public final void a() {
        if (!this.f43325c.f43661d.isEmpty()) {
            this.f43323a.onSuccess(this.f43325c.f43661d);
            return;
        }
        am0 am0Var = new am0();
        vo2 vo2Var = this.f43323a;
        String message = am0Var.getMessage();
        if (message == null) {
            message = "Ad request completed successfully, but there are no ads available.";
        }
        vo2Var.a(new ee3(message));
    }

    @Override // yads.vo2
    public final void onSuccess(Object obj) {
        this.f43325c.f43660c.getClass();
        rg3 rg3VarA = sg3.a((List) obj);
        this.f43325c.f43661d.addAll(rg3VarA.f42603a);
        List list = rg3VarA.f42604b;
        if (list.isEmpty()) {
            a();
        } else {
            ug3 ug3Var = this.f43325c;
            ug3Var.f43659b.a(ug3Var.f43658a, list, this, this.f43324b);
        }
    }

    @Override // yads.vo2
    public final void a(ee3 ee3Var) {
        a();
    }
}
