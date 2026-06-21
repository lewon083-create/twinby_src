package zl;

import yads.af;
import yads.kb0;
import yads.of1;
import yads.pa0;
import yads.ye;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class w implements of1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f46646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ye f46647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pa0 f46648d;

    public /* synthetic */ w(ye yeVar, pa0 pa0Var, int i) {
        this.f46646b = i;
        this.f46647c = yeVar;
        this.f46648d = pa0Var;
    }

    @Override // yads.of1
    public final void invoke(Object obj) {
        switch (this.f46646b) {
            case 0:
                kb0.c(this.f46647c, this.f46648d, (af) obj);
                break;
            case 1:
                pa0 pa0Var = this.f46648d;
                ye yeVar = this.f46647c;
                ((af) obj).getClass();
                break;
            case 2:
                pa0 pa0Var2 = this.f46648d;
                ye yeVar2 = this.f46647c;
                ((af) obj).getClass();
                break;
            default:
                pa0 pa0Var3 = this.f46648d;
                ye yeVar3 = this.f46647c;
                ((af) obj).getClass();
                break;
        }
    }
}
