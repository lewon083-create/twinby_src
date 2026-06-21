package yads;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.monetization.ads.fullscreen.template.view.ExtendedViewContainer;
import com.monetization.ads.nativeads.CustomizableMediaView;
import com.monetization.ads.nativeads.view.pager.MultiBannerControlsContainer;
import com.yandex.mobile.ads.R$layout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class zn1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kx1 f45488a = new kx1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cx1 f45489b = new cx1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ax1 f45490c = new ax1();

    public final jv2 a(v9 v9Var, nu2 nu2Var, CustomizableMediaView customizableMediaView, oi2 oi2Var, List list, co1 co1Var, py2 py2Var) {
        xw1 xw1Var;
        Long l10;
        Context context = customizableMediaView.getContext();
        y6.m mVar = new y6.m(context);
        dx1 dx1Var = new dx1(context, v9Var, nu2Var);
        lx1 lx1Var = new lx1(mVar);
        long jLongValue = (py2Var == null || (l10 = py2Var.f42116b) == null) ? 0L : l10.longValue();
        if (jLongValue > 0) {
            xw1Var = new xw1(mVar, lx1Var, dx1Var, new sh1());
            mVar.addOnAttachStateChangeListener(new hx1(xw1Var, jLongValue));
        } else {
            xw1Var = null;
        }
        ((ArrayList) mVar.f36509d.f36500e).add(new ib2(dx1Var, xw1Var));
        cx1 cx1Var = this.f45489b;
        cx1Var.getClass();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        gs2 gs2Var = cx1Var.f37546a;
        int i = R$layout.monetization_ads_internal_multibanner_controls;
        gs2Var.getClass();
        MultiBannerControlsContainer multiBannerControlsContainer = (MultiBannerControlsContainer) gs2.a(context, MultiBannerControlsContainer.class, i, null);
        if (multiBannerControlsContainer != null) {
            multiBannerControlsContainer.setLayoutParams(layoutParams);
        }
        if (multiBannerControlsContainer != null) {
            multiBannerControlsContainer.a(mVar);
            multiBannerControlsContainer.setOnClickLeftButtonListener(new vz(lx1Var, dx1Var, xw1Var));
            multiBannerControlsContainer.setOnClickRightButtonListener(new wz(lx1Var, dx1Var, xw1Var));
        }
        ax1 ax1Var = this.f45490c;
        ax1Var.getClass();
        ExtendedViewContainer extendedViewContainer = new ExtendedViewContainer(context, null, 0, 6, null);
        ax1Var.f36873a.getClass();
        extendedViewContainer.setMeasureSpecProvider(new qk2((float) ix1.a(list), new jj1()));
        this.f45488a.getClass();
        if (!qr0.a(customizableMediaView.getContext(), pr0.f41998e)) {
            customizableMediaView.removeAllViews();
        }
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        extendedViewContainer.addView(mVar, layoutParams2);
        if (multiBannerControlsContainer != null) {
            extendedViewContainer.addView(multiBannerControlsContainer, layoutParams2);
        }
        customizableMediaView.addView(extendedViewContainer, layoutParams2);
        return new jv2(customizableMediaView, co1Var, new lk3(new mx1(mVar, oi2Var, ((lu3) nu2Var).a(), v9Var)));
    }
}
