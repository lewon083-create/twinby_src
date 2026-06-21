package m;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s extends EditText implements g2.r {
    private final t mAppCompatEmojiEditTextHelper;
    private final o mBackgroundTintHelper;
    private final j2.i mDefaultOnReceiveContentListener;
    private r mSuperCaller;
    private final b0 mTextClassifierHelper;
    private final h0 mTextHelper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        s2.a(context);
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
        this.mDefaultOnReceiveContentListener = new j2.i();
        t tVar = new t(this);
        this.mAppCompatEmojiEditTextHelper = tVar;
        tVar.b(attributeSet, i);
        initEmojiKeyListener(tVar);
    }

    private r getSuperCaller() {
        if (this.mSuperCaller == null) {
            this.mSuperCaller = new r(this);
        }
        return this.mSuperCaller;
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
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return k3.f.I(super.getCustomSelectionActionModeCallback());
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
    public TextClassifier getTextClassifier() {
        b0 b0Var;
        if (Build.VERSION.SDK_INT >= 28 || (b0Var = this.mTextClassifierHelper) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = b0Var.f28163b;
        return textClassifier == null ? a0.a(b0Var.f28162a) : textClassifier;
    }

    public void initEmojiKeyListener(t tVar) {
        KeyListener keyListener = getKeyListener();
        tVar.getClass();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerA = tVar.a(keyListener);
        if (keyListenerA == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerA);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b A[PHI: r1
      0x003b: PHI (r1v10 java.lang.String[]) = (r1v5 java.lang.String[]), (r1v11 java.lang.String[]) binds: [B:23:0x0052, B:15:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r6) {
        /*
            r5 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r6)
            m.h0 r1 = r5.mTextHelper
            r1.getClass()
            m.h0.f(r6, r0, r5)
            ya.e.u(r6, r0, r5)
            if (r0 == 0) goto L5f
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 > r2) goto L5f
            java.lang.String[] r2 = g2.n0.e(r5)
            if (r2 == 0) goto L5f
            i2.d.a(r6, r2)
            he.e r2 = new he.e
            r3 = 2
            r2.<init>(r3, r5)
            r3 = 25
            if (r1 < r3) goto L31
            i2.e r1 = new i2.e
            r1.<init>(r0, r2)
        L2f:
            r0 = r1
            goto L5f
        L31:
            java.lang.String[] r4 = i2.d.f20815a
            if (r1 < r3) goto L3d
            java.lang.String[] r1 = i2.a.e(r6)
            if (r1 == 0) goto L55
        L3b:
            r4 = r1
            goto L55
        L3d:
            android.os.Bundle r1 = r6.extras
            if (r1 != 0) goto L42
            goto L55
        L42:
            java.lang.String r3 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            java.lang.String[] r1 = r1.getStringArray(r3)
            if (r1 != 0) goto L52
            android.os.Bundle r1 = r6.extras
            java.lang.String r3 = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            java.lang.String[] r1 = r1.getStringArray(r3)
        L52:
            if (r1 == 0) goto L55
            goto L3b
        L55:
            int r1 = r4.length
            if (r1 != 0) goto L59
            goto L5f
        L59:
            i2.f r1 = new i2.f
            r1.<init>(r0, r2)
            goto L2f
        L5f:
            m.t r1 = r5.mAppCompatEmojiEditTextHelper
            w2.b r6 = r1.c(r0, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: m.s.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean zA = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && g2.n0.e(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                zA = z.a(dragEvent, this, activity);
            }
        }
        if (zA) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // g2.r
    public g2.f onReceiveContent(g2.f fVar) {
        this.mDefaultOnReceiveContentListener.getClass();
        return j2.i.a(this, fVar);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        g2.c fVar;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 || g2.n0.e(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i10 >= 31) {
                fVar = new v7.f(primaryClip, 1);
            } else {
                g2.d dVar = new g2.d();
                dVar.f19846c = primaryClip;
                dVar.f19847d = 1;
                fVar = dVar;
            }
            fVar.i(i == 16908322 ? 0 : 1);
            g2.n0.g(this, fVar.build());
        }
        return true;
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
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(k3.f.J(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z5) {
        this.mAppCompatEmojiEditTextHelper.d(z5);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.mAppCompatEmojiEditTextHelper.a(keyListener));
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

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
