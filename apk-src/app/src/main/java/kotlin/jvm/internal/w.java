package kotlin.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class w implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f27522b;

    public w(Class jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Intrinsics.checkNotNullParameter("", "moduleName");
        this.f27522b = jClass;
    }

    @Override // kotlin.jvm.internal.g
    public final Class a() {
        return this.f27522b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            return Intrinsics.a(this.f27522b, ((w) obj).f27522b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f27522b.hashCode();
    }

    public final String toString() {
        return this.f27522b + " (Kotlin reflection is not available)";
    }
}
