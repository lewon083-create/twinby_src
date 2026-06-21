package zl;

import yads.af;
import yads.jm1;
import yads.kb0;
import yads.of1;
import yads.ye;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h0 implements of1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f46584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ye f46585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jm1 f46586d;

    public /* synthetic */ h0(ye yeVar, jm1 jm1Var, int i) {
        this.f46584b = i;
        this.f46585c = yeVar;
        this.f46586d = jm1Var;
    }

    @Override // yads.of1
    public final void invoke(Object obj) {
        switch (this.f46584b) {
            case 0:
                kb0.a(this.f46585c, this.f46586d, (af) obj);
                break;
            default:
                jm1 jm1Var = this.f46586d;
                ye yeVar = this.f46585c;
                ((af) obj).getClass();
                break;
        }
    }
}
