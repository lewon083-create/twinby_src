package yads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.varioqub.config.model.ConfigValue;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class gj1 implements kj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f38773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f38774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f38775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final jj1 f38776d;

    public /* synthetic */ gj1(View view, float f10, Context context) {
        this(view, f10, context, new jj1());
    }

    @Override // yads.kj1
    public final jj1 a(int i, int i10) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        Context context = this.f38775c;
        zl3 zl3Var = nl3.f41290a;
        int iRound = Math.round(context.getResources().getDisplayMetrics().widthPixels * this.f38774b);
        ViewGroup.LayoutParams layoutParams = this.f38773a.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            iRound = (iRound - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin;
        }
        this.f38776d.f39877a = View.MeasureSpec.makeMeasureSpec((int) Math.max(Math.min(size, iRound), ConfigValue.DOUBLE_DEFAULT_VALUE), mode);
        jj1 jj1Var = this.f38776d;
        jj1Var.f39878b = i10;
        return jj1Var;
    }

    public gj1(View view, float f10, Context context, jj1 jj1Var) {
        this.f38773a = view;
        this.f38774b = f10;
        this.f38775c = context;
        this.f38776d = jj1Var;
    }
}
