package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class z80 implements g90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45275a;

    public z80(String str) {
        this.f45275a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z80) && Intrinsics.a(this.f45275a, ((z80) obj).f45275a);
    }

    public final int hashCode() {
        return this.f45275a.hashCode();
    }

    public final String toString() {
        return pe.a.f("OnAdUnitClick(id=", this.f45275a, ")");
    }
}
