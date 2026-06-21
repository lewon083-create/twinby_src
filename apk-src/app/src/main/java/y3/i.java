package y3;

import ad.b1;
import ad.h0;
import ad.j0;
import android.net.Uri;
import android.util.Pair;
import j3.p0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import k6.t0;
import m3.z;
import p3.e0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f36323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p3.h f36324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p3.h f36325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t0 f36326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Uri[] f36327e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j3.o[] f36328f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z3.c f36329g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p0 f36330h;
    public final List i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t3.j f36332k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f36333l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public i4.b f36335n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Uri f36336o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Uri f36337p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f36338q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public l4.r f36339r;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final xi.d f36331j = new xi.d();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f36334m = z.f28609b;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f36340s = -9223372036854775807L;

    public i(c cVar, z3.c cVar2, Uri[] uriArr, j3.o[] oVarArr, m4.d dVar, e0 e0Var, t0 t0Var, List list, t3.j jVar) {
        this.f36323a = cVar;
        this.f36329g = cVar2;
        this.f36327e = uriArr;
        this.f36328f = oVarArr;
        this.f36326d = t0Var;
        this.i = list;
        this.f36332k = jVar;
        p3.h hVarCreateDataSource = ((p3.g) dVar.f28630b).createDataSource();
        this.f36324b = hVarCreateDataSource;
        if (e0Var != null) {
            hVarCreateDataSource.addTransferListener(e0Var);
        }
        this.f36325c = ((p3.g) dVar.f28630b).createDataSource();
        this.f36330h = new p0("", oVarArr);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < uriArr.length; i++) {
            if ((oVarArr[i].f26328f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        p0 p0Var = this.f36330h;
        int[] iArrE = k3.f.E(arrayList);
        g gVar = new g(p0Var, iArrE);
        gVar.f36318g = gVar.k(p0Var.f26354d[iArrE[0]]);
        this.f36339r = gVar;
    }

    public static h d(z3.l lVar, long j10, int i) {
        long j11 = lVar.f46109k;
        j0 j0Var = lVar.f46117s;
        int i10 = (int) (j10 - j11);
        j0 j0Var2 = lVar.f46116r;
        if (i10 == j0Var2.size()) {
            if (i == -1) {
                i = 0;
            }
            if (i < j0Var.size()) {
                return new h((z3.j) j0Var.get(i), j10, i);
            }
            return null;
        }
        z3.i iVar = (z3.i) j0Var2.get(i10);
        if (i == -1) {
            return new h(iVar, j10, -1);
        }
        if (i < iVar.f46087n.size()) {
            return new h((z3.j) iVar.f46087n.get(i), j10, i);
        }
        int i11 = i10 + 1;
        if (i11 < j0Var2.size()) {
            return new h((z3.j) j0Var2.get(i11), j10 + 1, -1);
        }
        if (j0Var.isEmpty()) {
            return null;
        }
        return new h((z3.j) j0Var.get(0), j10 + 1, 0);
    }

    public final j4.n[] a(j jVar, long j10) {
        List listUnmodifiableList;
        i iVar = this;
        j jVar2 = jVar;
        int iA = jVar2 == null ? -1 : iVar.f36330h.a(jVar2.f26472e);
        int length = iVar.f36339r.length();
        j4.n[] nVarArr = new j4.n[length];
        boolean z5 = false;
        int i = 0;
        while (i < length) {
            int iH = iVar.f36339r.h(i);
            Uri uri = iVar.f36327e[iH];
            z3.c cVar = iVar.f36329g;
            if (cVar.c(uri)) {
                z3.l lVarA = cVar.a(z5, uri);
                lVarA.getClass();
                long j11 = lVarA.f46107h - cVar.f46038o;
                Pair pairC = iVar.c(jVar2, iH != iA ? true : z5, lVarA, j11, j10);
                long jLongValue = ((Long) pairC.first).longValue();
                int iIntValue = ((Integer) pairC.second).intValue();
                long j12 = lVarA.f46109k;
                j0 j0Var = lVarA.f46117s;
                j0 j0Var2 = lVarA.f46116r;
                int i10 = (int) (jLongValue - j12);
                if (i10 < 0 || j0Var2.size() < i10) {
                    h0 h0Var = j0.f818c;
                    listUnmodifiableList = b1.f768f;
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (i10 < j0Var2.size()) {
                        if (iIntValue != -1) {
                            z3.i iVar2 = (z3.i) j0Var2.get(i10);
                            if (iIntValue == 0) {
                                arrayList.add(iVar2);
                            } else if (iIntValue < iVar2.f46087n.size()) {
                                j0 j0Var3 = iVar2.f46087n;
                                arrayList.addAll(j0Var3.subList(iIntValue, j0Var3.size()));
                            }
                            i10++;
                        }
                        arrayList.addAll(j0Var2.subList(i10, j0Var2.size()));
                        iIntValue = 0;
                    }
                    if (lVarA.f46112n != -9223372036854775807L) {
                        if (iIntValue == -1) {
                            iIntValue = 0;
                        }
                        if (iIntValue < j0Var.size()) {
                            arrayList.addAll(j0Var.subList(iIntValue, j0Var.size()));
                        }
                    }
                    listUnmodifiableList = Collections.unmodifiableList(arrayList);
                }
                nVarArr[i] = new f(j11, listUnmodifiableList);
            } else {
                nVarArr[i] = j4.n.O1;
            }
            i++;
            iVar = this;
            jVar2 = jVar;
            z5 = false;
        }
        return nVarArr;
    }

    public final int b(j jVar) {
        int i = jVar.f36345p;
        if (i == -1) {
            return 1;
        }
        z3.l lVarA = this.f36329g.a(false, this.f36327e[this.f36330h.a(jVar.f26472e)]);
        lVarA.getClass();
        j0 j0Var = lVarA.f46116r;
        int i10 = (int) (jVar.f26516k - lVarA.f46109k);
        if (i10 < 0) {
            return 1;
        }
        j0 j0Var2 = i10 < j0Var.size() ? ((z3.i) j0Var.get(i10)).f46087n : lVarA.f46117s;
        if (i >= j0Var2.size()) {
            return 2;
        }
        z3.g gVar = (z3.g) j0Var2.get(i);
        if (gVar.f46082n) {
            return 0;
        }
        return Objects.equals(Uri.parse(m3.b.p(lVarA.f46139a, gVar.f46088b)), jVar.f26470c.f31172a) ? 1 : 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair c(y3.j r17, boolean r18, z3.l r19, long r20, long r22) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.i.c(y3.j, boolean, z3.l, long, long):android.util.Pair");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final e e(Uri uri, int i, boolean z5) {
        if (uri == null) {
            return null;
        }
        xi.d dVar = this.f36331j;
        byte[] bArr = (byte[]) ((d) dVar.f36218b).remove(uri);
        if (bArr != null) {
            return null;
        }
        p3.l lVar = new p3.l(uri, 0L, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 1);
        j3.o oVar = this.f36328f[i];
        int iM = this.f36339r.m();
        Object objP = this.f36339r.p();
        byte[] bArr2 = this.f36334m;
        e eVar = new e(this.f36325c, lVar, 3, oVar, iM, objP, -9223372036854775807L, -9223372036854775807L);
        if (bArr2 == null) {
            bArr2 = z.f28609b;
        }
        eVar.f36313k = bArr2;
        return eVar;
    }
}
