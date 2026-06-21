package i4;

import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f20927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f20928c;

    public /* synthetic */ i0(CopyOnWriteArrayList copyOnWriteArrayList, int i, c0 c0Var) {
        this.f20928c = copyOnWriteArrayList;
        this.f20926a = i;
        this.f20927b = c0Var;
    }

    public void a(m3.g gVar) {
        for (h0 h0Var : this.f20928c) {
            m3.z.Q(h0Var.f20919a, new e1.y(27, gVar, h0Var.f20920b));
        }
    }

    public void b(int i, j3.o oVar, int i10, Object obj, long j10) {
        a(new a0.y(16, this, new f4.g(1, i, oVar, i10, obj, m3.z.Z(j10), -9223372036854775807L)));
    }

    public void c(u uVar, int i, int i10, j3.o oVar, int i11, Object obj, long j10, long j11) {
        a(new f0(this, uVar, new f4.g(i, i10, oVar, i11, obj, m3.z.Z(j10), m3.z.Z(j11)), 1));
    }

    public void d(u uVar, int i) {
        e(uVar, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public void e(u uVar, int i, int i10, j3.o oVar, int i11, Object obj, long j10, long j11) {
        a(new f0(this, uVar, new f4.g(i, i10, oVar, i11, obj, m3.z.Z(j10), m3.z.Z(j11)), 0));
    }

    public void f(u uVar, int i, int i10, j3.o oVar, int i11, Object obj, long j10, long j11, IOException iOException, boolean z5) {
        a(new g0(this, uVar, new f4.g(i, i10, oVar, i11, obj, m3.z.Z(j10), m3.z.Z(j11)), iOException, z5));
    }

    public void g(u uVar, int i, IOException iOException, boolean z5) {
        f(uVar, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z5);
    }

    public void h(u uVar, int i, int i10, j3.o oVar, int i11, Object obj, long j10, long j11, int i12) {
        a(new e0(this, uVar, new f4.g(i, i10, oVar, i11, obj, m3.z.Z(j10), m3.z.Z(j11)), i12));
    }

    public void i(int i, long j10, long j11) {
        f4.g gVar = new f4.g(1, i, null, 3, null, m3.z.Z(j10), m3.z.Z(j11));
        c0 c0Var = this.f20927b;
        c0Var.getClass();
        a(new com.google.firebase.messaging.o(this, c0Var, gVar, 9));
    }
}
