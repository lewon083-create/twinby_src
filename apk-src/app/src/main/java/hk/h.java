package hk;

import java.util.concurrent.ScheduledFuture;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f20665b;

    public /* synthetic */ h(int i, Object obj) {
        this.f20664a = i;
        this.f20665b = obj;
    }

    @Override // hk.i
    public final void a(Throwable th2) {
        switch (this.f20664a) {
            case 0:
                ((ScheduledFuture) this.f20665b).cancel(false);
                break;
            case 1:
                ((Function1) this.f20665b).invoke(th2);
                break;
            default:
                ((m0) this.f20665b).a();
                break;
        }
    }

    public final String toString() {
        switch (this.f20664a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f20665b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((Function1) this.f20665b).getClass().getSimpleName() + '@' + c0.h(this) + ']';
            default:
                return "DisposeOnCancel[" + ((m0) this.f20665b) + ']';
        }
    }
}
