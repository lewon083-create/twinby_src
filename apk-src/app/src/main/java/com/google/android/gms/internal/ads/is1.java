package com.google.android.gms.internal.ads;

import com.yandex.varioqub.config.model.ConfigValue;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class is1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final is1 f6591j = new is1(1.0d, ConfigValue.DOUBLE_DEFAULT_VALUE, ConfigValue.DOUBLE_DEFAULT_VALUE, 1.0d, ConfigValue.DOUBLE_DEFAULT_VALUE, ConfigValue.DOUBLE_DEFAULT_VALUE, 1.0d, ConfigValue.DOUBLE_DEFAULT_VALUE, ConfigValue.DOUBLE_DEFAULT_VALUE);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final is1 f6592k = new is1(ConfigValue.DOUBLE_DEFAULT_VALUE, 1.0d, -1.0d, ConfigValue.DOUBLE_DEFAULT_VALUE, ConfigValue.DOUBLE_DEFAULT_VALUE, ConfigValue.DOUBLE_DEFAULT_VALUE, 1.0d, ConfigValue.DOUBLE_DEFAULT_VALUE, ConfigValue.DOUBLE_DEFAULT_VALUE);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final is1 f6593l = new is1(-1.0d, ConfigValue.DOUBLE_DEFAULT_VALUE, ConfigValue.DOUBLE_DEFAULT_VALUE, -1.0d, ConfigValue.DOUBLE_DEFAULT_VALUE, ConfigValue.DOUBLE_DEFAULT_VALUE, 1.0d, ConfigValue.DOUBLE_DEFAULT_VALUE, ConfigValue.DOUBLE_DEFAULT_VALUE);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final is1 f6594m = new is1(ConfigValue.DOUBLE_DEFAULT_VALUE, -1.0d, 1.0d, ConfigValue.DOUBLE_DEFAULT_VALUE, ConfigValue.DOUBLE_DEFAULT_VALUE, ConfigValue.DOUBLE_DEFAULT_VALUE, 1.0d, ConfigValue.DOUBLE_DEFAULT_VALUE, ConfigValue.DOUBLE_DEFAULT_VALUE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f6595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f6596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f6597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f6598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f6599e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f6600f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f6601g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final double f6602h;
    public final double i;

    public is1(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
        this.f6595a = d14;
        this.f6596b = d15;
        this.f6597c = d16;
        this.f6598d = d10;
        this.f6599e = d11;
        this.f6600f = d12;
        this.f6601g = d13;
        this.f6602h = d17;
        this.i = d18;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || is1.class != obj.getClass()) {
            return false;
        }
        is1 is1Var = (is1) obj;
        return Double.compare(is1Var.f6598d, this.f6598d) == 0 && Double.compare(is1Var.f6599e, this.f6599e) == 0 && Double.compare(is1Var.f6600f, this.f6600f) == 0 && Double.compare(is1Var.f6601g, this.f6601g) == 0 && Double.compare(is1Var.f6602h, this.f6602h) == 0 && Double.compare(is1Var.i, this.i) == 0 && Double.compare(is1Var.f6595a, this.f6595a) == 0 && Double.compare(is1Var.f6596b, this.f6596b) == 0 && Double.compare(is1Var.f6597c, this.f6597c) == 0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f6595a);
        long j10 = jDoubleToLongBits ^ (jDoubleToLongBits >>> 32);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f6596b);
        long j11 = jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32);
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.f6597c);
        long j12 = jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32);
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.f6598d);
        long j13 = jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32);
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.f6599e);
        long j14 = jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32);
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.f6600f);
        long j15 = jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32);
        long jDoubleToLongBits7 = Double.doubleToLongBits(this.f6601g);
        long jDoubleToLongBits8 = Double.doubleToLongBits(this.f6602h);
        long j16 = jDoubleToLongBits8 ^ (jDoubleToLongBits8 >>> 32);
        long jDoubleToLongBits9 = Double.doubleToLongBits(this.i);
        return (((((((((((((((((int) j10) * 31) + ((int) j11)) * 31) + ((int) j12)) * 31) + ((int) j13)) * 31) + ((int) j14)) * 31) + ((int) j15)) * 31) + ((int) (jDoubleToLongBits7 ^ (jDoubleToLongBits7 >>> 32)))) * 31) + ((int) j16)) * 31) + ((int) (jDoubleToLongBits9 ^ (jDoubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(f6591j)) {
            return "Rotate 0°";
        }
        if (equals(f6592k)) {
            return "Rotate 90°";
        }
        if (equals(f6593l)) {
            return "Rotate 180°";
        }
        if (equals(f6594m)) {
            return "Rotate 270°";
        }
        StringBuilder sb2 = new StringBuilder(260);
        sb2.append("Matrix{u=");
        sb2.append(this.f6595a);
        sb2.append(", v=");
        sb2.append(this.f6596b);
        sb2.append(", w=");
        sb2.append(this.f6597c);
        sb2.append(", a=");
        sb2.append(this.f6598d);
        sb2.append(", b=");
        sb2.append(this.f6599e);
        sb2.append(", c=");
        sb2.append(this.f6600f);
        sb2.append(", d=");
        sb2.append(this.f6601g);
        sb2.append(", tx=");
        sb2.append(this.f6602h);
        sb2.append(", ty=");
        sb2.append(this.i);
        sb2.append("}");
        return sb2.toString();
    }
}
