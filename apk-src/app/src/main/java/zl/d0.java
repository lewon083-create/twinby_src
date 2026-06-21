package zl;

import t.j2;
import yads.af;
import yads.of1;
import yads.ye;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d0 implements of1, j1.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f46548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f46549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f46550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f46551e;

    public /* synthetic */ d0(Object obj, int i, boolean z5, int i10) {
        this.f46548b = i10;
        this.f46549c = obj;
        this.f46551e = i;
        this.f46550d = z5;
    }

    @Override // yads.of1
    public void invoke(Object obj) {
        switch (this.f46548b) {
            case 0:
                boolean z5 = this.f46550d;
                int i = this.f46551e;
                ((af) obj).getClass();
                break;
            case 1:
                int i10 = this.f46551e;
                boolean z10 = this.f46550d;
                ((af) obj).getClass();
                break;
            default:
                int i11 = this.f46551e;
                boolean z11 = this.f46550d;
                ((af) obj).getClass();
                break;
        }
    }

    @Override // j1.i
    public Object m(j1.h hVar) {
        j2 j2Var = (j2) this.f46549c;
        j2Var.f33130e.execute(new d.l(j2Var, hVar, this.f46551e, 8));
        return "enableTorch: " + this.f46550d;
    }

    public /* synthetic */ d0(ye yeVar, boolean z5, int i, int i10) {
        this.f46548b = i10;
        this.f46549c = yeVar;
        this.f46550d = z5;
        this.f46551e = i;
    }
}
