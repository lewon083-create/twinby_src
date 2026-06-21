package u6;

import android.view.View;
import android.view.ViewGroup;
import com.twinby.R;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f34265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f34266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f34267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g0 f34268d;

    public e0(g0 g0Var, ViewGroup viewGroup, View view, View view2) {
        this.f34268d = g0Var;
        this.f34265a = viewGroup;
        this.f34266b = view;
        this.f34267c = view2;
    }

    @Override // u6.q
    public final void a(r rVar) {
        this.f34267c.setTag(R.id.save_overlay_view, null);
        this.f34265a.getOverlay().remove(this.f34266b);
        rVar.removeListener(this);
    }

    @Override // u6.s, u6.q
    public final void onTransitionPause(r rVar) {
        this.f34265a.getOverlay().remove(this.f34266b);
    }

    @Override // u6.s, u6.q
    public final void onTransitionResume(r rVar) {
        View view = this.f34266b;
        if (view.getParent() == null) {
            this.f34265a.getOverlay().add(view);
        } else {
            this.f34268d.cancel();
        }
    }
}
