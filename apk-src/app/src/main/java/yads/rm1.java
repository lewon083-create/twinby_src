package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public interface rm1 extends ux2 {
    long a(long j10, zw2 zw2Var);

    long a(pp0[] pp0VarArr, boolean[] zArr, ps2[] ps2VarArr, boolean[] zArr2, long j10);

    void a(qm1 qm1Var, long j10);

    void discardBuffer(long j10, boolean z5);

    l73 getTrackGroups();

    void maybeThrowPrepareError();

    long readDiscontinuity();

    long seekToUs(long j10);
}
