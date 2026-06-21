package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ep1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ep1 f5026f = new ep1(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f5028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f5029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5030d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5031e;

    public ep1(int i, int[] iArr, Object[] objArr, boolean z5) {
        this.f5027a = i;
        this.f5028b = iArr;
        this.f5029c = objArr;
        this.f5031e = z5;
    }

    public static ep1 a() {
        return new ep1(0, new int[8], new Object[8], true);
    }

    public final void b(pp0 pp0Var) {
        hn1 hn1Var = (hn1) pp0Var.f9149c;
        if (this.f5027a != 0) {
            for (int i = 0; i < this.f5027a; i++) {
                int i10 = this.f5028b[i];
                Object obj = this.f5029c[i];
                int i11 = i10 & 7;
                int i12 = i10 >>> 3;
                if (i11 == 0) {
                    hn1Var.U(i12, ((Long) obj).longValue());
                } else if (i11 == 1) {
                    hn1Var.W(i12, ((Long) obj).longValue());
                } else if (i11 == 2) {
                    hn1Var.Z(i12, (bn1) obj);
                } else if (i11 == 3) {
                    hn1Var.Q(i12, 3);
                    ((ep1) obj).b(pp0Var);
                    hn1Var.Q(i12, 4);
                } else {
                    if (i11 != 5) {
                        throw new RuntimeException(new bo1());
                    }
                    hn1Var.T(i12, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int c() {
        int iN;
        int iO;
        int iN2;
        int i = this.f5030d;
        if (i != -1) {
            return i;
        }
        int iF = 0;
        for (int i10 = 0; i10 < this.f5027a; i10++) {
            int i11 = this.f5028b[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 != 0) {
                if (i13 == 1) {
                    ((Long) this.f5029c[i10]).getClass();
                    iN2 = hn1.N(i12 << 3) + 8;
                } else if (i13 == 2) {
                    int i14 = i12 << 3;
                    bn1 bn1Var = (bn1) this.f5029c[i10];
                    int iN3 = hn1.N(i14);
                    int iN4 = bn1Var.n();
                    iF = om1.f(iN4, iN4, iN3, iF);
                } else if (i13 == 3) {
                    int iN5 = hn1.N(i12 << 3);
                    iN = iN5 + iN5;
                    iO = ((ep1) this.f5029c[i10]).c();
                } else {
                    if (i13 != 5) {
                        throw new IllegalStateException(new bo1());
                    }
                    ((Integer) this.f5029c[i10]).getClass();
                    iN2 = hn1.N(i12 << 3) + 4;
                }
                iF = iN2 + iF;
            } else {
                int i15 = i12 << 3;
                long jLongValue = ((Long) this.f5029c[i10]).longValue();
                iN = hn1.N(i15);
                iO = hn1.O(jLongValue);
            }
            iF = iO + iN + iF;
        }
        this.f5030d = iF;
        return iF;
    }

    public final void d(int i, Object obj) {
        if (!this.f5031e) {
            throw new UnsupportedOperationException();
        }
        e(this.f5027a + 1);
        int[] iArr = this.f5028b;
        int i10 = this.f5027a;
        iArr[i10] = i;
        this.f5029c[i10] = obj;
        this.f5027a = i10 + 1;
    }

    public final void e(int i) {
        int[] iArr = this.f5028b;
        if (i > iArr.length) {
            int i10 = this.f5027a;
            int i11 = (i10 / 2) + i10;
            if (i11 >= i) {
                i = i11;
            }
            if (i < 8) {
                i = 8;
            }
            this.f5028b = Arrays.copyOf(iArr, i);
            this.f5029c = Arrays.copyOf(this.f5029c, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ep1)) {
            return false;
        }
        ep1 ep1Var = (ep1) obj;
        int i = this.f5027a;
        if (i == ep1Var.f5027a) {
            int[] iArr = this.f5028b;
            int[] iArr2 = ep1Var.f5028b;
            int i10 = 0;
            while (true) {
                if (i10 >= i) {
                    Object[] objArr = this.f5029c;
                    Object[] objArr2 = ep1Var.f5029c;
                    int i11 = this.f5027a;
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
        int i = this.f5027a;
        int i10 = i + 527;
        int[] iArr = this.f5028b;
        int iHashCode = 17;
        int i11 = 17;
        for (int i12 = 0; i12 < i; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        int i13 = ((i10 * 31) + i11) * 31;
        Object[] objArr = this.f5029c;
        int i14 = this.f5027a;
        for (int i15 = 0; i15 < i14; i15++) {
            iHashCode = (iHashCode * 31) + objArr[i15].hashCode();
        }
        return i13 + iHashCode;
    }
}
