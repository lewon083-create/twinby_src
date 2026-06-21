package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.system.SystemPropertiesHelper;
import java.io.File;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.c4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0071c4 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static volatile C0071c4 f23534w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0477s6 f23535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E7 f23536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final S3 f23537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final G1 f23538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0371o f23539e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Vk f23540f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final F5 f23541g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0321m f23542h;
    public final C0320ln i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C0559vd f23543j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0446r0 f23544k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile Z3 f23545l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Sc f23546m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile Ue f23547n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C0034aj f23548o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C0646z0 f23549p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final L1 f23550q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0103da f23551r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile C0041b0 f23552s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile N9 f23553t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public volatile H7 f23554u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public volatile C0097d4 f23555v;

    public C0071c4(C0477s6 c0477s6, C0371o c0371o, S3 s32) {
        this(c0477s6, c0371o, s32, new C0321m(c0371o));
    }

    public static C0071c4 l() {
        if (f23534w == null) {
            synchronized (C0071c4.class) {
                try {
                    if (f23534w == null) {
                        f23534w = new C0071c4(new C0477s6(), new C0371o(), new S3());
                    }
                } finally {
                }
            }
        }
        return f23534w;
    }

    public final C0371o a() {
        return this.f23539e;
    }

    public final Ue b(Context context) {
        Ue ue;
        Ue ue2 = this.f23547n;
        if (ue2 != null) {
            return ue2;
        }
        synchronized (this) {
            try {
                ue = this.f23547n;
                if (ue == null) {
                    ue = new Ue(c(context).a(context));
                    this.f23547n = ue;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return ue;
    }

    public final C0446r0 c() {
        return this.f23544k;
    }

    public final C0646z0 d() {
        return this.f23549p;
    }

    public final G1 e() {
        return this.f23538d;
    }

    public final L1 f() {
        return this.f23550q;
    }

    public final S3 g() {
        return this.f23537c;
    }

    public final F5 h() {
        return this.f23541g;
    }

    public final C0477s6 i() {
        return this.f23535a;
    }

    public final E7 j() {
        return this.f23536b;
    }

    public final C0103da k() {
        return this.f23551r;
    }

    public final Z3 m() {
        Z3 z32;
        Z3 z33 = this.f23545l;
        if (z33 != null) {
            return z33;
        }
        synchronized (this) {
            try {
                z32 = this.f23545l;
                if (z32 == null) {
                    z32 = new Z3();
                    this.f23545l = z32;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z32;
    }

    public final C0477s6 n() {
        return this.f23535a;
    }

    public final Vk o() {
        return this.f23540f;
    }

    public C0071c4(C0477s6 c0477s6, C0371o c0371o, S3 s32, C0321m c0321m) {
        this(c0477s6, new E7(), s32, c0321m, new G1(), c0371o, new Vk(c0371o, c0321m), new F5(c0371o), new C0320ln(), new C0446r0());
    }

    public final synchronized C0559vd a(Context context) {
        try {
            if (this.f23543j == null) {
                this.f23543j = new C0559vd(context, new lo());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f23543j;
    }

    public final C0097d4 c(Context context) {
        C0097d4 c0097d4;
        File file;
        C0097d4 c0097d42 = this.f23555v;
        if (c0097d42 != null) {
            return c0097d42;
        }
        synchronized (this) {
            c0097d4 = this.f23555v;
            if (c0097d4 == null) {
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
                    c0097d4 = new C0097d4(file);
                    this.f23555v = c0097d4;
                }
                file = null;
                c0097d4 = new C0097d4(file);
                this.f23555v = c0097d4;
            }
        }
        return c0097d4;
    }

    public C0071c4(C0477s6 c0477s6, E7 e7, S3 s32, C0321m c0321m, G1 g12, C0371o c0371o, Vk vk2, F5 f52, C0320ln c0320ln, C0446r0 c0446r0) {
        this.f23546m = new Sc();
        this.f23549p = new C0646z0();
        this.f23550q = new L1();
        this.f23551r = new C0103da();
        new D7();
        this.f23554u = new H7();
        this.f23535a = c0477s6;
        this.f23536b = e7;
        this.f23537c = s32;
        this.f23542h = c0321m;
        this.f23538d = g12;
        this.f23539e = c0371o;
        this.f23540f = vk2;
        this.f23541g = f52;
        this.i = c0320ln;
        this.f23544k = c0446r0;
    }

    public final C0041b0 b() {
        C0041b0 c0041b0;
        C0041b0 c0041b02 = this.f23552s;
        if (c0041b02 != null) {
            return c0041b02;
        }
        synchronized (this) {
            try {
                c0041b0 = this.f23552s;
                if (c0041b0 == null) {
                    c0041b0 = new C0041b0(this.f23549p, this.f23540f, this.f23537c);
                    this.f23552s = c0041b0;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c0041b0;
    }
}
