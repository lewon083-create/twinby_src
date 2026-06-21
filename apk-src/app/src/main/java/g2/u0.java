package g2;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b1 f19927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x1 f19928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x1 f19929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f19930d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f19931e;

    public u0(b1 b1Var, x1 x1Var, x1 x1Var2, int i, View view) {
        this.f19927a = b1Var;
        this.f19928b = x1Var;
        this.f19929c = x1Var2;
        this.f19930d = i;
        this.f19931e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        b1 b1Var = this.f19927a;
        a1 a1Var = b1Var.f19835a;
        a1Var.d(animatedFraction);
        x1 x1Var = this.f19928b;
        t1 t1Var = x1Var.f19943a;
        float fB = a1Var.b();
        PathInterpolator pathInterpolator = x0.f19938e;
        int i = Build.VERSION.SDK_INT;
        j1 i1Var = i >= 36 ? new i1(x1Var) : i >= 35 ? new h1(x1Var) : i >= 34 ? new g1(x1Var) : i >= 31 ? new f1(x1Var) : i >= 30 ? new e1(x1Var) : i >= 29 ? new d1(x1Var) : new c1(x1Var);
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((this.f19930d & i10) == 0) {
                i1Var.d(i10, t1Var.h(i10));
            } else {
                x1.b bVarH = t1Var.h(i10);
                x1.b bVarH2 = this.f19929c.f19943a.h(i10);
                float f10 = 1.0f - fB;
                i1Var.d(i10, x1.e(bVarH, (int) (((double) ((bVarH.f35689a - bVarH2.f35689a) * f10)) + 0.5d), (int) (((double) ((bVarH.f35690b - bVarH2.f35690b) * f10)) + 0.5d), (int) (((double) ((bVarH.f35691c - bVarH2.f35691c) * f10)) + 0.5d), (int) (((double) ((bVarH.f35692d - bVarH2.f35692d) * f10)) + 0.5d)));
            }
        }
        x0.g(this.f19931e, i1Var.b(), Collections.singletonList(b1Var));
    }
}
