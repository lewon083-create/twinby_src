package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class qf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f42289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public dw0 f42290b = new dw0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f42291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f42292d;

    public qf1(Object obj) {
        this.f42289a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qf1.class != obj.getClass()) {
            return false;
        }
        return this.f42289a.equals(((qf1) obj).f42289a);
    }

    public final int hashCode() {
        return this.f42289a.hashCode();
    }
}
