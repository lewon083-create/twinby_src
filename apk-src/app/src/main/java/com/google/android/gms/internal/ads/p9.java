package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class p9 implements z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f8980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tk0 f8981b = new tk0(0, new byte[9400]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseIntArray f8982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q8 f8983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c6 f8984e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SparseArray f8985f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SparseBooleanArray f8986g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SparseBooleanArray f8987h;
    public final j9 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public n3 f8988j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b2 f8989k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f8990l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f8991m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f8992n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f8993o;

    static {
        int i = nz.G;
    }

    public p9(c6 c6Var, yo0 yo0Var, q8 q8Var) {
        this.f8983d = q8Var;
        this.f8984e = c6Var;
        this.f8980a = Collections.singletonList(yo0Var);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f8986g = sparseBooleanArray;
        this.f8987h = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f8985f = sparseArray;
        this.f8982c = new SparseIntArray();
        this.i = new j9(1);
        this.f8989k = b2.z1;
        this.f8993o = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i = 0; i < size; i++) {
            this.f8985f.put(sparseArray2.keyAt(i), (s9) sparseArray2.valueAt(i));
        }
        this.f8985f.put(0, new n9(new zd1(this)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        r1 = r1 + 1;
     */
    @Override // com.google.android.gms.internal.ads.z1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(com.google.android.gms.internal.ads.a2 r7) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.tk0 r0 = r6.f8981b
            byte[] r0 = r0.f10641a
            com.google.android.gms.internal.ads.v1 r7 = (com.google.android.gms.internal.ads.v1) r7
            r1 = 940(0x3ac, float:1.317E-42)
            r2 = 0
            r7.R(r0, r2, r1, r2)
            r1 = r2
        Ld:
            r3 = 188(0xbc, float:2.63E-43)
            if (r1 >= r3) goto L29
            r3 = r2
        L12:
            r4 = 5
            if (r3 >= r4) goto L24
            int r4 = r3 * 188
            int r4 = r4 + r1
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L21
            int r1 = r1 + 1
            goto Ld
        L21:
            int r3 = r3 + 1
            goto L12
        L24:
            r7.a(r1, r2)
            r7 = 1
            return r7
        L29:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.p9.a(com.google.android.gms.internal.ads.a2):boolean");
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void b(b2 b2Var) {
        this.f8989k = new b7(b2Var, this.f8984e);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    @Override // com.google.android.gms.internal.ads.z1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(long r10, long r12) {
        /*
            r9 = this;
            java.util.List r10 = r9.f8980a
            int r11 = r10.size()
            r0 = 0
            r1 = r0
        L8:
            r2 = 0
            if (r1 >= r11) goto L38
            java.lang.Object r4 = r10.get(r1)
            com.google.android.gms.internal.ads.yo0 r4 = (com.google.android.gms.internal.ads.yo0) r4
            monitor-enter(r4)
            long r5 = r4.f12676b     // Catch: java.lang.Throwable -> L35
            monitor-exit(r4)
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L2f
            long r5 = r4.a()
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 == 0) goto L32
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 == 0) goto L32
            int r2 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r2 == 0) goto L32
        L2f:
            r4.b(r12)
        L32:
            int r1 = r1 + 1
            goto L8
        L35:
            r10 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L35
            throw r10
        L38:
            int r10 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r10 == 0) goto L43
            com.google.android.gms.internal.ads.n3 r10 = r9.f8988j
            if (r10 == 0) goto L43
            r10.d(r12)
        L43:
            com.google.android.gms.internal.ads.tk0 r10 = r9.f8981b
            r10.y(r0)
            android.util.SparseIntArray r10 = r9.f8982c
            r10.clear()
        L4d:
            android.util.SparseArray r10 = r9.f8985f
            int r11 = r10.size()
            if (r0 >= r11) goto L61
            java.lang.Object r10 = r10.valueAt(r0)
            com.google.android.gms.internal.ads.s9 r10 = (com.google.android.gms.internal.ads.s9) r10
            r10.j()
            int r0 = r0 + 1
            goto L4d
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.p9.d(long, long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0285  */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [int] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [int] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.util.SparseArray] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [com.google.android.gms.internal.ads.s9] */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.util.SparseBooleanArray] */
    @Override // com.google.android.gms.internal.ads.z1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(com.google.android.gms.internal.ads.a2 r25, com.google.android.gms.internal.ads.e2 r26) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.p9.e(com.google.android.gms.internal.ads.a2, com.google.android.gms.internal.ads.e2):int");
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void c() {
    }
}
