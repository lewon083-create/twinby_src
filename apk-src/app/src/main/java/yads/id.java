package yads;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
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
public final class id {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f39496d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vm0 f39497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qa2 f39498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b1 f39499c;

    public /* synthetic */ id(vm0 vm0Var, qa2 qa2Var) {
        this(vm0Var, qa2Var, new b1());
    }

    public final void a(Activity activity, kd kdVar, rc rcVar) {
        ad adVar = new ad(activity, false, 14);
        me1 me1Var = new me1();
        Dialog dialog = new Dialog(activity, R$style.MonetizationAdsInternal_BottomAdtuneDialog);
        View viewInflate = LayoutInflater.from(activity).inflate(R$layout.monetization_ads_internal_adtune_container, (ViewGroup) null);
        Intrinsics.c(viewInflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) viewInflate;
        ExtendedViewContainer extendedViewContainer = (ExtendedViewContainer) viewGroup.findViewById(R$id.adtune_content_container);
        if (extendedViewContainer != null) {
            extendedViewContainer.setMeasureSpecProvider(adVar);
        }
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R$id.adtune_webview_container);
        if (viewGroup2 != null) {
            if (ub.a(35)) {
                uc.a(viewGroup2);
            }
            viewGroup2.addView(kdVar);
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
        dialog.setOnDismissListener(new zl.r());
        vm0 vm0Var = this.f39497a;
        qa2 qa2Var = this.f39498b;
        Handler handler = new Handler(Looper.getMainLooper());
        xc xcVar = new xc(dialog, kdVar, vm0Var, qa2Var, handler);
        String str = rcVar.f42539b;
        String str2 = rcVar.f42540c;
        kdVar.setAdtuneWebViewListener(new vc(xcVar));
        kdVar.setOptOutUrl(str2);
        kdVar.loadUrl(str);
        handler.postDelayed(new wc(xcVar), xc.f44634e);
        dialog.show();
    }

    public id(vm0 vm0Var, qa2 qa2Var, b1 b1Var) {
        this.f39497a = vm0Var;
        this.f39498b = qa2Var;
        this.f39499c = b1Var;
    }

    public static final void a(DialogInterface dialogInterface) {
        f39496d = false;
    }

    public final void a(View view, rc rcVar) {
        Activity activity;
        Activity activityB;
        if (f39496d) {
            return;
        }
        this.f39499c.getClass();
        Context context = view.getContext();
        do {
            activity = context instanceof Activity ? (Activity) context : null;
            if (activity == null) {
                ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
                if (contextWrapper == null) {
                    break;
                } else {
                    context = contextWrapper.getBaseContext();
                }
            } else {
                break;
            }
        } while (context != null);
        activity = null;
        if (activity == null) {
            synchronized (j1.f39694a) {
                k1 k1Var = j1.f39695b;
                activityB = k1Var != null ? k1Var.b() : null;
            }
            activity = activityB;
        }
        if (activity == null || !tb.a((Context) activity)) {
            return;
        }
        try {
            kd kdVar = new kd(activity);
            f39496d = true;
            a(activity, kdVar, rcVar);
        } catch (Throwable unused) {
            f39496d = false;
        }
    }
}
