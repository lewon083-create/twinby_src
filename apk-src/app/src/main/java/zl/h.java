package zl;

import yads.dn1;
import yads.en1;
import yads.jm1;
import yads.xf1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f46579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dn1 f46580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ en1 f46581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xf1 f46582e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jm1 f46583f;

    public /* synthetic */ h(dn1 dn1Var, en1 en1Var, xf1 xf1Var, jm1 jm1Var, int i) {
        this.f46579b = i;
        this.f46580c = dn1Var;
        this.f46581d = en1Var;
        this.f46582e = xf1Var;
        this.f46583f = jm1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f46579b) {
            case 0:
                this.f46580c.c(this.f46581d, this.f46582e, this.f46583f);
                break;
            case 1:
                this.f46580c.a(this.f46581d, this.f46582e, this.f46583f);
                break;
            default:
                this.f46580c.b(this.f46581d, this.f46582e, this.f46583f);
                break;
        }
    }
}
