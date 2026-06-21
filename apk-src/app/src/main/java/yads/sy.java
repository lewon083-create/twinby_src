package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class sy implements ux2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ux2[] f43125b;

    public sy(ux2[] ux2VarArr) {
        this.f43125b = ux2VarArr;
    }

    @Override // yads.ux2
    public final boolean continueLoading(long j10) {
        boolean zContinueLoading;
        boolean z5 = false;
        do {
            long nextLoadPositionUs = getNextLoadPositionUs();
            if (nextLoadPositionUs == Long.MIN_VALUE) {
                return z5;
            }
            zContinueLoading = false;
            for (ux2 ux2Var : this.f43125b) {
                long nextLoadPositionUs2 = ux2Var.getNextLoadPositionUs();
                boolean z10 = nextLoadPositionUs2 != Long.MIN_VALUE && nextLoadPositionUs2 <= j10;
                if (nextLoadPositionUs2 == nextLoadPositionUs || z10) {
                    zContinueLoading |= ux2Var.continueLoading(j10);
                }
            }
            z5 |= zContinueLoading;
        } while (zContinueLoading);
        return z5;
    }

    @Override // yads.ux2
    public final long getBufferedPositionUs() {
        long jMin = Long.MAX_VALUE;
        for (ux2 ux2Var : this.f43125b) {
            long bufferedPositionUs = ux2Var.getBufferedPositionUs();
            if (bufferedPositionUs != Long.MIN_VALUE) {
                jMin = Math.min(jMin, bufferedPositionUs);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // yads.ux2
    public final long getNextLoadPositionUs() {
        long jMin = Long.MAX_VALUE;
        for (ux2 ux2Var : this.f43125b) {
            long nextLoadPositionUs = ux2Var.getNextLoadPositionUs();
            if (nextLoadPositionUs != Long.MIN_VALUE) {
                jMin = Math.min(jMin, nextLoadPositionUs);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // yads.ux2
    public final boolean isLoading() {
        for (ux2 ux2Var : this.f43125b) {
            if (ux2Var.isLoading()) {
                return true;
            }
        }
        return false;
    }

    @Override // yads.ux2
    public final void reevaluateBuffer(long j10) {
        for (ux2 ux2Var : this.f43125b) {
            ux2Var.reevaluateBuffer(j10);
        }
    }
}
