package u3;

import com.google.android.gms.internal.ads.p5;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f34081d = new p5().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f34082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f34083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f34084c;

    public c(p5 p5Var) {
        this.f34082a = p5Var.f8926a;
        this.f34083b = p5Var.f8927b;
        this.f34084c = p5Var.f8928c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f34082a == cVar.f34082a && this.f34083b == cVar.f34083b && this.f34084c == cVar.f34084c;
    }

    public final int hashCode() {
        return ((this.f34082a ? 1 : 0) << 2) + ((this.f34083b ? 1 : 0) << 1) + (this.f34084c ? 1 : 0);
    }
}
