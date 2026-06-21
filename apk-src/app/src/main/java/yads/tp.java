package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class tp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final np f43395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sp f43396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public pp f43397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f43398d;

    public tp(qp qpVar, sp spVar, long j10, long j11, long j12, long j13, long j14, int i) {
        this.f43396b = spVar;
        this.f43398d = i;
        this.f43395a = new np(qpVar, j10, j11, j12, j13, j14);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c9, code lost:
    
        if (r8 != r4) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cb, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cc, code lost:
    
        r20.f39538a = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ce, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(yads.ld0 r19, yads.ig2 r20) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.tp.a(yads.ld0, yads.ig2):int");
    }

    public final void a(long j10) {
        pp ppVar = this.f43397c;
        if (ppVar == null || ppVar.f41977a != j10) {
            long jA = this.f43395a.f41330a.a(j10);
            np npVar = this.f43395a;
            this.f43397c = new pp(j10, jA, npVar.f41332c, npVar.f41333d, npVar.f41334e, npVar.f41335f, npVar.f41336g);
        }
    }
}
