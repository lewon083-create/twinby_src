package i4;

import com.google.android.gms.internal.measurement.h5;
import fh.nd;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements a0, z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0[] f20946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean[] f20947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IdentityHashMap f20948d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final nd f20949e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f20950f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f20951g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public z f20952h;
    public j1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a0[] f20953j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public n f20954k;

    public l0(nd ndVar, long[] jArr, a0... a0VarArr) {
        this.f20949e = ndVar;
        this.f20946b = a0VarArr;
        ndVar.getClass();
        ad.h0 h0Var = ad.j0.f818c;
        ad.b1 b1Var = ad.b1.f768f;
        this.f20954k = new n(b1Var, b1Var);
        this.f20948d = new IdentityHashMap();
        this.f20953j = new a0[0];
        this.f20947c = new boolean[a0VarArr.length];
        for (int i = 0; i < a0VarArr.length; i++) {
            long j10 = jArr[i];
            if (j10 != 0) {
                this.f20947c[i] = true;
                this.f20946b[i] = new h1(a0VarArr[i], j10);
            }
        }
    }

    @Override // i4.a0
    public final long b(long j10, s3.c1 c1Var) {
        a0[] a0VarArr = this.f20953j;
        return (a0VarArr.length > 0 ? a0VarArr[0] : this.f20946b[0]).b(j10, c1Var);
    }

    @Override // i4.c1
    public final void d(d1 d1Var) {
        z zVar = this.f20952h;
        zVar.getClass();
        zVar.d(this);
    }

    @Override // i4.a0
    public final long f(l4.r[] rVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j10) {
        IdentityHashMap identityHashMap;
        int[] iArr;
        int[] iArr2 = new int[rVarArr.length];
        int[] iArr3 = new int[rVarArr.length];
        int i = 0;
        int i10 = 0;
        while (true) {
            int length = rVarArr.length;
            identityHashMap = this.f20948d;
            if (i10 >= length) {
                break;
            }
            b1 b1Var = b1VarArr[i10];
            Integer num = b1Var == null ? null : (Integer) identityHashMap.get(b1Var);
            iArr2[i10] = num == null ? -1 : num.intValue();
            l4.r rVar = rVarArr[i10];
            if (rVar != null) {
                String str = rVar.b().f26352b;
                iArr3[i10] = Integer.parseInt(str.substring(0, str.indexOf(StringUtils.PROCESS_POSTFIX_DELIMITER)));
            } else {
                iArr3[i10] = -1;
            }
            i10++;
        }
        identityHashMap.clear();
        int length2 = rVarArr.length;
        b1[] b1VarArr2 = new b1[length2];
        b1[] b1VarArr3 = new b1[rVarArr.length];
        l4.r[] rVarArr2 = new l4.r[rVarArr.length];
        a0[] a0VarArr = this.f20946b;
        ArrayList arrayList = new ArrayList(a0VarArr.length);
        long j11 = j10;
        int i11 = 0;
        while (i11 < a0VarArr.length) {
            int i12 = i;
            while (i12 < rVarArr.length) {
                b1VarArr3[i12] = iArr2[i12] == i11 ? b1VarArr[i12] : null;
                if (iArr3[i12] == i11) {
                    l4.r rVar2 = rVarArr[i12];
                    rVar2.getClass();
                    iArr = iArr2;
                    j3.p0 p0Var = (j3.p0) this.f20951g.get(rVar2.b());
                    p0Var.getClass();
                    rVarArr2[i12] = new k0(rVar2, p0Var);
                } else {
                    iArr = iArr2;
                    rVarArr2[i12] = null;
                }
                i12++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr2;
            a0[] a0VarArr2 = a0VarArr;
            int i13 = i11;
            long jF = a0VarArr2[i11].f(rVarArr2, zArr, b1VarArr3, zArr2, j11);
            if (i13 == 0) {
                j11 = jF;
            } else if (jF != j11) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z5 = false;
            for (int i14 = 0; i14 < rVarArr.length; i14++) {
                if (iArr3[i14] == i13) {
                    b1 b1Var2 = b1VarArr3[i14];
                    b1Var2.getClass();
                    b1VarArr2[i14] = b1VarArr3[i14];
                    identityHashMap.put(b1Var2, Integer.valueOf(i13));
                    z5 = true;
                } else if (iArr4[i14] == i13) {
                    h5.r(b1VarArr3[i14] == null);
                }
            }
            if (z5) {
                arrayList.add(a0VarArr2[i13]);
            }
            i11 = i13 + 1;
            a0VarArr = a0VarArr2;
            iArr2 = iArr4;
            i = 0;
        }
        int i15 = i;
        System.arraycopy(b1VarArr2, i15, b1VarArr, i15, length2);
        this.f20953j = (a0[]) arrayList.toArray(new a0[i15]);
        AbstractList abstractListU = ad.q.u(arrayList, new hf.a(27));
        this.f20949e.getClass();
        this.f20954k = new n(arrayList, abstractListU);
        return j11;
    }

    @Override // i4.a0
    public final void g(long j10) {
        for (a0 a0Var : this.f20953j) {
            a0Var.g(j10);
        }
    }

    @Override // i4.d1
    public final long getBufferedPositionUs() {
        return this.f20954k.getBufferedPositionUs();
    }

    @Override // i4.d1
    public final long getNextLoadPositionUs() {
        return this.f20954k.getNextLoadPositionUs();
    }

    @Override // i4.a0
    public final j1 getTrackGroups() {
        j1 j1Var = this.i;
        j1Var.getClass();
        return j1Var;
    }

    @Override // i4.d1
    public final boolean isLoading() {
        return this.f20954k.isLoading();
    }

    @Override // i4.z
    public final void j(a0 a0Var) {
        ArrayList arrayList = this.f20950f;
        arrayList.remove(a0Var);
        if (arrayList.isEmpty()) {
            a0[] a0VarArr = this.f20946b;
            int i = 0;
            for (a0 a0Var2 : a0VarArr) {
                i += a0Var2.getTrackGroups().f20935a;
            }
            j3.p0[] p0VarArr = new j3.p0[i];
            int i10 = 0;
            for (int i11 = 0; i11 < a0VarArr.length; i11++) {
                j1 trackGroups = a0VarArr[i11].getTrackGroups();
                int i12 = trackGroups.f20935a;
                int i13 = 0;
                while (i13 < i12) {
                    j3.p0 p0VarA = trackGroups.a(i13);
                    int i14 = p0VarA.f26351a;
                    j3.o[] oVarArr = new j3.o[i14];
                    for (int i15 = 0; i15 < i14; i15++) {
                        j3.o oVar = p0VarA.f26354d[i15];
                        j3.n nVarA = oVar.a();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(i11);
                        sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
                        String str = oVar.f26323a;
                        if (str == null) {
                            str = "";
                        }
                        sb2.append(str);
                        nVarA.f26281a = sb2.toString();
                        oVarArr[i15] = new j3.o(nVarA);
                    }
                    j3.p0 p0Var = new j3.p0(i11 + StringUtils.PROCESS_POSTFIX_DELIMITER + p0VarA.f26352b, oVarArr);
                    this.f20951g.put(p0Var, p0VarA);
                    p0VarArr[i10] = p0Var;
                    i13++;
                    i10++;
                }
            }
            this.i = new j1(p0VarArr);
            z zVar = this.f20952h;
            zVar.getClass();
            zVar.j(this);
        }
    }

    @Override // i4.a0
    public final void k(z zVar, long j10) {
        this.f20952h = zVar;
        ArrayList arrayList = this.f20950f;
        a0[] a0VarArr = this.f20946b;
        Collections.addAll(arrayList, a0VarArr);
        for (a0 a0Var : a0VarArr) {
            a0Var.k(this, j10);
        }
    }

    @Override // i4.d1
    public final boolean l(s3.h0 h0Var) {
        ArrayList arrayList = this.f20950f;
        if (arrayList.isEmpty()) {
            return this.f20954k.l(h0Var);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((a0) arrayList.get(i)).l(h0Var);
        }
        return false;
    }

    @Override // i4.a0
    public final void maybeThrowPrepareError() {
        for (a0 a0Var : this.f20946b) {
            a0Var.maybeThrowPrepareError();
        }
    }

    @Override // i4.a0
    public final long readDiscontinuity() {
        long j10 = -9223372036854775807L;
        for (a0 a0Var : this.f20953j) {
            long discontinuity = a0Var.readDiscontinuity();
            if (discontinuity == -9223372036854775807L) {
                if (j10 != -9223372036854775807L && a0Var.seekToUs(j10) != j10) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j10 == -9223372036854775807L) {
                for (a0 a0Var2 : this.f20953j) {
                    if (a0Var2 == a0Var) {
                        break;
                    }
                    if (a0Var2.seekToUs(discontinuity) != discontinuity) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j10 = discontinuity;
            } else if (discontinuity != j10) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j10;
    }

    @Override // i4.d1
    public final void reevaluateBuffer(long j10) {
        this.f20954k.reevaluateBuffer(j10);
    }

    @Override // i4.a0
    public final long seekToUs(long j10) {
        long jSeekToUs = this.f20953j[0].seekToUs(j10);
        int i = 1;
        while (true) {
            a0[] a0VarArr = this.f20953j;
            if (i >= a0VarArr.length) {
                return jSeekToUs;
            }
            if (a0VarArr[i].seekToUs(jSeekToUs) != jSeekToUs) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }
}
