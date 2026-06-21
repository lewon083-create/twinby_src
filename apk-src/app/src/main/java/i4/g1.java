package i4;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 implements b1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b1 f20909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f20910c;

    public g1(b1 b1Var, long j10) {
        this.f20909b = b1Var;
        this.f20910c = j10;
    }

    @Override // i4.b1
    public final void a() {
        this.f20909b.a();
    }

    @Override // i4.b1
    public final int d(r3.b bVar, r3.e eVar, int i) {
        int iD = this.f20909b.d(bVar, eVar, i);
        if (iD == -4) {
            eVar.f32194h += this.f20910c;
        }
        return iD;
    }

    @Override // i4.b1
    public final int h(long j10) {
        return this.f20909b.h(j10 - this.f20910c);
    }

    @Override // i4.b1
    public final boolean isReady() {
        return this.f20909b.isReady();
    }
}
