package i4;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f20861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f20864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f20865e;

    public c0(Object obj) {
        this(obj, -1L);
    }

    public final c0 a(Object obj) {
        if (this.f20861a.equals(obj)) {
            return this;
        }
        return new c0(obj, this.f20862b, this.f20863c, this.f20864d, this.f20865e);
    }

    public final boolean b() {
        return this.f20862b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f20861a.equals(c0Var.f20861a) && this.f20862b == c0Var.f20862b && this.f20863c == c0Var.f20863c && this.f20864d == c0Var.f20864d && this.f20865e == c0Var.f20865e;
    }

    public final int hashCode() {
        return ((((((((this.f20861a.hashCode() + 527) * 31) + this.f20862b) * 31) + this.f20863c) * 31) + ((int) this.f20864d)) * 31) + this.f20865e;
    }

    public c0(Object obj, long j10) {
        this(obj, -1, -1, j10, -1);
    }

    public c0(Object obj, long j10, int i) {
        this(obj, -1, -1, j10, i);
    }

    public c0(Object obj, int i, int i10, long j10, int i11) {
        this.f20861a = obj;
        this.f20862b = i;
        this.f20863c = i10;
        this.f20864d = j10;
        this.f20865e = i11;
    }
}
