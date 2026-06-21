package z2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f45837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f45838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f45839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q0 f45840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f45841e;

    public h(ViewGroup viewGroup, View view, boolean z5, q0 q0Var, i iVar) {
        this.f45837a = viewGroup;
        this.f45838b = view;
        this.f45839c = z5;
        this.f45840d = q0Var;
        this.f45841e = iVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator anim) {
        Intrinsics.checkNotNullParameter(anim, "anim");
        ViewGroup viewGroup = this.f45837a;
        View viewToAnimate = this.f45838b;
        viewGroup.endViewTransition(viewToAnimate);
        boolean z5 = this.f45839c;
        q0 q0Var = this.f45840d;
        if (z5) {
            s0 s0Var = q0Var.f45937a;
            Intrinsics.checkNotNullExpressionValue(viewToAnimate, "viewToAnimate");
            s0Var.a(viewToAnimate, viewGroup);
        }
        i iVar = this.f45841e;
        ((q0) iVar.f45867c.f15951b).c(iVar);
        if (h0.K(2)) {
            Log.v("FragmentManager", "Animator from operation " + q0Var + " has ended.");
        }
    }
}
