package q4;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f31761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f31762b;

    public s(u uVar, u uVar2) {
        this.f31761a = uVar;
        this.f31762b = uVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s.class == obj.getClass()) {
            s sVar = (s) obj;
            if (this.f31761a.equals(sVar.f31761a) && this.f31762b.equals(sVar.f31762b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f31762b.hashCode() + (this.f31761a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("[");
        u uVar = this.f31761a;
        sb2.append(uVar);
        u uVar2 = this.f31762b;
        if (uVar.equals(uVar2)) {
            str = "";
        } else {
            str = ", " + uVar2;
        }
        return a0.u.o(sb2, str, "]");
    }
}
