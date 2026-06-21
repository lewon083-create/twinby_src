package com.google.android.gms.internal.auth;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n1 f13263e = new n1(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f13265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f13266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13267d;

    public n1(int i, int[] iArr, Object[] objArr, boolean z5) {
        this.f13264a = i;
        this.f13265b = iArr;
        this.f13266c = objArr;
        this.f13267d = z5;
    }

    public static n1 a() {
        return new n1(0, new int[8], new Object[8], true);
    }

    public final void b(int i, Object obj) {
        if (!this.f13267d) {
            throw new UnsupportedOperationException();
        }
        c(this.f13264a + 1);
        int[] iArr = this.f13265b;
        int i10 = this.f13264a;
        iArr[i10] = i;
        this.f13266c[i10] = obj;
        this.f13264a = i10 + 1;
    }

    public final void c(int i) {
        int[] iArr = this.f13265b;
        if (i > iArr.length) {
            int i10 = this.f13264a;
            int i11 = (i10 / 2) + i10;
            if (i11 >= i) {
                i = i11;
            }
            if (i < 8) {
                i = 8;
            }
            this.f13265b = Arrays.copyOf(iArr, i);
            this.f13266c = Arrays.copyOf(this.f13266c, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        int i = this.f13264a;
        if (i == n1Var.f13264a) {
            int[] iArr = this.f13265b;
            int[] iArr2 = n1Var.f13265b;
            int i10 = 0;
            while (true) {
                if (i10 >= i) {
                    Object[] objArr = this.f13266c;
                    Object[] objArr2 = n1Var.f13266c;
                    int i11 = this.f13264a;
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
        int i = this.f13264a;
        int i10 = i + 527;
        int[] iArr = this.f13265b;
        int iHashCode = 17;
        int i11 = 17;
        for (int i12 = 0; i12 < i; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        int i13 = (i10 * 31) + i11;
        Object[] objArr = this.f13266c;
        int i14 = this.f13264a;
        for (int i15 = 0; i15 < i14; i15++) {
            iHashCode = (iHashCode * 31) + objArr[i15].hashCode();
        }
        return (i13 * 31) + iHashCode;
    }
}
