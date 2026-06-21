package ic;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import com.google.android.gms.internal.measurement.j4;
import com.google.android.material.textfield.TextInputLayout;
import com.vk.api.sdk.exceptions.VKApiCodes;
import g2.n0;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public CharSequence A;
    public CharSequence B;
    public boolean C;
    public Bitmap E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public int K;
    public int[] L;
    public boolean M;
    public final TextPaint N;
    public final TextPaint O;
    public TimeInterpolator P;
    public TimeInterpolator Q;
    public float R;
    public float S;
    public float T;
    public ColorStateList U;
    public float V;
    public float W;
    public float X;
    public StaticLayout Y;
    public float Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextInputLayout f21229a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public float f21230a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f21231b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public float f21232b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f21233c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public CharSequence f21234c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f21235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RectF f21237e;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ColorStateList f21243j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ColorStateList f21244k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f21245l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f21246m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f21247n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f21248o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f21249p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f21250q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Typeface f21251r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Typeface f21252s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Typeface f21253t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Typeface f21254u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Typeface f21255v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Typeface f21256w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Typeface f21257x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public kc.a f21258y;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f21239f = 16;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f21241g = 16;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f21242h = 15.0f;
    public float i = 15.0f;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final TextUtils.TruncateAt f21259z = TextUtils.TruncateAt.END;
    public final boolean D = true;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final int f21236d0 = 1;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final float f21238e0 = 1.0f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final int f21240f0 = 1;

    public b(TextInputLayout textInputLayout) {
        this.f21229a = textInputLayout;
        TextPaint textPaint = new TextPaint(VKApiCodes.CODE_INVALID_PHOTO_FORMAT);
        this.N = textPaint;
        this.O = new TextPaint(textPaint);
        this.f21235d = new Rect();
        this.f21233c = new Rect();
        this.f21237e = new RectF();
        g(textInputLayout.getContext().getResources().getConfiguration());
    }

    public static int a(float f10, int i, int i10) {
        float f11 = 1.0f - f10;
        return Color.argb(Math.round((Color.alpha(i10) * f10) + (Color.alpha(i) * f11)), Math.round((Color.red(i10) * f10) + (Color.red(i) * f11)), Math.round((Color.green(i10) * f10) + (Color.green(i) * f11)), Math.round((Color.blue(i10) * f10) + (Color.blue(i) * f11)));
    }

    public static float f(float f10, float f11, float f12, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        return wb.a.a(f10, f11, f12);
    }

    public final boolean b(CharSequence charSequence) {
        Field field = n0.f19900a;
        boolean z5 = this.f21229a.getLayoutDirection() == 1;
        if (this.D) {
            return (z5 ? e2.f.f16031d : e2.f.f16030c).f(charSequence, charSequence.length());
        }
        return z5;
    }

    public final void c(float f10, boolean z5) {
        float f11;
        float f12;
        Typeface typeface;
        boolean z10;
        Layout.Alignment alignment;
        if (this.A == null) {
            return;
        }
        float fWidth = this.f21235d.width();
        float fWidth2 = this.f21233c.width();
        if (Math.abs(f10 - 1.0f) < 1.0E-5f) {
            f11 = this.i;
            f12 = this.V;
            this.F = 1.0f;
            typeface = this.f21251r;
        } else {
            float f13 = this.f21242h;
            float f14 = this.W;
            Typeface typeface2 = this.f21254u;
            if (Math.abs(f10 - 0.0f) < 1.0E-5f) {
                this.F = 1.0f;
            } else {
                this.F = f(this.f21242h, this.i, f10, this.Q) / this.f21242h;
            }
            float f15 = this.i / this.f21242h;
            fWidth = (!z5 && fWidth2 * f15 > fWidth) ? Math.min(fWidth / f15, fWidth2) : fWidth2;
            f11 = f13;
            f12 = f14;
            typeface = typeface2;
        }
        TextPaint textPaint = this.N;
        if (fWidth > 0.0f) {
            boolean z11 = this.G != f11;
            boolean z12 = this.X != f12;
            boolean z13 = this.f21257x != typeface;
            StaticLayout staticLayout = this.Y;
            boolean z14 = z11 || z12 || (staticLayout != null && (fWidth > ((float) staticLayout.getWidth()) ? 1 : (fWidth == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z13 || this.M;
            this.G = f11;
            this.X = f12;
            this.f21257x = typeface;
            this.M = false;
            textPaint.setLinearText(this.F != 1.0f);
            z10 = z14;
        } else {
            z10 = false;
        }
        if (this.B == null || z10) {
            textPaint.setTextSize(this.G);
            textPaint.setTypeface(this.f21257x);
            textPaint.setLetterSpacing(this.X);
            boolean zB = b(this.A);
            this.C = zB;
            int i = this.f21236d0;
            if (i <= 1 || zB) {
                i = 1;
            }
            if (i == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f21239f, zB ? 1 : 0) & 7;
                alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.C ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.C ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
            }
            g gVar = new g(this.A, textPaint, (int) fWidth);
            gVar.f21277k = this.f21259z;
            gVar.f21276j = zB;
            gVar.f21272e = alignment;
            gVar.i = false;
            gVar.f21273f = i;
            gVar.f21274g = this.f21238e0;
            gVar.f21275h = this.f21240f0;
            StaticLayout staticLayoutA = gVar.a();
            staticLayoutA.getClass();
            this.Y = staticLayoutA;
            this.B = staticLayoutA.getText();
        }
    }

    public final float d() {
        float f10 = this.i;
        TextPaint textPaint = this.O;
        textPaint.setTextSize(f10);
        textPaint.setTypeface(this.f21251r);
        textPaint.setLetterSpacing(this.V);
        return -textPaint.ascent();
    }

    public final int e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f21253t;
            if (typeface != null) {
                this.f21252s = j4.r(configuration, typeface);
            }
            Typeface typeface2 = this.f21256w;
            if (typeface2 != null) {
                this.f21255v = j4.r(configuration, typeface2);
            }
            Typeface typeface3 = this.f21252s;
            if (typeface3 == null) {
                typeface3 = this.f21253t;
            }
            this.f21251r = typeface3;
            Typeface typeface4 = this.f21255v;
            if (typeface4 == null) {
                typeface4 = this.f21256w;
            }
            this.f21254u = typeface4;
            h(true);
        }
    }

    public final void h(boolean z5) {
        float fMeasureText;
        StaticLayout staticLayout;
        TextInputLayout textInputLayout = this.f21229a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z5) {
            return;
        }
        c(1.0f, z5);
        CharSequence charSequence = this.B;
        TextPaint textPaint = this.N;
        if (charSequence != null && (staticLayout = this.Y) != null) {
            this.f21234c0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f21259z);
        }
        CharSequence charSequence2 = this.f21234c0;
        if (charSequence2 != null) {
            this.Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.Z = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f21241g, this.C ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.f21235d;
        if (i == 48) {
            this.f21246m = rect.top;
        } else if (i != 80) {
            this.f21246m = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f21246m = textPaint.ascent() + rect.bottom;
        }
        int i10 = absoluteGravity & 8388615;
        if (i10 == 1) {
            this.f21248o = rect.centerX() - (this.Z / 2.0f);
        } else if (i10 != 5) {
            this.f21248o = rect.left;
        } else {
            this.f21248o = rect.right - this.Z;
        }
        c(0.0f, z5);
        float height = this.Y != null ? r1.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.Y;
        if (staticLayout2 == null || this.f21236d0 <= 1) {
            CharSequence charSequence3 = this.B;
            fMeasureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            fMeasureText = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.Y;
        if (staticLayout3 != null) {
            staticLayout3.getLineCount();
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f21239f, this.C ? 1 : 0);
        int i11 = absoluteGravity2 & 112;
        Rect rect2 = this.f21233c;
        if (i11 == 48) {
            this.f21245l = rect2.top;
        } else if (i11 != 80) {
            this.f21245l = rect2.centerY() - (height / 2.0f);
        } else {
            this.f21245l = textPaint.descent() + (rect2.bottom - height);
        }
        int i12 = absoluteGravity2 & 8388615;
        if (i12 == 1) {
            this.f21247n = rect2.centerX() - (fMeasureText / 2.0f);
        } else if (i12 != 5) {
            this.f21247n = rect2.left;
        } else {
            this.f21247n = rect2.right - fMeasureText;
        }
        Bitmap bitmap = this.E;
        if (bitmap != null) {
            bitmap.recycle();
            this.E = null;
        }
        l(this.f21231b);
        float f10 = this.f21231b;
        float f11 = f(rect2.left, rect.left, f10, this.P);
        RectF rectF = this.f21237e;
        rectF.left = f11;
        rectF.top = f(this.f21245l, this.f21246m, f10, this.P);
        rectF.right = f(rect2.right, rect.right, f10, this.P);
        rectF.bottom = f(rect2.bottom, rect.bottom, f10, this.P);
        this.f21249p = f(this.f21247n, this.f21248o, f10, this.P);
        this.f21250q = f(this.f21245l, this.f21246m, f10, this.P);
        l(f10);
        c3.a aVar = wb.a.f35219b;
        this.f21230a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f10, aVar);
        Field field = n0.f19900a;
        textInputLayout.postInvalidateOnAnimation();
        this.f21232b0 = f(1.0f, 0.0f, f10, aVar);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f21244k;
        ColorStateList colorStateList2 = this.f21243j;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(f10, e(colorStateList2), e(this.f21244k)));
        } else {
            textPaint.setColor(e(colorStateList));
        }
        float f12 = this.V;
        float f13 = this.W;
        if (f12 != f13) {
            textPaint.setLetterSpacing(f(f13, f12, f10, aVar));
        } else {
            textPaint.setLetterSpacing(f12);
        }
        this.H = wb.a.a(0.0f, this.R, f10);
        this.I = wb.a.a(0.0f, this.S, f10);
        this.J = wb.a.a(0.0f, this.T, f10);
        int iA = a(f10, 0, e(this.U));
        this.K = iA;
        textPaint.setShadowLayer(this.H, this.I, this.J, iA);
        textInputLayout.postInvalidateOnAnimation();
    }

    public final void i(ColorStateList colorStateList) {
        if (this.f21244k == colorStateList && this.f21243j == colorStateList) {
            return;
        }
        this.f21244k = colorStateList;
        this.f21243j = colorStateList;
        h(false);
    }

    public final boolean j(Typeface typeface) {
        kc.a aVar = this.f21258y;
        if (aVar != null) {
            aVar.f27355j = true;
        }
        if (this.f21253t == typeface) {
            return false;
        }
        this.f21253t = typeface;
        Typeface typefaceR = j4.r(this.f21229a.getContext().getResources().getConfiguration(), typeface);
        this.f21252s = typefaceR;
        if (typefaceR == null) {
            typefaceR = this.f21253t;
        }
        this.f21251r = typefaceR;
        return true;
    }

    public final void k(float f10) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        } else if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (f10 != this.f21231b) {
            this.f21231b = f10;
            float f11 = this.f21233c.left;
            Rect rect = this.f21235d;
            float f12 = f(f11, rect.left, f10, this.P);
            RectF rectF = this.f21237e;
            rectF.left = f12;
            rectF.top = f(this.f21245l, this.f21246m, f10, this.P);
            rectF.right = f(r1.right, rect.right, f10, this.P);
            rectF.bottom = f(r1.bottom, rect.bottom, f10, this.P);
            this.f21249p = f(this.f21247n, this.f21248o, f10, this.P);
            this.f21250q = f(this.f21245l, this.f21246m, f10, this.P);
            l(f10);
            c3.a aVar = wb.a.f35219b;
            this.f21230a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f10, aVar);
            Field field = n0.f19900a;
            TextInputLayout textInputLayout = this.f21229a;
            textInputLayout.postInvalidateOnAnimation();
            this.f21232b0 = f(1.0f, 0.0f, f10, aVar);
            textInputLayout.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.f21244k;
            ColorStateList colorStateList2 = this.f21243j;
            TextPaint textPaint = this.N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(f10, e(colorStateList2), e(this.f21244k)));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f13 = this.V;
            float f14 = this.W;
            if (f13 != f14) {
                textPaint.setLetterSpacing(f(f14, f13, f10, aVar));
            } else {
                textPaint.setLetterSpacing(f13);
            }
            this.H = wb.a.a(0.0f, this.R, f10);
            this.I = wb.a.a(0.0f, this.S, f10);
            this.J = wb.a.a(0.0f, this.T, f10);
            int iA = a(f10, 0, e(this.U));
            this.K = iA;
            textPaint.setShadowLayer(this.H, this.I, this.J, iA);
            textInputLayout.postInvalidateOnAnimation();
        }
    }

    public final void l(float f10) {
        c(f10, false);
        Field field = n0.f19900a;
        this.f21229a.postInvalidateOnAnimation();
    }

    public final void m(Typeface typeface) {
        boolean z5;
        boolean zJ = j(typeface);
        if (this.f21256w != typeface) {
            this.f21256w = typeface;
            Typeface typefaceR = j4.r(this.f21229a.getContext().getResources().getConfiguration(), typeface);
            this.f21255v = typefaceR;
            if (typefaceR == null) {
                typefaceR = this.f21256w;
            }
            this.f21254u = typefaceR;
            z5 = true;
        } else {
            z5 = false;
        }
        if (zJ || z5) {
            h(false);
        }
    }
}
