package yads;

import java.io.IOException;
import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class y13 implements ag1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x13 f44888b;

    public y13(com.monetization.ads.exo.source.dash.a aVar) {
        this.f44888b = aVar;
    }

    @Override // yads.ag1
    public final void a(dg1 dg1Var, long j10, long j11, boolean z5) {
    }

    @Override // yads.ag1
    public final void a(dg1 dg1Var, long j10, long j11) {
        boolean z5;
        if (this.f44888b != null) {
            synchronized (a23.f36619b) {
                z5 = a23.f36620c;
            }
            if (z5) {
                ((com.monetization.ads.exo.source.dash.a) this.f44888b).a();
                return;
            }
            x13 x13Var = this.f44888b;
            ((com.monetization.ads.exo.source.dash.a) x13Var).f15022a.a(new IOException(new ConcurrentModificationException()));
        }
    }

    @Override // yads.ag1
    public final bg1 a(dg1 dg1Var, long j10, long j11, IOException iOException, int i) {
        x13 x13Var = this.f44888b;
        if (x13Var != null) {
            ((com.monetization.ads.exo.source.dash.a) x13Var).f15022a.a(iOException);
        }
        return hg1.f39171d;
    }
}
