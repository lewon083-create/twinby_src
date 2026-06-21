package yads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.varioqub.config.model.ConfigValue;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class fj1 implements kj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f38454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f38455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f38456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final jj1 f38457d;

    public /* synthetic */ fj1(View view, float f10, Context context) {
        this(view, f10, context, new jj1());
    }

    @Override // yads.kj1
    public final jj1 a(int i, int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int iRound = Math.round(nl3.c(this.f38456c) * this.f38455b);
        ViewGroup.LayoutParams layoutParams = this.f38454a.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            iRound = (iRound - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin;
        }
        int iMax = (int) Math.max(Math.min(size, iRound), ConfigValue.DOUBLE_DEFAULT_VALUE);
        jj1 jj1Var = this.f38457d;
        jj1Var.f39877a = i;
        jj1Var.f39878b = View.MeasureSpec.makeMeasureSpec(iMax, mode);
        return this.f38457d;
    }

    public fj1(View view, float f10, Context context, jj1 jj1Var) {
        this.f38454a = view;
        this.f38455b = f10;
        this.f38456c = context;
        this.f38457d = jj1Var;
    }
}
