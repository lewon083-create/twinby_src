package com.google.android.gms.internal.measurement;

import com.yandex.varioqub.config.model.ConfigValue;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f13750b;

    public g(Double d10) {
        if (d10 == null) {
            this.f13750b = Double.valueOf(Double.NaN);
        } else {
            this.f13750b = d10;
        }
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n B() {
        return new g(this.f13750b);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator c() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n e(String str, com.google.firebase.messaging.y yVar, ArrayList arrayList) {
        if ("toString".equals(str)) {
            return new q(l());
        }
        throw new IllegalArgumentException(l() + "." + str + " is not a function.");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            return this.f13750b.equals(((g) obj).f13750b);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double g() {
        return this.f13750b;
    }

    public final int hashCode() {
        return this.f13750b.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean i() {
        Double d10 = this.f13750b;
        boolean z5 = false;
        if (!Double.isNaN(d10.doubleValue()) && d10.doubleValue() != ConfigValue.DOUBLE_DEFAULT_VALUE) {
            z5 = true;
        }
        return Boolean.valueOf(z5);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String l() {
        Double d10 = this.f13750b;
        if (Double.isNaN(d10.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(d10.doubleValue())) {
            return d10.doubleValue() > ConfigValue.DOUBLE_DEFAULT_VALUE ? "Infinity" : "-Infinity";
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(d10.doubleValue());
        BigDecimal bigDecimal = bigDecimalValueOf.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalValueOf.stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimal.scale() > 0 ? bigDecimal.precision() : bigDecimal.scale()) - 1);
        String str = decimalFormat.format(bigDecimal);
        int iIndexOf = str.indexOf("E");
        if (iIndexOf <= 0) {
            return str;
        }
        int i = Integer.parseInt(str.substring(iIndexOf + 1));
        return ((i >= 0 || i <= -7) && (i < 0 || i >= 21)) ? str.replace("E-", "e-").replace("E", "e+") : bigDecimal.toPlainString();
    }

    public final String toString() {
        return l();
    }
}
