package yads;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class go2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f38839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f38840c;

    public go2(String str, Map map, c cVar) {
        this.f38838a = str;
        this.f38839b = map;
        this.f38840c = cVar;
        map.put("sdk_version", "7.18.4");
    }

    public final c a() {
        return this.f38840c;
    }

    public final Map b() {
        return this.f38839b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof go2)) {
            return false;
        }
        go2 go2Var = (go2) obj;
        return Intrinsics.a(this.f38838a, go2Var.f38838a) && Intrinsics.a(this.f38839b, go2Var.f38839b) && Intrinsics.a(this.f38840c, go2Var.f38840c);
    }

    public final int hashCode() {
        int iHashCode = (this.f38839b.hashCode() + (this.f38838a.hashCode() * 31)) * 31;
        c cVar = this.f38840c;
        return iHashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    public final String toString() {
        return "Report(eventName=" + this.f38838a + ", data=" + this.f38839b + ", abExperiments=" + this.f38840c + ")";
    }
}
