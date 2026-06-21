package yads;

import android.content.Context;
import android.webkit.WebSettings;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class do3 extends oj.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f37870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f37871c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public do3(Context context, mj.a aVar) {
        super(2, aVar);
        this.f37871c = context;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        do3 do3Var = new do3(this.f37871c, aVar);
        do3Var.f37870b = obj;
        return do3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        do3 do3Var = new do3(this.f37871c, (mj.a) obj2);
        do3Var.f37870b = (hk.a0) obj;
        return do3Var.invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objS;
        nj.a aVar = nj.a.f29512b;
        com.google.android.gms.internal.measurement.h5.E(obj);
        Context context = this.f37871c;
        try {
            ij.k kVar = ij.m.f21341c;
            objS = WebSettings.getDefaultUserAgent(context.getApplicationContext());
        } catch (Throwable th2) {
            ij.k kVar2 = ij.m.f21341c;
            objS = com.google.android.gms.internal.measurement.h5.s(th2);
        }
        return new ij.m(objS);
    }
}
