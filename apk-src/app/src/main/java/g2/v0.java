package g2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b1 f19932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f19933b;

    public v0(b1 b1Var, View view) {
        this.f19932a = b1Var;
        this.f19933b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f19932a.f19835a.d(1.0f);
        x0.e(this.f19933b);
    }
}
