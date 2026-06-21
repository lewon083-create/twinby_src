package w2;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends u2.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f35005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f35006b;

    public c(TextView textView, d dVar) {
        this.f35005a = new WeakReference(textView);
        this.f35006b = new WeakReference(dVar);
    }

    @Override // u2.f
    public final void b() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f35005a.get();
        InputFilter inputFilter = (InputFilter) this.f35006b.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    u2.h hVarA = u2.h.a();
                    if (text == null) {
                        length = 0;
                    } else {
                        hVarA.getClass();
                        length = text.length();
                    }
                    CharSequence charSequenceE = hVarA.e(text, 0, length);
                    if (text == charSequenceE) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(charSequenceE);
                    int selectionEnd = Selection.getSelectionEnd(charSequenceE);
                    textView.setText(charSequenceE);
                    if (charSequenceE instanceof Spannable) {
                        Spannable spannable = (Spannable) charSequenceE;
                        if (selectionStart >= 0 && selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                            return;
                        } else if (selectionStart >= 0) {
                            Selection.setSelection(spannable, selectionStart);
                            return;
                        } else {
                            if (selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionEnd);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }
}
