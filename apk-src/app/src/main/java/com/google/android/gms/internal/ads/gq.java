package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gq implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hq f5887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f5888d;

    public /* synthetic */ gq(hq hqVar, String str, int i) {
        this.f5886b = i;
        this.f5887c = hqVar;
        this.f5888d = str;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f5886b) {
            case 0:
                sz szVar = this.f5887c.f6211b;
                if (szVar != null) {
                    szVar.loadData(this.f5888d, "text/html", "UTF-8");
                }
                break;
            case 1:
                sz szVar2 = this.f5887c.f6211b;
                if (szVar2 != null) {
                    szVar2.loadData(this.f5888d, "text/html", "UTF-8");
                }
                break;
            case 2:
                sz szVar3 = this.f5887c.f6211b;
                if (szVar3 != null) {
                    szVar3.loadUrl(this.f5888d);
                }
                break;
            default:
                sz szVar4 = this.f5887c.f6211b;
                if (szVar4 != null) {
                    szVar4.b(this.f5888d);
                }
                break;
        }
    }
}
