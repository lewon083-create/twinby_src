package yads;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.vk.api.sdk.exceptions.VKApiCodes;
import java.io.IOException;
import java.util.List;
import yads.af;
import yads.ye;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class kb0 implements se {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xv f40136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s63 f40137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u63 f40138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final jb0 f40139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseArray f40140e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public rf1 f40141f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public qe2 f40142g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public l53 f40143h;

    public kb0(xv xvVar) {
        this.f40136a = (xv) ni.a(xvVar);
        this.f40141f = new rf1(lb3.c(), xvVar, new zl.g0(0));
        s63 s63Var = new s63();
        this.f40137b = s63Var;
        this.f40138c = new u63();
        this.f40139d = new jb0(s63Var);
        this.f40140e = new SparseArray();
    }

    public static /* synthetic */ void a(af afVar, ew0 ew0Var) {
    }

    public final ye b() {
        return a(this.f40139d.f39808f);
    }

    public final ye e(int i, an1 an1Var) {
        this.f40142g.getClass();
        if (an1Var != null) {
            return ((v63) this.f40139d.f39805c.get(an1Var)) != null ? a(an1Var) : a(v63.f43913b, i, an1Var);
        }
        ao0 ao0Var = (ao0) this.f40142g;
        ao0Var.r();
        v63 v63Var = ao0Var.Z.f38095a;
        if (i >= v63Var.b()) {
            v63Var = v63.f43913b;
        }
        return a(v63Var, i, (an1) null);
    }

    @Override // yads.oe2
    public final void onCues(List list) {
        ye yeVarA = a();
        a(yeVarA, 27, new zl.s(6, yeVarA, list));
    }

    @Override // yads.oe2
    public final void onIsLoadingChanged(boolean z5) {
        ye yeVarA = a();
        a(yeVarA, 3, new zl.k0(yeVarA, z5, 1));
    }

    @Override // yads.oe2
    public final void onIsPlayingChanged(boolean z5) {
        ye yeVarA = a();
        a(yeVarA, 7, new zl.k0(yeVarA, z5, 0));
    }

    @Override // yads.oe2
    public final void onPlayWhenReadyChanged(boolean z5, int i) {
        ye yeVarA = a();
        a(yeVarA, 5, new zl.d0(yeVarA, z5, i, 1));
    }

    @Override // yads.oe2
    public final void onPlaybackStateChanged(int i) {
        ye yeVarA = a();
        a(yeVarA, 4, new zl.f0(yeVarA, i, 1));
    }

    @Override // yads.oe2
    public final void onPlaybackSuppressionReasonChanged(int i) {
        ye yeVarA = a();
        a(yeVarA, 6, new zl.f0(yeVarA, i, 2));
    }

    @Override // yads.oe2
    public final void onPlayerStateChanged(boolean z5, int i) {
        ye yeVarA = a();
        a(yeVarA, -1, new zl.d0(yeVarA, z5, i, 2));
    }

    @Override // yads.oe2
    public final void onSkipSilenceEnabledChanged(boolean z5) {
        ye yeVarB = b();
        a(yeVarB, 23, new zl.k0(yeVarB, z5, 2));
    }

    @Override // yads.oe2
    public final void onSurfaceSizeChanged(int i, int i10) {
        ye yeVarB = b();
        a(yeVarB, 24, new q0.d(yeVarB, i, i10));
    }

    @Override // yads.oe2
    public final void onVolumeChanged(final float f10) {
        final ye yeVarB = b();
        a(yeVarB, 22, new of1() { // from class: zl.a0
            @Override // yads.of1
            public final void invoke(Object obj) {
                float f11 = f10;
                ye yeVar = yeVarB;
                ((af) obj).getClass();
            }
        });
    }

    public final ye a() {
        return a(this.f40139d.f39806d);
    }

    public final ye a(an1 an1Var) {
        this.f40142g.getClass();
        v63 v63Var = an1Var == null ? null : (v63) this.f40139d.f39805c.get(an1Var);
        if (an1Var != null && v63Var != null) {
            return a(v63Var, v63Var.a(an1Var.f43366a, this.f40137b).f42825d, an1Var);
        }
        int iE = ((ao0) this.f40142g).e();
        ao0 ao0Var = (ao0) this.f40142g;
        ao0Var.r();
        v63 v63Var2 = ao0Var.Z.f38095a;
        if (iE >= v63Var2.b()) {
            v63Var2 = v63.f43913b;
        }
        return a(v63Var2, iE, (an1) null);
    }

    @Override // yads.qk0
    public final void d(int i, an1 an1Var) {
        ye yeVarE = e(i, an1Var);
        a(yeVarE, 1026, new zl.j0(yeVarE, 3));
    }

    public static void b(ye yeVar, int i, long j10, long j11, af afVar) {
        String str;
        om1 om1Var = (om1) afVar;
        om1Var.getClass();
        an1 an1Var = yeVar.f45030d;
        if (an1Var != null) {
            oe0 oe0Var = om1Var.f41628b;
            v63 v63Var = yeVar.f45028b;
            synchronized (oe0Var) {
                str = oe0Var.a(v63Var.a(an1Var.f43366a, oe0Var.f41525b).f42825d, an1Var).f41235a;
            }
            Long l10 = (Long) om1Var.f41634h.get(str);
            Long l11 = (Long) om1Var.f41633g.get(str);
            om1Var.f41634h.put(str, Long.valueOf((l10 == null ? 0L : l10.longValue()) + j10));
            om1Var.f41633g.put(str, Long.valueOf((l11 != null ? l11.longValue() : 0L) + ((long) i)));
        }
    }

    public static void c(ye yeVar, pa0 pa0Var, af afVar) {
        om1 om1Var = (om1) afVar;
        om1Var.f41649x += pa0Var.f41857g;
        om1Var.f41650y += pa0Var.f41855e;
    }

    public final void d(pa0 pa0Var) {
        ye yeVarB = b();
        a(yeVarB, 1015, new zl.w(yeVarB, pa0Var, 3));
    }

    public final void d() {
        ye yeVarA = a();
        a(yeVarA, 1028, new zl.j0(yeVarA, 2));
        rf1 rf1Var = this.f40141f;
        for (qf1 qf1Var : rf1Var.f42589d) {
            pf1 pf1Var = rf1Var.f42588c;
            qf1Var.f42292d = true;
            if (qf1Var.f42291c) {
                pf1Var.a(qf1Var.f42289a, qf1Var.f42290b.a());
            }
        }
        rf1Var.f42589d.clear();
        rf1Var.f42592g = true;
    }

    @Override // yads.qk0
    public final void c(int i, an1 an1Var) {
        ye yeVarE = e(i, an1Var);
        a(yeVarE, 1025, new zl.j0(yeVarE, 4));
    }

    @Override // yads.en1
    public final void c(int i, an1 an1Var, xf1 xf1Var, jm1 jm1Var) {
        ye yeVarE = e(i, an1Var);
        a(yeVarE, 1002, new zl.i0(yeVarE, xf1Var, jm1Var, 0));
    }

    public final void c(Exception exc) {
        ye yeVarB = b();
        a(yeVarB, 1030, new zl.z(yeVarB, exc, 0));
    }

    @Override // yads.oe2
    public final void onRenderedFirstFrame() {
    }

    public final void c(pa0 pa0Var) {
        ye yeVarA = a(this.f40139d.f39807e);
        a(yeVarA, 1020, new zl.w(yeVarA, pa0Var, 0));
    }

    public final ye a(v63 v63Var, int i, an1 an1Var) {
        an1 an1Var2 = v63Var.c() ? null : an1Var;
        ((i53) this.f40136a).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        ao0 ao0Var = (ao0) this.f40142g;
        ao0Var.r();
        boolean z5 = v63Var.equals(ao0Var.Z.f38095a) && i == ((ao0) this.f40142g).e();
        long jB = 0;
        if (an1Var2 == null || !an1Var2.a()) {
            if (z5) {
                jB = ((ao0) this.f40142g).b();
            } else if (!v63Var.c()) {
                jB = lb3.b(v63Var.a(i, this.f40138c, 0L).f43590n);
            }
        } else if (z5 && ((ao0) this.f40142g).c() == an1Var2.f43367b && ((ao0) this.f40142g).d() == an1Var2.f43368c) {
            ao0 ao0Var2 = (ao0) this.f40142g;
            ao0Var2.r();
            jB = lb3.b(ao0Var2.a(ao0Var2.Z));
        }
        an1 an1Var3 = this.f40139d.f39806d;
        ao0 ao0Var3 = (ao0) this.f40142g;
        ao0Var3.r();
        v63 v63Var2 = ao0Var3.Z.f38095a;
        int iE = ((ao0) this.f40142g).e();
        ao0 ao0Var4 = (ao0) this.f40142g;
        ao0Var4.r();
        long jB2 = lb3.b(ao0Var4.a(ao0Var4.Z));
        ao0 ao0Var5 = (ao0) this.f40142g;
        ao0Var5.r();
        return new ye(jElapsedRealtime, v63Var, i, an1Var2, jB, v63Var2, iE, an1Var3, jB2, lb3.b(ao0Var5.Z.f38110q));
    }

    public final void c() {
        l53 l53Var = this.f40143h;
        if (l53Var != null) {
            l53Var.f40427a.post(new t.a0(25, this));
            return;
        }
        throw new IllegalStateException();
    }

    public final void b(pa0 pa0Var) {
        ye yeVarB = b();
        a(yeVarB, 1007, new zl.w(yeVarB, pa0Var, 2));
    }

    public final void b(Exception exc) {
        ye yeVarB = b();
        a(yeVarB, 1014, new zl.z(yeVarB, exc, 3));
    }

    public final void b(int i, long j10, long j11) {
        jb0 jb0Var = this.f40139d;
        ye yeVarA = a(jb0Var.f39804b.isEmpty() ? null : (an1) xd1.a(jb0Var.f39804b));
        a(yeVarA, 1006, new zl.l0(yeVarA, i, j10, j11, 1));
    }

    @Override // yads.en1
    public final void b(int i, an1 an1Var, jm1 jm1Var) {
        ye yeVarE = e(i, an1Var);
        a(yeVarE, VKApiCodes.CODE_PHONE_ALREADY_USED, new zl.h0(yeVarE, jm1Var, 0));
    }

    @Override // yads.qk0
    public final void b(int i, an1 an1Var) {
        ye yeVarE = e(i, an1Var);
        a(yeVarE, 1027, new zl.j0(yeVarE, 0));
    }

    @Override // yads.en1
    public final void b(int i, an1 an1Var, xf1 xf1Var, jm1 jm1Var) {
        ye yeVarE = e(i, an1Var);
        a(yeVarE, 1000, new zl.i0(yeVarE, xf1Var, jm1Var, 1));
    }

    @Override // yads.oe2
    public final void b(qn0 qn0Var) {
        ye yeVarA;
        tm1 tm1Var;
        if (qn0Var != null && (tm1Var = qn0Var.i) != null) {
            yeVarA = a(new an1(tm1Var));
        } else {
            yeVarA = a();
        }
        a(yeVarA, 10, new zl.c0(yeVarA, qn0Var, 1));
    }

    public final void b(String str, long j10, long j11) {
        ye yeVarB = b();
        a(yeVarB, 1016, new zl.b0(yeVarB, str, j11, j10, 0));
    }

    public final void b(String str) {
        ye yeVarB = b();
        a(yeVarB, 1019, new zl.e0(yeVarB, str, 1));
    }

    public final void b(int i, long j10) {
        ye yeVarA = a(this.f40139d.f39807e);
        a(yeVarA, 1021, new zl.x(yeVarA, j10, i));
    }

    public final void b(nx0 nx0Var, va0 va0Var) {
        ye yeVarB = b();
        a(yeVarB, 1017, new zl.y(yeVarB, nx0Var, va0Var, 0));
    }

    public static void a(ye yeVar, jm1 jm1Var, af afVar) {
        String str;
        om1 om1Var = (om1) afVar;
        om1Var.getClass();
        if (yeVar.f45030d == null) {
            return;
        }
        nx0 nx0Var = jm1Var.f39909c;
        nx0Var.getClass();
        int i = jm1Var.f39910d;
        oe0 oe0Var = om1Var.f41628b;
        v63 v63Var = yeVar.f45028b;
        an1 an1Var = yeVar.f45030d;
        an1Var.getClass();
        synchronized (oe0Var) {
            str = oe0Var.a(v63Var.a(an1Var.f43366a, oe0Var.f41525b).f42825d, an1Var).f41235a;
        }
        nm1 nm1Var = new nm1(nx0Var, i, str);
        int i10 = jm1Var.f39908b;
        if (i10 != 0) {
            if (i10 == 1) {
                om1Var.f41641p = nm1Var;
                return;
            } else if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                om1Var.f41642q = nm1Var;
                return;
            }
        }
        om1Var.f41640o = nm1Var;
    }

    public static void a(ye yeVar, xf1 xf1Var, jm1 jm1Var, IOException iOException, boolean z5, af afVar) {
        om1 om1Var = (om1) afVar;
        om1Var.getClass();
        om1Var.f41647v = jm1Var.f39907a;
    }

    public static void a(ye yeVar, de2 de2Var, af afVar) {
        ((om1) afVar).f41639n = de2Var;
    }

    public static void a(ye yeVar, int i, pe2 pe2Var, pe2 pe2Var2, af afVar) {
        afVar.getClass();
        om1 om1Var = (om1) afVar;
        if (i == 1) {
            om1Var.f41646u = true;
        }
        om1Var.f41636k = i;
    }

    public static void a(ye yeVar, rj3 rj3Var, af afVar) {
        om1 om1Var = (om1) afVar;
        nm1 nm1Var = om1Var.f41640o;
        if (nm1Var != null) {
            nx0 nx0Var = nm1Var.f41291a;
            if (nx0Var.f41381s == -1) {
                mx0 mx0Var = new mx0(nx0Var);
                mx0Var.f41080p = rj3Var.f42611b;
                mx0Var.f41081q = rj3Var.f42612c;
                om1Var.f41640o = new nm1(new nx0(mx0Var), nm1Var.f41292b, nm1Var.f41293c);
            }
        }
        int i = rj3Var.f42611b;
    }

    public final /* synthetic */ void a(qe2 qe2Var, af afVar, ew0 ew0Var) {
        ((om1) afVar).a(qe2Var, new ze(ew0Var, this.f40140e));
    }

    public final void a(Exception exc) {
        ye yeVarB = b();
        a(yeVarB, 1029, new zl.z(yeVarB, exc, 2));
    }

    public final void a(String str, long j10, long j11) {
        ye yeVarB = b();
        a(yeVarB, 1008, new zl.b0(yeVarB, str, j11, j10, 1));
    }

    public final void a(String str) {
        ye yeVarB = b();
        a(yeVarB, 1012, new zl.e0(yeVarB, str, 0));
    }

    public final void a(pa0 pa0Var) {
        ye yeVarA = a(this.f40139d.f39807e);
        a(yeVarA, 1013, new zl.w(yeVarA, pa0Var, 1));
    }

    public final void a(nx0 nx0Var, va0 va0Var) {
        ye yeVarB = b();
        a(yeVarB, 1009, new zl.y(yeVarB, nx0Var, va0Var, 1));
    }

    public final void a(long j10) {
        ye yeVarB = b();
        a(yeVarB, 1010, new f9.f(yeVarB, j10));
    }

    public final void a(int i, long j10, long j11) {
        ye yeVarB = b();
        a(yeVarB, 1011, new zl.l0(yeVarB, i, j10, j11, 0));
    }

    @Override // yads.oe2
    public final void a(ne2 ne2Var) {
        ye yeVarA = a();
        a(yeVarA, 13, new zl.s(2, yeVarA, ne2Var));
    }

    @Override // yads.oe2
    public final void a(q20 q20Var) {
        ye yeVarA = a();
        a(yeVarA, 27, new zl.s(11, yeVarA, q20Var));
    }

    @Override // yads.oe2
    public final void a(ig0 ig0Var) {
        ye yeVarA = a();
        a(yeVarA, 29, new zl.s(10, yeVarA, ig0Var));
    }

    @Override // yads.oe2
    public final void a(boolean z5, int i) {
        ye yeVarA = a();
        a(yeVarA, 30, new zl.d0(yeVarA, i, z5, 0));
    }

    @Override // yads.qk0
    public final void a(int i, an1 an1Var) {
        ye yeVarE = e(i, an1Var);
        a(yeVarE, 1023, new zl.j0(yeVarE, 1));
    }

    @Override // yads.qk0
    public final void a(int i, an1 an1Var, int i10) {
        ye yeVarE = e(i, an1Var);
        a(yeVarE, 1022, new zl.f0(yeVarE, i10, 3));
    }

    @Override // yads.qk0
    public final void a(int i, an1 an1Var, Exception exc) {
        ye yeVarE = e(i, an1Var);
        a(yeVarE, 1024, new zl.z(yeVarE, exc, 1));
    }

    public final void a(int i, long j10) {
        ye yeVarA = a(this.f40139d.f39807e);
        a(yeVarA, 1018, new zl.x(yeVarA, i, j10));
    }

    @Override // yads.en1
    public final void a(int i, an1 an1Var, xf1 xf1Var, jm1 jm1Var) {
        ye yeVarE = e(i, an1Var);
        a(yeVarE, 1001, new zl.i0(yeVarE, xf1Var, jm1Var, 2));
    }

    @Override // yads.en1
    public final void a(int i, an1 an1Var, xf1 xf1Var, jm1 jm1Var, IOException iOException, boolean z5) {
        ye yeVarE = e(i, an1Var);
        a(yeVarE, 1003, new i4.g0(yeVarE, xf1Var, jm1Var, iOException, z5));
    }

    @Override // yads.oe2
    public final void a(hm1 hm1Var, int i) {
        ye yeVarA = a();
        a(yeVarA, 1, new e9.d(yeVarA, hm1Var, i, 4));
    }

    @Override // yads.oe2
    public final void a(lm1 lm1Var) {
        ye yeVarA = a();
        a(yeVarA, 14, new zl.s(5, yeVarA, lm1Var));
    }

    @Override // yads.oe2
    public final void a(vs1 vs1Var) {
        ye yeVarA = a();
        a(yeVarA, 28, new zl.s(3, yeVarA, vs1Var));
    }

    @Override // yads.oe2
    public final void a(ge2 ge2Var) {
        ye yeVarA = a();
        a(yeVarA, 12, new zl.s(4, yeVarA, ge2Var));
    }

    @Override // yads.oe2
    public final void a(qn0 qn0Var) {
        ye yeVarA;
        tm1 tm1Var;
        if (qn0Var != null && (tm1Var = qn0Var.i) != null) {
            yeVarA = a(new an1(tm1Var));
        } else {
            yeVarA = a();
        }
        a(yeVarA, 10, new zl.c0(yeVarA, qn0Var, 0));
    }

    @Override // yads.oe2
    public final void a(pe2 pe2Var, pe2 pe2Var2, int i) {
        jb0 jb0Var = this.f40139d;
        qe2 qe2Var = this.f40142g;
        qe2Var.getClass();
        jb0Var.f39806d = jb0.a(qe2Var, jb0Var.f39804b, jb0Var.f39807e, jb0Var.f39803a);
        ye yeVarA = a();
        a(yeVarA, 11, new i4.e0(yeVarA, i, pe2Var, pe2Var2));
    }

    public final void a(Object obj, long j10) {
        ye yeVarB = b();
        a(yeVarB, 26, new e9.g(yeVarB, obj, j10, 5));
    }

    @Override // yads.oe2
    public final void a(int i) {
        jb0 jb0Var = this.f40139d;
        qe2 qe2Var = this.f40142g;
        qe2Var.getClass();
        jb0Var.f39806d = jb0.a(qe2Var, jb0Var.f39804b, jb0Var.f39807e, jb0Var.f39803a);
        ao0 ao0Var = (ao0) qe2Var;
        ao0Var.r();
        jb0Var.a(ao0Var.Z.f38095a);
        ye yeVarA = a();
        a(yeVarA, 0, new zl.f0(yeVarA, i, 0));
    }

    @Override // yads.oe2
    public final void a(r83 r83Var) {
        ye yeVarA = a();
        a(yeVarA, 2, new zl.s(7, yeVarA, r83Var));
    }

    @Override // yads.en1
    public final void a(int i, an1 an1Var, jm1 jm1Var) {
        ye yeVarE = e(i, an1Var);
        a(yeVarE, 1005, new zl.h0(yeVarE, jm1Var, 1));
    }

    @Override // yads.oe2
    public final void a(rj3 rj3Var) {
        ye yeVarB = b();
        a(yeVarB, 25, new zl.s(9, yeVarB, rj3Var));
    }

    public final void a(ye yeVar, int i, of1 of1Var) {
        this.f40140e.put(i, yeVar);
        rf1 rf1Var = this.f40141f;
        rf1Var.a(i, of1Var);
        rf1Var.a();
    }

    public final void a(qe2 qe2Var, Looper looper) {
        if (this.f40142g != null && !this.f40139d.f39804b.isEmpty()) {
            throw new IllegalStateException();
        }
        this.f40142g = qe2Var;
        this.f40143h = ((i53) this.f40136a).a(looper, null);
        rf1 rf1Var = this.f40141f;
        zl.s sVar = new zl.s(8, this, qe2Var);
        this.f40141f = new rf1(rf1Var.f42589d, looper, rf1Var.f42586a, sVar);
    }
}
