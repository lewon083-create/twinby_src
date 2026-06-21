package k6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f27097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f27098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f27099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f27100e;

    public /* synthetic */ j(m mVar, k kVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.f27096a = i;
        this.f27100e = mVar;
        this.f27097b = kVar;
        this.f27098c = viewPropertyAnimator;
        this.f27099d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27096a) {
            case 0:
                this.f27098c.setListener(null);
                View view = this.f27099d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                k kVar = this.f27097b;
                androidx.recyclerview.widget.p pVar = kVar.f27101a;
                m mVar = this.f27100e;
                mVar.c(pVar);
                mVar.f27128r.remove(kVar.f27101a);
                mVar.i();
                break;
            default:
                this.f27098c.setListener(null);
                View view2 = this.f27099d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                k kVar2 = this.f27097b;
                androidx.recyclerview.widget.p pVar2 = kVar2.f27102b;
                m mVar2 = this.f27100e;
                mVar2.c(pVar2);
                mVar2.f27128r.remove(kVar2.f27102b);
                mVar2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f27096a) {
            case 0:
                androidx.recyclerview.widget.p pVar = this.f27097b.f27101a;
                this.f27100e.getClass();
                break;
            default:
                androidx.recyclerview.widget.p pVar2 = this.f27097b.f27102b;
                this.f27100e.getClass();
                break;
        }
    }
}
