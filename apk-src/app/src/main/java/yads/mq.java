package yads;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class mq extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pg0 f40990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kj1 f40991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f40992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f40993d;

    public mq(Context context, pg0 pg0Var, kj1 kj1Var) {
        super(context);
        this.f40990a = pg0Var;
        this.f40991b = kj1Var;
        pg0Var.getClass();
        this.f40992c = pg0.a(context, 0.5f);
        this.f40993d = new Paint();
        a(context);
    }

    public final void a(Context context) {
        this.f40990a.getClass();
        int iA = pg0.a(context, 1.0f);
        this.f40993d.setStyle(Paint.Style.STROKE);
        this.f40993d.setStrokeWidth(iA);
        this.f40993d.setColor(-65536);
        setClickable(false);
        setFocusable(false);
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f10 = this.f40992c;
        canvas.drawRect(f10, f10, getWidth() - this.f40992c, getHeight() - this.f40992c, this.f40993d);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i, int i10, int i11, int i12) {
        Object parent = getParent();
        if (!(parent instanceof View)) {
            super.onLayout(z5, i, i10, i11, i12);
            return;
        }
        View view = (View) parent;
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        setLeft(0);
        setTop(0);
        setRight(measuredWidth);
        setBottom(measuredHeight);
        super.onLayout(z5, 0, 0, measuredWidth, measuredHeight);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i10) {
        jj1 jj1VarA = this.f40991b.a(i, i10);
        super.onMeasure(jj1VarA.f39877a, jj1VarA.f39878b);
    }

    public final void setColor(int i) {
        if (this.f40993d.getColor() != i) {
            this.f40993d.setColor(i);
            requestLayout();
        }
    }
}
