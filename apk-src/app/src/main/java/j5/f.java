package j5;

import j3.a0;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f26559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f26560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f26561c;

    public f(float f10, e eVar, e eVar2) {
        this.f26559a = f10;
        this.f26560b = eVar;
        this.f26561c = eVar2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Float.compare(this.f26559a, fVar.f26559a) == 0 && Objects.equals(this.f26560b, fVar.f26560b) && Objects.equals(this.f26561c, fVar.f26561c);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f26559a) * 31;
        e eVar = this.f26560b;
        int iHashCode2 = (iHashCode + (eVar != null ? eVar.hashCode() : 0)) * 31;
        e eVar2 = this.f26561c;
        return iHashCode2 + (eVar2 != null ? eVar2.hashCode() : 0);
    }

    public final String toString() {
        return "ReplayGain Xing/Info: peak=" + this.f26559a + ", field 1=" + this.f26560b + ", field 2=" + this.f26561c;
    }
}
