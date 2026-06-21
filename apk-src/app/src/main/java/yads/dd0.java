package yads;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class dd0 implements sk0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pk0 f37727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public nk0 f37728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f37729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gd0 f37730e;

    public dd0(gd0 gd0Var, pk0 pk0Var) {
        this.f37730e = gd0Var;
        this.f37727b = pk0Var;
    }

    public final void a(nx0 nx0Var) {
        Handler handler = this.f37730e.f38726u;
        handler.getClass();
        handler.post(new t.v0(27, this, nx0Var));
    }

    public final void b(nx0 nx0Var) {
        gd0 gd0Var = this.f37730e;
        if (gd0Var.f38721p == 0 || this.f37729d) {
            return;
        }
        Looper looper = gd0Var.f38725t;
        looper.getClass();
        this.f37728c = gd0Var.a(looper, this.f37727b, nx0Var, false);
        this.f37730e.f38719n.add(this);
    }

    @Override // yads.sk0
    public final void release() {
        Handler handler = this.f37730e.f38726u;
        handler.getClass();
        lb3.a(handler, (Runnable) new t.a0(20, this));
    }

    public final /* synthetic */ void a() {
        if (this.f37729d) {
            return;
        }
        nk0 nk0Var = this.f37728c;
        if (nk0Var != null) {
            nk0Var.a(this.f37727b);
        }
        this.f37730e.f38719n.remove(this);
        this.f37729d = true;
    }
}
