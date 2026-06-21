package u6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f34247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BitmapDrawable f34248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f34249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f34250d;

    public b(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f10) {
        this.f34247a = viewGroup;
        this.f34248b = bitmapDrawable;
        this.f34249c = view;
        this.f34250d = f10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        c0 c0Var = b0.f34251a;
        this.f34247a.getOverlay().remove(this.f34248b);
        b0.b(this.f34249c, this.f34250d);
    }
}
