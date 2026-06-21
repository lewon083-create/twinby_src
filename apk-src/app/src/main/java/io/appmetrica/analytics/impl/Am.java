package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Am {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f22083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Yl f22085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final El f22086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0192gm f22087e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0575w4 f22088f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0115dm f22089g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final N7 f22090h;
    public final SystemTimeProvider i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final A3 f22091j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final D3 f22092k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Hl f22093l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C0559vd f22094m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final oo f22095n;

    public Am(Context context, String str, Yl yl2, El el2) {
        this.f22083a = context;
        this.f22084b = str;
        this.f22085c = yl2;
        this.f22086d = el2;
        C0192gm c0192gmA = C0382oa.k().A();
        this.f22087e = c0192gmA;
        C0140em c0140emB = c0192gmA.b();
        this.f22088f = new C0575w4(str);
        this.f22089g = new C0115dm(context);
        this.f22090h = new N7();
        this.i = new SystemTimeProvider();
        this.f22091j = C0382oa.k().f();
        this.f22092k = new D3();
        this.f22093l = new Hl(new Zl(context, str), c0140emB, yl2);
        this.f22094m = C0382oa.k().q();
        this.f22095n = new oo();
    }
}
