package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class wt2 extends oj.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public pk.a f44473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public xt2 f44474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public s61 f44475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f44476e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xt2 f44477f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s61 f44478g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wt2(xt2 xt2Var, s61 s61Var, mj.a aVar) {
        super(2, aVar);
        this.f44477f = xt2Var;
        this.f44478g = s61Var;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        return new wt2(this.f44477f, this.f44478g, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new wt2(this.f44477f, this.f44478g, (mj.a) obj2).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        xt2 xt2Var;
        s61 s61Var;
        pk.a aVar;
        pk.a aVar2;
        Throwable th2;
        nj.a aVar3 = nj.a.f29512b;
        int i = this.f44476e;
        try {
            if (i == 0) {
                com.google.android.gms.internal.measurement.h5.E(obj);
                this.f44477f.f44802a.a(v5.f43878j, null);
                pk.a aVar4 = xt2.f44801d;
                xt2Var = this.f44477f;
                s61Var = this.f44478g;
                this.f44473b = aVar4;
                this.f44474c = xt2Var;
                this.f44475d = s61Var;
                this.f44476e = 1;
                pk.c cVar = (pk.c) aVar4;
                Object objC = cVar.c(this);
                aVar = cVar;
                if (objC != aVar3) {
                }
                return aVar3;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = this.f44473b;
                try {
                    com.google.android.gms.internal.measurement.h5.E(obj);
                    aVar2 = aVar2;
                    ku2 ku2Var = (ku2) obj;
                    ((pk.c) aVar2).e(null);
                    return ku2Var;
                } catch (Throwable th3) {
                    th2 = th3;
                    ((pk.c) aVar2).e(null);
                    throw th2;
                }
            }
            s61Var = this.f44475d;
            xt2Var = this.f44474c;
            pk.a aVar5 = this.f44473b;
            com.google.android.gms.internal.measurement.h5.E(obj);
            aVar = aVar5;
            xt2Var.f44802a.a(v5.f43878j);
            this.f44473b = aVar;
            this.f44474c = xt2Var;
            this.f44475d = s61Var;
            this.f44476e = 2;
            hk.l lVar = new hk.l(1, nj.f.b(this));
            lVar.t();
            lVar.v(new ut2(xt2Var));
            xt2Var.f44804c.a(xt2Var.f44803b, s61Var, new vt2(lVar));
            Object objS = lVar.s();
            if (objS == aVar3) {
                Intrinsics.checkNotNullParameter(this, "frame");
            }
            if (objS != aVar3) {
                aVar2 = aVar;
                obj = objS;
                ku2 ku2Var2 = (ku2) obj;
                ((pk.c) aVar2).e(null);
                return ku2Var2;
            }
            return aVar3;
        } catch (Throwable th4) {
            aVar2 = aVar;
            th2 = th4;
            ((pk.c) aVar2).e(null);
            throw th2;
        }
    }
}
