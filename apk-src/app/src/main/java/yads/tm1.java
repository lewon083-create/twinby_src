package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class tm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f43366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f43367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f43368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f43369d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f43370e;

    public tm1(int i, long j10, Object obj) {
        this(obj, -1, -1, j10, i);
    }

    public final boolean a() {
        return this.f43367b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tm1)) {
            return false;
        }
        tm1 tm1Var = (tm1) obj;
        return this.f43366a.equals(tm1Var.f43366a) && this.f43367b == tm1Var.f43367b && this.f43368c == tm1Var.f43368c && this.f43369d == tm1Var.f43369d && this.f43370e == tm1Var.f43370e;
    }

    public final int hashCode() {
        return ((((((((this.f43366a.hashCode() + 527) * 31) + this.f43367b) * 31) + this.f43368c) * 31) + ((int) this.f43369d)) * 31) + this.f43370e;
    }

    public tm1(Object obj) {
        this(obj, -1L);
    }

    public tm1(Object obj, int i, int i10, long j10) {
        this(obj, i, i10, j10, -1);
    }

    public tm1(Object obj, int i, int i10, long j10, int i11) {
        this.f43366a = obj;
        this.f43367b = i;
        this.f43368c = i10;
        this.f43369d = j10;
        this.f43370e = i11;
    }

    public tm1(Object obj, long j10) {
        this(obj, -1, -1, j10, -1);
    }

    public tm1(tm1 tm1Var) {
        this.f43366a = tm1Var.f43366a;
        this.f43367b = tm1Var.f43367b;
        this.f43368c = tm1Var.f43368c;
        this.f43369d = tm1Var.f43369d;
        this.f43370e = tm1Var.f43370e;
    }
}
