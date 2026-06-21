package m;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l2 extends TouchDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f28292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f28293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f28294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f28295d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f28296e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f28297f;

    public l2(Rect rect, Rect rect2, View view) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f28296e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f28293b = rect3;
        Rect rect4 = new Rect();
        this.f28295d = rect4;
        Rect rect5 = new Rect();
        this.f28294c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i = -scaledTouchSlop;
        rect4.inset(i, i);
        rect5.set(rect2);
        this.f28292a = view;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z5;
        boolean z10;
        int x10 = (int) motionEvent.getX();
        int y7 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z11 = true;
        if (action != 0) {
            if (action == 1 || action == 2) {
                z10 = this.f28297f;
                if (z10 && !this.f28295d.contains(x10, y7)) {
                    z11 = z10;
                    z5 = false;
                }
            } else {
                if (action == 3) {
                    z10 = this.f28297f;
                    this.f28297f = false;
                }
                z5 = true;
                z11 = false;
            }
            z11 = z10;
            z5 = true;
        } else if (this.f28293b.contains(x10, y7)) {
            this.f28297f = true;
            z5 = true;
        } else {
            z5 = true;
            z11 = false;
        }
        if (!z11) {
            return false;
        }
        Rect rect = this.f28294c;
        View view = this.f28292a;
        if (!z5 || rect.contains(x10, y7)) {
            motionEvent.setLocation(x10 - rect.left, y7 - rect.top);
        } else {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
