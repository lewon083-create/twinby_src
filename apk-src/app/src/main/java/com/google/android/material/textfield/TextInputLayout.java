package com.google.android.material.textfield;

import ac.c;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.material.internal.CheckableImageButton;
import g2.h0;
import g2.n0;
import ic.b;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import kc.d;
import kotlin.KotlinVersion;
import m.k0;
import m.w0;
import nc.f;
import nc.g;
import nc.i;
import nc.k;
import qc.l;
import qc.m;
import qc.p;
import qc.q;
import qc.s;
import qc.t;
import qc.u;
import qc.v;
import qc.w;
import qc.x;
import rc.a;
import t.z;
import u6.j;
import ya.e;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class TextInputLayout extends LinearLayout {

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final int[][] f14670z0 = {new int[]{R.attr.state_pressed}, new int[0]};
    public ColorStateList A;
    public boolean B;
    public CharSequence C;
    public boolean D;
    public g E;
    public g F;
    public StateListDrawable G;
    public boolean H;
    public g I;
    public g J;
    public k K;
    public boolean L;
    public final int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public final Rect U;
    public final Rect V;
    public final RectF W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public Typeface f14671a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FrameLayout f14672b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public ColorDrawable f14673b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f14674c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f14675c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f14676d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final LinkedHashSet f14677d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EditText f14678e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public ColorDrawable f14679e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f14680f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f14681f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f14682g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public Drawable f14683g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f14684h;
    public ColorStateList h0;
    public int i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public ColorStateList f14685i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f14686j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int f14687j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final q f14688k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f14689k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f14690l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f14691l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f14692m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public ColorStateList f14693m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f14694n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int f14695n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public w f14696o;
    public int o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public k0 f14697p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f14698p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f14699q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f14700q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f14701r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f14702r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CharSequence f14703s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f14704s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f14705t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final b f14706t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public k0 f14707u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f14708u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ColorStateList f14709v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f14710v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f14711w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public ValueAnimator f14712w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public j f14713x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f14714x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public j f14715y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f14716y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ColorStateList f14717z;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.twinby.R.attr.textInputStyle, 2131886965), attributeSet, com.twinby.R.attr.textInputStyle);
        this.f14682g = -1;
        this.f14684h = -1;
        this.i = -1;
        this.f14686j = -1;
        this.f14688k = new q(this);
        this.f14696o = new pf.a(9);
        this.U = new Rect();
        this.V = new Rect();
        this.W = new RectF();
        this.f14677d0 = new LinkedHashSet();
        b bVar = new b(this);
        this.f14706t0 = bVar;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f14672b = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = wb.a.f35218a;
        bVar.Q = linearInterpolator;
        bVar.h(false);
        bVar.P = linearInterpolator;
        bVar.h(false);
        if (bVar.f21241g != 8388659) {
            bVar.f21241g = 8388659;
            bVar.h(false);
        }
        ic.k.a(context2, attributeSet, com.twinby.R.attr.textInputStyle, 2131886965);
        int[] iArr = vb.a.f34830v;
        ic.k.b(context2, attributeSet, iArr, com.twinby.R.attr.textInputStyle, 2131886965, 22, 20, 38, 43, 47);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.twinby.R.attr.textInputStyle, 2131886965);
        ka.k kVar = new ka.k(context2, typedArrayObtainStyledAttributes);
        s sVar = new s(this, kVar);
        this.f14674c = sVar;
        this.B = typedArrayObtainStyledAttributes.getBoolean(46, true);
        setHint(typedArrayObtainStyledAttributes.getText(4));
        this.f14710v0 = typedArrayObtainStyledAttributes.getBoolean(45, true);
        this.f14708u0 = typedArrayObtainStyledAttributes.getBoolean(40, true);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setMinEms(typedArrayObtainStyledAttributes.getInt(6, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(3)) {
            setMinWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(3, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            setMaxEms(typedArrayObtainStyledAttributes.getInt(5, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(2)) {
            setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1));
        }
        this.K = k.b(context2, attributeSet, com.twinby.R.attr.textInputStyle, 2131886965).a();
        this.M = context2.getResources().getDimensionPixelOffset(com.twinby.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.O = typedArrayObtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.twinby.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.twinby.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.P = this.Q;
        float dimension = typedArrayObtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(11, -1.0f);
        nc.j jVarE = this.K.e();
        if (dimension >= 0.0f) {
            jVarE.f29251e = new nc.a(dimension);
        }
        if (dimension2 >= 0.0f) {
            jVarE.f29252f = new nc.a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            jVarE.f29253g = new nc.a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            jVarE.f29254h = new nc.a(dimension4);
        }
        this.K = jVarE.a();
        ColorStateList colorStateListV = b4.v(context2, kVar, 7);
        if (colorStateListV != null) {
            int defaultColor = colorStateListV.getDefaultColor();
            this.f14695n0 = defaultColor;
            this.T = defaultColor;
            if (colorStateListV.isStateful()) {
                this.o0 = colorStateListV.getColorForState(new int[]{-16842910}, -1);
                this.f14698p0 = colorStateListV.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f14700q0 = colorStateListV.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f14698p0 = this.f14695n0;
                ColorStateList colorStateListB = t1.b.b(context2, com.twinby.R.color.mtrl_filled_background_color);
                this.o0 = colorStateListB.getColorForState(new int[]{-16842910}, -1);
                this.f14700q0 = colorStateListB.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.T = 0;
            this.f14695n0 = 0;
            this.o0 = 0;
            this.f14698p0 = 0;
            this.f14700q0 = 0;
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            ColorStateList colorStateListE = kVar.E(1);
            this.f14685i0 = colorStateListE;
            this.h0 = colorStateListE;
        }
        ColorStateList colorStateListV2 = b4.v(context2, kVar, 14);
        this.f14691l0 = typedArrayObtainStyledAttributes.getColor(14, 0);
        this.f14687j0 = context2.getColor(com.twinby.R.color.mtrl_textinput_default_box_stroke_color);
        this.f14702r0 = context2.getColor(com.twinby.R.color.mtrl_textinput_disabled_color);
        this.f14689k0 = context2.getColor(com.twinby.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListV2 != null) {
            setBoxStrokeColorStateList(colorStateListV2);
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(b4.v(context2, kVar, 15));
        }
        if (typedArrayObtainStyledAttributes.getResourceId(47, -1) != -1) {
            setHintTextAppearance(typedArrayObtainStyledAttributes.getResourceId(47, 0));
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(38, 0);
        CharSequence text = typedArrayObtainStyledAttributes.getText(33);
        int i = typedArrayObtainStyledAttributes.getInt(32, 1);
        boolean z5 = typedArrayObtainStyledAttributes.getBoolean(34, false);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(43, 0);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(42, false);
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(41);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(55, 0);
        CharSequence text3 = typedArrayObtainStyledAttributes.getText(54);
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(typedArrayObtainStyledAttributes.getInt(19, -1));
        this.f14701r = typedArrayObtainStyledAttributes.getResourceId(22, 0);
        this.f14699q = typedArrayObtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(typedArrayObtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i);
        setCounterOverflowTextAppearance(this.f14699q);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f14701r);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArrayObtainStyledAttributes.hasValue(39)) {
            setErrorTextColor(kVar.E(39));
        }
        if (typedArrayObtainStyledAttributes.hasValue(44)) {
            setHelperTextColor(kVar.E(44));
        }
        if (typedArrayObtainStyledAttributes.hasValue(48)) {
            setHintTextColor(kVar.E(48));
        }
        if (typedArrayObtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(kVar.E(23));
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(kVar.E(21));
        }
        if (typedArrayObtainStyledAttributes.hasValue(56)) {
            setPlaceholderTextColor(kVar.E(56));
        }
        m mVar = new m(this, kVar);
        this.f14676d = mVar;
        boolean z12 = typedArrayObtainStyledAttributes.getBoolean(0, true);
        kVar.Q();
        setImportantForAccessibility(2);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26 && i10 >= 26) {
            h0.b(this, 1);
        }
        frameLayout.addView(sVar);
        frameLayout.addView(mVar);
        addView(frameLayout);
        setEnabled(z12);
        setHelperTextEnabled(z10);
        setErrorEnabled(z5);
        setCounterEnabled(z11);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f14678e;
        if (!(editText instanceof AutoCompleteTextView) || editText.getInputType() != 0) {
            return this.E;
        }
        int iP = com.google.android.gms.internal.auth.g.p(this.f14678e, com.twinby.R.attr.colorControlHighlight);
        int i = this.N;
        int[][] iArr = f14670z0;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            g gVar = this.E;
            int i10 = this.T;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{com.google.android.gms.internal.auth.g.z(0.1f, iP, i10), i10}), gVar, gVar);
        }
        Context context = getContext();
        g gVar2 = this.E;
        TypedValue typedValueU = com.google.android.gms.internal.auth.m.u(context, "TextInputLayout", com.twinby.R.attr.colorSurface);
        int i11 = typedValueU.resourceId;
        int color = i11 != 0 ? context.getColor(i11) : typedValueU.data;
        g gVar3 = new g(gVar2.f29225b.f29209a);
        int iZ = com.google.android.gms.internal.auth.g.z(0.1f, iP, color);
        gVar3.j(new ColorStateList(iArr, new int[]{iZ, 0}));
        gVar3.setTint(color);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iZ, color});
        g gVar4 = new g(gVar2.f29225b.f29209a);
        gVar4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar3, gVar4), gVar2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.G == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.G = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.G.addState(new int[0], f(false));
        }
        return this.G;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.F == null) {
            this.F = f(true);
        }
        return this.F;
    }

    public static void k(ViewGroup viewGroup, boolean z5) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z5);
            if (childAt instanceof ViewGroup) {
                k((ViewGroup) childAt, z5);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f14678e != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f14678e = editText;
        int i = this.f14682g;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.i);
        }
        int i10 = this.f14684h;
        if (i10 != -1) {
            setMaxEms(i10);
        } else {
            setMaxWidth(this.f14686j);
        }
        this.H = false;
        i();
        setTextInputAccessibilityDelegate(new v(this));
        Typeface typeface = this.f14678e.getTypeface();
        b bVar = this.f14706t0;
        bVar.m(typeface);
        float textSize = this.f14678e.getTextSize();
        if (bVar.f21242h != textSize) {
            bVar.f21242h = textSize;
            bVar.h(false);
        }
        float letterSpacing = this.f14678e.getLetterSpacing();
        if (bVar.W != letterSpacing) {
            bVar.W = letterSpacing;
            bVar.h(false);
        }
        int gravity = this.f14678e.getGravity();
        int i11 = (gravity & (-113)) | 48;
        if (bVar.f21241g != i11) {
            bVar.f21241g = i11;
            bVar.h(false);
        }
        if (bVar.f21239f != gravity) {
            bVar.f21239f = gravity;
            bVar.h(false);
        }
        this.f14678e.addTextChangedListener(new t(this));
        if (this.h0 == null) {
            this.h0 = this.f14678e.getHintTextColors();
        }
        if (this.B) {
            if (TextUtils.isEmpty(this.C)) {
                CharSequence hint = this.f14678e.getHint();
                this.f14680f = hint;
                setHint(hint);
                this.f14678e.setHint((CharSequence) null);
            }
            this.D = true;
        }
        if (this.f14697p != null) {
            n(this.f14678e.getText());
        }
        q();
        this.f14688k.b();
        this.f14674c.bringToFront();
        m mVar = this.f14676d;
        mVar.bringToFront();
        Iterator it = this.f14677d0.iterator();
        while (it.hasNext()) {
            ((l) it.next()).a(this);
        }
        mVar.l();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        t(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.C)) {
            return;
        }
        this.C = charSequence;
        b bVar = this.f14706t0;
        if (charSequence == null || !TextUtils.equals(bVar.A, charSequence)) {
            bVar.A = charSequence;
            bVar.B = null;
            Bitmap bitmap = bVar.E;
            if (bitmap != null) {
                bitmap.recycle();
                bVar.E = null;
            }
            bVar.h(false);
        }
        if (this.f14704s0) {
            return;
        }
        j();
    }

    private void setPlaceholderTextEnabled(boolean z5) {
        if (this.f14705t == z5) {
            return;
        }
        if (z5) {
            k0 k0Var = this.f14707u;
            if (k0Var != null) {
                this.f14672b.addView(k0Var);
                this.f14707u.setVisibility(0);
            }
        } else {
            k0 k0Var2 = this.f14707u;
            if (k0Var2 != null) {
                k0Var2.setVisibility(8);
            }
            this.f14707u = null;
        }
        this.f14705t = z5;
    }

    public final void a(float f10) {
        b bVar = this.f14706t0;
        if (bVar.f21231b == f10) {
            return;
        }
        int i = 2;
        if (this.f14712w0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f14712w0 = valueAnimator;
            valueAnimator.setInterpolator(e.y(getContext(), com.twinby.R.attr.motionEasingEmphasizedInterpolator, wb.a.f35219b));
            this.f14712w0.setDuration(e.x(getContext(), com.twinby.R.attr.motionDurationMedium4, 167));
            this.f14712w0.addUpdateListener(new ac.b(i, this));
        }
        this.f14712w0.setFloatValues(bVar.f21231b, f10);
        this.f14712w0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f14672b;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        s();
        setEditText((EditText) view);
    }

    public final void b() {
        int i;
        int i10;
        g gVar = this.E;
        if (gVar == null) {
            return;
        }
        k kVar = gVar.f29225b.f29209a;
        k kVar2 = this.K;
        if (kVar != kVar2) {
            gVar.setShapeAppearanceModel(kVar2);
        }
        if (this.N == 2 && (i = this.P) > -1 && (i10 = this.S) != 0) {
            g gVar2 = this.E;
            gVar2.f29225b.f29217j = i;
            gVar2.invalidateSelf();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(i10);
            f fVar = gVar2.f29225b;
            if (fVar.f29212d != colorStateListValueOf) {
                fVar.f29212d = colorStateListValueOf;
                gVar2.onStateChange(gVar2.getState());
            }
        }
        int iC = this.T;
        if (this.N == 1) {
            iC = x1.a.c(this.T, com.google.android.gms.internal.auth.g.o(getContext(), com.twinby.R.attr.colorSurface, 0));
        }
        this.T = iC;
        this.E.j(ColorStateList.valueOf(iC));
        g gVar3 = this.I;
        if (gVar3 != null && this.J != null) {
            if (this.P > -1 && this.S != 0) {
                gVar3.j(this.f14678e.isFocused() ? ColorStateList.valueOf(this.f14687j0) : ColorStateList.valueOf(this.S));
                this.J.j(ColorStateList.valueOf(this.S));
            }
            invalidate();
        }
        r();
    }

    public final int c() {
        float fD;
        if (!this.B) {
            return 0;
        }
        int i = this.N;
        b bVar = this.f14706t0;
        if (i == 0) {
            fD = bVar.d();
        } else {
            if (i != 2) {
                return 0;
            }
            fD = bVar.d() / 2.0f;
        }
        return (int) fD;
    }

    public final j d() {
        j jVar = new j();
        jVar.setDuration(e.x(getContext(), com.twinby.R.attr.motionDurationShort2, 87));
        jVar.setInterpolator(e.y(getContext(), com.twinby.R.attr.motionEasingLinearInterpolator, wb.a.f35218a));
        return jVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.f14678e;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f14680f != null) {
            boolean z5 = this.D;
            this.D = false;
            CharSequence hint = editText.getHint();
            this.f14678e.setHint(this.f14680f);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.f14678e.setHint(hint);
                this.D = z5;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.f14672b;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i10 = 0; i10 < frameLayout.getChildCount(); i10++) {
            View childAt = frameLayout.getChildAt(i10);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i10);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.f14678e) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f14716y0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f14716y0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        g gVar;
        Canvas canvas2 = canvas;
        super.draw(canvas);
        boolean z5 = this.B;
        b bVar = this.f14706t0;
        if (z5) {
            TextPaint textPaint = bVar.N;
            RectF rectF = bVar.f21237e;
            int iSave = canvas2.save();
            if (bVar.B != null && rectF.width() > 0.0f && rectF.height() > 0.0f) {
                textPaint.setTextSize(bVar.G);
                float f10 = bVar.f21249p;
                float f11 = bVar.f21250q;
                float f12 = bVar.F;
                if (f12 != 1.0f) {
                    canvas2.scale(f12, f12, f10, f11);
                }
                if (bVar.f21236d0 <= 1 || bVar.C) {
                    canvas2.translate(f10, f11);
                    bVar.Y.draw(canvas2);
                } else {
                    float lineStart = bVar.f21249p - bVar.Y.getLineStart(0);
                    int alpha = textPaint.getAlpha();
                    canvas2.translate(lineStart, f11);
                    float f13 = alpha;
                    textPaint.setAlpha((int) (bVar.f21232b0 * f13));
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 31) {
                        float f14 = bVar.H;
                        float f15 = bVar.I;
                        float f16 = bVar.J;
                        int i10 = bVar.K;
                        textPaint.setShadowLayer(f14, f15, f16, x1.a.e(i10, (textPaint.getAlpha() * Color.alpha(i10)) / KotlinVersion.MAX_COMPONENT_VALUE));
                    }
                    bVar.Y.draw(canvas2);
                    textPaint.setAlpha((int) (bVar.f21230a0 * f13));
                    if (i >= 31) {
                        float f17 = bVar.H;
                        float f18 = bVar.I;
                        float f19 = bVar.J;
                        int i11 = bVar.K;
                        textPaint.setShadowLayer(f17, f18, f19, x1.a.e(i11, (Color.alpha(i11) * textPaint.getAlpha()) / KotlinVersion.MAX_COMPONENT_VALUE));
                    }
                    int lineBaseline = bVar.Y.getLineBaseline(0);
                    CharSequence charSequence = bVar.f21234c0;
                    float f20 = lineBaseline;
                    canvas2.drawText(charSequence, 0, charSequence.length(), 0.0f, f20, textPaint);
                    if (i >= 31) {
                        textPaint.setShadowLayer(bVar.H, bVar.I, bVar.J, bVar.K);
                    }
                    String strTrim = bVar.f21234c0.toString().trim();
                    if (strTrim.endsWith("…")) {
                        strTrim = strTrim.substring(0, strTrim.length() - 1);
                    }
                    String str = strTrim;
                    textPaint.setAlpha(alpha);
                    canvas2 = canvas;
                    canvas2.drawText(str, 0, Math.min(bVar.Y.getLineEnd(0), str.length()), 0.0f, f20, (Paint) textPaint);
                }
                canvas2.restoreToCount(iSave);
            }
        }
        if (this.J == null || (gVar = this.I) == null) {
            return;
        }
        gVar.draw(canvas2);
        if (this.f14678e.isFocused()) {
            Rect bounds = this.J.getBounds();
            Rect bounds2 = this.I.getBounds();
            float f21 = bVar.f21231b;
            int iCenterX = bounds2.centerX();
            bounds.left = wb.a.c(f21, iCenterX, bounds2.left);
            bounds.right = wb.a.c(f21, iCenterX, bounds2.right);
            this.J.draw(canvas2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void drawableStateChanged() {
        /*
            r4 = this;
            boolean r0 = r4.f14714x0
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.f14714x0 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            ic.b r3 = r4.f14706t0
            if (r3 == 0) goto L2f
            r3.L = r1
            android.content.res.ColorStateList r1 = r3.f21244k
            if (r1 == 0) goto L20
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L2a
        L20:
            android.content.res.ColorStateList r1 = r3.f21243j
            if (r1 == 0) goto L2f
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L2f
        L2a:
            r3.h(r2)
            r1 = r0
            goto L30
        L2f:
            r1 = r2
        L30:
            android.widget.EditText r3 = r4.f14678e
            if (r3 == 0) goto L47
            java.lang.reflect.Field r3 = g2.n0.f19900a
            boolean r3 = r4.isLaidOut()
            if (r3 == 0) goto L43
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L43
            goto L44
        L43:
            r0 = r2
        L44:
            r4.t(r0, r2)
        L47:
            r4.q()
            r4.w()
            if (r1 == 0) goto L52
            r4.invalidate()
        L52:
            r4.f14714x0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    public final boolean e() {
        return this.B && !TextUtils.isEmpty(this.C) && (this.E instanceof qc.g);
    }

    public final g f(boolean z5) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.twinby.R.dimen.mtrl_shape_corner_size_small_component);
        float f10 = z5 ? dimensionPixelOffset : 0.0f;
        float dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.twinby.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(com.twinby.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        i iVar = new i();
        i iVar2 = new i();
        i iVar3 = new i();
        i iVar4 = new i();
        nc.e eVar = new nc.e();
        nc.e eVar2 = new nc.e();
        nc.e eVar3 = new nc.e();
        nc.e eVar4 = new nc.e();
        nc.a aVar = new nc.a(f10);
        nc.a aVar2 = new nc.a(f10);
        nc.a aVar3 = new nc.a(dimensionPixelOffset);
        nc.a aVar4 = new nc.a(dimensionPixelOffset);
        k kVar = new k();
        kVar.f29258a = iVar;
        kVar.f29259b = iVar2;
        kVar.f29260c = iVar3;
        kVar.f29261d = iVar4;
        kVar.f29262e = aVar;
        kVar.f29263f = aVar2;
        kVar.f29264g = aVar4;
        kVar.f29265h = aVar3;
        kVar.i = eVar;
        kVar.f29266j = eVar2;
        kVar.f29267k = eVar3;
        kVar.f29268l = eVar4;
        Context context = getContext();
        Paint paint = g.f29224x;
        TypedValue typedValueU = com.google.android.gms.internal.auth.m.u(context, g.class.getSimpleName(), com.twinby.R.attr.colorSurface);
        int i = typedValueU.resourceId;
        int color = i != 0 ? context.getColor(i) : typedValueU.data;
        g gVar = new g();
        gVar.h(context);
        gVar.j(ColorStateList.valueOf(color));
        gVar.i(dimensionPixelOffset2);
        gVar.setShapeAppearanceModel(kVar);
        f fVar = gVar.f29225b;
        if (fVar.f29215g == null) {
            fVar.f29215g = new Rect();
        }
        gVar.f29225b.f29215g.set(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        gVar.invalidateSelf();
        return gVar;
    }

    public final int g(int i, boolean z5) {
        int compoundPaddingLeft = this.f14678e.getCompoundPaddingLeft() + i;
        if (getPrefixText() == null || z5) {
            return compoundPaddingLeft;
        }
        return getPrefixTextView().getPaddingLeft() + (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth());
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f14678e;
        if (editText == null) {
            return super.getBaseline();
        }
        return c() + getPaddingTop() + editText.getBaseline();
    }

    public g getBoxBackground() {
        int i = this.N;
        if (i == 1 || i == 2) {
            return this.E;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.T;
    }

    public int getBoxBackgroundMode() {
        return this.N;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.O;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean zE = ic.k.e(this);
        RectF rectF = this.W;
        return zE ? this.K.f29265h.a(rectF) : this.K.f29264g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean zE = ic.k.e(this);
        RectF rectF = this.W;
        return zE ? this.K.f29264g.a(rectF) : this.K.f29265h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean zE = ic.k.e(this);
        RectF rectF = this.W;
        return zE ? this.K.f29262e.a(rectF) : this.K.f29263f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean zE = ic.k.e(this);
        RectF rectF = this.W;
        return zE ? this.K.f29263f.a(rectF) : this.K.f29262e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f14691l0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f14693m0;
    }

    public int getBoxStrokeWidth() {
        return this.Q;
    }

    public int getBoxStrokeWidthFocused() {
        return this.R;
    }

    public int getCounterMaxLength() {
        return this.f14692m;
    }

    public CharSequence getCounterOverflowDescription() {
        k0 k0Var;
        if (this.f14690l && this.f14694n && (k0Var = this.f14697p) != null) {
            return k0Var.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.A;
    }

    public ColorStateList getCounterTextColor() {
        return this.f14717z;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.h0;
    }

    public EditText getEditText() {
        return this.f14678e;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f14676d.f32037h.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f14676d.f32037h.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f14676d.f32042n;
    }

    public int getEndIconMode() {
        return this.f14676d.f32038j;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f14676d.f32043o;
    }

    public CheckableImageButton getEndIconView() {
        return this.f14676d.f32037h;
    }

    public CharSequence getError() {
        q qVar = this.f14688k;
        if (qVar.f32077q) {
            return qVar.f32076p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f14688k.f32080t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f14688k.f32079s;
    }

    public int getErrorCurrentTextColors() {
        k0 k0Var = this.f14688k.f32078r;
        if (k0Var != null) {
            return k0Var.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f14676d.f32033d.getDrawable();
    }

    public CharSequence getHelperText() {
        q qVar = this.f14688k;
        if (qVar.f32084x) {
            return qVar.f32083w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        k0 k0Var = this.f14688k.f32085y;
        if (k0Var != null) {
            return k0Var.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.B) {
            return this.C;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f14706t0.d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        b bVar = this.f14706t0;
        return bVar.e(bVar.f21244k);
    }

    public ColorStateList getHintTextColor() {
        return this.f14685i0;
    }

    public w getLengthCounter() {
        return this.f14696o;
    }

    public int getMaxEms() {
        return this.f14684h;
    }

    public int getMaxWidth() {
        return this.f14686j;
    }

    public int getMinEms() {
        return this.f14682g;
    }

    public int getMinWidth() {
        return this.i;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f14676d.f32037h.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f14676d.f32037h.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f14705t) {
            return this.f14703s;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f14711w;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f14709v;
    }

    public CharSequence getPrefixText() {
        return this.f14674c.f32092d;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f14674c.f32091c.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f14674c.f32091c;
    }

    public k getShapeAppearanceModel() {
        return this.K;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f14674c.f32093e.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f14674c.f32093e.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f14674c.f32096h;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f14674c.i;
    }

    public CharSequence getSuffixText() {
        return this.f14676d.f32045q;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f14676d.f32046r.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f14676d.f32046r;
    }

    public Typeface getTypeface() {
        return this.f14671a0;
    }

    public final int h(int i, boolean z5) {
        int compoundPaddingRight = i - this.f14678e.getCompoundPaddingRight();
        return (getPrefixText() == null || !z5) ? compoundPaddingRight : (getPrefixTextView().getMeasuredWidth() - getPrefixTextView().getPaddingRight()) + compoundPaddingRight;
    }

    public final void i() {
        int i = this.N;
        if (i == 0) {
            this.E = null;
            this.I = null;
            this.J = null;
        } else if (i == 1) {
            this.E = new g(this.K);
            this.I = new g();
            this.J = new g();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(z.d(this.N, " is illegal; only @BoxBackgroundMode constants are supported.", new StringBuilder()));
            }
            if (!this.B || (this.E instanceof qc.g)) {
                this.E = new g(this.K);
            } else {
                k kVar = this.K;
                int i10 = qc.g.f32012z;
                if (kVar == null) {
                    kVar = new k();
                }
                qc.f fVar = new qc.f(kVar, new RectF());
                qc.g gVar = new qc.g(fVar);
                gVar.f32013y = fVar;
                this.E = gVar;
            }
            this.I = null;
            this.J = null;
        }
        r();
        w();
        if (this.N == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.O = getResources().getDimensionPixelSize(com.twinby.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (b4.D(getContext())) {
                this.O = getResources().getDimensionPixelSize(com.twinby.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f14678e != null && this.N == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.f14678e;
                Field field = n0.f19900a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(com.twinby.R.dimen.material_filled_edittext_font_2_0_padding_top), this.f14678e.getPaddingEnd(), getResources().getDimensionPixelSize(com.twinby.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (b4.D(getContext())) {
                EditText editText2 = this.f14678e;
                Field field2 = n0.f19900a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.twinby.R.dimen.material_filled_edittext_font_1_3_padding_top), this.f14678e.getPaddingEnd(), getResources().getDimensionPixelSize(com.twinby.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.N != 0) {
            s();
        }
        EditText editText3 = this.f14678e;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i11 = this.N;
                if (i11 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i11 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.j():void");
    }

    public final void l(k0 k0Var, int i) {
        try {
            k0Var.setTextAppearance(i);
            if (k0Var.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        k0Var.setTextAppearance(2131886544);
        k0Var.setTextColor(getContext().getColor(com.twinby.R.color.design_error));
    }

    public final boolean m() {
        q qVar = this.f14688k;
        return (qVar.f32075o != 1 || qVar.f32078r == null || TextUtils.isEmpty(qVar.f32076p)) ? false : true;
    }

    public final void n(Editable editable) {
        ((pf.a) this.f14696o).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z5 = this.f14694n;
        int i = this.f14692m;
        if (i == -1) {
            this.f14697p.setText(String.valueOf(length));
            this.f14697p.setContentDescription(null);
            this.f14694n = false;
        } else {
            this.f14694n = length > i;
            Context context = getContext();
            this.f14697p.setContentDescription(context.getString(this.f14694n ? com.twinby.R.string.character_counter_overflowed_content_description : com.twinby.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f14692m)));
            if (z5 != this.f14694n) {
                o();
            }
            String str = e2.b.f16018b;
            e2.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? e2.b.f16021e : e2.b.f16020d;
            k0 k0Var = this.f14697p;
            String string = getContext().getString(com.twinby.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f14692m));
            bVar.getClass();
            c cVar = e2.f.f16028a;
            k0Var.setText(string != null ? bVar.c(string).toString() : null);
        }
        if (this.f14678e == null || z5 == this.f14694n) {
            return;
        }
        t(false, false);
        w();
        q();
    }

    public final void o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        k0 k0Var = this.f14697p;
        if (k0Var != null) {
            l(k0Var, this.f14694n ? this.f14699q : this.f14701r);
            if (!this.f14694n && (colorStateList2 = this.f14717z) != null) {
                this.f14697p.setTextColor(colorStateList2);
            }
            if (!this.f14694n || (colorStateList = this.A) == null) {
                return;
            }
            this.f14697p.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f14706t0.g(configuration);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i, int i10, int i11, int i12) {
        super.onLayout(z5, i, i10, i11, i12);
        EditText editText = this.f14678e;
        if (editText != null) {
            ThreadLocal threadLocal = ic.c.f21260a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.U;
            rect.set(0, 0, width, height);
            ThreadLocal threadLocal2 = ic.c.f21260a;
            Matrix matrix = (Matrix) threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            ic.c.a(this, editText, matrix);
            ThreadLocal threadLocal3 = ic.c.f21261b;
            RectF rectF = (RectF) threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            g gVar = this.I;
            if (gVar != null) {
                int i13 = rect.bottom;
                gVar.setBounds(rect.left, i13 - this.Q, rect.right, i13);
            }
            g gVar2 = this.J;
            if (gVar2 != null) {
                int i14 = rect.bottom;
                gVar2.setBounds(rect.left, i14 - this.R, rect.right, i14);
            }
            if (this.B) {
                float textSize = this.f14678e.getTextSize();
                b bVar = this.f14706t0;
                if (bVar.f21242h != textSize) {
                    bVar.f21242h = textSize;
                    bVar.h(false);
                }
                int gravity = this.f14678e.getGravity();
                int i15 = (gravity & (-113)) | 48;
                if (bVar.f21241g != i15) {
                    bVar.f21241g = i15;
                    bVar.h(false);
                }
                if (bVar.f21239f != gravity) {
                    bVar.f21239f = gravity;
                    bVar.h(false);
                }
                if (this.f14678e == null) {
                    throw new IllegalStateException();
                }
                boolean zE = ic.k.e(this);
                int i16 = rect.bottom;
                Rect rect2 = this.V;
                rect2.bottom = i16;
                int i17 = this.N;
                if (i17 == 1) {
                    rect2.left = g(rect.left, zE);
                    rect2.top = rect.top + this.O;
                    rect2.right = h(rect.right, zE);
                } else if (i17 != 2) {
                    rect2.left = g(rect.left, zE);
                    rect2.top = getPaddingTop();
                    rect2.right = h(rect.right, zE);
                } else {
                    rect2.left = this.f14678e.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - c();
                    rect2.right = rect.right - this.f14678e.getPaddingRight();
                }
                int i18 = rect2.left;
                int i19 = rect2.top;
                int i20 = rect2.right;
                int i21 = rect2.bottom;
                Rect rect3 = bVar.f21235d;
                if (rect3.left != i18 || rect3.top != i19 || rect3.right != i20 || rect3.bottom != i21) {
                    rect3.set(i18, i19, i20, i21);
                    bVar.M = true;
                }
                if (this.f14678e == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = bVar.O;
                textPaint.setTextSize(bVar.f21242h);
                textPaint.setTypeface(bVar.f21254u);
                textPaint.setLetterSpacing(bVar.W);
                float f10 = -textPaint.ascent();
                rect2.left = this.f14678e.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.N != 1 || this.f14678e.getMinLines() > 1) ? rect.top + this.f14678e.getCompoundPaddingTop() : (int) (rect.centerY() - (f10 / 2.0f));
                rect2.right = rect.right - this.f14678e.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.N != 1 || this.f14678e.getMinLines() > 1) ? rect.bottom - this.f14678e.getCompoundPaddingBottom() : (int) (rect2.top + f10);
                rect2.bottom = compoundPaddingBottom;
                int i22 = rect2.left;
                int i23 = rect2.top;
                int i24 = rect2.right;
                Rect rect4 = bVar.f21233c;
                if (rect4.left != i22 || rect4.top != i23 || rect4.right != i24 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i22, i23, i24, compoundPaddingBottom);
                    bVar.M = true;
                }
                bVar.h(false);
                if (!e() || this.f14704s0) {
                    return;
                }
                j();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i10) {
        EditText editText;
        int iMax;
        super.onMeasure(i, i10);
        EditText editText2 = this.f14678e;
        m mVar = this.f14676d;
        boolean z5 = false;
        if (editText2 != null && this.f14678e.getMeasuredHeight() < (iMax = Math.max(mVar.getMeasuredHeight(), this.f14674c.getMeasuredHeight()))) {
            this.f14678e.setMinimumHeight(iMax);
            z5 = true;
        }
        boolean zP = p();
        if (z5 || zP) {
            this.f14678e.post(new u(this, 1));
        }
        if (this.f14707u != null && (editText = this.f14678e) != null) {
            this.f14707u.setGravity(editText.getGravity());
            this.f14707u.setPadding(this.f14678e.getCompoundPaddingLeft(), this.f14678e.getCompoundPaddingTop(), this.f14678e.getCompoundPaddingRight(), this.f14678e.getCompoundPaddingBottom());
        }
        mVar.l();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof x)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        x xVar = (x) parcelable;
        super.onRestoreInstanceState(xVar.f28536b);
        setError(xVar.f32103d);
        if (xVar.f32104e) {
            post(new u(this, 0));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z5 = i == 1;
        if (z5 != this.L) {
            nc.c cVar = this.K.f29262e;
            RectF rectF = this.W;
            float fA = cVar.a(rectF);
            float fA2 = this.K.f29263f.a(rectF);
            float fA3 = this.K.f29265h.a(rectF);
            float fA4 = this.K.f29264g.a(rectF);
            k kVar = this.K;
            e eVar = kVar.f29258a;
            e eVar2 = kVar.f29259b;
            e eVar3 = kVar.f29261d;
            e eVar4 = kVar.f29260c;
            nc.e eVar5 = new nc.e();
            nc.e eVar6 = new nc.e();
            nc.e eVar7 = new nc.e();
            nc.e eVar8 = new nc.e();
            nc.a aVar = new nc.a(fA2);
            nc.a aVar2 = new nc.a(fA);
            nc.a aVar3 = new nc.a(fA4);
            nc.a aVar4 = new nc.a(fA3);
            k kVar2 = new k();
            kVar2.f29258a = eVar2;
            kVar2.f29259b = eVar;
            kVar2.f29260c = eVar3;
            kVar2.f29261d = eVar4;
            kVar2.f29262e = aVar;
            kVar2.f29263f = aVar2;
            kVar2.f29264g = aVar4;
            kVar2.f29265h = aVar3;
            kVar2.i = eVar5;
            kVar2.f29266j = eVar6;
            kVar2.f29267k = eVar7;
            kVar2.f29268l = eVar8;
            this.L = z5;
            setShapeAppearanceModel(kVar2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        x xVar = new x(super.onSaveInstanceState());
        if (m()) {
            xVar.f32103d = getError();
        }
        m mVar = this.f14676d;
        xVar.f32104e = mVar.f32038j != 0 && mVar.f32037h.f14636e;
        return xVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean p() {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.p():boolean");
    }

    public final void q() {
        Drawable background;
        k0 k0Var;
        EditText editText = this.f14678e;
        if (editText == null || this.N != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = w0.f28391a;
        Drawable drawableMutate = background.mutate();
        if (m()) {
            drawableMutate.setColorFilter(m.q.b(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f14694n && (k0Var = this.f14697p) != null) {
            drawableMutate.setColorFilter(m.q.b(k0Var.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.f14678e.refreshDrawableState();
        }
    }

    public final void r() {
        EditText editText = this.f14678e;
        if (editText == null || this.E == null) {
            return;
        }
        if ((this.H || editText.getBackground() == null) && this.N != 0) {
            EditText editText2 = this.f14678e;
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            Field field = n0.f19900a;
            editText2.setBackground(editTextBoxBackground);
            this.H = true;
        }
    }

    public final void s() {
        if (this.N != 1) {
            FrameLayout frameLayout = this.f14672b;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iC = c();
            if (iC != layoutParams.topMargin) {
                layoutParams.topMargin = iC;
                frameLayout.requestLayout();
            }
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.T != i) {
            this.T = i;
            this.f14695n0 = i;
            this.f14698p0 = i;
            this.f14700q0 = i;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(getContext().getColor(i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f14695n0 = defaultColor;
        this.T = defaultColor;
        this.o0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f14698p0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f14700q0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.N) {
            return;
        }
        this.N = i;
        if (this.f14678e != null) {
            i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.O = i;
    }

    public void setBoxCornerFamily(int i) {
        nc.j jVarE = this.K.e();
        nc.c cVar = this.K.f29262e;
        jVarE.f29247a = a.a.c(i);
        jVarE.f29251e = cVar;
        nc.c cVar2 = this.K.f29263f;
        jVarE.f29248b = a.a.c(i);
        jVarE.f29252f = cVar2;
        nc.c cVar3 = this.K.f29265h;
        jVarE.f29250d = a.a.c(i);
        jVarE.f29254h = cVar3;
        nc.c cVar4 = this.K.f29264g;
        jVarE.f29249c = a.a.c(i);
        jVarE.f29253g = cVar4;
        this.K = jVarE.a();
        b();
    }

    public void setBoxStrokeColor(int i) {
        if (this.f14691l0 != i) {
            this.f14691l0 = i;
            w();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f14687j0 = colorStateList.getDefaultColor();
            this.f14702r0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f14689k0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f14691l0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f14691l0 != colorStateList.getDefaultColor()) {
            this.f14691l0 = colorStateList.getDefaultColor();
        }
        w();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f14693m0 != colorStateList) {
            this.f14693m0 = colorStateList;
            w();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.Q = i;
        w();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.R = i;
        w();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z5) {
        if (this.f14690l != z5) {
            q qVar = this.f14688k;
            if (z5) {
                k0 k0Var = new k0(getContext(), null);
                this.f14697p = k0Var;
                k0Var.setId(com.twinby.R.id.textinput_counter);
                Typeface typeface = this.f14671a0;
                if (typeface != null) {
                    this.f14697p.setTypeface(typeface);
                }
                this.f14697p.setMaxLines(1);
                qVar.a(this.f14697p, 2);
                ((ViewGroup.MarginLayoutParams) this.f14697p.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.twinby.R.dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.f14697p != null) {
                    EditText editText = this.f14678e;
                    n(editText != null ? editText.getText() : null);
                }
            } else {
                qVar.g(this.f14697p, 2);
                this.f14697p = null;
            }
            this.f14690l = z5;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f14692m != i) {
            if (i > 0) {
                this.f14692m = i;
            } else {
                this.f14692m = -1;
            }
            if (!this.f14690l || this.f14697p == null) {
                return;
            }
            EditText editText = this.f14678e;
            n(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f14699q != i) {
            this.f14699q = i;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.A != colorStateList) {
            this.A = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f14701r != i) {
            this.f14701r = i;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f14717z != colorStateList) {
            this.f14717z = colorStateList;
            o();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.h0 = colorStateList;
        this.f14685i0 = colorStateList;
        if (this.f14678e != null) {
            t(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z5) {
        k(this, z5);
        super.setEnabled(z5);
    }

    public void setEndIconActivated(boolean z5) {
        this.f14676d.f32037h.setActivated(z5);
    }

    public void setEndIconCheckable(boolean z5) {
        this.f14676d.f32037h.setCheckable(z5);
    }

    public void setEndIconContentDescription(int i) {
        m mVar = this.f14676d;
        CharSequence text = i != 0 ? mVar.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = mVar.f32037h;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        m mVar = this.f14676d;
        Drawable drawableI = i != 0 ? a.a.i(mVar.getContext(), i) : null;
        TextInputLayout textInputLayout = mVar.f32031b;
        CheckableImageButton checkableImageButton = mVar.f32037h;
        checkableImageButton.setImageDrawable(drawableI);
        if (drawableI != null) {
            k3.f.a(textInputLayout, checkableImageButton, mVar.f32040l, mVar.f32041m);
            k3.f.x(textInputLayout, checkableImageButton, mVar.f32040l);
        }
    }

    public void setEndIconMinSize(int i) {
        m mVar = this.f14676d;
        if (i < 0) {
            mVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != mVar.f32042n) {
            mVar.f32042n = i;
            CheckableImageButton checkableImageButton = mVar.f32037h;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = mVar.f32033d;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.f14676d.f(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        m mVar = this.f14676d;
        CheckableImageButton checkableImageButton = mVar.f32037h;
        View.OnLongClickListener onLongClickListener = mVar.f32044p;
        checkableImageButton.setOnClickListener(onClickListener);
        k3.f.B(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        m mVar = this.f14676d;
        mVar.f32044p = onLongClickListener;
        CheckableImageButton checkableImageButton = mVar.f32037h;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        k3.f.B(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        m mVar = this.f14676d;
        mVar.f32043o = scaleType;
        mVar.f32037h.setScaleType(scaleType);
        mVar.f32033d.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        m mVar = this.f14676d;
        if (mVar.f32040l != colorStateList) {
            mVar.f32040l = colorStateList;
            k3.f.a(mVar.f32031b, mVar.f32037h, colorStateList, mVar.f32041m);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        m mVar = this.f14676d;
        if (mVar.f32041m != mode) {
            mVar.f32041m = mode;
            k3.f.a(mVar.f32031b, mVar.f32037h, mVar.f32040l, mode);
        }
    }

    public void setEndIconVisible(boolean z5) {
        this.f14676d.g(z5);
    }

    public void setError(CharSequence charSequence) {
        q qVar = this.f14688k;
        if (!qVar.f32077q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            qVar.f();
            return;
        }
        qVar.c();
        qVar.f32076p = charSequence;
        qVar.f32078r.setText(charSequence);
        int i = qVar.f32074n;
        if (i != 1) {
            qVar.f32075o = 1;
        }
        qVar.i(i, qVar.f32075o, qVar.h(qVar.f32078r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        q qVar = this.f14688k;
        qVar.f32080t = i;
        k0 k0Var = qVar.f32078r;
        if (k0Var != null) {
            Field field = n0.f19900a;
            k0Var.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        q qVar = this.f14688k;
        qVar.f32079s = charSequence;
        k0 k0Var = qVar.f32078r;
        if (k0Var != null) {
            k0Var.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z5) {
        q qVar = this.f14688k;
        TextInputLayout textInputLayout = qVar.f32069h;
        if (qVar.f32077q == z5) {
            return;
        }
        qVar.c();
        if (z5) {
            k0 k0Var = new k0(qVar.f32068g, null);
            qVar.f32078r = k0Var;
            k0Var.setId(com.twinby.R.id.textinput_error);
            qVar.f32078r.setTextAlignment(5);
            Typeface typeface = qVar.B;
            if (typeface != null) {
                qVar.f32078r.setTypeface(typeface);
            }
            int i = qVar.f32081u;
            qVar.f32081u = i;
            k0 k0Var2 = qVar.f32078r;
            if (k0Var2 != null) {
                qVar.f32069h.l(k0Var2, i);
            }
            ColorStateList colorStateList = qVar.f32082v;
            qVar.f32082v = colorStateList;
            k0 k0Var3 = qVar.f32078r;
            if (k0Var3 != null && colorStateList != null) {
                k0Var3.setTextColor(colorStateList);
            }
            CharSequence charSequence = qVar.f32079s;
            qVar.f32079s = charSequence;
            k0 k0Var4 = qVar.f32078r;
            if (k0Var4 != null) {
                k0Var4.setContentDescription(charSequence);
            }
            int i10 = qVar.f32080t;
            qVar.f32080t = i10;
            k0 k0Var5 = qVar.f32078r;
            if (k0Var5 != null) {
                Field field = n0.f19900a;
                k0Var5.setAccessibilityLiveRegion(i10);
            }
            qVar.f32078r.setVisibility(4);
            qVar.a(qVar.f32078r, 0);
        } else {
            qVar.f();
            qVar.g(qVar.f32078r, 0);
            qVar.f32078r = null;
            textInputLayout.q();
            textInputLayout.w();
        }
        qVar.f32077q = z5;
    }

    public void setErrorIconDrawable(int i) {
        m mVar = this.f14676d;
        mVar.h(i != 0 ? a.a.i(mVar.getContext(), i) : null);
        k3.f.x(mVar.f32031b, mVar.f32033d, mVar.f32034e);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        m mVar = this.f14676d;
        CheckableImageButton checkableImageButton = mVar.f32033d;
        View.OnLongClickListener onLongClickListener = mVar.f32036g;
        checkableImageButton.setOnClickListener(onClickListener);
        k3.f.B(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        m mVar = this.f14676d;
        mVar.f32036g = onLongClickListener;
        CheckableImageButton checkableImageButton = mVar.f32033d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        k3.f.B(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        m mVar = this.f14676d;
        if (mVar.f32034e != colorStateList) {
            mVar.f32034e = colorStateList;
            k3.f.a(mVar.f32031b, mVar.f32033d, colorStateList, mVar.f32035f);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        m mVar = this.f14676d;
        if (mVar.f32035f != mode) {
            mVar.f32035f = mode;
            k3.f.a(mVar.f32031b, mVar.f32033d, mVar.f32034e, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        q qVar = this.f14688k;
        qVar.f32081u = i;
        k0 k0Var = qVar.f32078r;
        if (k0Var != null) {
            qVar.f32069h.l(k0Var, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        q qVar = this.f14688k;
        qVar.f32082v = colorStateList;
        k0 k0Var = qVar.f32078r;
        if (k0Var == null || colorStateList == null) {
            return;
        }
        k0Var.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z5) {
        if (this.f14708u0 != z5) {
            this.f14708u0 = z5;
            t(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        q qVar = this.f14688k;
        if (zIsEmpty) {
            if (qVar.f32084x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!qVar.f32084x) {
            setHelperTextEnabled(true);
        }
        qVar.c();
        qVar.f32083w = charSequence;
        qVar.f32085y.setText(charSequence);
        int i = qVar.f32074n;
        if (i != 2) {
            qVar.f32075o = 2;
        }
        qVar.i(i, qVar.f32075o, qVar.h(qVar.f32085y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        q qVar = this.f14688k;
        qVar.A = colorStateList;
        k0 k0Var = qVar.f32085y;
        if (k0Var == null || colorStateList == null) {
            return;
        }
        k0Var.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z5) {
        q qVar = this.f14688k;
        TextInputLayout textInputLayout = qVar.f32069h;
        if (qVar.f32084x == z5) {
            return;
        }
        qVar.c();
        if (z5) {
            k0 k0Var = new k0(qVar.f32068g, null);
            qVar.f32085y = k0Var;
            k0Var.setId(com.twinby.R.id.textinput_helper_text);
            qVar.f32085y.setTextAlignment(5);
            Typeface typeface = qVar.B;
            if (typeface != null) {
                qVar.f32085y.setTypeface(typeface);
            }
            qVar.f32085y.setVisibility(4);
            qVar.f32085y.setAccessibilityLiveRegion(1);
            int i = qVar.f32086z;
            qVar.f32086z = i;
            k0 k0Var2 = qVar.f32085y;
            if (k0Var2 != null) {
                k0Var2.setTextAppearance(i);
            }
            ColorStateList colorStateList = qVar.A;
            qVar.A = colorStateList;
            k0 k0Var3 = qVar.f32085y;
            if (k0Var3 != null && colorStateList != null) {
                k0Var3.setTextColor(colorStateList);
            }
            qVar.a(qVar.f32085y, 1);
            qVar.f32085y.setAccessibilityDelegate(new p(qVar));
        } else {
            qVar.c();
            int i10 = qVar.f32074n;
            if (i10 == 2) {
                qVar.f32075o = 0;
            }
            qVar.i(i10, qVar.f32075o, qVar.h(qVar.f32085y, ""));
            qVar.g(qVar.f32085y, 1);
            qVar.f32085y = null;
            textInputLayout.q();
            textInputLayout.w();
        }
        qVar.f32084x = z5;
    }

    public void setHelperTextTextAppearance(int i) {
        q qVar = this.f14688k;
        qVar.f32086z = i;
        k0 k0Var = qVar.f32085y;
        if (k0Var != null) {
            k0Var.setTextAppearance(i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.B) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z5) {
        this.f14710v0 = z5;
    }

    public void setHintEnabled(boolean z5) {
        if (z5 != this.B) {
            this.B = z5;
            if (z5) {
                CharSequence hint = this.f14678e.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.C)) {
                        setHint(hint);
                    }
                    this.f14678e.setHint((CharSequence) null);
                }
                this.D = true;
            } else {
                this.D = false;
                if (!TextUtils.isEmpty(this.C) && TextUtils.isEmpty(this.f14678e.getHint())) {
                    this.f14678e.setHint(this.C);
                }
                setHintInternal(null);
            }
            if (this.f14678e != null) {
                s();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        b bVar = this.f14706t0;
        TextInputLayout textInputLayout = bVar.f21229a;
        d dVar = new d(textInputLayout.getContext(), i);
        ColorStateList colorStateList = dVar.f27369j;
        if (colorStateList != null) {
            bVar.f21244k = colorStateList;
        }
        float f10 = dVar.f27370k;
        if (f10 != 0.0f) {
            bVar.i = f10;
        }
        ColorStateList colorStateList2 = dVar.f27361a;
        if (colorStateList2 != null) {
            bVar.U = colorStateList2;
        }
        bVar.S = dVar.f27365e;
        bVar.T = dVar.f27366f;
        bVar.R = dVar.f27367g;
        bVar.V = dVar.i;
        kc.a aVar = bVar.f21258y;
        if (aVar != null) {
            aVar.f27355j = true;
        }
        a7.l lVar = new a7.l(24, bVar);
        dVar.a();
        bVar.f21258y = new kc.a(lVar, dVar.f27373n);
        dVar.c(textInputLayout.getContext(), bVar.f21258y);
        bVar.h(false);
        this.f14685i0 = bVar.f21244k;
        if (this.f14678e != null) {
            t(false, false);
            s();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f14685i0 != colorStateList) {
            if (this.h0 == null) {
                b bVar = this.f14706t0;
                if (bVar.f21244k != colorStateList) {
                    bVar.f21244k = colorStateList;
                    bVar.h(false);
                }
            }
            this.f14685i0 = colorStateList;
            if (this.f14678e != null) {
                t(false, false);
            }
        }
    }

    public void setLengthCounter(w wVar) {
        this.f14696o = wVar;
    }

    public void setMaxEms(int i) {
        this.f14684h = i;
        EditText editText = this.f14678e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.f14686j = i;
        EditText editText = this.f14678e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.f14682g = i;
        EditText editText = this.f14678e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.i = i;
        EditText editText = this.f14678e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        m mVar = this.f14676d;
        mVar.f32037h.setContentDescription(i != 0 ? mVar.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        m mVar = this.f14676d;
        mVar.f32037h.setImageDrawable(i != 0 ? a.a.i(mVar.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z5) {
        m mVar = this.f14676d;
        if (z5 && mVar.f32038j != 1) {
            mVar.f(1);
        } else if (z5) {
            mVar.getClass();
        } else {
            mVar.f(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        m mVar = this.f14676d;
        mVar.f32040l = colorStateList;
        k3.f.a(mVar.f32031b, mVar.f32037h, colorStateList, mVar.f32041m);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        m mVar = this.f14676d;
        mVar.f32041m = mode;
        k3.f.a(mVar.f32031b, mVar.f32037h, mVar.f32040l, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f14707u == null) {
            k0 k0Var = new k0(getContext(), null);
            this.f14707u = k0Var;
            k0Var.setId(com.twinby.R.id.textinput_placeholder);
            this.f14707u.setImportantForAccessibility(2);
            j jVarD = d();
            this.f14713x = jVarD;
            jVarD.setStartDelay(67L);
            this.f14715y = d();
            setPlaceholderTextAppearance(this.f14711w);
            setPlaceholderTextColor(this.f14709v);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f14705t) {
                setPlaceholderTextEnabled(true);
            }
            this.f14703s = charSequence;
        }
        EditText editText = this.f14678e;
        u(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f14711w = i;
        k0 k0Var = this.f14707u;
        if (k0Var != null) {
            k0Var.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f14709v != colorStateList) {
            this.f14709v = colorStateList;
            k0 k0Var = this.f14707u;
            if (k0Var == null || colorStateList == null) {
                return;
            }
            k0Var.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        s sVar = this.f14674c;
        sVar.getClass();
        sVar.f32092d = TextUtils.isEmpty(charSequence) ? null : charSequence;
        sVar.f32091c.setText(charSequence);
        sVar.d();
    }

    public void setPrefixTextAppearance(int i) {
        this.f14674c.f32091c.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f14674c.f32091c.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(k kVar) {
        g gVar = this.E;
        if (gVar == null || gVar.f29225b.f29209a == kVar) {
            return;
        }
        this.K = kVar;
        b();
    }

    public void setStartIconCheckable(boolean z5) {
        this.f14674c.f32093e.setCheckable(z5);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? a.a.i(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        s sVar = this.f14674c;
        if (i < 0) {
            sVar.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != sVar.f32096h) {
            sVar.f32096h = i;
            CheckableImageButton checkableImageButton = sVar.f32093e;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        s sVar = this.f14674c;
        CheckableImageButton checkableImageButton = sVar.f32093e;
        View.OnLongClickListener onLongClickListener = sVar.f32097j;
        checkableImageButton.setOnClickListener(onClickListener);
        k3.f.B(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        s sVar = this.f14674c;
        sVar.f32097j = onLongClickListener;
        CheckableImageButton checkableImageButton = sVar.f32093e;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        k3.f.B(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        s sVar = this.f14674c;
        sVar.i = scaleType;
        sVar.f32093e.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        s sVar = this.f14674c;
        if (sVar.f32094f != colorStateList) {
            sVar.f32094f = colorStateList;
            k3.f.a(sVar.f32090b, sVar.f32093e, colorStateList, sVar.f32095g);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        s sVar = this.f14674c;
        if (sVar.f32095g != mode) {
            sVar.f32095g = mode;
            k3.f.a(sVar.f32090b, sVar.f32093e, sVar.f32094f, mode);
        }
    }

    public void setStartIconVisible(boolean z5) {
        this.f14674c.b(z5);
    }

    public void setSuffixText(CharSequence charSequence) {
        m mVar = this.f14676d;
        mVar.getClass();
        mVar.f32045q = TextUtils.isEmpty(charSequence) ? null : charSequence;
        mVar.f32046r.setText(charSequence);
        mVar.m();
    }

    public void setSuffixTextAppearance(int i) {
        this.f14676d.f32046r.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f14676d.f32046r.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(v vVar) {
        EditText editText = this.f14678e;
        if (editText != null) {
            n0.k(editText, vVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f14671a0) {
            this.f14671a0 = typeface;
            this.f14706t0.m(typeface);
            q qVar = this.f14688k;
            if (typeface != qVar.B) {
                qVar.B = typeface;
                k0 k0Var = qVar.f32078r;
                if (k0Var != null) {
                    k0Var.setTypeface(typeface);
                }
                k0 k0Var2 = qVar.f32085y;
                if (k0Var2 != null) {
                    k0Var2.setTypeface(typeface);
                }
            }
            k0 k0Var3 = this.f14697p;
            if (k0Var3 != null) {
                k0Var3.setTypeface(typeface);
            }
        }
    }

    public final void t(boolean z5, boolean z10) {
        ColorStateList colorStateList;
        k0 k0Var;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f14678e;
        boolean z11 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f14678e;
        boolean z12 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.h0;
        b bVar = this.f14706t0;
        if (colorStateList2 != null) {
            bVar.i(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.h0;
            bVar.i(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f14702r0) : this.f14702r0));
        } else if (m()) {
            k0 k0Var2 = this.f14688k.f32078r;
            bVar.i(k0Var2 != null ? k0Var2.getTextColors() : null);
        } else if (this.f14694n && (k0Var = this.f14697p) != null) {
            bVar.i(k0Var.getTextColors());
        } else if (z12 && (colorStateList = this.f14685i0) != null && bVar.f21244k != colorStateList) {
            bVar.f21244k = colorStateList;
            bVar.h(false);
        }
        m mVar = this.f14676d;
        s sVar = this.f14674c;
        if (z11 || !this.f14708u0 || (isEnabled() && z12)) {
            if (z10 || this.f14704s0) {
                ValueAnimator valueAnimator = this.f14712w0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f14712w0.cancel();
                }
                if (z5 && this.f14710v0) {
                    a(1.0f);
                } else {
                    bVar.k(1.0f);
                }
                this.f14704s0 = false;
                if (e()) {
                    j();
                }
                EditText editText3 = this.f14678e;
                u(editText3 != null ? editText3.getText() : null);
                sVar.f32098k = false;
                sVar.d();
                mVar.f32047s = false;
                mVar.m();
                return;
            }
            return;
        }
        if (z10 || !this.f14704s0) {
            ValueAnimator valueAnimator2 = this.f14712w0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f14712w0.cancel();
            }
            if (z5 && this.f14710v0) {
                a(0.0f);
            } else {
                bVar.k(0.0f);
            }
            if (e() && !((qc.g) this.E).f32013y.f32011q.isEmpty() && e()) {
                ((qc.g) this.E).n(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f14704s0 = true;
            k0 k0Var3 = this.f14707u;
            if (k0Var3 != null && this.f14705t) {
                k0Var3.setText((CharSequence) null);
                u6.v.a(this.f14672b, this.f14715y);
                this.f14707u.setVisibility(4);
            }
            sVar.f32098k = true;
            sVar.d();
            mVar.f32047s = true;
            mVar.m();
        }
    }

    public final void u(Editable editable) {
        ((pf.a) this.f14696o).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f14672b;
        if (length != 0 || this.f14704s0) {
            k0 k0Var = this.f14707u;
            if (k0Var == null || !this.f14705t) {
                return;
            }
            k0Var.setText((CharSequence) null);
            u6.v.a(frameLayout, this.f14715y);
            this.f14707u.setVisibility(4);
            return;
        }
        if (this.f14707u == null || !this.f14705t || TextUtils.isEmpty(this.f14703s)) {
            return;
        }
        this.f14707u.setText(this.f14703s);
        u6.v.a(frameLayout, this.f14713x);
        this.f14707u.setVisibility(0);
        this.f14707u.bringToFront();
        announceForAccessibility(this.f14703s);
    }

    public final void v(boolean z5, boolean z10) {
        int defaultColor = this.f14693m0.getDefaultColor();
        int colorForState = this.f14693m0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f14693m0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z5) {
            this.S = colorForState2;
        } else if (z10) {
            this.S = colorForState;
        } else {
            this.S = defaultColor;
        }
    }

    public final void w() {
        k0 k0Var;
        EditText editText;
        EditText editText2;
        if (this.E == null || this.N == 0) {
            return;
        }
        boolean z5 = false;
        boolean z10 = isFocused() || ((editText2 = this.f14678e) != null && editText2.hasFocus());
        boolean z11 = isHovered() || ((editText = this.f14678e) != null && editText.isHovered());
        if (m() || (this.f14697p != null && this.f14694n)) {
            z5 = true;
        }
        if (!isEnabled()) {
            this.S = this.f14702r0;
        } else if (m()) {
            if (this.f14693m0 != null) {
                v(z10, z11);
            } else {
                this.S = getErrorCurrentTextColors();
            }
        } else if (!this.f14694n || (k0Var = this.f14697p) == null) {
            if (z10) {
                this.S = this.f14691l0;
            } else if (z11) {
                this.S = this.f14689k0;
            } else {
                this.S = this.f14687j0;
            }
        } else if (this.f14693m0 != null) {
            v(z10, z11);
        } else {
            this.S = k0Var.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            Context context = getContext();
            TypedValue typedValueT = com.google.android.gms.internal.auth.m.t(context, com.twinby.R.attr.colorControlActivated);
            ColorStateList colorStateListValueOf = null;
            if (typedValueT != null) {
                int i = typedValueT.resourceId;
                if (i != 0) {
                    colorStateListValueOf = t1.b.b(context, i);
                } else {
                    int i10 = typedValueT.data;
                    if (i10 != 0) {
                        colorStateListValueOf = ColorStateList.valueOf(i10);
                    }
                }
            }
            EditText editText3 = this.f14678e;
            if (editText3 != null && editText3.getTextCursorDrawable() != null && colorStateListValueOf != null) {
                Drawable textCursorDrawable = this.f14678e.getTextCursorDrawable();
                if (z5) {
                    ColorStateList colorStateListValueOf2 = this.f14693m0;
                    if (colorStateListValueOf2 == null) {
                        colorStateListValueOf2 = ColorStateList.valueOf(this.S);
                    }
                    colorStateListValueOf = colorStateListValueOf2;
                }
                textCursorDrawable.setTintList(colorStateListValueOf);
            }
        }
        m mVar = this.f14676d;
        TextInputLayout textInputLayout = mVar.f32031b;
        CheckableImageButton checkableImageButton = mVar.f32037h;
        TextInputLayout textInputLayout2 = mVar.f32031b;
        mVar.k();
        k3.f.x(textInputLayout2, mVar.f32033d, mVar.f32034e);
        k3.f.x(textInputLayout2, checkableImageButton, mVar.f32040l);
        if (mVar.b() instanceof qc.j) {
            if (!textInputLayout.m() || checkableImageButton.getDrawable() == null) {
                k3.f.a(textInputLayout, checkableImageButton, mVar.f32040l, mVar.f32041m);
            } else {
                Drawable drawableMutate = checkableImageButton.getDrawable().mutate();
                drawableMutate.setTint(textInputLayout.getErrorCurrentTextColors());
                checkableImageButton.setImageDrawable(drawableMutate);
            }
        }
        s sVar = this.f14674c;
        k3.f.x(sVar.f32090b, sVar.f32093e, sVar.f32094f);
        if (this.N == 2) {
            int i11 = this.P;
            if (z10 && isEnabled()) {
                this.P = this.R;
            } else {
                this.P = this.Q;
            }
            if (this.P != i11 && e() && !this.f14704s0) {
                if (e()) {
                    ((qc.g) this.E).n(0.0f, 0.0f, 0.0f, 0.0f);
                }
                j();
            }
        }
        if (this.N == 1) {
            if (!isEnabled()) {
                this.T = this.o0;
            } else if (z11 && !z10) {
                this.T = this.f14700q0;
            } else if (z10) {
                this.T = this.f14698p0;
            } else {
                this.T = this.f14695n0;
            }
        }
        b();
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f14674c.f32093e;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f14674c.a(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f14676d.f32037h.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f14676d.f32037h.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f14676d.h(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f14676d.f32037h;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        m mVar = this.f14676d;
        TextInputLayout textInputLayout = mVar.f32031b;
        CheckableImageButton checkableImageButton = mVar.f32037h;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            k3.f.a(textInputLayout, checkableImageButton, mVar.f32040l, mVar.f32041m);
            k3.f.x(textInputLayout, checkableImageButton, mVar.f32040l);
        }
    }
}
