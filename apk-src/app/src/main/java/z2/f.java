package z2;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends p0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f45830c;

    public f(g animationInfo) {
        Intrinsics.checkNotNullParameter(animationInfo, "animationInfo");
        this.f45830c = animationInfo;
    }

    @Override // z2.p0
    public final void a(ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        g gVar = this.f45830c;
        q0 q0Var = (q0) gVar.f15951b;
        View view = q0Var.f45939c.G;
        view.clearAnimation();
        container.endViewTransition(view);
        ((q0) gVar.f15951b).c(this);
        if (h0.K(2)) {
            Log.v("FragmentManager", "Animation from operation " + q0Var + " has been cancelled.");
        }
    }

    @Override // z2.p0
    public final void b(ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        g gVar = this.f45830c;
        q0 q0Var = (q0) gVar.f15951b;
        if (gVar.v()) {
            q0Var.c(this);
            return;
        }
        Context context = container.getContext();
        View view = q0Var.f45939c.G;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        x0.v vVarD = gVar.D(context);
        if (vVarD == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Animation animation = (Animation) vVarD.f35681c;
        if (animation == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (q0Var.f45937a != s0.f45963b) {
            view.startAnimation(animation);
            q0Var.c(this);
            return;
        }
        container.startViewTransition(view);
        x xVar = new x(animation, container, view);
        xVar.setAnimationListener(new e(q0Var, container, view, this));
        view.startAnimation(xVar);
        if (h0.K(2)) {
            Log.v("FragmentManager", "Animation from operation " + q0Var + " has started.");
        }
    }
}
