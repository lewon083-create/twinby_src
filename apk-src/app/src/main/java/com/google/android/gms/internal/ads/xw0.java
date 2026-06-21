package com.google.android.gms.internal.ads;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class xw0 extends oj.i implements Function2 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f12361l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xw0(int i, mj.a aVar, int i10) {
        super(i, aVar);
        this.f12361l = i10;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        switch (this.f12361l) {
            case 0:
                return new xw0(2, aVar, 0);
            default:
                return new xw0(2, aVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12361l) {
            case 0:
                return ((xw0) create((qw0) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
            default:
                return ((xw0) create((kk.f) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
        }
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f12361l) {
            case 0:
                nj.a aVar = nj.a.f29512b;
                com.google.android.gms.internal.measurement.h5.E(obj);
                qw0 qw0VarC = qw0.C();
                Intrinsics.checkNotNullExpressionValue(qw0VarC, "getDefaultInstance(...)");
                return qw0VarC;
            default:
                nj.a aVar2 = nj.a.f29512b;
                com.google.android.gms.internal.measurement.h5.E(obj);
                return Unit.f27471a;
        }
    }
}
