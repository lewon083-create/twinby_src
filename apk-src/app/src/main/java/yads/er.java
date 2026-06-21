package yads;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class er extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f38241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f38242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f38243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f38244d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f38245e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f38246f;

    public er(Context context, pg0 pg0Var) {
        super(context);
        pg0Var.getClass();
        this.f38241a = pg0.a(context, 34.0f);
        float fA = pg0.a(context, 3.0f);
        this.f38242b = fA;
        float fA2 = pg0.a(context, 20.0f);
        Paint paint = new Paint();
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f38243c = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(fA);
        paint2.setAntiAlias(true);
        this.f38244d = paint2;
        Paint paint3 = new Paint();
        paint3.setStyle(style);
        paint3.setTextSize(fA2);
        paint3.setTextAlign(Paint.Align.CENTER);
        this.f38245e = paint3;
        this.f38246f = 40.0f;
        a();
    }

    public final void a() {
        this.f38244d.setColor(nl3.a(-65536, this.f38246f));
        this.f38243c.setColor(nl3.a(-1, this.f38246f));
        this.f38245e.setColor(nl3.a(-65536, this.f38246f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f10 = 2;
        float f11 = this.f38241a / f10;
        canvas.drawCircle(f11, f11, f11, this.f38243c);
        canvas.drawCircle(f11, f11, f11 - (this.f38242b / f10), this.f38244d);
        float f12 = this.f38241a / f10;
        canvas.drawText("!", f12, f12 - ((this.f38245e.ascent() + this.f38245e.descent()) / f10), this.f38245e);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i10) {
        int i11 = (int) this.f38241a;
        setMeasuredDimension(i11, i11);
    }

    @Override // android.view.View
    public void setSelected(boolean z5) {
        super.setSelected(z5);
        this.f38246f = z5 ? 0.0f : 40.0f;
        a();
        invalidate();
    }
}
