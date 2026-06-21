package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ee1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f4928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f4929b;

    public /* synthetic */ ee1(Class cls, Class cls2) {
        this.f4928a = cls;
        this.f4929b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ee1)) {
            return false;
        }
        ee1 ee1Var = (ee1) obj;
        return ee1Var.f4928a.equals(this.f4928a) && ee1Var.f4929b.equals(this.f4929b);
    }

    public final int hashCode() {
        return Objects.hash(this.f4928a, this.f4929b);
    }

    public final String toString() {
        String simpleName = this.f4928a.getSimpleName();
        String simpleName2 = this.f4929b.getSimpleName();
        return t.z.g(new StringBuilder(simpleName.length() + 26 + simpleName2.length()), simpleName, " with serialization type: ", simpleName2);
    }
}
