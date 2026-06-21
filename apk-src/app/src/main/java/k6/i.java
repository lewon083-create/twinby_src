package k6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.p f27089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f27091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f27092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f27093e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m f27094f;

    public i(m mVar, androidx.recyclerview.widget.p pVar, int i, View view, int i10, ViewPropertyAnimator viewPropertyAnimator) {
        this.f27094f = mVar;
        this.f27089a = pVar;
        this.f27090b = i;
        this.f27091c = view;
        this.f27092d = i10;
        this.f27093e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f27090b;
        View view = this.f27091c;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f27092d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f27093e.setListener(null);
        m mVar = this.f27094f;
        androidx.recyclerview.widget.p pVar = this.f27089a;
        mVar.c(pVar);
        mVar.f27126p.remove(pVar);
        mVar.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f27094f.getClass();
    }
}
