package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class cx0 extends oj.i implements Function2 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f4366l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4367m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f4368n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f4369o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cx0(Object obj, Object obj2, mj.a aVar, int i) {
        super(2, aVar);
        this.f4366l = i;
        this.f4368n = obj;
        this.f4369o = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [kotlin.jvm.functions.Function2, oj.i] */
    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        switch (this.f4366l) {
            case 0:
                return new cx0((yf0) this.f4368n, (String) this.f4369o, aVar, 0);
            case 1:
                return new cx0((kk.e) this.f4368n, (f2.a) this.f4369o, aVar, 1);
            case 2:
                return new cx0((e6.c) this.f4368n, (Uri) this.f4369o, aVar, 2);
            case 3:
                return new cx0((f6.a) this.f4368n, (h6.b) this.f4369o, aVar, 3);
            case 4:
                cx0 cx0Var = new cx0((lk.b) this.f4369o, aVar, 4);
                cx0Var.f4368n = obj;
                return cx0Var;
            case 5:
                cx0 cx0Var2 = new cx0((lk.c) this.f4369o, aVar, 5);
                cx0Var2.f4368n = obj;
                return cx0Var2;
            case 6:
                cx0 cx0Var3 = new cx0((kk.f) this.f4369o, aVar, 6);
                cx0Var3.f4368n = obj;
                return cx0Var3;
            case 7:
                return new cx0((od.b) this.f4368n, (Function1) this.f4369o, aVar, 7);
            case 8:
                return new cx0((od.b) this.f4368n, (t2.e) this.f4369o, aVar, 8);
            case 9:
                cx0 cx0Var4 = new cx0((List) this.f4369o, aVar, 9);
                cx0Var4.f4368n = obj;
                return cx0Var4;
            case 10:
                return new cx0((Function2) this.f4368n, (p2.d) this.f4369o, aVar);
            case 11:
                cx0 cx0Var5 = new cx0((p2.e0) this.f4369o, aVar, 11);
                cx0Var5.f4368n = obj;
                return cx0Var5;
            default:
                return new cx0((s7.g) this.f4369o, aVar, 12);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4366l) {
            case 0:
                return ((cx0) create((hk.a0) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
            case 1:
                return ((cx0) create((hk.a0) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
            case 2:
                return ((cx0) create((hk.a0) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
            case 3:
                return ((cx0) create((hk.a0) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
            case 4:
                return ((cx0) create((jk.q) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
            case 5:
                return ((cx0) create((kk.f) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
            case 6:
                return ((cx0) create(obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
            case 7:
                return ((cx0) create((hk.a0) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
            case 8:
                return ((cx0) create((hk.a0) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
            case 9:
                return ((cx0) create((p2.l) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
            case 10:
                return ((cx0) create((hk.a0) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
            case 11:
                return ((cx0) create((p2.p0) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
            default:
                return ((cx0) create((hk.a0) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x018f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:259:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x018b  */
    /* JADX WARN: Type inference failed for: r2v49, types: [kotlin.jvm.functions.Function2, oj.i] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x0177 -> B:84:0x017a). Please report as a decompilation issue!!! */
    @Override // oj.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1010
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.cx0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cx0(Object obj, mj.a aVar, int i) {
        super(2, aVar);
        this.f4366l = i;
        this.f4369o = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public cx0(Function2 function2, p2.d dVar, mj.a aVar) {
        super(2, aVar);
        this.f4366l = 10;
        this.f4368n = (oj.i) function2;
        this.f4369o = dVar;
    }
}
