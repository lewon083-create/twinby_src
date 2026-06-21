package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class x3 implements y3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nu2 f44580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9 f44581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d4 f44582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wz1 f44583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s53 f44584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final za f44585f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final bz1 f44586g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m83 f44587h;
    public final s5 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final v3 f44588j;

    public /* synthetic */ x3(Context context, nu2 nu2Var, v9 v9Var, d4 d4Var, wz1 wz1Var, s53 s53Var) {
        za zaVar = new za(context, nu2Var, d4Var);
        this(nu2Var, v9Var, d4Var, wz1Var, s53Var, zaVar, new bz1(context, d4Var, nu2Var, v9Var), new m83(zaVar), new s5(wz1Var), new v3());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.view.View r5, yads.kf1 r6, yads.v0 r7, yads.m42 r8, mj.a r9) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r9 instanceof yads.w3
            if (r0 == 0) goto L13
            r0 = r9
            yads.w3 r0 = (yads.w3) r0
            int r1 = r0.f44268g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f44268g = r1
            goto L18
        L13:
            yads.w3 r0 = new yads.w3
            r0.<init>(r4, r9)
        L18:
            java.lang.Object r9 = r0.f44266e
            nj.a r1 = nj.a.f29512b
            int r2 = r0.f44268g
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            yads.qa2 r8 = r0.f44265d
            yads.kf1 r6 = r0.f44264c
            yads.x3 r5 = r0.f44263b
            com.google.android.gms.internal.measurement.h5.E(r9)
            goto L4a
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            com.google.android.gms.internal.measurement.h5.E(r9)
            java.util.List r9 = r6.f40181a
            r0.f44263b = r4
            r0.f44264c = r6
            r0.f44265d = r8
            r0.f44268g = r3
            java.lang.Object r9 = r7.a(r5, r9, r0)
            if (r9 != r1) goto L49
            return r1
        L49:
            r5 = r4
        L4a:
            yads.p01 r9 = (yads.p01) r9
            java.lang.String r7 = r6.f40184d
            if (r7 == 0) goto L57
            int r0 = r7.length()
            if (r0 <= 0) goto L57
            goto L58
        L57:
            r7 = 0
        L58:
            yads.v3 r0 = r5.f44588j
            yads.ug2 r1 = r9.f41794b
            r0.getClass()
            if (r7 == 0) goto L66
            if (r1 == 0) goto L66
            yads.xu r0 = yads.xu.f44805a
            goto L75
        L66:
            if (r7 == 0) goto L6b
            yads.vu r0 = yads.vu.f44124a
            goto L75
        L6b:
            if (r1 == 0) goto L73
            yads.uu r0 = new yads.uu
            r0.<init>(r1)
            goto L75
        L73:
            yads.wu r0 = yads.wu.f44479a
        L75:
            yads.m83 r5 = r5.f44587h
            java.util.List r6 = r6.f40183c
            r5.a(r6, r0)
            if (r7 == 0) goto L81
            r8.a(r7)
        L81:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.x3.a(android.view.View, yads.kf1, yads.v0, yads.m42, mj.a):java.lang.Object");
    }

    public x3(nu2 nu2Var, v9 v9Var, d4 d4Var, wz1 wz1Var, s53 s53Var, za zaVar, bz1 bz1Var, m83 m83Var, s5 s5Var, v3 v3Var) {
        this.f44580a = nu2Var;
        this.f44581b = v9Var;
        this.f44582c = d4Var;
        this.f44583d = wz1Var;
        this.f44584e = s53Var;
        this.f44585f = zaVar;
        this.f44586g = bz1Var;
        this.f44587h = m83Var;
        this.i = s5Var;
        this.f44588j = v3Var;
    }
}
