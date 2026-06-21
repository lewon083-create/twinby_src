package i4;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements b1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b1 f20858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f20859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f20860d;

    public c(d dVar, b1 b1Var) {
        this.f20860d = dVar;
        this.f20858b = b1Var;
    }

    @Override // i4.b1
    public final void a() {
        this.f20858b.a();
    }

    @Override // i4.b1
    public final int d(r3.b bVar, r3.e eVar, int i) {
        d dVar = this.f20860d;
        if (dVar.a()) {
            return -3;
        }
        if (this.f20859c) {
            eVar.f7316c = 4;
            return -4;
        }
        long bufferedPositionUs = dVar.getBufferedPositionUs();
        int iD = this.f20858b.d(bVar, eVar, i);
        if (iD != -5) {
            long j10 = dVar.f20872h;
            if (j10 == Long.MIN_VALUE || ((iD != -4 || eVar.f32194h < j10) && !(iD == -3 && bufferedPositionUs == Long.MIN_VALUE && !eVar.f32193g))) {
                return iD;
            }
            eVar.r();
            eVar.f7316c = 4;
            this.f20859c = true;
            return -4;
        }
        j3.o oVar = (j3.o) bVar.f32189d;
        oVar.getClass();
        int i10 = oVar.J;
        int i11 = oVar.I;
        if (i11 == 0 && i10 == 0) {
            return -5;
        }
        if (dVar.f20871g != 0) {
            i11 = 0;
        }
        if (dVar.f20872h != Long.MIN_VALUE) {
            i10 = 0;
        }
        j3.n nVarA = oVar.a();
        nVarA.H = i11;
        nVarA.I = i10;
        bVar.f32189d = new j3.o(nVarA);
        return -5;
    }

    @Override // i4.b1
    public final int h(long j10) {
        if (this.f20860d.a()) {
            return -3;
        }
        return this.f20858b.h(j10);
    }

    @Override // i4.b1
    public final boolean isReady() {
        return !this.f20860d.a() && this.f20858b.isReady();
    }
}
