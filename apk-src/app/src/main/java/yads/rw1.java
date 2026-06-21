package yads;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class rw1 extends oj.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f42750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f42751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qj1 f42752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f42753e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sw1 f42754f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v9 f42755g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f42756h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rw1(Context context, qj1 qj1Var, String str, sw1 sw1Var, v9 v9Var, boolean z5, mj.a aVar) {
        super(2, aVar);
        this.f42751c = context;
        this.f42752d = qj1Var;
        this.f42753e = str;
        this.f42754f = sw1Var;
        this.f42755g = v9Var;
        this.f42756h = z5;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        return new rw1(this.f42751c, this.f42752d, this.f42753e, this.f42754f, this.f42755g, this.f42756h, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((rw1) create((hk.a0) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        yn3 yn3Var;
        iw1 iw1Var;
        nj.a aVar = nj.a.f29512b;
        int i = this.f42750b;
        if (i == 0) {
            com.google.android.gms.internal.measurement.h5.E(obj);
            uw1 uw1VarA = uw1.f43797c.a(this.f42751c);
            if (uw1VarA.f43800b.size() != uw1VarA.f43799a) {
                if (!uw1VarA.f43800b.containsKey(this.f42752d) && this.f42753e != null) {
                    hs2 hs2Var = this.f42754f.f43107a;
                    Context context = this.f42751c;
                    String str = this.f42755g.G;
                    if (str != null) {
                        yn3.f45126c.getClass();
                        yn3Var = (yn3) yn3.f45127d.get(str);
                        if (yn3Var == null) {
                            yn3Var = yn3.f45128e;
                        }
                    } else {
                        yn3Var = yn3.f45128e;
                    }
                    wn3 wn3Var = new wn3(yn3Var);
                    hs2Var.getClass();
                    try {
                        iw1Var = new iw1(context, wn3Var, 4);
                    } catch (Throwable unused) {
                        iw1Var = null;
                    }
                    if (iw1Var == null) {
                        return Unit.f27471a;
                    }
                    qj1 qj1Var = this.f42752d;
                    String str2 = this.f42753e;
                    boolean z5 = this.f42756h;
                    this.f42750b = 1;
                    hk.l lVar = new hk.l(1, nj.f.b(this));
                    lVar.t();
                    pw1 pw1Var = new pw1(uw1VarA, qj1Var, new qw1(z5, lVar));
                    if (uw1VarA.f43800b.size() < uw1VarA.f43799a) {
                        uw1VarA.f43800b.put(qj1Var, iw1Var);
                    }
                    iw1Var.a(str2, pw1Var);
                    if (!z5 && lVar.isActive()) {
                        ij.k kVar = ij.m.f21341c;
                        lVar.resumeWith(Unit.f27471a);
                    }
                    Object objS = lVar.s();
                    if (objS == nj.a.f29512b) {
                        Intrinsics.checkNotNullParameter(this, "frame");
                    }
                    if (objS == aVar) {
                        return aVar;
                    }
                }
            }
            return Unit.f27471a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        com.google.android.gms.internal.measurement.h5.E(obj);
        return Unit.f27471a;
    }
}
