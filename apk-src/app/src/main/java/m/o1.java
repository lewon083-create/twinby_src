package m;

import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f28331b;

    public o1(p1 p1Var) {
        this.f28331b = p1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p1 p1Var = this.f28331b;
        d1 d1Var = p1Var.mDropDownList;
        if (d1Var != null) {
            Field field = g2.n0.f19900a;
            if (!d1Var.isAttachedToWindow() || p1Var.mDropDownList.getCount() <= p1Var.mDropDownList.getChildCount() || p1Var.mDropDownList.getChildCount() > p1Var.mListItemExpandMaximum) {
                return;
            }
            p1Var.mPopup.setInputMethodMode(2);
            p1Var.show();
        }
    }
}
