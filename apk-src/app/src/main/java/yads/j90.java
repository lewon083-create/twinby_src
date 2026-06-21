package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class j90 implements m90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39783a;

    public j90(String str) {
        this.f39783a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j90) && Intrinsics.a(this.f39783a, ((j90) obj).f39783a);
    }

    public final int hashCode() {
        return this.f39783a.hashCode();
    }

    public final String toString() {
        return pe.a.f("Message(text=", this.f39783a, ")");
    }
}
