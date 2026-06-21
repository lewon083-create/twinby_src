package v3;

import ad.b1;
import ad.h0;
import ad.j0;
import ad.m0;
import ad.q;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.measurement.h5;
import fh.nd;
import i4.a0;
import i4.a1;
import i4.c1;
import i4.d1;
import i4.i0;
import i4.j1;
import i4.n;
import i4.z;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j3.c0;
import j3.p0;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l4.r;
import m4.o;
import p3.e0;
import w3.m;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements a0, c1, j4.h {
    public static final Pattern A = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern B = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f34649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m0 f34650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e0 f34651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x3.h f34652e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final le.a f34653f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s7.g f34654g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f34655h;
    public final o i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final bb.e f34656j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final j1 f34657k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a[] f34658l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final nd f34659m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final l f34660n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i0 f34662p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i0 f34663q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public z f34664r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public n f34667u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public w3.c f34668v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f34669w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public List f34670x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f34672z;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f34671y = true;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public j4.i[] f34665s = new j4.i[0];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public i[] f34666t = new i[0];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final IdentityHashMap f34661o = new IdentityHashMap();

    public b(int i, w3.c cVar, s7.g gVar, int i10, m0 m0Var, e0 e0Var, x3.h hVar, i0 i0Var, le.a aVar, i0 i0Var2, long j10, o oVar, bb.e eVar, nd ndVar, m7.a aVar2, t3.j jVar) {
        int i11;
        int i12;
        int[][] iArr;
        boolean[] zArr;
        j3.o[][] oVarArr;
        j3.o[] oVarArrI;
        w3.f fVarC;
        Integer num;
        this.f34649b = i;
        this.f34668v = cVar;
        this.f34654g = gVar;
        this.f34669w = i10;
        this.f34650c = m0Var;
        this.f34651d = e0Var;
        this.f34652e = hVar;
        this.f34663q = i0Var;
        this.f34653f = aVar;
        this.f34662p = i0Var2;
        this.f34655h = j10;
        this.i = oVar;
        this.f34656j = eVar;
        this.f34659m = ndVar;
        boolean z5 = true;
        this.f34660n = new l(cVar, aVar2, eVar);
        int i13 = 0;
        ndVar.getClass();
        h0 h0Var = j0.f818c;
        b1 b1Var = b1.f768f;
        this.f34667u = new n(b1Var, b1Var);
        w3.h hVarB = cVar.b(i10);
        List list = hVarB.f35063d;
        this.f34670x = list;
        List list2 = hVarB.f35062c;
        int size = list2.size();
        HashMap map = new HashMap(q.a(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i14 = 0; i14 < size; i14++) {
            map.put(Long.valueOf(((w3.a) list2.get(i14)).f35019a), Integer.valueOf(i14));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i14));
            arrayList.add(arrayList2);
            sparseArray.put(i14, arrayList2);
        }
        int i15 = 0;
        while (i15 < size) {
            w3.a aVar3 = (w3.a) list2.get(i15);
            List list3 = aVar3.f35023e;
            List list4 = aVar3.f35024f;
            boolean z10 = z5;
            w3.f fVarC2 = c("http://dashif.org/guidelines/trickmode", list3);
            fVarC2 = fVarC2 == null ? c("http://dashif.org/guidelines/trickmode", list4) : fVarC2;
            int iIntValue = (fVarC2 == null || (num = (Integer) map.get(Long.valueOf(Long.parseLong(fVarC2.f35054b)))) == null || !a(aVar3, (w3.a) list2.get(num.intValue()))) ? i15 : num.intValue();
            if (iIntValue == i15 && (fVarC = c("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                String str = fVarC.f35054b;
                String str2 = m3.z.f28608a;
                String[] strArrSplit = str.split(StringUtils.COMMA, -1);
                int length = strArrSplit.length;
                for (int i16 = i13; i16 < length; i16++) {
                    Integer num2 = (Integer) map.get(Long.valueOf(Long.parseLong(strArrSplit[i16])));
                    if (num2 != null && a(aVar3, (w3.a) list2.get(num2.intValue()))) {
                        iIntValue = Math.min(iIntValue, num2.intValue());
                    }
                }
            }
            if (iIntValue != i15) {
                List list5 = (List) sparseArray.get(i15);
                List list6 = (List) sparseArray.get(iIntValue);
                list6.addAll(list5);
                sparseArray.put(i15, list6);
                arrayList.remove(list5);
            }
            i15++;
            z5 = z10;
            i13 = 0;
        }
        boolean z11 = z5;
        int size2 = arrayList.size();
        int[][] iArr2 = new int[size2][];
        for (int i17 = 0; i17 < size2; i17++) {
            int[] iArrE = k3.f.E((Collection) arrayList.get(i17));
            iArr2[i17] = iArrE;
            Arrays.sort(iArrE);
        }
        boolean[] zArr2 = new boolean[size2];
        j3.o[][] oVarArr2 = new j3.o[size2][];
        int i18 = 0;
        int i19 = 0;
        while (i18 < size2) {
            int[] iArr3 = iArr2[i18];
            int length2 = iArr3.length;
            int i20 = 0;
            while (true) {
                if (i20 >= length2) {
                    iArr = iArr2;
                    break;
                }
                List list7 = ((w3.a) list2.get(iArr3[i20])).f35021c;
                iArr = iArr2;
                for (int i21 = 0; i21 < list7.size(); i21++) {
                    if (!((m) list7.get(i21)).f35079e.isEmpty()) {
                        zArr2[i18] = z11;
                        i19++;
                        break;
                    }
                }
                i20++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr[i18];
            int length3 = iArr4.length;
            int i22 = 0;
            while (true) {
                if (i22 >= length3) {
                    zArr = zArr2;
                    oVarArr = oVarArr2;
                    oVarArrI = new j3.o[0];
                    break;
                }
                int i23 = iArr4[i22];
                w3.a aVar4 = (w3.a) list2.get(i23);
                List list8 = ((w3.a) list2.get(i23)).f35022d;
                int[] iArr5 = iArr4;
                int i24 = 0;
                while (i24 < list8.size()) {
                    w3.f fVar = (w3.f) list8.get(i24);
                    zArr = zArr2;
                    oVarArr = oVarArr2;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(fVar.f35053a)) {
                        j3.n nVar = new j3.n();
                        nVar.f26292m = c0.n("application/cea-608");
                        nVar.f26281a = pe.a.h(new StringBuilder(), aVar4.f35019a, ":cea608");
                        oVarArrI = i(fVar, A, new j3.o(nVar));
                        break;
                    }
                    if ("urn:scte:dash:cc:cea-708:2015".equals(fVar.f35053a)) {
                        j3.n nVar2 = new j3.n();
                        nVar2.f26292m = c0.n("application/cea-708");
                        nVar2.f26281a = pe.a.h(new StringBuilder(), aVar4.f35019a, ":cea708");
                        oVarArrI = i(fVar, B, new j3.o(nVar2));
                        break;
                    }
                    i24++;
                    oVarArr2 = oVarArr;
                    zArr2 = zArr;
                }
                i22++;
                iArr4 = iArr5;
            }
            oVarArr[i18] = oVarArrI;
            if (oVarArrI.length != 0) {
                i19++;
            }
            i18++;
            oVarArr2 = oVarArr;
            iArr2 = iArr;
            zArr2 = zArr;
        }
        int[][] iArr6 = iArr2;
        boolean[] zArr3 = zArr2;
        j3.o[][] oVarArr3 = oVarArr2;
        int size3 = list.size() + i19 + size2;
        p0[] p0VarArr = new p0[size3];
        a[] aVarArr = new a[size3];
        int i25 = 0;
        int i26 = 0;
        while (i25 < size2) {
            int[] iArr7 = iArr6[i25];
            ArrayList arrayList3 = new ArrayList();
            for (int i27 : iArr7) {
                arrayList3.addAll(((w3.a) list2.get(i27)).f35021c);
            }
            int size4 = arrayList3.size();
            j3.o[] oVarArr4 = new j3.o[size4];
            int i28 = 0;
            while (i28 < size4) {
                int i29 = size2;
                j3.o oVar2 = ((m) arrayList3.get(i28)).f35076b;
                int i30 = i26;
                j3.n nVarA = oVar2.a();
                nVarA.N = hVar.a(oVar2);
                oVarArr4[i28] = new j3.o(nVarA);
                i28++;
                size2 = i29;
                i26 = i30;
            }
            int i31 = size2;
            int i32 = i26;
            w3.a aVar5 = (w3.a) list2.get(iArr7[0]);
            long j11 = aVar5.f35019a;
            String string = j11 != -1 ? Long.toString(j11) : l7.o.i(i25, "unset:");
            int i33 = i32 + 1;
            if (zArr3[i25]) {
                i11 = i32 + 2;
            } else {
                i11 = i33;
                i33 = -1;
            }
            if (oVarArr3[i25].length != 0) {
                i12 = i11 + 1;
            } else {
                i12 = i11;
                i11 = -1;
            }
            h(m0Var, oVarArr4);
            List list9 = list2;
            p0VarArr[i32] = new p0(string, oVarArr4);
            int i34 = aVar5.f35020b;
            h0 h0Var2 = j0.f818c;
            b1 b1Var2 = b1.f768f;
            a aVar6 = new a(i34, 0, iArr7, i32, i33, i11, -1, b1Var2);
            int i35 = i32;
            aVarArr[i35] = aVar6;
            int i36 = -1;
            if (i33 != -1) {
                String strX = om1.x(string, ":emsg");
                j3.n nVar3 = new j3.n();
                nVar3.f26281a = strX;
                nVar3.f26292m = c0.n("application/x-emsg");
                p0VarArr[i33] = new p0(strX, new j3.o(nVar3));
                a aVar7 = new a(5, 1, iArr7, i35, -1, -1, -1, b1Var2);
                i35 = i35;
                aVarArr[i33] = aVar7;
                i36 = -1;
            }
            if (i11 != i36) {
                String strX2 = om1.x(string, ":cc");
                aVarArr[i11] = new a(3, 1, iArr7, i35, -1, -1, -1, j0.t(oVarArr3[i25]));
                h(m0Var, oVarArr3[i25]);
                p0VarArr[i11] = new p0(strX2, oVarArr3[i25]);
            }
            i25++;
            size2 = i31;
            i26 = i12;
            list2 = list9;
        }
        int i37 = 0;
        while (i37 < list.size()) {
            w3.g gVar2 = (w3.g) list.get(i37);
            j3.n nVar4 = new j3.n();
            nVar4.f26281a = gVar2.a();
            nVar4.f26292m = c0.n("application/x-emsg");
            p0VarArr[i26] = new p0(gVar2.a() + StringUtils.PROCESS_POSTFIX_DELIMITER + i37, new j3.o(nVar4));
            h0 h0Var3 = j0.f818c;
            aVarArr[i26] = new a(5, 2, new int[0], -1, -1, -1, i37, b1.f768f);
            i37++;
            i26++;
        }
        Pair pairCreate = Pair.create(new j1(p0VarArr), aVarArr);
        this.f34657k = (j1) pairCreate.first;
        this.f34658l = (a[]) pairCreate.second;
    }

    public static boolean a(w3.a aVar, w3.a aVar2) {
        int i = aVar.f35020b;
        List list = aVar.f35021c;
        int i10 = aVar2.f35020b;
        List list2 = aVar2.f35021c;
        if (i == i10) {
            if (list.isEmpty() || list2.isEmpty()) {
                return true;
            }
            j3.o oVar = ((m) list.get(0)).f35076b;
            j3.o oVar2 = ((m) list2.get(0)).f35076b;
            int i11 = oVar.f26328f & (-16385);
            int i12 = oVar2.f26328f & (-16385);
            if (Objects.equals(oVar.f26326d, oVar2.f26326d) && i11 == i12) {
                return true;
            }
        }
        return false;
    }

    public static w3.f c(String str, List list) {
        for (int i = 0; i < list.size(); i++) {
            w3.f fVar = (w3.f) list.get(i);
            if (str.equals(fVar.f35053a)) {
                return fVar;
            }
        }
        return null;
    }

    public static void h(m0 m0Var, j3.o[] oVarArr) {
        for (int i = 0; i < oVarArr.length; i++) {
            j3.o oVar = oVarArr[i];
            ac.c cVar = (ac.c) m0Var.f841e;
            if (cVar.f738b && ((l7.i) cVar.f739c).c(oVar)) {
                j3.n nVarA = oVar.a();
                String str = oVar.f26332k;
                nVarA.f26292m = c0.n("application/x-media3-cues");
                nVarA.K = ((l7.i) cVar.f739c).a(oVar);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(oVar.f26335n);
                sb2.append(str != null ? " ".concat(str) : "");
                nVarA.f26289j = sb2.toString();
                nVarA.f26297r = Long.MAX_VALUE;
                oVar = new j3.o(nVarA);
            }
            oVarArr[i] = oVar;
        }
    }

    public static j3.o[] i(w3.f fVar, Pattern pattern, j3.o oVar) {
        String str = fVar.f35054b;
        if (str == null) {
            return new j3.o[]{oVar};
        }
        String str2 = m3.z.f28608a;
        String[] strArrSplit = str.split(";", -1);
        j3.o[] oVarArr = new j3.o[strArrSplit.length];
        for (int i = 0; i < strArrSplit.length; i++) {
            Matcher matcher = pattern.matcher(strArrSplit[i]);
            if (!matcher.matches()) {
                return new j3.o[]{oVar};
            }
            int i10 = Integer.parseInt(matcher.group(1));
            j3.n nVarA = oVar.a();
            nVarA.f26281a = oVar.f26323a + StringUtils.PROCESS_POSTFIX_DELIMITER + i10;
            nVarA.J = i10;
            nVarA.f26284d = matcher.group(2);
            oVarArr[i] = new j3.o(nVarA);
        }
        return oVarArr;
    }

    @Override // i4.a0
    public final long b(long j10, s3.c1 c1Var) {
        for (j4.i iVar : this.f34665s) {
            if (iVar.f26482b == 2) {
                return iVar.f26486f.b(j10, c1Var);
            }
        }
        return j10;
    }

    @Override // i4.c1
    public final void d(d1 d1Var) {
        this.f34664r.d(this);
    }

    public final int e(int i, int[] iArr) {
        int i10 = iArr[i];
        if (i10 != -1) {
            a[] aVarArr = this.f34658l;
            int i11 = aVarArr[i10].f34645e;
            for (int i12 = 0; i12 < iArr.length; i12++) {
                int i13 = iArr[i12];
                if (i13 == i11 && aVarArr[i13].f34643c == 0) {
                    return i12;
                }
            }
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i4.a0
    public final long f(r[] rVarArr, boolean[] zArr, i4.b1[] b1VarArr, boolean[] zArr2, long j10) throws Throwable {
        int i;
        p0 p0Var;
        boolean z5;
        int[] iArr;
        int[] iArr2;
        int i10;
        int i11;
        int i12;
        p0 p0VarA;
        j0 j0Var;
        int i13;
        k kVar;
        boolean z10;
        r[] rVarArr2 = rVarArr;
        int[] iArr3 = new int[rVarArr2.length];
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i = -1;
            if (i15 >= rVarArr2.length) {
                break;
            }
            r rVar = rVarArr2[i15];
            if (rVar != null) {
                iArr3[i15] = this.f34657k.b(rVar.b());
            } else {
                iArr3[i15] = -1;
            }
            i15++;
        }
        int i16 = 0;
        while (true) {
            p0Var = null;
            if (i16 >= rVarArr2.length) {
                break;
            }
            if (rVarArr2[i16] == null || !zArr[i16]) {
                i4.b1 b1Var = b1VarArr[i16];
                if (b1Var instanceof j4.i) {
                    ((j4.i) b1Var).t(this);
                } else if (b1Var instanceof j4.g) {
                    j4.g gVar = (j4.g) b1Var;
                    j4.i iVar = gVar.f26481f;
                    boolean[] zArr3 = iVar.f26485e;
                    int i17 = gVar.f26479d;
                    h5.r(zArr3[i17]);
                    iVar.f26485e[i17] = false;
                }
                b1VarArr[i16] = null;
            }
            i16++;
        }
        int i18 = 0;
        while (true) {
            z5 = true;
            if (i18 >= rVarArr2.length) {
                break;
            }
            i4.b1 b1Var2 = b1VarArr[i18];
            if ((b1Var2 instanceof i4.r) || (b1Var2 instanceof j4.g)) {
                int iE = e(i18, iArr3);
                if (iE == -1) {
                    z10 = b1VarArr[i18] instanceof i4.r;
                } else {
                    i4.b1 b1Var3 = b1VarArr[i18];
                    z10 = (b1Var3 instanceof j4.g) && ((j4.g) b1Var3).f26477b == b1VarArr[iE];
                }
                if (!z10) {
                    i4.b1 b1Var4 = b1VarArr[i18];
                    if (b1Var4 instanceof j4.g) {
                        j4.g gVar2 = (j4.g) b1Var4;
                        j4.i iVar2 = gVar2.f26481f;
                        boolean[] zArr4 = iVar2.f26485e;
                        int i19 = gVar2.f26479d;
                        h5.r(zArr4[i19]);
                        iVar2.f26485e[i19] = false;
                    }
                    b1VarArr[i18] = null;
                }
            }
            i18++;
        }
        int i20 = 0;
        while (i20 < rVarArr2.length) {
            r rVar2 = rVarArr2[i20];
            if (rVar2 == null) {
                iArr2 = iArr3;
                i10 = i14;
                i11 = i20;
            } else {
                i4.b1 b1Var5 = b1VarArr[i20];
                if (b1Var5 == null) {
                    zArr2[i20] = z5;
                    a aVar = this.f34658l[iArr3[i20]];
                    int i21 = aVar.f34643c;
                    if (i21 == 0) {
                        int i22 = aVar.f34646f;
                        boolean z11 = i22 != i ? z5 ? 1 : 0 : i14;
                        if (z11 != 0) {
                            p0VarA = this.f34657k.a(i22);
                            i12 = z5 ? 1 : 0;
                        } else {
                            i12 = i14;
                            p0VarA = p0Var;
                        }
                        int i23 = aVar.f34647g;
                        if (i23 != i) {
                            j0Var = this.f34658l[i23].f34648h;
                        } else {
                            h0 h0Var = j0.f818c;
                            j0Var = b1.f768f;
                        }
                        int size = j0Var.size() + i12;
                        j3.o[] oVarArr = new j3.o[size];
                        int[] iArr4 = new int[size];
                        if (z11 != 0) {
                            oVarArr[i14] = p0VarA.f26354d[i14];
                            iArr4[i14] = 5;
                            i13 = z5 ? 1 : 0;
                        } else {
                            i13 = i14;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (int i24 = i14; i24 < j0Var.size(); i24++) {
                            j3.o oVar = (j3.o) j0Var.get(i24);
                            oVarArr[i13] = oVar;
                            iArr4[i13] = 3;
                            arrayList.add(oVar);
                            i13 += z5 ? 1 : 0;
                        }
                        if (!this.f34668v.f35032d || z11 == 0) {
                            kVar = p0Var;
                        } else {
                            l lVar = this.f34660n;
                            kVar = new k(lVar, lVar.f34729b);
                        }
                        m0 m0Var = this.f34650c;
                        o oVar2 = this.i;
                        w3.c cVar = this.f34668v;
                        s7.g gVar3 = this.f34654g;
                        int i25 = this.f34669w;
                        int[] iArr5 = aVar.f34641a;
                        int i26 = aVar.f34642b;
                        long j11 = this.f34655h;
                        int[] iArr6 = iArr3;
                        e0 e0Var = this.f34651d;
                        p3.h hVarCreateDataSource = ((p3.g) m0Var.f840d).createDataSource();
                        if (e0Var != null) {
                            hVarCreateDataSource.addTransferListener(e0Var);
                        }
                        h hVar = new h((ac.c) m0Var.f841e, oVar2, cVar, gVar3, i25, iArr5, rVar2, i26, hVarCreateDataSource, j11, m0Var.f839c, z11, arrayList, kVar);
                        Object obj = kVar;
                        iArr2 = iArr6;
                        p0Var = null;
                        i11 = i20;
                        j4.i iVar3 = new j4.i(aVar.f34642b, iArr4, oVarArr, hVar, this, this.f34656j, j10, this.f34652e, this.f34663q, this.f34653f, this.f34662p, this.f34671y, null);
                        synchronized (this) {
                            this.f34661o.put(iVar3, obj);
                        }
                        b1VarArr[i11] = iVar3;
                    } else {
                        iArr2 = iArr3;
                        i11 = i20;
                        if (i21 == 2) {
                            i10 = 0;
                            b1VarArr[i11] = new i((w3.g) this.f34670x.get(aVar.f34644d), rVar2.b().f26354d[0], this.f34668v.f35032d);
                        }
                    }
                    i10 = 0;
                } else {
                    iArr2 = iArr3;
                    i10 = i14;
                    i11 = i20;
                    if (b1Var5 instanceof j4.i) {
                        ((h) ((j4.i) b1Var5).f26486f).f34710j = rVar2;
                    }
                }
            }
            i20 = i11 + 1;
            rVarArr2 = rVarArr;
            i14 = i10;
            iArr3 = iArr2;
            i = -1;
            z5 = true;
        }
        int[] iArr7 = iArr3;
        boolean z12 = i14;
        int i27 = z12 ? 1 : 0;
        while (i27 < rVarArr.length) {
            if (b1VarArr[i27] != null || rVarArr[i27] == null) {
                iArr = iArr7;
            } else {
                iArr = iArr7;
                a aVar2 = this.f34658l[iArr[i27]];
                if (aVar2.f34643c == 1) {
                    int iE2 = e(i27, iArr);
                    if (iE2 != -1) {
                        j4.i iVar4 = (j4.i) b1VarArr[iE2];
                        int i28 = aVar2.f34642b;
                        boolean[] zArr5 = iVar4.f26485e;
                        a1[] a1VarArr = iVar4.f26494o;
                        for (int i29 = z12 ? 1 : 0; i29 < a1VarArr.length; i29++) {
                            if (iVar4.f26483c[i29] == i28) {
                                h5.r(!zArr5[i29]);
                                zArr5[i29] = true;
                                a1VarArr[i29].G(j10, true);
                                b1VarArr[i27] = new j4.g(iVar4, iVar4, a1VarArr[i29], i29);
                            }
                        }
                        throw new IllegalStateException();
                    }
                    b1VarArr[i27] = new i4.r();
                }
                i27++;
                iArr7 = iArr;
            }
            i27++;
            iArr7 = iArr;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int length = b1VarArr.length;
        for (int i30 = z12 ? 1 : 0; i30 < length; i30++) {
            i4.b1 b1Var6 = b1VarArr[i30];
            if (b1Var6 instanceof j4.i) {
                arrayList2.add((j4.i) b1Var6);
            } else if (b1Var6 instanceof i) {
                arrayList3.add((i) b1Var6);
            }
        }
        j4.i[] iVarArr = new j4.i[arrayList2.size()];
        this.f34665s = iVarArr;
        arrayList2.toArray(iVarArr);
        i[] iVarArr2 = new i[arrayList3.size()];
        this.f34666t = iVarArr2;
        arrayList3.toArray(iVarArr2);
        nd ndVar = this.f34659m;
        AbstractList abstractListU = q.u(arrayList2, new ug.a(11));
        ndVar.getClass();
        this.f34667u = new n(arrayList2, abstractListU);
        if (this.f34671y) {
            this.f34671y = z12;
            this.f34672z = j10;
        }
        return j10;
    }

    @Override // i4.a0
    public final void g(long j10) {
        for (j4.i iVar : this.f34665s) {
            iVar.g(j10);
        }
    }

    @Override // i4.d1
    public final long getBufferedPositionUs() {
        return this.f34667u.getBufferedPositionUs();
    }

    @Override // i4.d1
    public final long getNextLoadPositionUs() {
        return this.f34667u.getNextLoadPositionUs();
    }

    @Override // i4.a0
    public final j1 getTrackGroups() {
        return this.f34657k;
    }

    @Override // i4.d1
    public final boolean isLoading() {
        return this.f34667u.isLoading();
    }

    @Override // i4.a0
    public final void k(z zVar, long j10) {
        this.f34664r = zVar;
        zVar.j(this);
    }

    @Override // i4.d1
    public final boolean l(s3.h0 h0Var) {
        return this.f34667u.l(h0Var);
    }

    @Override // i4.a0
    public final void maybeThrowPrepareError() {
        this.i.a();
    }

    @Override // i4.a0
    public final long readDiscontinuity() {
        j4.i[] iVarArr = this.f34665s;
        int length = iVarArr.length;
        for (int i = 0; i < length; i++) {
            j4.i iVar = iVarArr[i];
            iVar.getClass();
            try {
                if (iVar.f26504y) {
                    return this.f34672z;
                }
            } finally {
                iVar.f26504y = false;
            }
        }
        return -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008e  */
    @Override // i4.d1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void reevaluateBuffer(long r20) {
        /*
            r19 = this;
            r0 = r19
            j4.i[] r1 = r0.f34665s
            int r2 = r1.length
            r4 = 0
        L6:
            if (r4 >= r2) goto L94
            r5 = r1[r4]
            m4.n r6 = r5.f26489j
            boolean r6 = r6.d()
            if (r6 != 0) goto L8e
            w3.c r6 = r0.f34668v
            int r7 = r0.f34669w
            long r10 = r6.d(r7)
            i4.a1 r6 = r5.f26493n
            m4.n r7 = r5.f26489j
            boolean r7 = r7.d()
            r7 = r7 ^ 1
            com.google.android.gms.internal.measurement.h5.r(r7)
            boolean r7 = r5.q()
            if (r7 != 0) goto L8e
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r9 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r9 == 0) goto L8e
            java.util.ArrayList r9 = r5.f26491l
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L3f
            goto L8e
        L3f:
            j4.a r9 = r5.n()
            long r12 = r9.f26445m
            int r7 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r7 == 0) goto L4a
            goto L4c
        L4a:
            long r12 = r9.i
        L4c:
            int r7 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r7 > 0) goto L51
            goto L8e
        L51:
            long r12 = r6.q()
            int r7 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r7 > 0) goto L5a
            goto L8e
        L5a:
            long r7 = r6.r()
            r14 = 1
            long r7 = r7 + r14
            long r7 = java.lang.Math.max(r10, r7)
            r6.l(r7)
            i4.a1[] r6 = r5.f26494o
            int r7 = r6.length
            r8 = 0
        L6c:
            if (r8 >= r7) goto L84
            r9 = r6[r8]
            long r16 = r9.r()
            r18 = r4
            long r3 = r16 + r14
            long r3 = java.lang.Math.max(r10, r3)
            r9.l(r3)
            int r8 = r8 + 1
            r4 = r18
            goto L6c
        L84:
            r18 = r4
            i4.i0 r8 = r5.f26488h
            int r9 = r5.f26482b
            r8.i(r9, r10, r12)
            goto L90
        L8e:
            r18 = r4
        L90:
            int r4 = r18 + 1
            goto L6
        L94:
            i4.n r1 = r0.f34667u
            r2 = r20
            r1.reevaluateBuffer(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.b.reevaluateBuffer(long):void");
    }

    @Override // i4.a0
    public final long seekToUs(long j10) {
        for (j4.i iVar : this.f34665s) {
            iVar.u(j10);
        }
        for (i iVar2 : this.f34666t) {
            int iB = m3.z.b(iVar2.f34717d, j10, true);
            iVar2.f34721h = iB;
            iVar2.i = (iVar2.f34718e && iB == iVar2.f34717d.length) ? j10 : -9223372036854775807L;
        }
        return j10;
    }
}
