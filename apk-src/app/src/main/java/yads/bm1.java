package yads;

import android.net.Uri;
import com.vk.api.sdk.exceptions.VKApiCodes;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class bm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f37092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f37093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yl1 f37094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f37095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f37096e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r51 f37097f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f37098g;

    public bm1(Uri uri, String str, yl1 yl1Var, List list, String str2, r51 r51Var, Object obj) {
        this.f37092a = uri;
        this.f37093b = str;
        this.f37094c = yl1Var;
        this.f37095d = list;
        this.f37096e = str2;
        this.f37097f = r51Var;
        n51 n51VarF = r51.f();
        if (r51Var.size() > 0) {
            r51Var.get(0).getClass();
            throw new ClassCastException();
        }
        n51VarF.a();
        this.f37098g = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bm1)) {
            return false;
        }
        bm1 bm1Var = (bm1) obj;
        return this.f37092a.equals(bm1Var.f37092a) && lb3.a(this.f37093b, bm1Var.f37093b) && lb3.a(this.f37094c, bm1Var.f37094c) && lb3.a((Object) null, (Object) null) && this.f37095d.equals(bm1Var.f37095d) && lb3.a(this.f37096e, bm1Var.f37096e) && this.f37097f.equals(bm1Var.f37097f) && lb3.a(this.f37098g, bm1Var.f37098g);
    }

    public final int hashCode() {
        int iHashCode = this.f37092a.hashCode() * 31;
        String str = this.f37093b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        yl1 yl1Var = this.f37094c;
        int iHashCode3 = (this.f37095d.hashCode() + ((iHashCode2 + (yl1Var == null ? 0 : yl1Var.hashCode())) * VKApiCodes.CODE_CALL_LINK_OUTDATED)) * 31;
        String str2 = this.f37096e;
        int iHashCode4 = (this.f37097f.hashCode() + ((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        Object obj = this.f37098g;
        return iHashCode4 + (obj != null ? obj.hashCode() : 0);
    }
}
