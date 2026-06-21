package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o4 extends l4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f8605e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f8606f;

    public o4(int i, int i10, int i11, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f8602b = i;
        this.f8603c = i10;
        this.f8604d = i11;
        this.f8605e = iArr;
        this.f8606f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o4.class == obj.getClass()) {
            o4 o4Var = (o4) obj;
            if (this.f8602b == o4Var.f8602b && this.f8603c == o4Var.f8603c && this.f8604d == o4Var.f8604d && Arrays.equals(this.f8605e, o4Var.f8605e) && Arrays.equals(this.f8606f, o4Var.f8606f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f8606f) + ((Arrays.hashCode(this.f8605e) + ((((((this.f8602b + 527) * 31) + this.f8603c) * 31) + this.f8604d) * 31)) * 31);
    }
}
