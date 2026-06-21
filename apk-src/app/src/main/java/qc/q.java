package qc;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.material.textfield.TextInputLayout;
import com.twinby.R;
import g2.n0;
import java.lang.reflect.Field;
import java.util.ArrayList;
import m.k0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q {
    public ColorStateList A;
    public Typeface B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f32063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f32064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f32065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f32066e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f32067f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f32068g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextInputLayout f32069h;
    public LinearLayout i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f32070j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public FrameLayout f32071k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AnimatorSet f32072l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f32073m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f32074n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f32075o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f32076p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f32077q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public k0 f32078r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CharSequence f32079s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f32080t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f32081u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ColorStateList f32082v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public CharSequence f32083w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f32084x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public k0 f32085y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f32086z;

    public q(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f32068g = context;
        this.f32069h = textInputLayout;
        this.f32073m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f32062a = ya.e.x(context, R.attr.motionDurationShort4, 217);
        this.f32063b = ya.e.x(context, R.attr.motionDurationMedium4, 167);
        this.f32064c = ya.e.x(context, R.attr.motionDurationShort4, 167);
        this.f32065d = ya.e.y(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, wb.a.f35221d);
        LinearInterpolator linearInterpolator = wb.a.f35218a;
        this.f32066e = ya.e.y(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f32067f = ya.e.y(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(k0 k0Var, int i) {
        if (this.i == null && this.f32071k == null) {
            Context context = this.f32068g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.i;
            TextInputLayout textInputLayout = this.f32069h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f32071k = new FrameLayout(context);
            this.i.addView(this.f32071k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i == 0 || i == 1) {
            this.f32071k.setVisibility(0);
            this.f32071k.addView(k0Var);
        } else {
            this.i.addView(k0Var, new LinearLayout.LayoutParams(-2, -2));
        }
        this.i.setVisibility(0);
        this.f32070j++;
    }

    public final void b() {
        if (this.i != null) {
            TextInputLayout textInputLayout = this.f32069h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f32068g;
                boolean zD = b4.D(context);
                LinearLayout linearLayout = this.i;
                Field field = n0.f19900a;
                int paddingStart = editText.getPaddingStart();
                if (zD) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (zD) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (zD) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f32072l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z5, k0 k0Var, int i, int i10, int i11) {
        if (k0Var == null || !z5) {
            return;
        }
        if (i == i11 || i == i10) {
            boolean z10 = i11 == i;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(k0Var, (Property<k0, Float>) View.ALPHA, z10 ? 1.0f : 0.0f);
            int i12 = this.f32064c;
            objectAnimatorOfFloat.setDuration(z10 ? this.f32063b : i12);
            objectAnimatorOfFloat.setInterpolator(z10 ? this.f32066e : this.f32067f);
            if (i == i11 && i10 != 0) {
                objectAnimatorOfFloat.setStartDelay(i12);
            }
            arrayList.add(objectAnimatorOfFloat);
            if (i11 != i || i10 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(k0Var, (Property<k0, Float>) View.TRANSLATION_Y, -this.f32073m, 0.0f);
            objectAnimatorOfFloat2.setDuration(this.f32062a);
            objectAnimatorOfFloat2.setInterpolator(this.f32065d);
            objectAnimatorOfFloat2.setStartDelay(i12);
            arrayList.add(objectAnimatorOfFloat2);
        }
    }

    public final TextView e(int i) {
        if (i == 1) {
            return this.f32078r;
        }
        if (i != 2) {
            return null;
        }
        return this.f32085y;
    }

    public final void f() {
        this.f32076p = null;
        c();
        if (this.f32074n == 1) {
            if (!this.f32084x || TextUtils.isEmpty(this.f32083w)) {
                this.f32075o = 0;
            } else {
                this.f32075o = 2;
            }
        }
        i(this.f32074n, this.f32075o, h(this.f32078r, ""));
    }

    public final void g(k0 k0Var, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.i;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.f32071k) != null) {
            frameLayout.removeView(k0Var);
        } else {
            linearLayout.removeView(k0Var);
        }
        int i10 = this.f32070j - 1;
        this.f32070j = i10;
        LinearLayout linearLayout2 = this.i;
        if (i10 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(k0 k0Var, CharSequence charSequence) {
        Field field = n0.f19900a;
        TextInputLayout textInputLayout = this.f32069h;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            return (this.f32075o == this.f32074n && k0Var != null && TextUtils.equals(k0Var.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    public final void i(int i, int i10, boolean z5) {
        TextView textViewE;
        TextView textViewE2;
        q qVar = this;
        if (i == i10) {
            return;
        }
        if (z5) {
            AnimatorSet animatorSet = new AnimatorSet();
            qVar.f32072l = animatorSet;
            ArrayList arrayList = new ArrayList();
            qVar.d(arrayList, qVar.f32084x, qVar.f32085y, 2, i, i10);
            qVar.d(arrayList, qVar.f32077q, qVar.f32078r, 1, i, i10);
            int size = arrayList.size();
            long jMax = 0;
            for (int i11 = 0; i11 < size; i11++) {
                Animator animator = (Animator) arrayList.get(i11);
                jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
            valueAnimatorOfInt.setDuration(jMax);
            arrayList.add(0, valueAnimatorOfInt);
            animatorSet.playTogether(arrayList);
            o oVar = new o(this, i10, e(i), i, qVar.e(i10));
            qVar = this;
            animatorSet.addListener(oVar);
            animatorSet.start();
        } else if (i != i10) {
            if (i10 != 0 && (textViewE2 = qVar.e(i10)) != null) {
                textViewE2.setVisibility(0);
                textViewE2.setAlpha(1.0f);
            }
            if (i != 0 && (textViewE = e(i)) != null) {
                textViewE.setVisibility(4);
                if (i == 1) {
                    textViewE.setText((CharSequence) null);
                }
            }
            qVar.f32074n = i10;
        }
        TextInputLayout textInputLayout = qVar.f32069h;
        textInputLayout.q();
        textInputLayout.t(z5, false);
        textInputLayout.w();
    }
}
