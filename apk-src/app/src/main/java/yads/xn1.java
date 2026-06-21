package yads;

import android.widget.FrameLayout;
import android.widget.ImageView;
import com.monetization.ads.nativeads.CustomizableMediaView;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class xn1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9 f44772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t41 f44773b;

    public /* synthetic */ xn1(v9 v9Var) {
        this(v9Var, new t41());
    }

    public final hv2 a(CustomizableMediaView customizableMediaView, oi2 oi2Var, co1 co1Var) {
        ImageView imageView = new ImageView(customizableMediaView.getContext());
        this.f44773b.getClass();
        if (!qr0.a(customizableMediaView.getContext(), pr0.f41998e)) {
            customizableMediaView.removeAllViews();
        }
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        customizableMediaView.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
        return new hv2(customizableMediaView, co1Var, new lk3(new e51(imageView, oi2Var, this.f44772a)));
    }

    public xn1(v9 v9Var, t41 t41Var) {
        this.f44772a = v9Var;
        this.f44773b = t41Var;
    }
}
