package z2;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends p0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f45867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AnimatorSet f45868d;

    public i(g animatorInfo) {
        Intrinsics.checkNotNullParameter(animatorInfo, "animatorInfo");
        this.f45867c = animatorInfo;
    }

    @Override // z2.p0
    public final void a(ViewGroup container) {
        q0 q0Var = (q0) this.f45867c.f15951b;
        Intrinsics.checkNotNullParameter(container, "container");
        AnimatorSet animatorSet = this.f45868d;
        if (animatorSet == null) {
            q0Var.c(this);
            return;
        }
        if (!q0Var.f45943g) {
            animatorSet.end();
        } else if (Build.VERSION.SDK_INT >= 26) {
            k.f45884a.a(animatorSet);
        }
        if (h0.K(2)) {
            StringBuilder sb2 = new StringBuilder("Animator from operation ");
            sb2.append(q0Var);
            sb2.append(" has been canceled");
            sb2.append(q0Var.f45943g ? " with seeking." : ".");
            sb2.append(' ');
            Log.v("FragmentManager", sb2.toString());
        }
    }

    @Override // z2.p0
    public final void b(ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        q0 q0Var = (q0) this.f45867c.f15951b;
        AnimatorSet animatorSet = this.f45868d;
        if (animatorSet == null) {
            q0Var.c(this);
            return;
        }
        animatorSet.start();
        if (h0.K(2)) {
            Log.v("FragmentManager", "Animator from operation " + q0Var + " has started.");
        }
    }

    @Override // z2.p0
    public final void c(d.a backEvent, ViewGroup container) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        Intrinsics.checkNotNullParameter(container, "container");
        q0 q0Var = (q0) this.f45867c.f15951b;
        AnimatorSet animatorSet = this.f45868d;
        if (animatorSet == null) {
            q0Var.c(this);
            return;
        }
        if (Build.VERSION.SDK_INT < 34 || !q0Var.f45939c.f45979n) {
            return;
        }
        if (h0.K(2)) {
            Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + q0Var);
        }
        long jA = j.f45876a.a(animatorSet);
        long j10 = (long) (backEvent.f15433c * jA);
        if (j10 == 0) {
            j10 = 1;
        }
        if (j10 == jA) {
            j10 = jA - 1;
        }
        if (h0.K(2)) {
            Log.v("FragmentManager", "Setting currentPlayTime to " + j10 + " for Animator " + animatorSet + " on operation " + q0Var);
        }
        k.f45884a.b(animatorSet, j10);
    }

    @Override // z2.p0
    public final void d(ViewGroup container) {
        i iVar;
        Intrinsics.checkNotNullParameter(container, "container");
        g gVar = this.f45867c;
        if (gVar.v()) {
            return;
        }
        Context context = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        x0.v vVarD = gVar.D(context);
        this.f45868d = vVarD != null ? (AnimatorSet) vVarD.f35682d : null;
        q0 q0Var = (q0) gVar.f15951b;
        t tVar = q0Var.f45939c;
        boolean z5 = q0Var.f45937a == s0.f45965d;
        View view = tVar.G;
        container.startViewTransition(view);
        AnimatorSet animatorSet = this.f45868d;
        if (animatorSet != null) {
            iVar = this;
            animatorSet.addListener(new h(container, view, z5, q0Var, iVar));
        } else {
            iVar = this;
        }
        AnimatorSet animatorSet2 = iVar.f45868d;
        if (animatorSet2 != null) {
            animatorSet2.setTarget(view);
        }
    }
}
