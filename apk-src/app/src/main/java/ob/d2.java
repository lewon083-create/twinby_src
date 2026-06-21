package ob;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f30059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f30060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f30061d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Bundle f30062e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f30063f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f30064g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f30065h;
    public final /* synthetic */ k2 i;

    public d2(k2 k2Var, String str, String str2, long j10, Bundle bundle, boolean z5, boolean z10, boolean z11) {
        this.f30059b = str;
        this.f30060c = str2;
        this.f30061d = j10;
        this.f30062e = bundle;
        this.f30063f = z5;
        this.f30064g = z10;
        this.f30065h = z11;
        this.i = k2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.i.L(this.f30059b, this.f30060c, this.f30061d, this.f30062e, this.f30063f, this.f30064g, this.f30065h);
    }
}
