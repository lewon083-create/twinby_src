package io.appmetrica.analytics.impl;

import android.content.ContentValues;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class O8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f22776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f22777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Long f22778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f22779e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Long f22780f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0254j7 f22781g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final EnumC0078cb f22782h;
    public final Integer i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f22783j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Integer f22784k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Integer f22785l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f22786m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f22787n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final J8 f22788o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final EnumC0128ea f22789p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final EnumC0356n9 f22790q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Boolean f22791r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Integer f22792s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final byte[] f22793t;

    public O8(ContentValues contentValues) {
        C0151f7 model = new C0177g7(null, 1, 0 == true ? 1 : 0).toModel(contentValues);
        this.f22775a = model.a().j();
        this.f22776b = model.a().p();
        this.f22777c = model.c();
        this.f22778d = model.b();
        this.f22779e = model.a().k();
        this.f22780f = model.d();
        this.f22781g = model.a().i();
        this.f22782h = model.e();
        this.i = model.a().d();
        this.f22783j = model.a().f();
        this.f22784k = model.a().o();
        this.f22785l = model.a().c();
        this.f22786m = model.a().b();
        this.f22787n = model.a().m();
        J8 j8E = model.a().e();
        this.f22788o = j8E == null ? J8.a(null) : j8E;
        EnumC0128ea enumC0128eaH = model.a().h();
        this.f22789p = enumC0128eaH == null ? EnumC0128ea.a(null) : enumC0128eaH;
        this.f22790q = model.a().n();
        this.f22791r = model.a().a();
        this.f22792s = model.a().l();
        this.f22793t = model.a().g();
    }
}
