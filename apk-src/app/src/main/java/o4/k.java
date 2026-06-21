package o4;

import ad.b1;
import ad.h0;
import ad.j0;
import android.content.Context;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import com.google.android.gms.internal.ads.ro0;
import com.google.android.gms.internal.ads.w0;
import com.google.android.gms.internal.measurement.h5;
import io.appmetrica.analytics.impl.lp;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j0 f29658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j3.o f29659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f29660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f29661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Executor f29663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p f29664g;

    public k(p pVar, Context context) {
        this.f29664g = pVar;
        m3.z.I(context);
        h0 h0Var = j0.f818c;
        this.f29658a = b1.f768f;
        this.f29661d = -9223372036854775807L;
        this.f29663f = p.f29667r;
    }

    @Override // o4.z
    public final boolean a() {
        return false;
    }

    @Override // o4.z
    public final Surface b() {
        h5.r(false);
        throw null;
    }

    @Override // o4.z
    public final void c(e eVar) {
        this.f29663f = ed.a.f16332b;
    }

    @Override // o4.z
    public final void d() {
        p pVar = this.f29664g;
        if (pVar.f29671d) {
            pVar.f29672e.d();
        }
    }

    @Override // o4.z
    public final void e() {
        p pVar = this.f29664g;
        if (pVar.f29671d) {
            pVar.f29672e.e();
        }
    }

    @Override // o4.z
    public final void f(long j10) {
        this.f29660c = j10;
    }

    @Override // o4.z
    public final void g(Surface surface, m3.q qVar) {
        p pVar = this.f29664g;
        Pair pair = pVar.f29678l;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((m3.q) pVar.f29678l.second).equals(qVar)) {
            return;
        }
        pVar.f29678l = Pair.create(surface, qVar);
        int i = qVar.f28593a;
    }

    @Override // o4.z
    public final void h(j3.o oVar, long j10, int i, List list) {
        h5.r(false);
        this.f29658a = j0.r(list);
        this.f29659b = oVar;
        this.f29664g.f29682p = false;
        j3.n nVarA = oVar.a();
        j3.g gVar = oVar.D;
        if (gVar == null || !gVar.d()) {
            gVar = j3.g.f26240h;
        }
        nVarA.C = gVar;
        nVarA.a();
        throw null;
    }

    @Override // o4.z
    public final void i() {
        long j10 = this.f29661d;
        p pVar = this.f29664g;
        if (pVar.f29681o >= j10) {
            pVar.f29672e.i();
            pVar.f29682p = true;
        }
    }

    @Override // o4.z
    public final boolean isEnded() {
        return false;
    }

    @Override // o4.z
    public final void j(int i) {
        this.f29664g.f29672e.j(i);
    }

    @Override // o4.z
    public final void k(float f10) {
        p pVar = this.f29664g;
        pVar.i.c(f10);
        pVar.f29672e.k(f10);
    }

    @Override // o4.z
    public final void l() {
        int i = m3.q.f28592c.f28593a;
        this.f29664g.f29678l = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    @Override // o4.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m(j3.o r11) throws o4.y {
        /*
            r10 = this;
            r0 = 0
            r1 = 1
            r0 = r0 ^ r1
            com.google.android.gms.internal.measurement.h5.r(r0)
            java.lang.String r0 = "Color transfer "
            o4.p r2 = r10.f29664g
            int r3 = r2.f29680n
            r4 = 0
            if (r3 != 0) goto L11
            r3 = r1
            goto L12
        L11:
            r3 = r4
        L12:
            com.google.android.gms.internal.measurement.h5.r(r3)
            j3.g r3 = r11.D
            if (r3 == 0) goto L20
            boolean r5 = r3.d()
            if (r5 == 0) goto L20
            goto L22
        L20:
            j3.g r3 = j3.g.f26240h
        L22:
            int r3 = r3.f26243c
            java.lang.String r5 = "EGL_EXT_gl_colorspace_bt2020_pq"
            r6 = 33
            r7 = 7
            if (r3 != r7) goto L3f
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch: m3.i -> L3d
            r9 = 34
            if (r8 >= r9) goto L3f
            if (r8 < r6) goto L3f
            boolean r8 = m3.b.l(r5)     // Catch: m3.i -> L3d
            if (r8 != 0) goto L3a
            goto L3f
        L3a:
            j3.g r11 = new j3.g     // Catch: m3.i -> L3d
            goto L84
        L3d:
            r0 = move-exception
            goto L9a
        L3f:
            r8 = 6
            if (r3 != r8) goto L4f
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch: m3.i -> L3d
            if (r7 < r6) goto L4d
            boolean r5 = m3.b.l(r5)     // Catch: m3.i -> L3d
            if (r5 == 0) goto L4d
            goto L57
        L4d:
            r1 = r4
            goto L57
        L4f:
            if (r3 != r7) goto L57
            java.lang.String r1 = "EGL_EXT_gl_colorspace_bt2020_hlg"
            boolean r1 = m3.b.l(r1)     // Catch: m3.i -> L3d
        L57:
            if (r1 != 0) goto L7b
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: m3.i -> L3d
            r4 = 29
            if (r1 >= r4) goto L60
            goto L7b
        L60:
            java.lang.String r1 = "PlaybackVidGraphWrapper"
            java.util.Locale r4 = java.util.Locale.US     // Catch: m3.i -> L3d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: m3.i -> L3d
            r4.<init>(r0)     // Catch: m3.i -> L3d
            r4.append(r3)     // Catch: m3.i -> L3d
            java.lang.String r0 = " is not supported. Falling back to OpenGl tone mapping."
            r4.append(r0)     // Catch: m3.i -> L3d
            java.lang.String r0 = r4.toString()     // Catch: m3.i -> L3d
            m3.b.s(r1, r0)     // Catch: m3.i -> L3d
            j3.g r11 = j3.g.f26240h     // Catch: m3.i -> L3d
            goto L84
        L7b:
            r0 = 2
            if (r3 == r0) goto L82
            r0 = 10
            if (r3 != r0) goto L84
        L82:
            j3.g r11 = j3.g.f26240h     // Catch: m3.i -> L3d
        L84:
            m3.t r11 = r2.f29673f
            android.os.Looper r0 = android.os.Looper.myLooper()
            r0.getClass()
            r1 = 0
            m3.v r11 = r11.a(r0, r1)
            r2.f29677k = r11
            o4.n r11 = r2.f29669b
            r11.a()
            throw r1
        L9a:
            o4.y r1 = new o4.y
            r1.<init>(r0, r11)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.k.m(j3.o):boolean");
    }

    @Override // o4.z
    public final void n(boolean z5) {
        this.f29661d = -9223372036854775807L;
        p pVar = this.f29664g;
        c cVar = pVar.f29672e;
        if (pVar.f29680n == 1) {
            pVar.f29679m++;
            cVar.n(z5);
            while (pVar.f29676j.f() > 1) {
                pVar.f29676j.c();
            }
            if (pVar.f29676j.f() == 1) {
                ((o) pVar.f29676j.c()).getClass();
                throw null;
            }
            pVar.f29681o = -9223372036854775807L;
            if (z5) {
                pVar.f29682p = false;
            }
            m3.v vVar = pVar.f29677k;
            vVar.getClass();
            vVar.c(new lp(16, pVar));
        }
    }

    @Override // o4.z
    public final void o(List list) {
        if (this.f29658a.equals(list)) {
            return;
        }
        this.f29658a = j0.r(list);
        j3.o oVar = this.f29659b;
        if (oVar == null) {
            return;
        }
        j3.n nVarA = oVar.a();
        j3.g gVar = oVar.D;
        if (gVar == null || !gVar.d()) {
            gVar = j3.g.f26240h;
        }
        nVarA.C = gVar;
        nVarA.a();
        throw null;
    }

    @Override // o4.z
    public final void p(long j10, long j11) throws y {
        this.f29664g.f29672e.p(j10 + this.f29660c, j11);
    }

    @Override // o4.z
    public final void q(boolean z5) {
        p pVar = this.f29664g;
        if (pVar.f29671d) {
            pVar.f29672e.q(z5);
        }
    }

    @Override // o4.z
    public final boolean r(boolean z5) {
        return this.f29664g.f29672e.f29601a.b(false);
    }

    @Override // o4.z
    public final void release() {
        p pVar = this.f29664g;
        if (pVar.f29680n == 2) {
            return;
        }
        m3.v vVar = pVar.f29677k;
        if (vVar != null) {
            vVar.f28601a.removeCallbacksAndMessages(null);
        }
        pVar.f29678l = null;
        pVar.f29680n = 2;
    }

    @Override // o4.z
    public final void t(q qVar) {
        this.f29664g.f29672e.f29609j = qVar;
    }

    @Override // o4.z
    public final boolean u(long j10, f fVar) {
        int i;
        h5.r(false);
        long j11 = j10 + this.f29660c;
        p pVar = this.f29664g;
        w0 w0Var = pVar.i;
        long j12 = w0Var.f11555a == -9223372036854775807L ? -9223372036854775807L : (long) (((j11 - r2) * w0Var.f11557c) + w0Var.f11556b);
        if (j12 != -9223372036854775807L) {
            long j13 = pVar.f29675h;
            if (j13 != -9223372036854775807L && j12 < j13 && (i = this.f29662e) < 2) {
                this.f29662e = i + 1;
                i iVar = fVar.f29613c;
                b4.m mVar = fVar.f29611a;
                int i10 = fVar.f29612b;
                Trace.beginSection("dropVideoBuffer");
                mVar.g(i10);
                Trace.endSection();
                iVar.P0(0, 1);
                return true;
            }
        }
        int i11 = pVar.f29683q;
        if (i11 == -1 || i11 != 0) {
            return false;
        }
        throw null;
    }

    @Override // o4.z
    public final void v() {
        p pVar = this.f29664g;
        if (pVar.f29676j.f() == 0) {
            pVar.f29672e.v();
            return;
        }
        ro0 ro0Var = new ro0(1);
        if (pVar.f29676j.f() <= 0) {
            pVar.f29676j = ro0Var;
        } else {
            ((o) pVar.f29676j.c()).getClass();
            throw null;
        }
    }

    @Override // o4.z
    public final void s() {
    }
}
