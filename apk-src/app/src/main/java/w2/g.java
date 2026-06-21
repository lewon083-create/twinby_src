package w2;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends rl.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f35014a;

    public g(TextView textView) {
        this.f35014a = new f(textView);
    }

    @Override // rl.b
    public final InputFilter[] k(InputFilter[] inputFilterArr) {
        return !(u2.h.f34028j != null) ? inputFilterArr : this.f35014a.k(inputFilterArr);
    }

    @Override // rl.b
    public final boolean n() {
        return this.f35014a.f35013c;
    }

    @Override // rl.b
    public final void q(boolean z5) {
        if (u2.h.f34028j != null) {
            this.f35014a.q(z5);
        }
    }

    @Override // rl.b
    public final void r(boolean z5) {
        f fVar = this.f35014a;
        if (u2.h.f34028j != null) {
            fVar.r(z5);
        } else {
            fVar.f35013c = z5;
        }
    }

    @Override // rl.b
    public final TransformationMethod x(TransformationMethod transformationMethod) {
        return !(u2.h.f34028j != null) ? transformationMethod : this.f35014a.x(transformationMethod);
    }
}
