package com.google.android.gms.internal.measurement;

import com.yandex.varioqub.config.model.ConfigValue;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f13710b;

    public e(Boolean bool) {
        this.f13710b = bool == null ? false : bool.booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n B() {
        return new e(Boolean.valueOf(this.f13710b));
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator c() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n e(String str, com.google.firebase.messaging.y yVar, ArrayList arrayList) {
        boolean zEquals = "toString".equals(str);
        boolean z5 = this.f13710b;
        if (zEquals) {
            return new q(Boolean.toString(z5));
        }
        throw new IllegalArgumentException(Boolean.toString(z5) + "." + str + " is not a function.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && this.f13710b == ((e) obj).f13710b;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double g() {
        return Double.valueOf(true != this.f13710b ? ConfigValue.DOUBLE_DEFAULT_VALUE : 1.0d);
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f13710b).hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean i() {
        return Boolean.valueOf(this.f13710b);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String l() {
        return Boolean.toString(this.f13710b);
    }

    public final String toString() {
        return String.valueOf(this.f13710b);
    }
}
