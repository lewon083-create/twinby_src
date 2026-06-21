package com.google.android.gms.internal.measurement;

import com.yandex.varioqub.config.model.ConfigValue;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements n {
    @Override // com.google.android.gms.internal.measurement.n
    public final n B() {
        return n.C1;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator c() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n e(String str, com.google.firebase.messaging.y yVar, ArrayList arrayList) {
        throw new IllegalStateException("null has no function ".concat(str));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof l;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double g() {
        return Double.valueOf(ConfigValue.DOUBLE_DEFAULT_VALUE);
    }

    public final int hashCode() {
        return 1;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean i() {
        return Boolean.FALSE;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String l() {
        return "null";
    }
}
