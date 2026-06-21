package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.networktasks.internal.IParamsAppender;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Wl implements IParamsAppender {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0184ge f23229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0385od f23230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ib f23231c = new Ib();

    public Wl(@NonNull C0184ge c0184ge, @NonNull InterfaceC0385od interfaceC0385od) {
        this.f23229a = c0184ge;
        this.f23230b = interfaceC0385od;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.IParamsAppender
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void appendParams(@NonNull Uri.Builder builder, @NonNull C0037am c0037am) {
        C0338mg c0338mg;
        builder.path("analytics/startup");
        builder.appendQueryParameter(this.f23229a.a(CommonUrlParts.DEVICE_ID), c0037am.getDeviceId());
        a(builder, C0382oa.I.h(), this.f23231c);
        builder.appendQueryParameter(this.f23229a.a(CommonUrlParts.APP_SET_ID), c0037am.getAppSetId());
        builder.appendQueryParameter(this.f23229a.a(CommonUrlParts.APP_SET_ID_SCOPE), c0037am.getAppSetIdScope());
        builder.appendQueryParameter(this.f23229a.a(CommonUrlParts.APP_PLATFORM), c0037am.getAppPlatform());
        builder.appendQueryParameter(this.f23229a.a(CommonUrlParts.PROTOCOL_VERSION), c0037am.getProtocolVersion());
        builder.appendQueryParameter(this.f23229a.a(CommonUrlParts.ANALYTICS_SDK_VERSION_NAME), c0037am.getAnalyticsSdkVersionName());
        builder.appendQueryParameter(this.f23229a.a("model"), c0037am.getModel());
        builder.appendQueryParameter(this.f23229a.a("manufacturer"), c0037am.getManufacturer());
        builder.appendQueryParameter(this.f23229a.a(CommonUrlParts.OS_VERSION), c0037am.getOsVersion());
        builder.appendQueryParameter(this.f23229a.a(CommonUrlParts.SCREEN_WIDTH), String.valueOf(c0037am.getScreenWidth()));
        builder.appendQueryParameter(this.f23229a.a(CommonUrlParts.SCREEN_HEIGHT), String.valueOf(c0037am.getScreenHeight()));
        builder.appendQueryParameter(this.f23229a.a("screen_dpi"), String.valueOf(c0037am.getScreenDpi()));
        builder.appendQueryParameter(this.f23229a.a(CommonUrlParts.SCALE_FACTOR), String.valueOf(c0037am.getScaleFactor()));
        builder.appendQueryParameter(this.f23229a.a("locale"), c0037am.getLocale());
        builder.appendQueryParameter(this.f23229a.a(CommonUrlParts.DEVICE_TYPE), c0037am.getDeviceType());
        builder.appendQueryParameter(this.f23229a.a("queries"), String.valueOf(1));
        builder.appendQueryParameter(this.f23229a.a("query_hosts"), String.valueOf(2));
        String strA = this.f23229a.a("features");
        List<String> listH = ((C0591wk) this.f23230b).h();
        String[] strArr = {this.f23229a.a("permissions_collecting"), this.f23229a.a("features_collecting"), this.f23229a.a("google_aid"), this.f23229a.a("huawei_oaid"), this.f23229a.a("sim_info"), this.f23229a.a("ssl_pinning")};
        ArrayList arrayList = new ArrayList(listH);
        arrayList.addAll(Arrays.asList(strArr));
        builder.appendQueryParameter(strA, StringUtils.wrapFeatures((String[]) arrayList.toArray(new String[0])));
        builder.appendQueryParameter(this.f23229a.a(CommonUrlParts.APP_ID), c0037am.getPackageName());
        builder.appendQueryParameter(this.f23229a.a("app_debuggable"), ((O5) c0037am).f22771a);
        if (c0037am.f23458l) {
            String str = c0037am.f23459m;
            if (!TextUtils.isEmpty(str)) {
                builder.appendQueryParameter(this.f23229a.a("country_init"), str);
            }
        } else {
            builder.appendQueryParameter(this.f23229a.a("detect_locale"), String.valueOf(1));
        }
        C0474s3 c0474s3 = c0037am.i;
        if (!ko.a(c0474s3.f24724a)) {
            builder.appendQueryParameter(this.f23229a.a("distribution_customization"), String.valueOf(1));
            builder.appendQueryParameter(this.f23229a.a("clids_set"), Em.a(c0474s3.f24724a));
            int iOrdinal = c0474s3.f24725b.ordinal();
            builder.appendQueryParameter(this.f23229a.a("clids_set_source"), iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? "" : "retail" : "satellite" : "api");
            String str2 = c0037am.f23453f;
            String str3 = c0037am.f23454g;
            if (TextUtils.isEmpty(str2) && (c0338mg = c0037am.f23461o.f24241b) != null) {
                str2 = c0338mg.f24372a;
                str3 = c0338mg.f24375d.f24305a;
            }
            if (!TextUtils.isEmpty(str2)) {
                builder.appendQueryParameter(this.f23229a.a("install_referrer"), str2);
                if (str3 == null) {
                    str3 = "null";
                }
                builder.appendQueryParameter(this.f23229a.a("install_referrer_source"), str3);
            }
        }
        String uuid = c0037am.getUuid();
        if (!TextUtils.isEmpty(uuid)) {
            builder.appendQueryParameter(this.f23229a.a("uuid"), uuid);
        }
        builder.appendQueryParameter(this.f23229a.a("time"), String.valueOf(1));
        builder.appendQueryParameter(this.f23229a.a("stat_sending"), String.valueOf(1));
        builder.appendQueryParameter(this.f23229a.a("retry_policy"), String.valueOf(1));
        builder.appendQueryParameter(this.f23229a.a("cache_control"), String.valueOf(1));
        builder.appendQueryParameter(this.f23229a.a("permissions_collecting"), String.valueOf(1));
        builder.appendQueryParameter(this.f23229a.a("app_system_flag"), ((O5) c0037am).f22772b);
        builder.appendQueryParameter(this.f23229a.a("attribution"), String.valueOf(1));
        builder.appendQueryParameter(this.f23229a.a("startup_update"), String.valueOf(1));
        builder.appendQueryParameter(this.f23229a.a("external_attribution"), String.valueOf(1));
        Map<String, Integer> mapD = ((C0591wk) this.f23230b).d();
        for (String str4 : mapD.keySet()) {
            builder.appendQueryParameter(str4, String.valueOf(mapD.get(str4)));
        }
    }

    public final void a(@NonNull Uri.Builder builder, @NonNull DataSendingRestrictionController dataSendingRestrictionController, @NonNull Ib ib) {
        ib.getClass();
        AdvertisingIdsHolder identifiers = C0382oa.I.c().getIdentifiers();
        if (identifiers != null && !dataSendingRestrictionController.isRestrictedForSdk()) {
            AdTrackingInfoResult google = identifiers.getGoogle();
            if (!google.isValid()) {
                builder.appendQueryParameter(this.f23229a.a(CommonUrlParts.ADV_ID), "");
            } else {
                builder.appendQueryParameter(this.f23229a.a(CommonUrlParts.ADV_ID), google.mAdTrackingInfo.advId);
            }
            AdTrackingInfoResult huawei = identifiers.getHuawei();
            if (!huawei.isValid()) {
                builder.appendQueryParameter(this.f23229a.a(CommonUrlParts.HUAWEI_OAID), "");
            } else {
                builder.appendQueryParameter(this.f23229a.a(CommonUrlParts.HUAWEI_OAID), huawei.mAdTrackingInfo.advId);
            }
            AdTrackingInfoResult yandex = identifiers.getYandex();
            if (!yandex.isValid()) {
                builder.appendQueryParameter(this.f23229a.a(CommonUrlParts.YANDEX_ADV_ID), "");
                return;
            } else {
                builder.appendQueryParameter(this.f23229a.a(CommonUrlParts.YANDEX_ADV_ID), yandex.mAdTrackingInfo.advId);
                return;
            }
        }
        builder.appendQueryParameter(this.f23229a.a(CommonUrlParts.ADV_ID), "");
        builder.appendQueryParameter(this.f23229a.a(CommonUrlParts.HUAWEI_OAID), "");
        builder.appendQueryParameter(this.f23229a.a(CommonUrlParts.YANDEX_ADV_ID), "");
    }
}
