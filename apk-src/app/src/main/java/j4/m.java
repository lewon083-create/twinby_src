package j4;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m extends f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f26516k;

    public m(p3.h hVar, p3.l lVar, j3.o oVar, int i, Object obj, long j10, long j11, long j12) {
        super(hVar, lVar, 1, oVar, i, obj, j10, j11);
        oVar.getClass();
        this.f26516k = j12;
    }

    public long a() {
        long j10 = this.f26516k;
        if (j10 != -1) {
            return j10 + 1;
        }
        return -1L;
    }

    public abstract boolean b();
}
