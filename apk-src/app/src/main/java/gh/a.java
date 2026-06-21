package gh;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.yandex.mobile.ads.features.debugpanel.ui.IntegrationInspectorActivity;
import kotlin.jvm.functions.Function1;
import qc.d;
import qc.j;
import qc.r;
import yads.q90;
import yads.r61;
import yads.rb;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20149c;

    public /* synthetic */ a(int i, Object obj) {
        this.f20148b = i;
        this.f20149c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f20148b) {
            case 0:
                IntegrationInspectorActivity.a((IntegrationInspectorActivity) this.f20149c, view);
                break;
            case 1:
                d dVar = (d) this.f20149c;
                EditText editText = dVar.i;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    dVar.p();
                    break;
                }
                break;
            case 2:
                ((j) this.f20149c).t();
                break;
            case 3:
                r rVar = (r) this.f20149c;
                EditText editText2 = rVar.f32088f;
                if (editText2 != null) {
                    int selectionEnd = editText2.getSelectionEnd();
                    EditText editText3 = rVar.f32088f;
                    if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        rVar.f32088f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    } else {
                        rVar.f32088f.setTransformationMethod(null);
                    }
                    if (selectionEnd >= 0) {
                        rVar.f32088f.setSelection(selectionEnd);
                    }
                    rVar.p();
                    break;
                }
                break;
            case 4:
                q90.a((Function1) this.f20149c, view);
                break;
            case 5:
                r61.a((r61) this.f20149c, view);
                break;
            default:
                rb.a((rb) this.f20149c, view);
                break;
        }
    }
}
