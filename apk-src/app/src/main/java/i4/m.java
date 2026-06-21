package i4;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements d1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d1 f20956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ad.j0 f20957c;

    public m(d1 d1Var, List list) {
        this.f20956b = d1Var;
        this.f20957c = ad.j0.r(list);
    }

    @Override // i4.d1
    public final long getBufferedPositionUs() {
        return this.f20956b.getBufferedPositionUs();
    }

    @Override // i4.d1
    public final long getNextLoadPositionUs() {
        return this.f20956b.getNextLoadPositionUs();
    }

    @Override // i4.d1
    public final boolean isLoading() {
        return this.f20956b.isLoading();
    }

    @Override // i4.d1
    public final boolean l(s3.h0 h0Var) {
        return this.f20956b.l(h0Var);
    }

    @Override // i4.d1
    public final void reevaluateBuffer(long j10) {
        this.f20956b.reevaluateBuffer(j10);
    }
}
