package yads;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class pk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final an1 f41945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f41946c;

    public pk0() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    public final void a(Handler handler, qk0 qk0Var) {
        qk0Var.getClass();
        this.f41946c.add(new ok0(handler, qk0Var));
    }

    public final void b() {
        for (ok0 ok0Var : this.f41946c) {
            lb3.a(ok0Var.f41552a, (Runnable) new zl.s0(this, ok0Var.f41553b, 3));
        }
    }

    public final void c() {
        for (ok0 ok0Var : this.f41946c) {
            lb3.a(ok0Var.f41552a, (Runnable) new zl.s0(this, ok0Var.f41553b, 1));
        }
    }

    public final void d() {
        for (ok0 ok0Var : this.f41946c) {
            lb3.a(ok0Var.f41552a, (Runnable) new zl.s0(this, ok0Var.f41553b, 0));
        }
    }

    public pk0(CopyOnWriteArrayList copyOnWriteArrayList, int i, an1 an1Var) {
        this.f41946c = copyOnWriteArrayList;
        this.f41944a = i;
        this.f41945b = an1Var;
    }

    public final void a() {
        for (ok0 ok0Var : this.f41946c) {
            lb3.a(ok0Var.f41552a, (Runnable) new zl.s0(this, ok0Var.f41553b, 2));
        }
    }

    public final /* synthetic */ void b(qk0 qk0Var) {
        qk0Var.d(this.f41944a, this.f41945b);
    }

    public final /* synthetic */ void c(qk0 qk0Var) {
        qk0Var.c(this.f41944a, this.f41945b);
    }

    public final /* synthetic */ void d(qk0 qk0Var) {
        qk0Var.b(this.f41944a, this.f41945b);
    }

    public final void a(int i) {
        for (ok0 ok0Var : this.f41946c) {
            lb3.a(ok0Var.f41552a, (Runnable) new d.l(this, ok0Var.f41553b, i, 11));
        }
    }

    public final void a(Exception exc) {
        for (ok0 ok0Var : this.f41946c) {
            lb3.a(ok0Var.f41552a, (Runnable) new q0.o(this, ok0Var.f41553b, exc, 21));
        }
    }

    public final /* synthetic */ void a(qk0 qk0Var) {
        qk0Var.a(this.f41944a, this.f41945b);
    }

    public final /* synthetic */ void a(qk0 qk0Var, int i) {
        qk0Var.getClass();
        qk0Var.a(this.f41944a, this.f41945b, i);
    }

    public final /* synthetic */ void a(qk0 qk0Var, Exception exc) {
        qk0Var.a(this.f41944a, this.f41945b, exc);
    }
}
