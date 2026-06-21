package g2;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f19915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewTreeObserver f19916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Runnable f19917d;

    public s(View view, Runnable runnable) {
        this.f19915b = view;
        this.f19916c = view.getViewTreeObserver();
        this.f19917d = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        s sVar = new s(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(sVar);
        view.addOnAttachStateChangeListener(sVar);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        if (this.f19916c.isAlive()) {
            this.f19916c.removeOnPreDrawListener(this);
        } else {
            this.f19915b.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f19915b.removeOnAttachStateChangeListener(this);
        this.f19917d.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f19916c = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.f19916c.isAlive()) {
            this.f19916c.removeOnPreDrawListener(this);
        } else {
            this.f19915b.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f19915b.removeOnAttachStateChangeListener(this);
    }
}
