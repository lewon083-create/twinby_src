package qc;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f32030a;

    public l(m mVar) {
        this.f32030a = mVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        m mVar = this.f32030a;
        k kVar = mVar.f32051w;
        if (mVar.f32048t == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = mVar.f32048t;
        if (editText != null) {
            editText.removeTextChangedListener(kVar);
            if (mVar.f32048t.getOnFocusChangeListener() == mVar.b().e()) {
                mVar.f32048t.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        mVar.f32048t = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(kVar);
        }
        mVar.b().l(mVar.f32048t);
        mVar.i(mVar.b());
    }
}
