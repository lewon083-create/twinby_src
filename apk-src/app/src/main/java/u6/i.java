package u6;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f34286b;

    public /* synthetic */ i() {
        this.f34285a = 2;
    }

    @Override // u6.q
    public final void a(r rVar) {
        switch (this.f34285a) {
            case 0:
                b0.b((View) this.f34286b, 1.0f);
                b0.f34251a.getClass();
                rVar.removeListener(this);
                break;
            case 1:
                ((r) this.f34286b).runAnimators();
                rVar.removeListener(this);
                break;
            default:
                x xVar = (x) this.f34286b;
                int i = xVar.f34303d - 1;
                xVar.f34303d = i;
                if (i == 0) {
                    xVar.f34304e = false;
                    xVar.end();
                }
                rVar.removeListener(this);
                break;
        }
    }

    @Override // u6.s, u6.q
    public void onTransitionStart(r rVar) {
        switch (this.f34285a) {
            case 2:
                x xVar = (x) this.f34286b;
                if (!xVar.f34304e) {
                    xVar.start();
                    xVar.f34304e = true;
                }
                break;
            default:
                super.onTransitionStart(rVar);
                break;
        }
    }

    public /* synthetic */ i(int i, Object obj) {
        this.f34285a = i;
        this.f34286b = obj;
    }
}
