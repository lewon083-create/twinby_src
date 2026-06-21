package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class po0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qo0 f9142c;

    public /* synthetic */ po0(qo0 qo0Var, int i) {
        this.f9141b = i;
        this.f9142c = qo0Var;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f9141b) {
            case 0:
                qo0 qo0Var = this.f9142c;
                qo0Var.f9562b.b().execute(new po0(qo0Var, 1));
                break;
            default:
                this.f9142c.l4(5);
                break;
        }
    }
}
