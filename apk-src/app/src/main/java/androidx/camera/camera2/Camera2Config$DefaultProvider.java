package androidx.camera.camera2;

import a0.c0;
import a0.d0;
import a0.e0;
import g0.g;
import g0.q1;
import g0.u1;
import r.a;
import r.b;
import r.c;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class Camera2Config$DefaultProvider implements d0 {
    @Override // a0.d0
    public e0 getCameraXConfig() {
        a aVar = new a();
        b bVar = new b();
        c cVar = new c();
        c0 c0Var = new c0(0);
        g gVar = e0.M;
        q1 q1Var = c0Var.f50a;
        q1Var.y(gVar, aVar);
        q1Var.y(e0.N, bVar);
        q1Var.y(e0.O, cVar);
        q1Var.y(e0.W, 0);
        q1Var.y(e0.X, Boolean.TRUE);
        return new e0(u1.u(q1Var));
    }
}
