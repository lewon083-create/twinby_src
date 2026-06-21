package r3;

import com.google.android.gms.internal.ads.tp1;
import com.google.android.gms.internal.measurement.h5;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lj.a f32198a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e[] f32202e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f[] f32203f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f32204g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f32205h;
    public e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public tp1 f32206j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f32207k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f32208l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f32199b = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f32209m = -9223372036854775807L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque f32200c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque f32201d = new ArrayDeque();

    public g(e[] eVarArr, f[] fVarArr) {
        this.f32202e = eVarArr;
        this.f32204g = eVarArr.length;
        for (int i = 0; i < this.f32204g; i++) {
            this.f32202e[i] = f();
        }
        this.f32203f = fVarArr;
        this.f32205h = fVarArr.length;
        for (int i10 = 0; i10 < this.f32205h; i10++) {
            this.f32203f[i10] = g();
        }
        lj.a aVar = new lj.a(this);
        this.f32198a = aVar;
        aVar.start();
    }

    @Override // r3.c
    public final void b(long j10) {
        synchronized (this.f32199b) {
            try {
                h5.r(this.f32204g == this.f32202e.length || this.f32207k);
                this.f32209m = j10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // r3.c
    public final Object e() {
        e eVar;
        synchronized (this.f32199b) {
            try {
                tp1 tp1Var = this.f32206j;
                if (tp1Var != null) {
                    throw tp1Var;
                }
                h5.r(this.i == null);
                int i = this.f32204g;
                if (i == 0) {
                    eVar = null;
                } else {
                    e[] eVarArr = this.f32202e;
                    int i10 = i - 1;
                    this.f32204g = i10;
                    eVar = eVarArr[i10];
                }
                this.i = eVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    public abstract e f();

    @Override // r3.c
    public final void flush() {
        synchronized (this.f32199b) {
            try {
                this.f32207k = true;
                e eVar = this.i;
                if (eVar != null) {
                    eVar.r();
                    e[] eVarArr = this.f32202e;
                    int i = this.f32204g;
                    this.f32204g = i + 1;
                    eVarArr[i] = eVar;
                    this.i = null;
                }
                while (!this.f32200c.isEmpty()) {
                    e eVar2 = (e) this.f32200c.removeFirst();
                    eVar2.r();
                    e[] eVarArr2 = this.f32202e;
                    int i10 = this.f32204g;
                    this.f32204g = i10 + 1;
                    eVarArr2[i10] = eVar2;
                }
                while (!this.f32201d.isEmpty()) {
                    ((f) this.f32201d.removeFirst()).s();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract f g();

    public abstract tp1 h(Throwable th2);

    public abstract tp1 i(e eVar, f fVar, boolean z5);

    public final boolean j() {
        boolean z5;
        tp1 tp1VarH;
        synchronized (this.f32199b) {
            while (!this.f32208l) {
                try {
                    if (!this.f32200c.isEmpty() && this.f32205h > 0) {
                        break;
                    }
                    this.f32199b.wait();
                } finally {
                }
            }
            if (this.f32208l) {
                return false;
            }
            e eVar = (e) this.f32200c.removeFirst();
            f[] fVarArr = this.f32203f;
            int i = this.f32205h - 1;
            this.f32205h = i;
            f fVar = fVarArr[i];
            boolean z10 = this.f32207k;
            this.f32207k = false;
            if (eVar.c(4)) {
                fVar.a(4);
            } else {
                fVar.f32196d = eVar.f32194h;
                if (eVar.c(134217728)) {
                    fVar.a(134217728);
                }
                long j10 = eVar.f32194h;
                synchronized (this.f32199b) {
                    long j11 = this.f32209m;
                    z5 = j11 == -9223372036854775807L || j10 >= j11;
                }
                if (!z5) {
                    fVar.f32197e = true;
                }
                try {
                    tp1VarH = i(eVar, fVar, z10);
                } catch (OutOfMemoryError e3) {
                    tp1VarH = h(e3);
                } catch (RuntimeException e7) {
                    tp1VarH = h(e7);
                }
                if (tp1VarH != null) {
                    synchronized (this.f32199b) {
                        this.f32206j = tp1VarH;
                    }
                    return false;
                }
            }
            synchronized (this.f32199b) {
                try {
                    if (this.f32207k || fVar.f32197e) {
                        fVar.s();
                    } else {
                        this.f32201d.addLast(fVar);
                    }
                    eVar.r();
                    e[] eVarArr = this.f32202e;
                    int i10 = this.f32204g;
                    this.f32204g = i10 + 1;
                    eVarArr[i10] = eVar;
                } finally {
                }
            }
            return true;
        }
    }

    @Override // r3.c
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final f d() {
        synchronized (this.f32199b) {
            try {
                tp1 tp1Var = this.f32206j;
                if (tp1Var != null) {
                    throw tp1Var;
                }
                if (this.f32201d.isEmpty()) {
                    return null;
                }
                return (f) this.f32201d.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // r3.c
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final void a(e eVar) {
        synchronized (this.f32199b) {
            try {
                tp1 tp1Var = this.f32206j;
                if (tp1Var != null) {
                    throw tp1Var;
                }
                h5.h(eVar == this.i);
                this.f32200c.addLast(eVar);
                if (!this.f32200c.isEmpty() && this.f32205h > 0) {
                    this.f32199b.notify();
                }
                this.i = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void m(f fVar) {
        synchronized (this.f32199b) {
            fVar.r();
            f[] fVarArr = this.f32203f;
            int i = this.f32205h;
            this.f32205h = i + 1;
            fVarArr[i] = fVar;
            if (!this.f32200c.isEmpty() && this.f32205h > 0) {
                this.f32199b.notify();
            }
        }
    }

    @Override // r3.c
    public final void release() {
        synchronized (this.f32199b) {
            this.f32208l = true;
            this.f32199b.notify();
        }
        try {
            this.f32198a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
