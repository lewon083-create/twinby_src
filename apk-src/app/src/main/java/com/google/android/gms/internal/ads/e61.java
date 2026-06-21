package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e61 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char[] f4854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4857e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f4858f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f4859g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean[] f4860h;
    public final boolean i;

    /* JADX WARN: Illegal instructions before constructor call */
    public e61(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < cArr.length; i++) {
            char c8 = cArr[i];
            if (!(c8 < 128)) {
                throw new IllegalArgumentException(gr.P("Non-ASCII character: %s", Character.valueOf(c8)));
            }
            if (!(bArr[c8] == -1)) {
                throw new IllegalArgumentException(gr.P("Duplicate character: %s", Character.valueOf(c8)));
            }
            bArr[c8] = (byte) i;
        }
        this(str, cArr, bArr, false);
    }

    public final int a(char c8) throws h61 {
        if (c8 > 127) {
            throw new h61("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c8))));
        }
        byte b2 = this.f4859g[c8];
        if (b2 != -1) {
            return b2;
        }
        if (c8 <= ' ' || c8 == 127) {
            throw new h61("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c8))));
        }
        throw new h61(a0.u.n(new StringBuilder(String.valueOf(c8).length() + 24), "Unrecognized character: ", c8));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e61)) {
            return false;
        }
        e61 e61Var = (e61) obj;
        return this.i == e61Var.i && Arrays.equals(this.f4854b, e61Var.f4854b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f4854b) + (true != this.i ? 1237 : 1231);
    }

    public final String toString() {
        return this.f4853a;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0067 A[LOOP:0: B:19:0x0063->B:21:0x0067, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e61(java.lang.String r5, char[] r6, byte[] r7, boolean r8) {
        /*
            r4 = this;
            r4.<init>()
            r4.f4853a = r5
            r6.getClass()
            r4.f4854b = r6
            int r5 = r6.length     // Catch: java.lang.ArithmeticException -> L7b
            java.math.RoundingMode r0 = java.math.RoundingMode.UNNECESSARY     // Catch: java.lang.ArithmeticException -> L7b
            if (r5 <= 0) goto L7d
            int[] r1 = com.google.android.gms.internal.ads.r61.f9716a     // Catch: java.lang.ArithmeticException -> L7b
            int r0 = r0.ordinal()     // Catch: java.lang.ArithmeticException -> L7b
            r0 = r1[r0]     // Catch: java.lang.ArithmeticException -> L7b
            r1 = 0
            r2 = 1
            switch(r0) {
                case 1: goto L3a;
                case 2: goto L45;
                case 3: goto L45;
                case 4: goto L31;
                case 5: goto L31;
                case 6: goto L22;
                case 7: goto L22;
                case 8: goto L22;
                default: goto L1c;
            }     // Catch: java.lang.ArithmeticException -> L7b
        L1c:
            java.lang.AssertionError r5 = new java.lang.AssertionError     // Catch: java.lang.ArithmeticException -> L7b
            r5.<init>()     // Catch: java.lang.ArithmeticException -> L7b
            throw r5     // Catch: java.lang.ArithmeticException -> L7b
        L22:
            int r0 = java.lang.Integer.numberOfLeadingZeros(r5)     // Catch: java.lang.ArithmeticException -> L7b
            r3 = -1257966797(0xffffffffb504f333, float:-4.9527733E-7)
            int r3 = r3 >>> r0
            int r0 = 31 - r0
            int r3 = r3 - r5
            int r3 = r3 >>> 31
            int r0 = r0 + r3
            goto L4b
        L31:
            int r0 = r5 + (-1)
            int r0 = java.lang.Integer.numberOfLeadingZeros(r0)     // Catch: java.lang.ArithmeticException -> L7b
            int r0 = 32 - r0
            goto L4b
        L3a:
            int r0 = r5 + (-1)
            r0 = r0 & r5
            if (r0 != 0) goto L41
            r0 = r2
            goto L42
        L41:
            r0 = r1
        L42:
            com.google.android.gms.internal.ads.ix.B(r0)     // Catch: java.lang.ArithmeticException -> L7b
        L45:
            int r0 = java.lang.Integer.numberOfLeadingZeros(r5)     // Catch: java.lang.ArithmeticException -> L7b
            int r0 = 31 - r0
        L4b:
            r4.f4856d = r0     // Catch: java.lang.ArithmeticException -> L7b
            int r6 = java.lang.Integer.numberOfTrailingZeros(r0)
            int r3 = 3 - r6
            int r3 = r2 << r3
            r4.f4857e = r3
            int r6 = r0 >> r6
            r4.f4858f = r6
            int r5 = r5 + (-1)
            r4.f4855c = r5
            r4.f4859g = r7
            boolean[] r5 = new boolean[r3]
        L63:
            int r6 = r4.f4858f
            if (r1 >= r6) goto L76
            int r6 = r1 * 8
            int r7 = r4.f4856d
            java.math.RoundingMode r0 = java.math.RoundingMode.CEILING
            int r6 = com.google.android.gms.internal.ads.vv.s(r6, r7)
            r5[r6] = r2
            int r1 = r1 + 1
            goto L63
        L76:
            r4.f4860h = r5
            r4.i = r8
            return
        L7b:
            r5 = move-exception
            goto L85
        L7d:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch: java.lang.ArithmeticException -> L7b
            java.lang.String r7 = "x (0) must be > 0"
            r5.<init>(r7)     // Catch: java.lang.ArithmeticException -> L7b
            throw r5     // Catch: java.lang.ArithmeticException -> L7b
        L85:
            int r6 = r6.length
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = java.lang.String.valueOf(r6)
            int r8 = r8.length()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r8 = r8 + 24
            r0.<init>(r8)
            java.lang.String r8 = "Illegal alphabet length "
            java.lang.String r6 = l7.o.j(r6, r8, r0)
            r7.<init>(r6, r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.e61.<init>(java.lang.String, char[], byte[], boolean):void");
    }
}
