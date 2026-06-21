package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class w90 extends ba0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44309a;

    public w90(String str) {
        super(0);
        this.f44309a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w90) && Intrinsics.a(this.f44309a, ((w90) obj).f44309a);
    }

    public final int hashCode() {
        return this.f44309a.hashCode();
    }

    public final String toString() {
        return pe.a.f("Header(text=", this.f44309a, ")");
    }
}
