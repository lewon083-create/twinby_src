package yads;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class qs1 extends qx0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f42379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f42380e;

    public qs1(v63 v63Var, HashMap map) {
        super(v63Var);
        int iB = v63Var.b();
        this.f42380e = new long[v63Var.b()];
        u63 u63Var = new u63();
        for (int i = 0; i < iB; i++) {
            this.f42380e[i] = v63Var.a(i, u63Var).f43591o;
        }
        int iA = v63Var.a();
        this.f42379d = new long[iA];
        s63 s63Var = new s63();
        for (int i10 = 0; i10 < iA; i10++) {
            v63Var.a(i10, s63Var, true);
            long jLongValue = ((Long) ni.a((Long) map.get(s63Var.f42824c))).longValue();
            long[] jArr = this.f42379d;
            jLongValue = jLongValue == Long.MIN_VALUE ? s63Var.f42826e : jLongValue;
            jArr[i10] = jLongValue;
            long j10 = s63Var.f42826e;
            if (j10 != -9223372036854775807L) {
                long[] jArr2 = this.f42380e;
                int i11 = s63Var.f42825d;
                jArr2[i11] = jArr2[i11] - (j10 - jLongValue);
            }
        }
    }

    @Override // yads.v63
    public final s63 a(int i, s63 s63Var, boolean z5) {
        this.f42417c.a(i, s63Var, z5);
        s63Var.f42826e = this.f42379d[i];
        return s63Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    @Override // yads.qx0, yads.v63
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final yads.u63 a(int r5, yads.u63 r6, long r7) {
        /*
            r4 = this;
            super.a(r5, r6, r7)
            long[] r7 = r4.f42380e
            r0 = r7[r5]
            r6.f43591o = r0
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r5 == 0) goto L1e
            long r2 = r6.f43590n
            int r5 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r5 != 0) goto L19
            goto L1e
        L19:
            long r7 = java.lang.Math.min(r2, r0)
            goto L20
        L1e:
            long r7 = r6.f43590n
        L20:
            r6.f43590n = r7
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.qs1.a(int, yads.u63, long):yads.u63");
    }
}
