package k5;

import ad.b1;
import ad.h0;
import ad.j0;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.i6;
import com.google.android.gms.internal.ads.yd1;
import j3.c0;
import j3.d0;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.UUID;
import m3.w;
import m3.z;
import q4.a0;
import q4.x;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements q4.k {
    public static final byte[] P = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final j3.o Q;
    public long A;
    public long B;
    public long C;
    public g D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public boolean I;
    public q4.m J;
    public a0[] K;
    public a0[] L;
    public boolean M;
    public boolean N;
    public long O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n5.k f26923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f26925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f26926d;
    public final byte[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m3.p f26931j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final w f26932k;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yd1 f26937p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a0 f26938q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m7.a f26939r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public b1 f26940s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f26941t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f26942u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f26943v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f26944w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public m3.p f26945x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f26946y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f26947z;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a1.e f26933l = new a1.e(3);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m3.p f26934m = new m3.p(16);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m3.p f26928f = new m3.p(n3.n.f29087a);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m3.p f26929g = new m3.p(6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m3.p f26930h = new m3.p();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayDeque f26935n = new ArrayDeque();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayDeque f26936o = new ArrayDeque();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseArray f26927e = new SparseArray();

    static {
        j3.n nVar = new j3.n();
        nVar.f26292m = c0.n("application/x-emsg");
        Q = new j3.o(nVar);
    }

    public h(n5.k kVar, int i, w wVar, q qVar, List list, v3.k kVar2) {
        this.f26923a = kVar;
        this.f26924b = i;
        this.f26932k = wVar;
        this.f26925c = qVar;
        this.f26926d = Collections.unmodifiableList(list);
        this.f26938q = kVar2;
        byte[] bArr = new byte[16];
        this.i = bArr;
        this.f26931j = new m3.p(bArr);
        h0 h0Var = j0.f818c;
        this.f26940s = b1.f768f;
        this.B = -9223372036854775807L;
        this.A = -9223372036854775807L;
        this.C = -9223372036854775807L;
        this.J = q4.m.X1;
        this.K = new a0[0];
        this.L = new a0[0];
        this.f26937p = new yd1(new e(this));
        this.f26939r = new m7.a(13);
        this.O = -1L;
    }

    public static j3.l f(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            n3.d dVar = (n3.d) list.get(i);
            if (dVar.f7316c == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = dVar.f29043d.f28589a;
                fe.c cVarI = p.i(bArr);
                UUID uuid = cVarI == null ? null : (UUID) cVarI.f16785c;
                if (uuid == null) {
                    m3.b.s("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new j3.k(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new j3.l(null, false, (j3.k[]) arrayList.toArray(new j3.k[0]));
    }

    public static void g(m3.p pVar, int i, i6 i6Var) throws d0 {
        pVar.M(i + 8);
        int iM = pVar.m();
        byte[] bArr = c.f26902a;
        if ((iM & 1) != 0) {
            throw d0.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z5 = (iM & 2) != 0;
        int iD = pVar.D();
        if (iD == 0) {
            Arrays.fill(i6Var.f6392k, 0, i6Var.f6386d, false);
            return;
        }
        int i10 = i6Var.f6386d;
        m3.p pVar2 = (m3.p) i6Var.f6398q;
        if (iD != i10) {
            StringBuilder sbM = l7.o.m(iD, "Senc sample count ", " is different from fragment sample count");
            sbM.append(i6Var.f6386d);
            throw d0.a(null, sbM.toString());
        }
        Arrays.fill(i6Var.f6392k, 0, iD, z5);
        pVar2.J(pVar.a());
        i6Var.f6391j = true;
        i6Var.f6393l = true;
        pVar.k(pVar2.f28589a, 0, pVar2.f28591c);
        pVar2.M(0);
        i6Var.f6393l = false;
    }

    public static Pair h(long j10, m3.p pVar) throws d0 {
        long jF;
        long jF2;
        m3.p pVar2 = pVar;
        pVar2.M(8);
        int iE = c.e(pVar2.m());
        pVar2.N(4);
        long jB = pVar2.B();
        if (iE == 0) {
            jF = pVar2.B();
            jF2 = pVar2.B();
        } else {
            jF = pVar2.F();
            jF2 = pVar2.F();
        }
        long j11 = jF2 + j10;
        String str = z.f28608a;
        long jU = z.U(jF, 1000000L, jB, RoundingMode.DOWN);
        pVar2.N(2);
        int iG = pVar2.G();
        int[] iArr = new int[iG];
        long[] jArr = new long[iG];
        long[] jArr2 = new long[iG];
        long[] jArr3 = new long[iG];
        long j12 = j11;
        long j13 = jU;
        int i = 0;
        while (i < iG) {
            int iM = pVar2.m();
            if ((Integer.MIN_VALUE & iM) != 0) {
                throw d0.a(null, "Unhandled indirect reference");
            }
            long jB2 = pVar2.B();
            iArr[i] = iM & Integer.MAX_VALUE;
            jArr[i] = j12;
            jArr3[i] = j13;
            jF += jB2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            long jU2 = z.U(jF, 1000000L, jB, RoundingMode.DOWN);
            jArr4[i] = jU2 - jArr5[i];
            pVar2.N(4);
            j12 += (long) iArr[i];
            i++;
            iG = iG;
            pVar2 = pVar;
            j13 = jU2;
            jArr2 = jArr4;
            jArr3 = jArr5;
        }
        return Pair.create(Long.valueOf(jU), new q4.g(iArr, jArr, jArr2, jArr3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e9, code lost:
    
        if (r32.F >= r32.E) goto L519;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01eb, code lost:
    
        r2 = r32.G;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01ed, code lost:
    
        if (r2 != 0) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01f2, code lost:
    
        if (r32.L.length > 0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01f6, code lost:
    
        if (r32.H != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01f8, code lost:
    
        r2 = n3.n.e(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0208, code lost:
    
        if ((r22 + r2) > (r32.E - r32.F)) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x020a, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x020d, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x020e, code lost:
    
        r33.readFully(r9, r12, r22 + r2);
        r15.M(0);
        r19 = r15.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x021b, code lost:
    
        if (r19 < 0) goto L520;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x021d, code lost:
    
        r32.G = r19 - r2;
        r13 = r32.f26928f;
        r25 = r12;
        r13.M(0);
        r8.d(4, r13);
        r32.F += 4;
        r32.E += r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x023b, code lost:
    
        if (r32.L.length <= 0) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x023d, code lost:
    
        if (r2 <= 0) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x023f, code lost:
    
        r13 = r9[4];
        r12 = n3.n.c(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0249, code lost:
    
        if (java.util.Objects.equals(r12, r11) == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x024b, code lost:
    
        r26 = r11;
        r20 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0252, code lost:
    
        if ((r13 & 31) == 6) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0255, code lost:
    
        r26 = r11;
        r20 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x025e, code lost:
    
        if (java.util.Objects.equals(r12, "video/hevc") == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0268, code lost:
    
        if (((r20 & 126) >> 1) != 39) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x026a, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x026c, code lost:
    
        r26 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x026f, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0270, code lost:
    
        r32.I = r11;
        r8.d(r2, r15);
        r32.F += r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x027a, code lost:
    
        if (r2 <= 0) goto L522;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x027e, code lost:
    
        if (r32.H != false) goto L523;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0284, code lost:
    
        if (n3.n.d(r9, r2, r6) == false) goto L524;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0286, code lost:
    
        r32.H = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0289, code lost:
    
        r13 = r22;
        r12 = r25;
        r11 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0298, code lost:
    
        throw j3.d0.a(null, "Invalid NAL length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0299, code lost:
    
        r26 = r11;
        r25 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02a0, code lost:
    
        if (r32.I == false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02a2, code lost:
    
        r11 = r32.f26930h;
        r11.J(r2);
        r33.readFully(r11.f28589a, 0, r32.G);
        r8.d(r32.G, r11);
        r2 = r32.G;
        r2 = n3.n.n(r11.f28591c, r11.f28589a);
        r11.M(0);
        r11.L(r2);
        r2 = r6.f26337p;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02c9, code lost:
    
        if (r2 != (-1)) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02cd, code lost:
    
        if (r7.f12599b == 0) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02cf, code lost:
    
        r7.d(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02d5, code lost:
    
        if (r7.f12599b == r2) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02d7, code lost:
    
        r7.d(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02da, code lost:
    
        r7.a(r4, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02e6, code lost:
    
        if ((r17.a() & 4) == 0) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02e8, code lost:
    
        r7.b(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02eb, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02ee, code lost:
    
        r2 = r8.c(r33, r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02f5, code lost:
    
        r32.F += r2;
        r32.G -= r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0300, code lost:
    
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0302, code lost:
    
        r2 = r32.F;
        r6 = r32.E;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0306, code lost:
    
        if (r2 >= r6) goto L530;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0308, code lost:
    
        r32.F += r8.c(r33, r6 - r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0314, code lost:
    
        r1 = r17.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x031a, code lost:
    
        if (r32.H != false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x031c, code lost:
    
        r1 = r1 | 67108864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x031f, code lost:
    
        r28 = r1;
        r1 = r17.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0325, code lost:
    
        if (r1 == null) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0327, code lost:
    
        r31 = r1.f27007c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x032c, code lost:
    
        r31 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x032e, code lost:
    
        r26 = r4;
        r8.f(r26, r28, r32.E, 0, r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x033f, code lost:
    
        if (r3.isEmpty() != false) goto L526;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0341, code lost:
    
        r1 = (k5.f) r3.removeFirst();
        r32.f26947z -= r1.f26910c;
        r4 = r1.f26908a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0352, code lost:
    
        if (r1.f26909b == false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0354, code lost:
    
        r4 = r4 + r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0356, code lost:
    
        if (r14 == null) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0358, code lost:
    
        r4 = r14.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x035c, code lost:
    
        r7 = r4;
        r2 = r32.K;
        r4 = r2.length;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0361, code lost:
    
        if (r5 >= r4) goto L529;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0363, code lost:
    
        r2[r5].f(r7, 1, r1.f26910c, r32.f26947z, null);
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0375, code lost:
    
        if (r17.c() != false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0377, code lost:
    
        r32.D = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x037a, code lost:
    
        r32.f26941t = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x037f, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x06f4, code lost:
    
        throw j3.d0.c("Atom size less than header length (unsupported).");
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ce, code lost:
    
        r5 = r2.f26912b;
        r11 = "video/avc";
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d9, code lost:
    
        if (r32.f26941t != 3) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00dd, code lost:
    
        if (r2.f26922m != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00df, code lost:
    
        r6 = r2.f26914d.f27013d[r2.f26916f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e8, code lost:
    
        r6 = r5.f6389g[r2.f26916f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ee, code lost:
    
        r32.E = r6;
        r6 = r2.f26914d.f27010a.f27000g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fc, code lost:
    
        if (java.util.Objects.equals(r6.f26335n, "video/avc") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0100, code lost:
    
        if ((r4 & 64) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0102, code lost:
    
        r4 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0105, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x010e, code lost:
    
        if (java.util.Objects.equals(r6.f26335n, "video/hevc") == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0112, code lost:
    
        if ((r4 & 128) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0115, code lost:
    
        r32.H = !r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x011d, code lost:
    
        if (r2.f26916f >= r2.i) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x011f, code lost:
    
        r33.M(r32.E);
        r1 = r2.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0128, code lost:
    
        if (r1 != null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x012b, code lost:
    
        r3 = (m3.p) r5.f6398q;
        r1 = r1.f27008d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0131, code lost:
    
        if (r1 == 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0133, code lost:
    
        r3.N(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0136, code lost:
    
        r1 = r2.f26916f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x013a, code lost:
    
        if (r5.f6391j == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0140, code lost:
    
        if (r5.f6392k[r1] == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0142, code lost:
    
        r3.N(r3.G() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x014e, code lost:
    
        if (r2.c() != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0150, code lost:
    
        r32.D = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0153, code lost:
    
        r32.f26941t = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0156, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x015f, code lost:
    
        if (r2.f26914d.f27010a.f27001h != r21) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0161, code lost:
    
        r32.E -= 8;
        r33.M(r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x017a, code lost:
    
        if ("audio/ac4".equals(r2.f26914d.f27010a.f27000g.f26335n) == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x017c, code lost:
    
        r32.F = r2.d(r32.E, 7);
        q4.b.i(r32.E, r8);
        r2.f26911a.d(7, r8);
        r32.F += 7;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0197, code lost:
    
        r6 = 0;
        r32.F = r2.d(r32.E, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a1, code lost:
    
        r32.E += r32.F;
        r32.f26941t = 4;
        r32.G = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ac, code lost:
    
        r4 = r2.f26914d;
        r6 = r4.f27010a;
        r8 = r2.f26911a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01b4, code lost:
    
        if (r2.f26922m != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b6, code lost:
    
        r15 = r4.f27015f[r2.f26916f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01bc, code lost:
    
        r4 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01be, code lost:
    
        r15 = r5.f6390h[r2.f26916f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01c5, code lost:
    
        if (r14 == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01c7, code lost:
    
        r4 = r14.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01cb, code lost:
    
        r13 = r6.f27003k;
        r6 = r6.f27000g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01cf, code lost:
    
        if (r13 == 0) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01d1, code lost:
    
        r15 = r32.f26929g;
        r9 = r15.f28589a;
        r9[0] = 0;
        r9[1] = 0;
        r9[r20] = 0;
        r12 = 4 - r13;
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01e3, code lost:
    
        r22 = r13;
     */
    @Override // q4.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(q4.l r33, com.google.android.gms.internal.ads.e2 r34) throws j3.d0 {
        /*
            Method dump skipped, instruction units count: 2287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.h.a(q4.l, com.google.android.gms.internal.ads.e2):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b8  */
    @Override // q4.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(q4.m r18) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.h.b(q4.m):void");
    }

    @Override // q4.k
    public final List c() {
        return this.f26940s;
    }

    @Override // q4.k
    public final boolean d(q4.l lVar) {
        b1 b1VarW;
        x xVarL = p.l(lVar, true, false);
        if (xVarL != null) {
            b1VarW = j0.w(xVarL);
        } else {
            h0 h0Var = j0.f818c;
            b1VarW = b1.f768f;
        }
        this.f26940s = b1VarW;
        return xVarL == null;
    }

    public final void e() {
        this.f26941t = 0;
        this.f26944w = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:362:0x0807, code lost:
    
        e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x080a, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0726  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(long r56) throws j3.d0 {
        /*
            Method dump skipped, instruction units count: 2059
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.h.i(long):void");
    }

    @Override // q4.k
    public final void seek(long j10, long j11) {
        SparseArray sparseArray = this.f26927e;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((g) sparseArray.valueAt(i)).e();
        }
        this.f26936o.clear();
        this.f26947z = 0;
        ((PriorityQueue) this.f26937p.f12603f).clear();
        this.A = j11;
        this.f26935n.clear();
        e();
    }

    @Override // q4.k
    public final void release() {
    }
}
