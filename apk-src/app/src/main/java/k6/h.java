package k6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27081a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.p f27082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f27083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f27084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f27085e;

    public h(m mVar, androidx.recyclerview.widget.p pVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f27085e = mVar;
        this.f27082b = pVar;
        this.f27084d = viewPropertyAnimator;
        this.f27083c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f27081a) {
            case 1:
                this.f27083c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27081a) {
            case 0:
                this.f27084d.setListener(null);
                this.f27083c.setAlpha(1.0f);
                m mVar = this.f27085e;
                androidx.recyclerview.widget.p pVar = this.f27082b;
                mVar.c(pVar);
                mVar.f27127q.remove(pVar);
                mVar.i();
                break;
            default:
                this.f27084d.setListener(null);
                m mVar2 = this.f27085e;
                androidx.recyclerview.widget.p pVar2 = this.f27082b;
                mVar2.c(pVar2);
                mVar2.f27125o.remove(pVar2);
                mVar2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f27081a) {
            case 0:
                this.f27085e.getClass();
                break;
            default:
                this.f27085e.getClass();
                break;
        }
    }

    public h(m mVar, androidx.recyclerview.widget.p pVar, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f27085e = mVar;
        this.f27082b = pVar;
        this.f27083c = view;
        this.f27084d = viewPropertyAnimator;
    }
}
