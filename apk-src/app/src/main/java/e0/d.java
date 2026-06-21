package e0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0.a f15883b;

    public d(String requiredUseCases, b0.a featureRequiring) {
        Intrinsics.checkNotNullParameter(requiredUseCases, "requiredUseCases");
        Intrinsics.checkNotNullParameter(featureRequiring, "featureRequiring");
        this.f15882a = requiredUseCases;
        this.f15883b = featureRequiring;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.a(this.f15882a, dVar.f15882a) && Intrinsics.a(this.f15883b, dVar.f15883b);
    }

    public final int hashCode() {
        return this.f15883b.hashCode() + (this.f15882a.hashCode() * 31);
    }

    public final String toString() {
        return "UseCaseMissing(requiredUseCases=" + this.f15882a + ", featureRequiring=" + this.f15883b + ')';
    }
}
