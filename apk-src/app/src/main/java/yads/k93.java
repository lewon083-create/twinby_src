package yads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class k93 implements nq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f40110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lb2 f40111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseIntArray f40112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n93 f40113f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SparseArray f40114g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SparseBooleanArray f40115h;
    public final SparseBooleanArray i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h93 f40116j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public g93 f40117k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public qq0 f40118l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f40119m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f40120n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f40121o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f40122p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public p93 f40123q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f40124r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f40125s;

    public k93(int i) {
        this(new b73(0L), new jf0());
    }

    @Override // yads.nq0
    public final void a(qq0 qq0Var) {
        this.f40118l = qq0Var;
    }

    public final void b() {
        this.f40115h.clear();
        this.f40114g.clear();
        ((jf0) this.f40113f).getClass();
        SparseArray sparseArray = new SparseArray();
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            this.f40114g.put(sparseArray.keyAt(i), (p93) sparseArray.valueAt(i));
        }
        this.f40114g.put(0, new vw2(new i93(this)));
        this.f40123q = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    @Override // yads.nq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void seek(long r9, long r11) {
        /*
            r8 = this;
            int r9 = r8.f40108a
            r10 = 2
            if (r9 == r10) goto L76
            java.util.List r9 = r8.f40110c
            int r9 = r9.size()
            r10 = 0
            r0 = r10
        Ld:
            r1 = 0
            if (r0 >= r9) goto L47
            java.util.List r3 = r8.f40110c
            java.lang.Object r3 = r3.get(r0)
            yads.b73 r3 = (yads.b73) r3
            monitor-enter(r3)
            long r4 = r3.f36951b     // Catch: java.lang.Throwable -> L44
            monitor-exit(r3)
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L28
            r4 = 1
            goto L29
        L28:
            r4 = r10
        L29:
            if (r4 != 0) goto L3c
            long r4 = r3.a()
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L41
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 == 0) goto L41
            int r1 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r1 == 0) goto L41
            goto L3e
        L3c:
            if (r4 == 0) goto L41
        L3e:
            r3.c(r11)
        L41:
            int r0 = r0 + 1
            goto Ld
        L44:
            r9 = move-exception
            monitor-exit(r3)
            throw r9
        L47:
            int r9 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r9 == 0) goto L52
            yads.g93 r9 = r8.f40117k
            if (r9 == 0) goto L52
            r9.a(r11)
        L52:
            yads.lb2 r9 = r8.f40111d
            r9.c(r10)
            android.util.SparseIntArray r9 = r8.f40112e
            r9.clear()
            r9 = r10
        L5d:
            android.util.SparseArray r11 = r8.f40114g
            int r11 = r11.size()
            if (r9 >= r11) goto L73
            android.util.SparseArray r11 = r8.f40114g
            java.lang.Object r11 = r11.valueAt(r9)
            yads.p93 r11 = (yads.p93) r11
            r11.a()
            int r9 = r9 + 1
            goto L5d
        L73:
            r8.f40124r = r10
            return
        L76:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.k93.seek(long, long):void");
    }

    public k93(b73 b73Var, jf0 jf0Var) {
        this.f40113f = (n93) ni.a(jf0Var);
        this.f40109b = 112800;
        this.f40108a = 1;
        this.f40110c = Collections.singletonList(b73Var);
        this.f40111d = new lb2(0, new byte[9400]);
        this.f40115h = new SparseBooleanArray();
        this.i = new SparseBooleanArray();
        this.f40114g = new SparseArray();
        this.f40112e = new SparseIntArray();
        this.f40116j = new h93();
        this.f40118l = qq0.f42370a;
        this.f40125s = -1;
        b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v3, types: [yads.p93] */
    /* JADX WARN: Type inference failed for: r4v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [int] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.util.SparseBooleanArray] */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // yads.nq0
    public final int a(oq0 oq0Var, ig2 ig2Var) throws qb2, EOFException, InterruptedIOException {
        long j10;
        int i;
        ?? r11;
        long j11;
        long j12;
        boolean z5;
        ld0 ld0Var = (ld0) oq0Var;
        long j13 = ld0Var.f40504c;
        if (this.f40120n) {
            long j14 = -9223372036854775807L;
            if (j13 == -1 || this.f40108a == 2) {
                j11 = 0;
            } else {
                h93 h93Var = this.f40116j;
                j11 = 0;
                if (!h93Var.f39106d) {
                    int i10 = this.f40125s;
                    if (i10 <= 0) {
                        h93Var.f39105c.a(lb3.f40471f);
                        h93Var.f39106d = true;
                        ld0Var.f40507f = 0;
                    } else {
                        if (!h93Var.f39108f) {
                            int iMin = (int) Math.min(h93Var.f39103a, j13);
                            long j15 = j13 - ((long) iMin);
                            if (ld0Var.f40505d != j15) {
                                ig2Var.f39538a = j15;
                                return 1;
                            }
                            h93Var.f39105c.c(iMin);
                            ld0Var.f40507f = 0;
                            ld0Var.b(h93Var.f39105c.f40463a, 0, iMin, false);
                            lb2 lb2Var = h93Var.f39105c;
                            int i11 = lb2Var.f40464b;
                            int i12 = lb2Var.f40465c;
                            int i13 = i12 - 188;
                            while (true) {
                                if (i13 < i11) {
                                    break;
                                }
                                byte[] bArr = lb2Var.f40463a;
                                int i14 = -4;
                                int i15 = 0;
                                while (true) {
                                    if (i14 > 4) {
                                        break;
                                    }
                                    int i16 = (i14 * 188) + i13;
                                    if (i16 < i11 || i16 >= i12 || bArr[i16] != 71) {
                                        i15 = 0;
                                    } else {
                                        i15++;
                                        if (i15 == 5) {
                                            long jA = q93.a(i13, i10, lb2Var);
                                            if (jA != -9223372036854775807L) {
                                                j14 = jA;
                                                break;
                                            }
                                        }
                                    }
                                    i14++;
                                }
                                i13--;
                            }
                            h93Var.f39110h = j14;
                            h93Var.f39108f = true;
                            return 0;
                        }
                        if (h93Var.f39110h == -9223372036854775807L) {
                            h93Var.f39105c.a(lb3.f40471f);
                            h93Var.f39106d = true;
                            ld0Var.f40507f = 0;
                        } else {
                            if (!h93Var.f39107e) {
                                int iMin2 = (int) Math.min(h93Var.f39103a, j13);
                                long j16 = 0;
                                if (ld0Var.f40505d != j16) {
                                    ig2Var.f39538a = j16;
                                    return 1;
                                }
                                h93Var.f39105c.c(iMin2);
                                ld0Var.f40507f = 0;
                                ld0Var.b(h93Var.f39105c.f40463a, 0, iMin2, false);
                                lb2 lb2Var2 = h93Var.f39105c;
                                int i17 = lb2Var2.f40464b;
                                int i18 = lb2Var2.f40465c;
                                while (true) {
                                    if (i17 >= i18) {
                                        break;
                                    }
                                    if (lb2Var2.f40463a[i17] == 71) {
                                        long jA2 = q93.a(i17, i10, lb2Var2);
                                        if (jA2 != -9223372036854775807L) {
                                            j14 = jA2;
                                            break;
                                        }
                                    }
                                    i17++;
                                }
                                h93Var.f39109g = j14;
                                h93Var.f39107e = true;
                                return 0;
                            }
                            long j17 = h93Var.f39109g;
                            if (j17 == -9223372036854775807L) {
                                h93Var.f39105c.a(lb3.f40471f);
                                h93Var.f39106d = true;
                                ld0Var.f40507f = 0;
                            } else {
                                long jB = h93Var.f39104b.b(h93Var.f39110h) - h93Var.f39104b.b(j17);
                                h93Var.i = jB;
                                if (jB < 0) {
                                    kh1.d("TsDurationReader", "Invalid duration: " + h93Var.i + ". Using TIME_UNSET instead.");
                                    h93Var.i = -9223372036854775807L;
                                }
                                h93Var.f39105c.a(lb3.f40471f);
                                h93Var.f39106d = true;
                                ld0Var.f40507f = 0;
                            }
                        }
                    }
                    return 0;
                }
            }
            if (this.f40121o) {
                j10 = -1;
                i = 1;
                j12 = j11;
                z5 = false;
            } else {
                this.f40121o = true;
                h93 h93Var2 = this.f40116j;
                long j18 = h93Var2.i;
                if (j18 != -9223372036854775807L) {
                    j10 = -1;
                    i = 1;
                    j12 = j11;
                    z5 = false;
                    g93 g93Var = new g93(h93Var2.f39104b, j18, j13, this.f40125s, this.f40109b);
                    this.f40117k = g93Var;
                    this.f40118l.a(g93Var.f43395a);
                } else {
                    j10 = -1;
                    i = 1;
                    j12 = j11;
                    z5 = false;
                    this.f40118l.a(new xw2(j18, j12));
                }
            }
            if (this.f40122p) {
                this.f40122p = z5;
                seek(j12, j12);
                if (ld0Var.f40505d != j12) {
                    ig2Var.f39538a = j12;
                    return i;
                }
            }
            g93 g93Var2 = this.f40117k;
            r11 = z5;
            if (g93Var2 != null) {
                r11 = z5;
                if (g93Var2.f43397c != null) {
                    return g93Var2.a(ld0Var, ig2Var);
                }
            }
        } else {
            j10 = -1;
            i = 1;
            r11 = 0;
        }
        lb2 lb2Var3 = this.f40111d;
        byte[] bArr2 = lb2Var3.f40463a;
        int i19 = lb2Var3.f40464b;
        if (9400 - i19 < 188) {
            int i20 = lb2Var3.f40465c - i19;
            if (i20 > 0) {
                System.arraycopy(bArr2, i19, bArr2, r11, i20);
            }
            lb2 lb2Var4 = this.f40111d;
            lb2Var4.f40463a = bArr2;
            lb2Var4.f40465c = i20;
            lb2Var4.f40464b = r11;
        }
        while (true) {
            lb2 lb2Var5 = this.f40111d;
            int i21 = lb2Var5.f40465c;
            int i22 = lb2Var5.f40464b;
            if (i21 - i22 >= 188) {
                byte[] bArr3 = lb2Var5.f40463a;
                int i23 = i22;
                while (i23 < i21 && bArr3[i23] != 71) {
                    i23++;
                }
                this.f40111d.e(i23);
                int i24 = i23 + 188;
                if (i24 > i21) {
                    int i25 = (i23 - i22) + this.f40124r;
                    this.f40124r = i25;
                    if (this.f40108a == 2 && i25 > 376) {
                        ?? r42 = i;
                        throw new qb2("Cannot find sync byte. Most likely not a Transport Stream.", null, r42, r42 == true ? 1 : 0);
                    }
                } else {
                    this.f40124r = r11;
                }
                lb2 lb2Var6 = this.f40111d;
                int i26 = lb2Var6.f40465c;
                if (i24 > i26) {
                    return r11;
                }
                int iB = lb2Var6.b();
                if ((8388608 & iB) != 0) {
                    this.f40111d.e(i24);
                    return r11;
                }
                ?? r52 = (4194304 & iB) != 0 ? 1 : r11;
                int i27 = (2096896 & iB) >> 8;
                ?? r92 = (iB & 32) != 0 ? 1 : r11;
                ?? r32 = (iB & 16) != 0 ? (p93) this.f40114g.get(i27) : 0;
                if (r32 == 0) {
                    this.f40111d.e(i24);
                    return r11;
                }
                if (this.f40108a != 2) {
                    int i28 = iB & 15;
                    int i29 = this.f40112e.get(i27, i28 - 1);
                    this.f40112e.put(i27, i28);
                    if (i29 == i28) {
                        this.f40111d.e(i24);
                        return r11;
                    }
                    if (i28 != ((i29 + 1) & 15)) {
                        r32.a();
                    }
                }
                if (r92 != 0) {
                    int iM = this.f40111d.m();
                    r52 = (r52 == true ? 1 : 0) | ((this.f40111d.m() & 64) != 0 ? 2 : r11);
                    lb2 lb2Var7 = this.f40111d;
                    lb2Var7.e(lb2Var7.f40464b + (iM - 1));
                }
                boolean z10 = this.f40120n;
                if (this.f40108a == 2 || z10 || !this.i.get(i27, r11)) {
                    this.f40111d.d(i24);
                    r32.a(r52, this.f40111d);
                    this.f40111d.d(i26);
                }
                if (this.f40108a != 2 && !z10 && this.f40120n && j13 != j10) {
                    this.f40122p = true;
                }
                this.f40111d.e(i24);
                return r11;
            }
            int i30 = ld0Var.read(bArr2, i21, 9400 - i21);
            if (i30 == -1) {
                return -1;
            }
            this.f40111d.d(i21 + i30);
        }
    }

    @Override // yads.nq0
    public final void release() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        r2 = r2 + 1;
     */
    @Override // yads.nq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(yads.oq0 r7) {
        /*
            r6 = this;
            yads.lb2 r0 = r6.f40111d
            byte[] r0 = r0.f40463a
            yads.ld0 r7 = (yads.ld0) r7
            r1 = 0
            r2 = 940(0x3ac, float:1.317E-42)
            r7.b(r0, r1, r2, r1)
            r2 = r1
        Ld:
            r3 = 188(0xbc, float:2.63E-43)
            if (r2 >= r3) goto L29
            r3 = r1
        L12:
            r4 = 5
            if (r3 >= r4) goto L24
            int r4 = r3 * 188
            int r4 = r4 + r2
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L21
            int r2 = r2 + 1
            goto Ld
        L21:
            int r3 = r3 + 1
            goto L12
        L24:
            r7.a(r2)
            r7 = 1
            return r7
        L29:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.k93.a(yads.oq0):boolean");
    }

    public static nq0[] a() {
        return new nq0[]{new k93(0)};
    }
}
