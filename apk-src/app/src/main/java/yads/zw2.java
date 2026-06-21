package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class zw2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zw2 f45574c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f45575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f45576b;

    static {
        zw2 zw2Var = new zw2(0L, 0L);
        new zw2(Long.MAX_VALUE, Long.MAX_VALUE);
        new zw2(Long.MAX_VALUE, 0L);
        new zw2(0L, Long.MAX_VALUE);
        f45574c = zw2Var;
    }

    public zw2(long j10, long j11) {
        ni.a(j10 >= 0);
        ni.a(j11 >= 0);
        this.f45575a = j10;
        this.f45576b = j11;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x005e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(long r11, long r13, long r15) {
        /*
            r10 = this;
            long r0 = r10.f45575a
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lf
            long r4 = r10.f45576b
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto Lf
            return r11
        Lf:
            int r4 = yads.lb3.f40466a
            long r4 = r11 - r0
            long r0 = r0 ^ r11
            long r6 = r11 ^ r4
            long r0 = r0 & r6
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L1d
            r4 = -9223372036854775808
        L1d:
            long r0 = r10.f45576b
            long r6 = r11 + r0
            long r8 = r11 ^ r6
            long r0 = r0 ^ r6
            long r0 = r0 & r8
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L2e
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L2e:
            int r0 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 > 0) goto L3a
            int r0 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r0 > 0) goto L3a
            r0 = r2
            goto L3b
        L3a:
            r0 = r1
        L3b:
            int r3 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r3 > 0) goto L44
            int r3 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r3 > 0) goto L44
            r1 = r2
        L44:
            if (r0 == 0) goto L59
            if (r1 == 0) goto L59
            long r0 = r13 - r11
            long r0 = java.lang.Math.abs(r0)
            long r11 = r15 - r11
            long r11 = java.lang.Math.abs(r11)
            int r11 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r11 > 0) goto L5e
            goto L5b
        L59:
            if (r0 == 0) goto L5c
        L5b:
            return r13
        L5c:
            if (r1 == 0) goto L5f
        L5e:
            return r15
        L5f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.zw2.a(long, long, long):long");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zw2.class == obj.getClass()) {
            zw2 zw2Var = (zw2) obj;
            if (this.f45575a == zw2Var.f45575a && this.f45576b == zw2Var.f45576b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f45575a) * 31) + ((int) this.f45576b);
    }
}
