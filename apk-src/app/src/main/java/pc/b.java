package pc;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.internal.auth.g;
import com.google.android.gms.internal.measurement.b4;
import com.twinby.R;
import g2.n0;
import java.lang.reflect.Field;
import nc.k;
import p9.h;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b extends FrameLayout {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final h f31456j = new h(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f31457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f31458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f31459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f31460e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f31461f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f31462g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ColorStateList f31463h;
    public PorterDuff.Mode i;

    public b(Context context, AttributeSet attributeSet) {
        Drawable drawable;
        super(rc.a.a(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, vb.a.f34827s);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
            Field field = n0.f19900a;
            setElevation(dimensionPixelSize);
        }
        this.f31458c = typedArrayObtainStyledAttributes.getInt(2, 0);
        if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
            this.f31457b = k.b(context2, attributeSet, 0, 0).a();
        }
        this.f31459d = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(b4.u(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(ic.k.f(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f31460e = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        this.f31461f = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f31462g = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(f31456j);
        setFocusable(true);
        if (getBackground() == null) {
            int iZ = g.z(getBackgroundOverlayColorAlpha(), g.p(this, R.attr.colorSurface), g.p(this, R.attr.colorOnSurface));
            k kVar = this.f31457b;
            if (kVar != null) {
                int i = c.f31464a;
                nc.g gVar = new nc.g(kVar);
                gVar.j(ColorStateList.valueOf(iZ));
                drawable = gVar;
            } else {
                Resources resources = getResources();
                int i10 = c.f31464a;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(dimension);
                gradientDrawable.setColor(iZ);
                drawable = gradientDrawable;
            }
            ColorStateList colorStateList = this.f31463h;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
            Field field2 = n0.f19900a;
            setBackground(drawable);
        }
    }

    public float getActionTextColorAlpha() {
        return this.f31460e;
    }

    public int getAnimationMode() {
        return this.f31458c;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f31459d;
    }

    public int getMaxInlineActionWidth() {
        return this.f31462g;
    }

    public int getMaxWidth() {
        return this.f31461f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Field field = n0.f19900a;
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i, int i10, int i11, int i12) {
        super.onLayout(z5, i, i10, i11, i12);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i10) {
        super.onMeasure(i, i10);
        int i11 = this.f31461f;
        if (i11 <= 0 || getMeasuredWidth() <= i11) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), i10);
    }

    public void setAnimationMode(int i) {
        this.f31458c = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f31463h != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.f31463h);
            drawable.setTintMode(this.i);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f31463h = colorStateList;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintList(colorStateList);
            drawableMutate.setTintMode(this.i);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.i = mode;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintMode(mode);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f31456j);
        super.setOnClickListener(onClickListener);
    }

    private void setBaseTransientBottomBar(c cVar) {
    }
}
