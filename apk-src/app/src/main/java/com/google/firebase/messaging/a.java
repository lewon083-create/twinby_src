package com.google.firebase.messaging;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements rd.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f14774a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final rd.c f14775b = new rd.c("projectNumber", pe.a.m(pe.a.l(ud.e.class, new ud.a(1))));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final rd.c f14776c = new rd.c("messageId", pe.a.m(pe.a.l(ud.e.class, new ud.a(2))));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final rd.c f14777d = new rd.c("instanceId", pe.a.m(pe.a.l(ud.e.class, new ud.a(3))));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final rd.c f14778e = new rd.c("messageType", pe.a.m(pe.a.l(ud.e.class, new ud.a(4))));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final rd.c f14779f = new rd.c("sdkPlatform", pe.a.m(pe.a.l(ud.e.class, new ud.a(5))));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final rd.c f14780g = new rd.c("packageName", pe.a.m(pe.a.l(ud.e.class, new ud.a(6))));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final rd.c f14781h = new rd.c("collapseKey", pe.a.m(pe.a.l(ud.e.class, new ud.a(7))));
    public static final rd.c i = new rd.c("priority", pe.a.m(pe.a.l(ud.e.class, new ud.a(8))));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final rd.c f14782j = new rd.c("ttl", pe.a.m(pe.a.l(ud.e.class, new ud.a(9))));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final rd.c f14783k = new rd.c("topic", pe.a.m(pe.a.l(ud.e.class, new ud.a(10))));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final rd.c f14784l = new rd.c("bulkId", pe.a.m(pe.a.l(ud.e.class, new ud.a(11))));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final rd.c f14785m = new rd.c("event", pe.a.m(pe.a.l(ud.e.class, new ud.a(12))));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final rd.c f14786n = new rd.c("analyticsLabel", pe.a.m(pe.a.l(ud.e.class, new ud.a(13))));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final rd.c f14787o = new rd.c("campaignId", pe.a.m(pe.a.l(ud.e.class, new ud.a(14))));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final rd.c f14788p = new rd.c("composerLabel", pe.a.m(pe.a.l(ud.e.class, new ud.a(15))));

    @Override // rd.a
    public final void a(Object obj, Object obj2) {
        ee.d dVar = (ee.d) obj;
        rd.e eVar = (rd.e) obj2;
        eVar.a(f14775b, dVar.f16347a);
        eVar.c(f14776c, dVar.f16348b);
        eVar.c(f14777d, dVar.f16349c);
        eVar.c(f14778e, dVar.f16350d);
        eVar.c(f14779f, ee.c.ANDROID);
        eVar.c(f14780g, dVar.f16351e);
        eVar.c(f14781h, dVar.f16352f);
        eVar.b(i, dVar.f16353g);
        eVar.b(f14782j, dVar.f16354h);
        eVar.c(f14783k, dVar.i);
        eVar.a(f14784l, 0L);
        eVar.c(f14785m, ee.a.MESSAGE_DELIVERED);
        eVar.c(f14786n, dVar.f16355j);
        eVar.a(f14787o, 0L);
        eVar.c(f14788p, dVar.f16356k);
    }
}
