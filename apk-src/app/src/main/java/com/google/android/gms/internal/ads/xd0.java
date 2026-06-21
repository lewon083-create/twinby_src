package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xd0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wd0 f12132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f12133d;

    public /* synthetic */ xd0(wd0 wd0Var, String str, int i) {
        this.f12131b = i;
        this.f12132c = wd0Var;
        this.f12133d = str;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f12131b) {
            case 0:
                this.f12132c.f11750d.a(this.f12133d, null);
                break;
            default:
                this.f12132c.f11750d.a(this.f12133d, null);
                break;
        }
    }
}
