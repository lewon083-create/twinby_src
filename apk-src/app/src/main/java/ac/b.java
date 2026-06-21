package ac;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import k6.w;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f737b;

    public /* synthetic */ b(int i, Object obj) {
        this.f736a = i;
        this.f737b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f736a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nc.g gVar = ((BottomSheetBehavior) this.f737b).i;
                if (gVar != null) {
                    nc.f fVar = gVar.f29225b;
                    if (fVar.i != fFloatValue) {
                        fVar.i = fFloatValue;
                        gVar.f29229f = true;
                        gVar.invalidateSelf();
                    }
                }
                break;
            case 1:
                int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                w wVar = (w) this.f737b;
                wVar.f27197c.setAlpha(iFloatValue);
                wVar.f27198d.setAlpha(iFloatValue);
                wVar.f27212s.invalidate();
                break;
            default:
                ((TextInputLayout) this.f737b).f14706t0.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
