package yads;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class kz1 extends oj.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ oz1 f40386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ty1 f40387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oi2 f40388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mz1 f40389e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lz1 f40390f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz1(oz1 oz1Var, ty1 ty1Var, oi2 oi2Var, mz1 mz1Var, lz1 lz1Var, mj.a aVar) {
        super(2, aVar);
        this.f40386b = oz1Var;
        this.f40387c = ty1Var;
        this.f40388d = oi2Var;
        this.f40389e = mz1Var;
        this.f40390f = lz1Var;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        return new kz1(this.f40386b, this.f40387c, this.f40388d, this.f40389e, this.f40390f, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((kz1) create((hk.a0) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        nj.a aVar = nj.a.f29512b;
        com.google.android.gms.internal.measurement.h5.E(obj);
        oz1 oz1Var = this.f40386b;
        qz1 qz1Var = oz1Var.f41780f;
        Context context = oz1Var.f41779e;
        ty1 ty1Var = this.f40387c;
        oi2 oi2Var = this.f40388d;
        zz1 zz1Var = this.f40389e.f41107d;
        jz1 jz1Var = this.f40390f.f40717a;
        uy1 uy1Var = (uy1) qz1Var.f42427d.f44223a.get(qz1Var.f42424a.f37618f);
        if (uy1Var != null) {
            uy1Var.a(context, ty1Var, oi2Var, qz1Var.f42426c, zz1Var, qz1Var.f42425b, jz1Var);
        } else {
            jz1Var.a(h9.f39080a);
        }
        return Unit.f27471a;
    }
}
