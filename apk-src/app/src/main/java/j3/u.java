package j3;

import android.net.Uri;
import com.vk.api.sdk.exceptions.VKApiCodes;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f26396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f26397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f26398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ad.j0 f26399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f26400e;

    static {
        gf.a.o(0, 1, 2, 3, 4);
        m3.z.G(5);
        m3.z.G(6);
        m3.z.G(7);
    }

    public u(Uri uri, String str, wa.a aVar, List list, ad.j0 j0Var, long j10) {
        this.f26396a = uri;
        this.f26397b = c0.n(str);
        this.f26398c = list;
        this.f26399d = j0Var;
        ad.g0 g0VarQ = ad.j0.q();
        for (int i = 0; i < j0Var.size(); i++) {
            ((w) j0Var.get(i)).getClass();
            g0VarQ.b(new w());
        }
        g0VarQ.g();
        this.f26400e = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f26396a.equals(uVar.f26396a) && Objects.equals(this.f26397b, uVar.f26397b) && Objects.equals(null, null) && this.f26398c.equals(uVar.f26398c) && this.f26399d.equals(uVar.f26399d) && this.f26400e == uVar.f26400e;
    }

    public final int hashCode() {
        int iHashCode = this.f26396a.hashCode() * 31;
        String str = this.f26397b;
        return (int) ((((long) ((this.f26399d.hashCode() + ((this.f26398c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 29791)) * VKApiCodes.CODE_CALL_LINK_OUTDATED)) * 31)) * 31) + this.f26400e);
    }
}
