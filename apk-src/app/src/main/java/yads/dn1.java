package yads;

import android.os.Handler;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class dn1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final an1 f37846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f37847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f37848d;

    public dn1() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }

    public final void a(Handler handler, en1 en1Var) {
        en1Var.getClass();
        this.f37847c.add(new cn1(handler, en1Var));
    }

    public final /* synthetic */ void b(en1 en1Var, xf1 xf1Var, jm1 jm1Var) {
        en1Var.a(this.f37845a, this.f37846b, xf1Var, jm1Var);
    }

    public final /* synthetic */ void c(en1 en1Var, xf1 xf1Var, jm1 jm1Var) {
        en1Var.b(this.f37845a, this.f37846b, xf1Var, jm1Var);
    }

    public dn1(CopyOnWriteArrayList copyOnWriteArrayList, int i, an1 an1Var, long j10) {
        this.f37847c = copyOnWriteArrayList;
        this.f37845a = i;
        this.f37846b = an1Var;
        this.f37848d = j10;
    }

    public final void b(xf1 xf1Var, jm1 jm1Var) {
        for (cn1 cn1Var : this.f37847c) {
            lb3.a(cn1Var.f37443a, (Runnable) new zl.h(this, cn1Var.f37444b, xf1Var, jm1Var, 2));
        }
    }

    public final void c(xf1 xf1Var, jm1 jm1Var) {
        for (cn1 cn1Var : this.f37847c) {
            lb3.a(cn1Var.f37443a, (Runnable) new zl.h(this, cn1Var.f37444b, xf1Var, jm1Var, 0));
        }
    }

    public final long a(long j10) {
        long jB = lb3.b(j10);
        if (jB == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f37848d + jB;
    }

    public final void a(jm1 jm1Var) {
        for (cn1 cn1Var : this.f37847c) {
            lb3.a(cn1Var.f37443a, (Runnable) new q0.o(this, cn1Var.f37444b, jm1Var, 18));
        }
    }

    public final void b(jm1 jm1Var) {
        an1 an1Var = this.f37846b;
        an1Var.getClass();
        for (cn1 cn1Var : this.f37847c) {
            lb3.a(cn1Var.f37443a, (Runnable) new a0.i1(this, cn1Var.f37444b, an1Var, jm1Var, 17));
        }
    }

    public final /* synthetic */ void a(en1 en1Var, jm1 jm1Var) {
        en1Var.b(this.f37845a, this.f37846b, jm1Var);
    }

    public final /* synthetic */ void a(en1 en1Var, xf1 xf1Var, jm1 jm1Var) {
        en1Var.c(this.f37845a, this.f37846b, xf1Var, jm1Var);
    }

    public final /* synthetic */ void a(en1 en1Var, xf1 xf1Var, jm1 jm1Var, IOException iOException, boolean z5) {
        en1Var.a(this.f37845a, this.f37846b, xf1Var, jm1Var, iOException, z5);
    }

    public final /* synthetic */ void a(en1 en1Var, an1 an1Var, jm1 jm1Var) {
        en1Var.a(this.f37845a, an1Var, jm1Var);
    }

    public final void a(xf1 xf1Var, jm1 jm1Var) {
        for (cn1 cn1Var : this.f37847c) {
            lb3.a(cn1Var.f37443a, (Runnable) new zl.h(this, cn1Var.f37444b, xf1Var, jm1Var, 1));
        }
    }

    public final void a(xf1 xf1Var, jm1 jm1Var, IOException iOException, boolean z5) {
        for (cn1 cn1Var : this.f37847c) {
            lb3.a(cn1Var.f37443a, (Runnable) new s3.q0(this, cn1Var.f37444b, xf1Var, jm1Var, iOException, z5, 2));
        }
    }
}
