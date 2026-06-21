package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class de1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f4559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sl1 f4560b;

    public /* synthetic */ de1(Class cls, sl1 sl1Var) {
        this.f4559a = cls;
        this.f4560b = sl1Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof de1)) {
            return false;
        }
        de1 de1Var = (de1) obj;
        return de1Var.f4559a.equals(this.f4559a) && de1Var.f4560b.equals(this.f4560b);
    }

    public final int hashCode() {
        return Objects.hash(this.f4559a, this.f4560b);
    }

    public final String toString() {
        String simpleName = this.f4559a.getSimpleName();
        String strValueOf = String.valueOf(this.f4560b);
        return t.z.g(new StringBuilder(simpleName.length() + 21 + strValueOf.length()), simpleName, ", object identifier: ", strValueOf);
    }
}
