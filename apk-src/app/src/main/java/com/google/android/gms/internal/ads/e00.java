package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e00 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g00 f4779c;

    public /* synthetic */ e00(g00 g00Var, int i) {
        this.f4778b = i;
        this.f4779c = g00Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4778b) {
            case 0:
                super/*android.webkit.WebView*/.destroy();
                break;
            default:
                this.f4779c.D();
                break;
        }
    }
}
