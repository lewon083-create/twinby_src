package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.twinby.R;
import com.vk.api.sdk.exceptions.VKApiCodes;
import g2.n0;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
class ClockHandView extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ValueAnimator f14726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f14728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14729e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f14730f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f14731g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final RectF f14732h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f14733j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f14734k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public double f14735l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f14736m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f14737n;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.f14726b = new ValueAnimator();
        this.f14728d = new ArrayList();
        Paint paint = new Paint();
        this.f14731g = paint;
        this.f14732h = new RectF();
        this.f14737n = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vb.a.f34813d, R.attr.materialClockStyle, 2131887240);
        ya.e.x(context, R.attr.motionDurationLong2, VKApiCodes.CODE_ACCESS_DENIED_TO_ALBUM);
        ya.e.y(context, R.attr.motionEasingEmphasizedInterpolator, wb.a.f35219b);
        this.f14736m = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f14729e = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.i = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f14730f = r4.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        Field field = n0.f19900a;
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final int a(int i) {
        return i == 2 ? Math.round(this.f14736m * 0.66f) : this.f14736m;
    }

    public final void b(float f10) {
        ValueAnimator valueAnimator = this.f14726b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = f10 % 360.0f;
        this.f14733j = f11;
        this.f14735l = Math.toRadians(f11 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fA = a(this.f14737n);
        float fCos = (((float) Math.cos(this.f14735l)) * fA) + width;
        float fSin = (fA * ((float) Math.sin(this.f14735l))) + height;
        float f12 = this.f14729e;
        this.f14732h.set(fCos - f12, fSin - f12, fCos + f12, fSin + f12);
        Iterator it = this.f14728d.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((d) it.next());
            if (Math.abs(clockFaceView.H - f11) > 0.001f) {
                clockFaceView.H = f11;
                clockFaceView.n();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f10 = width;
        float fA = a(this.f14737n);
        float fCos = (((float) Math.cos(this.f14735l)) * fA) + f10;
        float f11 = height;
        float fSin = (fA * ((float) Math.sin(this.f14735l))) + f11;
        Paint paint = this.f14731g;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f14729e, paint);
        double dSin = Math.sin(this.f14735l);
        paint.setStrokeWidth(this.i);
        canvas.drawLine(f10, f11, width + ((int) (Math.cos(this.f14735l) * d)), height + ((int) (d * dSin)), paint);
        canvas.drawCircle(f10, f11, this.f14730f, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z5, int i, int i10, int i11, int i12) {
        super.onLayout(z5, i, i10, i11, i12);
        if (this.f14726b.isRunning()) {
            return;
        }
        b(this.f14733j);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z5;
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y7 = motionEvent.getY();
        boolean z11 = false;
        if (actionMasked == 0) {
            this.f14734k = false;
            z5 = true;
            z10 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z10 = this.f14734k;
            if (this.f14727c) {
                this.f14737n = ((float) Math.hypot((double) (x10 - ((float) (getWidth() / 2))), (double) (y7 - ((float) (getHeight() / 2))))) <= ((float) a(2)) + TypedValue.applyDimension(1, (float) 12, getContext().getResources().getDisplayMetrics()) ? 2 : 1;
            }
            z5 = false;
        } else {
            z10 = false;
            z5 = false;
        }
        boolean z12 = this.f14734k;
        int degrees = (int) Math.toDegrees(Math.atan2(y7 - (getHeight() / 2), x10 - (getWidth() / 2)));
        int i = degrees + 90;
        if (i < 0) {
            i = degrees + 450;
        }
        float f10 = i;
        boolean z13 = this.f14733j != f10;
        if (z5 && z13) {
            z11 = true;
        } else if (z13 || z10) {
            b(f10);
            z11 = true;
        }
        this.f14734k = z12 | z11;
        return true;
    }
}
