package u6;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends g0 {
    public j(int i) {
        setMode(i);
    }

    @Override // u6.g0, u6.r
    public final void captureStartValues(z zVar) {
        super.captureStartValues(zVar);
        zVar.f34309a.put("android:fade:transitionAlpha", Float.valueOf(b0.f34251a.r(zVar.f34310b)));
    }

    public final ObjectAnimator g(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        b0.b(view, f10);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, b0.f34252b, f11);
        objectAnimatorOfFloat.addListener(new k6.v(view));
        addListener(new i(0, view));
        return objectAnimatorOfFloat;
    }

    @Override // u6.g0
    public final Animator onAppear(ViewGroup viewGroup, View view, z zVar, z zVar2) {
        Float f10;
        float fFloatValue = (zVar == null || (f10 = (Float) zVar.f34309a.get("android:fade:transitionAlpha")) == null) ? 0.0f : f10.floatValue();
        return g(view, fFloatValue != 1.0f ? fFloatValue : 0.0f, 1.0f);
    }

    @Override // u6.g0
    public final Animator onDisappear(ViewGroup viewGroup, View view, z zVar, z zVar2) {
        Float f10;
        b0.f34251a.getClass();
        return g(view, (zVar == null || (f10 = (Float) zVar.f34309a.get("android:fade:transitionAlpha")) == null) ? 1.0f : f10.floatValue(), 0.0f);
    }
}
