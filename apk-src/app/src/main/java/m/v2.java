package m;

import androidx.appcompat.widget.Toolbar;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Toolbar f28387c;

    public /* synthetic */ v2(Toolbar toolbar, int i) {
        this.f28386b = i;
        this.f28387c = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28386b) {
            case 0:
                z2 z2Var = this.f28387c.L;
                l.j jVar = z2Var == null ? null : z2Var.f28418c;
                if (jVar != null) {
                    jVar.collapseActionView();
                }
                break;
            default:
                this.f28387c.m();
                break;
        }
    }
}
