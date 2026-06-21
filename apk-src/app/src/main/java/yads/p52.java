package yads;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class p52 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wn2 f41821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final il1 f41822b;

    /* JADX WARN: Multi-variable type inference failed */
    public p52(Context context, wn2 wn2Var, il1 il1Var) {
        super(context);
        this.f41821a = wn2Var;
        this.f41822b = il1Var;
        addView(wn2Var);
        if (il1Var == 0 || !(il1Var instanceof View)) {
            return;
        }
        addView((View) il1Var);
    }
}
