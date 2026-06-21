package yads;

import android.location.Location;
import android.net.Uri;
import com.appsflyer.AdRevenueScheme;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.sentry.protocol.Device;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class zu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k9 f45536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final um0 f45537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Sequence f45538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Sequence f45539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ij.g f45540e;

    public zu0(vu0 vu0Var) {
        k9 k9Var = new k9();
        this.f45536a = k9Var;
        this.f45537b = new um0();
        jj.i builder = new jj.i();
        a(builder, "ad_unit_id", vu0Var.c());
        a(builder, "width", vu0Var.o0());
        a(builder, "height", vu0Var.B());
        a(builder, "ad_size_type", vu0Var.a());
        a(builder, Device.JsonKeys.ORIENTATION, vu0Var.K());
        a(builder, "ads_count", vu0Var.f());
        a(builder, CommonUrlParts.SCREEN_WIDTH, vu0Var.a0());
        a(builder, CommonUrlParts.SCREEN_HEIGHT, vu0Var.Z());
        a(builder, CommonUrlParts.SCALE_FACTOR, vu0Var.X());
        a(builder, AdRevenueScheme.AD_TYPE, vu0Var.b());
        a(builder, "network_type", vu0Var.H());
        a(builder, "carrier", vu0Var.m());
        a((Map) builder, "dnt", vu0Var.z());
        a((Map) builder, "gaid_reset", vu0Var.v());
        a((Map) builder, "huawei_dnt", vu0Var.C());
        a(builder, "image_sizes", vu0Var.D());
        a(builder, "response_ad_format", vu0Var.S());
        a(builder, "debug_uid", vu0Var.s());
        a(builder, "open_bidding_data", vu0Var.I());
        a(builder, "session_random", vu0Var.e0());
        a(builder, "charset", vu0Var.n());
        a(builder, k9Var.b(), vu0Var.u());
        a(builder, k9Var.f(), vu0Var.L());
        a(builder, k9Var.g(), vu0Var.M());
        a(builder, k9Var.d(), vu0Var.F());
        a(builder, k9Var.e(), vu0Var.G());
        a((Map) builder, k9Var.c(), vu0Var.p0());
        a(builder, "locale", vu0Var.E());
        a(builder, "content_language", vu0Var.i());
        List listO = vu0Var.O();
        a(builder, "device_languages", listO != null ? CollectionsKt.I(listO, StringUtils.PROCESS_POSTFIX_DELIMITER, null, null, null, 62) : null);
        a(builder, CommonUrlParts.APP_ID, vu0Var.h());
        a(builder, "app_version_code", vu0Var.k());
        a(builder, CommonUrlParts.APP_VERSION, vu0Var.l());
        a(builder, "appmetrica_version", vu0Var.j());
        a(builder, "screen_dpi", Integer.valueOf(vu0Var.Y()));
        a(builder, "safe_area_inset_left", Float.valueOf(vu0Var.U()));
        a(builder, "safe_area_inset_top", Float.valueOf(vu0Var.W()));
        a(builder, "safe_area_inset_right", Float.valueOf(vu0Var.V()));
        a(builder, "safe_area_inset_bottom", Float.valueOf(vu0Var.T()));
        a(builder, "cutout_safe_area_inset_top", Float.valueOf(vu0Var.r()));
        a(builder, "cutout_safe_area_inset_bottom", Float.valueOf(vu0Var.q()));
        a((Map) builder, "user_consent", vu0Var.j0());
        a(builder, "gdpr", vu0Var.w());
        a(builder, "gdpr_consent", vu0Var.x());
        a((Map) builder, "cmp_present", Boolean.valueOf(vu0Var.o()));
        a(builder, "parsed_purpose_consents", vu0Var.R());
        a(builder, "parsed_vendor_consents", vu0Var.k0());
        a(builder, "addtl_consent", vu0Var.d());
        a(builder, "bidding_data", vu0Var.A());
        a(builder, "prefetched_mediation_data", vu0Var.Q());
        a(builder, "connected_network_ids", vu0Var.p());
        a(builder, "sdk_version", vu0Var.b0());
        a(builder, "sdk_version_name", vu0Var.c0());
        a(builder, "sdk_vendor", "yandex");
        a(builder, "preferred_theme", vu0Var.P());
        a(builder, "device_theme", vu0Var.t());
        a((Map) builder, "age_restricted_user", vu0Var.g());
        a(builder, "view_size_info", vu0Var.l0());
        a((Map) builder, "web_view_available", vu0Var.n0());
        a(builder, "startup_version", vu0Var.g0());
        a(builder, "session-data", vu0Var.d0());
        a(builder, "user-agent", vu0Var.i0());
        a(builder, "stub_reason", vu0Var.h0());
        a((Map) builder, "gms_available", vu0Var.y());
        a((Map) builder, "opt_out", vu0Var.J());
        a((Map) builder, "vpn_enabled", vu0Var.m0());
        a(builder, vu0Var.f0());
        a(builder, vu0Var.N());
        a(builder, vu0Var);
        b(builder, vu0Var);
        Intrinsics.checkNotNullParameter(builder, "builder");
        jj.i iVarB = builder.b();
        Intrinsics.checkNotNullParameter(iVarB, "<this>");
        this.f45538c = CollectionsKt.w(iVarB.entrySet());
        jj.i builder2 = new jj.i();
        for (Map.Entry entry : vu0Var.e().entrySet()) {
            a(builder2, (String) entry.getKey(), entry.getValue());
        }
        Intrinsics.checkNotNullParameter(builder2, "builder");
        jj.i iVarB2 = builder2.b();
        Intrinsics.checkNotNullParameter(iVarB2, "<this>");
        this.f45539d = CollectionsKt.w(iVarB2.entrySet());
        this.f45540e = ij.h.b(new yu0(this));
    }

    public final void a(Map map, vu0 vu0Var) {
        if (!vu0Var.f44137g || vu0Var.f44135f) {
            a(map, "uuid", vu0Var.f44162u);
        }
        if (vu0Var.f44137g) {
            return;
        }
        a(map, "age", vu0Var.f44171y0);
        a(map, "gender", vu0Var.f44173z0);
        a(map, "context_query", vu0Var.U);
        a(map, "context_taglist", vu0Var.V);
        a(map, "google_aid", vu0Var.P);
        a(map, CommonUrlParts.APP_SET_ID, vu0Var.f44145l);
        a(map, "huawei_oaid", vu0Var.R);
        a(map, "mauid", vu0Var.f44147m);
        a(map, this.f45536a.a(), vu0Var.f44155q0);
        a(map, "mcc", vu0Var.F);
        a(map, "mnc", vu0Var.G);
        a(map, "cellid", vu0Var.K);
        a(map, "lac", vu0Var.L);
        a(map, "wifi", vu0Var.M);
        a(map, "battery_charge", vu0Var.S);
        a(map, "server_side_client_ip", vu0Var.L0);
        a(map, "ipv6", vu0Var.M0);
    }

    public final void b(Map map, vu0 vu0Var) {
        Location location;
        if (vu0Var.f44125a) {
            return;
        }
        g9 g9Var = vu0Var.J;
        if (g9Var == null || (location = g9Var.f38681f) == null) {
            location = vu0Var.B;
        }
        if (location == null || !fw2.a().a()) {
            return;
        }
        a(map, "lat", String.valueOf(location.getLatitude()));
        a(map, "lon", String.valueOf(location.getLongitude()));
        a(map, "location_timestamp", String.valueOf(location.getTime()));
        a(map, "precision", String.valueOf((int) location.getAccuracy()));
    }

    public final String toString() {
        return (String) this.f45540e.getValue();
    }

    public final void a(Map map, String str, Boolean bool) {
        if (bool != null) {
            a(map, str, Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
    }

    public final void a(Map map, String str, Object obj) {
        String strEncode;
        if (obj != null) {
            String strEncode2 = Uri.encode(str);
            if (!this.f45537b.f43714a.contains(str)) {
                strEncode = Uri.encode(obj.toString());
            } else {
                strEncode = Uri.encode(obj.toString(), StringUtils.PROCESS_POSTFIX_DELIMITER);
            }
            map.put(strEncode2, strEncode);
        }
    }

    public final void a(Map map, Map map2) {
        for (Map.Entry entry : map2.entrySet()) {
            a(map, (String) entry.getKey(), (String) entry.getValue());
        }
    }
}
