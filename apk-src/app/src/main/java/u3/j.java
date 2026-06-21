package u3;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f34129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f34130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f34131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f34132e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f34133f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j3.d f34134g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f34135h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f34136j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f34137k;

    public j(i iVar) {
        this.f34128a = iVar.f34118a;
        this.f34129b = iVar.f34119b;
        this.f34130c = iVar.f34120c;
        this.f34131d = iVar.f34121d;
        this.f34132e = iVar.f34122e;
        this.f34133f = iVar.f34123f;
        this.f34134g = iVar.f34124g;
        this.f34135h = iVar.f34125h;
        this.i = iVar.i;
        this.f34136j = iVar.f34126j;
        this.f34137k = iVar.f34127k;
    }

    public final i a() {
        i iVar = new i();
        iVar.f34118a = this.f34128a;
        iVar.f34119b = this.f34129b;
        iVar.f34120c = this.f34130c;
        iVar.f34121d = this.f34131d;
        iVar.f34122e = this.f34132e;
        iVar.f34123f = this.f34133f;
        iVar.f34124g = this.f34134g;
        iVar.f34125h = this.f34135h;
        iVar.i = this.i;
        iVar.f34126j = this.f34136j;
        iVar.f34127k = this.f34137k;
        return iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return this.f34128a == jVar.f34128a && this.f34129b == jVar.f34129b && this.f34130c == jVar.f34130c && this.f34131d == jVar.f34131d && this.f34132e == jVar.f34132e && this.f34133f == jVar.f34133f && this.f34135h == jVar.f34135h && this.i == jVar.i && this.f34136j == jVar.f34136j && this.f34137k == jVar.f34137k && this.f34134g.equals(jVar.f34134g);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f34128a), Integer.valueOf(this.f34129b), Integer.valueOf(this.f34130c), Boolean.valueOf(this.f34131d), Boolean.valueOf(this.f34132e), Integer.valueOf(this.f34133f), this.f34134g, Integer.valueOf(this.f34135h), Integer.valueOf(this.i), Boolean.valueOf(this.f34137k), Boolean.valueOf(this.f34136j));
    }
}
