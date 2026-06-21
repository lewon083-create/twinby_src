package yads;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.yandex.mobile.ads.R$drawable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class uu0 extends kk3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x31 f43769c;

    public uu0(ImageView imageView, x31 x31Var) {
        super(imageView);
        this.f43769c = x31Var;
    }

    @Override // yads.kk3
    public final /* bridge */ /* synthetic */ boolean a(View view, Object obj) {
        return true;
    }

    @Override // yads.kk3
    public final void b(View view, Object obj) {
        ImageView imageView = (ImageView) view;
        w41 w41Var = ((ru0) obj).f42726a;
        if (w41Var == null) {
            return;
        }
        imageView.setForeground(null);
        imageView.setBackground(null);
        a(w41Var);
    }

    public final void a(w41 w41Var) {
        this.f43769c.a(w41Var, new yi.f0(12, this));
    }

    public static final void a(uu0 uu0Var, Drawable drawable) {
        if (drawable != null) {
            ImageView imageView = (ImageView) uu0Var.b();
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
                return;
            }
            return;
        }
        ImageView imageView2 = (ImageView) uu0Var.b();
        if (imageView2 != null) {
            imageView2.setImageDrawable(imageView2.getContext().getDrawable(R$drawable.monetization_ads_internal_default_adtune_feedback_icon));
        }
    }
}
