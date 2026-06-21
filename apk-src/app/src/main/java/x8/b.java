package x8;

import com.appsflyer.AdRevenueScheme;
import io.sentry.SentryEvent;
import io.sentry.protocol.Device;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements rd.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f35980a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final rd.c f35981b = rd.c.a("sdkVersion");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final rd.c f35982c = rd.c.a("model");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final rd.c f35983d = rd.c.a("hardware");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final rd.c f35984e = rd.c.a(Device.TYPE);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final rd.c f35985f = rd.c.a("product");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final rd.c f35986g = rd.c.a("osBuild");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final rd.c f35987h = rd.c.a("manufacturer");
    public static final rd.c i = rd.c.a(SentryEvent.JsonKeys.FINGERPRINT);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final rd.c f35988j = rd.c.a("locale");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final rd.c f35989k = rd.c.a(AdRevenueScheme.COUNTRY);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final rd.c f35990l = rd.c.a("mccMnc");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final rd.c f35991m = rd.c.a("applicationBuild");

    @Override // rd.a
    public final void a(Object obj, Object obj2) {
        rd.e eVar = (rd.e) obj2;
        h hVar = (h) ((a) obj);
        eVar.c(f35981b, hVar.f36016a);
        eVar.c(f35982c, hVar.f36017b);
        eVar.c(f35983d, hVar.f36018c);
        eVar.c(f35984e, hVar.f36019d);
        eVar.c(f35985f, hVar.f36020e);
        eVar.c(f35986g, hVar.f36021f);
        eVar.c(f35987h, hVar.f36022g);
        eVar.c(i, hVar.f36023h);
        eVar.c(f35988j, hVar.i);
        eVar.c(f35989k, hVar.f36024j);
        eVar.c(f35990l, hVar.f36025k);
        eVar.c(f35991m, hVar.f36026l);
    }
}
