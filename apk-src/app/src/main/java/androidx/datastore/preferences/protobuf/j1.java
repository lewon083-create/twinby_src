package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final j1 f1426f = new j1(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f1428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f1429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1430d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1431e;

    public j1(int i, int[] iArr, Object[] objArr, boolean z5) {
        this.f1427a = i;
        this.f1428b = iArr;
        this.f1429c = objArr;
        this.f1431e = z5;
    }

    public final void a(int i) {
        int[] iArr = this.f1428b;
        if (i > iArr.length) {
            int i10 = this.f1427a;
            int i11 = (i10 / 2) + i10;
            if (i11 >= i) {
                i = i11;
            }
            if (i < 8) {
                i = 8;
            }
            this.f1428b = Arrays.copyOf(iArr, i);
            this.f1429c = Arrays.copyOf(this.f1429c, i);
        }
    }

    public final int b() {
        int iR;
        int iT;
        int iR2;
        int i = this.f1430d;
        if (i != -1) {
            return i;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f1427a; i11++) {
            int i12 = this.f1428b[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 != 0) {
                if (i14 == 1) {
                    ((Long) this.f1429c[i11]).getClass();
                    iR2 = n.R(i13) + 8;
                } else if (i14 == 2) {
                    iR2 = n.P(i13, (h) this.f1429c[i11]);
                } else if (i14 == 3) {
                    iR = n.R(i13) * 2;
                    iT = ((j1) this.f1429c[i11]).b();
                } else {
                    if (i14 != 5) {
                        throw new IllegalStateException(e0.b());
                    }
                    ((Integer) this.f1429c[i11]).getClass();
                    iR2 = n.R(i13) + 4;
                }
                i10 = iR2 + i10;
            } else {
                long jLongValue = ((Long) this.f1429c[i11]).longValue();
                iR = n.R(i13);
                iT = n.T(jLongValue);
            }
            i10 = iT + iR + i10;
        }
        this.f1430d = i10;
        return i10;
    }

    public final void c(int i, Object obj) {
        if (!this.f1431e) {
            throw new UnsupportedOperationException();
        }
        a(this.f1427a + 1);
        int[] iArr = this.f1428b;
        int i10 = this.f1427a;
        iArr[i10] = i;
        this.f1429c[i10] = obj;
        this.f1427a = i10 + 1;
    }

    public final void d(l0 l0Var) {
        if (this.f1427a == 0) {
            return;
        }
        l0Var.getClass();
        n nVar = (n) l0Var.f1440a;
        for (int i = 0; i < this.f1427a; i++) {
            int i10 = this.f1428b[i];
            Object obj = this.f1429c[i];
            int i11 = i10 >>> 3;
            int i12 = i10 & 7;
            if (i12 == 0) {
                nVar.n0(i11, ((Long) obj).longValue());
            } else if (i12 == 1) {
                nVar.d0(i11, ((Long) obj).longValue());
            } else if (i12 == 2) {
                nVar.Z(i11, (h) obj);
            } else if (i12 == 3) {
                nVar.k0(i11, 3);
                ((j1) obj).d(l0Var);
                nVar.k0(i11, 4);
            } else {
                if (i12 != 5) {
                    throw new RuntimeException(e0.b());
                }
                nVar.b0(i11, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        int i = this.f1427a;
        if (i == j1Var.f1427a) {
            int[] iArr = this.f1428b;
            int[] iArr2 = j1Var.f1428b;
            int i10 = 0;
            while (true) {
                if (i10 >= i) {
                    Object[] objArr = this.f1429c;
                    Object[] objArr2 = j1Var.f1429c;
                    int i11 = this.f1427a;
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
        int i = this.f1427a;
        int i10 = (527 + i) * 31;
        int[] iArr = this.f1428b;
        int iHashCode = 17;
        int i11 = 17;
        for (int i12 = 0; i12 < i; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        int i13 = (i10 + i11) * 31;
        Object[] objArr = this.f1429c;
        int i14 = this.f1427a;
        for (int i15 = 0; i15 < i14; i15++) {
            iHashCode = (iHashCode * 31) + objArr[i15].hashCode();
        }
        return i13 + iHashCode;
    }
}
