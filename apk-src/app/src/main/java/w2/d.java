package w2;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f35007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f35008b;

    public d(TextView textView) {
        this.f35007a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i10, Spanned spanned, int i11, int i12) {
        TextView textView = this.f35007a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iB = u2.h.a().b();
        if (iB != 0) {
            if (iB == 1) {
                if ((i12 == 0 && i11 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i10 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i10);
                }
                return u2.h.a().e(charSequence, 0, charSequence.length());
            }
            if (iB != 3) {
                return charSequence;
            }
        }
        u2.h hVarA = u2.h.a();
        if (this.f35008b == null) {
            this.f35008b = new c(textView, this);
        }
        hVarA.f(this.f35008b);
        return charSequence;
    }
}
