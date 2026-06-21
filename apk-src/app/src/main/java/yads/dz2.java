package yads;

import com.vk.api.sdk.exceptions.VKApiCodes;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class dz2 implements oa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cz2 f37923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f37924b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque f37925c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque f37926d = new ArrayDeque();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final sa0[] f37927e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ua0[] f37928f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f37929g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f37930h;
    public sa0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public w43 f37931j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f37932k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f37933l;

    public dz2(sa0[] sa0VarArr, ua0[] ua0VarArr) {
        this.f37927e = sa0VarArr;
        this.f37929g = sa0VarArr.length;
        for (int i = 0; i < this.f37929g; i++) {
            this.f37927e[i] = c();
        }
        this.f37928f = ua0VarArr;
        this.f37930h = ua0VarArr.length;
        for (int i10 = 0; i10 < this.f37930h; i10++) {
            this.f37928f[i10] = d();
        }
        cz2 cz2Var = new cz2((iz2) this);
        this.f37923a = cz2Var;
        cz2Var.start();
    }

    @Override // yads.oa0
    public final Object a() {
        synchronized (this.f37924b) {
            try {
                w43 w43Var = this.f37931j;
                if (w43Var != null) {
                    throw w43Var;
                }
                if (this.f37926d.isEmpty()) {
                    return null;
                }
                return (ua0) this.f37926d.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract w43 a(sa0 sa0Var, ua0 ua0Var, boolean z5);

    @Override // yads.oa0
    public final Object b() {
        sa0 sa0Var;
        synchronized (this.f37924b) {
            try {
                w43 w43Var = this.f37931j;
                if (w43Var != null) {
                    throw w43Var;
                }
                if (this.i != null) {
                    throw new IllegalStateException();
                }
                int i = this.f37929g;
                if (i == 0) {
                    sa0Var = null;
                } else {
                    sa0[] sa0VarArr = this.f37927e;
                    int i10 = i - 1;
                    this.f37929g = i10;
                    sa0Var = sa0VarArr[i10];
                }
                this.i = sa0Var;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sa0Var;
    }

    public abstract z43 c();

    public abstract hz2 d();

    public final boolean e() {
        w43 w43Var;
        w43 w43VarA;
        synchronized (this.f37924b) {
            while (!this.f37933l && (this.f37925c.isEmpty() || this.f37930h <= 0)) {
                try {
                    this.f37924b.wait();
                } finally {
                }
            }
            if (this.f37933l) {
                return false;
            }
            sa0 sa0Var = (sa0) this.f37925c.removeFirst();
            ua0[] ua0VarArr = this.f37928f;
            int i = this.f37930h - 1;
            this.f37930h = i;
            ua0 ua0Var = ua0VarArr[i];
            boolean z5 = this.f37932k;
            this.f37932k = false;
            if (sa0Var.b(4)) {
                ua0Var.f43049b = 4 | ua0Var.f43049b;
            } else {
                if (sa0Var.b(VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR)) {
                    ua0Var.f43049b |= VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;
                }
                if (sa0Var.b(134217728)) {
                    ua0Var.f43049b = 134217728 | ua0Var.f43049b;
                }
                try {
                    w43VarA = a(sa0Var, ua0Var, z5);
                } catch (OutOfMemoryError e3) {
                    w43Var = new w43("Unexpected decode error", e3);
                    w43VarA = w43Var;
                } catch (RuntimeException e7) {
                    w43Var = new w43("Unexpected decode error", e7);
                    w43VarA = w43Var;
                }
                if (w43VarA != null) {
                    synchronized (this.f37924b) {
                        this.f37931j = w43VarA;
                    }
                    return false;
                }
            }
            synchronized (this.f37924b) {
                try {
                    if (this.f37932k || ua0Var.b(VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR)) {
                        ua0Var.b();
                    } else {
                        this.f37926d.addLast(ua0Var);
                    }
                    sa0Var.b();
                    sa0[] sa0VarArr = this.f37927e;
                    int i10 = this.f37929g;
                    this.f37929g = i10 + 1;
                    sa0VarArr[i10] = sa0Var;
                } finally {
                }
            }
            return true;
        }
    }

    public final void f() {
        if (this.f37925c.isEmpty() || this.f37930h <= 0) {
            return;
        }
        this.f37924b.notify();
    }

    @Override // yads.oa0
    public final void flush() {
        synchronized (this.f37924b) {
            try {
                this.f37932k = true;
                sa0 sa0Var = this.i;
                if (sa0Var != null) {
                    sa0Var.b();
                    sa0[] sa0VarArr = this.f37927e;
                    int i = this.f37929g;
                    this.f37929g = i + 1;
                    sa0VarArr[i] = sa0Var;
                    this.i = null;
                }
                while (!this.f37925c.isEmpty()) {
                    sa0 sa0Var2 = (sa0) this.f37925c.removeFirst();
                    sa0Var2.b();
                    sa0[] sa0VarArr2 = this.f37927e;
                    int i10 = this.f37929g;
                    this.f37929g = i10 + 1;
                    sa0VarArr2[i10] = sa0Var2;
                }
                while (!this.f37926d.isEmpty()) {
                    ((ua0) this.f37926d.removeFirst()).b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g() {
        int i = this.f37929g;
        sa0[] sa0VarArr = this.f37927e;
        if (i != sa0VarArr.length) {
            throw new IllegalStateException();
        }
        for (sa0 sa0Var : sa0VarArr) {
            sa0Var.c(1024);
        }
    }

    @Override // yads.oa0
    public final void release() {
        synchronized (this.f37924b) {
            this.f37933l = true;
            this.f37924b.notify();
        }
        try {
            this.f37923a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // yads.oa0
    public final void a(z43 z43Var) {
        synchronized (this.f37924b) {
            try {
                w43 w43Var = this.f37931j;
                if (w43Var == null) {
                    if (z43Var == this.i) {
                        this.f37925c.addLast(z43Var);
                        if (!this.f37925c.isEmpty() && this.f37930h > 0) {
                            this.f37924b.notify();
                        }
                        this.i = null;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw w43Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
