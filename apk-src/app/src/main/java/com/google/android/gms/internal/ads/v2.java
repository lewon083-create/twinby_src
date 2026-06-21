package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f11210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11212d;

    public v2(int i, int i10, int i11, byte[] bArr) {
        this.f11209a = i;
        this.f11210b = bArr;
        this.f11211c = i10;
        this.f11212d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v2.class == obj.getClass()) {
            v2 v2Var = (v2) obj;
            if (this.f11209a == v2Var.f11209a && this.f11211c == v2Var.f11211c && this.f11212d == v2Var.f11212d && Arrays.equals(this.f11210b, v2Var.f11210b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f11210b) + (this.f11209a * 31)) * 31) + this.f11211c) * 31) + this.f11212d;
    }
}
