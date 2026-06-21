package t;

import fh.of;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends g0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j1.h f33145b;

    public /* synthetic */ l0(int i, j1.h hVar) {
        this.f33144a = i;
        this.f33145b = hVar;
    }

    @Override // g0.p
    public final void a(int i) {
        switch (this.f33144a) {
            case 0:
                this.f33145b.d(new a0.l1("Capture request is cancelled because camera is closed", null, 3));
                break;
            default:
                j1.h hVar = this.f33145b;
                if (hVar != null) {
                    hVar.d(new a0.o("Camera is closed"));
                }
                break;
        }
    }

    @Override // g0.p
    public final void b(int i, g0.v vVar) {
        switch (this.f33144a) {
            case 0:
                this.f33145b.b(null);
                break;
            default:
                com.google.android.gms.internal.auth.g.e("FocusMeteringControl", "triggerAePrecapture: triggering capture request completed");
                this.f33145b.b(null);
                break;
        }
    }

    @Override // g0.p
    public final void c(int i, of ofVar) {
        switch (this.f33144a) {
            case 0:
                this.f33145b.d(new a0.l1("Capture request failed with reason ".concat("ERROR"), null, 2));
                break;
            default:
                this.f33145b.d(new c7.k());
                break;
        }
    }
}
