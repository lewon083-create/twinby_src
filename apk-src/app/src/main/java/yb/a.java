package yb;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import g2.n0;
import java.lang.reflect.Field;
import n2.f;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f45607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f45608b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f45609c;

    public a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f45609c = swipeDismissBehavior;
    }

    @Override // n2.f
    public final boolean b(View view, int i) {
        int i10 = this.f45608b;
        return (i10 == -1 || i10 == i) && this.f45609c.r(view);
    }

    @Override // n2.f
    public final int clampViewPositionHorizontal(View view, int i, int i10) {
        int width;
        int width2;
        int width3;
        Field field = n0.f19900a;
        boolean z5 = view.getLayoutDirection() == 1;
        int i11 = this.f45609c.f14479d;
        if (i11 == 0) {
            if (z5) {
                width = this.f45607a - view.getWidth();
                width2 = this.f45607a;
            } else {
                width = this.f45607a;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i11 != 1) {
            width = this.f45607a - view.getWidth();
            width2 = view.getWidth() + this.f45607a;
        } else if (z5) {
            width = this.f45607a;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f45607a - view.getWidth();
            width2 = this.f45607a;
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // n2.f
    public final int clampViewPositionVertical(View view, int i, int i10) {
        return view.getTop();
    }

    @Override // n2.f
    public final int getViewHorizontalDragRange(View view) {
        return view.getWidth();
    }

    @Override // n2.f
    public final void onViewCaptured(View view, int i) {
        this.f45608b = i;
        this.f45607a = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f45609c;
            swipeDismissBehavior.f14478c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f14478c = false;
        }
    }

    @Override // n2.f
    public final void onViewDragStateChanged(int i) {
        this.f45609c.getClass();
    }

    @Override // n2.f
    public final void onViewPositionChanged(View view, int i, int i10, int i11, int i12) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f45609c;
        float f10 = width * swipeDismissBehavior.f14480e;
        float width2 = view.getWidth() * swipeDismissBehavior.f14481f;
        float fAbs = Math.abs(i - this.f45607a);
        if (fAbs <= f10) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f10) / (width2 - f10))), 1.0f));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0067  */
    @Override // n2.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onViewReleased(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = -1
            r8.f45608b = r11
            int r11 = r9.getWidth()
            r0 = 0
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r2 = 0
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r8.f45609c
            r4 = 1
            if (r1 == 0) goto L39
            java.lang.reflect.Field r5 = g2.n0.f19900a
            int r5 = r9.getLayoutDirection()
            if (r5 != r4) goto L1a
            r5 = r4
            goto L1b
        L1a:
            r5 = r2
        L1b:
            int r6 = r3.f14479d
            r7 = 2
            if (r6 != r7) goto L21
            goto L52
        L21:
            if (r6 != 0) goto L2d
            if (r5 == 0) goto L2a
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L67
            goto L52
        L2a:
            if (r1 <= 0) goto L67
            goto L52
        L2d:
            if (r6 != r4) goto L67
            if (r5 == 0) goto L34
            if (r1 <= 0) goto L67
            goto L52
        L34:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L67
            goto L52
        L39:
            int r1 = r9.getLeft()
            int r5 = r8.f45607a
            int r1 = r1 - r5
            int r5 = r9.getWidth()
            float r5 = (float) r5
            r6 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            int r1 = java.lang.Math.abs(r1)
            if (r1 < r5) goto L67
        L52:
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 < 0) goto L61
            int r10 = r9.getLeft()
            int r0 = r8.f45607a
            if (r10 >= r0) goto L5f
            goto L61
        L5f:
            int r0 = r0 + r11
            goto L65
        L61:
            int r10 = r8.f45607a
            int r0 = r10 - r11
        L65:
            r2 = r4
            goto L69
        L67:
            int r0 = r8.f45607a
        L69:
            n2.g r10 = r3.f14476a
            int r11 = r9.getTop()
            boolean r10 = r10.q(r0, r11)
            if (r10 == 0) goto L7f
            ob.b3 r10 = new ob.b3
            r10.<init>(r3, r9, r2)
            java.lang.reflect.Field r11 = g2.n0.f19900a
            r9.postOnAnimation(r10)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yb.a.onViewReleased(android.view.View, float, float):void");
    }
}
