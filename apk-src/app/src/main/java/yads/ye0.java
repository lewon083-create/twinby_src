package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ye0 implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f45036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f45037c;

    public ye0(int i, nx0 nx0Var) {
        this.f45036b = (nx0Var.f41368e & 1) != 0;
        this.f45037c = if0.a(false, i);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ye0 ye0Var = (ye0) obj;
        return fy.a(lq.a(this.f45037c, ye0Var.f45037c)).a(this.f45036b, ye0Var.f45036b).a();
    }
}
