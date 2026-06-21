package m;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import com.google.android.gms.internal.measurement.b4;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class k0 extends TextView {
    private final o mBackgroundTintHelper;
    private u mEmojiTextViewHelper;
    private boolean mIsSetTypefaceProcessing;
    private Future<e2.d> mPrecomputedTextFuture;
    private i0 mSuperCaller;
    private final b0 mTextClassifierHelper;
    private final h0 mTextHelper;

    public k0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private u getEmojiTextViewHelper() {
        if (this.mEmojiTextViewHelper == null) {
            this.mEmojiTextViewHelper = new u(this);
        }
        return this.mEmojiTextViewHelper;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        o oVar = this.mBackgroundTintHelper;
        if (oVar != null) {
            oVar.a();
        }
        h0 h0Var = this.mTextHelper;
        if (h0Var != null) {
            h0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (k3.f28284a) {
            return super.getAutoSizeMaxTextSize();
        }
        h0 h0Var = this.mTextHelper;
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
        h0 h0Var = this.mTextHelper;
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
        h0 h0Var = this.mTextHelper;
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
        h0 h0Var = this.mTextHelper;
        return h0Var != null ? h0Var.i.f28350f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (k3.f28284a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        h0 h0Var = this.mTextHelper;
        if (h0Var != null) {
            return h0Var.i.f28345a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return k3.f.I(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public i0 getSuperCaller() {
        if (this.mSuperCaller == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                this.mSuperCaller = new j0(this);
            } else if (i >= 26) {
                this.mSuperCaller = new i(this);
            }
        }
        return this.mSuperCaller;
    }

    public ColorStateList getSupportBackgroundTintList() {
        o oVar = this.mBackgroundTintHelper;
        if (oVar != null) {
            return oVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        o oVar = this.mBackgroundTintHelper;
        if (oVar != null) {
            return oVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        t2 t2Var = this.mTextHelper.f28231h;
        if (t2Var != null) {
            return (ColorStateList) t2Var.f28367c;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        t2 t2Var = this.mTextHelper.f28231h;
        if (t2Var != null) {
            return (PorterDuff.Mode) t2Var.f28368d;
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future<e2.d> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                k3.f.p(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        b0 b0Var;
        if (Build.VERSION.SDK_INT >= 28 || (b0Var = this.mTextClassifierHelper) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = b0Var.f28163b;
        return textClassifier == null ? a0.a(b0Var.f28162a) : textClassifier;
    }

    public e2.c getTextMetricsParamsCompat() {
        return k3.f.p(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.getClass();
        h0.f(editorInfo, inputConnectionOnCreateInputConnection, this);
        ya.e.u(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z5, int i, int i10, int i11, int i12) {
        super.onLayout(z5, i, i10, i11, i12);
        h0 h0Var = this.mTextHelper;
        if (h0Var == null || k3.f28284a) {
            return;
        }
        h0Var.i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i10) {
        Future<e2.d> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                k3.f.p(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i10);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i10, int i11) {
        super.onTextChanged(charSequence, i, i10, i11);
        h0 h0Var = this.mTextHelper;
        if (h0Var == null || k3.f28284a || !h0Var.i.f()) {
            return;
        }
        this.mTextHelper.i.a();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z5) {
        super.setAllCaps(z5);
        ((rl.b) getEmojiTextViewHelper().f28370b.f27180c).q(z5);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i10, int i11, int i12) {
        if (k3.f28284a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i10, i11, i12);
            return;
        }
        h0 h0Var = this.mTextHelper;
        if (h0Var != null) {
            h0Var.g(i, i10, i11, i12);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (k3.f28284a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        h0 h0Var = this.mTextHelper;
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
        h0 h0Var = this.mTextHelper;
        if (h0Var != null) {
            h0Var.i(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        o oVar = this.mBackgroundTintHelper;
        if (oVar != null) {
            oVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        o oVar = this.mBackgroundTintHelper;
        if (oVar != null) {
            oVar.f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        h0 h0Var = this.mTextHelper;
        if (h0Var != null) {
            h0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        h0 h0Var = this.mTextHelper;
        if (h0Var != null) {
            h0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        h0 h0Var = this.mTextHelper;
        if (h0Var != null) {
            h0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        h0 h0Var = this.mTextHelper;
        if (h0Var != null) {
            h0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(k3.f.J(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z5) {
        ((rl.b) getEmojiTextViewHelper().f28370b.f27180c).r(z5);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((rl.b) getEmojiTextViewHelper().f28370b.f27180c).k(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().d(i);
        } else {
            k3.f.A(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().a(i);
        } else {
            k3.f.C(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        f2.g.f(i);
        if (i != getPaint().getFontMetricsInt(null)) {
            setLineSpacing(i - r0, 1.0f);
        }
    }

    public void setPrecomputedText(e2.d dVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        k3.f.p(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        o oVar = this.mBackgroundTintHelper;
        if (oVar != null) {
            oVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        o oVar = this.mBackgroundTintHelper;
        if (oVar != null) {
            oVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.j(colorStateList);
        this.mTextHelper.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.k(mode);
        this.mTextHelper.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        h0 h0Var = this.mTextHelper;
        if (h0Var != null) {
            h0Var.e(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        b0 b0Var;
        if (Build.VERSION.SDK_INT >= 28 || (b0Var = this.mTextClassifierHelper) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            b0Var.f28163b = textClassifier;
        }
    }

    public void setTextFuture(Future<e2.d> future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(e2.c cVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = cVar.f16024b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(cVar.f16023a);
        setBreakStrategy(cVar.f16025c);
        setHyphenationFrequency(cVar.f16026d);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f10) {
        boolean z5 = k3.f28284a;
        if (z5) {
            super.setTextSize(i, f10);
            return;
        }
        h0 h0Var = this.mTextHelper;
        if (h0Var != null) {
            r0 r0Var = h0Var.i;
            if (z5 || r0Var.f()) {
                return;
            }
            r0Var.g(f10, i);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i) {
        Typeface typefaceCreate;
        if (this.mIsSetTypefaceProcessing) {
            return;
        }
        if (typeface == null || i <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            b4 b4Var = x1.d.f35695a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i);
        }
        this.mIsSetTypefaceProcessing = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.mIsSetTypefaceProcessing = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        s2.a(context);
        this.mIsSetTypefaceProcessing = false;
        this.mSuperCaller = null;
        r2.a(getContext(), this);
        o oVar = new o(this);
        this.mBackgroundTintHelper = oVar;
        oVar.d(attributeSet, i);
        h0 h0Var = new h0(this);
        this.mTextHelper = h0Var;
        h0Var.d(attributeSet, i);
        h0Var.b();
        b0 b0Var = new b0();
        b0Var.f28162a = this;
        this.mTextClassifierHelper = b0Var;
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i10, int i11, int i12) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? a.a.i(context, i) : null, i10 != 0 ? a.a.i(context, i10) : null, i11 != 0 ? a.a.i(context, i11) : null, i12 != 0 ? a.a.i(context, i12) : null);
        h0 h0Var = this.mTextHelper;
        if (h0Var != null) {
            h0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i10, int i11, int i12) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? a.a.i(context, i) : null, i10 != 0 ? a.a.i(context, i10) : null, i11 != 0 ? a.a.i(context, i11) : null, i12 != 0 ? a.a.i(context, i12) : null);
        h0 h0Var = this.mTextHelper;
        if (h0Var != null) {
            h0Var.b();
        }
    }
}
