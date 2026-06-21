package yads;

import io.sentry.TransactionOptions;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class le0 implements yw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ me0 f40511a;

    public le0(me0 me0Var) {
        this.f40511a = me0Var;
    }

    @Override // yads.yw2
    public final boolean b() {
        return true;
    }

    @Override // yads.yw2
    public final long c() {
        me0 me0Var = this.f40511a;
        return (me0Var.f40892f * 1000000) / ((long) me0Var.f40890d.i);
    }

    @Override // yads.yw2
    public final ww2 b(long j10) {
        me0 me0Var = this.f40511a;
        long j11 = (((long) me0Var.f40890d.i) * j10) / 1000000;
        long j12 = me0Var.f40888b;
        long j13 = me0Var.f40889c;
        int i = lb3.f40466a;
        ax2 ax2Var = new ax2(j10, Math.max(j12, Math.min(((((j13 - j12) * j11) / me0Var.f40892f) + j12) - TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION, j13 - 1)));
        return new ww2(ax2Var, ax2Var);
    }
}
