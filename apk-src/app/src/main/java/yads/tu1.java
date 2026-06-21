package yads;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class tu1 extends kotlin.jvm.internal.r implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f43439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nu2 f43440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l00 f43441d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tu1(Context context, nu2 nu2Var, l00 l00Var) {
        super(0);
        this.f43439b = context;
        this.f43440c = nu2Var;
        this.f43441d = l00Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Context context = this.f43439b;
        nu2 nu2Var = this.f43440c;
        l00 l00Var = this.f43441d;
        lu3 lu3Var = (lu3) nu2Var;
        y10 y10Var = new y10(lu3Var.a());
        hk.s1 s1Var = new hk.s1();
        ok.e eVar = hk.k0.f20682a;
        hk.c0.m(hk.c0.a(kotlin.coroutines.e.d(s1Var, ok.d.f30722d).plus(y10Var)), null, new uu1(context, lu3Var, null), 3);
        l00Var.onInitializationCompleted();
        return Unit.f27471a;
    }
}
