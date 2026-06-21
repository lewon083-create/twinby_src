package qc;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.twinby.R;
import g2.n0;
import java.lang.reflect.Field;
import m.k0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextInputLayout f32090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0 f32091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CharSequence f32092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CheckableImageButton f32093e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ColorStateList f32094f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f32095g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f32096h;
    public ImageView.ScaleType i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View.OnLongClickListener f32097j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f32098k;

    public s(TextInputLayout textInputLayout, ka.k kVar) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f32090b = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f32093e = checkableImageButton;
        k0 k0Var = new k0(getContext(), null);
        this.f32091c = k0Var;
        if (b4.D(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.f32097j;
        checkableImageButton.setOnClickListener(null);
        k3.f.B(checkableImageButton, onLongClickListener);
        this.f32097j = null;
        checkableImageButton.setOnLongClickListener(null);
        k3.f.B(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) kVar.f27325d;
        if (typedArray.hasValue(67)) {
            this.f32094f = b4.v(getContext(), kVar, 67);
        }
        if (typedArray.hasValue(68)) {
            this.f32095g = ic.k.f(typedArray.getInt(68, -1), null);
        }
        if (typedArray.hasValue(64)) {
            a(kVar.F(64));
            if (typedArray.hasValue(63) && checkableImageButton.getContentDescription() != (text = typedArray.getText(63))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(62, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(65, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f32096h) {
            this.f32096h = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(66)) {
            ImageView.ScaleType scaleTypeF = k3.f.f(typedArray.getInt(66, -1));
            this.i = scaleTypeF;
            checkableImageButton.setScaleType(scaleTypeF);
        }
        k0Var.setVisibility(8);
        k0Var.setId(R.id.textinput_prefix_text);
        k0Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        Field field = n0.f19900a;
        k0Var.setAccessibilityLiveRegion(1);
        k0Var.setTextAppearance(typedArray.getResourceId(58, 0));
        if (typedArray.hasValue(59)) {
            k0Var.setTextColor(kVar.E(59));
        }
        CharSequence text2 = typedArray.getText(57);
        this.f32092d = TextUtils.isEmpty(text2) ? null : text2;
        k0Var.setText(text2);
        d();
        addView(checkableImageButton);
        addView(k0Var);
    }

    public final void a(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f32093e;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f32094f;
            PorterDuff.Mode mode = this.f32095g;
            TextInputLayout textInputLayout = this.f32090b;
            k3.f.a(textInputLayout, checkableImageButton, colorStateList, mode);
            b(true);
            k3.f.x(textInputLayout, checkableImageButton, this.f32094f);
            return;
        }
        b(false);
        View.OnLongClickListener onLongClickListener = this.f32097j;
        checkableImageButton.setOnClickListener(null);
        k3.f.B(checkableImageButton, onLongClickListener);
        this.f32097j = null;
        checkableImageButton.setOnLongClickListener(null);
        k3.f.B(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void b(boolean z5) {
        CheckableImageButton checkableImageButton = this.f32093e;
        if ((checkableImageButton.getVisibility() == 0) != z5) {
            checkableImageButton.setVisibility(z5 ? 0 : 8);
            c();
            d();
        }
    }

    public final void c() {
        int paddingStart;
        EditText editText = this.f32090b.f14678e;
        if (editText == null) {
            return;
        }
        if (this.f32093e.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            Field field = n0.f19900a;
            paddingStart = editText.getPaddingStart();
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        Field field2 = n0.f19900a;
        this.f32091c.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void d() {
        int i = (this.f32092d == null || this.f32098k) ? 8 : 0;
        setVisibility((this.f32093e.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.f32091c.setVisibility(i);
        this.f32090b.p();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i10) {
        super.onMeasure(i, i10);
        c();
    }
}
