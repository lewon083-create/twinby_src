package androidx.lifecycle;

import android.os.Looper;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class d0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f1547k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static d0 f1548l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static d0 f1549m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o.f f1551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Object f1554e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Object f1555f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1556g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1557h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ac.g f1558j;

    public d0(Object obj) {
        this.f1550a = new Object();
        this.f1551b = new o.f();
        this.f1552c = 0;
        this.f1555f = f1547k;
        this.f1558j = new ac.g(2, this);
        this.f1554e = obj;
        this.f1556g = 0;
    }

    public static void a(String str) {
        n.a.B().f28960a.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(pe.a.f("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(b0 b0Var) {
        if (b0Var.f1537c) {
            if (!b0Var.e()) {
                b0Var.a(false);
                return;
            }
            int i = b0Var.f1538d;
            int i10 = this.f1556g;
            if (i >= i10) {
                return;
            }
            b0Var.f1538d = i10;
            b0Var.f1536b.a(this.f1554e);
        }
    }

    public final void c(b0 b0Var) {
        if (this.f1557h) {
            this.i = true;
            return;
        }
        this.f1557h = true;
        do {
            this.i = false;
            if (b0Var != null) {
                b(b0Var);
                b0Var = null;
            } else {
                o.f fVar = this.f1551b;
                fVar.getClass();
                o.d dVar = new o.d(fVar);
                fVar.f29595d.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    b((b0) ((Map.Entry) dVar.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.f1557h = false;
    }

    public Object d() {
        Object obj = this.f1554e;
        if (obj != f1547k) {
            return obj;
        }
        return null;
    }

    public final void e(u uVar, e0 e0Var) {
        Object obj;
        a("observe");
        if (((w) uVar.getLifecycle()).f1606c == o.f1573b) {
            return;
        }
        a0 a0Var = new a0(this, uVar, e0Var);
        o.f fVar = this.f1551b;
        o.c cVarA = fVar.a(e0Var);
        if (cVarA != null) {
            obj = cVarA.f29587c;
        } else {
            o.c cVar = new o.c(e0Var, a0Var);
            fVar.f29596e++;
            o.c cVar2 = fVar.f29594c;
            if (cVar2 == null) {
                fVar.f29593b = cVar;
                fVar.f29594c = cVar;
            } else {
                cVar2.f29588d = cVar;
                cVar.f29589e = cVar2;
                fVar.f29594c = cVar;
            }
            obj = null;
        }
        b0 b0Var = (b0) obj;
        if (b0Var != null && !b0Var.c(uVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (b0Var != null) {
            return;
        }
        uVar.getLifecycle().a(a0Var);
    }

    public final void f(e0 e0Var) {
        Object obj;
        a("observeForever");
        z zVar = new z(this, e0Var);
        o.f fVar = this.f1551b;
        o.c cVarA = fVar.a(e0Var);
        if (cVarA != null) {
            obj = cVarA.f29587c;
        } else {
            o.c cVar = new o.c(e0Var, zVar);
            fVar.f29596e++;
            o.c cVar2 = fVar.f29594c;
            if (cVar2 == null) {
                fVar.f29593b = cVar;
                fVar.f29594c = cVar;
            } else {
                cVar2.f29588d = cVar;
                cVar.f29589e = cVar2;
                fVar.f29594c = cVar;
            }
            obj = null;
        }
        b0 b0Var = (b0) obj;
        if (b0Var instanceof a0) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (b0Var != null) {
            return;
        }
        zVar.a(true);
    }

    public void i(Object obj) {
        boolean z5;
        synchronized (this.f1550a) {
            z5 = this.f1555f == f1547k;
            this.f1555f = obj;
        }
        if (z5) {
            n.a aVarB = n.a.B();
            ac.g gVar = this.f1558j;
            n.b bVar = aVarB.f28960a;
            if (bVar.f28963c == null) {
                synchronized (bVar.f28961a) {
                    try {
                        if (bVar.f28963c == null) {
                            bVar.f28963c = n.b.B(Looper.getMainLooper());
                        }
                    } finally {
                    }
                }
            }
            bVar.f28963c.post(gVar);
        }
    }

    public void j(e0 e0Var) {
        a("removeObserver");
        b0 b0Var = (b0) this.f1551b.c(e0Var);
        if (b0Var == null) {
            return;
        }
        b0Var.b();
        b0Var.a(false);
    }

    public void k(Object obj) {
        a("setValue");
        this.f1556g++;
        this.f1554e = obj;
        c(null);
    }

    public d0() {
        this.f1550a = new Object();
        this.f1551b = new o.f();
        this.f1552c = 0;
        Object obj = f1547k;
        this.f1555f = obj;
        this.f1558j = new ac.g(2, this);
        this.f1554e = obj;
        this.f1556g = -1;
    }

    public void g() {
    }

    public void h() {
    }
}
