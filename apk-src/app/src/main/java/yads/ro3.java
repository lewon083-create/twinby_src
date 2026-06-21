package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ro3 implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f42674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final no3 f42675c;

    public ro3(int i, no3 no3Var) {
        this.f42674b = i;
        this.f42675c = no3Var;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f42674b, ((ro3) obj).f42674b);
    }
}
