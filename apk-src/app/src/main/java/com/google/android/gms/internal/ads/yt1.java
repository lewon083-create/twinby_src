package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class yt1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f12743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12744c;

    public /* synthetic */ yt1(xt1 xt1Var) {
        this.f12742a = xt1Var.f12328a;
        this.f12743b = xt1Var.f12329b;
        this.f12744c = xt1Var.f12330c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yt1)) {
            return false;
        }
        yt1 yt1Var = (yt1) obj;
        return this.f12742a == yt1Var.f12742a && this.f12743b == yt1Var.f12743b && this.f12744c == yt1Var.f12744c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f12742a), Float.valueOf(this.f12743b), Long.valueOf(this.f12744c));
    }
}
