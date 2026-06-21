package ob;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i3 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f30189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f30190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l6.i f30191d;

    public i3(l6.i iVar, long j10, long j11) {
        Objects.requireNonNull(iVar);
        this.f30191d = iVar;
        this.f30189b = j10;
        this.f30190c = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i1 i1Var = ((l1) ((k3) this.f30191d.f27979d).f15951b).f30266h;
        l1.k(i1Var);
        i1Var.L(new ac.g(28, this));
    }
}
