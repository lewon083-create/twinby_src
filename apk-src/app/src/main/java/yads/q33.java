package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class q33 implements yw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yw2 f42162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r33 f42163b;

    public q33(r33 r33Var, yw2 yw2Var) {
        this.f42163b = r33Var;
        this.f42162a = yw2Var;
    }

    @Override // yads.yw2
    public final ww2 b(long j10) {
        ww2 ww2VarB = this.f42162a.b(j10);
        ax2 ax2Var = ww2VarB.f44509a;
        long j11 = ax2Var.f36875a;
        long j12 = ax2Var.f36876b;
        long j13 = this.f42163b.f42483b;
        ax2 ax2Var2 = new ax2(j11, j12 + j13);
        ax2 ax2Var3 = ww2VarB.f44510b;
        return new ww2(ax2Var2, new ax2(ax2Var3.f36875a, ax2Var3.f36876b + j13));
    }

    @Override // yads.yw2
    public final long c() {
        return this.f42162a.c();
    }

    @Override // yads.yw2
    public final boolean b() {
        return this.f42162a.b();
    }
}
