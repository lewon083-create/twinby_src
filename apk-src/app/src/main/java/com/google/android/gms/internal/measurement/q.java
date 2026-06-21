package com.google.android.gms.internal.measurement;

import com.yandex.varioqub.config.model.ConfigValue;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements Iterable, n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13924b;

    public q(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.f13924b = str;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n B() {
        return new q(this.f13924b);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator c() {
        return new p(0, this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02ec A[PHI: r7
      0x02ec: PHI (r7v6 boolean) = (r7v13 boolean), (r7v14 boolean), (r7v17 boolean) binds: [B:100:0x02d8, B:101:0x02da, B:103:0x02ea] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02f6 A[LOOP:0: B:108:0x02f4->B:109:0x02f6, LOOP_END] */
    @Override // com.google.android.gms.internal.measurement.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.n e(java.lang.String r28, com.google.firebase.messaging.y r29, java.util.ArrayList r30) {
        /*
            Method dump skipped, instruction units count: 1616
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.q.e(java.lang.String, com.google.firebase.messaging.y, java.util.ArrayList):com.google.android.gms.internal.measurement.n");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            return this.f13924b.equals(((q) obj).f13924b);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double g() {
        String str = this.f13924b;
        if (str.isEmpty()) {
            return Double.valueOf(ConfigValue.DOUBLE_DEFAULT_VALUE);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    public final int hashCode() {
        return this.f13924b.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean i() {
        return Boolean.valueOf(!this.f13924b.isEmpty());
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new p(1, this);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String l() {
        return this.f13924b;
    }

    public final String toString() {
        String str = this.f13924b;
        return t.z.g(new StringBuilder(str.length() + 2), "\"", str, "\"");
    }
}
