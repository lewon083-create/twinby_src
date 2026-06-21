package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.twinby.R;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p extends CheckBox {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hi.h f28333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f28334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h0 f28335d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public u f28336e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, R.attr.chipStyle);
        s2.a(context);
        r2.a(getContext(), this);
        this.f28333b = new hi.h(this);
        Context context2 = getContext();
        int[] iArr = h.a.f20301j;
        ka.k kVarJ = ka.k.J(context2, attributeSet, iArr, R.attr.chipStyle);
        TypedArray typedArray = (TypedArray) kVarJ.f27325d;
        g2.n0.j(this, getContext(), iArr, attributeSet, (TypedArray) kVarJ.f27325d, R.attr.chipStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setButtonDrawable(a.a.i(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        setButtonDrawable(a.a.i(getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setButtonDrawable(a.a.i(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setButtonTintList(kVarJ.E(2));
            }
            if (typedArray.hasValue(3)) {
                setButtonTintMode(w0.c(typedArray.getInt(3, -1), null));
            }
            kVarJ.Q();
            o oVar = new o(this);
            this.f28334c = oVar;
            oVar.d(attributeSet, R.attr.chipStyle);
            h0 h0Var = new h0(this);
            this.f28335d = h0Var;
            h0Var.d(attributeSet, R.attr.chipStyle);
            getEmojiTextViewHelper().a(attributeSet, R.attr.chipStyle);
        } catch (Throwable th2) {
            kVarJ.Q();
            throw th2;
        }
    }

    private u getEmojiTextViewHelper() {
        if (this.f28336e == null) {
            this.f28336e = new u(this);
        }
        return this.f28336e;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        o oVar = this.f28334c;
        if (oVar != null) {
            oVar.a();
        }
        h0 h0Var = this.f28335d;
        if (h0Var != null) {
            h0Var.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        hi.h hVar = this.f28333b;
        if (hVar != null) {
            hVar.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        o oVar = this.f28334c;
        if (oVar != null) {
            return oVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        o oVar = this.f28334c;
        if (oVar != null) {
            return oVar.c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        hi.h hVar = this.f28333b;
        if (hVar != null) {
            return (ColorStateList) hVar.f20601f;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        hi.h hVar = this.f28333b;
        if (hVar != null) {
            return (PorterDuff.Mode) hVar.f20602g;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        t2 t2Var = this.f28335d.f28231h;
        if (t2Var != null) {
            return (ColorStateList) t2Var.f28367c;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        t2 t2Var = this.f28335d.f28231h;
        if (t2Var != null) {
            return (PorterDuff.Mode) t2Var.f28368d;
        }
        return null;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z5) {
        super.setAllCaps(z5);
        ((rl.b) getEmojiTextViewHelper().f28370b.f27180c).q(z5);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        o oVar = this.f28334c;
        if (oVar != null) {
            oVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        o oVar = this.f28334c;
        if (oVar != null) {
            oVar.f(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        hi.h hVar = this.f28333b;
        if (hVar != null) {
            if (hVar.f20599d) {
                hVar.f20599d = false;
            } else {
                hVar.f20599d = true;
                hVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        h0 h0Var = this.f28335d;
        if (h0Var != null) {
            h0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        h0 h0Var = this.f28335d;
        if (h0Var != null) {
            h0Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z5) {
        ((rl.b) getEmojiTextViewHelper().f28370b.f27180c).r(z5);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((rl.b) getEmojiTextViewHelper().f28370b.f27180c).k(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        o oVar = this.f28334c;
        if (oVar != null) {
            oVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        o oVar = this.f28334c;
        if (oVar != null) {
            oVar.i(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        hi.h hVar = this.f28333b;
        if (hVar != null) {
            hVar.f20601f = colorStateList;
            hVar.f20597b = true;
            hVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        hi.h hVar = this.f28333b;
        if (hVar != null) {
            hVar.f20602g = mode;
            hVar.f20598c = true;
            hVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        h0 h0Var = this.f28335d;
        h0Var.j(colorStateList);
        h0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        h0 h0Var = this.f28335d;
        h0Var.k(mode);
        h0Var.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(a.a.i(getContext(), i));
    }
}
