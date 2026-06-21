package x5;

import ad.m0;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.google.android.gms.internal.ads.b7;
import com.google.android.gms.internal.ads.e2;
import com.google.android.gms.internal.ads.p1;
import com.google.android.gms.internal.measurement.h5;
import j3.d0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m3.w;
import ob.y;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements q4.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f35956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f35957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m3.p f35958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseIntArray f35959e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d2.h f35960f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n5.k f35961g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SparseArray f35962h;
    public final SparseBooleanArray i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final SparseBooleanArray f35963j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final o f35964k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public v4.b f35965l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public q4.m f35966m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f35967n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f35968o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f35969p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f35970q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public v f35971r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f35972s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f35973t;

    public t(int i, int i10, n5.k kVar, w wVar, d2.h hVar) {
        this.f35960f = hVar;
        this.f35955a = i;
        this.f35956b = i10;
        this.f35961g = kVar;
        if (i == 1 || i == 2) {
            this.f35957c = Collections.singletonList(wVar);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f35957c = arrayList;
            arrayList.add(wVar);
        }
        this.f35958d = new m3.p(0, new byte[9400]);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.i = sparseBooleanArray;
        this.f35963j = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f35962h = sparseArray;
        this.f35959e = new SparseIntArray();
        this.f35964k = new o(1);
        this.f35966m = q4.m.X1;
        this.f35973t = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i11 = 0; i11 < size; i11++) {
            sparseArray.put(sparseArray2.keyAt(i11), (v) sparseArray2.valueAt(i11));
        }
        sparseArray.put(0, new s(new x0.v(this)));
        this.f35971r = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [int] */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.util.SparseArray] */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.util.SparseBooleanArray] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [x5.v] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [int] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // q4.k
    public final int a(q4.l lVar, e2 e2Var) throws d0 {
        q4.l lVar2;
        ?? r12;
        int i;
        int i10;
        int i11;
        int i12;
        boolean z5;
        long length = lVar.getLength();
        int i13 = this.f35955a;
        boolean z10 = i13 == 2;
        if (this.f35968o) {
            long j10 = -9223372036854775807L;
            o oVar = this.f35964k;
            if (length != -1 && !z10 && !oVar.f35927d) {
                int i14 = this.f35973t;
                w wVar = oVar.f35925b;
                m3.p pVar = oVar.f35926c;
                if (i14 <= 0) {
                    oVar.a(lVar);
                    return 0;
                }
                if (oVar.f35929f) {
                    if (oVar.f35931h == -9223372036854775807L) {
                        oVar.a(lVar);
                        return 0;
                    }
                    if (oVar.f35928e) {
                        long j11 = oVar.f35930g;
                        if (j11 == -9223372036854775807L) {
                            oVar.a(lVar);
                            return 0;
                        }
                        oVar.i = wVar.c(oVar.f35931h) - wVar.b(j11);
                        oVar.a(lVar);
                        return 0;
                    }
                    int iMin = (int) Math.min(112800, lVar.getLength());
                    long j12 = 0;
                    if (lVar.getPosition() != j12) {
                        e2Var.f4793b = j12;
                        return 1;
                    }
                    pVar.J(iMin);
                    lVar.L();
                    lVar.V(pVar.f28589a, 0, iMin);
                    int i15 = pVar.f28590b;
                    int i16 = pVar.f28591c;
                    while (true) {
                        if (i15 >= i16) {
                            break;
                        }
                        if (pVar.f28589a[i15] == 71) {
                            long jP = hl.l.p(pVar, i15, i14);
                            if (jP != -9223372036854775807L) {
                                j10 = jP;
                                break;
                            }
                        }
                        i15++;
                    }
                    oVar.f35930g = j10;
                    oVar.f35928e = true;
                    return 0;
                }
                long length2 = lVar.getLength();
                int iMin2 = (int) Math.min(112800, length2);
                long j13 = length2 - ((long) iMin2);
                if (lVar.getPosition() != j13) {
                    e2Var.f4793b = j13;
                    return 1;
                }
                pVar.J(iMin2);
                lVar.L();
                lVar.V(pVar.f28589a, 0, iMin2);
                int i17 = pVar.f28590b;
                int i18 = pVar.f28591c;
                int i19 = i18 - 188;
                while (true) {
                    if (i19 < i17) {
                        break;
                    }
                    byte[] bArr = pVar.f28589a;
                    int i20 = -4;
                    int i21 = 0;
                    while (true) {
                        if (i20 > 4) {
                            break;
                        }
                        int i22 = (i20 * 188) + i19;
                        if (i22 < i17 || i22 >= i18 || bArr[i22] != 71) {
                            i21 = 0;
                        } else {
                            i21++;
                            if (i21 == 5) {
                                long jP2 = hl.l.p(pVar, i19, i14);
                                if (jP2 != -9223372036854775807L) {
                                    j10 = jP2;
                                    break;
                                }
                            }
                        }
                        i20++;
                    }
                    i19--;
                }
                oVar.f35931h = j10;
                oVar.f35929f = true;
                return 0;
            }
            if (this.f35969p) {
                i = 1;
                z5 = false;
                i10 = i13;
            } else {
                this.f35969p = true;
                long j14 = oVar.i;
                if (j14 != -9223372036854775807L) {
                    i = 1;
                    z5 = false;
                    i10 = i13;
                    v4.b bVar = new v4.b(new y(25), new m0(this.f35973t, oVar.f35925b), j14, 1 + j14, 0L, length, 188L, 940);
                    this.f35965l = bVar;
                    this.f35966m.j((q4.c) bVar.f10460b);
                } else {
                    i = 1;
                    z5 = false;
                    i10 = i13;
                    this.f35966m.j(new q4.o(j14));
                }
            }
            if (this.f35970q) {
                this.f35970q = z5;
                seek(0L, 0L);
                if (lVar.getPosition() != 0) {
                    e2Var.f4793b = 0L;
                    return i;
                }
            }
            v4.b bVar2 = this.f35965l;
            if (bVar2 != null && ((p1) bVar2.f10462d) != null) {
                return bVar2.a(lVar, e2Var);
            }
            lVar2 = lVar;
            r12 = z5;
        } else {
            lVar2 = lVar;
            r12 = 0;
            i = 1;
            i10 = i13;
        }
        m3.p pVar2 = this.f35958d;
        byte[] bArr2 = pVar2.f28589a;
        if (9400 - pVar2.f28590b < 188) {
            int iA = pVar2.a();
            if (iA > 0) {
                System.arraycopy(bArr2, pVar2.f28590b, bArr2, r12, iA);
            }
            pVar2.K(iA, bArr2);
        }
        while (true) {
            int iA2 = pVar2.a();
            ?? r72 = this.f35962h;
            if (iA2 >= 188) {
                int i23 = pVar2.f28590b;
                int i24 = pVar2.f28591c;
                byte[] bArr3 = pVar2.f28589a;
                int i25 = i23;
                while (i25 < i24 && bArr3[i25] != 71) {
                    i25++;
                }
                pVar2.M(i25);
                int i26 = i25 + 188;
                if (i26 > i24) {
                    int i27 = (i25 - i23) + this.f35972s;
                    this.f35972s = i27;
                    i11 = i10;
                    i12 = 2;
                    if (i11 == 2 && i27 > 376) {
                        throw d0.a(null, "Cannot find sync byte. Most likely not a Transport Stream.");
                    }
                } else {
                    i11 = i10;
                    i12 = 2;
                    this.f35972s = r12;
                }
                int i28 = pVar2.f28591c;
                if (i26 > i28) {
                    return r12;
                }
                int iM = pVar2.m();
                if ((8388608 & iM) != 0) {
                    pVar2.M(i26);
                    return r12;
                }
                ?? r92 = (4194304 & iM) != 0 ? 1 : r12;
                int i29 = (2096896 & iM) >> 8;
                ?? r11 = (iM & 32) != 0 ? 1 : r12;
                ?? r8 = (iM & 16) != 0 ? (v) r72.get(i29) : 0;
                if (r8 == 0) {
                    pVar2.M(i26);
                    return r12;
                }
                if (i11 != i12) {
                    int i30 = iM & 15;
                    SparseIntArray sparseIntArray = this.f35959e;
                    int i31 = sparseIntArray.get(i29, i30 - 1);
                    sparseIntArray.put(i29, i30);
                    if (i31 == i30) {
                        pVar2.M(i26);
                        return r12;
                    }
                    if (i30 != ((i31 + 1) & 15)) {
                        r8.a();
                    }
                }
                if (r11 != 0) {
                    int iZ = pVar2.z();
                    r92 = (r92 == true ? 1 : 0) | ((pVar2.z() & 64) != 0 ? i12 : r12);
                    pVar2.N(iZ - 1);
                }
                boolean z11 = this.f35968o;
                if (i11 == i12 || z11 || !this.f35963j.get(i29, r12)) {
                    pVar2.L(i26);
                    r8.c(r92, pVar2);
                    pVar2.L(i28);
                }
                if (i11 != i12 && !z11 && this.f35968o && length != -1) {
                    this.f35970q = true;
                }
                pVar2.M(i26);
                return r12;
            }
            int i32 = pVar2.f28591c;
            int i33 = lVar2.read(bArr2, i32, 9400 - i32);
            if (i33 == -1) {
                for (?? r42 = r12; r42 < r72.size(); r42++) {
                    v vVar = (v) r72.valueAt(r42);
                    if (vVar instanceof n) {
                        n nVar = (n) vVar;
                        ?? r32 = (!z10 || nVar.e()) ? i : r12;
                        if (nVar.f35915c == 3 && nVar.f35921j == -1 && ((!z10 || !(nVar.f35913a instanceof h)) && r32 != 0)) {
                            nVar.c(i, new m3.p());
                        }
                    }
                    i = 1;
                }
                return -1;
            }
            pVar2.L(i32 + i33);
            i = 1;
        }
    }

    @Override // q4.k
    public final void b(q4.m mVar) {
        if ((this.f35956b & 1) == 0) {
            mVar = new b7(mVar, this.f35961g);
        }
        this.f35966m = mVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        r2 = r2 + 1;
     */
    @Override // q4.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(q4.l r7) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            r6 = this;
            m3.p r0 = r6.f35958d
            byte[] r0 = r0.f28589a
            q4.h r7 = (q4.h) r7
            r1 = 0
            r2 = 940(0x3ac, float:1.317E-42)
            r7.y(r0, r1, r2, r1)
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
            r7.x(r2, r1)
            r7 = 1
            return r7
        L29:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: x5.t.d(q4.l):boolean");
    }

    @Override // q4.k
    public final void seek(long j10, long j11) {
        v4.b bVar;
        long j12;
        SparseArray sparseArray = this.f35962h;
        List list = this.f35957c;
        h5.r(this.f35955a != 2);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            w wVar = (w) list.get(i);
            synchronized (wVar) {
                j12 = wVar.f28603b;
            }
            boolean z5 = j12 == -9223372036854775807L;
            if (!z5) {
                long jD = wVar.d();
                z5 = (jD == -9223372036854775807L || jD == 0 || jD == j11) ? false : true;
            }
            if (z5) {
                wVar.f(j11);
            }
        }
        if (j11 != 0 && (bVar = this.f35965l) != null) {
            bVar.c(j11);
        }
        this.f35958d.J(0);
        this.f35959e.clear();
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            ((v) sparseArray.valueAt(i10)).a();
        }
        this.f35972s = 0;
    }

    @Override // q4.k
    public final void release() {
    }
}
