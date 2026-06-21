package yads;

import com.yandex.div.DivDataTag;
import fh.xa;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class hi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f39202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JSONObject f39203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f39204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final xa f39205e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final DivDataTag f39206f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f39207g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final yf0 f39208h;

    public hi0(String str, JSONObject jSONObject, JSONObject jSONObject2, List list, xa xaVar, DivDataTag divDataTag, Set set, yf0 yf0Var) {
        this.f39201a = str;
        this.f39202b = jSONObject;
        this.f39203c = jSONObject2;
        this.f39204d = list;
        this.f39205e = xaVar;
        this.f39206f = divDataTag;
        this.f39207g = set;
        this.f39208h = yf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hi0)) {
            return false;
        }
        hi0 hi0Var = (hi0) obj;
        return Intrinsics.a(this.f39201a, hi0Var.f39201a) && Intrinsics.a(this.f39202b, hi0Var.f39202b) && Intrinsics.a(this.f39203c, hi0Var.f39203c) && Intrinsics.a(this.f39204d, hi0Var.f39204d) && Intrinsics.a(this.f39205e, hi0Var.f39205e) && Intrinsics.a(this.f39206f, hi0Var.f39206f) && Intrinsics.a(this.f39207g, hi0Var.f39207g) && Intrinsics.a(this.f39208h, hi0Var.f39208h);
    }

    public final int hashCode() {
        int iHashCode = (this.f39202b.hashCode() + (this.f39201a.hashCode() * 31)) * 31;
        JSONObject jSONObject = this.f39203c;
        int iHashCode2 = (iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        List list = this.f39204d;
        return this.f39208h.hashCode() + ((this.f39207g.hashCode() + ((this.f39206f.hashCode() + ((this.f39205e.hashCode() + ((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DivKitDesign(target=" + this.f39201a + ", card=" + this.f39202b + ", templates=" + this.f39203c + ", images=" + this.f39204d + ", divData=" + this.f39205e + ", divDataTag=" + this.f39206f + ", divAssets=" + this.f39207g + ", designAnalytics=" + this.f39208h + ")";
    }
}
