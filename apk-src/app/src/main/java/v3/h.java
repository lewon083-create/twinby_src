package v3;

import ad.j0;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.nl0;
import com.google.android.gms.internal.measurement.j4;
import d8.e0;
import fh.zf;
import j3.c0;
import j4.n;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import m3.z;
import m4.o;
import ob.r;
import p3.w;
import s3.h0;
import w3.m;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements j4.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f34702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s7.g f34703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f34704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f34705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p3.h f34706e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f34707f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f34708g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k f34709h;
    public final r[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public l4.r f34710j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public w3.c f34711k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f34712l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public i4.b f34713m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f34714n;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, v3.h] */
    public h(ac.c cVar, o oVar, w3.c cVar2, s7.g gVar, int i, int[] iArr, l4.r rVar, int i10, p3.h hVar, long j10, int i11, boolean z5, ArrayList arrayList, k kVar) {
        r[] rVarArr;
        int i12;
        j3.o oVar2;
        m mVar;
        q4.k hVar2;
        j4.e eVar;
        ?? obj = new Object();
        obj.f34702a = oVar;
        obj.f34711k = cVar2;
        obj.f34703b = gVar;
        obj.f34704c = iArr;
        obj.f34710j = rVar;
        obj.f34705d = i10;
        obj.f34706e = hVar;
        obj.f34712l = i;
        obj.f34707f = j10;
        obj.f34708g = i11;
        k kVar2 = kVar;
        obj.f34709h = kVar2;
        long jD = cVar2.d(i);
        ArrayList arrayListH = obj.h();
        obj.i = new r[rVar.length()];
        int i13 = 0;
        int i14 = 0;
        h hVar3 = obj;
        while (i14 < hVar3.i.length) {
            m mVar2 = (m) arrayListH.get(rVar.h(i14));
            w3.b bVarJ = gVar.J(mVar2.f35077c);
            r[] rVarArr2 = hVar3.i;
            w3.b bVar = bVarJ == null ? (w3.b) mVar2.f35077c.get(i13) : bVarJ;
            j3.o oVar3 = mVar2.f35076b;
            cVar.getClass();
            String str = oVar3.f26334m;
            if (!c0.l(str)) {
                if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                    i12 = i14;
                    mVar = mVar2;
                    oVar2 = oVar3;
                    rVarArr = rVarArr2;
                    hVar2 = new i5.e((l7.i) cVar.f739c, cVar.f738b ? 1 : 3);
                } else if (Objects.equals(str, "image/jpeg")) {
                    hVar2 = new m5.a(1);
                } else if (Objects.equals(str, "image/png")) {
                    hVar2 = new m5.a(0, (byte) 0);
                } else {
                    int i15 = z5 ? 4 : 0;
                    rVarArr = rVarArr2;
                    i12 = i14;
                    oVar2 = oVar3;
                    int i16 = cVar.f738b ? i15 : i15 | 32;
                    mVar = mVar2;
                    hVar2 = new k5.h((l7.i) cVar.f739c, i16, null, null, arrayList, kVar2);
                }
                eVar = new j4.e(hVar2, i10, oVar2);
                long j11 = jD;
                rVarArr[i12] = new r(j11, mVar, bVar, eVar, 0L, mVar.c());
                i14 = i12 + 1;
                hVar3 = this;
                kVar2 = kVar;
                jD = j11;
                i13 = 0;
            } else if (cVar.f738b) {
                hVar2 = new n5.i(((l7.i) cVar.f739c).b(oVar3), oVar3);
            } else {
                eVar = null;
                i12 = i14;
                mVar = mVar2;
                rVarArr = rVarArr2;
                long j112 = jD;
                rVarArr[i12] = new r(j112, mVar, bVar, eVar, 0L, mVar.c());
                i14 = i12 + 1;
                hVar3 = this;
                kVar2 = kVar;
                jD = j112;
                i13 = 0;
            }
            i12 = i14;
            mVar = mVar2;
            oVar2 = oVar3;
            rVarArr = rVarArr2;
            eVar = new j4.e(hVar2, i10, oVar2);
            long j1122 = jD;
            rVarArr[i12] = new r(j1122, mVar, bVar, eVar, 0L, mVar.c());
            i14 = i12 + 1;
            hVar3 = this;
            kVar2 = kVar;
            jD = j1122;
            i13 = 0;
        }
    }

    @Override // j4.j
    public final void a() throws i4.b {
        i4.b bVar = this.f34713m;
        if (bVar != null) {
            throw bVar;
        }
        this.f34702a.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    @Override // j4.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long b(long r20, s3.c1 r22) {
        /*
            r19 = this;
            r1 = r20
            r7 = r19
            ob.r[] r0 = r7.i
            int r3 = r0.length
            r4 = 0
        L8:
            if (r4 >= r3) goto L64
            r5 = r0[r4]
            java.lang.Object r6 = r5.f30380g
            v3.g r6 = (v3.g) r6
            long r8 = r5.f30376c
            java.lang.Object r10 = r5.f30380g
            v3.g r10 = (v3.g) r10
            if (r6 == 0) goto L5f
            long r11 = r5.c()
            r13 = 0
            int r6 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r6 != 0) goto L23
            goto L5f
        L23:
            r10.getClass()
            long r3 = r5.f30375b
            long r3 = r10.D(r1, r3)
            long r3 = r3 + r8
            r13 = r3
            long r3 = r5.e(r13)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L58
            r15 = -1
            int r0 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            r15 = 1
            if (r0 == 0) goto L4f
            r10.getClass()
            long r17 = r10.Q()
            long r17 = r17 + r8
            long r17 = r17 + r11
            long r17 = r17 - r15
            int r0 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r0 >= 0) goto L58
        L4f:
            long r8 = r13 + r15
            long r5 = r5.e(r8)
        L55:
            r0 = r22
            goto L5a
        L58:
            r5 = r3
            goto L55
        L5a:
            long r0 = r0.a(r1, r3, r5)
            return r0
        L5f:
            int r4 = r4 + 1
            r1 = r20
            goto L8
        L64:
            return r20
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.h.b(long, s3.c1):long");
    }

    @Override // j4.j
    public final boolean c(long j10, j4.f fVar, List list) {
        if (this.f34713m != null) {
            return false;
        }
        return this.f34710j.d(j10, fVar, list);
    }

    @Override // j4.j
    public final boolean d(j4.f fVar, boolean z5, e0 e0Var, le.a aVar) {
        long jMax;
        if (z5) {
            k kVar = this.f34709h;
            if (kVar != null) {
                long j10 = kVar.f34727d;
                boolean z10 = j10 != -9223372036854775807L && j10 < fVar.f26475h;
                l lVar = kVar.f34728e;
                if (lVar.f34734g.f35032d) {
                    if (!lVar.i) {
                        if (z10) {
                            if (lVar.f34735h) {
                                lVar.i = true;
                                lVar.f34735h = false;
                                f fVar2 = (f) lVar.f34730c.f28696c;
                                fVar2.E.removeCallbacks(fVar2.f34699x);
                                fVar2.D();
                                return true;
                            }
                        }
                    }
                    return true;
                }
            }
            boolean z11 = this.f34711k.f35032d;
            r[] rVarArr = this.i;
            if (!z11 && (fVar instanceof j4.m)) {
                IOException iOException = (IOException) e0Var.f15621d;
                if ((iOException instanceof w) && ((w) iOException).f31206d == 404) {
                    r rVar = rVarArr[this.f34710j.k(fVar.f26472e)];
                    long jC = rVar.c();
                    if (jC != -1 && jC != 0) {
                        g gVar = (g) rVar.f30380g;
                        gVar.getClass();
                        if (((j4.m) fVar).a() > ((gVar.Q() + rVar.f30376c) + jC) - 1) {
                            this.f34714n = true;
                            return true;
                        }
                    }
                }
            }
            r rVar2 = rVarArr[this.f34710j.k(fVar.f26472e)];
            m mVar = (m) rVar2.f30378e;
            w3.b bVar = (w3.b) rVar2.f30379f;
            j0 j0Var = mVar.f35077c;
            s7.g gVar2 = this.f34703b;
            w3.b bVarJ = gVar2.J(j0Var);
            if (bVarJ == null || bVar.equals(bVarJ)) {
                l4.r rVar3 = this.f34710j;
                j0 j0Var2 = ((m) rVar2.f30378e).f35077c;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                int length = rVar3.length();
                int i = 0;
                for (int i10 = 0; i10 < length; i10++) {
                    if (rVar3.a(i10, jElapsedRealtime)) {
                        i++;
                    }
                }
                HashSet hashSet = new HashSet();
                for (int i11 = 0; i11 < j0Var2.size(); i11++) {
                    hashSet.add(Integer.valueOf(((w3.b) j0Var2.get(i11)).f35027c));
                }
                int size = hashSet.size();
                HashSet hashSet2 = new HashSet();
                ArrayList arrayListT = gVar2.t(j0Var2);
                for (int i12 = 0; i12 < arrayListT.size(); i12++) {
                    hashSet2.add(Integer.valueOf(((w3.b) arrayListT.get(i12)).f35027c));
                }
                nl0 nl0Var = new nl0(size, size - hashSet2.size(), length, i);
                if (nl0Var.a(2) || nl0Var.a(1)) {
                    aVar.getClass();
                    com.google.android.gms.internal.ads.o oVarD = le.a.d(nl0Var, e0Var);
                    if (oVarD != null) {
                        long j11 = oVarD.f8528b;
                        int i13 = oVarD.f8527a;
                        if (nl0Var.a(i13)) {
                            if (i13 == 2) {
                                l4.r rVar4 = this.f34710j;
                                return rVar4.n(rVar4.k(fVar.f26472e), j11);
                            }
                            if (i13 == 1) {
                                long jElapsedRealtime2 = SystemClock.elapsedRealtime() + j11;
                                String str = bVar.f35026b;
                                HashMap map = (HashMap) gVar2.f32795b;
                                if (map.containsKey(str)) {
                                    Long l10 = (Long) map.get(str);
                                    String str2 = z.f28608a;
                                    jMax = Math.max(jElapsedRealtime2, l10.longValue());
                                } else {
                                    jMax = jElapsedRealtime2;
                                }
                                map.put(str, Long.valueOf(jMax));
                                int i14 = bVar.f35027c;
                                if (i14 != Integer.MIN_VALUE) {
                                    Integer numValueOf = Integer.valueOf(i14);
                                    HashMap map2 = (HashMap) gVar2.f32796c;
                                    if (map2.containsKey(numValueOf)) {
                                        Long l11 = (Long) map2.get(numValueOf);
                                        String str3 = z.f28608a;
                                        jElapsedRealtime2 = Math.max(jElapsedRealtime2, l11.longValue());
                                    }
                                    map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // j4.j
    public final int e(long j10, List list) {
        return (this.f34713m != null || this.f34710j.length() < 2) ? list.size() : this.f34710j.i(j10, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j4.j
    public final void f(h0 h0Var, long j10, List list, ac.c cVar) {
        long j11;
        long j12;
        List list2;
        j4.m mVar;
        r[] rVarArr;
        long j13;
        long j14;
        long jMax;
        long j15;
        int i;
        long j16;
        long jK;
        Object kVar;
        long jM;
        long jK2;
        boolean z5;
        if (this.f34713m != null) {
            return;
        }
        long j17 = h0Var.f32550a;
        long j18 = j10 - j17;
        long jM2 = z.M(this.f34711k.b(this.f34712l).f35061b) + z.M(this.f34711k.f35029a) + j10;
        int i10 = 0;
        k kVar2 = this.f34709h;
        if (kVar2 != null) {
            l lVar = kVar2.f34728e;
            w3.c cVar2 = lVar.f34734g;
            j12 = -9223372036854775807L;
            m7.a aVar = lVar.f34730c;
            if (!cVar2.f35032d) {
                j11 = j17;
                z5 = false;
            } else if (lVar.i) {
                j11 = j17;
                z5 = true;
            } else {
                j11 = j17;
                Map.Entry entryCeilingEntry = lVar.f34733f.ceilingEntry(Long.valueOf(cVar2.f35036h));
                if (entryCeilingEntry == null || ((Long) entryCeilingEntry.getValue()).longValue() >= jM2) {
                    z5 = false;
                } else {
                    long jLongValue = ((Long) entryCeilingEntry.getKey()).longValue();
                    f fVar = (f) aVar.f28696c;
                    long j19 = fVar.N;
                    if (j19 == -9223372036854775807L || j19 < jLongValue) {
                        fVar.N = jLongValue;
                    }
                    z5 = true;
                }
                if (z5 && lVar.f34735h) {
                    lVar.i = true;
                    lVar.f34735h = false;
                    f fVar2 = (f) aVar.f28696c;
                    fVar2.E.removeCallbacks(fVar2.f34699x);
                    fVar2.D();
                }
            }
            if (z5) {
                return;
            }
        } else {
            j11 = j17;
            j12 = -9223372036854775807L;
        }
        long jM3 = z.M(z.A(this.f34707f));
        w3.c cVar3 = this.f34711k;
        long j20 = cVar3.f35029a;
        long jM4 = j20 == j12 ? j12 : jM3 - z.M(j20 + cVar3.b(this.f34712l).f35061b);
        if (list.isEmpty()) {
            list2 = list;
            mVar = null;
        } else {
            list2 = list;
            mVar = (j4.m) list2.get(list.size() - 1);
        }
        int length = this.f34710j.length();
        n[] nVarArr = new n[length];
        int i11 = 0;
        while (true) {
            rVarArr = this.i;
            if (i11 >= length) {
                break;
            }
            r rVar = rVarArr[i11];
            int i12 = i10;
            g gVar = (g) rVar.f30380g;
            long j21 = jM4;
            long j22 = rVar.f30376c;
            long j23 = rVar.f30375b;
            zf zfVar = n.O1;
            if (gVar == null) {
                nVarArr[i11] = zfVar;
            } else {
                gVar.getClass();
                long jM5 = gVar.m(j23, jM3) + j22;
                long jB = rVar.b(jM3);
                if (mVar != null) {
                    jK2 = mVar.a();
                } else {
                    g gVar2 = (g) rVar.f30380g;
                    gVar2.getClass();
                    jK2 = z.k(gVar2.D(j10, j23) + j22, jM5, jB);
                }
                long j24 = jK2;
                if (j24 < jM5) {
                    nVarArr[i11] = zfVar;
                } else {
                    nVarArr[i11] = new g4.a(i(i11), j24, jB);
                }
            }
            i11++;
            i10 = i12;
            jM4 = j21;
        }
        long j25 = jM4;
        int i13 = i10;
        if (!this.f34711k.f35032d || rVarArr[i13].c() == 0) {
            j13 = j18;
            j14 = 0;
            jMax = j12;
        } else {
            long jD = rVarArr[i13].d(rVarArr[i13].b(jM3));
            w3.c cVar4 = this.f34711k;
            long j26 = cVar4.f35029a;
            if (j26 == j12) {
                j13 = j18;
                jM = j12;
            } else {
                j13 = j18;
                jM = jM3 - z.M(j26 + cVar4.b(this.f34712l).f35061b);
            }
            long jMin = Math.min(jM, jD) - j11;
            j14 = 0;
            jMax = Math.max(0L, jMin);
        }
        long j27 = j14;
        this.f34710j.s(j11, j13, jMax, list2, nVarArr);
        int iC = this.f34710j.c();
        SystemClock.elapsedRealtime();
        r rVarI = i(iC);
        long j28 = rVarI.f30375b;
        long j29 = rVarI.f30376c;
        g gVar3 = (g) rVarI.f30380g;
        w3.b bVar = (w3.b) rVarI.f30379f;
        j4.e eVar = (j4.e) rVarI.f30377d;
        m mVar2 = (m) rVarI.f30378e;
        if (eVar != null) {
            i = 1;
            w3.j jVar = eVar.f26468k == null ? mVar2.f35080f : null;
            j15 = j29;
            w3.j jVarD = gVar3 == null ? mVar2.d() : null;
            if (jVar != null || jVarD != null) {
                j3.o oVarL = this.f34710j.l();
                int iM = this.f34710j.m();
                Object objP = this.f34710j.p();
                if (jVar != null) {
                    w3.j jVarA = jVar.a(jVarD, bVar.f35025a);
                    if (jVarA != null) {
                        jVar = jVarA;
                    }
                } else {
                    jVarD.getClass();
                    jVar = jVarD;
                }
                cVar.f739c = new j4.l(this.f34706e, j4.c(mVar2, bVar.f35025a, jVar, i13), oVarL, iM, objP, (j4.e) rVarI.f30377d);
                return;
            }
        } else {
            j15 = j29;
            i = 1;
        }
        w3.c cVar5 = this.f34711k;
        int i14 = (cVar5.f35032d && this.f34712l == cVar5.f35040m.size() + (-1)) ? i : i13;
        boolean z10 = (i14 == 0 || j28 != j12) ? i : i13;
        if (rVarI.c() == j27) {
            cVar.f738b = z10;
            return;
        }
        gVar3.getClass();
        long jM6 = gVar3.m(j28, jM3) + j15;
        long jB2 = rVarI.b(jM3);
        boolean z11 = z10;
        if (i14 != 0) {
            long jD2 = rVarI.d(jB2);
            z11 = (z10 ? 1 : 0) & ((jD2 - rVarI.e(jB2)) + jD2 >= j28 ? i : i13);
        }
        if (mVar != null) {
            jK = mVar.a();
            j16 = jB2;
        } else {
            gVar3.getClass();
            j16 = jB2;
            jK = z.k(gVar3.D(j10, j28) + j15, jM6, j16);
        }
        long j30 = jK;
        if (j30 < jM6) {
            this.f34713m = new i4.b();
            return;
        }
        if (j30 > j16 || (this.f34714n && j30 >= j16)) {
            cVar.f738b = z11;
            return;
        }
        if (z11 != 0 && rVarI.e(j30) >= j28) {
            cVar.f738b = i;
            return;
        }
        int iMin = (int) Math.min(this.f34708g, (j16 - j30) + 1);
        int i15 = 1;
        if (j28 != j12) {
            while (iMin > 1 && rVarI.e((((long) iMin) + j30) - 1) >= j28) {
                iMin--;
            }
        }
        long j31 = list.isEmpty() ? j10 : j12;
        j3.o oVarL2 = this.f34710j.l();
        int iM2 = this.f34710j.m();
        Object objP2 = this.f34710j.p();
        long jE = rVarI.e(j30);
        gVar3.getClass();
        w3.j jVarO = gVar3.o(j30 - j15);
        p3.h hVar = this.f34706e;
        if (eVar == null) {
            kVar = new j4.o(hVar, j4.c(mVar2, bVar.f35025a, jVarO, rVarI.f(j30, j25) ? 0 : 8), oVarL2, iM2, objP2, jE, rVarI.d(j30), j30, this.f34705d, oVarL2);
        } else {
            w3.j jVar2 = jVarO;
            int i16 = 1;
            while (i15 < iMin) {
                int i17 = iMin;
                gVar3.getClass();
                w3.j jVarA2 = jVar2.a(gVar3.o((j30 + ((long) i15)) - j15), bVar.f35025a);
                if (jVarA2 == null) {
                    break;
                }
                i16++;
                i15++;
                jVar2 = jVarA2;
                iMin = i17;
            }
            long j32 = (j30 + ((long) i16)) - 1;
            long jD3 = rVarI.d(j32);
            long j33 = (j28 == j12 || j28 > jD3) ? j12 : j28;
            p3.l lVarC = j4.c(mVar2, bVar.f35025a, jVar2, rVarI.f(j32, j25) ? 0 : 8);
            long j34 = -mVar2.f35078d;
            if (c0.k(oVarL2.f26335n)) {
                j34 += jE;
            }
            kVar = new j4.k(hVar, lVarC, oVarL2, iM2, objP2, jE, jD3, j31, j33, j30, i16, j34, (j4.e) rVarI.f30377d);
        }
        cVar.f739c = kVar;
    }

    @Override // j4.j
    public final void g(j4.f fVar) {
        if (fVar instanceof j4.l) {
            int iK = this.f34710j.k(((j4.l) fVar).f26472e);
            r[] rVarArr = this.i;
            r rVar = rVarArr[iK];
            if (((g) rVar.f30380g) == null) {
                j4.e eVar = (j4.e) rVar.f30377d;
                eVar.getClass();
                q4.g gVarA = eVar.a();
                if (gVarA != null) {
                    m mVar = (m) rVar.f30378e;
                    rVarArr[iK] = new r(rVar.f30375b, mVar, (w3.b) rVar.f30379f, (j4.e) rVar.f30377d, rVar.f30376c, new com.google.android.gms.ads.identifier.c(gVarA, mVar.f35078d, 13));
                }
            }
        }
        k kVar = this.f34709h;
        if (kVar != null) {
            long j10 = kVar.f34727d;
            if (j10 == -9223372036854775807L || fVar.i > j10) {
                kVar.f34727d = fVar.i;
            }
            kVar.f34728e.f34735h = true;
        }
    }

    public final ArrayList h() {
        List list = this.f34711k.b(this.f34712l).f35062c;
        ArrayList arrayList = new ArrayList();
        for (int i : this.f34704c) {
            arrayList.addAll(((w3.a) list.get(i)).f35021c);
        }
        return arrayList;
    }

    public final r i(int i) {
        r[] rVarArr = this.i;
        r rVar = rVarArr[i];
        w3.b bVarJ = this.f34703b.J(((m) rVar.f30378e).f35077c);
        if (bVarJ == null || bVarJ.equals((w3.b) rVar.f30379f)) {
            return rVar;
        }
        r rVar2 = new r(rVar.f30375b, (m) rVar.f30378e, bVarJ, (j4.e) rVar.f30377d, rVar.f30376c, (g) rVar.f30380g);
        rVarArr[i] = rVar2;
        return rVar2;
    }

    @Override // j4.j
    public final void release() {
        for (r rVar : this.i) {
            j4.e eVar = (j4.e) rVar.f30377d;
            if (eVar != null) {
                eVar.f26460b.release();
            }
        }
    }
}
