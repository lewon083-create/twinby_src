package yads;

import android.os.Handler;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class fq0 implements Runnable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ dk.i[] f38529f = {wb.a(fq0.class, "exposureUpdateListenerReference", "getExposureUpdateListenerReference()Lcom/monetization/ads/base/webview/mraid/exposure/OnExposureUpdateListener;", 0), wb.a(fq0.class, "viewReference", "getViewReference()Landroid/view/View;", 0)};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f38530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dq0 f38531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final nm2 f38532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final nm2 f38533e;

    public fq0(Handler handler, View view, dq0 dq0Var, ma2 ma2Var) {
        this.f38530b = handler;
        this.f38531c = dq0Var;
        this.f38532d = om2.a(ma2Var);
        this.f38533e = om2.a(view);
    }

    @Override // java.lang.Runnable
    public final void run() {
        nm2 nm2Var = this.f38533e;
        dk.i[] iVarArr = f38529f;
        dk.i iVar = iVarArr[1];
        View view = (View) nm2Var.f41294a.get();
        nm2 nm2Var2 = this.f38532d;
        dk.i iVar2 = iVarArr[0];
        ma2 ma2Var = (ma2) nm2Var2.f41294a.get();
        if (view == null || ma2Var == null) {
            return;
        }
        cq0 cq0VarA = this.f38531c.a(view);
        yv1 yv1Var = (yv1) ma2Var;
        if (!Intrinsics.a(cq0VarA, yv1Var.f45174r)) {
            yv1Var.f45174r = cq0VarA;
            yv1Var.f45159b.a(new eq0(cq0VarA.f37474a, cq0VarA.f37475b));
        }
        this.f38530b.postDelayed(this, 200L);
    }
}
