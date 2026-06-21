package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Qk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y4 f22891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Pk f22892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final X4 f22893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC0169g f22894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AbstractC0169g f22895e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Ck f22896f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f22897g = 0;

    public Qk(Y4 y42, Pk pk2, X4 x42, C0232ia c0232ia, A2 a22) {
        this.f22891a = y42;
        this.f22893c = x42;
        this.f22894d = c0232ia;
        this.f22895e = a22;
        this.f22892b = pk2;
    }

    public final synchronized long a() {
        Ck ck2;
        ck2 = this.f22896f;
        return ck2 == null ? 10000000000L : ck2.f22224d - 1;
    }

    public final void b(Ck ck2, Q5 q5) {
        if (ck2.f22227g && ck2.f22224d > 0) {
            X4 x42 = this.f22893c;
            Q5 q5A = Q5.a(q5, EnumC0078cb.EVENT_TYPE_ALIVE);
            Sk sk2 = new Sk();
            sk2.f22973a = ck2.f22224d;
            sk2.f22976d = ck2.f22223c.f22343a;
            long andIncrement = ck2.f22226f.getAndIncrement();
            Tk tk2 = ck2.f22222b;
            tk2.a(Tk.f23033g, Long.valueOf(ck2.f22226f.get()));
            tk2.b();
            sk2.f22974b = andIncrement;
            sk2.f22975c = TimeUnit.MILLISECONDS.toSeconds(Math.max(ck2.i - ck2.f22225e, ck2.f22229j));
            x42.f23239a.f23294n.a(q5A, sk2);
            if (ck2.f22227g) {
                ck2.f22227g = false;
                Tk tk3 = ck2.f22222b;
                tk3.a(Tk.i, Boolean.FALSE);
                tk3.b();
            }
        }
        PublicLogger publicLogger = this.f22891a.f23293m;
        int iOrdinal = ck2.f22223c.f22343a.ordinal();
        if (iOrdinal == 0) {
            publicLogger.info("Finish foreground session", new Object[0]);
        } else if (iOrdinal == 1) {
            publicLogger.info("Finish background session", new Object[0]);
        }
        synchronized (ck2) {
            Tk tk4 = ck2.f22222b;
            tk4.getClass();
            tk4.f23037c = new C0181gb();
            tk4.b();
            ck2.f22228h = null;
        }
    }

    public final synchronized void c(Q5 q5) {
        try {
            if (this.f22897g == 0) {
                Ck ckB = this.f22894d.b();
                if (a(ckB, q5)) {
                    this.f22896f = ckB;
                    this.f22897g = 3;
                } else {
                    Ck ckB2 = this.f22895e.b();
                    if (a(ckB2, q5)) {
                        this.f22896f = ckB2;
                        this.f22897g = 2;
                    } else {
                        this.f22896f = null;
                        this.f22897g = 1;
                    }
                }
            }
            int iA = L7.a(this.f22897g);
            if (iA == 0) {
                this.f22896f = a(q5);
            } else if (iA == 1) {
                b(this.f22896f, q5);
                this.f22896f = a(q5);
            } else if (iA == 2) {
                if (a(this.f22896f, q5)) {
                    Ck ck2 = this.f22896f;
                    long j10 = q5.i;
                    ck2.i = j10;
                    Tk tk2 = ck2.f22222b;
                    tk2.a(Tk.f23030d, Long.valueOf(j10));
                    tk2.b();
                } else {
                    this.f22896f = a(q5);
                }
            }
        } finally {
        }
    }

    public final Ck a(Q5 q5) {
        this.f22891a.f23293m.info("Start foreground session", new Object[0]);
        long j10 = q5.i;
        AbstractC0169g abstractC0169g = this.f22894d;
        Dk dk2 = new Dk(j10, q5.f22868j);
        abstractC0169g.getClass();
        Ck ckA = abstractC0169g.a(dk2);
        this.f22897g = 3;
        ((C0302l5) this.f22891a.f23296p).e();
        X4 x42 = this.f22893c;
        x42.f23239a.f23294n.a(Q5.a(q5, C0382oa.I.i()), a(ckA, j10));
        return ckA;
    }

    public static Sk a(Ck ck2, long j10) {
        Sk sk2 = new Sk();
        sk2.f22973a = ck2.f22224d;
        long andIncrement = ck2.f22226f.getAndIncrement();
        Tk tk2 = ck2.f22222b;
        tk2.a(Tk.f23033g, Long.valueOf(ck2.f22226f.get()));
        tk2.b();
        sk2.f22974b = andIncrement;
        Tk tk3 = ck2.f22222b;
        long j11 = j10 - ck2.f22225e;
        ck2.f22229j = j11;
        tk3.a(Tk.f23031e, Long.valueOf(j11));
        sk2.f22975c = TimeUnit.MILLISECONDS.toSeconds(ck2.f22229j);
        sk2.f22976d = ck2.f22223c.f22343a;
        return sk2;
    }

    public final synchronized Ck b(Q5 q5) {
        try {
            if (this.f22897g == 0) {
                Ck ckB = this.f22894d.b();
                if (a(ckB, q5)) {
                    this.f22896f = ckB;
                    this.f22897g = 3;
                } else {
                    Ck ckB2 = this.f22895e.b();
                    if (a(ckB2, q5)) {
                        this.f22896f = ckB2;
                        this.f22897g = 2;
                    } else {
                        this.f22896f = null;
                        this.f22897g = 1;
                    }
                }
            }
            if (this.f22897g != 1 && !a(this.f22896f, q5)) {
                this.f22897g = 1;
                this.f22896f = null;
            }
            int iA = L7.a(this.f22897g);
            if (iA == 1) {
                Ck ck2 = this.f22896f;
                long j10 = q5.i;
                ck2.i = j10;
                Tk tk2 = ck2.f22222b;
                tk2.a(Tk.f23030d, Long.valueOf(j10));
                tk2.b();
                return this.f22896f;
            }
            if (iA != 2) {
                this.f22891a.f23293m.info("Start background session", new Object[0]);
                this.f22897g = 2;
                long j11 = q5.i;
                AbstractC0169g abstractC0169g = this.f22895e;
                Dk dk2 = new Dk(j11, q5.f22868j);
                abstractC0169g.getClass();
                Ck ckA = abstractC0169g.a(dk2);
                if (this.f22891a.f23300t.c()) {
                    X4 x42 = this.f22893c;
                    x42.f23239a.f23294n.a(Q5.a(q5, C0382oa.I.i()), a(ckA, q5.i));
                } else {
                    int i = q5.f22863d;
                    EnumC0078cb enumC0078cb = EnumC0078cb.EVENT_TYPE_UNDEFINED;
                    if (i == 6145) {
                        X4 x43 = this.f22893c;
                        x43.f23239a.f23294n.a(q5, a(ckA, j11));
                        X4 x44 = this.f22893c;
                        x44.f23239a.f23294n.a(Q5.a(q5, C0382oa.I.i()), a(ckA, j11));
                    }
                }
                this.f22896f = ckA;
                return ckA;
            }
            return this.f22896f;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(io.appmetrica.analytics.impl.Ck r18, io.appmetrica.analytics.impl.Q5 r19) {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.Qk.a(io.appmetrica.analytics.impl.Ck, io.appmetrica.analytics.impl.Q5):boolean");
    }
}
