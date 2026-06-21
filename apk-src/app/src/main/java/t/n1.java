package t;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n1 implements j1.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r1 f33167c;

    public /* synthetic */ n1(r1 r1Var, int i) {
        this.f33166b = i;
        this.f33167c = r1Var;
    }

    @Override // j1.i
    public final Object m(final j1.h hVar) {
        switch (this.f33166b) {
            case 0:
                final r1 r1Var = this.f33167c;
                final int i = 0;
                r1Var.f33253b.execute(new Runnable() { // from class: t.l1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                r1Var.b(hVar);
                                break;
                            default:
                                r1Var.e(hVar);
                                break;
                        }
                    }
                });
                return "cancelFocusAndMetering";
            default:
                final r1 r1Var2 = this.f33167c;
                final int i10 = 1;
                r1Var2.f33253b.execute(new Runnable() { // from class: t.l1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                r1Var2.b(hVar);
                                break;
                            default:
                                r1Var2.e(hVar);
                                break;
                        }
                    }
                });
                return "triggerAePrecapture";
        }
    }
}
