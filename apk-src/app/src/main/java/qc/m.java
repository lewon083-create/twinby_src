package qc;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.ads.q5;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.twinby.R;
import g2.n0;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedHashSet;
import m.k0;
import ni.x0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextInputLayout f32031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FrameLayout f32032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f32033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ColorStateList f32034e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f32035f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View.OnLongClickListener f32036g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CheckableImageButton f32037h;
    public final q5 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f32038j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedHashSet f32039k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ColorStateList f32040l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f32041m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f32042n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ImageView.ScaleType f32043o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View.OnLongClickListener f32044p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f32045q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final k0 f32046r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f32047s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public EditText f32048t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final AccessibilityManager f32049u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public x0 f32050v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final k f32051w;

    public m(TextInputLayout textInputLayout, ka.k kVar) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f32038j = 0;
        this.f32039k = new LinkedHashSet();
        this.f32051w = new k(this);
        l lVar = new l(this);
        this.f32049u = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f32031b = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f32032c = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonA = a(this, layoutInflaterFrom, R.id.text_input_error_icon);
        this.f32033d = checkableImageButtonA;
        CheckableImageButton checkableImageButtonA2 = a(frameLayout, layoutInflaterFrom, R.id.text_input_end_icon);
        this.f32037h = checkableImageButtonA2;
        this.i = new q5(this, kVar);
        k0 k0Var = new k0(getContext(), null);
        this.f32046r = k0Var;
        TypedArray typedArray = (TypedArray) kVar.f27325d;
        if (typedArray.hasValue(36)) {
            this.f32034e = b4.v(getContext(), kVar, 36);
        }
        if (typedArray.hasValue(37)) {
            this.f32035f = ic.k.f(typedArray.getInt(37, -1), null);
        }
        if (typedArray.hasValue(35)) {
            h(kVar.F(35));
        }
        checkableImageButtonA.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        Field field = n0.f19900a;
        checkableImageButtonA.setImportantForAccessibility(2);
        checkableImageButtonA.setClickable(false);
        checkableImageButtonA.setPressable(false);
        checkableImageButtonA.setFocusable(false);
        if (!typedArray.hasValue(51)) {
            if (typedArray.hasValue(30)) {
                this.f32040l = b4.v(getContext(), kVar, 30);
            }
            if (typedArray.hasValue(31)) {
                this.f32041m = ic.k.f(typedArray.getInt(31, -1), null);
            }
        }
        if (typedArray.hasValue(28)) {
            f(typedArray.getInt(28, 0));
            if (typedArray.hasValue(25) && checkableImageButtonA2.getContentDescription() != (text = typedArray.getText(25))) {
                checkableImageButtonA2.setContentDescription(text);
            }
            checkableImageButtonA2.setCheckable(typedArray.getBoolean(24, true));
        } else if (typedArray.hasValue(51)) {
            if (typedArray.hasValue(52)) {
                this.f32040l = b4.v(getContext(), kVar, 52);
            }
            if (typedArray.hasValue(53)) {
                this.f32041m = ic.k.f(typedArray.getInt(53, -1), null);
            }
            f(typedArray.getBoolean(51, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(49);
            if (checkableImageButtonA2.getContentDescription() != text2) {
                checkableImageButtonA2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(27, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f32042n) {
            this.f32042n = dimensionPixelSize;
            checkableImageButtonA2.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA2.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonA.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(29)) {
            ImageView.ScaleType scaleTypeF = k3.f.f(typedArray.getInt(29, -1));
            this.f32043o = scaleTypeF;
            checkableImageButtonA2.setScaleType(scaleTypeF);
            checkableImageButtonA.setScaleType(scaleTypeF);
        }
        k0Var.setVisibility(8);
        k0Var.setId(R.id.textinput_suffix_text);
        k0Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        k0Var.setAccessibilityLiveRegion(1);
        k0Var.setTextAppearance(typedArray.getResourceId(70, 0));
        if (typedArray.hasValue(71)) {
            k0Var.setTextColor(kVar.E(71));
        }
        CharSequence text3 = typedArray.getText(69);
        this.f32045q = TextUtils.isEmpty(text3) ? null : text3;
        k0Var.setText(text3);
        m();
        frameLayout.addView(checkableImageButtonA2);
        addView(k0Var);
        addView(frameLayout);
        addView(checkableImageButtonA);
        textInputLayout.f14677d0.add(lVar);
        if (textInputLayout.f14678e != null) {
            lVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new l.d(2, this));
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (b4.D(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final n b() {
        n eVar;
        int i = this.f32038j;
        q5 q5Var = this.i;
        SparseArray sparseArray = (SparseArray) q5Var.f9334c;
        n nVar = (n) sparseArray.get(i);
        if (nVar != null) {
            return nVar;
        }
        m mVar = (m) q5Var.f9335d;
        if (i == -1) {
            eVar = new e(mVar, 0);
        } else if (i == 0) {
            eVar = new e(mVar, 1);
        } else if (i == 1) {
            eVar = new r(mVar, q5Var.f9333b);
        } else if (i == 2) {
            eVar = new d(mVar);
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(l7.o.i(i, "Invalid end icon mode: "));
            }
            eVar = new j(mVar);
        }
        sparseArray.append(i, eVar);
        return eVar;
    }

    public final boolean c() {
        return this.f32032c.getVisibility() == 0 && this.f32037h.getVisibility() == 0;
    }

    public final boolean d() {
        return this.f32033d.getVisibility() == 0;
    }

    public final void e(boolean z5) {
        boolean z10;
        boolean zIsActivated;
        boolean z11;
        n nVarB = b();
        boolean zJ = nVarB.j();
        CheckableImageButton checkableImageButton = this.f32037h;
        boolean z12 = true;
        if (!zJ || (z11 = checkableImageButton.f14636e) == nVarB.k()) {
            z10 = false;
        } else {
            checkableImageButton.setChecked(!z11);
            z10 = true;
        }
        if (!(nVarB instanceof j) || (zIsActivated = checkableImageButton.isActivated()) == ((j) nVarB).f32022l) {
            z12 = z10;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z5 || z12) {
            k3.f.x(this.f32031b, checkableImageButton, this.f32040l);
        }
    }

    public final void f(int i) {
        if (this.f32038j == i) {
            return;
        }
        n nVarB = b();
        x0 x0Var = this.f32050v;
        AccessibilityManager accessibilityManager = this.f32049u;
        if (x0Var != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new h2.b(x0Var));
        }
        this.f32050v = null;
        nVarB.r();
        this.f32038j = i;
        Iterator it = this.f32039k.iterator();
        if (it.hasNext()) {
            throw om1.i(it);
        }
        g(i != 0);
        n nVarB2 = b();
        int iD = this.i.f9332a;
        if (iD == 0) {
            iD = nVarB2.d();
        }
        Drawable drawableI = iD != 0 ? a.a.i(getContext(), iD) : null;
        CheckableImageButton checkableImageButton = this.f32037h;
        checkableImageButton.setImageDrawable(drawableI);
        TextInputLayout textInputLayout = this.f32031b;
        if (drawableI != null) {
            k3.f.a(textInputLayout, checkableImageButton, this.f32040l, this.f32041m);
            k3.f.x(textInputLayout, checkableImageButton, this.f32040l);
        }
        int iC = nVarB2.c();
        CharSequence text = iC != 0 ? getResources().getText(iC) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(nVarB2.j());
        if (!nVarB2.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        nVarB2.q();
        x0 x0VarH = nVarB2.h();
        this.f32050v = x0VarH;
        if (x0VarH != null && accessibilityManager != null) {
            Field field = n0.f19900a;
            if (isAttachedToWindow()) {
                accessibilityManager.addTouchExplorationStateChangeListener(new h2.b(this.f32050v));
            }
        }
        View.OnClickListener onClickListenerF = nVarB2.f();
        View.OnLongClickListener onLongClickListener = this.f32044p;
        checkableImageButton.setOnClickListener(onClickListenerF);
        k3.f.B(checkableImageButton, onLongClickListener);
        EditText editText = this.f32048t;
        if (editText != null) {
            nVarB2.l(editText);
            i(nVarB2);
        }
        k3.f.a(textInputLayout, checkableImageButton, this.f32040l, this.f32041m);
        e(true);
    }

    public final void g(boolean z5) {
        if (c() != z5) {
            this.f32037h.setVisibility(z5 ? 0 : 8);
            j();
            l();
            this.f32031b.p();
        }
    }

    public final void h(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f32033d;
        checkableImageButton.setImageDrawable(drawable);
        k();
        k3.f.a(this.f32031b, checkableImageButton, this.f32034e, this.f32035f);
    }

    public final void i(n nVar) {
        if (this.f32048t == null) {
            return;
        }
        if (nVar.e() != null) {
            this.f32048t.setOnFocusChangeListener(nVar.e());
        }
        if (nVar.g() != null) {
            this.f32037h.setOnFocusChangeListener(nVar.g());
        }
    }

    public final void j() {
        this.f32032c.setVisibility((this.f32037h.getVisibility() != 0 || d()) ? 8 : 0);
        setVisibility((c() || d() || ((this.f32045q == null || this.f32047s) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    public final void k() {
        CheckableImageButton checkableImageButton = this.f32033d;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f32031b;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f14688k.f32077q && textInputLayout.m()) ? 0 : 8);
        j();
        l();
        if (this.f32038j != 0) {
            return;
        }
        textInputLayout.p();
    }

    public final void l() {
        int paddingEnd;
        TextInputLayout textInputLayout = this.f32031b;
        if (textInputLayout.f14678e == null) {
            return;
        }
        if (c() || d()) {
            paddingEnd = 0;
        } else {
            EditText editText = textInputLayout.f14678e;
            Field field = n0.f19900a;
            paddingEnd = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.f14678e.getPaddingTop();
        int paddingBottom = textInputLayout.f14678e.getPaddingBottom();
        Field field2 = n0.f19900a;
        this.f32046r.setPaddingRelative(dimensionPixelSize, paddingTop, paddingEnd, paddingBottom);
    }

    public final void m() {
        k0 k0Var = this.f32046r;
        int visibility = k0Var.getVisibility();
        int i = (this.f32045q == null || this.f32047s) ? 8 : 0;
        if (visibility != i) {
            b().o(i == 0);
        }
        j();
        k0Var.setVisibility(i);
        this.f32031b.p();
    }
}
