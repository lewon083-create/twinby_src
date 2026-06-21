package j3;

import ad.b1;
import com.google.android.gms.internal.ads.e2;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f26405g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f26407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f26408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z f26409d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r f26410e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v f26411f;

    static {
        e2 e2Var = new e2();
        ad.h0 h0Var = ad.j0.f818c;
        b1 b1Var = b1.f768f;
        List list = Collections.EMPTY_LIST;
        b1 b1Var2 = b1.f768f;
        s sVar = new s();
        v vVar = v.f26403a;
        e2Var.b();
        sVar.a();
        z zVar = z.B;
        gf.a.o(0, 1, 2, 3, 4);
        m3.z.G(5);
    }

    public x(String str, r rVar, u uVar, t tVar, z zVar, v vVar) {
        this.f26406a = str;
        this.f26407b = uVar;
        this.f26408c = tVar;
        this.f26409d = zVar;
        this.f26410e = rVar;
        this.f26411f = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Objects.equals(this.f26406a, xVar.f26406a) && this.f26410e.equals(xVar.f26410e) && Objects.equals(this.f26407b, xVar.f26407b) && this.f26408c.equals(xVar.f26408c) && Objects.equals(this.f26409d, xVar.f26409d) && Objects.equals(this.f26411f, xVar.f26411f);
    }

    public final int hashCode() {
        int iHashCode = this.f26406a.hashCode() * 31;
        u uVar = this.f26407b;
        int iHashCode2 = (this.f26409d.hashCode() + ((this.f26410e.hashCode() + ((this.f26408c.hashCode() + ((iHashCode + (uVar != null ? uVar.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
        this.f26411f.getClass();
        return iHashCode2;
    }
}
