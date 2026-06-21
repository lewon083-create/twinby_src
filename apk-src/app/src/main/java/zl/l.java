package zl;

import io.sentry.android.core.AppComponentsBreadcrumbsIntegration;
import yads.fj3;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f46603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f46604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f46605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f46606e;

    public /* synthetic */ l(Object obj, int i, int i10, long j10) {
        this.f46603b = i10;
        this.f46604c = obj;
        this.f46605d = j10;
        this.f46606e = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f46603b) {
            case 0:
                ((fj3) this.f46604c).b(this.f46606e, this.f46605d);
                break;
            case 1:
                ((fj3) this.f46604c).a(this.f46605d, this.f46606e);
                break;
            default:
                ((AppComponentsBreadcrumbsIntegration) this.f46604c).lambda$onTrimMemory$1(this.f46605d, this.f46606e);
                break;
        }
    }

    public /* synthetic */ l(fj3 fj3Var, int i, long j10) {
        this.f46603b = 0;
        this.f46604c = fj3Var;
        this.f46606e = i;
        this.f46605d = j10;
    }
}
