package io.appmetrica.analytics.idsync.impl;

import android.net.Uri;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.idsync.impl.r;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class r implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ServiceContext f22016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22018c = CommonUrlParts.ADV_ID;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f22019d = CommonUrlParts.HUAWEI_OAID;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f22020e = CommonUrlParts.YANDEX_ADV_ID;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f22021f = "uuid";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f22022g = CommonUrlParts.DEVICE_ID;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f22023h = CommonUrlParts.APP_SET_ID;
    public final long i = TimeUnit.SECONDS.toMillis(60);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f22024j = 1000;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final SystemTimeProvider f22025k = new SystemTimeProvider();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final u f22026l;

    public r(@NotNull ServiceContext serviceContext, @NotNull String str) {
        this.f22016a = serviceContext;
        this.f22017b = str;
        this.f22026l = new u(serviceContext);
    }

    @Override // io.appmetrica.analytics.idsync.impl.s
    public final void a(@NotNull String str, @NotNull SdkIdentifiers sdkIdentifiers) {
        PlatformIdentifiers platformIdentifiers = this.f22016a.getPlatformIdentifiers();
        AdvertisingIdsHolder identifiers = platformIdentifiers.getAdvIdentifiersProvider().getIdentifiers(this.f22016a.getContext());
        Uri.Builder builderBuildUpon = Uri.parse(this.f22017b).buildUpon();
        AdTrackingInfo adTrackingInfo = identifiers.getGoogle().mAdTrackingInfo;
        if (adTrackingInfo != null) {
            builderBuildUpon.appendQueryParameter(this.f22018c, adTrackingInfo.advId);
        }
        AdTrackingInfo adTrackingInfo2 = identifiers.getHuawei().mAdTrackingInfo;
        if (adTrackingInfo2 != null) {
            builderBuildUpon.appendQueryParameter(this.f22019d, adTrackingInfo2.advId);
        }
        AdTrackingInfo adTrackingInfo3 = identifiers.getYandex().mAdTrackingInfo;
        if (adTrackingInfo3 != null) {
            builderBuildUpon.appendQueryParameter(this.f22020e, adTrackingInfo3.advId);
        }
        builderBuildUpon.appendQueryParameter(this.f22021f, sdkIdentifiers.getUuid());
        builderBuildUpon.appendQueryParameter(this.f22022g, sdkIdentifiers.getDeviceId());
        String id2 = platformIdentifiers.getAppSetIdProvider().getAppSetId().getId();
        if (id2 != null) {
            builderBuildUpon.appendQueryParameter(this.f22023h, id2);
        }
        String string = builderBuildUpon.build().toString();
        IHandlerExecutor supportIOExecutor = this.f22016a.getExecutorProvider().getSupportIOExecutor();
        supportIOExecutor.execute(new ri.a(this, string, str, supportIOExecutor, this.f22025k.currentTimeMillis(), 1));
    }

    public static final void a(r rVar, String str, String str2, IHandlerExecutor iHandlerExecutor, long j10) {
        long j11 = rVar.f22024j;
        if (rVar.f22026l.a(str, str2)) {
            return;
        }
        rVar.a(str, str2, iHandlerExecutor, j10, 0, j11);
    }

    public static final void a(r rVar, String str, String str2, IHandlerExecutor iHandlerExecutor, long j10, int i, long j11) {
        int i10 = i + 1;
        if (rVar.f22026l.a(str, str2)) {
            return;
        }
        rVar.a(str, str2, iHandlerExecutor, j10, i10, j11);
    }

    public final void a(final String str, final String str2, final IHandlerExecutor iHandlerExecutor, final long j10, final int i, long j11) {
        final long j12 = j11 * ((long) 2);
        if ((this.f22025k.currentTimeMillis() - j10) + j12 <= this.i) {
            iHandlerExecutor.executeDelayed(new Runnable() { // from class: th.a
                @Override // java.lang.Runnable
                public final void run() {
                    r.a(this.f33785b, str, str2, iHandlerExecutor, j10, i, j12);
                }
            }, j11);
        }
    }
}
