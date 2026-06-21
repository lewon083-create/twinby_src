package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f28224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t2 f28225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t2 f28226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public t2 f28227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public t2 f28228e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t2 f28229f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public t2 f28230g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public t2 f28231h;
    public final r0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f28232j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f28233k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Typeface f28234l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f28235m;

    public h0(TextView textView) {
        this.f28224a = textView;
        this.i = new r0(textView);
    }

    public static t2 c(Context context, q qVar, int i) {
        ColorStateList colorStateListF;
        synchronized (qVar) {
            colorStateListF = qVar.f28339a.f(context, i);
        }
        if (colorStateListF == null) {
            return null;
        }
        t2 t2Var = new t2();
        t2Var.f28366b = true;
        t2Var.f28367c = colorStateListF;
        return t2Var;
    }

    public static void f(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i >= 30) {
            i2.b.a(editorInfo, text);
            return;
        }
        text.getClass();
        if (i >= 30) {
            i2.b.a(editorInfo, text);
            return;
        }
        int i10 = editorInfo.initialSelStart;
        int i11 = editorInfo.initialSelEnd;
        int i12 = i10 > i11 ? i11 : i10;
        if (i10 <= i11) {
            i10 = i11;
        }
        int length = text.length();
        if (i12 < 0 || i10 > length) {
            i2.d.b(editorInfo, null, 0, 0);
            return;
        }
        int i13 = editorInfo.inputType & 4095;
        if (i13 == 129 || i13 == 225 || i13 == 18) {
            i2.d.b(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            i2.d.b(editorInfo, text, i12, i10);
            return;
        }
        int i14 = i10 - i12;
        int i15 = i14 > 1024 ? 0 : i14;
        int i16 = 2048 - i15;
        int iMin = Math.min(text.length() - i10, i16 - Math.min(i12, (int) (((double) i16) * 0.8d)));
        int iMin2 = Math.min(i12, i16 - iMin);
        int i17 = i12 - iMin2;
        if (Character.isLowSurrogate(text.charAt(i17))) {
            i17++;
            iMin2--;
        }
        if (Character.isHighSurrogate(text.charAt((i10 + iMin) - 1))) {
            iMin--;
        }
        int i18 = iMin2 + i15;
        i2.d.b(editorInfo, i15 != i14 ? TextUtils.concat(text.subSequence(i17, i17 + iMin2), text.subSequence(i10, iMin + i10)) : text.subSequence(i17, i18 + iMin + i17), iMin2, i18);
    }

    public final void a(Drawable drawable, t2 t2Var) {
        if (drawable == null || t2Var == null) {
            return;
        }
        q.d(drawable, t2Var, this.f28224a.getDrawableState());
    }

    public final void b() {
        t2 t2Var = this.f28225b;
        TextView textView = this.f28224a;
        if (t2Var != null || this.f28226c != null || this.f28227d != null || this.f28228e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f28225b);
            a(compoundDrawables[1], this.f28226c);
            a(compoundDrawables[2], this.f28227d);
            a(compoundDrawables[3], this.f28228e);
        }
        if (this.f28229f == null && this.f28230g == null) {
            return;
        }
        Drawable[] drawableArrA = d0.a(textView);
        a(drawableArrA[0], this.f28229f);
        a(drawableArrA[2], this.f28230g);
    }

    public final void d(AttributeSet attributeSet, int i) {
        q qVar;
        boolean z5;
        boolean z10;
        String string;
        String string2;
        float f10;
        float fApplyDimension;
        char c8;
        ColorStateList colorStateList;
        int resourceId;
        int i10;
        int resourceId2;
        int[] iArr = h.a.f20299g;
        int[] iArr2 = h.a.f20311t;
        r0 r0Var = this.i;
        TextView textView = this.f28224a;
        Context context = textView.getContext();
        PorterDuff.Mode mode = q.f28337b;
        synchronized (q.class) {
            try {
                if (q.f28338c == null) {
                    q.c();
                }
                qVar = q.f28338c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int[] iArr3 = h.a.f20298f;
        ka.k kVarJ = ka.k.J(context, attributeSet, iArr3, i);
        TextView textView2 = this.f28224a;
        g2.n0.j(textView2, textView2.getContext(), iArr3, attributeSet, (TypedArray) kVarJ.f27325d, i);
        TypedArray typedArray = (TypedArray) kVarJ.f27325d;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f28225b = c(context, qVar, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f28226c = c(context, qVar, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f28227d = c(context, qVar, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f28228e = c(context, qVar, typedArray.getResourceId(2, 0));
        }
        int i11 = Build.VERSION.SDK_INT;
        if (typedArray.hasValue(5)) {
            this.f28229f = c(context, qVar, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f28230g = c(context, qVar, typedArray.getResourceId(6, 0));
        }
        kVarJ.Q();
        boolean z11 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            ka.k kVar = new ka.k(context, typedArrayObtainStyledAttributes);
            if (z11 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z5 = false;
                z10 = false;
            } else {
                z5 = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z10 = true;
            }
            l(context, kVar);
            string2 = typedArrayObtainStyledAttributes.hasValue(15) ? typedArrayObtainStyledAttributes.getString(15) : null;
            string = (i11 < 26 || !typedArrayObtainStyledAttributes.hasValue(13)) ? null : typedArrayObtainStyledAttributes.getString(13);
            kVar.Q();
        } else {
            z5 = false;
            z10 = false;
            string = null;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        ka.k kVar2 = new ka.k(context, typedArrayObtainStyledAttributes2);
        if (!z11 && typedArrayObtainStyledAttributes2.hasValue(14)) {
            z5 = typedArrayObtainStyledAttributes2.getBoolean(14, false);
            z10 = true;
        }
        boolean z12 = z5;
        if (typedArrayObtainStyledAttributes2.hasValue(15)) {
            string2 = typedArrayObtainStyledAttributes2.getString(15);
        }
        if (i11 >= 26 && typedArrayObtainStyledAttributes2.hasValue(13)) {
            string = typedArrayObtainStyledAttributes2.getString(13);
        }
        if (i11 >= 28 && typedArrayObtainStyledAttributes2.hasValue(0) && typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        l(context, kVar2);
        kVar2.Q();
        if (!z11 && z10) {
            this.f28224a.setAllCaps(z12);
        }
        Typeface typeface = this.f28234l;
        if (typeface != null) {
            if (this.f28233k == -1) {
                textView.setTypeface(typeface, this.f28232j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            f0.d(textView, string);
        }
        if (string2 != null) {
            e0.b(textView, e0.a(string2));
        }
        Context context2 = r0Var.f28353j;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr, i, 0);
        TextView textView3 = r0Var.i;
        g2.n0.j(textView3, textView3.getContext(), iArr, attributeSet, typedArrayObtainStyledAttributes3, i);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            r0Var.f28345a = typedArrayObtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(2) ? typedArrayObtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes3.hasValue(1)) {
            fApplyDimension = typedArrayObtainStyledAttributes3.getDimension(1, -1.0f);
            f10 = -1.0f;
        } else {
            f10 = -1.0f;
            fApplyDimension = -1.0f;
        }
        if (!typedArrayObtainStyledAttributes3.hasValue(3) || (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(3, 0)) <= 0) {
            c8 = 3;
        } else {
            c8 = 3;
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i12 = 0; i12 < length; i12++) {
                    iArr4[i12] = typedArrayObtainTypedArray.getDimensionPixelSize(i12, -1);
                }
                r0Var.f28350f = r0.b(iArr4);
                r0Var.i();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!r0Var.j()) {
            r0Var.f28345a = 0;
        } else if (r0Var.f28345a == 1) {
            if (!r0Var.f28351g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == f10) {
                    i10 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i10 = 2;
                }
                if (fApplyDimension == f10) {
                    fApplyDimension = TypedValue.applyDimension(i10, 112.0f, displayMetrics);
                }
                if (dimension == f10) {
                    dimension = 1.0f;
                }
                r0Var.k(dimension2, fApplyDimension, dimension);
            }
            r0Var.h();
        }
        if (k3.f28284a && r0Var.f28345a != 0) {
            int[] iArr5 = r0Var.f28350f;
            if (iArr5.length > 0) {
                if (f0.a(textView) != f10) {
                    f0.b(textView, Math.round(r0Var.f28348d), Math.round(r0Var.f28349e), Math.round(r0Var.f28347c), 0);
                } else {
                    f0.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        Drawable drawableA = resourceId4 != -1 ? qVar.a(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawableA2 = resourceId5 != -1 ? qVar.a(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableA3 = resourceId6 != -1 ? qVar.a(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableA4 = resourceId7 != -1 ? qVar.a(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableA5 = resourceId8 != -1 ? qVar.a(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableA6 = resourceId9 != -1 ? qVar.a(context, resourceId9) : null;
        if (drawableA5 != null || drawableA6 != null) {
            Drawable[] drawableArrA = d0.a(textView);
            if (drawableA5 == null) {
                drawableA5 = drawableArrA[0];
            }
            if (drawableA2 == null) {
                drawableA2 = drawableArrA[1];
            }
            if (drawableA6 == null) {
                drawableA6 = drawableArrA[2];
            }
            if (drawableA4 == null) {
                drawableA4 = drawableArrA[c8];
            }
            d0.b(textView, drawableA5, drawableA2, drawableA6, drawableA4);
        } else if (drawableA != null || drawableA2 != null || drawableA3 != null || drawableA4 != null) {
            Drawable[] drawableArrA2 = d0.a(textView);
            Drawable drawable = drawableArrA2[0];
            if (drawable == null && drawableArrA2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableA == null) {
                    drawableA = compoundDrawables[0];
                }
                if (drawableA2 == null) {
                    drawableA2 = compoundDrawables[1];
                }
                if (drawableA3 == null) {
                    drawableA3 = compoundDrawables[2];
                }
                if (drawableA4 == null) {
                    drawableA4 = compoundDrawables[c8];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableA, drawableA2, drawableA3, drawableA4);
            } else {
                if (drawableA2 == null) {
                    drawableA2 = drawableArrA2[1];
                }
                Drawable drawable2 = drawableArrA2[2];
                if (drawableA4 == null) {
                    drawableA4 = drawableArrA2[c8];
                }
                d0.b(textView, drawable, drawableA2, drawable2, drawableA4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = t1.b.b(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            textView.setCompoundDrawableTintList(colorStateList);
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            textView.setCompoundDrawableTintMode(w0.c(typedArrayObtainStyledAttributes4.getInt(12, -1), null));
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(19, -1);
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize != -1) {
            k3.f.A(textView, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != -1) {
            k3.f.C(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != -1) {
            f2.g.f(dimensionPixelSize3);
            if (dimensionPixelSize3 != textView.getPaint().getFontMetricsInt(null)) {
                textView.setLineSpacing(dimensionPixelSize3 - r0, 1.0f);
            }
        }
    }

    public final void e(Context context, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, h.a.f20311t);
        ka.k kVar = new ka.k(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.f28224a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        int i10 = Build.VERSION.SDK_INT;
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        l(context, kVar);
        if (i10 >= 26 && typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            f0.d(textView, string);
        }
        kVar.Q();
        Typeface typeface = this.f28234l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f28232j);
        }
    }

    public final void g(int i, int i10, int i11, int i12) {
        r0 r0Var = this.i;
        if (r0Var.j()) {
            DisplayMetrics displayMetrics = r0Var.f28353j.getResources().getDisplayMetrics();
            r0Var.k(TypedValue.applyDimension(i12, i, displayMetrics), TypedValue.applyDimension(i12, i10, displayMetrics), TypedValue.applyDimension(i12, i11, displayMetrics));
            if (r0Var.h()) {
                r0Var.a();
            }
        }
    }

    public final void h(int[] iArr, int i) {
        r0 r0Var = this.i;
        if (r0Var.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = r0Var.f28353j.getResources().getDisplayMetrics();
                    for (int i10 = 0; i10 < length; i10++) {
                        iArrCopyOf[i10] = Math.round(TypedValue.applyDimension(i, iArr[i10], displayMetrics));
                    }
                }
                r0Var.f28350f = r0.b(iArrCopyOf);
                if (!r0Var.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                r0Var.f28351g = false;
            }
            if (r0Var.h()) {
                r0Var.a();
            }
        }
    }

    public final void i(int i) {
        r0 r0Var = this.i;
        if (r0Var.j()) {
            if (i == 0) {
                r0Var.f28345a = 0;
                r0Var.f28348d = -1.0f;
                r0Var.f28349e = -1.0f;
                r0Var.f28347c = -1.0f;
                r0Var.f28350f = new int[0];
                r0Var.f28346b = false;
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException(l7.o.i(i, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = r0Var.f28353j.getResources().getDisplayMetrics();
            r0Var.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (r0Var.h()) {
                r0Var.a();
            }
        }
    }

    public final void j(ColorStateList colorStateList) {
        if (this.f28231h == null) {
            this.f28231h = new t2();
        }
        t2 t2Var = this.f28231h;
        t2Var.f28367c = colorStateList;
        t2Var.f28366b = colorStateList != null;
        this.f28225b = t2Var;
        this.f28226c = t2Var;
        this.f28227d = t2Var;
        this.f28228e = t2Var;
        this.f28229f = t2Var;
        this.f28230g = t2Var;
    }

    public final void k(PorterDuff.Mode mode) {
        if (this.f28231h == null) {
            this.f28231h = new t2();
        }
        t2 t2Var = this.f28231h;
        t2Var.f28368d = mode;
        t2Var.f28365a = mode != null;
        this.f28225b = t2Var;
        this.f28226c = t2Var;
        this.f28227d = t2Var;
        this.f28228e = t2Var;
        this.f28229f = t2Var;
        this.f28230g = t2Var;
    }

    public final void l(Context context, ka.k kVar) {
        String string;
        int i = this.f28232j;
        TypedArray typedArray = (TypedArray) kVar.f27325d;
        this.f28232j = typedArray.getInt(2, i);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int i11 = typedArray.getInt(11, -1);
            this.f28233k = i11;
            if (i11 != -1) {
                this.f28232j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f28235m = false;
                int i12 = typedArray.getInt(1, 1);
                if (i12 == 1) {
                    this.f28234l = Typeface.SANS_SERIF;
                    return;
                } else if (i12 == 2) {
                    this.f28234l = Typeface.SERIF;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    this.f28234l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f28234l = null;
        int i13 = typedArray.hasValue(12) ? 12 : 10;
        int i14 = this.f28233k;
        int i15 = this.f28232j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceG = kVar.G(i13, this.f28232j, new c0(this, i14, i15, new WeakReference(this.f28224a)));
                if (typefaceG != null) {
                    if (i10 < 28 || this.f28233k == -1) {
                        this.f28234l = typefaceG;
                    } else {
                        this.f28234l = g0.a(Typeface.create(typefaceG, 0), this.f28233k, (this.f28232j & 2) != 0);
                    }
                }
                this.f28235m = this.f28234l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f28234l != null || (string = typedArray.getString(i13)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f28233k == -1) {
            this.f28234l = Typeface.create(string, this.f28232j);
        } else {
            this.f28234l = g0.a(Typeface.create(string, 0), this.f28233k, (this.f28232j & 2) != 0);
        }
    }
}
