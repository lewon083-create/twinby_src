package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.ReferenceHolder;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider;
import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;
import io.appmetrica.analytics.coreutils.internal.system.SystemPropertiesHelper;
import io.appmetrica.analytics.locationapi.internal.LocationClient;
import java.io.File;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.oa, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0382oa {
    public static volatile C0382oa I;
    public volatile N9 C;
    public C0616xk H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f24490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile C0288kg f24491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile F6 f24492c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile S2 f24494e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile C0316lj f24495f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile U f24496g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile C0043b2 f24497h;
    public volatile PlatformIdentifiers i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile C0486sf f24498j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile A3 f24499k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile Ye f24500l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile zo f24501m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile C0112dj f24502n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile Gb f24503o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C0667zl f24504p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile C0591wk f24506r;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile Lb f24511w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public volatile C0370nn f24512x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile C0492sl f24513y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public volatile C0559vd f24514z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C0357na f24505q = new C0357na();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Sc f24507s = new Sc();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Uc f24508t = new Uc();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C0192gm f24509u = new C0192gm();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C0113dk f24510v = new C0113dk();
    public final Od A = new Od();
    public final UtilityServiceProvider B = new UtilityServiceProvider();
    public final C0317lk D = new C0317lk();
    public final ReferenceHolder E = new ReferenceHolder();
    public final C0566vk F = new C0566vk();
    public final C0246j G = new C0246j();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0267jk f24493d = new C0267jk();

    public C0382oa(Context context) {
        this.f24490a = context;
    }

    public static void a(Context context) {
        if (I == null) {
            synchronized (C0382oa.class) {
                try {
                    if (I == null) {
                        I = new C0382oa(context.getApplicationContext());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static C0382oa k() {
        return I;
    }

    public final C0192gm A() {
        return this.f24509u;
    }

    public final C0616xk B() {
        C0616xk c0616xk;
        File file;
        C0616xk c0616xk2 = this.H;
        if (c0616xk2 != null) {
            return c0616xk2;
        }
        synchronized (this) {
            c0616xk = this.H;
            if (c0616xk == null) {
                Context context = this.f24490a;
                String systemProperty = SystemPropertiesHelper.readSystemProperty("ro.yndx.metrica.db.dir");
                String systemProperty2 = SystemPropertiesHelper.readSystemProperty("debug.yndx.iaa.db.dir");
                if (StringsKt.D(systemProperty)) {
                    systemProperty = systemProperty2;
                }
                if (!StringsKt.D(systemProperty)) {
                    file = new File(systemProperty, context.getPackageName());
                    try {
                        file.mkdirs();
                    } catch (Exception unused) {
                        file = null;
                    }
                    c0616xk = new C0616xk(file);
                    this.H = c0616xk;
                }
                file = null;
                c0616xk = new C0616xk(file);
                this.H = c0616xk;
            }
        }
        return c0616xk;
    }

    public final C0370nn C() {
        C0370nn c0370nn;
        C0370nn c0370nn2 = this.f24512x;
        if (c0370nn2 != null) {
            return c0370nn2;
        }
        synchronized (this) {
            try {
                c0370nn = this.f24512x;
                if (c0370nn == null) {
                    c0370nn = new C0370nn(this.f24490a);
                    this.f24512x = c0370nn;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c0370nn;
    }

    public final synchronized zo D() {
        try {
            if (this.f24501m == null) {
                this.f24501m = new zo(this.f24490a);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f24501m;
    }

    public final void E() {
        if (this.f24498j == null) {
            synchronized (this) {
                try {
                    if (this.f24498j == null) {
                        Pm pmA = Om.a(C0082cf.class);
                        Context context = this.f24490a;
                        Qm qm = (Qm) pmA;
                        ProtobufStateStorage<Object> protobufStateStorageA = qm.a(context, qm.a(context));
                        C0082cf c0082cf = (C0082cf) protobufStateStorageA.read();
                        this.f24498j = new C0486sf(this.f24490a, protobufStateStorageA, new C0262jf(), new C0030af(c0082cf), new C0461rf(), new Cif(this.f24490a), new C0362nf(k().y()), new C0108df(), c0082cf, "[PreloadInfoStorage]");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final C0246j b() {
        return this.G;
    }

    public final U c() {
        U u4;
        U u5 = this.f24496g;
        if (u5 != null) {
            return u5;
        }
        synchronized (this) {
            try {
                u4 = this.f24496g;
                if (u4 == null) {
                    u4 = new U(this.f24490a, this.f24493d.a(), this.f24509u.b());
                    this.f24509u.a(u4);
                    this.f24496g = u4;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return u4;
    }

    public final C0043b2 d() {
        C0043b2 c0043b2;
        C0043b2 c0043b22 = this.f24497h;
        if (c0043b22 != null) {
            return c0043b22;
        }
        synchronized (this) {
            try {
                c0043b2 = this.f24497h;
                if (c0043b2 == null) {
                    c0043b2 = new C0043b2(this.f24490a, AbstractC0069c2.a());
                    this.f24497h = c0043b2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c0043b2;
    }

    public final C0198h2 e() {
        return l().f22376b;
    }

    public final A3 f() {
        if (this.f24499k == null) {
            synchronized (this) {
                try {
                    if (this.f24499k == null) {
                        Pm pmA = Om.a(C0499t3.class);
                        Context context = this.f24490a;
                        Qm qm = (Qm) pmA;
                        ProtobufStateStorage<Object> protobufStateStorageA = qm.a(context, qm.a(context));
                        this.f24499k = new A3(this.f24490a, protobufStateStorageA, new B3(), new C0375o3(), new E3(), new Si(this.f24490a), new C3(y()), new C0400p3(), (C0499t3) protobufStateStorageA.read(), "[ClidsInfoStorage]");
                    }
                } finally {
                }
            }
        }
        return this.f24499k;
    }

    public final Context g() {
        return this.f24490a;
    }

    public final F6 h() {
        if (this.f24492c == null) {
            synchronized (this) {
                try {
                    if (this.f24492c == null) {
                        this.f24492c = new F6(new E6(y()));
                    }
                } finally {
                }
            }
        }
        return this.f24492c;
    }

    public final N9 i() {
        N9 n92;
        N9 n93 = this.C;
        if (n93 != null) {
            return n93;
        }
        synchronized (this) {
            try {
                n92 = this.C;
                if (n92 == null) {
                    n92 = new N9(this.f24490a);
                    this.C = n92;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return n92;
    }

    public final PermissionExtractor j() {
        C0492sl c0492sl = this.f24513y;
        if (c0492sl != null) {
            return c0492sl;
        }
        synchronized (this) {
            try {
                C0492sl c0492sl2 = this.f24513y;
                if (c0492sl2 != null) {
                    return c0492sl2;
                }
                C0492sl c0492sl3 = new C0492sl(p().f24989c.getAskForPermissionStrategy());
                this.f24513y = c0492sl3;
                return c0492sl3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Gb l() {
        Gb gb2;
        Gb gb3 = this.f24503o;
        if (gb3 != null) {
            return gb3;
        }
        synchronized (this) {
            try {
                gb2 = this.f24503o;
                if (gb2 == null) {
                    gb2 = new Gb(new P2(this.f24490a, this.f24493d.a()), new C0198h2());
                    this.f24503o = gb2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gb2;
    }

    public final Lb m() {
        Lb nb;
        Lb lb = this.f24511w;
        if (lb != null) {
            return lb;
        }
        synchronized (this) {
            try {
                nb = this.f24511w;
                if (nb == null) {
                    Context context = this.f24490a;
                    LocationClient locationClient = (LocationClient) ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor("io.appmetrica.analytics.location.internal.LocationClientImpl", LocationClient.class);
                    nb = locationClient == null ? new Nb() : new Mb(context, new Tb(), locationClient);
                    this.f24511w = nb;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nb;
    }

    public final Lb n() {
        return m();
    }

    public final Uc o() {
        return this.f24508t;
    }

    public final C0591wk p() {
        C0591wk c0591wk;
        C0591wk c0591wk2 = this.f24506r;
        if (c0591wk2 != null) {
            return c0591wk2;
        }
        synchronized (this) {
            try {
                c0591wk = this.f24506r;
                if (c0591wk == null) {
                    c0591wk = new C0591wk();
                    this.f24506r = c0591wk;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c0591wk;
    }

    public final C0559vd q() {
        C0559vd c0559vd;
        C0559vd c0559vd2 = this.f24514z;
        if (c0559vd2 != null) {
            return c0559vd2;
        }
        synchronized (this) {
            try {
                c0559vd = this.f24514z;
                if (c0559vd == null) {
                    c0559vd = new C0559vd(this.f24490a, new mo());
                    this.f24514z = c0559vd;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c0559vd;
    }

    public final Od r() {
        return this.A;
    }

    public final PlatformIdentifiers s() {
        PlatformIdentifiers platformIdentifiers;
        PlatformIdentifiers platformIdentifiers2 = this.i;
        if (platformIdentifiers2 != null) {
            return platformIdentifiers2;
        }
        synchronized (this) {
            try {
                platformIdentifiers = this.i;
                if (platformIdentifiers == null) {
                    platformIdentifiers = new PlatformIdentifiers(c(), d());
                    this.i = platformIdentifiers;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return platformIdentifiers;
    }

    public final C0486sf t() {
        E();
        return this.f24498j;
    }

    public final C0288kg u() {
        if (this.f24491b == null) {
            synchronized (this) {
                try {
                    if (this.f24491b == null) {
                        this.f24491b = new C0288kg(this.f24490a, I.D().f25133c);
                    }
                } finally {
                }
            }
        }
        return this.f24491b;
    }

    public final C0112dj v() {
        C0112dj c0112dj;
        C0112dj c0112dj2 = this.f24502n;
        if (c0112dj2 != null) {
            return c0112dj2;
        }
        synchronized (this) {
            try {
                c0112dj = this.f24502n;
                if (c0112dj == null) {
                    c0112dj = new C0112dj(this.f24490a);
                    this.f24502n = c0112dj;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c0112dj;
    }

    public final C0267jk w() {
        return this.f24493d;
    }

    public final C0566vk x() {
        return this.F;
    }

    public final Ye y() {
        if (this.f24500l == null) {
            synchronized (this) {
                try {
                    if (this.f24500l == null) {
                        this.f24500l = new Ye(B().d(this.f24490a));
                    }
                } finally {
                }
            }
        }
        return this.f24500l;
    }

    public final synchronized L2 z() {
        try {
            if (this.f24504p == null) {
                C0667zl c0667zl = new C0667zl(this.f24490a);
                this.f24504p = c0667zl;
                this.f24509u.a(c0667zl);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f24504p;
    }

    public final WaitForActivationDelayBarrier a() {
        return this.B.getActivationBarrier();
    }
}
