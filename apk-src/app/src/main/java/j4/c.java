package j4;

import m3.p;
import m3.z;
import q4.a0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j3.o f26452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q4.j f26453c = new q4.j();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f26454d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j3.o f26455e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a0 f26456f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f26457g;

    public c(int i, int i10, j3.o oVar, d dVar) {
        this.f26451a = i10;
        this.f26452b = oVar;
        this.f26454d = dVar;
    }

    @Override // q4.a0
    public final void a(j3.o oVar) {
        this.f26454d.getClass();
        j3.o oVar2 = this.f26452b;
        if (oVar2 != null) {
            oVar = oVar.d(oVar2);
        }
        this.f26455e = oVar;
        a0 a0Var = this.f26456f;
        String str = z.f28608a;
        a0Var.a(oVar);
    }

    @Override // q4.a0
    public final void e(p pVar, int i, int i10) {
        a0 a0Var = this.f26456f;
        String str = z.f28608a;
        a0Var.d(i, pVar);
    }

    @Override // q4.a0
    public final void f(long j10, int i, int i10, int i11, q4.z zVar) {
        long j11 = this.f26457g;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            this.f26456f = this.f26453c;
        }
        a0 a0Var = this.f26456f;
        String str = z.f28608a;
        a0Var.f(j10, i, i10, i11, zVar);
    }

    @Override // q4.a0
    public final int g(j3.h hVar, int i, boolean z5) {
        a0 a0Var = this.f26456f;
        String str = z.f28608a;
        return a0Var.c(hVar, i, z5);
    }
}
