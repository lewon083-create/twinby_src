package yads;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class r42 extends oj.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public hk.f0 f42487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f42488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f42489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f42490e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jz1 f42491f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ lz1 f42492g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s42 f42493h;
    public final /* synthetic */ d4 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ty1 f42494j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ z30 f42495k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r42(Context context, jz1 jz1Var, lz1 lz1Var, s42 s42Var, d4 d4Var, ty1 ty1Var, z30 z30Var, mj.a aVar) {
        super(2, aVar);
        this.f42490e = context;
        this.f42491f = jz1Var;
        this.f42492g = lz1Var;
        this.f42493h = s42Var;
        this.i = d4Var;
        this.f42494j = ty1Var;
        this.f42495k = z30Var;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        r42 r42Var = new r42(this.f42490e, this.f42491f, this.f42492g, this.f42493h, this.i, this.f42494j, this.f42495k, aVar);
        r42Var.f42489d = obj;
        return r42Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r42) create((hk.a0) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0081  */
    @Override // oj.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            r14 = this;
            nj.a r0 = nj.a.f29512b
            int r1 = r14.f42488c
            r2 = 3
            r3 = 0
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L29
            if (r1 == r5) goto L1f
            if (r1 != r4) goto L17
            java.lang.Object r0 = r14.f42489d
            yads.oi2 r0 = (yads.oi2) r0
            com.google.android.gms.internal.measurement.h5.E(r15)
            r7 = r0
            goto L74
        L17:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L1f:
            hk.f0 r1 = r14.f42487b
            java.lang.Object r5 = r14.f42489d
            yads.oi2 r5 = (yads.oi2) r5
            com.google.android.gms.internal.measurement.h5.E(r15)
            goto L66
        L29:
            com.google.android.gms.internal.measurement.h5.E(r15)
            java.lang.Object r15 = r14.f42489d
            hk.a0 r15 = (hk.a0) r15
            yads.oi2 r11 = new yads.oi2
            android.content.Context r1 = r14.f42490e
            r11.<init>(r1)
            yads.q42 r6 = new yads.q42
            yads.s42 r7 = r14.f42493h
            yads.d4 r8 = r14.i
            android.content.Context r9 = r14.f42490e
            yads.ty1 r10 = r14.f42494j
            yads.z30 r12 = r14.f42495k
            r13 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            hk.g0 r1 = hk.c0.b(r15, r6, r2)
            yads.p42 r6 = new yads.p42
            yads.s42 r7 = r14.f42493h
            yads.ty1 r8 = r14.f42494j
            r6.<init>(r7, r8, r3)
            hk.q1 r15 = hk.c0.m(r15, r3, r6, r2)
            r14.f42489d = r11
            r14.f42487b = r1
            r14.f42488c = r5
            java.lang.Object r15 = r15.G(r14)
            if (r15 != r0) goto L65
            goto L72
        L65:
            r5 = r11
        L66:
            r14.f42489d = r5
            r14.f42487b = r3
            r14.f42488c = r4
            java.lang.Object r15 = r1.d(r14)
            if (r15 != r0) goto L73
        L72:
            return r0
        L73:
            r7 = r5
        L74:
            r6 = r15
            yads.ty1 r6 = (yads.ty1) r6
            if (r6 != 0) goto L81
            yads.jz1 r15 = r14.f42491f
            yads.l4 r0 = yads.h9.f39101w
            r15.a(r0)
            goto L99
        L81:
            yads.lz1 r9 = r14.f42492g
            yads.w5 r15 = r9.f40718b
            yads.v5 r0 = yads.v5.f43882n
            r15.a(r0)
            yads.mz1 r8 = r9.f40719c
            yads.oz1 r5 = r8.f41110g
            hk.a0 r15 = r5.f41778d
            yads.kz1 r4 = new yads.kz1
            r10 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            hk.c0.m(r15, r3, r4, r2)
        L99:
            kotlin.Unit r15 = kotlin.Unit.f27471a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.r42.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
