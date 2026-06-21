package y3;

import ad.b1;
import ad.h0;
import ad.j0;
import android.net.Uri;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.xt1;
import com.google.android.gms.internal.measurement.h5;
import fh.nd;
import i4.a0;
import i4.i0;
import i4.j1;
import i4.z;
import io.sentry.protocol.SentryThread;
import j3.b0;
import j3.c0;
import j3.d0;
import j3.p0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import k6.t0;
import p3.e0;
import s3.c1;
import t.v0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements a0, z3.t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f36356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z3.c f36357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m4.d f36358d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e0 f36359e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final x3.h f36360f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i0 f36361g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final le.a f36362h;
    public final i0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final bb.e f36363j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final IdentityHashMap f36364k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t0 f36365l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final nd f36366m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f36367n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f36368o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t3.j f36369p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ni.i f36370q = new ni.i(26, this);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public z f36371r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f36372s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public j1 f36373t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public q[] f36374u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public q[] f36375v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f36376w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public i4.n f36377x;

    public k(c cVar, z3.c cVar2, m4.d dVar, e0 e0Var, x3.h hVar, i0 i0Var, le.a aVar, i0 i0Var2, bb.e eVar, nd ndVar, boolean z5, int i, t3.j jVar) {
        this.f36356b = cVar;
        this.f36357c = cVar2;
        this.f36358d = dVar;
        this.f36359e = e0Var;
        this.f36360f = hVar;
        this.f36361g = i0Var;
        this.f36362h = aVar;
        this.i = i0Var2;
        this.f36363j = eVar;
        this.f36366m = ndVar;
        this.f36367n = z5;
        this.f36368o = i;
        this.f36369p = jVar;
        ndVar.getClass();
        h0 h0Var = j0.f818c;
        b1 b1Var = b1.f768f;
        this.f36377x = new i4.n(b1Var, b1Var);
        this.f36364k = new IdentityHashMap();
        this.f36365l = new t0(23);
        this.f36374u = new q[0];
        this.f36375v = new q[0];
    }

    public static j3.o e(j3.o oVar, j3.o oVar2, boolean z5) {
        b0 b0Var;
        int i;
        String str;
        String str2;
        j0 j0Var;
        int i10;
        int i11;
        String str3;
        h0 h0Var = j0.f818c;
        b1 b1Var = b1.f768f;
        if (oVar2 != null) {
            str2 = oVar2.f26332k;
            b0Var = oVar2.f26333l;
            i10 = oVar2.F;
            i = oVar2.f26327e;
            i11 = oVar2.f26328f;
            str = oVar2.f26326d;
            str3 = oVar2.f26324b;
            j0Var = oVar2.f26325c;
        } else {
            String strV = m3.z.v(1, oVar.f26332k);
            b0Var = oVar.f26333l;
            if (z5) {
                i10 = oVar.F;
                i = oVar.f26327e;
                i11 = oVar.f26328f;
                str = oVar.f26326d;
                str3 = oVar.f26324b;
                str2 = strV;
                j0Var = oVar.f26325c;
            } else {
                i = 0;
                str = null;
                str2 = strV;
                j0Var = b1Var;
                i10 = -1;
                i11 = 0;
                str3 = null;
            }
        }
        String strD = c0.d(str2);
        int i12 = z5 ? oVar.f26330h : -1;
        int i13 = z5 ? oVar.i : -1;
        j3.n nVar = new j3.n();
        nVar.f26281a = oVar.f26323a;
        nVar.f26282b = str3;
        nVar.f26283c = j0.r(j0Var);
        nVar.f26291l = c0.n(oVar.f26334m);
        nVar.f26292m = c0.n(strD);
        nVar.f26289j = str2;
        nVar.f26290k = b0Var;
        nVar.f26288h = i12;
        nVar.i = i13;
        nVar.E = i10;
        nVar.f26285e = i;
        nVar.f26286f = i11;
        nVar.f26284d = str;
        return new j3.o(nVar);
    }

    @Override // z3.t
    public final void a() {
        for (q qVar : this.f36374u) {
            m4.n nVar = qVar.f36409k;
            i iVar = qVar.f36404e;
            ArrayList arrayList = qVar.f36413o;
            if (!arrayList.isEmpty()) {
                j jVar = (j) ad.q.j(arrayList);
                int iB = iVar.b(jVar);
                int i = jVar.f36345p;
                if (iB == 1) {
                    if (!jVar.g()) {
                        h5.r(i != -1);
                        z3.l lVarA = iVar.f36329g.a(false, iVar.f36327e[iVar.f36330h.a(jVar.f26472e)]);
                        lVarA.getClass();
                        j0 j0Var = lVarA.f46116r;
                        int i10 = (int) (jVar.f26516k - lVarA.f46109k);
                        jVar.L = i10 < 0 ? 0L : ((z3.g) (i10 < j0Var.size() ? ((z3.i) j0Var.get(i10)).f46087n : lVarA.f46117s).get(i)).f46090d;
                    }
                } else if (iB == 0) {
                    qVar.f36417s.post(new v0(19, qVar, jVar));
                } else if (iB == 2 && !qVar.U && nVar.d()) {
                    nVar.b();
                }
            }
        }
        this.f36371r.d(this);
    }

    @Override // i4.a0
    public final long b(long j10, c1 c1Var) {
        q[] qVarArr = this.f36375v;
        int length = qVarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            q qVar = qVarArr[i];
            if (qVar.B == 2) {
                i iVar = qVar.f36404e;
                z3.c cVar = iVar.f36329g;
                int iC = iVar.f36339r.c();
                Uri[] uriArr = iVar.f36327e;
                z3.l lVarA = (iC >= uriArr.length || iC == -1) ? null : cVar.a(true, uriArr[iVar.f36339r.j()]);
                if (lVarA != null) {
                    j0 j0Var = lVarA.f46116r;
                    if (!j0Var.isEmpty()) {
                        long j11 = lVarA.f46107h - cVar.f46038o;
                        long j12 = j10 - j11;
                        int iD = m3.z.d(j0Var, Long.valueOf(j12), true);
                        long j13 = ((z3.i) j0Var.get(iD)).f46092f;
                        return c1Var.a(j12, j13, (!lVarA.f46141c || iD == j0Var.size() - 1) ? j13 : ((z3.i) j0Var.get(iD + 1)).f46092f) + j11;
                    }
                }
            } else {
                i++;
            }
        }
        return j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0052 A[SYNTHETIC] */
    @Override // z3.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(android.net.Uri r17, d8.e0 r18, boolean r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            y3.q[] r2 = r0.f36374u
            int r3 = r2.length
            r6 = 0
            r7 = 1
        L9:
            if (r6 >= r3) goto L87
            r8 = r2[r6]
            y3.i r9 = r8.f36404e
            android.net.Uri[] r10 = r9.f36327e
            boolean r11 = m3.z.m(r10, r1)
            if (r11 != 0) goto L1c
            r8 = r18
        L19:
            r4 = 1
            goto L83
        L1c:
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r19 != 0) goto L3e
            le.a r8 = r8.f36408j
            l4.r r13 = r9.f36339r
            com.google.android.gms.internal.ads.nl0 r13 = hl.l.i(r13)
            r8.getClass()
            r8 = r18
            com.google.android.gms.internal.ads.o r13 = le.a.d(r13, r8)
            if (r13 == 0) goto L40
            int r14 = r13.f8527a
            r15 = 2
            if (r14 != r15) goto L40
            long r13 = r13.f8528b
            goto L41
        L3e:
            r8 = r18
        L40:
            r13 = r11
        L41:
            r15 = 0
        L42:
            int r4 = r10.length
            r5 = -1
            if (r15 >= r4) goto L52
            r4 = r10[r15]
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L4f
            goto L53
        L4f:
            int r15 = r15 + 1
            goto L42
        L52:
            r15 = r5
        L53:
            if (r15 != r5) goto L56
            goto L81
        L56:
            l4.r r4 = r9.f36339r
            int r4 = r4.t(r15)
            if (r4 != r5) goto L5f
            goto L81
        L5f:
            r9.f36336o = r1
            int r5 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r5 == 0) goto L82
            l4.r r5 = r9.f36339r
            boolean r4 = r5.n(r4, r13)
            if (r4 == 0) goto L82
            z3.c r4 = r9.f36329g
            java.util.HashMap r4 = r4.f46029e
            java.lang.Object r4 = r4.get(r1)
            z3.b r4 = (z3.b) r4
            if (r4 == 0) goto L7e
            boolean r4 = z3.b.a(r4, r13)
            goto L7f
        L7e:
            r4 = 0
        L7f:
            if (r4 == 0) goto L82
        L81:
            goto L19
        L82:
            r4 = 0
        L83:
            r7 = r7 & r4
            int r6 = r6 + 1
            goto L9
        L87:
            i4.z r1 = r0.f36371r
            r1.d(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.k.c(android.net.Uri, d8.e0, boolean):boolean");
    }

    public final q d(String str, int i, Uri[] uriArr, j3.o[] oVarArr, j3.o oVar, List list, Map map, long j10) {
        return new q(str, i, this.f36370q, new i(this.f36356b, this.f36357c, uriArr, oVarArr, this.f36358d, this.f36359e, this.f36365l, list, this.f36369p), map, this.f36363j, j10, oVar, this.f36360f, this.f36361g, this.f36362h, this.i, this.f36368o, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0199  */
    /* JADX WARN: Type inference failed for: r30v0 */
    /* JADX WARN: Type inference failed for: r30v2 */
    /* JADX WARN: Type inference failed for: r30v3, types: [int] */
    /* JADX WARN: Type inference failed for: r30v5 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v5, types: [int] */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v40 */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // i4.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long f(l4.r[] r40, boolean[] r41, i4.b1[] r42, boolean[] r43, long r44) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 856
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.k.f(l4.r[], boolean[], i4.b1[], boolean[], long):long");
    }

    @Override // i4.a0
    public final void g(long j10) throws Throwable {
        for (q qVar : this.f36375v) {
            if (qVar.D && !qVar.u()) {
                int length = qVar.f36421w.length;
                for (int i = 0; i < length; i++) {
                    qVar.f36421w[i].j(j10, qVar.O[i]);
                }
            }
        }
    }

    @Override // i4.d1
    public final long getBufferedPositionUs() {
        return this.f36377x.getBufferedPositionUs();
    }

    @Override // i4.d1
    public final long getNextLoadPositionUs() {
        return this.f36377x.getNextLoadPositionUs();
    }

    @Override // i4.a0
    public final j1 getTrackGroups() {
        j1 j1Var = this.f36373t;
        j1Var.getClass();
        return j1Var;
    }

    @Override // i4.d1
    public final boolean isLoading() {
        return this.f36377x.isLoading();
    }

    @Override // i4.a0
    public final void k(z zVar, long j10) {
        c cVar;
        boolean z5;
        List list;
        List list2;
        HashSet hashSet;
        int i;
        HashSet hashSet2;
        int i10;
        boolean z10;
        c cVar2;
        int i11;
        boolean z11;
        Uri[] uriArr;
        this.f36371r = zVar;
        z3.c cVar3 = this.f36357c;
        cVar3.getClass();
        cVar3.f46030f.add(this);
        z3.o oVar = cVar3.f46034k;
        oVar.getClass();
        List list3 = oVar.f46134f;
        List list4 = oVar.f46133e;
        Map map = Collections.EMPTY_MAP;
        boolean zIsEmpty = list4.isEmpty();
        List list5 = oVar.f46135g;
        int i12 = 0;
        this.f36372s = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        c cVar4 = this.f36356b;
        boolean z12 = this.f36367n;
        if (zIsEmpty) {
            cVar = cVar4;
            z5 = z12;
            list = list3;
            list2 = list5;
        } else {
            j3.o oVar2 = oVar.f46136h;
            int size = list4.size();
            int[] iArr = new int[size];
            int i13 = 0;
            int i14 = 0;
            while (true) {
                list2 = list5;
                if (i13 >= list4.size()) {
                    break;
                }
                j3.o oVar3 = ((z3.n) list4.get(i13)).f46126b;
                int i15 = oVar3.f26343v;
                String str = oVar3.f26332k;
                if (i15 > 0 || m3.z.v(2, str) != null) {
                    iArr[i13] = 2;
                    i14++;
                } else if (m3.z.v(1, str) != null) {
                    iArr[i13] = 1;
                    i12++;
                } else {
                    iArr[i13] = -1;
                }
                i13++;
                list5 = list2;
            }
            if (i14 > 0) {
                z11 = false;
                cVar2 = cVar4;
                i11 = i14;
                z10 = true;
            } else if (i12 < size) {
                z10 = false;
                cVar2 = cVar4;
                i11 = size - i12;
                z11 = true;
            } else {
                z10 = false;
                cVar2 = cVar4;
                i11 = size;
                z11 = false;
            }
            Uri[] uriArr2 = new Uri[i11];
            j3.o[] oVarArr = new j3.o[i11];
            int[] iArr2 = new int[i11];
            int i16 = 0;
            int i17 = 0;
            while (i16 < list4.size()) {
                if (z10) {
                    uriArr = uriArr2;
                    if (iArr[i16] == 2) {
                    }
                    i16++;
                    uriArr2 = uriArr;
                } else {
                    uriArr = uriArr2;
                }
                if (!z11 || iArr[i16] != 1) {
                    z3.n nVar = (z3.n) list4.get(i16);
                    uriArr[i17] = nVar.f46125a;
                    oVarArr[i17] = nVar.f46126b;
                    iArr2[i17] = i16;
                    i17++;
                }
                i16++;
                uriArr2 = uriArr;
            }
            Uri[] uriArr3 = uriArr2;
            String str2 = oVarArr[0].f26332k;
            int iU = m3.z.u(2, str2);
            int iU2 = m3.z.u(1, str2);
            boolean z13 = (iU2 == 1 || (iU2 == 0 && list3.isEmpty())) && iU <= 1 && iU2 + iU > 0;
            c cVar5 = cVar2;
            list = list3;
            z5 = z12;
            q qVarD = d(SentryThread.JsonKeys.MAIN, (z10 || iU2 <= 0) ? 0 : 1, uriArr3, oVarArr, oVar.f46136h, oVar.i, map, j10);
            arrayList.add(qVarD);
            arrayList2.add(iArr2);
            if (z5 && z13) {
                ArrayList arrayList3 = new ArrayList();
                if (iU > 0) {
                    j3.o[] oVarArr2 = new j3.o[i11];
                    int i18 = 0;
                    while (i18 < i11) {
                        j3.o oVar4 = oVarArr[i18];
                        String strV = m3.z.v(2, oVar4.f26332k);
                        String strD = c0.d(strV);
                        j3.n nVar2 = new j3.n();
                        nVar2.f26281a = oVar4.f26323a;
                        nVar2.f26282b = oVar4.f26324b;
                        nVar2.f26283c = j0.r(oVar4.f26325c);
                        nVar2.f26291l = c0.n(oVar4.f26334m);
                        nVar2.f26292m = c0.n(strD);
                        nVar2.f26289j = strV;
                        nVar2.f26290k = oVar4.f26333l;
                        nVar2.f26288h = oVar4.f26330h;
                        nVar2.i = oVar4.i;
                        nVar2.f26299t = oVar4.f26342u;
                        nVar2.f26300u = oVar4.f26343v;
                        nVar2.f26303x = oVar4.f26346y;
                        nVar2.f26285e = oVar4.f26327e;
                        nVar2.f26286f = oVar4.f26328f;
                        oVarArr2[i18] = new j3.o(nVar2);
                        i18++;
                        oVarArr = oVarArr;
                    }
                    j3.o[] oVarArr3 = oVarArr;
                    arrayList3.add(new p0(SentryThread.JsonKeys.MAIN, oVarArr2));
                    if (iU2 > 0 && (oVar2 != null || list.isEmpty())) {
                        arrayList3.add(new p0("main:audio", e(oVarArr3[0], oVar2, false)));
                    }
                    List list6 = oVar.i;
                    if (list6 != null) {
                        for (int i19 = 0; i19 < list6.size(); i19++) {
                            arrayList3.add(new p0(l7.o.i(i19, "main:cc:"), cVar5.b((j3.o) list6.get(i19))));
                        }
                    }
                    cVar = cVar5;
                } else {
                    cVar = cVar5;
                    j3.o[] oVarArr4 = new j3.o[i11];
                    for (int i20 = 0; i20 < i11; i20++) {
                        oVarArr4[i20] = e(oVarArr[i20], oVar2, true);
                    }
                    arrayList3.add(new p0(SentryThread.JsonKeys.MAIN, oVarArr4));
                }
                j3.n nVar3 = new j3.n();
                nVar3.f26281a = "ID3";
                nVar3.f26292m = c0.n("application/id3");
                p0 p0Var = new p0("main:id3", new j3.o(nVar3));
                arrayList3.add(p0Var);
                qVarD.x((p0[]) arrayList3.toArray(new p0[0]), arrayList3.indexOf(p0Var));
            } else {
                cVar = cVar5;
            }
        }
        ArrayList arrayList4 = new ArrayList(list.size());
        ArrayList arrayList5 = new ArrayList(list.size());
        ArrayList arrayList6 = new ArrayList(list.size());
        HashSet hashSet3 = new HashSet();
        int i21 = 0;
        while (i21 < list.size()) {
            List list7 = list;
            String str3 = ((z3.m) list7.get(i21)).f46124c;
            if (hashSet3.add(str3)) {
                arrayList4.clear();
                arrayList5.clear();
                arrayList6.clear();
                boolean z14 = true;
                for (int i22 = 0; i22 < list7.size(); i22++) {
                    if (str3.equals(((z3.m) list7.get(i22)).f46124c)) {
                        z3.m mVar = (z3.m) list7.get(i22);
                        arrayList6.add(Integer.valueOf(i22));
                        Uri uri = mVar.f46122a;
                        j3.o oVar5 = mVar.f46123b;
                        arrayList4.add(uri);
                        arrayList5.add(oVar5);
                        z14 &= m3.z.u(1, oVar5.f26332k) == 1;
                    }
                }
                String strConcat = "audio:".concat(str3);
                String str4 = m3.z.f28608a;
                list = list7;
                hashSet2 = hashSet3;
                i10 = i21;
                q qVarD2 = d(strConcat, 1, (Uri[]) arrayList4.toArray(new Uri[0]), (j3.o[]) arrayList5.toArray(new j3.o[0]), null, Collections.EMPTY_LIST, map, j10);
                arrayList2.add(k3.f.E(arrayList6));
                arrayList.add(qVarD2);
                if (z5 && z14) {
                    qVarD2.x(new p0[]{new p0(strConcat, (j3.o[]) arrayList5.toArray(new j3.o[0]))}, new int[0]);
                }
            } else {
                hashSet2 = hashSet3;
                i10 = i21;
                list = list7;
            }
            i21 = i10 + 1;
            hashSet3 = hashSet2;
        }
        this.f36376w = arrayList.size();
        ArrayList arrayList7 = new ArrayList(list2.size());
        ArrayList arrayList8 = new ArrayList(list2.size());
        ArrayList arrayList9 = new ArrayList(list2.size());
        HashSet hashSet4 = new HashSet();
        int i23 = 0;
        while (i23 < list2.size()) {
            List list8 = list2;
            String str5 = ((z3.m) list8.get(i23)).f46124c;
            if (hashSet4.add(str5)) {
                arrayList7.clear();
                arrayList8.clear();
                arrayList9.clear();
                for (int i24 = 0; i24 < list8.size(); i24++) {
                    if (str5.equals(((z3.m) list8.get(i24)).f46124c)) {
                        z3.m mVar2 = (z3.m) list8.get(i24);
                        arrayList9.add(Integer.valueOf(i24));
                        arrayList7.add(mVar2.f46122a);
                        arrayList8.add(mVar2.f46123b);
                    }
                }
                String strConcat2 = "subtitle:".concat(str5);
                j3.o[] oVarArr5 = (j3.o[]) arrayList8.toArray(new j3.o[0]);
                String str6 = m3.z.f28608a;
                Uri[] uriArr4 = (Uri[]) arrayList7.toArray(new Uri[0]);
                h0 h0Var = j0.f818c;
                list2 = list8;
                hashSet = hashSet4;
                i = i23;
                q qVarD3 = d(strConcat2, 3, uriArr4, oVarArr5, null, b1.f768f, map, j10);
                arrayList2.add(k3.f.E(arrayList9));
                arrayList.add(qVarD3);
                int length = oVarArr5.length;
                j3.o[] oVarArr6 = new j3.o[length];
                for (int i25 = 0; i25 < length; i25++) {
                    oVarArr6[i25] = cVar.b(oVarArr5[i25]);
                }
                qVarD3.x(new p0[]{new p0(strConcat2, oVarArr6)}, new int[0]);
            } else {
                hashSet = hashSet4;
                i = i23;
                list2 = list8;
            }
            i23 = i + 1;
            hashSet4 = hashSet;
        }
        this.f36374u = (q[]) arrayList.toArray(new q[0]);
        this.f36372s = this.f36374u.length;
        for (int i26 = 0; i26 < this.f36376w; i26++) {
            this.f36374u[i26].f36404e.f36333l = true;
        }
        for (q qVar : this.f36374u) {
            if (!qVar.E) {
                xt1 xt1Var = new xt1();
                xt1Var.f12328a = qVar.Q;
                qVar.l(new s3.h0(xt1Var));
            }
        }
        this.f36375v = this.f36374u;
    }

    @Override // i4.d1
    public final boolean l(s3.h0 h0Var) {
        if (this.f36373t != null) {
            return this.f36377x.l(h0Var);
        }
        for (q qVar : this.f36374u) {
            if (!qVar.E) {
                xt1 xt1Var = new xt1();
                xt1Var.f12328a = qVar.Q;
                qVar.l(new s3.h0(xt1Var));
            }
        }
        return false;
    }

    @Override // i4.a0
    public final void maybeThrowPrepareError() throws IOException {
        for (q qVar : this.f36374u) {
            qVar.w();
            if (qVar.U && !qVar.E) {
                throw d0.a(null, "Loading finished before preparation is complete.");
            }
        }
    }

    @Override // i4.a0
    public final long readDiscontinuity() {
        return -9223372036854775807L;
    }

    @Override // i4.d1
    public final void reevaluateBuffer(long j10) {
        this.f36377x.reevaluateBuffer(j10);
    }

    @Override // i4.a0
    public final long seekToUs(long j10) throws Throwable {
        q[] qVarArr = this.f36375v;
        if (qVarArr.length > 0) {
            boolean z5 = qVarArr[0].z(j10, false);
            int i = 1;
            while (true) {
                q[] qVarArr2 = this.f36375v;
                if (i >= qVarArr2.length) {
                    break;
                }
                qVarArr2[i].z(j10, z5);
                i++;
            }
            if (z5) {
                ((SparseArray) this.f36365l.f27180c).clear();
            }
        }
        return j10;
    }
}
