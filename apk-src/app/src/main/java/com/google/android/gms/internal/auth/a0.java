package com.google.android.gms.internal.auth;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements Serializable, w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13169b;

    public a0(Object obj) {
        this.f13169b = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a0)) {
            return false;
        }
        Object obj2 = ((a0) obj).f13169b;
        Object obj3 = this.f13169b;
        return obj3 == obj2 || obj3.equals(obj2);
    }

    @Override // com.google.android.gms.internal.auth.w
    public final Object h() {
        return this.f13169b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13169b});
    }

    public final String toString() {
        return pe.a.f("Suppliers.ofInstance(", this.f13169b.toString(), ")");
    }
}
