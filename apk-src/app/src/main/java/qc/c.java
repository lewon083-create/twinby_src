package qc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f32001b;

    public /* synthetic */ c(d dVar, int i) {
        this.f32000a = i;
        this.f32001b = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f32000a) {
            case 1:
                this.f32001b.f32053b.g(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f32000a) {
            case 0:
                this.f32001b.f32053b.g(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
