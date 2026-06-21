package yads;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.ProgressBar;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class hj2 implements u31 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ dk.i[] f39219c = {wb.a(hj2.class, "preview", "getPreview()Landroid/widget/ImageView;", 0), wb.a(hj2.class, "progressBar", "getProgressBar()Landroid/widget/ProgressBar;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nm2 f39220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nm2 f39221b;

    public hj2(ImageView imageView, ProgressBar progressBar) {
        this.f39220a = om2.a(imageView);
        this.f39221b = om2.a(progressBar);
    }

    @Override // yads.u31
    public final void a(Drawable drawable) {
        if (drawable == null) {
            nm2 nm2Var = this.f39221b;
            dk.i iVar = f39219c[1];
            ProgressBar progressBar = (ProgressBar) nm2Var.f41294a.get();
            if (progressBar != null) {
                progressBar.setVisibility(0);
                return;
            }
            return;
        }
        nm2 nm2Var2 = this.f39220a;
        dk.i[] iVarArr = f39219c;
        dk.i iVar2 = iVarArr[0];
        ImageView imageView = (ImageView) nm2Var2.f41294a.get();
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
            imageView.setVisibility(0);
            return;
        }
        nm2 nm2Var3 = this.f39221b;
        dk.i iVar3 = iVarArr[1];
        ProgressBar progressBar2 = (ProgressBar) nm2Var3.f41294a.get();
        if (progressBar2 != null) {
            progressBar2.setVisibility(0);
        }
    }
}
