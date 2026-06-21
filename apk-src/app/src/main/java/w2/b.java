package w2;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import com.google.firebase.messaging.y;
import java.nio.ByteBuffer;
import oa.k;
import t9.h0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditText f35003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f35004b;

    public b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        h0 h0Var = new h0();
        super(inputConnection, false);
        this.f35003a = editText;
        this.f35004b = h0Var;
        if (u2.h.f34028j != null) {
            u2.h hVarA = u2.h.a();
            if (hVarA.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            k kVar = hVarA.f34033e;
            kVar.getClass();
            Bundle bundle = editorInfo.extras;
            v2.b bVar = (v2.b) ((y) kVar.f29860c).f14899b;
            int iA = bVar.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? ((ByteBuffer) bVar.f19839e).getInt(iA + bVar.f19836b) : 0);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i10) {
        Editable editableText = this.f35003a.getEditableText();
        this.f35004b.getClass();
        return h0.g(this, editableText, i, i10, false) || super.deleteSurroundingText(i, i10);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i10) {
        Editable editableText = this.f35003a.getEditableText();
        this.f35004b.getClass();
        return h0.g(this, editableText, i, i10, true) || super.deleteSurroundingTextInCodePoints(i, i10);
    }
}
