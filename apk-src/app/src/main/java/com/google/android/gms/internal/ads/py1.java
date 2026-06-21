package com.google.android.gms.internal.ads;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class py1 implements gy1, fy1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gy1[] f9215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean[] f9216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IdentityHashMap f9217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f9218e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f9219f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public fy1 f9220g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public mz1 f9221h;
    public gy1[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public vx1 f9222j;

    public py1(long[] jArr, gy1... gy1VarArr) {
        this.f9215b = gy1VarArr;
        v41 v41Var = x41.f12018c;
        r51 r51Var = r51.f9713f;
        this.f9222j = new vx1(r51Var, r51Var);
        this.f9217d = new IdentityHashMap();
        this.i = new gy1[0];
        this.f9216c = new boolean[gy1VarArr.length];
        for (int i = 0; i < gy1VarArr.length; i++) {
            long j10 = jArr[i];
            if (j10 != 0) {
                this.f9216c[i] = true;
                this.f9215b[i] = new lz1(gy1VarArr[i], j10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.gy1
    public final void a(long j10) {
        for (gy1 gy1Var : this.i) {
            gy1Var.a(j10);
        }
    }

    @Override // com.google.android.gms.internal.ads.gy1
    public final long b(d[] dVarArr, boolean[] zArr, gz1[] gz1VarArr, boolean[] zArr2, long j10) {
        int length;
        IdentityHashMap identityHashMap;
        int[] iArr;
        int[] iArr2;
        int length2 = dVarArr.length;
        int[] iArr3 = new int[length2];
        int[] iArr4 = new int[length2];
        int i = 0;
        int i10 = 0;
        while (true) {
            length = dVarArr.length;
            identityHashMap = this.f9217d;
            if (i10 >= length) {
                break;
            }
            gz1 gz1Var = gz1VarArr[i10];
            Integer num = gz1Var == null ? null : (Integer) identityHashMap.get(gz1Var);
            iArr3[i10] = num == null ? -1 : num.intValue();
            d dVar = dVarArr[i10];
            if (dVar != null) {
                String str = dVar.h().f9071b;
                iArr4[i10] = Integer.parseInt(str.substring(0, str.indexOf(StringUtils.PROCESS_POSTFIX_DELIMITER)));
            } else {
                iArr4[i10] = -1;
            }
            i10++;
        }
        identityHashMap.clear();
        gz1[] gz1VarArr2 = new gz1[length];
        gz1[] gz1VarArr3 = new gz1[length];
        d[] dVarArr2 = new d[length];
        gy1[] gy1VarArr = this.f9215b;
        ArrayList arrayList = new ArrayList(gy1VarArr.length);
        long j11 = j10;
        int i11 = 0;
        while (i11 < gy1VarArr.length) {
            int i12 = i;
            while (i12 < dVarArr.length) {
                gz1VarArr3[i12] = iArr3[i12] == i11 ? gz1VarArr[i12] : null;
                if (iArr4[i12] == i11) {
                    d dVar2 = dVarArr[i12];
                    dVar2.getClass();
                    iArr = iArr4;
                    iArr2 = iArr3;
                    pi piVar = (pi) this.f9219f.get(dVar2.h());
                    piVar.getClass();
                    dVarArr2[i12] = new oy1(dVar2, piVar);
                } else {
                    iArr = iArr4;
                    iArr2 = iArr3;
                    dVarArr2[i12] = null;
                }
                i12++;
                iArr4 = iArr;
                iArr3 = iArr2;
            }
            int[] iArr5 = iArr4;
            int[] iArr6 = iArr3;
            ArrayList arrayList2 = arrayList;
            gy1[] gy1VarArr2 = gy1VarArr;
            int i13 = i11;
            long jB = gy1VarArr[i11].b(dVarArr2, zArr, gz1VarArr3, zArr2, j11);
            if (i13 == 0) {
                j11 = jB;
            } else if (jB != j11) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z5 = false;
            for (int i14 = 0; i14 < dVarArr.length; i14++) {
                if (iArr5[i14] == i13) {
                    gz1 gz1Var2 = gz1VarArr3[i14];
                    gz1Var2.getClass();
                    gz1VarArr2[i14] = gz1Var2;
                    identityHashMap.put(gz1Var2, Integer.valueOf(i13));
                    z5 = true;
                } else if (iArr6[i14] == i13) {
                    ix.k0(gz1VarArr3[i14] == null);
                }
            }
            if (z5) {
                arrayList2.add(gy1VarArr2[i13]);
            }
            i11 = i13 + 1;
            arrayList = arrayList2;
            gy1VarArr = gy1VarArr2;
            iArr4 = iArr5;
            iArr3 = iArr6;
            i = 0;
        }
        int i15 = i;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(gz1VarArr2, i15, gz1VarArr, i15, length);
        this.i = (gy1[]) arrayList3.toArray(new gy1[i15]);
        this.f9222j = new vx1(arrayList3, ix.J(arrayList3, f11.f5176f));
        return j11;
    }

    @Override // com.google.android.gms.internal.ads.gy1
    public final long c(long j10, uu1 uu1Var) {
        gy1[] gy1VarArr = this.i;
        return (gy1VarArr.length > 0 ? gy1VarArr[0] : this.f9215b[0]).c(j10, uu1Var);
    }

    @Override // com.google.android.gms.internal.ads.fy1
    public final /* bridge */ /* synthetic */ void d(hz1 hz1Var) {
        fy1 fy1Var = this.f9220g;
        fy1Var.getClass();
        fy1Var.d(this);
    }

    @Override // com.google.android.gms.internal.ads.hz1
    public final long e() {
        return this.f9222j.e();
    }

    @Override // com.google.android.gms.internal.ads.hz1
    public final long f() {
        return this.f9222j.f();
    }

    @Override // com.google.android.gms.internal.ads.gy1
    public final mz1 g() {
        mz1 mz1Var = this.f9221h;
        mz1Var.getClass();
        return mz1Var;
    }

    @Override // com.google.android.gms.internal.ads.gy1
    public final void h() {
        int i = 0;
        while (true) {
            gy1[] gy1VarArr = this.f9215b;
            if (i >= gy1VarArr.length) {
                return;
            }
            gy1VarArr[i].h();
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.fy1
    public final void i(gy1 gy1Var) {
        gy1[] gy1VarArr;
        ArrayList arrayList = this.f9218e;
        arrayList.remove(gy1Var);
        if (arrayList.isEmpty()) {
            int i = 0;
            int i10 = 0;
            while (true) {
                gy1VarArr = this.f9215b;
                if (i >= gy1VarArr.length) {
                    break;
                }
                i10 += gy1VarArr[i].g().f8055a;
                i++;
            }
            pi[] piVarArr = new pi[i10];
            int i11 = 0;
            for (int i12 = 0; i12 < gy1VarArr.length; i12++) {
                mz1 mz1VarG = gy1VarArr[i12].g();
                int i13 = mz1VarG.f8055a;
                int i14 = 0;
                while (i14 < i13) {
                    pi piVarA = mz1VarG.a(i14);
                    int i15 = piVarA.f9070a;
                    jx1[] jx1VarArr = new jx1[i15];
                    int i16 = 0;
                    while (i16 < i15) {
                        jx1 jx1Var = piVarA.f9073d[i16];
                        jx1Var.getClass();
                        ow1 ow1Var = new ow1(jx1Var);
                        String str = jx1Var.f6964a;
                        if (str == null) {
                            str = "";
                        }
                        gy1[] gy1VarArr2 = gy1VarArr;
                        StringBuilder sb2 = new StringBuilder(str.length() + pe.a.a(i12, 1));
                        sb2.append(i12);
                        sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
                        sb2.append(str);
                        ow1Var.f8822a = sb2.toString();
                        jx1VarArr[i16] = new jx1(ow1Var);
                        i16++;
                        gy1VarArr = gy1VarArr2;
                    }
                    gy1[] gy1VarArr3 = gy1VarArr;
                    String str2 = piVarA.f9071b;
                    StringBuilder sb3 = new StringBuilder(pe.a.a(i12, 1) + String.valueOf(str2).length());
                    sb3.append(i12);
                    sb3.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
                    sb3.append(str2);
                    pi piVar = new pi(sb3.toString(), jx1VarArr);
                    this.f9219f.put(piVar, piVarA);
                    piVarArr[i11] = piVar;
                    i14++;
                    i11++;
                    gy1VarArr = gy1VarArr3;
                }
            }
            this.f9221h = new mz1(piVarArr);
            fy1 fy1Var = this.f9220g;
            fy1Var.getClass();
            fy1Var.i(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.hz1
    public final boolean j(yt1 yt1Var) {
        ArrayList arrayList = this.f9218e;
        if (arrayList.isEmpty()) {
            return this.f9222j.j(yt1Var);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((gy1) arrayList.get(i)).j(yt1Var);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.gy1
    public final long k(long j10) {
        long jK = this.i[0].k(j10);
        int i = 1;
        while (true) {
            gy1[] gy1VarArr = this.i;
            if (i >= gy1VarArr.length) {
                return jK;
            }
            if (gy1VarArr[i].k(jK) != jK) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.gy1
    public final void l(fy1 fy1Var, long j10) {
        this.f9220g = fy1Var;
        ArrayList arrayList = this.f9218e;
        gy1[] gy1VarArr = this.f9215b;
        Collections.addAll(arrayList, gy1VarArr);
        for (gy1 gy1Var : gy1VarArr) {
            gy1Var.l(this, j10);
        }
    }

    @Override // com.google.android.gms.internal.ads.gy1
    public final long m() {
        long j10 = -9223372036854775807L;
        for (gy1 gy1Var : this.i) {
            long jM = gy1Var.m();
            if (jM == -9223372036854775807L) {
                if (j10 != -9223372036854775807L && gy1Var.k(j10) != j10) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j10 == -9223372036854775807L) {
                for (gy1 gy1Var2 : this.i) {
                    if (gy1Var2 == gy1Var) {
                        break;
                    }
                    if (gy1Var2.k(jM) != jM) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j10 = jM;
            } else if (jM != j10) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.hz1
    public final void n(long j10) {
        this.f9222j.n(j10);
    }

    @Override // com.google.android.gms.internal.ads.hz1
    public final boolean q() {
        return this.f9222j.q();
    }
}
