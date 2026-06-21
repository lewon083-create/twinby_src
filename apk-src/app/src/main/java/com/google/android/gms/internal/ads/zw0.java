package com.google.android.gms.internal.ads;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class zw0 extends oj.i implements Function2 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f13134l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f13135m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yf0 f13136n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zw0(yf0 yf0Var, mj.a aVar, int i) {
        super(2, aVar);
        this.f13134l = i;
        this.f13136n = yf0Var;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        switch (this.f13134l) {
            case 0:
                return new zw0(this.f13136n, aVar, 0);
            case 1:
                return new zw0(this.f13136n, aVar, 1);
            case 2:
                return new zw0(this.f13136n, aVar, 2);
            case 3:
                return new zw0(this.f13136n, aVar, 3);
            case 4:
                return new zw0(this.f13136n, aVar, 4);
            default:
                return new zw0(this.f13136n, aVar, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        hk.a0 a0Var = (hk.a0) obj;
        mj.a aVar = (mj.a) obj2;
        switch (this.f13134l) {
        }
        return ((zw0) create(a0Var, aVar)).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f13134l) {
            case 0:
                nj.a aVar = nj.a.f29512b;
                int i = this.f13135m;
                com.google.android.gms.internal.measurement.h5.E(obj);
                if (i == 0) {
                    this.f13135m = 1;
                    if (this.f13136n.o(this) == aVar) {
                    }
                }
                break;
            case 1:
                nj.a aVar2 = nj.a.f29512b;
                int i10 = this.f13135m;
                com.google.android.gms.internal.measurement.h5.E(obj);
                if (i10 == 0) {
                    this.f13135m = 1;
                    if (this.f13136n.s(this) == aVar2) {
                    }
                }
                break;
            case 2:
                nj.a aVar3 = nj.a.f29512b;
                int i11 = this.f13135m;
                com.google.android.gms.internal.measurement.h5.E(obj);
                if (i11 == 0) {
                    this.f13135m = 1;
                    if (this.f13136n.q(this) == aVar3) {
                    }
                }
                break;
            case 3:
                nj.a aVar4 = nj.a.f29512b;
                int i12 = this.f13135m;
                com.google.android.gms.internal.measurement.h5.E(obj);
                if (i12 == 0) {
                    this.f13135m = 1;
                    if (this.f13136n.l(this) == aVar4) {
                    }
                }
                break;
            case 4:
                nj.a aVar5 = nj.a.f29512b;
                int i13 = this.f13135m;
                com.google.android.gms.internal.measurement.h5.E(obj);
                if (i13 == 0) {
                    this.f13135m = 1;
                    if (this.f13136n.r(this) == aVar5) {
                    }
                }
                break;
            default:
                nj.a aVar6 = nj.a.f29512b;
                int i14 = this.f13135m;
                com.google.android.gms.internal.measurement.h5.E(obj);
                if (i14 == 0) {
                    this.f13135m = 1;
                    if (this.f13136n.p(this) == aVar6) {
                    }
                }
                break;
        }
        return Unit.f27471a;
    }
}
