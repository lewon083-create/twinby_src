package me;

import java.io.Serializable;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Serializable f28896b;

    public t(Boolean bool) {
        bool.getClass();
        this.f28896b = bool;
    }

    public static boolean n(t tVar) {
        Serializable serializable = tVar.f28896b;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override // me.p
    public final long c() {
        return this.f28896b instanceof Number ? g().longValue() : Long.parseLong(e());
    }

    @Override // me.p
    public final String e() {
        Serializable serializable = this.f28896b;
        return serializable instanceof Number ? g().toString() : serializable instanceof Boolean ? ((Boolean) serializable).toString() : (String) serializable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t.class != obj.getClass()) {
            return false;
        }
        t tVar = (t) obj;
        Serializable serializable = tVar.f28896b;
        Serializable serializable2 = this.f28896b;
        if (serializable2 == null) {
            return serializable == null;
        }
        if (n(this) && n(tVar)) {
            return g().longValue() == tVar.g().longValue();
        }
        if (!(serializable2 instanceof Number) || !(serializable instanceof Number)) {
            return serializable2.equals(serializable);
        }
        double dDoubleValue = g().doubleValue();
        double dDoubleValue2 = tVar.g().doubleValue();
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    public final boolean f() {
        Serializable serializable = this.f28896b;
        return serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(e());
    }

    public final Number g() {
        Serializable serializable = this.f28896b;
        return serializable instanceof String ? new oe.g((String) serializable) : (Number) serializable;
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        Serializable serializable = this.f28896b;
        if (serializable == null) {
            return 31;
        }
        if (n(this)) {
            jDoubleToLongBits = g().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(g().doubleValue());
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public t(Number number) {
        number.getClass();
        this.f28896b = number;
    }

    public t(String str) {
        str.getClass();
        this.f28896b = str;
    }
}
