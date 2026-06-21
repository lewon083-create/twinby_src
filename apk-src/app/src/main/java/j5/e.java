package j5;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f26558c;

    public e(float f10, int i, int i10) {
        this.f26556a = i;
        this.f26557b = i10;
        this.f26558c = f10;
    }

    public static e a(int i) {
        int i10 = (i >> 13) & 7;
        if (i10 == 0) {
            return null;
        }
        return new e(((i & 511) * ((i & 512) != 0 ? -1 : 1)) / 10.0f, i10, (i >> 10) & 7);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f26556a == eVar.f26556a && this.f26557b == eVar.f26557b && Float.compare(this.f26558c, eVar.f26558c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f26558c) + (((this.f26556a * 31) + this.f26557b) * 31);
    }

    public final String toString() {
        return "GainField{name=" + this.f26556a + ", originator=" + this.f26557b + ", gain=" + this.f26558c + '}';
    }
}
