package u6;

import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f34269a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f34270b;

    public f(ViewGroup viewGroup) {
        this.f34270b = viewGroup;
    }

    @Override // u6.q
    public final void a(r rVar) {
        if (!this.f34269a) {
            a0.e.u(this.f34270b, false);
        }
        rVar.removeListener(this);
    }

    @Override // u6.s, u6.q
    public final void onTransitionCancel(r rVar) {
        a0.e.u(this.f34270b, false);
        this.f34269a = true;
    }

    @Override // u6.s, u6.q
    public final void onTransitionPause(r rVar) {
        a0.e.u(this.f34270b, false);
    }

    @Override // u6.s, u6.q
    public final void onTransitionResume(r rVar) {
        a0.e.u(this.f34270b, true);
    }
}
