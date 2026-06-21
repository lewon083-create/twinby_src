package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class aa0 extends ba0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f36667a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa0(boolean z5) {
        super(0);
        z90 z90Var = z90.f45283b;
        this.f36667a = z5;
    }

    @Override // yads.ba0
    public final boolean a(Object obj) {
        if (!(obj instanceof aa0)) {
            return false;
        }
        z90 z90Var = z90.f45283b;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa0)) {
            return false;
        }
        z90 z90Var = z90.f45283b;
        return this.f36667a == ((aa0) obj).f36667a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f36667a) + ((z90.f45283b.hashCode() - 1222345866) * 31);
    }

    public final String toString() {
        return "Switch(text=Debug Error Indicator, switchType=" + z90.f45283b + ", initialState=" + this.f36667a + ")";
    }
}
