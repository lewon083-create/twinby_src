package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ee0 implements dk1 {
    @Override // yads.dk1
    public final fk1 a(ck1 ck1Var) {
        int i = lb3.f40466a;
        if (i < 23 || i < 31) {
            return new g53().a(ck1Var);
        }
        int iD = jt1.d(ck1Var.f37417c.f41375m);
        kh1.c("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + lb3.d(iD));
        return new pj(iD).a(ck1Var);
    }
}
