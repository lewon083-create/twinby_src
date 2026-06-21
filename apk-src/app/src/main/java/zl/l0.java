package zl;

import yads.af;
import yads.kb0;
import yads.of1;
import yads.ye;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l0 implements of1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f46607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ye f46608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f46609d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f46610e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f46611f;

    public /* synthetic */ l0(ye yeVar, int i, long j10, long j11, int i10) {
        this.f46607b = i10;
        this.f46608c = yeVar;
        this.f46609d = i;
        this.f46610e = j10;
        this.f46611f = j11;
    }

    @Override // yads.of1
    public final void invoke(Object obj) {
        switch (this.f46607b) {
            case 0:
                long j10 = this.f46611f;
                ye yeVar = this.f46608c;
                int i = this.f46609d;
                long j11 = this.f46610e;
                ((af) obj).getClass();
                break;
            default:
                kb0.b(this.f46608c, this.f46609d, this.f46610e, this.f46611f, (af) obj);
                break;
        }
    }
}
