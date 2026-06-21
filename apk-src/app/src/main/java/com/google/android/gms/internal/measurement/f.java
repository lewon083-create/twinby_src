package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f13722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13723c;

    public f(String str) {
        this.f13722b = n.B1;
        this.f13723c = str;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n B() {
        return new f(this.f13723c, this.f13722b.B());
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator c() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n e(String str, com.google.firebase.messaging.y yVar, ArrayList arrayList) {
        throw new IllegalStateException("Control does not have functions");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f13723c.equals(fVar.f13723c) && this.f13722b.equals(fVar.f13722b);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double g() {
        throw new IllegalStateException("Control is not a double");
    }

    public final int hashCode() {
        return this.f13722b.hashCode() + (this.f13723c.hashCode() * 31);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean i() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String l() {
        throw new IllegalStateException("Control is not a String");
    }

    public f(String str, n nVar) {
        this.f13722b = nVar;
        this.f13723c = str;
    }
}
