package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.ads.om1;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j4 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final j4 f14219f = new j4(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f14221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f14222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14223d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f14224e;

    public j4(int i, int[] iArr, Object[] objArr, boolean z5) {
        this.f14220a = i;
        this.f14221b = iArr;
        this.f14222c = objArr;
        this.f14224e = z5;
    }

    public static j4 b() {
        return new j4(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int iE0;
        int iO;
        int iE02;
        int i = this.f14223d;
        if (i != -1) {
            return i;
        }
        int iB = 0;
        for (int i10 = 0; i10 < this.f14220a; i10++) {
            int i11 = this.f14221b[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 != 0) {
                if (i13 == 1) {
                    ((Long) this.f14222c[i10]).getClass();
                    iE02 = x2.e0(i12 << 3) + 8;
                } else if (i13 == 2) {
                    int i14 = i12 << 3;
                    w2 w2Var = (w2) this.f14222c[i10];
                    int iE03 = x2.e0(i14);
                    int iE = w2Var.e();
                    iB = om1.B(iE, iE, iE03, iB);
                } else if (i13 == 3) {
                    int iE04 = x2.e0(i12 << 3);
                    iE0 = iE04 + iE04;
                    iO = ((j4) this.f14222c[i10]).a();
                } else {
                    if (i13 != 5) {
                        throw new IllegalStateException(new m3());
                    }
                    ((Integer) this.f14222c[i10]).getClass();
                    iE02 = x2.e0(i12 << 3) + 4;
                }
                iB = iE02 + iB;
            } else {
                int i15 = i12 << 3;
                long jLongValue = ((Long) this.f14222c[i10]).longValue();
                iE0 = x2.e0(i15);
                iO = x2.O(jLongValue);
            }
            iB = iO + iE0 + iB;
        }
        this.f14223d = iB;
        return iB;
    }

    public final void c(int i, Object obj) {
        if (!this.f14224e) {
            throw new UnsupportedOperationException();
        }
        e(this.f14220a + 1);
        int[] iArr = this.f14221b;
        int i10 = this.f14220a;
        iArr[i10] = i;
        this.f14222c[i10] = obj;
        this.f14220a = i10 + 1;
    }

    public final void d(t3 t3Var) throws androidx.datastore.preferences.protobuf.m {
        if (this.f14220a != 0) {
            for (int i = 0; i < this.f14220a; i++) {
                int i10 = this.f14221b[i];
                Object obj = this.f14222c[i];
                int i11 = i10 & 7;
                int i12 = i10 >>> 3;
                if (i11 == 0) {
                    ((x2) t3Var.f14315a).b0(i12, ((Long) obj).longValue());
                } else if (i11 == 1) {
                    ((x2) t3Var.f14315a).T(i12, ((Long) obj).longValue());
                } else if (i11 == 2) {
                    ((x2) t3Var.f14315a).Q(i12, (w2) obj);
                } else if (i11 == 3) {
                    ((x2) t3Var.f14315a).Y(i12, 3);
                    ((j4) obj).d(t3Var);
                    ((x2) t3Var.f14315a).Y(i12, 4);
                } else {
                    if (i11 != 5) {
                        throw new RuntimeException(new m3());
                    }
                    ((x2) t3Var.f14315a).R(i12, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final void e(int i) {
        int[] iArr = this.f14221b;
        if (i > iArr.length) {
            int i10 = this.f14220a;
            int i11 = (i10 / 2) + i10;
            if (i11 >= i) {
                i = i11;
            }
            if (i < 8) {
                i = 8;
            }
            this.f14221b = Arrays.copyOf(iArr, i);
            this.f14222c = Arrays.copyOf(this.f14222c, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof j4)) {
            return false;
        }
        j4 j4Var = (j4) obj;
        int i = this.f14220a;
        if (i == j4Var.f14220a) {
            int[] iArr = this.f14221b;
            int[] iArr2 = j4Var.f14221b;
            int i10 = 0;
            while (true) {
                if (i10 >= i) {
                    Object[] objArr = this.f14222c;
                    Object[] objArr2 = j4Var.f14222c;
                    int i11 = this.f14220a;
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
        int i = this.f14220a;
        int i10 = i + 527;
        int[] iArr = this.f14221b;
        int iHashCode = 17;
        int i11 = 17;
        for (int i12 = 0; i12 < i; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        int i13 = ((i10 * 31) + i11) * 31;
        Object[] objArr = this.f14222c;
        int i14 = this.f14220a;
        for (int i15 = 0; i15 < i14; i15++) {
            iHashCode = (iHashCode * 31) + objArr[i15].hashCode();
        }
        return i13 + iHashCode;
    }
}
