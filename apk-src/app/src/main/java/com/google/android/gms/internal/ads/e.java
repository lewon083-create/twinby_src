package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pi f4773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f4775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final jx1[] f4776d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4777e;

    public e(pi piVar, int[] iArr) {
        int length = iArr.length;
        ix.k0(length > 0);
        piVar.getClass();
        jx1[] jx1VarArr = piVar.f9073d;
        this.f4773a = piVar;
        this.f4774b = length;
        this.f4776d = new jx1[length];
        for (int i = 0; i < iArr.length; i++) {
            this.f4776d[i] = jx1VarArr[iArr[i]];
        }
        Arrays.sort(this.f4776d, v.f11148h);
        this.f4775c = new int[this.f4774b];
        for (int i10 = 0; i10 < this.f4774b; i10++) {
            int[] iArr2 = this.f4775c;
            jx1 jx1Var = this.f4776d[i10];
            int i11 = 0;
            while (true) {
                if (i11 >= jx1VarArr.length) {
                    i11 = -1;
                    break;
                } else if (jx1Var == jx1VarArr[i11]) {
                    break;
                } else {
                    i11++;
                }
            }
            iArr2[i10] = i11;
        }
    }

    public static void a(ArrayList arrayList, long[] jArr) {
        long j10 = 0;
        for (int i = 0; i < 2; i++) {
            j10 += jArr[i];
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            u41 u41Var = (u41) arrayList.get(i10);
            if (u41Var != null) {
                u41Var.a(new oz1(j10, jArr[i10]));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.d
    public final int O(int i) {
        for (int i10 = 0; i10 < this.f4774b; i10++) {
            if (this.f4775c[i10] == i) {
                return i10;
            }
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            e eVar = (e) obj;
            if (this.f4773a.equals(eVar.f4773a) && Arrays.equals(this.f4775c, eVar.f4775c)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.d
    public final pi h() {
        return this.f4773a;
    }

    public final int hashCode() {
        int i = this.f4777e;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.f4775c) + (System.identityHashCode(this.f4773a) * 31);
        this.f4777e = iHashCode;
        return iHashCode;
    }

    @Override // com.google.android.gms.internal.ads.d
    public final int i() {
        return this.f4775c.length;
    }

    @Override // com.google.android.gms.internal.ads.d
    public final jx1 l() {
        return this.f4776d[0];
    }

    @Override // com.google.android.gms.internal.ads.d
    public final int m() {
        return this.f4775c[0];
    }

    @Override // com.google.android.gms.internal.ads.d
    public final int t(int i) {
        return this.f4775c[i];
    }

    @Override // com.google.android.gms.internal.ads.d
    public final jx1 u(int i) {
        return this.f4776d[i];
    }
}
