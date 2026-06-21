package com.monetization.ads.mediation.base.initialize;

import java.util.concurrent.atomic.AtomicBoolean;
import yads.fp;
import yads.nu2;
import yads.ph2;
import yads.up1;
import yads.vo1;
import yads.wo1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AtomicBoolean f15069g = new AtomicBoolean(true);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AtomicBoolean f15070h = new AtomicBoolean(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nu2 f15071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fp f15072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ph2 f15073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final up1 f15074d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final wo1 f15075e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final vo1 f15076f;

    public /* synthetic */ a(nu2 nu2Var) {
        fp fpVar = new fp();
        ph2 ph2Var = new ph2();
        up1 up1Var = new up1();
        this(nu2Var, fpVar, ph2Var, up1Var, new wo1(up1Var), new vo1(up1Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.content.Context r5, yads.sq1 r6, mj.a r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof yads.xp1
            if (r0 == 0) goto L13
            r0 = r7
            yads.xp1 r0 = (yads.xp1) r0
            int r1 = r0.f44785e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f44785e = r1
            goto L18
        L13:
            yads.xp1 r0 = new yads.xp1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f44783c
            nj.a r1 = nj.a.f29512b
            int r0 = r0.f44785e
            if (r0 == 0) goto L37
            r5 = 1
            if (r0 != r5) goto L2f
            com.google.android.gms.internal.measurement.h5.E(r7)
            if (r7 != 0) goto L29
            goto L46
        L29:
            java.lang.ClassCastException r5 = new java.lang.ClassCastException
            r5.<init>()
            throw r5
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            com.google.android.gms.internal.measurement.h5.E(r7)
            yads.up1 r7 = r4.f15074d
            r7.b(r6)
            yads.vo1 r7 = r4.f15076f
            yads.nu2 r0 = r4.f15071a
            r7.a(r5, r6, r0)
        L46:
            kotlin.Unit r5 = kotlin.Unit.f27471a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.monetization.ads.mediation.base.initialize.a.a(android.content.Context, yads.sq1, mj.a):java.lang.Object");
    }

    public a(nu2 nu2Var, fp fpVar, ph2 ph2Var, up1 up1Var, wo1 wo1Var, vo1 vo1Var) {
        this.f15071a = nu2Var;
        this.f15072b = fpVar;
        this.f15073c = ph2Var;
        this.f15074d = up1Var;
        this.f15075e = wo1Var;
        this.f15076f = vo1Var;
    }
}
