package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatButton;
import bc.a;
import bc.b;
import bc.c;
import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.measurement.b4;
import g2.n0;
import ic.k;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedHashSet;
import nc.j;
import nc.u;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class MaterialButton extends AppCompatButton implements Checkable, u {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int[] f14512s = {R.attr.state_checkable};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int[] f14513t = {R.attr.state_checked};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f14514e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f14515f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f14516g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f14517h;
    public ColorStateList i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Drawable f14518j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f14519k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f14520l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f14521m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f14522n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f14523o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f14524p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f14525q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f14526r;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(rc.a.a(context, attributeSet, com.twinby.R.attr.materialButtonStyle, 2131887148), attributeSet, com.twinby.R.attr.materialButtonStyle);
        this.f14515f = new LinkedHashSet();
        this.f14524p = false;
        this.f14525q = false;
        Context context2 = getContext();
        k.a(context2, attributeSet, com.twinby.R.attr.materialButtonStyle, 2131887148);
        int[] iArr = vb.a.f34817h;
        k.b(context2, attributeSet, iArr, com.twinby.R.attr.materialButtonStyle, 2131887148, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.twinby.R.attr.materialButtonStyle, 2131887148);
        this.f14523o = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        int i = typedArrayObtainStyledAttributes.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f14517h = k.f(i, mode);
        this.i = b4.u(getContext(), typedArrayObtainStyledAttributes, 14);
        this.f14518j = b4.w(getContext(), typedArrayObtainStyledAttributes, 10);
        this.f14526r = typedArrayObtainStyledAttributes.getInteger(11, 1);
        this.f14520l = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, 0);
        c cVar = new c(this, nc.k.b(context2, attributeSet, com.twinby.R.attr.materialButtonStyle, 2131887148).a());
        this.f14514e = cVar;
        cVar.f2031c = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        cVar.f2032d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0);
        cVar.f2033e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0);
        cVar.f2034f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(4, 0);
        if (typedArrayObtainStyledAttributes.hasValue(8)) {
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, -1);
            cVar.f2035g = dimensionPixelSize;
            float f10 = dimensionPixelSize;
            j jVarE = cVar.f2030b.e();
            jVarE.f29251e = new nc.a(f10);
            jVarE.f29252f = new nc.a(f10);
            jVarE.f29253g = new nc.a(f10);
            jVarE.f29254h = new nc.a(f10);
            cVar.c(jVarE.a());
            cVar.f2043p = true;
        }
        cVar.f2036h = typedArrayObtainStyledAttributes.getDimensionPixelSize(20, 0);
        cVar.i = k.f(typedArrayObtainStyledAttributes.getInt(7, -1), mode);
        cVar.f2037j = b4.u(getContext(), typedArrayObtainStyledAttributes, 6);
        cVar.f2038k = b4.u(getContext(), typedArrayObtainStyledAttributes, 19);
        cVar.f2039l = b4.u(getContext(), typedArrayObtainStyledAttributes, 16);
        cVar.f2044q = typedArrayObtainStyledAttributes.getBoolean(5, false);
        cVar.f2047t = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, 0);
        cVar.f2045r = typedArrayObtainStyledAttributes.getBoolean(21, true);
        Field field = n0.f19900a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            cVar.f2042o = true;
            setSupportBackgroundTintList(cVar.f2037j);
            setSupportBackgroundTintMode(cVar.i);
        } else {
            cVar.e();
        }
        setPaddingRelative(paddingStart + cVar.f2031c, paddingTop + cVar.f2033e, paddingEnd + cVar.f2032d, paddingBottom + cVar.f2034f);
        typedArrayObtainStyledAttributes.recycle();
        setCompoundDrawablePadding(this.f14523o);
        c(this.f14518j != null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(fMax);
    }

    public final boolean a() {
        c cVar = this.f14514e;
        return (cVar == null || cVar.f2042o) ? false : true;
    }

    public final void b() {
        int i = this.f14526r;
        if (i == 1 || i == 2) {
            setCompoundDrawablesRelative(this.f14518j, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            setCompoundDrawablesRelative(null, null, this.f14518j, null);
        } else if (i == 16 || i == 32) {
            setCompoundDrawablesRelative(null, this.f14518j, null, null);
        }
    }

    public final void c(boolean z5) {
        Drawable drawable = this.f14518j;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f14518j = drawableMutate;
            drawableMutate.setTintList(this.i);
            PorterDuff.Mode mode = this.f14517h;
            if (mode != null) {
                this.f14518j.setTintMode(mode);
            }
            int intrinsicWidth = this.f14520l;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f14518j.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f14520l;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f14518j.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f14518j;
            int i = this.f14521m;
            int i10 = this.f14522n;
            drawable2.setBounds(i, i10, intrinsicWidth + i, intrinsicHeight + i10);
            this.f14518j.setVisible(true, z5);
        }
        if (z5) {
            b();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i11 = this.f14526r;
        if (((i11 == 1 || i11 == 2) && drawable3 != this.f14518j) || (((i11 == 3 || i11 == 4) && drawable5 != this.f14518j) || ((i11 == 16 || i11 == 32) && drawable4 != this.f14518j))) {
            b();
        }
    }

    public final void d(int i, int i10) {
        if (this.f14518j == null || getLayout() == null) {
            return;
        }
        int i11 = this.f14526r;
        if (i11 != 1 && i11 != 2 && i11 != 3 && i11 != 4) {
            if (i11 == 16 || i11 == 32) {
                this.f14521m = 0;
                if (i11 == 16) {
                    this.f14522n = 0;
                    c(false);
                    return;
                }
                int intrinsicHeight = this.f14520l;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f14518j.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i10 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f14523o) - getPaddingBottom()) / 2);
                if (this.f14522n != iMax) {
                    this.f14522n = iMax;
                    c(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f14522n = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i12 = this.f14526r;
        if (i12 == 1 || i12 == 3 || ((i12 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i12 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f14521m = 0;
            c(false);
            return;
        }
        int intrinsicWidth = this.f14520l;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f14518j.getIntrinsicWidth();
        }
        int textLayoutWidth = i - getTextLayoutWidth();
        Field field = n0.f19900a;
        int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - intrinsicWidth) - this.f14523o) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            paddingEnd /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.f14526r == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.f14521m != paddingEnd) {
            this.f14521m = paddingEnd;
            c(false);
        }
    }

    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.f14519k)) {
            return this.f14519k;
        }
        c cVar = this.f14514e;
        return ((cVar == null || !cVar.f2044q) ? Button.class : CompoundButton.class).getName();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (a()) {
            return this.f14514e.f2035g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f14518j;
    }

    public int getIconGravity() {
        return this.f14526r;
    }

    public int getIconPadding() {
        return this.f14523o;
    }

    public int getIconSize() {
        return this.f14520l;
    }

    public ColorStateList getIconTint() {
        return this.i;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f14517h;
    }

    public int getInsetBottom() {
        return this.f14514e.f2034f;
    }

    public int getInsetTop() {
        return this.f14514e.f2033e;
    }

    public ColorStateList getRippleColor() {
        if (a()) {
            return this.f14514e.f2039l;
        }
        return null;
    }

    public nc.k getShapeAppearanceModel() {
        if (a()) {
            return this.f14514e.f2030b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (a()) {
            return this.f14514e.f2038k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (a()) {
            return this.f14514e.f2036h;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public ColorStateList getSupportBackgroundTintList() {
        return a() ? this.f14514e.f2037j : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return a() ? this.f14514e.i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f14524p;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (a()) {
            a.a.n(this, this.f14514e.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        c cVar = this.f14514e;
        if (cVar != null && cVar.f2044q) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f14512s);
        }
        if (this.f14524p) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f14513t);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f14524p);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        c cVar = this.f14514e;
        accessibilityNodeInfo.setCheckable(cVar != null && cVar.f2044q);
        accessibilityNodeInfo.setChecked(this.f14524p);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public final void onLayout(boolean z5, int i, int i10, int i11, int i12) {
        super.onLayout(z5, i, i10, i11, i12);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.f28536b);
        setChecked(bVar.f2028d);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f2028d = this.f14524p;
        return bVar;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i10, int i11) {
        super.onTextChanged(charSequence, i, i10, i11);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f14514e.f2045r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f14518j != null) {
            if (this.f14518j.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f14519k = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!a()) {
            super.setBackgroundColor(i);
            return;
        }
        c cVar = this.f14514e;
        if (cVar.b(false) != null) {
            cVar.b(false).setTint(i);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!a()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        c cVar = this.f14514e;
        cVar.f2042o = true;
        MaterialButton materialButton = cVar.f2029a;
        materialButton.setSupportBackgroundTintList(cVar.f2037j);
        materialButton.setSupportBackgroundTintMode(cVar.i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? a.a.i(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z5) {
        if (a()) {
            this.f14514e.f2044q = z5;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z5) {
        c cVar = this.f14514e;
        if (cVar == null || !cVar.f2044q || !isEnabled() || this.f14524p == z5) {
            return;
        }
        this.f14524p = z5;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z10 = this.f14524p;
            if (!materialButtonToggleGroup.f14533g) {
                materialButtonToggleGroup.b(getId(), z10);
            }
        }
        if (this.f14525q) {
            return;
        }
        this.f14525q = true;
        Iterator it = this.f14515f.iterator();
        if (it.hasNext()) {
            throw om1.i(it);
        }
        this.f14525q = false;
    }

    public void setCornerRadius(int i) {
        if (a()) {
            c cVar = this.f14514e;
            if (cVar.f2043p && cVar.f2035g == i) {
                return;
            }
            cVar.f2035g = i;
            cVar.f2043p = true;
            float f10 = i;
            j jVarE = cVar.f2030b.e();
            jVarE.f29251e = new nc.a(f10);
            jVarE.f29252f = new nc.a(f10);
            jVarE.f29253g = new nc.a(f10);
            jVarE.f29254h = new nc.a(f10);
            cVar.c(jVarE.a());
        }
    }

    public void setCornerRadiusResource(int i) {
        if (a()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        if (a()) {
            this.f14514e.b(false).i(f10);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f14518j != drawable) {
            this.f14518j = drawable;
            c(true);
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.f14526r != i) {
            this.f14526r = i;
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.f14523o != i) {
            this.f14523o = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? a.a.i(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f14520l != i) {
            this.f14520l = i;
            c(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.i != colorStateList) {
            this.i = colorStateList;
            c(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f14517h != mode) {
            this.f14517h = mode;
            c(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(t1.b.b(getContext(), i));
    }

    public void setInsetBottom(int i) {
        c cVar = this.f14514e;
        cVar.d(cVar.f2033e, i);
    }

    public void setInsetTop(int i) {
        c cVar = this.f14514e;
        cVar.d(i, cVar.f2034f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(a aVar) {
        this.f14516g = aVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z5) {
        a aVar = this.f14516g;
        if (aVar != null) {
            ((MaterialButtonToggleGroup) ((fe.c) aVar).f16785c).invalidate();
        }
        super.setPressed(z5);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (a()) {
            c cVar = this.f14514e;
            MaterialButton materialButton = cVar.f2029a;
            if (cVar.f2039l != colorStateList) {
                cVar.f2039l = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(lc.a.a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (a()) {
            setRippleColor(t1.b.b(getContext(), i));
        }
    }

    @Override // nc.u
    public void setShapeAppearanceModel(nc.k kVar) {
        if (!a()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f14514e.c(kVar);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z5) {
        if (a()) {
            c cVar = this.f14514e;
            cVar.f2041n = z5;
            cVar.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (a()) {
            c cVar = this.f14514e;
            if (cVar.f2038k != colorStateList) {
                cVar.f2038k = colorStateList;
                cVar.f();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (a()) {
            setStrokeColor(t1.b.b(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (a()) {
            c cVar = this.f14514e;
            if (cVar.f2036h != i) {
                cVar.f2036h = i;
                cVar.f();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (a()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!a()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        c cVar = this.f14514e;
        if (cVar.f2037j != colorStateList) {
            cVar.f2037j = colorStateList;
            if (cVar.b(false) != null) {
                cVar.b(false).setTintList(cVar.f2037j);
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!a()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        c cVar = this.f14514e;
        if (cVar.i != mode) {
            cVar.i = mode;
            if (cVar.b(false) == null || cVar.i == null) {
                return;
            }
            cVar.b(false).setTintMode(cVar.i);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z5) {
        this.f14514e.f2045r = z5;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f14524p);
    }
}
