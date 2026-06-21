package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class hl extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public hl(long j10, long j11) {
        StringBuilder sbN = gf.a.n("Unexpected audio track timestamp discontinuity: expected ", ", got ", j11);
        sbN.append(j10);
        super(sbN.toString());
    }
}
