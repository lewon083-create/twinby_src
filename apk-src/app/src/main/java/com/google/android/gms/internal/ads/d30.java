package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d30 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e30 f4441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4442d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4443e;

    public /* synthetic */ d30(e30 e30Var, int i, int i10, int i11) {
        this.f4440b = i11;
        this.f4441c = e30Var;
        this.f4442d = i;
        this.f4443e = i10;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f4440b) {
            case 0:
                e30 e30Var = this.f4441c;
                e30Var.f4809c.execute(new d30(e30Var, this.f4442d, this.f4443e, 1));
                break;
            default:
                this.f4441c.b(this.f4442d - 1, this.f4443e);
                break;
        }
    }
}
