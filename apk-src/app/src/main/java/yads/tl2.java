package yads;

import android.view.View;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class tl2 extends kk3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ko2 f43357c;

    public tl2(View view, ko2 ko2Var) {
        super(view);
        this.f43357c = ko2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.kk3
    public final void a(View view) {
        ((vl2) view).setRating(0.0f);
        view.setVisibility(8);
        view.setOnClickListener(null);
        view.setOnTouchListener(null);
        view.setSelected(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.kk3
    public final void b(View view, Object obj) {
        String str = (String) obj;
        try {
            float f10 = Float.parseFloat(str);
            vl2 vl2Var = (vl2) view;
            if (f10 < 0.0f) {
                f10 = 0.0f;
            }
            vl2Var.setRating(f10);
        } catch (NumberFormatException e3) {
            Intrinsics.checkNotNullExpressionValue(String.format("Could not parse rating value. Rating value is %s", Arrays.copyOf(new Object[]{str}, 1)), "format(...)");
            this.f43357c.reportError("Could not parse rating value", e3);
        }
    }

    @Override // yads.kk3
    public final /* bridge */ /* synthetic */ boolean a(View view, Object obj) {
        return true;
    }
}
