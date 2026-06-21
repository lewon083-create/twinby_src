package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class bm1 extends Number {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3833b;

    public bm1(String str) {
        this.f3833b = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f3833b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bm1) {
            return this.f3833b.equals(((bm1) obj).f3833b);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f3833b);
    }

    public final int hashCode() {
        return this.f3833b.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f3833b;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return fs1.g(str).intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(str);
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f3833b;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return fs1.g(str).longValue();
        }
    }

    public final String toString() {
        return this.f3833b;
    }
}
