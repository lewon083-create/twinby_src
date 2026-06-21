package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class a82 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qe3 f36647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zg3 f36648b;

    public /* synthetic */ a82(Context context, d4 d4Var, nu2 nu2Var) {
        this(new qe3(context, new r62()), new zg3(context, d4Var, nu2Var, new a62(d4Var), new bb2()));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(yads.a82 r7, java.util.List r8, mj.a r9) throws java.lang.Throwable {
        /*
            r7.getClass()
            boolean r0 = r9 instanceof yads.x72
            if (r0 == 0) goto L16
            r0 = r9
            yads.x72 r0 = (yads.x72) r0
            int r1 = r0.f44617e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f44617e = r1
            goto L1b
        L16:
            yads.x72 r0 = new yads.x72
            r0.<init>(r7, r9)
        L1b:
            java.lang.Object r9 = r0.f44615c
            nj.a r1 = nj.a.f29512b
            int r2 = r0.f44617e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            yads.a82 r7 = r0.f44614b
            com.google.android.gms.internal.measurement.h5.E(r9)
            goto La8
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            com.google.android.gms.internal.measurement.h5.E(r9)
            yads.zg3 r9 = r7.f36648b
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r4 = kotlin.collections.t.j(r8, r4)
            r2.<init>(r4)
            java.util.Iterator r8 = r8.iterator()
        L49:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L5b
            java.lang.Object r4 = r8.next()
            yads.me3 r4 = (yads.me3) r4
            yads.xd3 r4 = r4.f40900b
            r2.add(r4)
            goto L49
        L5b:
            r0.f44614b = r7
            r0.f44617e = r3
            r9.getClass()
            hk.l r8 = new hk.l
            mj.a r4 = nj.f.b(r0)
            r8.<init>(r3, r4)
            r8.t()
            yads.yg3 r3 = new yads.yg3
            r3.<init>(r8)
            yads.ug3 r9 = r9.f45411a
            java.lang.Object r4 = new java.lang.Object
            r4.<init>()
            yads.sg3 r5 = r9.f43660c
            r5.getClass()
            yads.rg3 r2 = yads.sg3.a(r2)
            java.util.List r5 = r2.f42603a
            java.util.ArrayList r6 = r9.f43661d
            r6.addAll(r5)
            java.util.List r2 = r2.f42604b
            yads.tg3 r5 = new yads.tg3
            r5.<init>(r9, r3, r4)
            yads.ip3 r3 = r9.f43659b
            android.content.Context r9 = r9.f43658a
            r3.a(r9, r2, r5, r4)
            java.lang.Object r9 = r8.s()
            nj.a r8 = nj.a.f29512b
            if (r9 != r8) goto La5
            java.lang.String r8 = "frame"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r8)
        La5:
            if (r9 != r1) goto La8
            return r1
        La8:
            yads.xg3 r9 = (yads.xg3) r9
            boolean r8 = r9 instanceof yads.vg3
            if (r8 == 0) goto Lb1
            kotlin.collections.b0 r7 = kotlin.collections.b0.f27475b
            return r7
        Lb1:
            boolean r8 = r9 instanceof yads.wg3
            if (r8 == 0) goto Lc1
            yads.qe3 r7 = r7.f36647a
            yads.wg3 r9 = (yads.wg3) r9
            java.util.List r8 = r9.f44397a
            r9 = 0
            java.util.ArrayList r7 = r7.a(r8, r9)
            return r7
        Lc1:
            ij.j r7 = new ij.j
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.a82.a(yads.a82, java.util.List, mj.a):java.lang.Object");
    }

    public a82(qe3 qe3Var, zg3 zg3Var) {
        this.f36647a = qe3Var;
        this.f36648b = zg3Var;
    }
}
