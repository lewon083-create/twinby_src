package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w40 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z7 f11630c;

    public /* synthetic */ w40(z7 z7Var, int i) {
        this.f11629b = i;
        this.f11630c = z7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11629b) {
            case 0:
                this.f11630c.k(new uf0(3));
                break;
            default:
                ((uk0) ((oq0) ((hi) this.f11630c.f12905g).f6143d).f8763d).k();
                break;
        }
    }
}
