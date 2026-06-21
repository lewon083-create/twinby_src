package yads;

import android.content.Context;
import android.widget.FrameLayout;
import com.monetization.ads.nativeads.CustomizableMediaView;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class gv2 implements wn1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nu2 f38894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9 f38895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ao1 f38896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final xn1 f38897d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zn1 f38898e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final yn1 f38899f;

    public gv2(nu2 nu2Var, v9 v9Var, ao1 ao1Var, xn1 xn1Var, zn1 zn1Var, yn1 yn1Var) {
        this.f38894a = nu2Var;
        this.f38895b = v9Var;
        this.f38896c = ao1Var;
        this.f38897d = xn1Var;
        this.f38898e = zn1Var;
        this.f38899f = yn1Var;
    }

    public final un1 a(CustomizableMediaView customizableMediaView, nu2 nu2Var, oi2 oi2Var, co1 co1Var, py2 py2Var, qn1 qn1Var) {
        CustomizableMediaView customizableMediaView2;
        oi2 oi2Var2;
        co1 co1Var2;
        List list = qn1Var.f42352c;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() == 1) {
            return this.f38897d.a(customizableMediaView, oi2Var, co1Var);
        }
        try {
            customizableMediaView2 = customizableMediaView;
            oi2Var2 = oi2Var;
            co1Var2 = co1Var;
            try {
                return this.f38898e.a(this.f38895b, nu2Var, customizableMediaView2, oi2Var2, list, co1Var2, py2Var);
            } catch (Throwable unused) {
                return this.f38897d.a(customizableMediaView2, oi2Var2, co1Var2);
            }
        } catch (Throwable unused2) {
            customizableMediaView2 = customizableMediaView;
            oi2Var2 = oi2Var;
            co1Var2 = co1Var;
        }
    }

    @Override // yads.wn1
    public final un1 a(CustomizableMediaView customizableMediaView, d4 d4Var, oi2 oi2Var, il1 il1Var, z51 z51Var, f42 f42Var, j32 j32Var, hz1 hz1Var, co1 co1Var, py2 py2Var, qn1 qn1Var) {
        gv2 gv2Var;
        un1 un1VarA = null;
        un1VarA = null;
        un1VarA = null;
        un1VarA = null;
        if (qn1Var == null) {
            return null;
        }
        g62 g62Var = f42Var.f38371a;
        r72 r72Var = f42Var.f38372b;
        qj1 qj1Var = qn1Var.f42350a;
        Context context = customizableMediaView.getContext();
        Context context2 = customizableMediaView.getContext();
        pr0 pr0Var = pr0.f41998e;
        boolean zA = qr0.a(context2, pr0Var);
        if (zA) {
            customizableMediaView.removeAllViews();
        }
        if (g62Var != null) {
            vd3 vd3Var = qn1Var.f42351b;
            ao1 ao1Var = this.f38896c;
            ao1Var.getClass();
            Context context3 = customizableMediaView.getContext();
            ao1Var.f36825e.f36646a.getClass();
            nj3 videoScaleType = customizableMediaView.getVideoScaleType();
            if (videoScaleType == null) {
                videoScaleType = nj3.f41271b;
            }
            m62 m62Var = ao1Var.f36826f;
            pj3 pj3Var = vd3Var != null ? vd3Var.f44003b : null;
            m62Var.getClass();
            di3 di3Var = new di3(videoScaleType, pj3Var != null ? pj3Var.f41933a : true, pj3Var != null ? pj3Var.f41934b : false, pj3Var != null ? pj3Var.f41936d : null);
            ao1Var.f36824d.getClass();
            h72 h72VarA = ao1Var.f36827g.a(context3, di3Var, il1Var, vd3Var, customizableMediaView.getVideoControlsLayoutId());
            ao1Var.f36823c.getClass();
            if (!qr0.a(customizableMediaView.getContext(), pr0Var)) {
                customizableMediaView.removeAllViews();
            }
            customizableMediaView.addView(h72VarA, new FrameLayout.LayoutParams(-1, -1));
            kv2 kv2Var = new kv2(customizableMediaView, co1Var, new lk3(new gk3(ao1Var.f36821a, h72VarA, di3Var, d4Var, ao1Var.f36822b, z51Var, g62Var, j32Var, hz1Var, oi2Var, py2Var, new ek3())));
            b03 b03Var = py2Var != null ? py2Var.f42119e : null;
            if (b03Var == null || !zA) {
                gv2Var = this;
            } else {
                un1 un1VarA2 = a(customizableMediaView, this.f38894a, oi2Var, co1Var, py2Var, qn1Var);
                gv2Var = this;
                if (un1VarA2 != null) {
                    un1VarA = new ov2(customizableMediaView, kv2Var, un1VarA2, co1Var, b03Var);
                }
            }
            un1VarA = kv2Var;
        } else {
            gv2Var = this;
            if (r72Var != null && qj1Var != null && tb.a(context)) {
                try {
                    un1VarA = gv2Var.f38899f.a(customizableMediaView, qj1Var, z51Var, r72Var, co1Var);
                } catch (ao3 unused) {
                }
            }
        }
        if (un1VarA == null) {
            return gv2Var.a(customizableMediaView, gv2Var.f38894a, oi2Var, co1Var, py2Var, qn1Var);
        }
        return un1VarA;
    }
}
