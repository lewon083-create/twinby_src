package u6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h1.e f34287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f34288b;

    public n(r rVar, h1.e eVar) {
        this.f34288b = rVar;
        this.f34287a = eVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f34287a.remove(animator);
        this.f34288b.mCurrentAnimators.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f34288b.mCurrentAnimators.add(animator);
    }
}
