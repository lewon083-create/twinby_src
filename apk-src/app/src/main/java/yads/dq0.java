package yads;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class dq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ql3 f37877a;

    public /* synthetic */ dq0() {
        this(new ql3());
    }

    public final cq0 a(View view) {
        int iA;
        this.f37877a.getClass();
        RectF rectF = null;
        if (ql3.a(view)) {
            iA = nl3.a(view);
            Rect rect = new Rect();
            if (view.getLocalVisibleRect(rect)) {
                rect.offset(view.getLeft(), view.getTop());
            } else {
                rect = null;
            }
            Context context = view.getContext();
            if (rect != null) {
                float fA = nl3.a(context, rect.left);
                float fB = yj.b.b(rect.top / context.getResources().getDisplayMetrics().density);
                float fB2 = yj.b.b(rect.right / context.getResources().getDisplayMetrics().density);
                float fB3 = yj.b.b(rect.bottom / context.getResources().getDisplayMetrics().density);
                float f10 = fB3 - fB;
                if (fB2 - fA > 0.0f && f10 > 0.0f) {
                    rectF = new RectF(fA, fB, fB2, fB3);
                }
            }
        } else {
            iA = 0;
        }
        return new cq0(iA, rectF);
    }

    public dq0(ql3 ql3Var) {
        this.f37877a = ql3Var;
    }
}
