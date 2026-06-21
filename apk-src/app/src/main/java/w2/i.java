package w2;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements TransformationMethod {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransformationMethod f35018b;

    public i(TransformationMethod transformationMethod) {
        this.f35018b = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f35018b;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || u2.h.a().b() != 1) {
            return charSequence;
        }
        u2.h hVarA = u2.h.a();
        hVarA.getClass();
        return hVarA.e(charSequence, 0, charSequence.length());
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z5, int i, Rect rect) {
        TransformationMethod transformationMethod = this.f35018b;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z5, i, rect);
        }
    }
}
