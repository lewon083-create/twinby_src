package w2;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import m.q2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements TextWatcher {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EditText f35015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q2 f35016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f35017d = true;

    public h(EditText editText) {
        this.f35015b = editText;
    }

    public static void a(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            u2.h hVarA = u2.h.a();
            if (editableText == null) {
                length = 0;
            } else {
                hVarA.getClass();
                length = editableText.length();
            }
            hVarA.e(editableText, 0, length);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i10, int i11) {
        EditText editText = this.f35015b;
        if (editText.isInEditMode() || !this.f35017d || u2.h.f34028j == null || i10 > i11 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iB = u2.h.a().b();
        if (iB != 0) {
            if (iB == 1) {
                u2.h.a().e((Spannable) charSequence, i, i11 + i);
                return;
            } else if (iB != 3) {
                return;
            }
        }
        u2.h hVarA = u2.h.a();
        if (this.f35016c == null) {
            this.f35016c = new q2(editText);
        }
        hVarA.f(this.f35016c);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i10, int i11) {
    }
}
