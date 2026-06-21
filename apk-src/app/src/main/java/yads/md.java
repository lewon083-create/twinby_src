package yads;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.monetization.ads.fullscreen.template.view.ExtendedViewContainer;
import com.yandex.mobile.ads.R$id;
import com.yandex.mobile.ads.R$layout;
import com.yandex.mobile.ads.R$style;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class md implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ od f40883b;

    public md(od odVar) {
        this.f40883b = odVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        od odVar = this.f40883b;
        dd ddVar = odVar.f41509a;
        String str = odVar.f41512d;
        ddVar.getClass();
        if (str != null) {
            ed edVar = new ed(ddVar.f37726a);
            Context context = ddVar.f37726a;
            ad adVar = new ad(context, true, 12);
            me1 me1Var = new me1();
            Dialog dialog = new Dialog(context, R$style.MonetizationAdsInternal_BottomAdtuneDialog);
            View viewInflate = LayoutInflater.from(context).inflate(R$layout.monetization_ads_internal_adtune_container, (ViewGroup) null);
            Intrinsics.c(viewInflate, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) viewInflate;
            ExtendedViewContainer extendedViewContainer = (ExtendedViewContainer) viewGroup.findViewById(R$id.adtune_content_container);
            if (extendedViewContainer != null) {
                extendedViewContainer.setMeasureSpecProvider(adVar);
            }
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R$id.adtune_webview_container);
            if (viewGroup2 != null) {
                viewGroup2.addView(edVar);
            }
            View viewFindViewById = viewGroup.findViewById(R$id.adtune_drag_view_container);
            if (viewFindViewById != null) {
                viewFindViewById.setOnTouchListener(new zc(viewGroup, dialog, me1Var));
            }
            ViewGroup viewGroup3 = (ViewGroup) viewGroup.findViewById(R$id.adtune_background_view);
            if (viewGroup3 != null) {
                viewGroup3.setOnClickListener(new yc(dialog, me1Var));
            }
            dialog.setContentView(viewGroup);
            Window window = dialog.getWindow();
            if (window != null) {
                window.setGravity(80);
            }
            og0.a(dialog);
            edVar.setAdtuneWebViewListener(new bd(new cd(dialog, edVar)));
            edVar.loadUrl(str);
            dialog.show();
        }
    }
}
