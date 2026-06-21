package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class gw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fw f38900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38901b;

    public gw(fw fwVar, String str) {
        this.f38900a = fwVar;
        this.f38901b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gw)) {
            return false;
        }
        gw gwVar = (gw) obj;
        return this.f38900a == gwVar.f38900a && Intrinsics.a(this.f38901b, gwVar.f38901b);
    }

    public final int hashCode() {
        int iHashCode = this.f38900a.hashCode() * 31;
        String str = this.f38901b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "CloseButtonValue(type=" + this.f38900a + ", text=" + this.f38901b + ")";
    }
}
