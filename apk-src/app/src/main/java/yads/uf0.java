package yads;

import android.content.Context;
import android.content.Intent;
import com.yandex.mobile.ads.common.AdActivity;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class uf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ko2 f43638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p1 f43639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l2 f43640c;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ uf0(d4 d4Var, nu2 nu2Var, v9 v9Var) {
        lu3 lu3Var = (lu3) nu2Var;
        this(lu3Var.a(), new p1(d4Var, nu2Var, v9Var), new l2(lu3Var.c()));
    }

    public final Object a(Context context, Intent intent, yg2 frame) {
        Object objS;
        hk.l lVar = new hk.l(1, nj.f.b(frame));
        lVar.t();
        long andIncrement = z21.f45234a.getAndIncrement();
        this.f43640c.f40413a.getClass();
        Intent intent2 = new Intent(context, (Class<?>) AdActivity.class);
        intent2.putExtra("window_type", "window_type_activity_result");
        intent2.putExtra("data_identifier", andIncrement);
        p1 p1Var = this.f43639b;
        sf0 sf0Var = new sf0(lVar);
        tf0 tf0Var = new tf0(lVar);
        p1Var.getClass();
        x1 x1Var = new x1(p1Var.f41799c, p1Var.f41797a, new z9(), p1Var.f41798b, null, 0, new qf0(intent, sf0Var, tf0Var), 48);
        z1 z1VarA = y1.a();
        z1VarA.a(andIncrement, x1Var);
        lVar.v(new rf0(z1VarA, andIncrement));
        try {
            ij.k kVar = ij.m.f21341c;
            context.startActivity(intent2);
            objS = Unit.f27471a;
        } catch (Throwable th2) {
            ij.k kVar2 = ij.m.f21341c;
            objS = com.google.android.gms.internal.measurement.h5.s(th2);
        }
        Throwable thA = ij.m.a(objS);
        if (thA != null) {
            z1VarA.a(andIncrement);
            this.f43638a.reportError("Failed to launch AdActivity for result", thA);
            if (lVar.isActive()) {
                lVar.resumeWith(com.google.android.gms.internal.measurement.h5.s(thA));
            }
        }
        Object objS2 = lVar.s();
        nj.a aVar = nj.a.f29512b;
        if (objS2 == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objS2 == aVar ? objS2 : Unit.f27471a;
    }

    public uf0(ko2 ko2Var, p1 p1Var, l2 l2Var) {
        this.f43638a = ko2Var;
        this.f43639b = p1Var;
        this.f43640c = l2Var;
    }
}
