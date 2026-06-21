package z2;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0 f45826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f45827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f45828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f45829d;

    public e(q0 q0Var, ViewGroup viewGroup, View view, f fVar) {
        this.f45826a = q0Var;
        this.f45827b = viewGroup;
        this.f45828c = view;
        this.f45829d = fVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        ViewGroup viewGroup = this.f45827b;
        viewGroup.post(new q0.o(viewGroup, this.f45828c, this.f45829d, 15));
        if (h0.K(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f45826a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        if (h0.K(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f45826a + " has reached onAnimationStart.");
        }
    }
}
