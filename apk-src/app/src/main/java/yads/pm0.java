package yads;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class pm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ow2 f41951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rx2 f41952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jg0 f41953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dh1 f41954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final sd f41955e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qm0 f41956f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final rd f41957g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final km0 f41958h;

    public /* synthetic */ pm0(Context context, d4 d4Var) {
        this(d4Var, new ow2(), new rx2(), new jg0(), ch1.a(context), new sd(), new rm0());
    }

    public final void a(Context context, Function2 function2) {
        Location locationA;
        function2.invoke(CommonUrlParts.APP_ID, context.getPackageName());
        function2.invoke("app_version_code", og.a(context));
        function2.invoke(CommonUrlParts.APP_VERSION, og.b(context));
        function2.invoke("vast-integration-type", "inapp_sdk");
        function2.invoke("sdk_version", this.f41951a.a("%d.%d%d"));
        function2.invoke("sdk_version_name", this.f41951a.a("%d.%d.%d"));
        function2.invoke("sdk_vendor", "yandex");
        function2.invoke(((rm0) this.f41956f).b(), this.f41953c.a(context));
        ah1 ah1Var = this.f41953c.f39865b;
        ah1Var.getClass();
        Locale locale = context.getResources().getConfiguration().locale;
        ah1Var.f36715a.getClass();
        function2.invoke("locale", yg1.a(locale));
        function2.invoke("content_language", this.f41953c.f39865b.a(context));
        List listB = this.f41953c.f39865b.b(context);
        function2.invoke("device_languages", listB != null ? CollectionsKt.I(listB, StringUtils.COMMA, null, null, null, 62) : null);
        Object objC = ((rm0) this.f41956f).c();
        this.f41953c.getClass();
        function2.invoke(objC, jg0.a());
        Object objD = ((rm0) this.f41956f).d();
        this.f41953c.getClass();
        function2.invoke(objD, Build.MODEL);
        Object objE = ((rm0) this.f41956f).e();
        this.f41953c.getClass();
        function2.invoke(objE, "android");
        Object objF = ((rm0) this.f41956f).f();
        this.f41953c.getClass();
        function2.invoke(objF, Build.VERSION.RELEASE);
        Boolean boolC = ad2.c(context);
        if (boolC != null) {
            function2.invoke("vpn_enabled", boolC.booleanValue() ? "1" : CommonUrlParts.Values.FALSE_INTEGER);
        }
        if (!this.f41952b.b(context) && (locationA = this.f41954d.a()) != null) {
            function2.invoke("location_timestamp", String.valueOf(locationA.getTime()));
            function2.invoke("lat", String.valueOf(locationA.getLatitude()));
            function2.invoke("lon", String.valueOf(locationA.getLongitude()));
            function2.invoke("precision", String.valueOf(Math.round(locationA.getAccuracy())));
        }
        if (!this.f41952b.b(context)) {
            function2.invoke(((rm0) this.f41956f).a(), this.f41958h.f40245a);
            function2.invoke(CommonUrlParts.APP_SET_ID, this.f41957g.f42552d);
            td tdVar = this.f41957g.f42549a;
            boolean z5 = false;
            if (tdVar != null) {
                boolean z10 = tdVar.f43274b;
                String str = tdVar.f43273a;
                this.f41955e.getClass();
                boolean z11 = (str == null || str.length() == 0 || io.sentry.util.StringUtils.PROPER_NIL_UUID.equals(str)) ? false : true;
                if (!z10 && z11) {
                    function2.invoke("google_aid", str);
                }
            }
            td tdVar2 = this.f41957g.f42550b;
            if (tdVar2 != null) {
                boolean z12 = tdVar2.f43274b;
                String str2 = tdVar2.f43273a;
                this.f41955e.getClass();
                if (str2 != null && str2.length() != 0 && !io.sentry.util.StringUtils.PROPER_NIL_UUID.equals(str2)) {
                    z5 = true;
                }
                if (!z12 && z5) {
                    function2.invoke("huawei_oaid", str2);
                }
            }
        }
        function2.invoke(CommonUrlParts.SCREEN_WIDTH, String.valueOf(nl3.d(context)));
        function2.invoke(CommonUrlParts.SCREEN_HEIGHT, String.valueOf(nl3.b(context)));
        function2.invoke(CommonUrlParts.SCALE_FACTOR, String.valueOf(context.getResources().getDisplayMetrics().density));
        function2.invoke("screen_dpi", String.valueOf(nl3.a(context)));
    }

    public pm0(d4 d4Var, ow2 ow2Var, rx2 rx2Var, jg0 jg0Var, dh1 dh1Var, sd sdVar, qm0 qm0Var) {
        this.f41951a = ow2Var;
        this.f41952b = rx2Var;
        this.f41953c = jg0Var;
        this.f41954d = dh1Var;
        this.f41955e = sdVar;
        this.f41956f = qm0Var;
        this.f41957g = d4Var.b();
        this.f41958h = d4Var.c();
    }
}
