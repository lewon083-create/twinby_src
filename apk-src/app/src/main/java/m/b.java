package m;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28161b;

    public /* synthetic */ b(int i, Object obj) {
        this.f28160a = i;
        this.f28161b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f28160a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f28161b;
                actionBarOverlayLayout.f1113u = null;
                actionBarOverlayLayout.f1103k = false;
                break;
            case 1:
            default:
                super.onAnimationCancel(animator);
                break;
            case 2:
                s9.m mVar = (s9.m) this.f28161b;
                mVar.setEnabled(true);
                mVar.f32856b.setEnabled(true);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28160a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f28161b;
                actionBarOverlayLayout.f1113u = null;
                actionBarOverlayLayout.f1103k = false;
                break;
            case 1:
                qc.j jVar = (qc.j) this.f28161b;
                jVar.p();
                jVar.f32028r.start();
                break;
            case 2:
                s9.m mVar = (s9.m) this.f28161b;
                mVar.setEnabled(true);
                mVar.f32856b.setEnabled(true);
                break;
            case 3:
                ((u6.r) this.f28161b).end();
                animator.removeListener(this);
                break;
            default:
                ((HideBottomViewOnScrollBehavior) this.f28161b).f14475h = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f28160a) {
            case 2:
                s9.m mVar = (s9.m) this.f28161b;
                mVar.setEnabled(false);
                mVar.f32856b.setEnabled(false);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
