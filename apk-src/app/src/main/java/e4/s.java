package e4;

import ad.b1;
import ad.g1;
import ad.m0;
import android.net.Uri;
import android.os.Handler;
import com.google.android.gms.internal.measurement.h5;
import i4.a1;
import i4.j1;
import j3.p0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.SocketFactory;
import s3.c1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements i4.a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bb.e f16180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f16181c = m3.z.o(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f16182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m f16183e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f16184f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f16185g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a7.l f16186h;
    public final c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public i4.z f16187j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b1 f16188k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public IOException f16189l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public androidx.datastore.preferences.protobuf.m f16190m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f16191n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f16192o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f16193p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f16194q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f16195r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f16196s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f16197t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f16198u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f16199v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f16200w;

    public s(bb.e eVar, c cVar, Uri uri, a7.l lVar, String str, SocketFactory socketFactory) {
        this.f16180b = eVar;
        this.i = cVar;
        this.f16186h = lVar;
        p pVar = new p(0, this);
        this.f16182d = pVar;
        this.f16183e = new m(pVar, pVar, str, uri, socketFactory);
        this.f16184f = new ArrayList();
        this.f16185g = new ArrayList();
        this.f16192o = -9223372036854775807L;
        this.f16191n = -9223372036854775807L;
        this.f16193p = -9223372036854775807L;
    }

    public static void a(s sVar) {
        ArrayList arrayList = sVar.f16184f;
        sVar.f16194q = true;
        for (int i = 0; i < arrayList.size(); i++) {
            sVar.f16194q &= ((r) arrayList.get(i)).f16177d;
        }
    }

    public static void c(s sVar) {
        ArrayList arrayList = sVar.f16184f;
        if (sVar.f16196s || sVar.f16197t) {
            return;
        }
        int i = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((r) arrayList.get(i10)).f16176c.w() == null) {
                return;
            }
        }
        sVar.f16197t = true;
        ad.j0 j0VarR = ad.j0.r(arrayList);
        ad.q.d(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i11 = 0;
        while (i < j0VarR.size()) {
            a1 a1Var = ((r) j0VarR.get(i)).f16176c;
            String string = Integer.toString(i);
            j3.o oVarW = a1Var.w();
            oVarW.getClass();
            p0 p0Var = new p0(string, oVarW);
            int i12 = i11 + 1;
            int iF = ad.e0.f(objArrCopyOf.length, i12);
            if (iF > objArrCopyOf.length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iF);
            }
            objArrCopyOf[i11] = p0Var;
            i++;
            i11 = i12;
        }
        sVar.f16188k = ad.j0.p(i11, objArrCopyOf);
        i4.z zVar = sVar.f16187j;
        zVar.getClass();
        zVar.j(sVar);
    }

    public static void d(s sVar) {
        ArrayList arrayList = sVar.f16185g;
        ArrayList arrayList2 = sVar.f16184f;
        sVar.f16200w = true;
        m mVar = sVar.f16183e;
        mVar.getClass();
        try {
            mVar.close();
            z zVar = new z(new a1.e(mVar));
            mVar.f16154j = zVar;
            zVar.a(mVar.d(mVar.i));
            mVar.f16156l = null;
            mVar.f16162r = false;
            mVar.f16159o = null;
        } catch (IOException e3) {
            mVar.f16148c.c(new androidx.datastore.preferences.protobuf.m(e3));
        }
        c cVarB = sVar.i.b();
        if (cVarB == null) {
            sVar.f16190m = new androidx.datastore.preferences.protobuf.m("No fallback data channel factory for TCP retry");
            return;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        ArrayList arrayList4 = new ArrayList(arrayList.size());
        for (int i = 0; i < arrayList2.size(); i++) {
            r rVar = (r) arrayList2.get(i);
            boolean z5 = rVar.f16177d;
            q qVar = rVar.f16174a;
            if (z5) {
                arrayList3.add(rVar);
            } else {
                r rVar2 = new r(sVar, qVar.f16170a, i, cVarB);
                arrayList3.add(rVar2);
                q qVar2 = rVar2.f16174a;
                rVar2.f16175b.f(qVar2.f16171b, sVar.f16182d, 0);
                if (arrayList.contains(qVar)) {
                    arrayList4.add(qVar2);
                }
            }
        }
        ad.j0 j0VarR = ad.j0.r(arrayList2);
        arrayList2.clear();
        arrayList2.addAll(arrayList3);
        arrayList.clear();
        arrayList.addAll(arrayList4);
        for (int i10 = 0; i10 < j0VarR.size(); i10++) {
            ((r) j0VarR.get(i10)).a();
        }
    }

    public final boolean e() {
        return this.f16192o != -9223372036854775807L;
    }

    @Override // i4.a0
    public final long f(l4.r[] rVarArr, boolean[] zArr, i4.b1[] b1VarArr, boolean[] zArr2, long j10) {
        ArrayList arrayList;
        for (int i = 0; i < rVarArr.length; i++) {
            if (b1VarArr[i] != null && (rVarArr[i] == null || !zArr[i])) {
                b1VarArr[i] = null;
            }
        }
        ArrayList arrayList2 = this.f16185g;
        arrayList2.clear();
        int i10 = 0;
        while (true) {
            int length = rVarArr.length;
            arrayList = this.f16184f;
            if (i10 >= length) {
                break;
            }
            l4.r rVar = rVarArr[i10];
            if (rVar != null) {
                p0 p0VarB = rVar.b();
                b1 b1Var = this.f16188k;
                b1Var.getClass();
                int iIndexOf = b1Var.indexOf(p0VarB);
                r rVar2 = (r) arrayList.get(iIndexOf);
                rVar2.getClass();
                arrayList2.add(rVar2.f16174a);
                if (this.f16188k.contains(p0VarB) && b1VarArr[i10] == null) {
                    b1VarArr[i10] = new d8.e0(this, iIndexOf, 11);
                    zArr2[i10] = true;
                }
            }
            i10++;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            r rVar3 = (r) arrayList.get(i11);
            if (!arrayList2.contains(rVar3.f16174a)) {
                rVar3.a();
            }
        }
        this.f16198u = true;
        if (j10 != 0) {
            this.f16191n = j10;
            this.f16192o = j10;
            this.f16193p = j10;
        }
        h();
        return j10;
    }

    @Override // i4.a0
    public final void g(long j10) throws Throwable {
        if (e()) {
            return;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f16184f;
            if (i >= arrayList.size()) {
                return;
            }
            r rVar = (r) arrayList.get(i);
            if (!rVar.f16177d) {
                rVar.f16176c.j(j10, true);
            }
            i++;
        }
    }

    @Override // i4.d1
    public final long getBufferedPositionUs() {
        if (!this.f16194q) {
            ArrayList arrayList = this.f16184f;
            if (!arrayList.isEmpty()) {
                long j10 = this.f16191n;
                if (j10 != -9223372036854775807L) {
                    return j10;
                }
                boolean z5 = true;
                long jMin = Long.MAX_VALUE;
                for (int i = 0; i < arrayList.size(); i++) {
                    r rVar = (r) arrayList.get(i);
                    if (!rVar.f16177d) {
                        jMin = Math.min(jMin, rVar.f16176c.q());
                        z5 = false;
                    }
                }
                if (z5 || jMin == Long.MIN_VALUE) {
                    return 0L;
                }
                return jMin;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // i4.d1
    public final long getNextLoadPositionUs() {
        return getBufferedPositionUs();
    }

    @Override // i4.a0
    public final j1 getTrackGroups() {
        h5.r(this.f16197t);
        b1 b1Var = this.f16188k;
        b1Var.getClass();
        return new j1((p0[]) b1Var.toArray(new p0[0]));
    }

    public final void h() {
        ArrayList arrayList;
        boolean z5 = true;
        int i = 0;
        while (true) {
            arrayList = this.f16185g;
            if (i >= arrayList.size()) {
                break;
            }
            z5 &= ((q) arrayList.get(i)).f16172c != null;
            i++;
        }
        if (z5 && this.f16198u) {
            m mVar = this.f16183e;
            mVar.f16151f.addAll(arrayList);
            mVar.b();
        }
    }

    @Override // i4.d1
    public final boolean isLoading() {
        if (this.f16194q) {
            return false;
        }
        int i = this.f16183e.f16160p;
        return i == 2 || i == 1;
    }

    @Override // i4.a0
    public final void k(i4.z zVar, long j10) {
        m mVar = this.f16183e;
        this.f16187j = zVar;
        try {
            mVar.getClass();
            try {
                mVar.f16154j.a(mVar.d(mVar.i));
                m0 m0Var = mVar.f16153h;
                m0Var.q(m0Var.m(4, mVar.f16156l, g1.f796h, mVar.i));
            } catch (IOException e3) {
                m3.z.h(mVar.f16154j);
                throw e3;
            }
        } catch (IOException e7) {
            this.f16189l = e7;
            m3.z.h(mVar);
        }
    }

    @Override // i4.d1
    public final boolean l(s3.h0 h0Var) {
        return isLoading();
    }

    @Override // i4.a0
    public final void maybeThrowPrepareError() throws IOException {
        IOException iOException = this.f16189l;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // i4.a0
    public final long readDiscontinuity() {
        if (!this.f16195r) {
            return -9223372036854775807L;
        }
        this.f16195r = false;
        return 0L;
    }

    @Override // i4.a0
    public final long seekToUs(long j10) throws Throwable {
        if (getBufferedPositionUs() == 0 && !this.f16200w) {
            this.f16193p = j10;
            return j10;
        }
        g(j10);
        this.f16191n = j10;
        if (e()) {
            m mVar = this.f16183e;
            int i = mVar.f16160p;
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException();
                }
                this.f16192o = j10;
                mVar.h(j10);
                return j10;
            }
        } else {
            ArrayList arrayList = this.f16184f;
            int i10 = 0;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (((r) arrayList.get(i10)).f16176c.G(j10, this.f16194q)) {
                    i10++;
                } else {
                    this.f16192o = j10;
                    if (this.f16194q) {
                        for (int i11 = 0; i11 < this.f16184f.size(); i11++) {
                            r rVar = (r) this.f16184f.get(i11);
                            h5.r(rVar.f16177d);
                            rVar.f16177d = false;
                            a(rVar.f16179f);
                            rVar.f16175b.f(rVar.f16174a.f16171b, rVar.f16179f.f16182d, 0);
                        }
                        if (this.f16200w) {
                            this.f16183e.i(m3.z.Z(j10));
                        } else {
                            this.f16183e.h(j10);
                        }
                    } else {
                        this.f16183e.h(j10);
                    }
                    for (int i12 = 0; i12 < this.f16184f.size(); i12++) {
                        r rVar2 = (r) this.f16184f.get(i12);
                        if (!rVar2.f16177d) {
                            f fVar = rVar2.f16174a.f16171b.i;
                            fVar.getClass();
                            synchronized (fVar.f16090e) {
                                fVar.f16095k = true;
                            }
                            rVar2.f16176c.E(false);
                            rVar2.f16176c.f20851t = j10;
                        }
                    }
                }
            }
        }
        return j10;
    }

    @Override // i4.d1
    public final void reevaluateBuffer(long j10) {
    }

    @Override // i4.a0
    public final long b(long j10, c1 c1Var) {
        return j10;
    }
}
