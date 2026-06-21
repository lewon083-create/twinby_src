package y6;

import com.google.firebase.messaging.y;
import k6.n0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f36498b;

    public /* synthetic */ d(int i, Object obj) {
        this.f36497a = i;
        this.f36498b = obj;
    }

    @Override // k6.n0
    public final void a() {
        switch (this.f36497a) {
            case 0:
                m mVar = (m) this.f36498b;
                mVar.f36511f = true;
                mVar.f36517m.f36496l = true;
                break;
            default:
                ((y) this.f36498b).x();
                break;
        }
    }

    @Override // k6.n0
    public final void b(int i, int i10, Object obj) {
        a();
    }

    @Override // k6.n0
    public final void c(int i, int i10) {
        a();
    }

    @Override // k6.n0
    public final void d(int i, int i10) {
        a();
    }

    @Override // k6.n0
    public final void e(int i, int i10) {
        a();
    }
}
