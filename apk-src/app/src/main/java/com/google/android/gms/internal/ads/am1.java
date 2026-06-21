package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class am1 extends wl1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Serializable f3324b;

    public am1(oc1 oc1Var) {
        this.f3324b = oc1Var;
    }

    public static boolean n(am1 am1Var) {
        Serializable serializable = am1Var.f3324b;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override // com.google.android.gms.internal.ads.wl1
    public final String a() {
        Serializable serializable = this.f3324b;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return f().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: ".concat(String.valueOf(serializable.getClass())));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || am1.class != obj.getClass()) {
            return false;
        }
        am1 am1Var = (am1) obj;
        Serializable serializable = am1Var.f3324b;
        Serializable serializable2 = this.f3324b;
        if (serializable2 == null) {
            return serializable == null;
        }
        if (n(this) && n(am1Var)) {
            return ((serializable2 instanceof BigInteger) || (serializable instanceof BigInteger)) ? g().equals(am1Var.g()) : f().longValue() == am1Var.f().longValue();
        }
        if (!(serializable2 instanceof Number) || !(serializable instanceof Number)) {
            return serializable2.equals(serializable);
        }
        if ((serializable2 instanceof BigDecimal) && (serializable instanceof BigDecimal)) {
            return (serializable2 instanceof BigDecimal ? (BigDecimal) serializable2 : fs1.g(a())).compareTo(serializable instanceof BigDecimal ? (BigDecimal) serializable : fs1.g(am1Var.a())) == 0;
        }
        double dDoubleValue = serializable2 instanceof Number ? f().doubleValue() : Double.parseDouble(a());
        double dDoubleValue2 = serializable instanceof Number ? am1Var.f().doubleValue() : Double.parseDouble(am1Var.a());
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    public final Number f() {
        Serializable serializable = this.f3324b;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new bm1((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public final BigInteger g() {
        Serializable serializable = this.f3324b;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (n(this)) {
            return BigInteger.valueOf(f().longValue());
        }
        String strA = a();
        fs1.G(strA);
        return new BigInteger(strA);
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        Serializable serializable = this.f3324b;
        if (serializable == null) {
            return 31;
        }
        if (n(this)) {
            jDoubleToLongBits = f().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(f().doubleValue());
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public am1(Boolean bool) {
        this.f3324b = bool;
    }

    public am1(String str) {
        this.f3324b = str;
    }
}
