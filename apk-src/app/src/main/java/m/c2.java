package m;

import androidx.appcompat.widget.SearchView;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SearchView f28175c;

    public /* synthetic */ c2(SearchView searchView, int i) {
        this.f28174b = i;
        this.f28175c = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28174b) {
            case 0:
                this.f28175c.r();
                break;
            default:
                k2.b bVar = this.f28175c.P;
                if (bVar instanceof n2) {
                    bVar.b(null);
                }
                break;
        }
    }
}
