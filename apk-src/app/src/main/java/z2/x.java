package z2;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends AnimationSet implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f46005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f46006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f46007d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f46008e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f46009f;

    public x(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f46009f = true;
        this.f46005b = viewGroup;
        this.f46006c = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j10, Transformation transformation) {
        this.f46009f = true;
        if (this.f46007d) {
            return !this.f46008e;
        }
        if (!super.getTransformation(j10, transformation)) {
            this.f46007d = true;
            g2.s.a(this.f46005b, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z5 = this.f46007d;
        ViewGroup viewGroup = this.f46005b;
        if (z5 || !this.f46009f) {
            viewGroup.endViewTransition(this.f46006c);
            this.f46008e = true;
        } else {
            this.f46009f = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j10, Transformation transformation, float f10) {
        this.f46009f = true;
        if (this.f46007d) {
            return !this.f46008e;
        }
        if (!super.getTransformation(j10, transformation, f10)) {
            this.f46007d = true;
            g2.s.a(this.f46005b, this);
        }
        return true;
    }
}
