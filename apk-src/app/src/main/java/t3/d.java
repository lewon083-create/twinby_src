package t3;

import ad.b1;
import ad.g1;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.yf0;
import com.google.android.gms.internal.measurement.h5;
import com.vk.api.sdk.exceptions.VKApiCodes;
import fj.o0;
import i4.c0;
import i4.j0;
import i4.u;
import j3.b0;
import j3.e0;
import j3.f0;
import j3.g0;
import j3.h0;
import j3.i0;
import j3.m0;
import j3.n0;
import j3.u0;
import j3.x;
import j3.y0;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import m3.k;
import m3.t;
import m3.v;
import m3.z;
import q9.o;
import s3.q;
import s3.s;
import s3.y;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements h0, j0, x3.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f33417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0 f33418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n0 f33419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f33420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseArray f33421e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public yf0 f33422f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public j3.j0 f33423g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public v f33424h;
    public boolean i;

    public d(t tVar) {
        tVar.getClass();
        this.f33417a = tVar;
        String str = z.f28608a;
        Looper looperMyLooper = Looper.myLooper();
        this.f33422f = new yf0((looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper).getThread(), 2);
        m0 m0Var = new m0();
        this.f33418b = m0Var;
        this.f33419c = new n0();
        o oVar = new o();
        oVar.f31946a = m0Var;
        ad.h0 h0Var = ad.j0.f818c;
        oVar.f31947b = b1.f768f;
        oVar.f31948c = g1.f796h;
        this.f33420d = oVar;
        this.f33421e = new SparseArray();
    }

    public final void A(y yVar, Looper looper) {
        h5.r(this.f33423g == null || ((ad.j0) this.f33420d.f31947b).isEmpty());
        yVar.getClass();
        this.f33423g = yVar;
        this.f33424h = this.f33417a.a(looper, null);
        yf0 yf0Var = this.f33422f;
        oi.i iVar = new oi.i(19, this, yVar);
        yf0Var.getClass();
        t tVar = this.f33417a;
        h5.r(tVar != null);
        this.f33422f = new yf0((CopyOnWriteArraySet) yf0Var.f12613f, looper, looper.getThread(), tVar, iVar, yf0Var.f12609b);
    }

    @Override // j3.h0
    public final void a(e0 e0Var) {
        c0 c0Var;
        z((!(e0Var instanceof s3.i) || (c0Var = ((s3.i) e0Var).i) == null) ? u() : v(c0Var), 10, new b(10));
    }

    @Override // j3.h0
    public final void b(int i) {
        z(y(), 21, new c(2));
    }

    @Override // i4.j0
    public final void c(int i, c0 c0Var, u uVar, f4.g gVar) {
        z(x(i, c0Var), 1001, new b(29));
    }

    @Override // j3.h0
    public final void d(f0 f0Var) {
        z(u(), 12, new b(9));
    }

    @Override // j3.h0
    public final void e(j3.d dVar) {
        z(y(), 20, new b(3));
    }

    @Override // i4.j0
    public final void f(int i, c0 c0Var, u uVar, f4.g gVar, int i10) {
        z(x(i, c0Var), 1000, new b(21));
    }

    @Override // i4.j0
    public final void g(int i, c0 c0Var, f4.g gVar) {
        z(x(i, c0Var), 1005, new c(6));
    }

    @Override // j3.h0
    public final void h(x xVar, int i) {
        z(u(), 1, new c(16));
    }

    @Override // j3.h0
    public final void i(l3.c cVar) {
        z(u(), 27, new b(25));
    }

    @Override // j3.h0
    public final void j(int i) {
        j3.j0 j0Var = this.f33423g;
        j0Var.getClass();
        o oVar = this.f33420d;
        oVar.f31949d = o.k(j0Var, (ad.j0) oVar.f31947b, (c0) oVar.f31950e, (m0) oVar.f31946a);
        oVar.q(((y) j0Var).M());
        z(u(), 0, new c(15));
    }

    @Override // j3.h0
    public final void k(g0 g0Var) {
        z(u(), 13, new c(14));
    }

    @Override // i4.j0
    public final void m(int i, c0 c0Var, u uVar, f4.g gVar, IOException iOException, boolean z5) {
        a aVarX = x(i, c0Var);
        z(aVarX, 1003, new q(aVarX, uVar, gVar, iOException, z5));
    }

    @Override // j3.h0
    public final void n(int i) {
        z(u(), 8, new c(9));
    }

    @Override // j3.h0
    public final void o(i0 i0Var, i0 i0Var2, int i) {
        if (i == 1) {
            this.i = false;
        }
        j3.j0 j0Var = this.f33423g;
        j0Var.getClass();
        o oVar = this.f33420d;
        oVar.f31949d = o.k(j0Var, (ad.j0) oVar.f31947b, (c0) oVar.f31950e, (m0) oVar.f31946a);
        a aVarU = u();
        z(aVarU, 11, new o0(aVarU, i, i0Var, i0Var2));
    }

    @Override // j3.h0
    public final void onCues(List list) {
        z(u(), 27, new b(13));
    }

    @Override // j3.h0
    public final void onIsLoadingChanged(boolean z5) {
        z(u(), 3, new c(12));
    }

    @Override // j3.h0
    public final void onIsPlayingChanged(boolean z5) {
        z(u(), 7, new b(5));
    }

    @Override // j3.h0
    public final void onPlayWhenReadyChanged(boolean z5, int i) {
        z(u(), 5, new b(11));
    }

    @Override // j3.h0
    public final void onPlaybackStateChanged(int i) {
        z(u(), 4, new b(15));
    }

    @Override // j3.h0
    public final void onPlaybackSuppressionReasonChanged(int i) {
        z(u(), 6, new b(7));
    }

    @Override // j3.h0
    public final void onPlayerError(e0 e0Var) {
        c0 c0Var;
        a aVarU = (!(e0Var instanceof s3.i) || (c0Var = ((s3.i) e0Var).i) == null) ? u() : v(c0Var);
        z(aVarU, 10, new q(11, aVarU, e0Var));
    }

    @Override // j3.h0
    public final void onPlayerStateChanged(boolean z5, int i) {
        z(u(), -1, new b(2));
    }

    @Override // j3.h0
    public final void onSkipSilenceEnabledChanged(boolean z5) {
        z(y(), 23, new c(8));
    }

    @Override // j3.h0
    public final void onSurfaceSizeChanged(int i, int i10) {
        z(y(), 24, new b(20));
    }

    @Override // j3.h0
    public final void onVideoSizeChanged(y0 y0Var) {
        a aVarY = y();
        z(aVarY, 25, new s(aVarY, y0Var));
    }

    @Override // j3.h0
    public final void onVolumeChanged(float f10) {
        z(y(), 22, new b(0));
    }

    @Override // j3.h0
    public final void p(b0 b0Var) {
        z(u(), 28, new b(4));
    }

    @Override // j3.h0
    public final void q(u0 u0Var) {
        z(u(), 2, new b(17));
    }

    @Override // j3.h0
    public final void r(j3.z zVar) {
        z(u(), 14, new c(5));
    }

    @Override // i4.j0
    public final void s(int i, c0 c0Var, u uVar, f4.g gVar) {
        z(x(i, c0Var), 1002, new b(27));
    }

    @Override // i4.j0
    public final void t(int i, c0 c0Var, f4.g gVar) {
        a aVarX = x(i, c0Var);
        z(aVarX, VKApiCodes.CODE_PHONE_ALREADY_USED, new oi.i(20, aVarX, gVar));
    }

    public final a u() {
        return v((c0) this.f33420d.f31949d);
    }

    public final a v(c0 c0Var) {
        this.f33423g.getClass();
        j3.o0 o0Var = c0Var == null ? null : (j3.o0) ((g1) this.f33420d.f31948c).get(c0Var);
        if (c0Var != null && o0Var != null) {
            return w(o0Var, o0Var.g(c0Var.f20861a, this.f33418b).f26276c, c0Var);
        }
        int I = ((y) this.f33423g).I();
        j3.o0 o0VarM = ((y) this.f33423g).M();
        if (I >= o0VarM.o()) {
            o0VarM = j3.o0.f26348a;
        }
        return w(o0VarM, I, null);
    }

    public final a w(j3.o0 o0Var, int i, c0 c0Var) {
        c0 c0Var2 = o0Var.p() ? null : c0Var;
        this.f33417a.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z5 = o0Var.equals(((y) this.f33423g).M()) && i == ((y) this.f33423g).I();
        long jZ = 0;
        if (c0Var2 == null || !c0Var2.b()) {
            if (z5) {
                y yVar = (y) this.f33423g;
                yVar.n0();
                jZ = yVar.F(yVar.f32702j0);
            } else if (!o0Var.p()) {
                jZ = z.Z(o0Var.m(i, this.f33419c, 0L).f26318l);
            }
        } else if (z5 && ((y) this.f33423g).G() == c0Var2.f20862b && ((y) this.f33423g).H() == c0Var2.f20863c) {
            jZ = ((y) this.f33423g).K();
        }
        c0 c0Var3 = (c0) this.f33420d.f31949d;
        j3.o0 o0VarM = ((y) this.f33423g).M();
        int I = ((y) this.f33423g).I();
        long jK = ((y) this.f33423g).K();
        y yVar2 = (y) this.f33423g;
        yVar2.n0();
        return new a(jElapsedRealtime, o0Var, i, c0Var2, jZ, o0VarM, I, c0Var3, jK, z.Z(yVar2.f32702j0.f32673r));
    }

    public final a x(int i, c0 c0Var) {
        this.f33423g.getClass();
        if (c0Var != null) {
            return ((j3.o0) ((g1) this.f33420d.f31948c).get(c0Var)) != null ? v(c0Var) : w(j3.o0.f26348a, i, c0Var);
        }
        j3.o0 o0VarM = ((y) this.f33423g).M();
        if (i >= o0VarM.o()) {
            o0VarM = j3.o0.f26348a;
        }
        return w(o0VarM, i, null);
    }

    public final a y() {
        return v((c0) this.f33420d.f31951f);
    }

    public final void z(a aVar, int i, k kVar) {
        this.f33421e.put(i, aVar);
        this.f33422f.e(i, kVar);
    }

    @Override // j3.h0
    public final void l() {
    }
}
