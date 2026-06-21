package m;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f28388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t2 f28389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28390c = 0;

    public w(ImageView imageView) {
        this.f28388a = imageView;
    }

    public final void a() {
        t2 t2Var;
        ImageView imageView = this.f28388a;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            w0.a(drawable);
        }
        if (drawable == null || (t2Var = this.f28389b) == null) {
            return;
        }
        q.d(drawable, t2Var, imageView.getDrawableState());
    }

    public final void b(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = this.f28388a;
        Context context = imageView.getContext();
        int[] iArr = h.a.f20297e;
        ka.k kVarJ = ka.k.J(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) kVarJ.f27325d;
        g2.n0.j(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) kVarJ.f27325d, i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = a.a.i(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                w0.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(kVarJ.E(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(w0.c(typedArray.getInt(3, -1), null));
            }
            kVarJ.Q();
        } catch (Throwable th2) {
            kVarJ.Q();
            throw th2;
        }
    }
}
