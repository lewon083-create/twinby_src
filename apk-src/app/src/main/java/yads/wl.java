package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class wl implements yw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f44420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yl f44421b;

    public wl(yl ylVar, long j10) {
        this.f44421b = ylVar;
        this.f44420a = j10;
    }

    @Override // yads.yw2
    public final boolean b() {
        return true;
    }

    @Override // yads.yw2
    public final long c() {
        return this.f44420a;
    }

    @Override // yads.yw2
    public final ww2 b(long j10) {
        ww2 ww2VarB = this.f44421b.f45096g[0].b(j10);
        int i = 1;
        while (true) {
            iu[] iuVarArr = this.f44421b.f45096g;
            if (i >= iuVarArr.length) {
                return ww2VarB;
            }
            ww2 ww2VarB2 = iuVarArr[i].b(j10);
            if (ww2VarB2.f44509a.f36876b < ww2VarB.f44509a.f36876b) {
                ww2VarB = ww2VarB2;
            }
            i++;
        }
    }
}
