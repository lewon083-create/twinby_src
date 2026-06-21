package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class t61 implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t61 f10511d = new t61(0, new int[0]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f10512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10513c;

    public t61(int i, int[] iArr) {
        this.f10512b = iArr;
        this.f10513c = i;
    }

    public final boolean equals(Object obj) {
        t61 t61Var;
        int i;
        int i10;
        if (obj == this) {
            return true;
        }
        if ((obj instanceof t61) && (i10 = this.f10513c) == (i = (t61Var = (t61) obj).f10513c)) {
            for (int i11 = 0; i11 < i10; i11++) {
                ix.n0(i11, i10);
                int i12 = this.f10512b[i11];
                ix.n0(i11, i);
                if (i12 == t61Var.f10512b[i11]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 1;
        for (int i = 0; i < this.f10513c; i++) {
            iHashCode = (iHashCode * 31) + Integer.hashCode(this.f10512b[i]);
        }
        return iHashCode;
    }

    public final String toString() {
        int i = this.f10513c;
        if (i == 0) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder(i * 5);
        sb2.append('[');
        int[] iArr = this.f10512b;
        sb2.append(iArr[0]);
        for (int i10 = 1; i10 < i; i10++) {
            sb2.append(", ");
            sb2.append(iArr[i10]);
        }
        sb2.append(']');
        return sb2.toString();
    }
}
