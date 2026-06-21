package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.om1;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q6 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final q6 f13926f = new q6(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f13928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f13929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13930d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13931e;

    public q6(int i, int[] iArr, Object[] objArr, boolean z5) {
        this.f13927a = i;
        this.f13928b = iArr;
        this.f13929c = objArr;
        this.f13931e = z5;
    }

    public static q6 a() {
        return new q6(0, new int[8], new Object[8], true);
    }

    public final void b(z5 z5Var) throws androidx.datastore.preferences.protobuf.m {
        if (this.f13927a != 0) {
            for (int i = 0; i < this.f13927a; i++) {
                int i10 = this.f13928b[i];
                Object obj = this.f13929c[i];
                int i11 = i10 & 7;
                int i12 = i10 >>> 3;
                if (i11 == 0) {
                    ((a5) z5Var.f14118a).A(i12, ((Long) obj).longValue());
                } else if (i11 == 1) {
                    ((a5) z5Var.f14118a).B(i12, ((Long) obj).longValue());
                } else if (i11 == 2) {
                    ((a5) z5Var.f14118a).C(i12, (z4) obj);
                } else if (i11 == 3) {
                    ((a5) z5Var.f14118a).w(i12, 3);
                    ((q6) obj).b(z5Var);
                    ((a5) z5Var.f14118a).w(i12, 4);
                } else {
                    if (i11 != 5) {
                        throw new RuntimeException(new s5());
                    }
                    ((a5) z5Var.f14118a).z(i12, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int c() {
        int iM;
        int iU;
        int iM2;
        int i = this.f13930d;
        if (i != -1) {
            return i;
        }
        int iZ = 0;
        for (int i10 = 0; i10 < this.f13927a; i10++) {
            int i11 = this.f13928b[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 != 0) {
                if (i13 == 1) {
                    ((Long) this.f13929c[i10]).getClass();
                    iM2 = a5.M(i12 << 3) + 8;
                } else if (i13 == 2) {
                    int i14 = i12 << 3;
                    z4 z4Var = (z4) this.f13929c[i10];
                    int iM3 = a5.M(i14);
                    int iE = z4Var.e();
                    iZ = om1.z(iE, iE, iM3, iZ);
                } else if (i13 == 3) {
                    int iM4 = a5.M(i12 << 3);
                    iM = iM4 + iM4;
                    iU = ((q6) this.f13929c[i10]).c();
                } else {
                    if (i13 != 5) {
                        throw new IllegalStateException(new s5());
                    }
                    ((Integer) this.f13929c[i10]).getClass();
                    iM2 = a5.M(i12 << 3) + 4;
                }
                iZ = iM2 + iZ;
            } else {
                int i15 = i12 << 3;
                long jLongValue = ((Long) this.f13929c[i10]).longValue();
                iM = a5.M(i15);
                iU = a5.u(jLongValue);
            }
            iZ = iU + iM + iZ;
        }
        this.f13930d = iZ;
        return iZ;
    }

    public final void d(int i, Object obj) {
        if (!this.f13931e) {
            throw new UnsupportedOperationException();
        }
        e(this.f13927a + 1);
        int[] iArr = this.f13928b;
        int i10 = this.f13927a;
        iArr[i10] = i;
        this.f13929c[i10] = obj;
        this.f13927a = i10 + 1;
    }

    public final void e(int i) {
        int[] iArr = this.f13928b;
        if (i > iArr.length) {
            int i10 = this.f13927a;
            int i11 = (i10 / 2) + i10;
            if (i11 >= i) {
                i = i11;
            }
            if (i < 8) {
                i = 8;
            }
            this.f13928b = Arrays.copyOf(iArr, i);
            this.f13929c = Arrays.copyOf(this.f13929c, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof q6)) {
            return false;
        }
        q6 q6Var = (q6) obj;
        int i = this.f13927a;
        if (i == q6Var.f13927a) {
            int[] iArr = this.f13928b;
            int[] iArr2 = q6Var.f13928b;
            int i10 = 0;
            while (true) {
                if (i10 >= i) {
                    Object[] objArr = this.f13929c;
                    Object[] objArr2 = q6Var.f13929c;
                    int i11 = this.f13927a;
                    for (int i12 = 0; i12 < i11; i12++) {
                        if (objArr[i12].equals(objArr2[i12])) {
                        }
                    }
                    return true;
                }
                if (iArr[i10] != iArr2[i10]) {
                    break;
                }
                i10++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f13927a;
        int i10 = i + 527;
        int[] iArr = this.f13928b;
        int iHashCode = 17;
        int i11 = 17;
        for (int i12 = 0; i12 < i; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        int i13 = ((i10 * 31) + i11) * 31;
        Object[] objArr = this.f13929c;
        int i14 = this.f13927a;
        for (int i15 = 0; i15 < i14; i15++) {
            iHashCode = (iHashCode * 31) + objArr[i15].hashCode();
        }
        return i13 + iHashCode;
    }
}
