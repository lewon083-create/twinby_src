package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class lb1 extends w91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ja1 f7478a;

    public lb1(ja1 ja1Var) {
        this.f7478a = ja1Var;
    }

    @Override // com.google.android.gms.internal.ads.o91
    public final boolean a() {
        return this.f7478a != ja1.f6796j;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof lb1) && ((lb1) obj).f7478a == this.f7478a;
    }

    public final int hashCode() {
        return Objects.hash(lb1.class, this.f7478a);
    }

    public final String toString() {
        String str = this.f7478a.f6802b;
        return t.z.g(new StringBuilder(str.length() + 40), "XChaCha20Poly1305 Parameters (variant: ", str, ")");
    }
}
