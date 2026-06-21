package com.google.android.gms.internal.ads;

import android.util.Pair;
import android.util.SparseArray;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class x5 implements z1 {
    public static final byte[] L = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final jx1 M;
    public w5 A;
    public int B;
    public int C;
    public int D;
    public boolean E;
    public boolean F;
    public b2 G;
    public w2[] H;
    public w2[] I;
    public boolean J;
    public long K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z6 f12019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f12021c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f12026h;
    public final tk0 i;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final yd1 f12031n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final cf f12032o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public r51 f12033p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f12034q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f12035r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f12036s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f12037t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public tk0 f12038u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f12039v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f12040w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f12041x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f12042y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f12043z;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final n90 f12027j = new n90(1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final tk0 f12028k = new tk0(16);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final tk0 f12023e = new tk0(rs.f10056z);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final tk0 f12024f = new tk0(6);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final tk0 f12025g = new tk0();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayDeque f12029l = new ArrayDeque();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayDeque f12030m = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseArray f12022d = new SparseArray();

    static {
        ow1 ow1Var = new ow1();
        ow1Var.e("application/x-emsg");
        M = new jx1(ow1Var);
    }

    public x5(z6 z6Var, int i, r51 r51Var) {
        this.f12019a = z6Var;
        this.f12020b = i;
        this.f12021c = Collections.unmodifiableList(r51Var);
        byte[] bArr = new byte[16];
        this.f12026h = bArr;
        this.i = new tk0(bArr);
        v41 v41Var = x41.f12018c;
        this.f12033p = r51.f9713f;
        this.f12042y = -9223372036854775807L;
        this.f12041x = -9223372036854775807L;
        this.f12043z = -9223372036854775807L;
        this.G = b2.z1;
        this.H = new w2[0];
        this.I = new w2[0];
        this.f12031n = new yd1(new ox0(3, this));
        this.f12032o = new cf();
        this.K = -1L;
    }

    public static void h(int i) throws eb {
        if (i >= 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 27);
        sb2.append("Unexpected negative value: ");
        sb2.append(i);
        throw eb.a(null, sb2.toString());
    }

    public static void i(tk0 tk0Var, int i, i6 i6Var) throws eb {
        tk0Var.E(i + 8);
        int iB = tk0Var.b();
        byte[] bArr = s5.f10177a;
        if ((iB & 1) != 0) {
            throw eb.b("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z5 = (iB & 2) != 0;
        int iH = tk0Var.h();
        if (iH == 0) {
            Arrays.fill(i6Var.f6392k, 0, i6Var.f6386d, false);
            return;
        }
        int i10 = i6Var.f6386d;
        tk0 tk0Var2 = (tk0) i6Var.f6398q;
        if (iH != i10) {
            throw eb.a(null, pe.a.g(new StringBuilder(String.valueOf(iH).length() + 58 + String.valueOf(i10).length()), iH, "Senc sample count ", i10, " is different from fragment sample count"));
        }
        Arrays.fill(i6Var.f6392k, 0, iH, z5);
        tk0Var2.y(tk0Var.B());
        i6Var.f6391j = true;
        i6Var.f6393l = true;
        tk0Var.H(tk0Var2.f10641a, 0, tk0Var2.f10643c);
        tk0Var2.E(0);
        i6Var.f6393l = false;
    }

    public static Pair k(long j10, tk0 tk0Var) throws eb {
        long j11;
        long j12;
        tk0 tk0Var2 = tk0Var;
        tk0Var2.E(8);
        int iA = s5.a(tk0Var2.b());
        tk0Var2.G(4);
        long jP = tk0Var2.P();
        if (iA == 0) {
            j11 = tk0Var2.P();
            j12 = tk0Var2.P();
        } else {
            j11 = tk0Var2.j();
            j12 = tk0Var2.j();
        }
        long j13 = j12 + j10;
        long jU = cq0.u(j11, 1000000L, jP, RoundingMode.DOWN);
        tk0Var2.G(2);
        int iL = tk0Var2.L();
        int[] iArr = new int[iL];
        long[] jArr = new long[iL];
        long[] jArr2 = new long[iL];
        long[] jArr3 = new long[iL];
        long j14 = j13;
        long j15 = jU;
        int i = 0;
        while (i < iL) {
            int iB = tk0Var2.b();
            if ((Integer.MIN_VALUE & iB) != 0) {
                throw eb.a(null, "Unhandled indirect reference");
            }
            long jP2 = tk0Var2.P();
            iArr[i] = iB & Integer.MAX_VALUE;
            jArr[i] = j14;
            jArr3[i] = j15;
            j11 += jP2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            long jU2 = cq0.u(j11, 1000000L, jP, RoundingMode.DOWN);
            jArr4[i] = jU2 - jArr5[i];
            tk0Var2.G(4);
            j14 += (long) iArr[i];
            i++;
            iL = iL;
            tk0Var2 = tk0Var;
            j15 = jU2;
            jArr2 = jArr4;
            jArr3 = jArr5;
        }
        return Pair.create(Long.valueOf(jU), new u1(iArr, jArr, jArr2, jArr3));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.lv1 l(java.util.List r18) {
        /*
            Method dump skipped, instruction units count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.x5.l(java.util.List):com.google.android.gms.internal.ads.lv1");
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final boolean a(a2 a2Var) {
        r51 r51VarQ;
        t2 t2VarM = c80.m(a2Var, true, false);
        if (t2VarM != null) {
            r51VarQ = x41.q(t2VarM);
        } else {
            v41 v41Var = x41.f12018c;
            r51VarQ = r51.f9713f;
        }
        this.f12033p = r51VarQ;
        return t2VarM == null;
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void b(b2 b2Var) {
        if ((this.f12020b & 32) == 0) {
            b2Var = new b7(b2Var, this.f12019a);
        }
        this.G = b2Var;
        f();
        w2[] w2VarArr = new w2[2];
        this.H = w2VarArr;
        int i = 0;
        w2[] w2VarArr2 = (w2[]) cq0.m(0, w2VarArr);
        this.H = w2VarArr2;
        for (w2 w2Var : w2VarArr2) {
            w2Var.e(M);
        }
        List list = this.f12021c;
        this.I = new w2[list.size()];
        int i10 = 100;
        while (i < this.I.length) {
            int i11 = i10 + 1;
            w2 w2VarO = this.G.O(i10, 3);
            w2VarO.e((jx1) list.get(i));
            this.I[i] = w2VarO;
            i++;
            i10 = i11;
        }
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void d(long j10, long j11) {
        SparseArray sparseArray = this.f12022d;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((w5) sparseArray.valueAt(i)).a();
        }
        this.f12030m.clear();
        this.f12040w = 0;
        ((PriorityQueue) this.f12031n.f12603f).clear();
        this.f12041x = j11;
        this.f12029l.clear();
        f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e8, code lost:
    
        if ((r4 + r2) <= (r35.B - r35.C)) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01eb, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01ed, code lost:
    
        r19 = r4;
        r32 = r7;
        ((com.google.android.gms.internal.ads.v1) r36).J(r8, r12, r4 + r2, false);
        r6.E(0);
        r4 = r6.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0201, code lost:
    
        if (r4 < 0) goto L502;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0203, code lost:
    
        r35.D = r4 - r2;
        r4 = r35.f12023e;
        r4.E(0);
        r3.a(4, r4);
        r35.C += 4;
        r35.B += r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x021c, code lost:
    
        if (r35.I.length <= 0) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x021e, code lost:
    
        if (r2 <= 0) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0220, code lost:
    
        r4 = r8[4];
        r7 = com.google.android.gms.internal.ads.rs.T(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x022a, code lost:
    
        if (java.util.Objects.equals(r7, "video/avc") == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x022c, code lost:
    
        r18 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0231, code lost:
    
        if ((r4 & 31) == 6) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0234, code lost:
    
        r18 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x023b, code lost:
    
        if (java.util.Objects.equals(r7, "video/hevc") == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0245, code lost:
    
        if (((r18 & 126) >> 1) != 39) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0247, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0249, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x024d, code lost:
    
        r35.F = r7;
        r3.a(r2, r6);
        r35.C += r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0257, code lost:
    
        if (r2 <= 0) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x025b, code lost:
    
        if (r35.E != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0261, code lost:
    
        if (com.google.android.gms.internal.ads.rs.z(r8, r2, r5) == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0263, code lost:
    
        r35.E = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0266, code lost:
    
        r2 = r17;
        r4 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x026a, code lost:
    
        r7 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0275, code lost:
    
        throw com.google.android.gms.internal.ads.eb.a(null, "Invalid NAL length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0276, code lost:
    
        r19 = r4;
        r32 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x027d, code lost:
    
        if (r35.F == false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x027f, code lost:
    
        r7 = r35.f12025g;
        r7.y(r2);
        r24 = r6;
        ((com.google.android.gms.internal.ads.v1) r36).J(r7.f10641a, 0, r35.D, false);
        r3.a(r35.D, r7);
        r2 = r35.D;
        r4 = com.google.android.gms.internal.ads.rs.c(r7.f10643c, r7.f10641a);
        r7.E(0);
        r7.C(r4);
        r4 = r5.f6977o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02a9, code lost:
    
        if (r4 != (-1)) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02ad, code lost:
    
        if (r11.f12599b == 0) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02af, code lost:
    
        r11.g(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02b5, code lost:
    
        if (r11.f12599b == r4) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02b7, code lost:
    
        r11.g(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02ba, code lost:
    
        r11.h(r13, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02c6, code lost:
    
        if ((r17.b() & 4) == 0) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02c8, code lost:
    
        r11.i(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02cc, code lost:
    
        r24 = r6;
        r2 = r3.f(r36, r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02d5, code lost:
    
        r35.C += r2;
        r35.D -= r2;
        r2 = r17;
        r4 = r19;
        r6 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02e6, code lost:
    
        r0 = r17.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02ec, code lost:
    
        if (r35.E != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02ee, code lost:
    
        r0 = r0 | 67108864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02f1, code lost:
    
        r27 = r0;
        r0 = r17.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02f7, code lost:
    
        if (r0 == null) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02f9, code lost:
    
        r30 = r0.f6035c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02fe, code lost:
    
        r30 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0300, code lost:
    
        r25 = r13;
        r3.c(r25, r27, r35.B, 0, r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0311, code lost:
    
        if (r32.isEmpty() != false) goto L497;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0313, code lost:
    
        r0 = (com.google.android.gms.internal.ads.v5) r32.removeFirst();
        r2 = r35.f12040w;
        r7 = r0.f11238c;
        r35.f12040w = r2 - r7;
        r2 = r0.f11236a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0324, code lost:
    
        if (r0.f11237b == false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0326, code lost:
    
        r2 = r2 + r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0328, code lost:
    
        r4 = r2;
        r0 = r35.H;
        r2 = r0.length;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x032d, code lost:
    
        if (r10 >= r2) goto L500;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x032f, code lost:
    
        r0[r10].c(r4, 1, r7, r35.f12040w, null);
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x033f, code lost:
    
        if (r17.c() != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0341, code lost:
    
        r35.A = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0346, code lost:
    
        r35.f12034q = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x034a, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x06cc, code lost:
    
        throw com.google.android.gms.internal.ads.eb.b("Atom size less than header length (unsupported).");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ba, code lost:
    
        r3 = r2.f11634a;
        r4 = r2.f11635b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c7, code lost:
    
        if (r35.f12034q != 3) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cb, code lost:
    
        if (r2.f11645m != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cd, code lost:
    
        r6 = r2.f11637d.f6729d[r2.f11639f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d6, code lost:
    
        r6 = r4.f6389g[r2.f11639f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00dc, code lost:
    
        r35.B = r6;
        r6 = r2.f11637d.f6726a.f5670g.f6975m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ea, code lost:
    
        if (java.util.Objects.equals(r6, "video/avc") != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ec, code lost:
    
        java.util.Objects.equals(r6, "video/hevc");
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ef, code lost:
    
        r35.E = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f6, code lost:
    
        if (r2.f11639f >= r2.i) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f8, code lost:
    
        ((com.google.android.gms.internal.ads.v1) r36).a(r35.B, false);
        r0 = r2.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0103, code lost:
    
        if (r0 != null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0106, code lost:
    
        r3 = (com.google.android.gms.internal.ads.tk0) r4.f6398q;
        r0 = r0.f6036d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x010c, code lost:
    
        if (r0 == 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x010e, code lost:
    
        r3.G(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0111, code lost:
    
        r0 = r2.f11639f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0115, code lost:
    
        if (r4.f6391j == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x011b, code lost:
    
        if (r4.f6392k[r0] == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x011d, code lost:
    
        r3.G(r3.L() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0129, code lost:
    
        if (r2.c() != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x012b, code lost:
    
        r35.A = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0138, code lost:
    
        if (r2.f11637d.f6726a.f5671h != 1) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x013a, code lost:
    
        r35.B -= 8;
        ((com.google.android.gms.internal.ads.v1) r36).a(8, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0156, code lost:
    
        if ("audio/ac4".equals(r2.f11637d.f6726a.f5670g.f6975m) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0158, code lost:
    
        r35.C = r2.d(r35.B, 7);
        com.google.android.gms.internal.ads.c80.p(r35.B, r5);
        r3.a(7, r5);
        r5 = r35.C + 7;
        r35.C = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x016f, code lost:
    
        r5 = r2.d(r35.B, 0);
        r35.C = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0177, code lost:
    
        r35.B += r5;
        r35.f12034q = 4;
        r35.D = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0180, code lost:
    
        r5 = r2.f11637d;
        r6 = r5.f6726a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0186, code lost:
    
        if (r2.f11645m != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0188, code lost:
    
        r13 = r5.f6731f[r2.f11639f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x018f, code lost:
    
        r13 = r4.f6390h[r2.f11639f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0195, code lost:
    
        r4 = r6.f5673k;
        r5 = r6.f5670g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0199, code lost:
    
        if (r4 != 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x019b, code lost:
    
        r4 = r35.C;
        r5 = r35.B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x019f, code lost:
    
        if (r4 >= r5) goto L496;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01a1, code lost:
    
        r35.C += r3.f(r36, r5 - r4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01ac, code lost:
    
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01ae, code lost:
    
        r32 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b2, code lost:
    
        r6 = r35.f12024f;
        r8 = r6.f10641a;
        r8[0] = 0;
        r8[1] = 0;
        r8[r18] = 0;
        r12 = 4 - r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01c0, code lost:
    
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01c6, code lost:
    
        if (r35.C >= r35.B) goto L501;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01c8, code lost:
    
        r2 = r35.D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01ca, code lost:
    
        if (r2 != 0) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01cf, code lost:
    
        if (r35.I.length > 0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01d3, code lost:
    
        if (r35.E != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01d6, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01d8, code lost:
    
        r2 = com.google.android.gms.internal.ads.rs.p(r5);
     */
    @Override // com.google.android.gms.internal.ads.z1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(com.google.android.gms.internal.ads.a2 r36, com.google.android.gms.internal.ads.e2 r37) throws com.google.android.gms.internal.ads.eb, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 2247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.x5.e(com.google.android.gms.internal.ads.a2, com.google.android.gms.internal.ads.e2):int");
    }

    public final void f() {
        this.f12034q = 0;
        this.f12037t = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:307:0x079c, code lost:
    
        f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x079f, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(long r54) throws com.google.android.gms.internal.ads.eb {
        /*
            Method dump skipped, instruction units count: 1952
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.x5.g(long):void");
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final /* synthetic */ List j() {
        return this.f12033p;
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void c() {
    }
}
