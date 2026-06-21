package ni;

import android.util.Log;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class f0 implements androidx.lifecycle.e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f29391b;

    public /* synthetic */ f0(int i, Object obj) {
        this.f29390a = i;
        this.f29391b = obj;
    }

    @Override // androidx.lifecycle.e0
    public final void a(Object obj) {
        switch (this.f29390a) {
            case 0:
                ((c) this.f29391b).f29359a.l(new a(1, this, obj));
                return;
            default:
                androidx.lifecycle.u uVar = (androidx.lifecycle.u) obj;
                z2.p pVar = (z2.p) this.f29391b;
                if (uVar == null || !pVar.f45926c0) {
                    return;
                }
                View viewN = pVar.N();
                if (viewN.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                if (pVar.f45930g0 != null) {
                    if (z2.h0.K(3)) {
                        Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + pVar.f45930g0);
                    }
                    pVar.f45930g0.setContentView(viewN);
                    return;
                }
                return;
        }
    }
}
