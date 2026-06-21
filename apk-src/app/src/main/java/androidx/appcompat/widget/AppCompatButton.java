package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.twinby.R;
import k3.f;
import m.h0;
import m.k3;
import m.o;
import m.r0;
import m.r2;
import m.s2;
import m.t2;
import m.u;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatButton extends Button {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f1129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h0 f1130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u f1131d;

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    private u getEmojiTextViewHelper() {
        if (this.f1131d == null) {
            this.f1131d = new u(this);
        }
        return this.f1131d;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        o oVar = this.f1129b;
        if (oVar != null) {
            oVar.a();
        }
        h0 h0Var = this.f1130c;
        if (h0Var != null) {
            h0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (k3.f28284a) {
            return super.getAutoSizeMaxTextSize();
        }
        h0 h0Var = this.f1130c;
        if (h0Var != null) {
            return Math.round(h0Var.i.f28349e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (k3.f28284a) {
            return super.getAutoSizeMinTextSize();
        }
        h0 h0Var = this.f1130c;
        if (h0Var != null) {
            return Math.round(h0Var.i.f28348d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (k3.f28284a) {
            return super.getAutoSizeStepGranularity();
        }
        h0 h0Var = this.f1130c;
        if (h0Var != null) {
            return Math.round(h0Var.i.f28347c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (k3.f28284a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        h0 h0Var = this.f1130c;
        return h0Var != null ? h0Var.i.f28350f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (k3.f28284a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        h0 h0Var = this.f1130c;
        if (h0Var != null) {
            return h0Var.i.f28345a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return f.I(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        o oVar = this.f1129b;
        if (oVar != null) {
            return oVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        o oVar = this.f1129b;
        if (oVar != null) {
            return oVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        t2 t2Var = this.f1130c.f28231h;
        if (t2Var != null) {
            return (ColorStateList) t2Var.f28367c;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        t2 t2Var = this.f1130c.f28231h;
        if (t2Var != null) {
            return (PorterDuff.Mode) t2Var.f28368d;
        }
        return null;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z5, int i, int i10, int i11, int i12) {
        super.onLayout(z5, i, i10, i11, i12);
        h0 h0Var = this.f1130c;
        if (h0Var == null || k3.f28284a) {
            return;
        }
        h0Var.i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i10, int i11) {
        super.onTextChanged(charSequence, i, i10, i11);
        h0 h0Var = this.f1130c;
        if (h0Var != null) {
            r0 r0Var = h0Var.i;
            if (k3.f28284a || !r0Var.f()) {
                return;
            }
            r0Var.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z5) {
        super.setAllCaps(z5);
        ((rl.b) getEmojiTextViewHelper().f28370b.f27180c).q(z5);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i10, int i11, int i12) {
        if (k3.f28284a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i10, i11, i12);
            return;
        }
        h0 h0Var = this.f1130c;
        if (h0Var != null) {
            h0Var.g(i, i10, i11, i12);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (k3.f28284a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        h0 h0Var = this.f1130c;
        if (h0Var != null) {
            h0Var.h(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (k3.f28284a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        h0 h0Var = this.f1130c;
        if (h0Var != null) {
            h0Var.i(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        o oVar = this.f1129b;
        if (oVar != null) {
            oVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        o oVar = this.f1129b;
        if (oVar != null) {
            oVar.f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(f.J(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z5) {
        ((rl.b) getEmojiTextViewHelper().f28370b.f27180c).r(z5);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((rl.b) getEmojiTextViewHelper().f28370b.f27180c).k(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z5) {
        h0 h0Var = this.f1130c;
        if (h0Var != null) {
            h0Var.f28224a.setAllCaps(z5);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        o oVar = this.f1129b;
        if (oVar != null) {
            oVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        o oVar = this.f1129b;
        if (oVar != null) {
            oVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        h0 h0Var = this.f1130c;
        h0Var.j(colorStateList);
        h0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        h0 h0Var = this.f1130c;
        h0Var.k(mode);
        h0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        h0 h0Var = this.f1130c;
        if (h0Var != null) {
            h0Var.e(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f10) {
        boolean z5 = k3.f28284a;
        if (z5) {
            super.setTextSize(i, f10);
            return;
        }
        h0 h0Var = this.f1130c;
        if (h0Var != null) {
            r0 r0Var = h0Var.i;
            if (z5 || r0Var.f()) {
                return;
            }
            r0Var.g(f10, i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        s2.a(context);
        r2.a(getContext(), this);
        o oVar = new o(this);
        this.f1129b = oVar;
        oVar.d(attributeSet, i);
        h0 h0Var = new h0(this);
        this.f1130c = h0Var;
        h0Var.d(attributeSet, i);
        h0Var.b();
        getEmojiTextViewHelper().a(attributeSet, i);
    }
}
