package zl;

import yads.yz1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f46560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz1 f46561c;

    public /* synthetic */ e1(yz1 yz1Var, int i) {
        this.f46560b = i;
        this.f46561c = yz1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f46560b) {
            case 0:
                yz1.b(this.f46561c);
                break;
            case 1:
                yz1.a(this.f46561c);
                break;
            default:
                yz1.c(this.f46561c);
                break;
        }
    }
}
