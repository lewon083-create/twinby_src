package dc;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.gms.internal.ads.xj0;
import com.google.android.material.chip.Chip;
import ic.h;
import ic.i;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import k6.t0;
import kotlin.KotlinVersion;
import nc.g;
import nc.j;
import nc.k;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends g implements Drawable.Callback, h {
    public static final int[] G0 = {R.attr.state_enabled};
    public static final ShapeDrawable H0 = new ShapeDrawable(new OvalShape());
    public float A;
    public ColorStateList A0;
    public float B;
    public WeakReference B0;
    public ColorStateList C;
    public TextUtils.TruncateAt C0;
    public float D;
    public boolean D0;
    public ColorStateList E;
    public int E0;
    public CharSequence F;
    public boolean F0;
    public boolean G;
    public Drawable H;
    public ColorStateList I;
    public float J;
    public boolean K;
    public boolean L;
    public Drawable M;
    public RippleDrawable N;
    public ColorStateList O;
    public float P;
    public SpannableStringBuilder Q;
    public boolean R;
    public boolean S;
    public Drawable T;
    public ColorStateList U;
    public wb.b V;
    public wb.b W;
    public float X;
    public float Y;
    public float Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public float f15742a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public float f15743b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public float f15744c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public float f15745d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public float f15746e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final Context f15747f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final Paint f15748g0;
    public final Paint.FontMetrics h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final RectF f15749i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final PointF f15750j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final Path f15751k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final i f15752l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public int f15753m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int f15754n0;
    public int o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f15755p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f15756q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f15757r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f15758s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f15759t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f15760u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public ColorFilter f15761v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public PorterDuffColorFilter f15762w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public ColorStateList f15763x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ColorStateList f15764y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public PorterDuff.Mode f15765y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ColorStateList f15766z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public int[] f15767z0;

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.twinby.R.attr.chipStyle, 2131887162);
        this.B = -1.0f;
        this.f15748g0 = new Paint(1);
        this.h0 = new Paint.FontMetrics();
        this.f15749i0 = new RectF();
        this.f15750j0 = new PointF();
        this.f15751k0 = new Path();
        this.f15760u0 = KotlinVersion.MAX_COMPONENT_VALUE;
        this.f15765y0 = PorterDuff.Mode.SRC_IN;
        this.B0 = new WeakReference(null);
        h(context);
        this.f15747f0 = context;
        i iVar = new i(this);
        this.f15752l0 = iVar;
        this.F = "";
        iVar.f21278a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = G0;
        setState(iArr);
        if (!Arrays.equals(this.f15767z0, iArr)) {
            this.f15767z0 = iArr;
            if (T()) {
                v(getState(), iArr);
            }
        }
        this.D0 = true;
        int[] iArr2 = lc.a.f28102a;
        H0.setTint(-1);
    }

    public static void U(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean s(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean t(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final void A(float f10) {
        if (this.B != f10) {
            this.B = f10;
            j jVarE = this.f29225b.f29209a.e();
            jVarE.f29251e = new nc.a(f10);
            jVarE.f29252f = new nc.a(f10);
            jVarE.f29253g = new nc.a(f10);
            jVarE.f29254h = new nc.a(f10);
            setShapeAppearanceModel(jVarE.a());
        }
    }

    public final void B(Drawable drawable) {
        Drawable drawable2 = this.H;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fP = p();
            this.H = drawable != null ? drawable.mutate() : null;
            float fP2 = p();
            U(drawable2);
            if (S()) {
                n(this.H);
            }
            invalidateSelf();
            if (fP != fP2) {
                u();
            }
        }
    }

    public final void C(float f10) {
        if (this.J != f10) {
            float fP = p();
            this.J = f10;
            float fP2 = p();
            invalidateSelf();
            if (fP != fP2) {
                u();
            }
        }
    }

    public final void D(ColorStateList colorStateList) {
        this.K = true;
        if (this.I != colorStateList) {
            this.I = colorStateList;
            if (S()) {
                this.H.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void E(boolean z5) {
        if (this.G != z5) {
            boolean zS = S();
            this.G = z5;
            boolean zS2 = S();
            if (zS != zS2) {
                if (zS2) {
                    n(this.H);
                } else {
                    U(this.H);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void F(ColorStateList colorStateList) {
        if (this.C != colorStateList) {
            this.C = colorStateList;
            if (this.F0) {
                nc.f fVar = this.f29225b;
                if (fVar.f29212d != colorStateList) {
                    fVar.f29212d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void G(float f10) {
        if (this.D != f10) {
            this.D = f10;
            this.f15748g0.setStrokeWidth(f10);
            if (this.F0) {
                this.f29225b.f29217j = f10;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public final void H(Drawable drawable) {
        Drawable drawable2 = this.M;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fQ = q();
            this.M = drawable != null ? drawable.mutate() : null;
            int[] iArr = lc.a.f28102a;
            this.N = new RippleDrawable(lc.a.a(this.E), this.M, H0);
            float fQ2 = q();
            U(drawable2);
            if (T()) {
                n(this.M);
            }
            invalidateSelf();
            if (fQ != fQ2) {
                u();
            }
        }
    }

    public final void I(float f10) {
        if (this.f15745d0 != f10) {
            this.f15745d0 = f10;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void J(float f10) {
        if (this.P != f10) {
            this.P = f10;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void K(float f10) {
        if (this.f15744c0 != f10) {
            this.f15744c0 = f10;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void L(ColorStateList colorStateList) {
        if (this.O != colorStateList) {
            this.O = colorStateList;
            if (T()) {
                this.M.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void M(boolean z5) {
        if (this.L != z5) {
            boolean zT = T();
            this.L = z5;
            boolean zT2 = T();
            if (zT != zT2) {
                if (zT2) {
                    n(this.M);
                } else {
                    U(this.M);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void N(float f10) {
        if (this.Z != f10) {
            float fP = p();
            this.Z = f10;
            float fP2 = p();
            invalidateSelf();
            if (fP != fP2) {
                u();
            }
        }
    }

    public final void O(float f10) {
        if (this.Y != f10) {
            float fP = p();
            this.Y = f10;
            float fP2 = p();
            invalidateSelf();
            if (fP != fP2) {
                u();
            }
        }
    }

    public final void P(ColorStateList colorStateList) {
        if (this.E != colorStateList) {
            this.E = colorStateList;
            this.A0 = null;
            onStateChange(getState());
        }
    }

    public final void Q(kc.d dVar) {
        i iVar = this.f15752l0;
        b bVar = iVar.f21279b;
        TextPaint textPaint = iVar.f21278a;
        if (iVar.f21283f != dVar) {
            iVar.f21283f = dVar;
            if (dVar != null) {
                Context context = this.f15747f0;
                dVar.f(context, textPaint, bVar);
                h hVar = (h) iVar.f21282e.get();
                if (hVar != null) {
                    textPaint.drawableState = hVar.getState();
                }
                dVar.e(context, textPaint, bVar);
                iVar.f21281d = true;
            }
            h hVar2 = (h) iVar.f21282e.get();
            if (hVar2 != null) {
                f fVar = (f) hVar2;
                fVar.u();
                fVar.invalidateSelf();
                fVar.onStateChange(hVar2.getState());
            }
        }
    }

    public final boolean R() {
        return this.S && this.T != null && this.f15758s0;
    }

    public final boolean S() {
        return this.G && this.H != null;
    }

    public final boolean T() {
        return this.L && this.M != null;
    }

    @Override // nc.g, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2;
        int iSaveLayerAlpha;
        float fMeasureText;
        int i10;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.f15760u0) == 0) {
            return;
        }
        if (i < 255) {
            canvas2 = canvas;
            iSaveLayerAlpha = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i);
        } else {
            canvas2 = canvas;
            iSaveLayerAlpha = 0;
        }
        boolean z5 = this.F0;
        Paint paint = this.f15748g0;
        RectF rectF = this.f15749i0;
        if (!z5) {
            paint.setColor(this.f15753m0);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, r(), r(), paint);
        }
        if (!this.F0) {
            paint.setColor(this.f15754n0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f15761v0;
            if (colorFilter == null) {
                colorFilter = this.f15762w0;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, r(), r(), paint);
        }
        if (this.F0) {
            super.draw(canvas);
        }
        if (this.D > 0.0f && !this.F0) {
            paint.setColor(this.f15755p0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.F0) {
                ColorFilter colorFilter2 = this.f15761v0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f15762w0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f10 = bounds.left;
            float f11 = this.D / 2.0f;
            rectF.set(f10 + f11, bounds.top + f11, bounds.right - f11, bounds.bottom - f11);
            float f12 = this.B - (this.D / 2.0f);
            canvas2.drawRoundRect(rectF, f12, f12, paint);
        }
        paint.setColor(this.f15756q0);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.F0) {
            RectF rectF2 = new RectF(bounds);
            nc.f fVar = this.f29225b;
            k kVar = fVar.f29209a;
            float f13 = fVar.i;
            t0 t0Var = this.f29240r;
            xj0 xj0Var = this.f29241s;
            Path path = this.f15751k0;
            xj0Var.b(kVar, f13, rectF2, t0Var, path);
            d(canvas2, paint, path, this.f29225b.f29209a, f());
        } else {
            canvas2.drawRoundRect(rectF, r(), r(), paint);
        }
        if (S()) {
            o(bounds, rectF);
            float f14 = rectF.left;
            float f15 = rectF.top;
            canvas2.translate(f14, f15);
            this.H.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.H.draw(canvas2);
            canvas2.translate(-f14, -f15);
        }
        if (R()) {
            o(bounds, rectF);
            float f16 = rectF.left;
            float f17 = rectF.top;
            canvas2.translate(f16, f17);
            this.T.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.T.draw(canvas2);
            canvas2.translate(-f16, -f17);
        }
        if (this.D0 && this.F != null) {
            PointF pointF = this.f15750j0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.F;
            i iVar = this.f15752l0;
            if (charSequence != null) {
                float fP = p() + this.X + this.f15742a0;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + fP;
                } else {
                    pointF.x = bounds.right - fP;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = iVar.f21278a;
                Paint.FontMetrics fontMetrics = this.h0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF.setEmpty();
            if (this.F != null) {
                float fP2 = p() + this.X + this.f15742a0;
                float fQ = q() + this.f15746e0 + this.f15743b0;
                if (getLayoutDirection() == 0) {
                    rectF.left = bounds.left + fP2;
                    rectF.right = bounds.right - fQ;
                } else {
                    rectF.left = bounds.left + fQ;
                    rectF.right = bounds.right - fP2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            kc.d dVar = iVar.f21283f;
            TextPaint textPaint2 = iVar.f21278a;
            if (dVar != null) {
                textPaint2.drawableState = getState();
                iVar.f21283f.e(this.f15747f0, textPaint2, iVar.f21279b);
            }
            textPaint2.setTextAlign(align);
            String string = this.F.toString();
            if (iVar.f21281d) {
                fMeasureText = string == null ? 0.0f : textPaint2.measureText((CharSequence) string, 0, string.length());
                iVar.f21280c = fMeasureText;
                iVar.f21281d = false;
            } else {
                fMeasureText = iVar.f21280c;
            }
            boolean z10 = Math.round(fMeasureText) > Math.round(rectF.width());
            if (z10) {
                int iSave = canvas2.save();
                canvas2.clipRect(rectF);
                i10 = iSave;
            } else {
                i10 = 0;
            }
            CharSequence charSequenceEllipsize = this.F;
            if (z10 && this.C0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF.width(), this.C0);
            }
            canvas.drawText(charSequenceEllipsize, 0, charSequenceEllipsize.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z10) {
                canvas2.restoreToCount(i10);
            }
        }
        if (T()) {
            rectF.setEmpty();
            if (T()) {
                float f18 = this.f15746e0 + this.f15745d0;
                if (getLayoutDirection() == 0) {
                    float f19 = bounds.right - f18;
                    rectF.right = f19;
                    rectF.left = f19 - this.P;
                } else {
                    float f20 = bounds.left + f18;
                    rectF.left = f20;
                    rectF.right = f20 + this.P;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f21 = this.P;
                float f22 = fExactCenterY - (f21 / 2.0f);
                rectF.top = f22;
                rectF.bottom = f22 + f21;
            }
            float f23 = rectF.left;
            float f24 = rectF.top;
            canvas2.translate(f23, f24);
            this.M.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            int[] iArr = lc.a.f28102a;
            this.N.setBounds(this.M.getBounds());
            this.N.jumpToCurrentState();
            this.N.draw(canvas2);
            canvas2.translate(-f23, -f24);
        }
        if (this.f15760u0 < 255) {
            canvas2.restoreToCount(iSaveLayerAlpha);
        }
    }

    @Override // nc.g, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f15760u0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f15761v0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.A;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float fMeasureText;
        float fP = p() + this.X + this.f15742a0;
        String string = this.F.toString();
        i iVar = this.f15752l0;
        if (iVar.f21281d) {
            fMeasureText = string == null ? 0.0f : iVar.f21278a.measureText((CharSequence) string, 0, string.length());
            iVar.f21280c = fMeasureText;
            iVar.f21281d = false;
        } else {
            fMeasureText = iVar.f21280c;
        }
        return Math.min(Math.round(q() + fMeasureText + fP + this.f15743b0 + this.f15746e0), this.E0);
    }

    @Override // nc.g, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // nc.g, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.F0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.A, this.B);
        } else {
            outline.setRoundRect(bounds, this.B);
            outline2 = outline;
        }
        outline2.setAlpha(this.f15760u0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // nc.g, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (s(this.f15764y) || s(this.f15766z) || s(this.C)) {
            return true;
        }
        kc.d dVar = this.f15752l0.f21283f;
        if (dVar == null || (colorStateList = dVar.f27369j) == null || !colorStateList.isStateful()) {
            return (this.S && this.T != null && this.R) || t(this.H) || t(this.T) || s(this.f15763x0);
        }
        return true;
    }

    public final void n(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.M) {
            if (drawable.isStateful()) {
                drawable.setState(this.f15767z0);
            }
            drawable.setTintList(this.O);
            return;
        }
        Drawable drawable2 = this.H;
        if (drawable == drawable2 && this.K) {
            drawable2.setTintList(this.I);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void o(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (S() || R()) {
            float f10 = this.X + this.Y;
            Drawable drawable = this.f15758s0 ? this.T : this.H;
            float intrinsicWidth = this.J;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (getLayoutDirection() == 0) {
                float f11 = rect.left + f10;
                rectF.left = f11;
                rectF.right = f11 + intrinsicWidth;
            } else {
                float f12 = rect.right - f10;
                rectF.right = f12;
                rectF.left = f12 - intrinsicWidth;
            }
            Drawable drawable2 = this.f15758s0 ? this.T : this.H;
            float fCeil = this.J;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.f15747f0.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (S()) {
            zOnLayoutDirectionChanged |= this.H.setLayoutDirection(i);
        }
        if (R()) {
            zOnLayoutDirectionChanged |= this.T.setLayoutDirection(i);
        }
        if (T()) {
            zOnLayoutDirectionChanged |= this.M.setLayoutDirection(i);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        if (S()) {
            zOnLevelChange |= this.H.setLevel(i);
        }
        if (R()) {
            zOnLevelChange |= this.T.setLevel(i);
        }
        if (T()) {
            zOnLevelChange |= this.M.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // nc.g, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.F0) {
            super.onStateChange(iArr);
        }
        return v(iArr, this.f15767z0);
    }

    public final float p() {
        if (!S() && !R()) {
            return 0.0f;
        }
        float f10 = this.Y;
        Drawable drawable = this.f15758s0 ? this.T : this.H;
        float intrinsicWidth = this.J;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f10 + this.Z;
    }

    public final float q() {
        if (T()) {
            return this.f15744c0 + this.P + this.f15745d0;
        }
        return 0.0f;
    }

    public final float r() {
        return this.F0 ? this.f29225b.f29209a.f29262e.a(f()) : this.B;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j10);
        }
    }

    @Override // nc.g, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f15760u0 != i) {
            this.f15760u0 = i;
            invalidateSelf();
        }
    }

    @Override // nc.g, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f15761v0 != colorFilter) {
            this.f15761v0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // nc.g, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f15763x0 != colorStateList) {
            this.f15763x0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // nc.g, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f15765y0 != mode) {
            this.f15765y0 = mode;
            ColorStateList colorStateList = this.f15763x0;
            this.f15762w0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z5, boolean z10) {
        boolean visible = super.setVisible(z5, z10);
        if (S()) {
            visible |= this.H.setVisible(z5, z10);
        }
        if (R()) {
            visible |= this.T.setVisible(z5, z10);
        }
        if (T()) {
            visible |= this.M.setVisible(z5, z10);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void u() {
        e eVar = (e) this.B0.get();
        if (eVar != null) {
            Chip chip = (Chip) eVar;
            chip.c(chip.f14551q);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final boolean v(int[] iArr, int[] iArr2) {
        boolean z5;
        boolean z10;
        ColorStateList colorStateList;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f15764y;
        int iB = b(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f15753m0) : 0);
        boolean state = true;
        if (this.f15753m0 != iB) {
            this.f15753m0 = iB;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.f15766z;
        int iB2 = b(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f15754n0) : 0);
        if (this.f15754n0 != iB2) {
            this.f15754n0 = iB2;
            zOnStateChange = true;
        }
        int iC = x1.a.c(iB2, iB);
        if ((this.o0 != iC) | (this.f29225b.f29211c == null)) {
            this.o0 = iC;
            j(ColorStateList.valueOf(iC));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.C;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f15755p0) : 0;
        if (this.f15755p0 != colorForState) {
            this.f15755p0 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.A0 == null || !lc.a.b(iArr)) ? 0 : this.A0.getColorForState(iArr, this.f15756q0);
        if (this.f15756q0 != colorForState2) {
            this.f15756q0 = colorForState2;
        }
        kc.d dVar = this.f15752l0.f21283f;
        int colorForState3 = (dVar == null || (colorStateList = dVar.f27369j) == null) ? 0 : colorStateList.getColorForState(iArr, this.f15757r0);
        if (this.f15757r0 != colorForState3) {
            this.f15757r0 = colorForState3;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 == null) {
            z5 = false;
        } else {
            int length = state2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (state2[i] != 16842912) {
                    i++;
                } else if (this.R) {
                    z5 = true;
                }
            }
            z5 = false;
        }
        if (this.f15758s0 == z5 || this.T == null) {
            z10 = false;
        } else {
            float fP = p();
            this.f15758s0 = z5;
            if (fP != p()) {
                zOnStateChange = true;
                z10 = true;
            } else {
                z10 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.f15763x0;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.f15759t0) : 0;
        if (this.f15759t0 != colorForState4) {
            this.f15759t0 = colorForState4;
            ColorStateList colorStateList6 = this.f15763x0;
            PorterDuff.Mode mode = this.f15765y0;
            this.f15762w0 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            state = zOnStateChange;
        }
        if (t(this.H)) {
            state |= this.H.setState(iArr);
        }
        if (t(this.T)) {
            state |= this.T.setState(iArr);
        }
        if (t(this.M)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.M.setState(iArr3);
        }
        int[] iArr4 = lc.a.f28102a;
        if (t(this.N)) {
            state |= this.N.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z10) {
            u();
        }
        return state;
    }

    public final void w(boolean z5) {
        if (this.R != z5) {
            this.R = z5;
            float fP = p();
            if (!z5 && this.f15758s0) {
                this.f15758s0 = false;
            }
            float fP2 = p();
            invalidateSelf();
            if (fP != fP2) {
                u();
            }
        }
    }

    public final void x(Drawable drawable) {
        if (this.T != drawable) {
            float fP = p();
            this.T = drawable;
            float fP2 = p();
            U(this.T);
            n(this.T);
            invalidateSelf();
            if (fP != fP2) {
                u();
            }
        }
    }

    public final void y(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.U != colorStateList) {
            this.U = colorStateList;
            if (this.S && (drawable = this.T) != null && this.R) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void z(boolean z5) {
        if (this.S != z5) {
            boolean zR = R();
            this.S = z5;
            boolean zR2 = R();
            if (zR != zR2) {
                if (zR2) {
                    n(this.T);
                } else {
                    U(this.T);
                }
                invalidateSelf();
                u();
            }
        }
    }
}
