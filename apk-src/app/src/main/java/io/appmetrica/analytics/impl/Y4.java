package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class Y4 implements Qa, Fa, InterfaceC0238ih {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f23282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final R4 f23283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ve f23284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ye f23285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final M6 f23286e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0489si f23287f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Y8 f23288g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0247j0 f23289h;
    public final C0272k0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Qk f23290j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Pg f23291k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final N8 f23292l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final PublicLogger f23293m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C0306l9 f23294n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final T4 f23295o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final InterfaceC0455r9 f23296p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C0350n3 f23297q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TimePassedChecker f23298r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0486sf f23299s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final wo f23300t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Ik f23301u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C0424q2 f23302v;

    public Y4(@NonNull Context context, @NonNull C0140em c0140em, @NonNull R4 r42, @NonNull C0401p4 c0401p4, @NonNull InterfaceC0187gh interfaceC0187gh, @NonNull W4 w42) {
        this(context, r42, new C0272k0(), new TimePassedChecker(), new C0098d5(context, r42, c0401p4, w42, c0140em, interfaceC0187gh, C0382oa.k().w().c(), PackageManagerUtils.getAppVersionCodeInt(context), C0382oa.k().l(), new Q4()), c0401p4);
    }

    public final boolean A() {
        C0264jh c0264jh = (C0264jh) this.f23291k.a();
        return c0264jh.f24163n && this.f23298r.didTimePassSeconds(this.f23294n.f24287k, c0264jh.f24169t, "should force send permissions");
    }

    public final boolean B() {
        C0140em c0140em;
        C0486sf c0486sf = this.f23299s;
        c0486sf.f22882h.a(c0486sf.f22875a);
        boolean z5 = ((C0412pf) c0486sf.c()).f24584d;
        Pg pg = this.f23291k;
        synchronized (pg) {
            c0140em = pg.f24563c.f22651a;
        }
        return !(z5 && c0140em.f23800q);
    }

    @Override // io.appmetrica.analytics.impl.Qa, io.appmetrica.analytics.impl.Pl
    public final void a(@NonNull Il il2, C0140em c0140em) {
    }

    @Override // io.appmetrica.analytics.impl.Fa
    @NonNull
    public final R4 b() {
        return this.f23283b;
    }

    @NonNull
    public CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.MANUAL;
    }

    public final void d() {
        C0247j0 c0247j0 = this.f23289h;
        synchronized (c0247j0) {
            c0247j0.f24121a = new Gc();
        }
        this.i.a(this.f23289h.a(), this.f23284c);
    }

    public final synchronized void e() {
        ((C0302l5) this.f23296p).d();
    }

    @NonNull
    public final C0424q2 f() {
        return this.f23302v;
    }

    @NonNull
    public final C0350n3 g() {
        return this.f23297q;
    }

    @Override // io.appmetrica.analytics.impl.Fa
    @NonNull
    public final Context getContext() {
        return this.f23282a;
    }

    @NonNull
    public final Ve h() {
        return this.f23284c;
    }

    @NonNull
    public final M6 i() {
        return this.f23286e;
    }

    @NonNull
    public final N8 j() {
        return this.f23292l;
    }

    @NonNull
    public final Y8 k() {
        return this.f23288g;
    }

    @NonNull
    public final C0306l9 l() {
        return this.f23294n;
    }

    @NonNull
    public final InterfaceC0455r9 m() {
        return this.f23296p;
    }

    @NonNull
    public final C0264jh n() {
        return (C0264jh) this.f23291k.a();
    }

    public final String o() {
        return this.f23284c.j();
    }

    @NonNull
    public final PublicLogger p() {
        return this.f23293m;
    }

    @NonNull
    public final Ye q() {
        return this.f23285d;
    }

    @NonNull
    public final Ik r() {
        return this.f23301u;
    }

    @NonNull
    public final Qk s() {
        return this.f23290j;
    }

    @NonNull
    public final C0140em t() {
        C0140em c0140em;
        Pg pg = this.f23291k;
        synchronized (pg) {
            c0140em = pg.f24563c.f22651a;
        }
        return c0140em;
    }

    @NonNull
    public final wo u() {
        return this.f23300t;
    }

    public final void v() {
        C0306l9 c0306l9 = this.f23294n;
        int i = c0306l9.f24286j;
        c0306l9.f24288l = i;
        c0306l9.f24278a.a(i).b();
    }

    public final void w() {
        int iOptInt;
        int libraryApiLevel = AppMetrica.getLibraryApiLevel();
        wo woVar = this.f23300t;
        synchronized (woVar) {
            iOptInt = woVar.f24991a.a().optInt("last_migration_api_level", 0);
        }
        if (iOptInt < libraryApiLevel) {
            this.f23295o.getClass();
            Iterator it = kotlin.collections.r.c(new V4(this)).iterator();
            while (it.hasNext()) {
                ((U4) it.next()).a(iOptInt);
            }
            this.f23300t.b(libraryApiLevel);
        }
    }

    public final boolean x() {
        C0264jh c0264jh = (C0264jh) this.f23291k.a();
        return c0264jh.f24163n && c0264jh.isIdentifiersValid() && this.f23298r.didTimePassSeconds(this.f23294n.f24287k, c0264jh.f24168s, "need to check permissions");
    }

    public final boolean y() {
        C0306l9 c0306l9 = this.f23294n;
        return c0306l9.f24288l < c0306l9.f24286j && ((C0264jh) this.f23291k.a()).f24164o && ((C0264jh) this.f23291k.a()).isIdentifiersValid();
    }

    public final void z() {
        Pg pg = this.f23291k;
        synchronized (pg) {
            pg.f24561a = null;
        }
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(@NonNull Q5 q5) {
        String strA = Pf.a("Event received on service", EnumC0078cb.a(q5.f22863d), q5.getName(), q5.getValue());
        if (strA != null) {
            this.f23293m.info(strA, new Object[0]);
        }
        String str = this.f23283b.f22910b;
        if (TextUtils.isEmpty(str) || "-1".equals(str)) {
            return;
        }
        this.f23287f.a(q5, new C0464ri());
    }

    public final void b(Q5 q5) {
        this.f23289h.a(q5.f22865f);
        C0222i0 c0222i0A = this.f23289h.a();
        C0272k0 c0272k0 = this.i;
        Ve ve2 = this.f23284c;
        synchronized (c0272k0) {
            if (c0222i0A.f24034b > ve2.d().f24034b) {
                ve2.a(c0222i0A).b();
                this.f23293m.info("Save new app environment for %s. Value: %s", this.f23283b, c0222i0A.f24033a);
            }
        }
    }

    public Y4(Context context, R4 r42, C0272k0 c0272k0, TimePassedChecker timePassedChecker, C0098d5 c0098d5, C0401p4 c0401p4) {
        this.f23282a = context.getApplicationContext();
        this.f23283b = r42;
        this.i = c0272k0;
        this.f23298r = timePassedChecker;
        wo woVarF = c0098d5.f();
        this.f23300t = woVarF;
        this.f23299s = C0382oa.k().t();
        Ve veA = c0098d5.e().a();
        this.f23284c = veA;
        this.f23302v = c0098d5.a(veA);
        Pg pgA = c0098d5.a(this);
        this.f23291k = pgA;
        PublicLogger publicLoggerA = c0098d5.d().a();
        this.f23293m = publicLoggerA;
        this.f23285d = C0382oa.k().y();
        C0247j0 c0247j0A = c0272k0.a(r42, publicLoggerA, veA);
        this.f23289h = c0247j0A;
        this.f23292l = c0098d5.a();
        M6 m6B = c0098d5.b(this);
        this.f23286e = m6B;
        C0539ui c0539uiD = c0098d5.d(this);
        this.f23295o = C0098d5.b();
        w();
        Qk qkA = C0098d5.a(this, woVarF, new X4(this));
        this.f23290j = qkA;
        publicLoggerA.info("Read app environment for component %s. Value: %s", r42.toString(), c0247j0A.a().f24033a);
        Ik ikC = c0098d5.c();
        this.f23301u = ikC;
        this.f23294n = c0098d5.a(veA, woVarF, qkA, m6B, c0247j0A, ikC, c0539uiD);
        Y8 y8C = C0098d5.c(this);
        this.f23288g = y8C;
        this.f23287f = C0098d5.a(this, y8C);
        this.f23297q = c0098d5.b(veA);
        this.f23296p = c0098d5.a(c0539uiD, m6B, pgA, c0401p4, r42, veA);
        m6B.d();
    }

    public void C() {
    }

    @Override // io.appmetrica.analytics.impl.Qa, io.appmetrica.analytics.impl.Fa
    public synchronized void a(@NonNull C0401p4 c0401p4) {
        long jLongValue;
        try {
            this.f23291k.a(c0401p4);
            boolean z5 = false;
            if (Boolean.TRUE.equals(c0401p4.f24554h)) {
                this.f23293m.setEnabled(true);
            } else {
                if (Boolean.FALSE.equals(c0401p4.f24554h)) {
                    this.f23293m.setEnabled(false);
                }
            }
            C0424q2 c0424q2 = this.f23302v;
            Set<String> set = c0401p4.f24560o;
            long jCurrentTimeMillis = c0424q2.f24610d.currentTimeMillis();
            boolean z10 = false;
            for (String str : set) {
                Long l10 = (Long) c0424q2.f24611e.get(str);
                if (l10 != null) {
                    jLongValue = l10.longValue();
                } else {
                    jLongValue = -1;
                    z10 = true;
                }
                if (jCurrentTimeMillis - jLongValue > c0424q2.f24608b) {
                    c0424q2.f24611e.put(str, Long.valueOf(jCurrentTimeMillis));
                    z5 = true;
                }
            }
            if (z5) {
                c0424q2.a(c0424q2.f24611e);
                c0424q2.f24607a.a(c0424q2.f24611e);
            }
            if (z10) {
                this.f23291k.e();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // io.appmetrica.analytics.impl.Qa, io.appmetrica.analytics.impl.Pl
    public final synchronized void a(@NonNull C0140em c0140em) {
        this.f23291k.a(c0140em);
        ((C0302l5) this.f23296p).e();
    }

    public final void a(String str) {
        this.f23284c.j(str).b();
    }
}
