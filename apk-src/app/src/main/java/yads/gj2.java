package yads;

import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import android.widget.ProgressBar;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class gj2 extends Animation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f38778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f38779c;

    public gj2(ProgressBar progressBar, int i, int i10) {
        this.f38777a = i;
        this.f38778b = i10;
        this.f38779c = new WeakReference(progressBar);
        setInterpolator(new LinearInterpolator());
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f10, Transformation transformation) {
        ProgressBar progressBar = (ProgressBar) this.f38779c.get();
        if (progressBar != null) {
            super.applyTransformation(f10, transformation);
            progressBar.setProgress(Math.round(((this.f38778b - r5) * f10) + this.f38777a));
        }
    }
}
