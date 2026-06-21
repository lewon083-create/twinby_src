package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class mj1 extends ue1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lj1 f7900a;

    public mj1(lj1 lj1Var) {
        this.f7900a = lj1Var;
    }

    @Override // com.google.android.gms.internal.ads.o91
    public final boolean a() {
        return this.f7900a != lj1.f7549e;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof mj1) && ((mj1) obj).f7900a == this.f7900a;
    }

    public final int hashCode() {
        return Objects.hash(mj1.class, this.f7900a);
    }

    public final String toString() {
        String str = this.f7900a.f7550a;
        return t.z.g(new StringBuilder(str.length() + 30), "Ed25519 Parameters (variant: ", str, ")");
    }
}
