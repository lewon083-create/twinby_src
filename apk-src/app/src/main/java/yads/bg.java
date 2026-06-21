package yads;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class bg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f37010b;

    public bg(cg cgVar, JSONObject jSONObject) {
        this.f37009a = cgVar.a();
        this.f37010b = jSONObject.toString();
    }

    public final String a() {
        return this.f37009a;
    }

    public final String b() {
        return this.f37010b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bg)) {
            return false;
        }
        bg bgVar = (bg) obj;
        return Intrinsics.a(bgVar.f37009a, this.f37009a) && Intrinsics.a(bgVar.f37010b, this.f37010b);
    }

    public final int hashCode() {
        return this.f37010b.hashCode() + (this.f37009a.hashCode() * 31);
    }
}
