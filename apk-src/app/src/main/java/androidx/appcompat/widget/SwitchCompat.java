package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import g2.a0;
import g2.n0;
import java.lang.reflect.Field;
import k3.f;
import ka.k;
import m.h0;
import m.k3;
import m.o2;
import m.p2;
import m.q2;
import m.r2;
import m.u;
import m.w0;
import u2.h;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {
    public static final o2 S = new o2(0, Float.class, "thumbPos");
    public static final int[] T = {R.attr.state_checked};
    public float A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public boolean I;
    public final TextPaint J;
    public final ColorStateList K;
    public StaticLayout L;
    public StaticLayout M;
    public final j.a N;
    public ObjectAnimator O;
    public u P;
    public q2 Q;
    public final Rect R;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Drawable f1162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ColorStateList f1163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f1164d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1165e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1166f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable f1167g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ColorStateList f1168h;
    public PorterDuff.Mode i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1169j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f1170k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1171l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1172m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1173n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1174o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f1175p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f1176q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CharSequence f1177r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CharSequence f1178s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f1179t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f1180u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f1181v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f1182w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f1183x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final VelocityTracker f1184y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f1185z;

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, com.twinby.R.attr.switchStyle);
        this.f1163c = null;
        this.f1164d = null;
        this.f1165e = false;
        this.f1166f = false;
        this.f1168h = null;
        this.i = null;
        this.f1169j = false;
        this.f1170k = false;
        this.f1184y = VelocityTracker.obtain();
        this.I = true;
        this.R = new Rect();
        r2.a(getContext(), this);
        TextPaint textPaint = new TextPaint(1);
        this.J = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = h.a.f20310s;
        k kVarJ = k.J(context, attributeSet, iArr, com.twinby.R.attr.switchStyle);
        TypedArray typedArray = (TypedArray) kVarJ.f27325d;
        n0.j(this, context, iArr, attributeSet, typedArray, com.twinby.R.attr.switchStyle);
        Drawable drawableF = kVarJ.F(2);
        this.f1162b = drawableF;
        if (drawableF != null) {
            drawableF.setCallback(this);
        }
        Drawable drawableF2 = kVarJ.F(11);
        this.f1167g = drawableF2;
        if (drawableF2 != null) {
            drawableF2.setCallback(this);
        }
        setTextOnInternal(typedArray.getText(0));
        setTextOffInternal(typedArray.getText(1));
        this.f1179t = typedArray.getBoolean(3, true);
        this.f1171l = typedArray.getDimensionPixelSize(8, 0);
        this.f1172m = typedArray.getDimensionPixelSize(5, 0);
        this.f1173n = typedArray.getDimensionPixelSize(6, 0);
        this.f1174o = typedArray.getBoolean(4, false);
        ColorStateList colorStateListE = kVarJ.E(9);
        if (colorStateListE != null) {
            this.f1163c = colorStateListE;
            this.f1165e = true;
        }
        PorterDuff.Mode modeC = w0.c(typedArray.getInt(10, -1), null);
        if (this.f1164d != modeC) {
            this.f1164d = modeC;
            this.f1166f = true;
        }
        if (this.f1165e || this.f1166f) {
            a();
        }
        ColorStateList colorStateListE2 = kVarJ.E(12);
        if (colorStateListE2 != null) {
            this.f1168h = colorStateListE2;
            this.f1169j = true;
        }
        PorterDuff.Mode modeC2 = w0.c(typedArray.getInt(13, -1), null);
        if (this.i != modeC2) {
            this.i = modeC2;
            this.f1170k = true;
        }
        if (this.f1169j || this.f1170k) {
            b();
        }
        int resourceId2 = typedArray.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId2, h.a.f20311t);
            ColorStateList colorStateList = (!typedArrayObtainStyledAttributes.hasValue(3) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = t1.b.b(context, resourceId)) == null) ? typedArrayObtainStyledAttributes.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.K = colorStateList;
            } else {
                this.K = getTextColors();
            }
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f10 = dimensionPixelSize;
                if (f10 != textPaint.getTextSize()) {
                    textPaint.setTextSize(f10);
                    requestLayout();
                }
            }
            int i = typedArrayObtainStyledAttributes.getInt(1, -1);
            int i10 = typedArrayObtainStyledAttributes.getInt(2, -1);
            Typeface typeface = i != 1 ? i != 2 ? i != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            if (i10 > 0) {
                Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i10) : Typeface.create(typeface, i10);
                setSwitchTypeface(typefaceDefaultFromStyle);
                int i11 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i10;
                textPaint.setFakeBoldText((i11 & 1) != 0);
                textPaint.setTextSkewX((2 & i11) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
                Context context2 = getContext();
                j.a aVar = new j.a();
                aVar.f26117b = context2.getResources().getConfiguration().locale;
                this.N = aVar;
            } else {
                this.N = null;
            }
            setTextOnInternal(this.f1175p);
            setTextOffInternal(this.f1177r);
            typedArrayObtainStyledAttributes.recycle();
        }
        new h0(this).d(attributeSet, com.twinby.R.attr.switchStyle);
        kVarJ.Q();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1181v = viewConfiguration.getScaledTouchSlop();
        this.f1185z = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().a(attributeSet, com.twinby.R.attr.switchStyle);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private u getEmojiTextViewHelper() {
        if (this.P == null) {
            this.P = new u(this);
        }
        return this.P;
    }

    private boolean getTargetCheckedState() {
        return this.A > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((k3.a(this) ? 1.0f - this.A : this.A) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f1167g;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.R;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f1162b;
        Rect rectB = drawable2 != null ? w0.b(drawable2) : w0.f28393c;
        return ((((this.B - this.D) - rect.left) - rect.right) - rectB.left) - rectB.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f1177r = charSequence;
        TransformationMethod transformationMethodX = ((rl.b) getEmojiTextViewHelper().f28370b.f27180c).x(this.N);
        if (transformationMethodX != null) {
            charSequence = transformationMethodX.getTransformation(charSequence, this);
        }
        this.f1178s = charSequence;
        this.M = null;
        if (this.f1179t) {
            d();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f1175p = charSequence;
        TransformationMethod transformationMethodX = ((rl.b) getEmojiTextViewHelper().f28370b.f27180c).x(this.N);
        if (transformationMethodX != null) {
            charSequence = transformationMethodX.getTransformation(charSequence, this);
        }
        this.f1176q = charSequence;
        this.L = null;
        if (this.f1179t) {
            d();
        }
    }

    public final void a() {
        Drawable drawable = this.f1162b;
        if (drawable != null) {
            if (this.f1165e || this.f1166f) {
                Drawable drawableMutate = drawable.mutate();
                this.f1162b = drawableMutate;
                if (this.f1165e) {
                    drawableMutate.setTintList(this.f1163c);
                }
                if (this.f1166f) {
                    this.f1162b.setTintMode(this.f1164d);
                }
                if (this.f1162b.isStateful()) {
                    this.f1162b.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f1167g;
        if (drawable != null) {
            if (this.f1169j || this.f1170k) {
                Drawable drawableMutate = drawable.mutate();
                this.f1167g = drawableMutate;
                if (this.f1169j) {
                    drawableMutate.setTintList(this.f1168h);
                }
                if (this.f1170k) {
                    this.f1167g.setTintMode(this.i);
                }
                if (this.f1167g.isStateful()) {
                    this.f1167g.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        setTextOnInternal(this.f1175p);
        setTextOffInternal(this.f1177r);
        requestLayout();
    }

    public final void d() {
        if (this.Q == null && ((rl.b) this.P.f28370b.f27180c).n() && h.f34028j != null) {
            h hVarA = h.a();
            int iB = hVarA.b();
            if (iB == 3 || iB == 0) {
                q2 q2Var = new q2(this);
                this.Q = q2Var;
                hVarA.f(q2Var);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        int i10;
        int i11 = this.E;
        int i12 = this.F;
        int i13 = this.G;
        int i14 = this.H;
        int thumbOffset = getThumbOffset() + i11;
        Drawable drawable = this.f1162b;
        Rect rectB = drawable != null ? w0.b(drawable) : w0.f28393c;
        Drawable drawable2 = this.f1167g;
        Rect rect = this.R;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i15 = rect.left;
            thumbOffset += i15;
            if (rectB != null) {
                int i16 = rectB.left;
                if (i16 > i15) {
                    i11 += i16 - i15;
                }
                int i17 = rectB.top;
                int i18 = rect.top;
                i = i17 > i18 ? (i17 - i18) + i12 : i12;
                int i19 = rectB.right;
                int i20 = rect.right;
                if (i19 > i20) {
                    i13 -= i19 - i20;
                }
                int i21 = rectB.bottom;
                int i22 = rect.bottom;
                if (i21 > i22) {
                    i10 = i14 - (i21 - i22);
                }
                this.f1167g.setBounds(i11, i, i13, i10);
            } else {
                i = i12;
            }
            i10 = i14;
            this.f1167g.setBounds(i11, i, i13, i10);
        }
        Drawable drawable3 = this.f1162b;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i23 = thumbOffset - rect.left;
            int i24 = thumbOffset + this.D + rect.right;
            this.f1162b.setBounds(i23, i12, i24, i14);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i23, i12, i24, i14);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f1162b;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
        Drawable drawable2 = this.f1167g;
        if (drawable2 != null) {
            drawable2.setHotspot(f10, f11);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1162b;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f1167g;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!k3.a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.B;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f1173n : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (k3.a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.B;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f1173n : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return f.I(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f1179t;
    }

    public boolean getSplitTrack() {
        return this.f1174o;
    }

    public int getSwitchMinWidth() {
        return this.f1172m;
    }

    public int getSwitchPadding() {
        return this.f1173n;
    }

    public CharSequence getTextOff() {
        return this.f1177r;
    }

    public CharSequence getTextOn() {
        return this.f1175p;
    }

    public Drawable getThumbDrawable() {
        return this.f1162b;
    }

    public final float getThumbPosition() {
        return this.A;
    }

    public int getThumbTextPadding() {
        return this.f1171l;
    }

    public ColorStateList getThumbTintList() {
        return this.f1163c;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f1164d;
    }

    public Drawable getTrackDrawable() {
        return this.f1167g;
    }

    public ColorStateList getTrackTintList() {
        return this.f1168h;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.i;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1162b;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1167g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.O;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.O.end();
        this.O = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, T);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f1167g;
        Rect rect = this.R;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.F;
        int i10 = this.H;
        int i11 = i + rect.top;
        int i12 = i10 - rect.bottom;
        Drawable drawable2 = this.f1162b;
        if (drawable != null) {
            if (!this.f1174o || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectB = w0.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectB.left;
                rect.right -= rectB.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.L : this.M;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            TextPaint textPaint = this.J;
            ColorStateList colorStateList = this.K;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i11 + i12) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f1175p : this.f1177r;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(text);
            sb2.append(' ');
            sb2.append(charSequence);
            accessibilityNodeInfo.setText(sb2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z5, int i, int i10, int i11, int i12) {
        int iMax;
        int width;
        int paddingLeft;
        int height;
        int paddingTop;
        super.onLayout(z5, i, i10, i11, i12);
        int iMax2 = 0;
        if (this.f1162b != null) {
            Drawable drawable = this.f1167g;
            Rect rect = this.R;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectB = w0.b(this.f1162b);
            iMax = Math.max(0, rectB.left - rect.left);
            iMax2 = Math.max(0, rectB.right - rect.right);
        } else {
            iMax = 0;
        }
        if (k3.a(this)) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.B + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.B) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height2 = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i13 = this.C;
            int i14 = height2 - (i13 / 2);
            height = i13 + i14;
            paddingTop = i14;
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            height = this.C + paddingTop;
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = height - this.C;
        }
        this.E = paddingLeft;
        this.F = paddingTop;
        this.H = height;
        this.G = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i10) {
        int intrinsicWidth;
        int intrinsicHeight;
        int intrinsicHeight2 = 0;
        if (this.f1179t) {
            StaticLayout staticLayout = this.L;
            TextPaint textPaint = this.J;
            if (staticLayout == null) {
                CharSequence charSequence = this.f1176q;
                this.L = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            if (this.M == null) {
                CharSequence charSequence2 = this.f1178s;
                this.M = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }
        Drawable drawable = this.f1162b;
        Rect rect = this.R;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f1162b.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f1162b.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.D = Math.max(this.f1179t ? (this.f1171l * 2) + Math.max(this.L.getWidth(), this.M.getWidth()) : 0, intrinsicWidth);
        Drawable drawable2 = this.f1167g;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f1167g.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax = rect.left;
        int iMax2 = rect.right;
        Drawable drawable3 = this.f1162b;
        if (drawable3 != null) {
            Rect rectB = w0.b(drawable3);
            iMax = Math.max(iMax, rectB.left);
            iMax2 = Math.max(iMax2, rectB.right);
        }
        int iMax3 = this.I ? Math.max(this.f1172m, (this.D * 2) + iMax + iMax2) : this.f1172m;
        int iMax4 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.B = iMax3;
        this.C = iMax4;
        super.onMeasure(i, i10);
        if (getMeasuredHeight() < iMax4) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax4);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f1175p : this.f1177r;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008c  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z5) {
        super.setAllCaps(z5);
        ((rl.b) getEmojiTextViewHelper().f28370b.f27180c).q(z5);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z5) {
        super.setChecked(z5);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object string = this.f1175p;
                if (string == null) {
                    string = getResources().getString(com.twinby.R.string.abc_capital_on);
                }
                Object obj = string;
                Field field = n0.f19900a;
                new a0(com.twinby.R.id.tag_state_description, CharSequence.class, 64, 30, 1).f(this, obj);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object string2 = this.f1177r;
            if (string2 == null) {
                string2 = getResources().getString(com.twinby.R.string.abc_capital_off);
            }
            Object obj2 = string2;
            Field field2 = n0.f19900a;
            new a0(com.twinby.R.id.tag_state_description, CharSequence.class, 64, 30, 1).f(this, obj2);
        }
        if (getWindowToken() != null) {
            Field field3 = n0.f19900a;
            if (isLaidOut()) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, S, zIsChecked ? 1.0f : 0.0f);
                this.O = objectAnimatorOfFloat;
                objectAnimatorOfFloat.setDuration(250L);
                p2.a(this.O, true);
                this.O.start();
                return;
            }
        }
        ObjectAnimator objectAnimator = this.O;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        setThumbPosition(zIsChecked ? 1.0f : 0.0f);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(f.J(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z5) {
        ((rl.b) getEmojiTextViewHelper().f28370b.f27180c).r(z5);
        setTextOnInternal(this.f1175p);
        setTextOffInternal(this.f1177r);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z5) {
        this.I = z5;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((rl.b) getEmojiTextViewHelper().f28370b.f27180c).k(inputFilterArr));
    }

    public void setShowText(boolean z5) {
        if (this.f1179t != z5) {
            this.f1179t = z5;
            requestLayout();
            if (z5) {
                d();
            }
        }
    }

    public void setSplitTrack(boolean z5) {
        this.f1174o = z5;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.f1172m = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.f1173n = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.J;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.f1177r;
        if (string == null) {
            string = getResources().getString(com.twinby.R.string.abc_capital_off);
        }
        Field field = n0.f19900a;
        new a0(com.twinby.R.id.tag_state_description, CharSequence.class, 64, 30, 1).f(this, string);
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.f1175p;
        if (string == null) {
            string = getResources().getString(com.twinby.R.string.abc_capital_on);
        }
        Field field = n0.f19900a;
        new a0(com.twinby.R.id.tag_state_description, CharSequence.class, 64, 30, 1).f(this, string);
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1162b;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1162b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f10) {
        this.A = f10;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(a.a.i(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.f1171l = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f1163c = colorStateList;
        this.f1165e = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f1164d = mode;
        this.f1166f = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1167g;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1167g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(a.a.i(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f1168h = colorStateList;
        this.f1169j = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.i = mode;
        this.f1170k = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1162b || drawable == this.f1167g;
    }
}
