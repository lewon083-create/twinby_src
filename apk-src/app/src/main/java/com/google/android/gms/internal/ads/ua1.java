package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ua1 extends w91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fa1 f10901a;

    public ua1(fa1 fa1Var) {
        this.f10901a = fa1Var;
    }

    @Override // com.google.android.gms.internal.ads.o91
    public final boolean a() {
        return this.f10901a != fa1.f5299h;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ua1) && ((ua1) obj).f10901a == this.f10901a;
    }

    public final int hashCode() {
        return Objects.hash(ua1.class, this.f10901a);
    }

    public final String toString() {
        String str = this.f10901a.f5304b;
        return t.z.g(new StringBuilder(str.length() + 39), "ChaCha20Poly1305 Parameters (variant: ", str, ")");
    }
}
