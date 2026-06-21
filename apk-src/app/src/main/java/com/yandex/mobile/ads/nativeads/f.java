package com.yandex.mobile.ads.nativeads;

import io.sentry.SentryLogEvent;
import io.sentry.protocol.Feedback;
import kotlin.collections.j0;
import yads.s12;
import yads.s22;
import yads.t12;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class f {
    public static t12 a(NativeAdViewBinder nativeAdViewBinder) {
        s12 s12Var = new s12(nativeAdViewBinder.getNativeAdView(), s22.f42792c, j0.d());
        s12Var.f42784e.put("age", nativeAdViewBinder.getAgeView());
        s12Var.f42784e.put(SentryLogEvent.JsonKeys.BODY, nativeAdViewBinder.getBodyView());
        s12Var.f42784e.put("call_to_action", nativeAdViewBinder.getCallToActionView());
        s12Var.f42784e.put("domain", nativeAdViewBinder.getDomainView());
        s12Var.f42784e.put("favicon", nativeAdViewBinder.getFaviconView());
        s12Var.f42784e.put(Feedback.TYPE, nativeAdViewBinder.getFeedbackView());
        s12Var.f42784e.put("icon", nativeAdViewBinder.getIconView());
        s12Var.f42784e.put("media", nativeAdViewBinder.getMediaView());
        s12Var.f42784e.put("price", nativeAdViewBinder.getPriceView());
        s12Var.f42784e.put("rating", nativeAdViewBinder.getRatingView());
        s12Var.f42784e.put("review_count", nativeAdViewBinder.getReviewCountView());
        s12Var.f42784e.put("sponsored", nativeAdViewBinder.getSponsoredView());
        s12Var.f42784e.put("title", nativeAdViewBinder.getTitleView());
        s12Var.f42784e.put("warning", nativeAdViewBinder.getWarningView());
        return new t12(s12Var);
    }
}
