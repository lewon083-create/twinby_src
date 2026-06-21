package a1;

import a0.d1;
import android.content.Context;
import e1.u;
import e1.x;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import x0.v;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0.i f326a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s f329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f330e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f331f;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Executor f334j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public v f335k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public x f336l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public e f337m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public d f338n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f339o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f340p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f341q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f342r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public byte[] f343s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public double f344t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f346v;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f327b = new AtomicReference(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f328c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f332g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public z0.b f333h = z0.b.f45783c;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f345u = 0;

    public g(n nVar, Executor executor, Context context) throws h {
        j0.i iVar = new j0.i(executor);
        this.f326a = iVar;
        this.f331f = TimeUnit.MILLISECONDS.toNanos(3000L);
        try {
            s sVar = new s(new l(nVar, context), nVar);
            this.f329d = sVar;
            f fVar = new f(this);
            f2.g.h("AudioStream can not be started when setCallback.", !sVar.f384a.get());
            sVar.a();
            sVar.f387d.execute(new c(sVar, fVar, iVar, 1));
            this.f330e = new t(nVar);
            this.f346v = nVar.f372e;
        } catch (i | IllegalArgumentException e3) {
            throw new h("Unable to create AudioStream", e3);
        }
    }

    public final void a() {
        Executor executor = this.f334j;
        v vVar = this.f335k;
        if (executor == null || vVar == null) {
            return;
        }
        boolean z5 = this.f342r || this.f339o || this.f341q;
        if (Objects.equals(this.f327b.getAndSet(Boolean.valueOf(z5)), Boolean.valueOf(z5))) {
            return;
        }
        executor.execute(new b(0, vVar, z5));
    }

    public final void b(x xVar) {
        x xVar2 = this.f336l;
        z0.b bVar = null;
        if (xVar2 != null) {
            d dVar = this.f338n;
            Objects.requireNonNull(dVar);
            xVar2.v(dVar);
            this.f336l = null;
            this.f338n = null;
            this.f337m = null;
            this.f333h = z0.b.f45783c;
            f();
        }
        if (xVar != null) {
            this.f336l = xVar;
            this.f338n = new d(this, xVar);
            this.f337m = new e(0, this, xVar);
            try {
                ed.d dVarA = xVar.A();
                if (((j1.k) dVarA).f26173c.isDone()) {
                    bVar = (z0.b) ((j1.k) dVarA).f26173c.get();
                }
            } catch (InterruptedException | ExecutionException unused) {
            }
            if (bVar != null) {
                this.f333h = bVar;
                f();
            }
            this.f336l.J(this.f326a, this.f338n);
        }
    }

    public final void c() {
        x xVar = this.f336l;
        Objects.requireNonNull(xVar);
        j1.k kVarW = i0.o.w(new u(xVar, 1));
        e eVar = this.f337m;
        Objects.requireNonNull(eVar);
        k0.j.a(kVarW, eVar, this.f326a);
    }

    public final void d(int i) {
        com.google.android.gms.internal.auth.g.e("AudioSource", "Transitioning internal state: " + a0.u.w(this.f332g) + " --> " + a0.u.w(i));
        this.f332g = i;
    }

    public final void e() {
        if (this.i) {
            this.i = false;
            com.google.android.gms.internal.auth.g.e("AudioSource", "stopSendingAudio");
            s sVar = this.f329d;
            sVar.a();
            if (sVar.f384a.getAndSet(false)) {
                sVar.f387d.execute(new p(sVar, 0));
            }
        }
    }

    public final void f() {
        if (this.f332g != 2) {
            e();
            return;
        }
        boolean z5 = this.f333h == z0.b.f45782b;
        boolean z10 = !z5;
        Executor executor = this.f334j;
        v vVar = this.f335k;
        if (executor != null && vVar != null && this.f328c.getAndSet(z10) != z10) {
            executor.execute(new d1(vVar, z10));
        }
        if (!z5) {
            e();
            return;
        }
        if (this.i) {
            return;
        }
        try {
            com.google.android.gms.internal.auth.g.e("AudioSource", "startSendingAudio");
            this.f329d.c();
            this.f339o = false;
        } catch (i e3) {
            com.google.android.gms.internal.auth.g.P("AudioSource", "Failed to start AudioStream", e3);
            this.f339o = true;
            t tVar = this.f330e;
            tVar.a();
            if (!tVar.f395a.getAndSet(true)) {
                tVar.f400f = System.nanoTime();
            }
            this.f340p = System.nanoTime();
            a();
        }
        this.i = true;
        c();
    }
}
