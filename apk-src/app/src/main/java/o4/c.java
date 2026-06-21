package o4;

import android.view.Surface;
import com.google.android.gms.internal.ads.a1;
import com.google.android.gms.internal.ads.b1;
import com.google.android.gms.internal.ads.rg0;
import com.google.android.gms.internal.ads.ro0;
import com.google.android.gms.internal.ads.w0;
import com.google.android.gms.internal.ads.x0;
import com.google.android.gms.internal.measurement.h5;
import io.appmetrica.analytics.impl.lp;
import j3.y0;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f29601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w0 f29602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b1 f29603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque f29604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Surface f29605e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public j3.o f29606f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f29607g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public x f29608h;
    public Executor i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public q f29609j;

    public c(r rVar, w0 w0Var, m3.t tVar) {
        this.f29601a = rVar;
        this.f29602b = w0Var;
        rVar.f29694l = tVar;
        this.f29603c = new b1(new l6.i(9, this), rVar, w0Var);
        this.f29604d = new ArrayDeque();
        this.f29606f = new j3.o(new j3.n());
        this.f29607g = -9223372036854775807L;
        this.f29608h = x.f29702a;
        this.i = new com.yandex.div.core.dagger.b(3);
        this.f29609j = new a();
    }

    @Override // o4.z
    public final boolean a() {
        return true;
    }

    @Override // o4.z
    public final Surface b() {
        Surface surface = this.f29605e;
        surface.getClass();
        return surface;
    }

    @Override // o4.z
    public final void c(e eVar) {
        this.f29608h = eVar;
        this.i = ed.a.f16332b;
    }

    @Override // o4.z
    public final void d() {
        this.f29602b.b();
        r rVar = this.f29601a;
        rVar.f29687d = false;
        rVar.i = -9223372036854775807L;
        a1 a1Var = rVar.f29685b;
        a1Var.f2697b = false;
        x0 x0Var = (x0) a1Var.f2713s;
        if (x0Var != null) {
            x0Var.f();
        }
        a1Var.a();
    }

    @Override // o4.z
    public final void e() {
        this.f29602b.b();
        this.f29601a.d();
    }

    @Override // o4.z
    public final void f(long j10) {
        throw new UnsupportedOperationException();
    }

    @Override // o4.z
    public final void g(Surface surface, m3.q qVar) {
        this.f29605e = surface;
        this.f29601a.g(surface);
    }

    @Override // o4.z
    public final void h(j3.o oVar, long j10, int i, List list) {
        h5.r(list.isEmpty());
        int i10 = oVar.f26342u;
        int i11 = oVar.f26343v;
        j3.o oVar2 = this.f29606f;
        int i12 = oVar2.f26342u;
        b1 b1Var = this.f29603c;
        if (i10 != i12 || i11 != oVar2.f26343v) {
            ro0 ro0Var = (ro0) b1Var.f3550h;
            long j11 = b1Var.f3543a;
            ro0Var.a(j11 == -9223372036854775807L ? 0L : j11 + 1, new y0(i10, i11));
        }
        float f10 = oVar.f26346y;
        if (f10 != this.f29606f.f26346y) {
            this.f29601a.f(f10);
        }
        this.f29606f = oVar;
        if (j10 != this.f29607g) {
            if (((rg0) b1Var.f3551j).f9933c == 0) {
                ((r) b1Var.f3548f).e(i);
                b1Var.f3546d = j10;
            } else {
                ro0 ro0Var2 = (ro0) b1Var.i;
                long j12 = b1Var.f3543a;
                ro0Var2.a(j12 == -9223372036854775807L ? -4611686018427387904L : j12 + 1, Long.valueOf(j10));
            }
            this.f29607g = j10;
        }
    }

    @Override // o4.z
    public final void i() {
        b1 b1Var = this.f29603c;
        if (b1Var.f3543a == -9223372036854775807L) {
            b1Var.f3543a = Long.MIN_VALUE;
            b1Var.f3544b = Long.MIN_VALUE;
        }
        b1Var.f3545c = b1Var.f3543a;
    }

    @Override // o4.z
    public final boolean isEnded() {
        b1 b1Var = this.f29603c;
        long j10 = b1Var.f3545c;
        return j10 != -9223372036854775807L && b1Var.f3544b == j10;
    }

    @Override // o4.z
    public final void j(int i) {
        a1 a1Var = this.f29601a.f29685b;
        if (a1Var.f2703h == i) {
            return;
        }
        a1Var.f2703h = i;
        a1Var.d(true);
    }

    @Override // o4.z
    public final void k(float f10) {
        this.f29601a.h(f10);
    }

    @Override // o4.z
    public final void l() {
        this.f29605e = null;
        this.f29601a.g(null);
    }

    @Override // o4.z
    public final boolean m(j3.o oVar) {
        return true;
    }

    @Override // o4.z
    public final void n(boolean z5) {
        if (z5) {
            r rVar = this.f29601a;
            rVar.f29685b.b();
            rVar.f29691h = -9223372036854775807L;
            rVar.f29689f = -9223372036854775807L;
            rVar.f29688e = Math.min(rVar.f29688e, 1);
            rVar.i = -9223372036854775807L;
        }
        this.f29602b.b();
        b1 b1Var = this.f29603c;
        ro0 ro0Var = (ro0) b1Var.f3550h;
        rg0 rg0Var = (rg0) b1Var.f3551j;
        rg0Var.f9931a = 0;
        rg0Var.f9932b = -1;
        rg0Var.f9933c = 0;
        b1Var.f3543a = -9223372036854775807L;
        b1Var.f3544b = -9223372036854775807L;
        b1Var.f3545c = -9223372036854775807L;
        ro0 ro0Var2 = (ro0) b1Var.i;
        if (ro0Var2.f() > 0) {
            h5.h(ro0Var2.f() > 0);
            while (ro0Var2.f() > 1) {
                ro0Var2.c();
            }
            Object objC = ro0Var2.c();
            objC.getClass();
            b1Var.f3546d = ((Long) objC).longValue();
        }
        if (ro0Var.f() > 0) {
            h5.h(ro0Var.f() > 0);
            while (ro0Var.f() > 1) {
                ro0Var.c();
            }
            Object objC2 = ro0Var.c();
            objC2.getClass();
            ro0Var.a(0L, (y0) objC2);
        }
        this.f29604d.clear();
    }

    @Override // o4.z
    public final void o(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // o4.z
    public final void p(long j10, long j11) throws y {
        try {
            this.f29603c.a(j10, j11);
        } catch (s3.i e3) {
            throw new y(e3, this.f29606f);
        }
    }

    @Override // o4.z
    public final void q(boolean z5) {
        this.f29601a.c(z5);
    }

    @Override // o4.z
    public final boolean r(boolean z5) {
        return this.f29601a.b(z5);
    }

    @Override // o4.z
    public final void s() {
        throw new UnsupportedOperationException();
    }

    @Override // o4.z
    public final void t(q qVar) {
        this.f29609j = qVar;
    }

    @Override // o4.z
    public final boolean u(long j10, f fVar) {
        this.f29604d.add(fVar);
        b1 b1Var = this.f29603c;
        rg0 rg0Var = (rg0) b1Var.f3551j;
        int i = rg0Var.f9933c;
        long[] jArr = rg0Var.f9934d;
        if (i == jArr.length) {
            int length = jArr.length << 1;
            if (length < 0) {
                throw new IllegalStateException();
            }
            long[] jArr2 = new long[length];
            int length2 = jArr.length;
            int i10 = rg0Var.f9931a;
            int i11 = length2 - i10;
            System.arraycopy(jArr, i10, jArr2, 0, i11);
            System.arraycopy(rg0Var.f9934d, 0, jArr2, i11, i10);
            rg0Var.f9931a = 0;
            rg0Var.f9932b = rg0Var.f9933c - 1;
            rg0Var.f9934d = jArr2;
            rg0Var.f9935e = length - 1;
        }
        int i12 = (rg0Var.f9932b + 1) & rg0Var.f9935e;
        rg0Var.f9932b = i12;
        rg0Var.f9934d[i12] = j10;
        rg0Var.f9933c++;
        b1Var.f3543a = j10;
        b1Var.f3545c = -9223372036854775807L;
        this.i.execute(new lp(15, this));
        return true;
    }

    @Override // o4.z
    public final void v() {
        r rVar = this.f29601a;
        if (rVar.f29688e == 0) {
            rVar.f29688e = 1;
        }
    }

    @Override // o4.z
    public final void release() {
    }
}
