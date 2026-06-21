package a1;

import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f312d;

    public /* synthetic */ a(g gVar, boolean z5, int i) {
        this.f310b = i;
        this.f311c = gVar;
        this.f312d = z5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f310b) {
            case 0:
                g gVar = this.f311c;
                int iM = z.m(gVar.f332g);
                if (iM != 0) {
                    if (iM == 2) {
                        throw new AssertionError("AudioSource is released");
                    }
                    return;
                }
                gVar.f327b.set(null);
                gVar.f328c.set(false);
                gVar.d(2);
                gVar.f326a.execute(new a(gVar, this.f312d, 1));
                gVar.f();
                return;
            default:
                g gVar2 = this.f311c;
                int iM2 = z.m(gVar2.f332g);
                if (iM2 != 0 && iM2 != 1) {
                    if (iM2 == 2) {
                        throw new AssertionError("AudioSource is released");
                    }
                    return;
                }
                boolean z5 = gVar2.f342r;
                boolean z10 = this.f312d;
                if (z5 == z10) {
                    return;
                }
                gVar2.f342r = z10;
                if (gVar2.f332g == 2) {
                    gVar2.a();
                    return;
                }
                return;
        }
    }
}
