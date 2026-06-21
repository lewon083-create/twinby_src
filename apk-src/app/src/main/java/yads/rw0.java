package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class rw0 extends oj.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f42746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ byte[] f42747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sw0 f42748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tw0 f42749e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rw0(byte[] bArr, sw0 sw0Var, tw0 tw0Var, mj.a aVar) {
        super(2, aVar);
        this.f42747c = bArr;
        this.f42748d = sw0Var;
        this.f42749e = tw0Var;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        return new rw0(this.f42747c, this.f42748d, this.f42749e, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((rw0) create((hk.a0) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2 = nj.a.f29512b;
        int i = this.f42746b;
        if (i == 0) {
            com.google.android.gms.internal.measurement.h5.E(obj);
            byte[] bArr = this.f42747c;
            if (bArr == null) {
                return null;
            }
            ix0 ix0Var = this.f42748d.f43106b;
            tw0 tw0Var = this.f42749e;
            this.f42746b = 1;
            iw0 iw0Var = ix0Var.f39664a;
            iw0Var.getClass();
            ok.e eVar = hk.k0.f20682a;
            Object objT = hk.c0.t(ok.d.f30722d, new hw0(iw0Var, tw0Var, bArr, null), this);
            if (objT != obj2) {
                objT = Unit.f27471a;
            }
            if (objT == obj2) {
                return obj2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.android.gms.internal.measurement.h5.E(obj);
        }
        return Unit.f27471a;
    }
}
