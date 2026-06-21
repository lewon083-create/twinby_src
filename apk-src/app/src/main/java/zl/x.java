package zl;

import yads.af;
import yads.of1;
import yads.ye;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class x implements of1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f46651b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ye f46652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f46653d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f46654e;

    public /* synthetic */ x(ye yeVar, int i, long j10) {
        this.f46652c = yeVar;
        this.f46653d = i;
        this.f46654e = j10;
    }

    @Override // yads.of1
    public final void invoke(Object obj) {
        switch (this.f46651b) {
            case 0:
                int i = this.f46653d;
                ye yeVar = this.f46652c;
                long j10 = this.f46654e;
                ((af) obj).getClass();
                break;
            default:
                long j11 = this.f46654e;
                ye yeVar2 = this.f46652c;
                int i10 = this.f46653d;
                ((af) obj).getClass();
                break;
        }
    }

    public /* synthetic */ x(ye yeVar, long j10, int i) {
        this.f46652c = yeVar;
        this.f46654e = j10;
        this.f46653d = i;
    }
}
