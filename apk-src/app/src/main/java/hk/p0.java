package hk;

import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class p0 extends r0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f20699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t0 f20700e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(t0 t0Var, long j10, l lVar) {
        super(j10);
        this.f20700e = t0Var;
        this.f20699d = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20699d.C(this.f20700e, Unit.f27471a);
    }

    @Override // hk.r0
    public final String toString() {
        return super.toString() + this.f20699d;
    }
}
