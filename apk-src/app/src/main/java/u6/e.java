package u6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Rect;
import android.view.View;
import g2.n0;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f34258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f34259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Rect f34260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f34261d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f34262e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f34263f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f34264g;

    public e(View view, Rect rect, int i, int i10, int i11, int i12) {
        this.f34259b = view;
        this.f34260c = rect;
        this.f34261d = i;
        this.f34262e = i10;
        this.f34263f = i11;
        this.f34264g = i12;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f34258a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f34258a) {
            return;
        }
        Field field = n0.f19900a;
        View view = this.f34259b;
        view.setClipBounds(this.f34260c);
        b0.a(view, this.f34261d, this.f34262e, this.f34263f, this.f34264g);
    }
}
