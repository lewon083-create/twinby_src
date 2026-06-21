package kc;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.d4;
import com.google.android.gms.internal.measurement.j4;
import w1.j;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorStateList f27361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f27362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f27363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f27364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f27365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f27366f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f27367g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f27368h;
    public final float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ColorStateList f27369j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f27370k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f27371l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f27372m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Typeface f27373n;

    public d(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, vb.a.f34828t);
        this.f27370k = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.f27369j = b4.u(context, typedArrayObtainStyledAttributes, 3);
        b4.u(context, typedArrayObtainStyledAttributes, 4);
        b4.u(context, typedArrayObtainStyledAttributes, 5);
        this.f27363c = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.f27364d = typedArrayObtainStyledAttributes.getInt(1, 1);
        int i10 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f27371l = typedArrayObtainStyledAttributes.getResourceId(i10, 0);
        this.f27362b = typedArrayObtainStyledAttributes.getString(i10);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.f27361a = b4.u(context, typedArrayObtainStyledAttributes, 6);
        this.f27365e = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.f27366f = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.f27367g = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, vb.a.f34821m);
        this.f27368h = typedArrayObtainStyledAttributes2.hasValue(0);
        this.i = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f27373n;
        int i = this.f27363c;
        if (typeface == null && (str = this.f27362b) != null) {
            this.f27373n = Typeface.create(str, i);
        }
        if (this.f27373n == null) {
            int i10 = this.f27364d;
            if (i10 == 1) {
                this.f27373n = Typeface.SANS_SERIF;
            } else if (i10 == 2) {
                this.f27373n = Typeface.SERIF;
            } else if (i10 != 3) {
                this.f27373n = Typeface.DEFAULT;
            } else {
                this.f27373n = Typeface.MONOSPACE;
            }
            this.f27373n = Typeface.create(this.f27373n, i);
        }
    }

    public final Typeface b(Context context) {
        if (this.f27372m) {
            return this.f27373n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceA = j.a(context, this.f27371l);
                this.f27373n = typefaceA;
                if (typefaceA != null) {
                    this.f27373n = Typeface.create(typefaceA, this.f27363c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e3) {
                Log.d("TextAppearance", "Error loading font " + this.f27362b, e3);
            }
        }
        a();
        this.f27372m = true;
        return this.f27373n;
    }

    public final void c(Context context, d4 d4Var) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i = this.f27371l;
        if (i == 0) {
            this.f27372m = true;
        }
        if (this.f27372m) {
            d4Var.t(this.f27373n, true);
            return;
        }
        try {
            b bVar = new b(this, d4Var);
            ThreadLocal threadLocal = j.f34987a;
            if (context.isRestricted()) {
                bVar.a(-4);
            } else {
                j.b(context, i, new TypedValue(), 0, bVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f27372m = true;
            d4Var.s(1);
        } catch (Exception e3) {
            Log.d("TextAppearance", "Error loading font " + this.f27362b, e3);
            this.f27372m = true;
            d4Var.s(-3);
        }
    }

    public final boolean d(Context context) throws Exception {
        Typeface typefaceB = null;
        int i = this.f27371l;
        if (i != 0) {
            ThreadLocal threadLocal = j.f34987a;
            if (!context.isRestricted()) {
                typefaceB = j.b(context, i, new TypedValue(), 0, null, false, true);
            }
        }
        return typefaceB != null;
    }

    public final void e(Context context, TextPaint textPaint, d4 d4Var) {
        f(context, textPaint, d4Var);
        ColorStateList colorStateList = this.f27369j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f27361a;
        textPaint.setShadowLayer(this.f27367g, this.f27365e, this.f27366f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(Context context, TextPaint textPaint, d4 d4Var) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f27373n);
        c(context, new c(this, context, textPaint, d4Var));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceR = j4.r(context.getResources().getConfiguration(), typeface);
        if (typefaceR != null) {
            typeface = typefaceR;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f27363c;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f27370k);
        if (this.f27368h) {
            textPaint.setLetterSpacing(this.i);
        }
    }
}
