package j3;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final y0 f26415d = new y0(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f26418c;

    static {
        m3.z.G(0);
        m3.z.G(1);
        m3.z.G(3);
    }

    public y0(int i, int i10) {
        this(1.0f, i, i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y0) {
            y0 y0Var = (y0) obj;
            if (this.f26416a == y0Var.f26416a && this.f26417b == y0Var.f26417b && this.f26418c == y0Var.f26418c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f26418c) + ((((217 + this.f26416a) * 31) + this.f26417b) * 31);
    }

    public y0(float f10, int i, int i10) {
        this.f26416a = i;
        this.f26417b = i10;
        this.f26418c = f10;
    }
}
