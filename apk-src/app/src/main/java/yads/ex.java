package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ex extends ix {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38271a;

    public ex(String str) {
        super(0);
        this.f38271a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ex) && Intrinsics.a(this.f38271a, ((ex) obj).f38271a);
    }

    public final int hashCode() {
        String str = this.f38271a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return pe.a.f("ConsentString(value=", this.f38271a, ")");
    }
}
