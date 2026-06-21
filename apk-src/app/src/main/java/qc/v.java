package qc;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import m.k0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends g2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextInputLayout f32102a;

    public v(TextInputLayout textInputLayout) {
        this.f32102a = textInputLayout;
    }

    @Override // g2.b
    public final void onInitializeAccessibilityNodeInfo(View view, h2.f fVar) {
        super.onInitializeAccessibilityNodeInfo(view, fVar);
        AccessibilityNodeInfo accessibilityNodeInfo = fVar.f20360a;
        TextInputLayout textInputLayout = this.f32102a;
        EditText editText = textInputLayout.getEditText();
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        boolean zIsEmpty2 = TextUtils.isEmpty(hint);
        boolean z5 = textInputLayout.f14704s0;
        boolean zIsEmpty3 = TextUtils.isEmpty(error);
        boolean z10 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String string = !zIsEmpty2 ? hint.toString() : "";
        s sVar = textInputLayout.f14674c;
        k0 k0Var = sVar.f32091c;
        if (k0Var.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(k0Var);
            accessibilityNodeInfo.setTraversalAfter(k0Var);
        } else {
            accessibilityNodeInfo.setTraversalAfter(sVar.f32093e);
        }
        if (!zIsEmpty) {
            fVar.l(text);
        } else if (!TextUtils.isEmpty(string)) {
            fVar.l(string);
            if (!z5 && placeholderText != null) {
                fVar.l(string + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            fVar.l(placeholderText);
        }
        if (!TextUtils.isEmpty(string)) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 26) {
                fVar.j(string);
            } else {
                if (!zIsEmpty) {
                    string = ((Object) text) + ", " + string;
                }
                fVar.l(string);
            }
            if (i >= 26) {
                accessibilityNodeInfo.setShowingHintText(zIsEmpty);
            } else {
                fVar.h(4, zIsEmpty);
            }
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z10) {
            if (zIsEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        k0 k0Var2 = textInputLayout.f14688k.f32085y;
        if (k0Var2 != null) {
            accessibilityNodeInfo.setLabelFor(k0Var2);
        }
        textInputLayout.f14676d.b().m(fVar);
    }

    @Override // g2.b
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        this.f32102a.f14676d.b().n(accessibilityEvent);
    }
}
