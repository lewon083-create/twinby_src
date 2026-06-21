package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import io.sentry.protocol.Device;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ab0 implements vo {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2830b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ db0 f2831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f2832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ WindowManager f2833e;

    public /* synthetic */ ab0(db0 db0Var, View view, WindowManager windowManager) {
        this.f2831c = db0Var;
        this.f2832d = view;
        this.f2833e = windowManager;
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [com.google.android.gms.internal.ads.bb0] */
    @Override // com.google.android.gms.internal.ads.vo
    public final void o(Object obj, Map map) {
        switch (this.f2830b) {
            case 0:
                sz szVar = (sz) obj;
                u9.i.c("Hide native ad policy validator overlay.");
                szVar.i0().setVisibility(8);
                if (szVar.i0().getWindowToken() != null) {
                    this.f2833e.removeView(szVar.i0());
                }
                szVar.destroy();
                ViewTreeObserver viewTreeObserver = this.f2832d.getViewTreeObserver();
                db0 db0Var = this.f2831c;
                if (db0Var.f4542c != null && viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(db0Var.f4542c);
                    break;
                }
                break;
            default:
                final sz szVar2 = (sz) obj;
                k00 k00VarQ0 = szVar2.q0();
                db0 db0Var2 = this.f2831c;
                k00VarQ0.f7062h = new n90(10, db0Var2, map);
                if (map != null) {
                    final View view = this.f2832d;
                    Context context = view.getContext();
                    String str = (String) map.get("validator_width");
                    wk wkVar = al.f3034h9;
                    yk ykVar = q9.s.f31967e.f31970c;
                    int iB = db0.b(context, str, ((Integer) ykVar.a(wkVar)).intValue());
                    int iB2 = db0.b(context, (String) map.get("validator_height"), ((Integer) ykVar.a(al.f3050i9)).intValue());
                    int iB3 = db0.b(context, (String) map.get("validator_x"), 0);
                    int iB4 = db0.b(context, (String) map.get("validator_y"), 0);
                    szVar2.W0(new j0(1, iB, iB2));
                    try {
                        szVar2.u().getSettings().setUseWideViewPort(((Boolean) ykVar.a(al.f3064j9)).booleanValue());
                        szVar2.u().getSettings().setLoadWithOverviewMode(((Boolean) ykVar.a(al.f3079k9)).booleanValue());
                        break;
                    } catch (NullPointerException unused) {
                    }
                    final WindowManager.LayoutParams layoutParamsL = com.google.android.gms.internal.measurement.d4.L();
                    layoutParamsL.x = iB3;
                    layoutParamsL.y = iB4;
                    View viewI0 = szVar2.i0();
                    final WindowManager windowManager = this.f2833e;
                    windowManager.updateViewLayout(viewI0, layoutParamsL);
                    final String str2 = (String) map.get(Device.JsonKeys.ORIENTATION);
                    Rect rect = new Rect();
                    if (view.getGlobalVisibleRect(rect)) {
                        final int i = (("1".equals(str2) || "2".equals(str2)) ? rect.bottom : rect.top) - iB4;
                        db0Var2.f4542c = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.gms.internal.ads.bb0
                            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                            public final /* synthetic */ void onScrollChanged() {
                                Rect rect2 = new Rect();
                                if (view.getGlobalVisibleRect(rect2)) {
                                    sz szVar3 = szVar2;
                                    if (szVar3.i0().getWindowToken() == null) {
                                        return;
                                    }
                                    String str3 = str2;
                                    boolean zEquals = "1".equals(str3);
                                    int i10 = i;
                                    WindowManager.LayoutParams layoutParams = layoutParamsL;
                                    if (zEquals || "2".equals(str3)) {
                                        layoutParams.y = rect2.bottom - i10;
                                    } else {
                                        layoutParams.y = rect2.top - i10;
                                    }
                                    windowManager.updateViewLayout(szVar3.i0(), layoutParams);
                                }
                            }
                        };
                        ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
                        if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                            viewTreeObserver2.addOnScrollChangedListener(db0Var2.f4542c);
                        }
                    }
                    String str3 = (String) map.get("overlay_url");
                    if (!TextUtils.isEmpty(str3)) {
                        szVar2.loadUrl(str3);
                    }
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ab0(db0 db0Var, WindowManager windowManager, View view) {
        this.f2831c = db0Var;
        this.f2833e = windowManager;
        this.f2832d = view;
    }
}
