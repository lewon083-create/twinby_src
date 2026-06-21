package yads;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class m13 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p13 f40744a = new p13();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bm f40745b = new bm();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bp f40746c = new bp();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o13 f40747d;

    public final void a(ImageView imageView) {
        imageView.removeOnLayoutChangeListener(this.f40747d);
    }

    public final void a(Drawable drawable, ImageView imageView, w41 w41Var) {
        o13 o13Var = new o13(this.f40745b, this.f40746c, this.f40744a, w41Var, drawable);
        this.f40747d = o13Var;
        imageView.addOnLayoutChangeListener(o13Var);
        if (imageView.getLayoutParams().width == -1 || imageView.getLayoutParams().height == -1 || imageView.getLayoutParams().width == -2 || imageView.getLayoutParams().height == -2) {
            imageView.setImageDrawable(drawable);
        }
    }
}
