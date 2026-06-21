package zl;

import yads.af;
import yads.de2;
import yads.kb0;
import yads.of1;
import yads.qn0;
import yads.ye;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c0 implements of1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f46541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ye f46542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ de2 f46543d;

    public /* synthetic */ c0(ye yeVar, qn0 qn0Var, int i) {
        this.f46541b = i;
        this.f46542c = yeVar;
        this.f46543d = qn0Var;
    }

    @Override // yads.of1
    public final void invoke(Object obj) {
        switch (this.f46541b) {
            case 0:
                kb0.a(this.f46542c, this.f46543d, (af) obj);
                break;
            default:
                de2 de2Var = this.f46543d;
                ye yeVar = this.f46542c;
                ((af) obj).getClass();
                break;
        }
    }
}
