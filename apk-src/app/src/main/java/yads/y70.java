package yads;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class y70 implements l41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ImageView f44941a;

    public y70(ImageView imageView) {
        this.f44941a = imageView;
    }

    @Override // yads.vp2
    public final void a(lm3 lm3Var) {
    }

    @Override // yads.l41
    public final void a(k41 k41Var, boolean z5) {
        Bitmap bitmap = k41Var.f40062a;
        if (bitmap != null) {
            this.f44941a.setImageBitmap(bitmap);
        }
    }
}
