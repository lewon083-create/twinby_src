package k6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27186a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f27187b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f27188c;

    public v(View view) {
        this.f27188c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f27186a) {
            case 0:
                this.f27187b = true;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27186a) {
            case 0:
                w wVar = (w) this.f27188c;
                if (this.f27187b) {
                    this.f27187b = false;
                } else if (((Float) wVar.f27219z.getAnimatedValue()).floatValue() != 0.0f) {
                    wVar.A = 2;
                    wVar.f27212s.invalidate();
                } else {
                    wVar.A = 0;
                    wVar.d(0);
                }
                break;
            default:
                View view = (View) this.f27188c;
                u6.b0.b(view, 1.0f);
                if (this.f27187b) {
                    view.setLayerType(0, null);
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f27186a) {
            case 1:
                View view = (View) this.f27188c;
                Field field = g2.n0.f19900a;
                if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
                    this.f27187b = true;
                    view.setLayerType(2, null);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public v(w wVar) {
        this.f27188c = wVar;
    }
}
