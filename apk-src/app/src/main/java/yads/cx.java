package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class cx extends ix {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37543a;

    public cx(String str) {
        super(0);
        this.f37543a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cx) && Intrinsics.a(this.f37543a, ((cx) obj).f37543a);
    }

    public final int hashCode() {
        String str = this.f37543a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return pe.a.f("AdditionalConsent(value=", this.f37543a, ")");
    }
}
