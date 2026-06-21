package zl;

import yads.cl;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f46545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cl f46546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Exception f46547d;

    public /* synthetic */ d(cl clVar, Exception exc, int i) {
        this.f46545b = i;
        this.f46546c = clVar;
        this.f46547d = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f46545b) {
            case 0:
                this.f46546c.d(this.f46547d);
                break;
            default:
                this.f46546c.c(this.f46547d);
                break;
        }
    }
}
