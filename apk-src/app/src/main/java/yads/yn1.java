package yads;

import android.content.Context;
import android.widget.FrameLayout;
import com.monetization.ads.nativeads.CustomizableMediaView;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class yn1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final on1 f45123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nw1 f45124b;

    public /* synthetic */ yn1() {
        this(new on1(), new nw1());
    }

    public final iv2 a(CustomizableMediaView customizableMediaView, qj1 qj1Var, z51 z51Var, r72 r72Var, co1 co1Var) {
        Context context = customizableMediaView.getContext();
        this.f45124b.getClass();
        iw1 iw1Var = (iw1) uw1.f43797c.a(context).f43800b.remove(qj1Var);
        if (iw1Var == null) {
            iw1Var = new iw1(context, (wn3) null, 6);
        }
        zv1 zv1Var = iw1Var.f39654l;
        zv1Var.f45549a.add(z51Var);
        zv1Var.f45550b.add(r72Var);
        zv1Var.f45551c.add(r72Var);
        this.f45123a.getClass();
        if (!qr0.a(customizableMediaView.getContext(), pr0.f41998e)) {
            customizableMediaView.removeAllViews();
        }
        customizableMediaView.addView(iw1Var, new FrameLayout.LayoutParams(-1, -1));
        return new iv2(customizableMediaView, co1Var, new lk3(new kw1(iw1Var)));
    }

    public yn1(on1 on1Var, nw1 nw1Var) {
        this.f45123a = on1Var;
        this.f45124b = nw1Var;
    }
}
