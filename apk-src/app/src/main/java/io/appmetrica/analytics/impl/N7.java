package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.sentry.util.StringUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class N7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U f22722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0043b2 f22723b;

    public N7(U u4, C0043b2 c0043b2) {
        this.f22722a = u4;
        this.f22723b = c0043b2;
    }

    public final String a() {
        AdvertisingIdsHolder advertisingIdsHolder;
        byte[] bArrDigest;
        U u4 = this.f22722a;
        In in = new In(5, 500);
        synchronized (u4) {
            try {
                u4.a((Fi) in, true).get();
            } catch (InterruptedException | ExecutionException unused) {
            }
            advertisingIdsHolder = u4.f23048k;
        }
        AdTrackingInfoResult yandex = advertisingIdsHolder.getYandex();
        if (!yandex.isValid()) {
            String id2 = this.f22723b.getAppSetId().getId();
            if (id2 != null && id2.length() != 0) {
                try {
                    UUID.fromString(id2);
                    if (!id2.equals(StringUtils.PROPER_NIL_UUID)) {
                        return kotlin.text.a0.l(id2, "-", "");
                    }
                } catch (Throwable unused2) {
                }
            }
            return kotlin.text.a0.l(UUID.randomUUID().toString(), "-", "").toLowerCase(Locale.US);
        }
        AdTrackingInfo adTrackingInfo = yandex.mAdTrackingInfo;
        Intrinsics.b(adTrackingInfo);
        String str = adTrackingInfo.advId;
        Intrinsics.b(str);
        try {
            bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes(Charsets.UTF_8));
        } catch (NoSuchAlgorithmException unused3) {
            bArrDigest = new byte[0];
        }
        return io.appmetrica.analytics.coreutils.internal.StringUtils.toHexString(bArrDigest);
    }

    public N7() {
        this(C0382oa.k().c(), C0382oa.k().d());
    }
}
