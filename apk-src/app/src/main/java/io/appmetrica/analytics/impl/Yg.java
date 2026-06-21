package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.networktasks.internal.AdvIdWithLimitedAppender;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.networktasks.internal.IParamsAppender;
import io.appmetrica.analytics.networktasks.internal.NetworkTaskForSendingDataParamsAppender;
import io.appmetrica.analytics.networktasks.internal.RequestBodyEncrypter;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Yg implements IParamsAppender {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdvIdWithLimitedAppender f23346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NetworkTaskForSendingDataParamsAppender f23347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0329m7 f23348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ib f23349d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f23350e;

    public Yg(@NonNull RequestBodyEncrypter requestBodyEncrypter) {
        this(new AdvIdWithLimitedAppender(), new NetworkTaskForSendingDataParamsAppender(requestBodyEncrypter), new Ib());
    }

    public final void a(@NonNull C0329m7 c0329m7) {
        this.f23348c = c0329m7;
    }

    public Yg(AdvIdWithLimitedAppender advIdWithLimitedAppender, NetworkTaskForSendingDataParamsAppender networkTaskForSendingDataParamsAppender, Ib ib) {
        this.f23346a = advIdWithLimitedAppender;
        this.f23347b = networkTaskForSendingDataParamsAppender;
        this.f23349d = ib;
    }

    public final void a(long j10) {
        this.f23350e = j10;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.IParamsAppender
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void appendParams(@NonNull Uri.Builder builder, @NonNull C0264jh c0264jh) {
        builder.path("report");
        this.f23347b.appendEncryptedData(builder);
        C0329m7 c0329m7 = this.f23348c;
        if (c0329m7 != null) {
            builder.appendQueryParameter(CommonUrlParts.DEVICE_ID, StringUtils.ifIsEmptyToDef(c0329m7.f24341a, c0264jh.getDeviceId()));
            builder.appendQueryParameter("uuid", StringUtils.ifIsEmptyToDef(this.f23348c.f24342b, c0264jh.getUuid()));
            a(builder, CommonUrlParts.ANALYTICS_SDK_VERSION_NAME, this.f23348c.f24343c);
            builder.appendQueryParameter(CommonUrlParts.APP_VERSION, StringUtils.ifIsEmptyToDef(this.f23348c.f24346f, c0264jh.getAppVersion()));
            builder.appendQueryParameter(CommonUrlParts.APP_VERSION_CODE, StringUtils.ifIsEmptyToDef(this.f23348c.f24348h, c0264jh.getAppBuildNumber()));
            builder.appendQueryParameter(CommonUrlParts.OS_VERSION, StringUtils.ifIsEmptyToDef(this.f23348c.i, c0264jh.getOsVersion()));
            a(builder, CommonUrlParts.OS_API_LEVEL, this.f23348c.f24349j);
            a(builder, CommonUrlParts.ANALYTICS_SDK_BUILD_NUMBER, this.f23348c.f24344d);
            a(builder, CommonUrlParts.ANALYTICS_SDK_BUILD_TYPE, this.f23348c.f24345e);
            a(builder, "app_debuggable", this.f23348c.f24347g);
            builder.appendQueryParameter("locale", StringUtils.ifIsEmptyToDef(this.f23348c.f24350k, c0264jh.getLocale()));
            builder.appendQueryParameter(CommonUrlParts.ROOT_STATUS, StringUtils.ifIsEmptyToDef(this.f23348c.f24351l, c0264jh.getDeviceRootStatus()));
            builder.appendQueryParameter(CommonUrlParts.APP_FRAMEWORK, StringUtils.ifIsEmptyToDef(this.f23348c.f24352m, c0264jh.getAppFramework()));
            a(builder, "attribution_id", this.f23348c.f24353n);
        }
        builder.appendQueryParameter("api_key_128", c0264jh.f24162m);
        builder.appendQueryParameter(CommonUrlParts.APP_ID, c0264jh.getPackageName());
        builder.appendQueryParameter(CommonUrlParts.APP_PLATFORM, c0264jh.getAppPlatform());
        builder.appendQueryParameter("model", c0264jh.getModel());
        builder.appendQueryParameter("manufacturer", c0264jh.getManufacturer());
        builder.appendQueryParameter(CommonUrlParts.SCREEN_WIDTH, String.valueOf(c0264jh.getScreenWidth()));
        builder.appendQueryParameter(CommonUrlParts.SCREEN_HEIGHT, String.valueOf(c0264jh.getScreenHeight()));
        builder.appendQueryParameter("screen_dpi", String.valueOf(c0264jh.getScreenDpi()));
        builder.appendQueryParameter(CommonUrlParts.SCALE_FACTOR, String.valueOf(c0264jh.getScaleFactor()));
        builder.appendQueryParameter(CommonUrlParts.DEVICE_TYPE, c0264jh.getDeviceType());
        a(builder, "clids_set", (String) WrapUtils.getOrDefault(c0264jh.f24165p, ""));
        builder.appendQueryParameter(CommonUrlParts.APP_SET_ID, c0264jh.getAppSetId());
        builder.appendQueryParameter(CommonUrlParts.APP_SET_ID_SCOPE, c0264jh.getAppSetIdScope());
        AdvIdWithLimitedAppender advIdWithLimitedAppender = this.f23346a;
        this.f23349d.getClass();
        advIdWithLimitedAppender.appendParams(builder, C0382oa.I.c().getIdentifiers());
        builder.appendQueryParameter(CommonUrlParts.REQUEST_ID, String.valueOf(this.f23350e));
    }

    public static void a(Uri.Builder builder, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }
}
