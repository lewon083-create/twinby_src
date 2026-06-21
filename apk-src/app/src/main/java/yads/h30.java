package yads;

import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class h30 implements rm1, tx2, ku {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f38989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a30 f38990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u83 f38991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final tk0 f38992e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ae0 f38993f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final vo f38994g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f38995h;
    public final ig1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final qe f38996j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final l73 f38997k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g30[] f38998l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final hc0 f38999m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final we2 f39000n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final dn1 f39002p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final pk0 f39003q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final af2 f39004r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public qm1 f39005s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public sy f39008v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public c30 f39009w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f39010x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public List f39011y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Pattern f38988z = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern A = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public lu[] f39006t = a();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public an0[] f39007u = new an0[0];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final IdentityHashMap f39001o = new IdentityHashMap();

    public h30(int i, c30 c30Var, vo voVar, int i10, a30 a30Var, u83 u83Var, tk0 tk0Var, pk0 pk0Var, ae0 ae0Var, dn1 dn1Var, long j10, ig1 ig1Var, qe qeVar, hc0 hc0Var, com.monetization.ads.exo.source.dash.c cVar, af2 af2Var) {
        this.f38989b = i;
        this.f39009w = c30Var;
        this.f38994g = voVar;
        this.f39010x = i10;
        this.f38990c = a30Var;
        this.f38991d = u83Var;
        this.f38992e = tk0Var;
        this.f39003q = pk0Var;
        this.f38993f = ae0Var;
        this.f39002p = dn1Var;
        this.f38995h = j10;
        this.i = ig1Var;
        this.f38996j = qeVar;
        this.f38999m = hc0Var;
        this.f39004r = af2Var;
        this.f39000n = new we2(c30Var, cVar, qeVar);
        lu[] luVarArr = this.f39006t;
        hc0Var.getClass();
        this.f39008v = hc0.a(luVarArr);
        hc2 hc2VarA = c30Var.a(i10);
        List list = hc2VarA.f39128d;
        this.f39011y = list;
        Pair pairA = a(tk0Var, hc2VarA.f39127c, list);
        this.f38997k = (l73) pairA.first;
        this.f38998l = (g30[]) pairA.second;
    }

    public static Pair a(tk0 tk0Var, List list, List list2) {
        int i;
        int i10;
        int i11;
        int i12;
        nx0[] nx0VarArrA;
        int iMin;
        wf0 wf0VarA;
        int size = list.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i13 = 0; i13 < size; i13++) {
            sparseIntArray.put(((zb) list.get(i13)).f45305a, i13);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i13));
            arrayList.add(arrayList2);
            sparseArray.put(i13, arrayList2);
        }
        for (int i14 = 0; i14 < size; i14++) {
            zb zbVar = (zb) list.get(i14);
            wf0 wf0VarA2 = a("http://dashif.org/guidelines/trickmode", zbVar.f45309e);
            if (wf0VarA2 == null) {
                wf0VarA2 = a("http://dashif.org/guidelines/trickmode", zbVar.f45310f);
            }
            if (wf0VarA2 == null || (iMin = sparseIntArray.get(Integer.parseInt(wf0VarA2.f44370b), -1)) == -1) {
                iMin = i14;
            }
            if (iMin == i14 && (wf0VarA = a("urn:mpeg:dash:adaptation-set-switching:2016", zbVar.f45310f)) != null) {
                String str = wf0VarA.f44370b;
                int i15 = lb3.f40466a;
                for (String str2 : str.split(StringUtils.COMMA, -1)) {
                    int i16 = sparseIntArray.get(Integer.parseInt(str2), -1);
                    if (i16 != -1) {
                        iMin = Math.min(iMin, i16);
                    }
                }
            }
            if (iMin != i14) {
                List list3 = (List) sparseArray.get(i14);
                List list4 = (List) sparseArray.get(iMin);
                list4.addAll(list3);
                sparseArray.put(i14, list4);
                arrayList.remove(list3);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i17 = 0; i17 < size2; i17++) {
            int[] iArrA = vd1.a((Collection) arrayList.get(i17));
            iArr[i17] = iArrA;
            Arrays.sort(iArrA);
        }
        boolean[] zArr = new boolean[size2];
        nx0[][] nx0VarArr = new nx0[size2][];
        int i18 = 0;
        for (int i19 = 0; i19 < size2; i19++) {
            int[] iArr2 = iArr[i19];
            int length = iArr2.length;
            int i20 = 0;
            while (true) {
                if (i20 >= length) {
                    break;
                }
                List list5 = ((zb) list.get(iArr2[i20])).f45307c;
                for (int i21 = 0; i21 < list5.size(); i21++) {
                    if (!((no2) list5.get(i21)).f41312d.isEmpty()) {
                        zArr[i19] = true;
                        i18++;
                        break;
                    }
                }
                i20++;
            }
            int[] iArr3 = iArr[i19];
            int length2 = iArr3.length;
            int i22 = 0;
            while (true) {
                if (i22 >= length2) {
                    nx0VarArrA = new nx0[0];
                    break;
                }
                int i23 = iArr3[i22];
                zb zbVar2 = (zb) list.get(i23);
                List list6 = ((zb) list.get(i23)).f45308d;
                for (int i24 = 0; i24 < list6.size(); i24++) {
                    wf0 wf0Var = (wf0) list6.get(i24);
                    if ("urn:scte:dash:cc:cea-608:2015".equals(wf0Var.f44369a)) {
                        mx0 mx0Var = new mx0();
                        mx0Var.f41075k = "application/cea-608";
                        mx0Var.f41066a = t.z.d(zbVar2.f45305a, ":cea608", new StringBuilder());
                        nx0VarArrA = a(wf0Var, f38988z, new nx0(mx0Var));
                        break;
                    }
                    if ("urn:scte:dash:cc:cea-708:2015".equals(wf0Var.f44369a)) {
                        mx0 mx0Var2 = new mx0();
                        mx0Var2.f41075k = "application/cea-708";
                        mx0Var2.f41066a = t.z.d(zbVar2.f45305a, ":cea708", new StringBuilder());
                        nx0VarArrA = a(wf0Var, A, new nx0(mx0Var2));
                        break;
                    }
                }
                i22++;
            }
            nx0VarArr[i19] = nx0VarArrA;
            if (nx0VarArrA.length != 0) {
                i18++;
            }
        }
        int size3 = list2.size() + i18 + size2;
        k73[] k73VarArr = new k73[size3];
        g30[] g30VarArr = new g30[size3];
        int i25 = 0;
        int i26 = 0;
        while (i25 < size2) {
            int[] iArr4 = iArr[i25];
            ArrayList arrayList3 = new ArrayList();
            for (int i27 : iArr4) {
                arrayList3.addAll(((zb) list.get(i27)).f45307c);
            }
            int size4 = arrayList3.size();
            nx0[] nx0VarArr2 = new nx0[size4];
            int i28 = 0;
            while (i28 < size4) {
                nx0 nx0Var = ((no2) arrayList3.get(i28)).f41309a;
                int i29 = size2;
                int iA = tk0Var.a(nx0Var);
                int[][] iArr5 = iArr;
                mx0 mx0Var3 = new mx0(nx0Var);
                mx0Var3.D = iA;
                nx0VarArr2[i28] = new nx0(mx0Var3);
                i28++;
                size4 = size4;
                size2 = i29;
                iArr = iArr5;
            }
            int i30 = size2;
            int[][] iArr6 = iArr;
            zb zbVar3 = (zb) list.get(iArr4[0]);
            int i31 = zbVar3.f45305a;
            String string = i31 != -1 ? Integer.toString(i31) : og2.a("unset:", i25);
            int i32 = i26 + 1;
            if (zArr[i25]) {
                i = i26 + 2;
            } else {
                i = i32;
                i32 = -1;
            }
            if (nx0VarArr[i25].length != 0) {
                i10 = i + 1;
            } else {
                i10 = i;
                i = -1;
            }
            k73VarArr[i26] = new k73(string, nx0VarArr2);
            int i33 = i32;
            g30VarArr[i26] = new g30(zbVar3.f45306b, 0, iArr4, i26, i33, i, -1);
            if (i33 != -1) {
                String strX = com.google.android.gms.internal.ads.om1.x(string, ":emsg");
                mx0 mx0Var4 = new mx0();
                mx0Var4.f41066a = strX;
                mx0Var4.f41075k = "application/x-emsg";
                k73VarArr[i33] = new k73(strX, new nx0(mx0Var4));
                i11 = i;
                g30VarArr[i33] = new g30(5, 1, iArr4, i26, -1, -1, -1);
                i12 = -1;
            } else {
                i11 = i;
                i12 = -1;
            }
            if (i11 != i12) {
                k73VarArr[i11] = new k73(com.google.android.gms.internal.ads.om1.x(string, ":cc"), nx0VarArr[i25]);
                g30VarArr[i11] = new g30(3, 1, iArr4, i26, -1, -1, -1);
            }
            i25++;
            i26 = i10;
            size2 = i30;
            iArr = iArr6;
        }
        int i34 = 0;
        while (i34 < list2.size()) {
            bn0 bn0Var = (bn0) list2.get(i34);
            mx0 mx0Var5 = new mx0();
            mx0Var5.f41066a = bn0Var.f37102c + "/" + bn0Var.f37103d;
            mx0Var5.f41075k = "application/x-emsg";
            nx0 nx0Var2 = new nx0(mx0Var5);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(bn0Var.f37102c + "/" + bn0Var.f37103d);
            sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb2.append(i34);
            k73VarArr[i26] = new k73(sb2.toString(), nx0Var2);
            int i35 = i34;
            g30VarArr[i26] = new g30(5, 2, new int[0], -1, -1, -1, i35);
            i34 = i35 + 1;
            i26++;
        }
        return Pair.create(new l73(k73VarArr), g30VarArr);
    }

    @Override // yads.ux2
    public final boolean continueLoading(long j10) {
        return this.f39008v.continueLoading(j10);
    }

    @Override // yads.rm1
    public final void discardBuffer(long j10, boolean z5) throws Throwable {
        long j11;
        for (lu luVar : this.f39006t) {
            if (!luVar.c()) {
                os2 os2Var = luVar.f40673n;
                int i = os2Var.f41709q;
                os2Var.a(j10, z5, true);
                os2 os2Var2 = luVar.f40673n;
                int i10 = os2Var2.f41709q;
                if (i10 > i) {
                    synchronized (os2Var2) {
                        j11 = os2Var2.f41708p == 0 ? Long.MIN_VALUE : os2Var2.f41706n[os2Var2.f41710r];
                    }
                    int i11 = 0;
                    while (true) {
                        os2[] os2VarArr = luVar.f40674o;
                        if (i11 >= os2VarArr.length) {
                            break;
                        }
                        os2VarArr[i11].a(j11, z5, luVar.f40665e[i11]);
                        i11++;
                    }
                }
                int iMin = Math.min(luVar.a(i10, 0), luVar.f40681v);
                if (iMin > 0) {
                    ArrayList arrayList = luVar.f40671l;
                    int i12 = lb3.f40466a;
                    if (iMin > arrayList.size() || iMin < 0) {
                        throw new IllegalArgumentException();
                    }
                    if (iMin != 0) {
                        arrayList.subList(0, iMin).clear();
                    }
                    luVar.f40681v -= iMin;
                } else {
                    continue;
                }
            }
        }
    }

    @Override // yads.ux2
    public final long getBufferedPositionUs() {
        return this.f39008v.getBufferedPositionUs();
    }

    @Override // yads.ux2
    public final long getNextLoadPositionUs() {
        return this.f39008v.getNextLoadPositionUs();
    }

    @Override // yads.rm1
    public final l73 getTrackGroups() {
        return this.f38997k;
    }

    @Override // yads.ux2
    public final boolean isLoading() {
        return this.f39008v.isLoading();
    }

    @Override // yads.rm1
    public final void maybeThrowPrepareError() {
        this.i.a();
    }

    @Override // yads.rm1
    public final long readDiscontinuity() {
        return -9223372036854775807L;
    }

    @Override // yads.ux2
    public final void reevaluateBuffer(long j10) {
        this.f39008v.reevaluateBuffer(j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0090 A[LOOP:2: B:44:0x008e->B:45:0x0090, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ce  */
    @Override // yads.rm1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long seekToUs(long r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.h30.seekToUs(long):long");
    }

    public static wf0 a(String str, List list) {
        for (int i = 0; i < list.size(); i++) {
            wf0 wf0Var = (wf0) list.get(i);
            if (str.equals(wf0Var.f44369a)) {
                return wf0Var;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    @Override // yads.rm1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(long r19, yads.zw2 r21) {
        /*
            r18 = this;
            r1 = r19
            r7 = r18
            yads.lu[] r0 = r7.f39006t
            int r3 = r0.length
            r4 = 0
            r5 = r4
        L9:
            if (r5 >= r3) goto L7b
            r6 = r0[r5]
            int r8 = r6.f40662b
            r9 = 2
            if (r8 != r9) goto L76
            yads.b30 r0 = r6.f40666f
            yads.nc0 r0 = (yads.nc0) r0
            yads.lc0[] r0 = r0.f41219h
            int r3 = r0.length
        L19:
            if (r4 >= r3) goto L7b
            r5 = r0[r4]
            yads.i30 r6 = r5.f40483d
            if (r6 == 0) goto L71
            long r3 = r5.f40484e
            long r3 = r6.a(r1, r3)
            long r8 = r5.f40485f
            long r3 = r3 + r8
            yads.i30 r0 = r5.f40483d
            long r8 = r3 - r8
            long r8 = r0.a(r8)
            yads.i30 r0 = r5.f40483d
            long r10 = r5.f40484e
            long r10 = r0.c(r10)
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 >= 0) goto L69
            r12 = -1
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 == 0) goto L57
            yads.i30 r0 = r5.f40483d
            long r14 = r0.b()
            r16 = 1
            long r12 = r5.f40485f
            long r14 = r14 + r12
            long r14 = r14 + r10
            long r14 = r14 - r16
            int r0 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r0 >= 0) goto L69
            goto L59
        L57:
            r16 = 1
        L59:
            long r3 = r3 + r16
            yads.i30 r0 = r5.f40483d
            long r5 = r5.f40485f
            long r3 = r3 - r5
            long r3 = r0.a(r3)
            r5 = r3
            r3 = r8
        L66:
            r0 = r21
            goto L6c
        L69:
            r3 = r8
            r5 = r3
            goto L66
        L6c:
            long r0 = r0.a(r1, r3, r5)
            return r0
        L71:
            int r4 = r4 + 1
            r1 = r19
            goto L19
        L76:
            int r5 = r5 + 1
            r1 = r19
            goto L9
        L7b:
            return r19
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.h30.a(long, yads.zw2):long");
    }

    public static lu[] a() {
        return new lu[0];
    }

    @Override // yads.tx2
    public final void a(ux2 ux2Var) {
        this.f39005s.a((ux2) this);
    }

    public static nx0[] a(wf0 wf0Var, Pattern pattern, nx0 nx0Var) {
        String str = wf0Var.f44370b;
        if (str == null) {
            return new nx0[]{nx0Var};
        }
        int i = lb3.f40466a;
        String[] strArrSplit = str.split(";", -1);
        nx0[] nx0VarArr = new nx0[strArrSplit.length];
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            Matcher matcher = pattern.matcher(strArrSplit[i10]);
            if (!matcher.matches()) {
                return new nx0[]{nx0Var};
            }
            int i11 = Integer.parseInt(matcher.group(1));
            mx0 mx0Var = new mx0(nx0Var);
            mx0Var.f41066a = nx0Var.f41365b + StringUtils.PROCESS_POSTFIX_DELIMITER + i11;
            mx0Var.C = i11;
            mx0Var.f41068c = matcher.group(2);
            nx0VarArr[i10] = new nx0(mx0Var);
        }
        return nx0VarArr;
    }

    @Override // yads.rm1
    public final void a(qm1 qm1Var, long j10) {
        this.f39005s = qm1Var;
        qm1Var.a((rm1) this);
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c8  */
    @Override // yads.rm1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(yads.pp0[] r37, boolean[] r38, yads.ps2[] r39, boolean[] r40, long r41) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 762
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.h30.a(yads.pp0[], boolean[], yads.ps2[], boolean[], long):long");
    }
}
