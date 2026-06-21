package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class tu1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final tu1 f10719b = new tu1(new pp0(10));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d51 f10720a;

    public tu1(pp0 pp0Var) {
        this.f10720a = (d51) pp0Var.f9149c;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof tu1) && this.f10720a.equals(((tu1) obj).f10720a);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.f10720a, null, null, bool, bool, bool, bool, bool);
    }
}
