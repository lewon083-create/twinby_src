package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.PreloadInfo;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.tf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0511tf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0412pf f24787a;

    public C0511tf(PreloadInfo preloadInfo, PublicLogger publicLogger, boolean z5) {
        if (preloadInfo != null) {
            if (TextUtils.isEmpty(preloadInfo.getTrackingId())) {
                publicLogger.error("Required field \"PreloadInfo.trackingId\" is empty!\nThis preload info will be skipped.", new Object[0]);
            } else {
                this.f24787a = new C0412pf(preloadInfo.getTrackingId(), new JSONObject(preloadInfo.getAdditionalParams()), true, z5, T7.f23005c);
            }
        }
    }
}
