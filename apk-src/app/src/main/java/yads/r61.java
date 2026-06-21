package yads;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class r61 extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pg0 f42501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final er f42502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f42503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View.OnClickListener f42504d;

    public r61(Context context, pg0 pg0Var) {
        super(context);
        this.f42501a = pg0Var;
        this.f42502b = new er(context, pg0Var);
        this.f42503c = new TextView(context);
        this.f42504d = new gh.a(5, this);
        a(context);
    }

    public static final void a(r61 r61Var, View view) {
        boolean zIsSelected = r61Var.f42502b.isSelected();
        r61Var.f42502b.setSelected(!zIsSelected);
        r61Var.f42503c.setVisibility(!zIsSelected ? 0 : 8);
    }

    public final void setDescription(@NotNull String str) {
        this.f42503c.setText(str);
    }

    public final void a(Context context) {
        setOrientation(0);
        this.f42501a.getClass();
        int iA = pg0.a(context, 4.0f);
        setPadding(iA, iA, iA, iA);
        this.f42502b.setOnClickListener(this.f42504d);
        addView(this.f42502b);
        this.f42501a.getClass();
        int iB = yj.b.b(TypedValue.applyDimension(1, 3.0f, context.getResources().getDisplayMetrics()));
        this.f42503c.setPadding(iB, iB, iB, iB);
        this.f42501a.getClass();
        int iB2 = yj.b.b(TypedValue.applyDimension(1, 2.0f, context.getResources().getDisplayMetrics()));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setStroke(iB2, -65536);
        this.f42503c.setBackgroundDrawable(gradientDrawable);
        addView(this.f42503c);
        this.f42501a.getClass();
        int iB3 = yj.b.b(TypedValue.applyDimension(1, 2.0f, context.getResources().getDisplayMetrics()));
        ViewGroup.LayoutParams layoutParams = this.f42503c.getLayoutParams();
        Intrinsics.c(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.setMargins(iB3, 0, iB3, iB3);
        this.f42503c.setLayoutParams(layoutParams2);
        this.f42503c.setVisibility(8);
    }
}
