package yads;

import android.util.Pair;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import kotlin.KotlinVersion;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class tx0 implements nq0 {
    public static final byte[] G = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final nx0 H;
    public int A;
    public boolean B;
    public qq0 C;
    public p73[] D;
    public p73[] E;
    public boolean F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f43462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseArray f43463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lb2 f43464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lb2 f43465e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final lb2 f43466f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f43467g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final lb2 f43468h;
    public final zm0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final lb2 f43469j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayDeque f43470k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayDeque f43471l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p73 f43472m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f43473n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f43474o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f43475p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f43476q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public lb2 f43477r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f43478s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f43479t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f43480u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f43481v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f43482w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public sx0 f43483x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f43484y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f43485z;

    static {
        mx0 mx0Var = new mx0();
        mx0Var.f41075k = "application/x-emsg";
        H = new nx0(mx0Var);
    }

    public tx0() {
        this(0);
    }

    public final h73 a(h73 h73Var) {
        return h73Var;
    }

    @Override // yads.nq0
    public final void seek(long j10, long j11) {
        int size = this.f43463c.size();
        for (int i = 0; i < size; i++) {
            ((sx0) this.f43463c.valueAt(i)).b();
        }
        this.f43471l.clear();
        this.f43479t = 0;
        this.f43480u = j11;
        this.f43470k.clear();
        this.f43473n = 0;
        this.f43476q = 0;
    }

    public tx0(int i) {
        this(Collections.EMPTY_LIST);
    }

    public static lk0 a(ArrayList arrayList) {
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i = 0; i < size; i++) {
            wj wjVar = (wj) arrayList.get(i);
            if (wjVar.f44730a == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = wjVar.f44413b.f40463a;
                fl2 fl2VarA = gl2.a(bArr);
                UUID uuid = fl2VarA == null ? null : fl2VarA.f38476a;
                if (uuid == null) {
                    kh1.d("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new kk0(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new lk0(null, false, (kk0[]) arrayList2.toArray(new kk0[0]));
    }

    public tx0(int i, List list, p73 p73Var) {
        this.f43461a = i;
        this.f43462b = Collections.unmodifiableList(list);
        this.f43472m = p73Var;
        this.i = new zm0();
        this.f43469j = new lb2(16);
        this.f43464d = new lb2(fy1.f38575a);
        this.f43465e = new lb2(5);
        this.f43466f = new lb2();
        byte[] bArr = new byte[16];
        this.f43467g = bArr;
        this.f43468h = new lb2(bArr);
        this.f43470k = new ArrayDeque();
        this.f43471l = new ArrayDeque();
        this.f43463c = new SparseArray();
        this.f43481v = -9223372036854775807L;
        this.f43480u = -9223372036854775807L;
        this.f43482w = -9223372036854775807L;
        this.C = qq0.f42370a;
        this.D = new p73[0];
        this.E = new p73[0];
    }

    @Override // yads.nq0
    public final void release() {
    }

    @Override // yads.nq0
    public final void a(qq0 qq0Var) {
        int i;
        this.C = qq0Var;
        int i10 = 0;
        this.f43473n = 0;
        this.f43476q = 0;
        p73[] p73VarArr = new p73[2];
        this.D = p73VarArr;
        p73 p73Var = this.f43472m;
        if (p73Var != null) {
            p73VarArr[0] = p73Var;
            i = 1;
        } else {
            i = 0;
        }
        int i11 = 100;
        if ((this.f43461a & 4) != 0) {
            p73VarArr[i] = qq0Var.a(100, 5);
            i11 = 101;
            i++;
        }
        p73[] p73VarArr2 = (p73[]) lb3.a(i, this.D);
        this.D = p73VarArr2;
        for (p73 p73Var2 : p73VarArr2) {
            p73Var2.a(H);
        }
        this.E = new p73[this.f43462b.size()];
        while (i10 < this.E.length) {
            p73 p73VarA = this.C.a(i11, 3);
            p73VarA.a((nx0) this.f43462b.get(i10));
            this.E[i10] = p73VarA;
            i10++;
            i11++;
        }
    }

    public tx0(List list) {
        this(0, list, null);
    }

    public final void a(vj vjVar) {
        re0 re0Var;
        re0 re0Var2;
        lk0 lk0VarA = a(vjVar.f44062c);
        vj vjVarB = vjVar.b(1836475768);
        vjVarB.getClass();
        SparseArray sparseArray = new SparseArray();
        int size = vjVarB.f44062c.size();
        long jN = -9223372036854775807L;
        for (int i = 0; i < size; i++) {
            wj wjVar = (wj) vjVarB.f44062c.get(i);
            int i10 = wjVar.f44730a;
            if (i10 == 1953654136) {
                lb2 lb2Var = wjVar.f44413b;
                lb2Var.e(12);
                Pair pairCreate = Pair.create(Integer.valueOf(lb2Var.b()), new re0(lb2Var.b() - 1, lb2Var.b(), lb2Var.b(), lb2Var.b()));
                sparseArray.put(((Integer) pairCreate.first).intValue(), (re0) pairCreate.second);
            } else if (i10 == 1835362404) {
                lb2 lb2Var2 = wjVar.f44413b;
                lb2Var2.e(8);
                jN = ((lb2Var2.b() >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) == 0 ? lb2Var2.n() : lb2Var2.q();
            }
        }
        ArrayList arrayListA = ek.a(vjVar, new az0(), jN, lk0VarA, (this.f43461a & 16) != 0, false, new yi.f0(11, this));
        int size2 = arrayListA.size();
        if (this.f43463c.size() == 0) {
            for (int i11 = 0; i11 < size2; i11++) {
                q73 q73Var = (q73) arrayListA.get(i11);
                h73 h73Var = q73Var.f42203a;
                p73 p73VarA = this.C.a(i11, h73Var.f39056b);
                int i12 = h73Var.f39055a;
                if (sparseArray.size() == 1) {
                    re0Var2 = (re0) sparseArray.valueAt(0);
                } else {
                    re0Var2 = (re0) sparseArray.get(i12);
                    re0Var2.getClass();
                }
                this.f43463c.put(h73Var.f39055a, new sx0(p73VarA, q73Var, re0Var2));
                this.f43481v = Math.max(this.f43481v, h73Var.f39059e);
            }
            this.C.a();
            return;
        }
        if (this.f43463c.size() != size2) {
            throw new IllegalStateException();
        }
        for (int i13 = 0; i13 < size2; i13++) {
            q73 q73Var2 = (q73) arrayListA.get(i13);
            h73 h73Var2 = q73Var2.f42203a;
            sx0 sx0Var = (sx0) this.f43463c.get(h73Var2.f39055a);
            int i14 = h73Var2.f39055a;
            if (sparseArray.size() == 1) {
                re0Var = (re0) sparseArray.valueAt(0);
            } else {
                re0Var = (re0) sparseArray.get(i14);
                re0Var.getClass();
            }
            sx0Var.a(q73Var2, re0Var);
        }
    }

    public static void a(lb2 lb2Var, int i, j73 j73Var) throws qb2 {
        lb2Var.e(i + 8);
        int iB = lb2Var.b();
        if ((iB & 1) == 0) {
            boolean z5 = (iB & 2) != 0;
            int iP = lb2Var.p();
            if (iP == 0) {
                Arrays.fill(j73Var.f39758l, 0, j73Var.f39752e, false);
                return;
            }
            if (iP == j73Var.f39752e) {
                Arrays.fill(j73Var.f39758l, 0, iP, z5);
                j73Var.f39760n.c(lb2Var.f40465c - lb2Var.f40464b);
                j73Var.f39757k = true;
                j73Var.f39761o = true;
                lb2 lb2Var2 = j73Var.f39760n;
                lb2Var.a(lb2Var2.f40463a, 0, lb2Var2.f40465c);
                j73Var.f39760n.e(0);
                j73Var.f39761o = false;
                return;
            }
            StringBuilder sbM = l7.o.m(iP, "Senc sample count ", " is different from fragment sample count");
            sbM.append(j73Var.f39752e);
            throw new qb2(sbM.toString(), null, true, 1);
        }
        throw qb2.b("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    /* JADX WARN: Removed duplicated region for block: B:176:0x037e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(long r50) throws yads.qb2 {
        /*
            Method dump skipped, instruction units count: 1529
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.tx0.a(long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x020a, code lost:
    
        if ("video/hevc".equals(r14) == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0211, code lost:
    
        if (((r17 & 126) >> (r8 == true ? 1 : 0)) != 39) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0213, code lost:
    
        r9 = r8 == true ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0215, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0216, code lost:
    
        r31.B = r9;
        r31.f43485z += 5;
        r31.f43484y += r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0223, code lost:
    
        r9 = 0;
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x022c, code lost:
    
        throw new yads.qb2("Invalid NAL length", null, r8, r8 == true ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x022f, code lost:
    
        if (r31.B == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0231, code lost:
    
        r31.f43466f.c(r14);
        r9 = r31.f43466f.f40463a;
        r14 = r31.A;
        r27 = r8 == true ? 1 : 0;
        ((yads.ld0) r32).a(r9, 0, r14, false);
        r6.a(r31.A, r31.f43466f);
        r4 = r31.A;
        r8 = r31.f43466f;
        r8 = yads.fy1.a(r8.f40465c, r8.f40463a);
        r31.f43466f.e("video/hevc".equals(r5.f39060f.f41375m) ? 1 : 0);
        r31.f43466f.d(r8);
        yads.rt.a(r10, r31.f43466f, r31.E);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0272, code lost:
    
        r27 = r8 == true ? 1 : 0;
        r4 = r6.a(r32, r14, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0279, code lost:
    
        r31.f43485z += r4;
        r31.A -= r4;
        r8 = r27;
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0287, code lost:
    
        r27 = r8 == true ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x028a, code lost:
    
        r27 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x028c, code lost:
    
        r3 = r31.f43485z;
        r4 = r31.f43484y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0290, code lost:
    
        if (r3 >= r4) goto L433;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0292, code lost:
    
        r31.f43485z += r6.a(r32, r4 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02a0, code lost:
    
        if (r2.f43121l != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02a2, code lost:
    
        r1 = r2.f43114d.f42209g[r2.f43116f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02b3, code lost:
    
        if (r2.f43112b.f39756j[r2.f43116f] == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02b5, code lost:
    
        r1 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02b8, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02bd, code lost:
    
        if (r2.a() == null) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02bf, code lost:
    
        r1 = (r1 == true ? 1 : 0) | 1073741824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02c2, code lost:
    
        r22 = r1;
        r1 = r2.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02c8, code lost:
    
        if (r1 == null) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02ca, code lost:
    
        r25 = r1.f39458c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02cf, code lost:
    
        r25 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02d1, code lost:
    
        r20 = r10;
        r6.a(r20, r22 == true ? 1 : 0, r31.f43484y, 0, r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02e4, code lost:
    
        if (r31.f43471l.isEmpty() != false) goto L429;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02e6, code lost:
    
        r1 = (yads.rx0) r31.f43471l.removeFirst();
        r31.f43479t -= r1.f42761c;
        r3 = r1.f42759a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02f9, code lost:
    
        if (r1.f42760b == false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02fb, code lost:
    
        r3 = r3 + r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02fd, code lost:
    
        r9 = r3;
        r3 = r31.D;
        r4 = r3.length;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0302, code lost:
    
        if (r5 >= r4) goto L432;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0304, code lost:
    
        r3[r5].a(r9, 1, r1.f42761c, r31.f43479t, null);
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0312, code lost:
    
        r2.f43116f++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x031a, code lost:
    
        if (r2.f43121l != false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x031c, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x031e, code lost:
    
        r1 = r2.f43117g + 1;
        r2.f43117g = r1;
        r3 = r2.f43112b.f39754g;
        r4 = r2.f43118h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x032c, code lost:
    
        if (r1 != r3[r4]) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x032e, code lost:
    
        r2.f43118h = r4 + 1;
        r8 = 0;
        r2.f43117g = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0335, code lost:
    
        r31.f43483x = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0339, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x033b, code lost:
    
        r31.f43473n = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x033d, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00be, code lost:
    
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c2, code lost:
    
        if (r31.f43473n != 3) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c6, code lost:
    
        if (r2.f43121l != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c8, code lost:
    
        r3 = r2.f43114d.f42206d[r2.f43116f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d1, code lost:
    
        r3 = r2.f43112b.f39755h[r2.f43116f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d9, code lost:
    
        r31.f43484y = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00df, code lost:
    
        if (r2.f43116f >= r2.i) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e1, code lost:
    
        ((yads.ld0) r32).a(r3);
        r1 = r2.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ea, code lost:
    
        if (r1 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ed, code lost:
    
        r3 = r2.f43112b.f39760n;
        r1 = r1.f39459d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f3, code lost:
    
        if (r1 == 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f5, code lost:
    
        r3.e(r3.f40464b + r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00fb, code lost:
    
        r1 = r2.f43112b;
        r5 = r2.f43116f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0101, code lost:
    
        if (r1.f39757k == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0107, code lost:
    
        if (r1.f39758l[r5] == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0109, code lost:
    
        r3.e(r3.f40464b + (r3.r() * 6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0114, code lost:
    
        r2.f43116f++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x011b, code lost:
    
        if (r2.f43121l != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x011e, code lost:
    
        r1 = r2.f43117g + 1;
        r2.f43117g = r1;
        r3 = r2.f43112b.f39754g;
        r4 = r2.f43118h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x012b, code lost:
    
        if (r1 != r3[r4]) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x012d, code lost:
    
        r2.f43118h = r4 + 1;
        r2.f43117g = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0132, code lost:
    
        r31.f43483x = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0134, code lost:
    
        r31.f43473n = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0140, code lost:
    
        if (r2.f43114d.f42203a.f39061g != 1) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0142, code lost:
    
        r31.f43484y = r3 - 8;
        ((yads.ld0) r32).a(r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x015c, code lost:
    
        if ("audio/ac4".equals(r2.f43114d.f42203a.f39060f.f41375m) == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x015e, code lost:
    
        r31.f43485z = r2.a(r31.f43484y, 7);
        yads.l0.a(r31.f43484y, r31.f43468h);
        r2.f43111a.a(7, r31.f43468h);
        r31.f43485z += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x017b, code lost:
    
        r31.f43485z = r2.a(r31.f43484y, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0183, code lost:
    
        r31.f43484y += r31.f43485z;
        r31.f43473n = 4;
        r31.A = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x018f, code lost:
    
        r3 = r2.f43114d;
        r5 = r3.f42203a;
        r6 = r2.f43111a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0197, code lost:
    
        if (r2.f43121l != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0199, code lost:
    
        r10 = r3.f42208f[r2.f43116f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01a0, code lost:
    
        r10 = r2.f43112b.i[r2.f43116f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01a8, code lost:
    
        r3 = r5.f39063j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01aa, code lost:
    
        if (r3 == 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01ac, code lost:
    
        r12 = r31.f43465e.f40463a;
        r12[0] = 0;
        r12[1] = 0;
        r12[r33] = 0;
        r13 = r3 + 1;
        r3 = 4 - r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01c0, code lost:
    
        if (r31.f43485z >= r31.f43484y) goto L425;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01c2, code lost:
    
        r14 = r31.A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01c6, code lost:
    
        if (r14 != 0) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01c8, code lost:
    
        ((yads.ld0) r32).a(r12, r3, r13, r9);
        r31.f43465e.e(r9);
        r14 = r31.f43465e.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01d9, code lost:
    
        if (r14 < r8) goto L426;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01db, code lost:
    
        r31.A = r14 - 1;
        r31.f43464d.e(r9);
        r6.a(4, r31.f43464d);
        r6.a(r8 == true ? 1 : 0, r31.f43465e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01f2, code lost:
    
        if (r31.E.length <= 0) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01f4, code lost:
    
        r14 = r5.f39060f.f41375m;
        r17 = r12[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0200, code lost:
    
        if ("video/avc".equals(r14) == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0204, code lost:
    
        if ((r17 & 31) == r4) goto L103;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v50 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v9, types: [boolean, int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // yads.nq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(yads.oq0 r32, yads.ig2 r33) throws yads.qb2, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 2015
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.tx0.a(yads.oq0, yads.ig2):int");
    }

    @Override // yads.nq0
    public final boolean a(oq0 oq0Var) {
        return v13.a(oq0Var, true, false);
    }
}
