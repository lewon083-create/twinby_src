package qc;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.twinby.R;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f32087e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public EditText f32088f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final gh.a f32089g;

    public r(m mVar, int i) {
        super(mVar);
        this.f32087e = R.drawable.design_password_eye;
        this.f32089g = new gh.a(3, this);
        if (i != 0) {
            this.f32087e = i;
        }
    }

    @Override // qc.n
    public final void b() {
        p();
    }

    @Override // qc.n
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // qc.n
    public final int d() {
        return this.f32087e;
    }

    @Override // qc.n
    public final View.OnClickListener f() {
        return this.f32089g;
    }

    @Override // qc.n
    public final boolean j() {
        return true;
    }

    @Override // qc.n
    public final boolean k() {
        EditText editText = this.f32088f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // qc.n
    public final void l(EditText editText) {
        this.f32088f = editText;
        p();
    }

    @Override // qc.n
    public final void q() {
        EditText editText = this.f32088f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f32088f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // qc.n
    public final void r() {
        EditText editText = this.f32088f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
