package w2;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends rl.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f35011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f35012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f35013c = true;

    public f(TextView textView) {
        this.f35011a = textView;
        this.f35012b = new d(textView);
    }

    @Override // rl.b
    public final InputFilter[] k(InputFilter[] inputFilterArr) {
        if (!this.f35013c) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof d) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                if (sparseArray.indexOfKey(i11) < 0) {
                    inputFilterArr2[i10] = inputFilterArr[i11];
                    i10++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i12 = 0;
        while (true) {
            d dVar = this.f35012b;
            if (i12 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = dVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i12] == dVar) {
                return inputFilterArr;
            }
            i12++;
        }
    }

    @Override // rl.b
    public final boolean n() {
        return this.f35013c;
    }

    @Override // rl.b
    public final void q(boolean z5) {
        if (z5) {
            TextView textView = this.f35011a;
            textView.setTransformationMethod(x(textView.getTransformationMethod()));
        }
    }

    @Override // rl.b
    public final void r(boolean z5) {
        this.f35013c = z5;
        TextView textView = this.f35011a;
        textView.setTransformationMethod(x(textView.getTransformationMethod()));
        textView.setFilters(k(textView.getFilters()));
    }

    @Override // rl.b
    public final TransformationMethod x(TransformationMethod transformationMethod) {
        return this.f35013c ? ((transformationMethod instanceof i) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new i(transformationMethod) : transformationMethod instanceof i ? ((i) transformationMethod).f35018b : transformationMethod;
    }
}
