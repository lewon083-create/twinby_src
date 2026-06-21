package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.gms.internal.measurement.b4;
import dc.b;
import dc.c;
import dc.d;
import dc.e;
import dc.f;
import g2.n0;
import ic.i;
import ic.k;
import io.appmetrica.analytics.impl.A2;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Locale;
import m.p;
import nc.u;
import rc.a;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class Chip extends p implements e, u, Checkable {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Rect f14538x = new Rect();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f14539y = {R.attr.state_selected};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f14540z = {R.attr.state_checkable};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public f f14541f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InsetDrawable f14542g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public RippleDrawable f14543h;
    public View.OnClickListener i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f14544j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f14545k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f14546l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f14547m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f14548n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f14549o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f14550p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f14551q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CharSequence f14552r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f14553s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f14554t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Rect f14555u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final RectF f14556v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final b f14557w;

    public Chip(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        int resourceId3;
        super(a.a(context, attributeSet, com.twinby.R.attr.chipStyle, 2131887162), attributeSet);
        this.f14555u = new Rect();
        this.f14556v = new RectF();
        this.f14557w = new b(0, this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", A2.f22054g) != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        f fVar = new f(context2, attributeSet);
        Context context3 = fVar.f15747f0;
        k.a(context3, attributeSet, com.twinby.R.attr.chipStyle, 2131887162);
        int[] iArr = vb.a.f34811b;
        k.b(context3, attributeSet, iArr, com.twinby.R.attr.chipStyle, 2131887162, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, com.twinby.R.attr.chipStyle, 2131887162);
        fVar.F0 = typedArrayObtainStyledAttributes.hasValue(37);
        ColorStateList colorStateListU = b4.u(context3, typedArrayObtainStyledAttributes, 24);
        if (fVar.f15764y != colorStateListU) {
            fVar.f15764y = colorStateListU;
            fVar.onStateChange(fVar.getState());
        }
        ColorStateList colorStateListU2 = b4.u(context3, typedArrayObtainStyledAttributes, 11);
        if (fVar.f15766z != colorStateListU2) {
            fVar.f15766z = colorStateListU2;
            fVar.onStateChange(fVar.getState());
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(19, 0.0f);
        if (fVar.A != dimension) {
            fVar.A = dimension;
            fVar.invalidateSelf();
            fVar.u();
        }
        if (typedArrayObtainStyledAttributes.hasValue(12)) {
            fVar.A(typedArrayObtainStyledAttributes.getDimension(12, 0.0f));
        }
        fVar.F(b4.u(context3, typedArrayObtainStyledAttributes, 22));
        fVar.G(typedArrayObtainStyledAttributes.getDimension(23, 0.0f));
        fVar.P(b4.u(context3, typedArrayObtainStyledAttributes, 36));
        String text = typedArrayObtainStyledAttributes.getText(5);
        text = text == null ? "" : text;
        if (!TextUtils.equals(fVar.F, text)) {
            fVar.F = text;
            fVar.f15752l0.f21281d = true;
            fVar.invalidateSelf();
            fVar.u();
        }
        kc.d dVar = (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId3 = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? null : new kc.d(context3, resourceId3);
        dVar.f27370k = typedArrayObtainStyledAttributes.getDimension(1, dVar.f27370k);
        fVar.Q(dVar);
        int i = typedArrayObtainStyledAttributes.getInt(3, 0);
        if (i == 1) {
            fVar.C0 = TextUtils.TruncateAt.START;
        } else if (i == 2) {
            fVar.C0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i == 3) {
            fVar.C0 = TextUtils.TruncateAt.END;
        }
        fVar.E(typedArrayObtainStyledAttributes.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            fVar.E(typedArrayObtainStyledAttributes.getBoolean(15, false));
        }
        fVar.B(b4.w(context3, typedArrayObtainStyledAttributes, 14));
        if (typedArrayObtainStyledAttributes.hasValue(17)) {
            fVar.D(b4.u(context3, typedArrayObtainStyledAttributes, 17));
        }
        fVar.C(typedArrayObtainStyledAttributes.getDimension(16, -1.0f));
        fVar.M(typedArrayObtainStyledAttributes.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            fVar.M(typedArrayObtainStyledAttributes.getBoolean(26, false));
        }
        fVar.H(b4.w(context3, typedArrayObtainStyledAttributes, 25));
        fVar.L(b4.u(context3, typedArrayObtainStyledAttributes, 30));
        fVar.J(typedArrayObtainStyledAttributes.getDimension(28, 0.0f));
        fVar.w(typedArrayObtainStyledAttributes.getBoolean(6, false));
        fVar.z(typedArrayObtainStyledAttributes.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            fVar.z(typedArrayObtainStyledAttributes.getBoolean(8, false));
        }
        fVar.x(b4.w(context3, typedArrayObtainStyledAttributes, 7));
        if (typedArrayObtainStyledAttributes.hasValue(9)) {
            fVar.y(b4.u(context3, typedArrayObtainStyledAttributes, 9));
        }
        fVar.V = (!typedArrayObtainStyledAttributes.hasValue(39) || (resourceId2 = typedArrayObtainStyledAttributes.getResourceId(39, 0)) == 0) ? null : wb.b.a(context3, resourceId2);
        fVar.W = (!typedArrayObtainStyledAttributes.hasValue(33) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(33, 0)) == 0) ? null : wb.b.a(context3, resourceId);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(21, 0.0f);
        if (fVar.X != dimension2) {
            fVar.X = dimension2;
            fVar.invalidateSelf();
            fVar.u();
        }
        fVar.O(typedArrayObtainStyledAttributes.getDimension(35, 0.0f));
        fVar.N(typedArrayObtainStyledAttributes.getDimension(34, 0.0f));
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(41, 0.0f);
        if (fVar.f15742a0 != dimension3) {
            fVar.f15742a0 = dimension3;
            fVar.invalidateSelf();
            fVar.u();
        }
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(40, 0.0f);
        if (fVar.f15743b0 != dimension4) {
            fVar.f15743b0 = dimension4;
            fVar.invalidateSelf();
            fVar.u();
        }
        fVar.K(typedArrayObtainStyledAttributes.getDimension(29, 0.0f));
        fVar.I(typedArrayObtainStyledAttributes.getDimension(27, 0.0f));
        float dimension5 = typedArrayObtainStyledAttributes.getDimension(13, 0.0f);
        if (fVar.f15746e0 != dimension5) {
            fVar.f15746e0 = dimension5;
            fVar.invalidateSelf();
            fVar.u();
        }
        fVar.E0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, Integer.MAX_VALUE);
        typedArrayObtainStyledAttributes.recycle();
        k.a(context2, attributeSet, com.twinby.R.attr.chipStyle, 2131887162);
        k.b(context2, attributeSet, iArr, com.twinby.R.attr.chipStyle, 2131887162, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.twinby.R.attr.chipStyle, 2131887162);
        this.f14549o = typedArrayObtainStyledAttributes2.getBoolean(32, false);
        this.f14551q = (int) Math.ceil(typedArrayObtainStyledAttributes2.getDimension(20, (float) Math.ceil(TypedValue.applyDimension(1, 48, getContext().getResources().getDisplayMetrics()))));
        typedArrayObtainStyledAttributes2.recycle();
        setChipDrawable(fVar);
        fVar.i(getElevation());
        k.a(context2, attributeSet, com.twinby.R.attr.chipStyle, 2131887162);
        k.b(context2, attributeSet, iArr, com.twinby.R.attr.chipStyle, 2131887162, new int[0]);
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr, com.twinby.R.attr.chipStyle, 2131887162);
        boolean zHasValue = typedArrayObtainStyledAttributes3.hasValue(37);
        typedArrayObtainStyledAttributes3.recycle();
        this.f14553s = new d(this, this);
        e();
        if (!zHasValue) {
            setOutlineProvider(new c(this));
        }
        setChecked(this.f14545k);
        setText(fVar.F);
        setEllipsize(fVar.C0);
        h();
        if (!this.f14541f.D0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        g();
        if (this.f14549o) {
            setMinHeight(this.f14551q);
        }
        this.f14550p = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: dc.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z5) {
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f15738a.f14544j;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z5);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        RectF rectF = this.f14556v;
        rectF.setEmpty();
        if (d() && this.i != null) {
            f fVar = this.f14541f;
            Rect bounds = fVar.getBounds();
            rectF.setEmpty();
            if (fVar.T()) {
                float f10 = fVar.f15746e0 + fVar.f15745d0 + fVar.P + fVar.f15744c0 + fVar.f15743b0;
                if (fVar.getLayoutDirection() == 0) {
                    float f11 = bounds.right;
                    rectF.right = f11;
                    rectF.left = f11 - f10;
                } else {
                    float f12 = bounds.left;
                    rectF.left = f12;
                    rectF.right = f12 + f10;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i = (int) closeIconTouchBounds.left;
        int i10 = (int) closeIconTouchBounds.top;
        int i11 = (int) closeIconTouchBounds.right;
        int i12 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f14555u;
        rect.set(i, i10, i11, i12);
        return rect;
    }

    private kc.d getTextAppearance() {
        f fVar = this.f14541f;
        if (fVar != null) {
            return fVar.f15752l0.f21283f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z5) {
        if (this.f14547m != z5) {
            this.f14547m = z5;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z5) {
        if (this.f14546l != z5) {
            this.f14546l = z5;
            refreshDrawableState();
        }
    }

    public final void c(int i) {
        this.f14551q = i;
        if (!this.f14549o) {
            InsetDrawable insetDrawable = this.f14542g;
            if (insetDrawable == null) {
                int[] iArr = lc.a.f28102a;
                f();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f14542g = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr2 = lc.a.f28102a;
                    f();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i - ((int) this.f14541f.A));
        int iMax2 = Math.max(0, i - this.f14541f.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.f14542g;
            if (insetDrawable2 == null) {
                int[] iArr3 = lc.a.f28102a;
                f();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f14542g = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr4 = lc.a.f28102a;
                    f();
                    return;
                }
                return;
            }
        }
        int i10 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i11 = iMax > 0 ? iMax / 2 : 0;
        if (this.f14542g != null) {
            Rect rect = new Rect();
            this.f14542g.getPadding(rect);
            if (rect.top == i11 && rect.bottom == i11 && rect.left == i10 && rect.right == i10) {
                int[] iArr5 = lc.a.f28102a;
                f();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.f14542g = new InsetDrawable((Drawable) this.f14541f, i10, i11, i10, i11);
        int[] iArr6 = lc.a.f28102a;
        f();
    }

    public final boolean d() {
        f fVar = this.f14541f;
        if (fVar == null) {
            return false;
        }
        Drawable drawable = fVar.M;
        if (drawable == null) {
            drawable = null;
        }
        return drawable != null;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return !this.f14554t ? super.dispatchHoverEvent(motionEvent) : this.f14553s.dispatchHoverEvent(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f14554t) {
            return super.dispatchKeyEvent(keyEvent);
        }
        d dVar = this.f14553s;
        if (!dVar.dispatchKeyEvent(keyEvent) || dVar.getKeyboardFocusedVirtualViewId() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // m.p, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        f fVar = this.f14541f;
        boolean zV = false;
        if (fVar != null && f.t(fVar.M)) {
            f fVar2 = this.f14541f;
            ?? IsEnabled = isEnabled();
            int i10 = IsEnabled;
            if (this.f14548n) {
                i10 = IsEnabled + 1;
            }
            int i11 = i10;
            if (this.f14547m) {
                i11 = i10 + 1;
            }
            int i12 = i11;
            if (this.f14546l) {
                i12 = i11 + 1;
            }
            int i13 = i12;
            if (isChecked()) {
                i13 = i12 + 1;
            }
            int[] iArr = new int[i13];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            } else {
                i = 0;
            }
            if (this.f14548n) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.f14547m) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.f14546l) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            if (!Arrays.equals(fVar2.f15767z0, iArr)) {
                fVar2.f15767z0 = iArr;
                if (fVar2.T()) {
                    zV = fVar2.v(fVar2.getState(), iArr);
                }
            }
        }
        if (zV) {
            invalidate();
        }
    }

    public final void e() {
        f fVar;
        if (!d() || (fVar = this.f14541f) == null || !fVar.L || this.i == null) {
            n0.k(this, null);
            this.f14554t = false;
        } else {
            n0.k(this, this.f14553s);
            this.f14554t = true;
        }
    }

    public final void f() {
        this.f14543h = new RippleDrawable(lc.a.a(this.f14541f.E), getBackgroundDrawable(), null);
        this.f14541f.getClass();
        RippleDrawable rippleDrawable = this.f14543h;
        Field field = n0.f19900a;
        setBackground(rippleDrawable);
        g();
    }

    public final void g() {
        f fVar;
        if (TextUtils.isEmpty(getText()) || (fVar = this.f14541f) == null) {
            return;
        }
        int iQ = (int) (fVar.q() + fVar.f15746e0 + fVar.f15743b0);
        f fVar2 = this.f14541f;
        int iP = (int) (fVar2.p() + fVar2.X + fVar2.f15742a0);
        if (this.f14542g != null) {
            Rect rect = new Rect();
            this.f14542g.getPadding(rect);
            iP += rect.left;
            iQ += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        Field field = n0.f19900a;
        setPaddingRelative(iP, paddingTop, iQ, paddingBottom);
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f14552r)) {
            return this.f14552r;
        }
        f fVar = this.f14541f;
        if (fVar == null || !fVar.R) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f14542g;
        return insetDrawable == null ? this.f14541f : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        f fVar = this.f14541f;
        if (fVar != null) {
            return fVar.T;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        f fVar = this.f14541f;
        if (fVar != null) {
            return fVar.U;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        f fVar = this.f14541f;
        if (fVar != null) {
            return fVar.f15766z;
        }
        return null;
    }

    public float getChipCornerRadius() {
        f fVar = this.f14541f;
        if (fVar != null) {
            return Math.max(0.0f, fVar.r());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f14541f;
    }

    public float getChipEndPadding() {
        f fVar = this.f14541f;
        if (fVar != null) {
            return fVar.f15746e0;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        f fVar = this.f14541f;
        if (fVar == null || (drawable = fVar.H) == null) {
            return null;
        }
        return drawable;
    }

    public float getChipIconSize() {
        f fVar = this.f14541f;
        if (fVar != null) {
            return fVar.J;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        f fVar = this.f14541f;
        if (fVar != null) {
            return fVar.I;
        }
        return null;
    }

    public float getChipMinHeight() {
        f fVar = this.f14541f;
        if (fVar != null) {
            return fVar.A;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        f fVar = this.f14541f;
        if (fVar != null) {
            return fVar.X;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        f fVar = this.f14541f;
        if (fVar != null) {
            return fVar.C;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        f fVar = this.f14541f;
        if (fVar != null) {
            return fVar.D;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        f fVar = this.f14541f;
        if (fVar == null || (drawable = fVar.M) == null) {
            return null;
        }
        return drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        f fVar = this.f14541f;
        if (fVar != null) {
            return fVar.Q;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        f fVar = this.f14541f;
        if (fVar != null) {
            return fVar.f15745d0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        f fVar = this.f14541f;
        if (fVar != null) {
            return fVar.P;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        f fVar = this.f14541f;
        if (fVar != null) {
            return fVar.f15744c0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        f fVar = this.f14541f;
        if (fVar != null) {
            return fVar.O;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        f fVar = this.f14541f;
        if (fVar != null) {
            return fVar.C0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f14554t) {
            d dVar = this.f14553s;
            if (dVar.getKeyboardFocusedVirtualViewId() == 1 || dVar.getAccessibilityFocusedVirtualViewId() == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public wb.b getHideMotionSpec() {
        f fVar = this.f14541f;
        if (fVar != null) {
            return fVar.W;
        }
        return null;
    }

    public float getIconEndPadding() {
        f fVar = this.f14541f;
        if (fVar != null) {
            return fVar.Z;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        f fVar = this.f14541f;
        if (fVar != null) {
            return fVar.Y;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        f fVar = this.f14541f;
        if (fVar != null) {
            return fVar.E;
        }
        return null;
    }

    public nc.k getShapeAppearanceModel() {
        return this.f14541f.f29225b.f29209a;
    }

    public wb.b getShowMotionSpec() {
        f fVar = this.f14541f;
        if (fVar != null) {
            return fVar.V;
        }
        return null;
    }

    public float getTextEndPadding() {
        f fVar = this.f14541f;
        if (fVar != null) {
            return fVar.f15743b0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        f fVar = this.f14541f;
        if (fVar != null) {
            return fVar.f15742a0;
        }
        return 0.0f;
    }

    public final void h() {
        TextPaint paint = getPaint();
        f fVar = this.f14541f;
        if (fVar != null) {
            paint.drawableState = fVar.getState();
        }
        kc.d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.f14557w);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a.a.n(this, this.f14541f);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f14539y);
        }
        f fVar = this.f14541f;
        if (fVar != null && fVar.R) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f14540z);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z5, int i, Rect rect) {
        super.onFocusChanged(z5, i, rect);
        if (this.f14554t) {
            this.f14553s.onFocusChanged(z5, i, rect);
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        f fVar = this.f14541f;
        accessibilityNodeInfo.setCheckable(fVar != null && fVar.R);
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f14550p != i) {
            this.f14550p = i;
            g();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L28;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L4a
            if (r0 == r2) goto L2c
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L45
            goto L50
        L21:
            boolean r0 = r5.f14546l
            if (r0 == 0) goto L50
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r3)
        L2a:
            r0 = r2
            goto L51
        L2c:
            boolean r0 = r5.f14546l
            if (r0 == 0) goto L45
            r5.playSoundEffect(r3)
            android.view.View$OnClickListener r0 = r5.i
            if (r0 == 0) goto L3a
            r0.onClick(r5)
        L3a:
            boolean r0 = r5.f14554t
            if (r0 == 0) goto L43
            dc.d r0 = r5.f14553s
            r0.sendEventForVirtualView(r2, r2)
        L43:
            r0 = r2
            goto L46
        L45:
            r0 = r3
        L46:
            r5.setCloseIconPressed(r3)
            goto L51
        L4a:
            if (r1 == 0) goto L50
            r5.setCloseIconPressed(r2)
            goto L2a
        L50:
            r0 = r3
        L51:
            if (r0 != 0) goto L5b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L5a
            goto L5b
        L5a:
            return r3
        L5b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f14552r = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f14543h) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // m.p, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f14543h) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // m.p, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z5) {
        f fVar = this.f14541f;
        if (fVar != null) {
            fVar.w(z5);
        }
    }

    public void setCheckableResource(int i) {
        f fVar = this.f14541f;
        if (fVar != null) {
            fVar.w(fVar.f15747f0.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z5) {
        f fVar = this.f14541f;
        if (fVar == null) {
            this.f14545k = z5;
        } else if (fVar.R) {
            super.setChecked(z5);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        f fVar = this.f14541f;
        if (fVar != null) {
            fVar.x(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z5) {
        setCheckedIconVisible(z5);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        f fVar = this.f14541f;
        if (fVar != null) {
            fVar.x(a.a.i(fVar.f15747f0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        f fVar = this.f14541f;
        if (fVar != null) {
            fVar.y(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        f fVar = this.f14541f;
        if (fVar != null) {
            fVar.y(t1.b.b(fVar.f15747f0, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        f fVar = this.f14541f;
        if (fVar != null) {
            fVar.z(fVar.f15747f0.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        f fVar = this.f14541f;
        if (fVar == null || fVar.f15766z == colorStateList) {
            return;
        }
        fVar.f15766z = colorStateList;
        fVar.onStateChange(fVar.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList colorStateListB;
        f fVar = this.f14541f;
        if (fVar == null || fVar.f15766z == (colorStateListB = t1.b.b(fVar.f15747f0, i))) {
            return;
        }
        fVar.f15766z = colorStateListB;
        fVar.onStateChange(fVar.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f10) {
        f fVar = this.f14541f;
        if (fVar != null) {
            fVar.A(f10);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        f fVar = this.f14541f;
        if (fVar != null) {
            fVar.A(fVar.f15747f0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(f fVar) {
        f fVar2 = this.f14541f;
        if (fVar2 != fVar) {
            if (fVar2 != null) {
                fVar2.B0 = new WeakReference(null);
            }
            this.f14541f = fVar;
            fVar.D0 = false;
            fVar.B0 = new WeakReference(this);
            c(this.f14551q);
        }
    }

    public void setChipEndPadding(float f10) {
        f fVar = this.f14541f;
        if (fVar == null || fVar.f15746e0 == f10) {
            return;
        }
        fVar.f15746e0 = f10;
        fVar.invalidateSelf();
        fVar.u();
    }

    public void setChipEndPaddingResource(int i) {
        f fVar = this.f14541f;
        if (fVar != null) {
            float dimension = fVar.f15747f0.getResources().getDimension(i);
            if (fVar.f15746e0 != dimension) {
                fVar.f15746e0 = dimension;
                fVar.invalidateSelf();
                fVar.u();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        f fVar = this.f14541f;
        if (fVar != null) {
            fVar.B(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z5) {
        setChipIconVisible(z5);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        f fVar = this.f14541f;
        if (fVar != null) {
            fVar.B(a.a.i(fVar.f15747f0, i));
        }
    }

    public void setChipIconSize(float f10) {
        f fVar = this.f14541f;
        if (fVar != null) {
            fVar.C(f10);
        }
    }

    public void setChipIconSizeResource(int i) {
        f fVar = this.f14541f;
        if (fVar != null) {
            fVar.C(fVar.f15747f0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        f fVar = this.f14541f;
        if (fVar != null) {
            fVar.D(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        f fVar = this.f14541f;
        if (fVar != null) {
            fVar.D(t1.b.b(fVar.f15747f0, i));
        }
    }

    public void setChipIconVisible(int i) {
        f fVar = this.f14541f;
        if (fVar != null) {
            fVar.E(fVar.f15747f0.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f10) {
        f fVar = this.f14541f;
        if (fVar == null || fVar.A == f10) {
            return;
        }
        fVar.A = f10;
        fVar.invalidateSelf();
        fVar.u();
    }

    public void setChipMinHeightResource(int i) {
        f fVar = this.f14541f;
        if (fVar != null) {
            float dimension = fVar.f15747f0.getResources().getDimension(i);
            if (fVar.A != dimension) {
                fVar.A = dimension;
                fVar.invalidateSelf();
                fVar.u();
            }
        }
    }

    public void setChipStartPadding(float f10) {
        f fVar = this.f14541f;
        if (fVar == null || fVar.X == f10) {
            return;
        }
        fVar.X = f10;
        fVar.invalidateSelf();
        fVar.u();
    }

    public void setChipStartPaddingResource(int i) {
        f fVar = this.f14541f;
        if (fVar != null) {
            float dimension = fVar.f15747f0.getResources().getDimension(i);
            if (fVar.X != dimension) {
                fVar.X = dimension;
                fVar.invalidateSelf();
                fVar.u();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        f fVar = this.f14541f;
        if (fVar != null) {
            fVar.F(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        f fVar = this.f14541f;
        if (fVar != null) {
            fVar.F(t1.b.b(fVar.f15747f0, i));
        }
    }

    public void setChipStrokeWidth(float f10) {
        f fVar = this.f14541f;
        if (fVar != null) {
            fVar.G(f10);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        f fVar = this.f14541f;
        if (fVar != null) {
            fVar.G(fVar.f15747f0.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        f fVar = this.f14541f;
        if (fVar != null) {
            fVar.H(drawable);
        }
        e();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        f fVar = this.f14541f;
        if (fVar == null || fVar.Q == charSequence) {
            return;
        }
        String str = e2.b.f16018b;
        e2.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? e2.b.f16021e : e2.b.f16020d;
        bVar.getClass();
        ac.c cVar = e2.f.f16028a;
        fVar.Q = bVar.c(charSequence);
        fVar.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z5) {
        setCloseIconVisible(z5);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f10) {
        f fVar = this.f14541f;
        if (fVar != null) {
            fVar.I(f10);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        f fVar = this.f14541f;
        if (fVar != null) {
            fVar.I(fVar.f15747f0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        f fVar = this.f14541f;
        if (fVar != null) {
            fVar.H(a.a.i(fVar.f15747f0, i));
        }
        e();
    }

    public void setCloseIconSize(float f10) {
        f fVar = this.f14541f;
        if (fVar != null) {
            fVar.J(f10);
        }
    }

    public void setCloseIconSizeResource(int i) {
        f fVar = this.f14541f;
        if (fVar != null) {
            fVar.J(fVar.f15747f0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f10) {
        f fVar = this.f14541f;
        if (fVar != null) {
            fVar.K(f10);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        f fVar = this.f14541f;
        if (fVar != null) {
            fVar.K(fVar.f15747f0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        f fVar = this.f14541f;
        if (fVar != null) {
            fVar.L(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        f fVar = this.f14541f;
        if (fVar != null) {
            fVar.L(t1.b.b(fVar.f15747f0, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // m.p, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // m.p, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i10, int i11, int i12) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i11 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i10, i11, i12);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i10, int i11, int i12) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i11 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i10, i11, i12);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        f fVar = this.f14541f;
        if (fVar != null) {
            fVar.i(f10);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f14541f == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        f fVar = this.f14541f;
        if (fVar != null) {
            fVar.C0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z5) {
        this.f14549o = z5;
        c(this.f14551q);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(wb.b bVar) {
        f fVar = this.f14541f;
        if (fVar != null) {
            fVar.W = bVar;
        }
    }

    public void setHideMotionSpecResource(int i) {
        f fVar = this.f14541f;
        if (fVar != null) {
            fVar.W = wb.b.a(fVar.f15747f0, i);
        }
    }

    public void setIconEndPadding(float f10) {
        f fVar = this.f14541f;
        if (fVar != null) {
            fVar.N(f10);
        }
    }

    public void setIconEndPaddingResource(int i) {
        f fVar = this.f14541f;
        if (fVar != null) {
            fVar.N(fVar.f15747f0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f10) {
        f fVar = this.f14541f;
        if (fVar != null) {
            fVar.O(f10);
        }
    }

    public void setIconStartPaddingResource(int i) {
        f fVar = this.f14541f;
        if (fVar != null) {
            fVar.O(fVar.f15747f0.getResources().getDimension(i));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.f14541f == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        f fVar = this.f14541f;
        if (fVar != null) {
            fVar.E0 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f14544j = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.i = onClickListener;
        e();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        f fVar = this.f14541f;
        if (fVar != null) {
            fVar.P(colorStateList);
        }
        this.f14541f.getClass();
        f();
    }

    public void setRippleColorResource(int i) {
        f fVar = this.f14541f;
        if (fVar != null) {
            fVar.P(t1.b.b(fVar.f15747f0, i));
            this.f14541f.getClass();
            f();
        }
    }

    @Override // nc.u
    public void setShapeAppearanceModel(nc.k kVar) {
        this.f14541f.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(wb.b bVar) {
        f fVar = this.f14541f;
        if (fVar != null) {
            fVar.V = bVar;
        }
    }

    public void setShowMotionSpecResource(int i) {
        f fVar = this.f14541f;
        if (fVar != null) {
            fVar.V = wb.b.a(fVar.f15747f0, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z5) {
        if (!z5) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z5);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        f fVar = this.f14541f;
        if (fVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(fVar.D0 ? null : charSequence, bufferType);
        f fVar2 = this.f14541f;
        if (fVar2 == null || TextUtils.equals(fVar2.F, charSequence)) {
            return;
        }
        fVar2.F = charSequence;
        fVar2.f15752l0.f21281d = true;
        fVar2.invalidateSelf();
        fVar2.u();
    }

    public void setTextAppearance(kc.d dVar) {
        f fVar = this.f14541f;
        if (fVar != null) {
            fVar.Q(dVar);
        }
        h();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f10) {
        f fVar = this.f14541f;
        if (fVar == null || fVar.f15743b0 == f10) {
            return;
        }
        fVar.f15743b0 = f10;
        fVar.invalidateSelf();
        fVar.u();
    }

    public void setTextEndPaddingResource(int i) {
        f fVar = this.f14541f;
        if (fVar != null) {
            float dimension = fVar.f15747f0.getResources().getDimension(i);
            if (fVar.f15743b0 != dimension) {
                fVar.f15743b0 = dimension;
                fVar.invalidateSelf();
                fVar.u();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f10) {
        super.setTextSize(i, f10);
        f fVar = this.f14541f;
        if (fVar != null) {
            float fApplyDimension = TypedValue.applyDimension(i, f10, getResources().getDisplayMetrics());
            i iVar = fVar.f15752l0;
            kc.d dVar = iVar.f21283f;
            if (dVar != null) {
                dVar.f27370k = fApplyDimension;
                iVar.f21278a.setTextSize(fApplyDimension);
                fVar.u();
                fVar.invalidateSelf();
            }
        }
        h();
    }

    public void setTextStartPadding(float f10) {
        f fVar = this.f14541f;
        if (fVar == null || fVar.f15742a0 == f10) {
            return;
        }
        fVar.f15742a0 = f10;
        fVar.invalidateSelf();
        fVar.u();
    }

    public void setTextStartPaddingResource(int i) {
        f fVar = this.f14541f;
        if (fVar != null) {
            float dimension = fVar.f15747f0.getResources().getDimension(i);
            if (fVar.f15742a0 != dimension) {
                fVar.f15742a0 = dimension;
                fVar.invalidateSelf();
                fVar.u();
            }
        }
    }

    public void setCloseIconVisible(boolean z5) {
        f fVar = this.f14541f;
        if (fVar != null) {
            fVar.M(z5);
        }
        e();
    }

    public void setCheckedIconVisible(boolean z5) {
        f fVar = this.f14541f;
        if (fVar != null) {
            fVar.z(z5);
        }
    }

    public void setChipIconVisible(boolean z5) {
        f fVar = this.f14541f;
        if (fVar != null) {
            fVar.E(z5);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        f fVar = this.f14541f;
        if (fVar != null) {
            fVar.Q(new kc.d(fVar.f15747f0, i));
        }
        h();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        f fVar = this.f14541f;
        if (fVar != null) {
            fVar.Q(new kc.d(fVar.f15747f0, i));
        }
        h();
    }

    public void setInternalOnCheckedChangeListener(ic.e eVar) {
    }
}
