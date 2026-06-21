package com.google.android.gms.internal.ads;

import java.math.BigDecimal;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class oc1 extends Number {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8665b;

    public oc1(String str) {
        this.f8665b = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f8665b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof oc1) {
            return this.f8665b.equals(((oc1) obj).f8665b);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f8665b);
    }

    public final int hashCode() {
        return this.f8665b.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f8665b;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return new BigDecimal(str).intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(str);
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f8665b;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return new BigDecimal(str).longValue();
        }
    }

    public final String toString() {
        return this.f8665b;
    }
}
