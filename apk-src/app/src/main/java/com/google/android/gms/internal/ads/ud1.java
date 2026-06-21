package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ud1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f10911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f10912b;

    public /* synthetic */ ud1(Class cls, Class cls2) {
        this.f10911a = cls;
        this.f10912b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ud1)) {
            return false;
        }
        ud1 ud1Var = (ud1) obj;
        return ud1Var.f10911a.equals(this.f10911a) && ud1Var.f10912b.equals(this.f10912b);
    }

    public final int hashCode() {
        return Objects.hash(this.f10911a, this.f10912b);
    }

    public final String toString() {
        String simpleName = this.f10911a.getSimpleName();
        String simpleName2 = this.f10912b.getSimpleName();
        return t.z.g(new StringBuilder(simpleName.length() + 22 + simpleName2.length()), simpleName, " with primitive type: ", simpleName2);
    }
}
