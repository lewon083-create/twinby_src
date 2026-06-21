package u6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends AnimatorListenerAdapter implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f34271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f34272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewGroup f34273c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f34275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f34276f = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f34274d = true;

    public f0(View view, int i) {
        this.f34271a = view;
        this.f34272b = i;
        this.f34273c = (ViewGroup) view.getParent();
        b(true);
    }

    @Override // u6.q
    public final void a(r rVar) {
        if (!this.f34276f) {
            b0.f34251a.G(this.f34271a, this.f34272b);
            ViewGroup viewGroup = this.f34273c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        b(false);
        rVar.removeListener(this);
    }

    public final void b(boolean z5) {
        ViewGroup viewGroup;
        if (!this.f34274d || this.f34275e == z5 || (viewGroup = this.f34273c) == null) {
            return;
        }
        this.f34275e = z5;
        a0.e.u(viewGroup, z5);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f34276f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f34276f) {
            b0.f34251a.G(this.f34271a, this.f34272b);
            ViewGroup viewGroup = this.f34273c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        b(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        if (this.f34276f) {
            return;
        }
        b0.f34251a.G(this.f34271a, this.f34272b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        if (this.f34276f) {
            return;
        }
        b0.f34251a.G(this.f34271a, 0);
    }

    @Override // u6.q
    public final void onTransitionPause(r rVar) {
        b(false);
    }

    @Override // u6.q
    public final void onTransitionResume(r rVar) {
        b(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // u6.q
    public final void onTransitionCancel(r rVar) {
    }

    @Override // u6.q
    public final void onTransitionStart(r rVar) {
    }
}
