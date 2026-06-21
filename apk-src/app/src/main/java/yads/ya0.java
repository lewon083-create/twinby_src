package yads;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ya0 implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final db0 f44987a;

    public ya0(db0 db0Var) {
        this.f44987a = db0Var;
    }

    @Override // yads.o0
    public final /* bridge */ /* synthetic */ Object a(View view, m0 m0Var, u0 u0Var) {
        return a(view, (wa0) m0Var, (mj.a) u0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.view.View r5, yads.wa0 r6, mj.a r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof yads.xa0
            if (r0 == 0) goto L13
            r0 = r7
            yads.xa0 r0 = (yads.xa0) r0
            int r1 = r0.f44629d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f44629d = r1
            goto L18
        L13:
            yads.xa0 r0 = new yads.xa0
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f44627b
            nj.a r1 = nj.a.f29512b
            int r2 = r0.f44629d
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            com.google.android.gms.internal.measurement.h5.E(r7)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            com.google.android.gms.internal.measurement.h5.E(r7)
            android.content.Context r5 = r5.getContext()
            yads.db0 r7 = r4.f44987a
            r0.f44629d = r3
            java.lang.Object r7 = r7.a(r5, r6, r0)
            if (r7 != r1) goto L41
            return r1
        L41:
            yads.ug2 r7 = (yads.ug2) r7
            yads.p01 r5 = new yads.p01
            r5.<init>(r3, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ya0.a(android.view.View, yads.wa0, mj.a):java.lang.Object");
    }
}
