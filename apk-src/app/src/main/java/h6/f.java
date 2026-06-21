package h6;

import a6.j;
import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.TopicsManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20443b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(TopicsManager topicsManager, int i) {
        super(topicsManager);
        this.f20443b = i;
    }

    @Override // h6.h
    public GetTopicsRequest a(b request) {
        switch (this.f20443b) {
            case 0:
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(request, "request");
                GetTopicsRequest.Builder builderK = j.k();
                request.getClass();
                GetTopicsRequest getTopicsRequestBuild = builderK.setAdsSdkName("com.google.android.gms.ads").setShouldRecordObservation(request.f20437a).build();
                Intrinsics.checkNotNullExpressionValue(getTopicsRequestBuild, "Builder()\n            .s…ion)\n            .build()");
                return getTopicsRequestBuild;
            case 1:
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(request, "request");
                GetTopicsRequest.Builder builderK2 = j.k();
                request.getClass();
                GetTopicsRequest getTopicsRequestBuild2 = builderK2.setAdsSdkName("com.google.android.gms.ads").setShouldRecordObservation(request.f20437a).build();
                Intrinsics.checkNotNullExpressionValue(getTopicsRequestBuild2, "Builder()\n            .s…ion)\n            .build()");
                return getTopicsRequestBuild2;
            case 2:
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(request, "request");
                GetTopicsRequest.Builder builderK3 = j.k();
                request.getClass();
                GetTopicsRequest getTopicsRequestBuild3 = builderK3.setAdsSdkName("com.google.android.gms.ads").setShouldRecordObservation(request.f20437a).build();
                Intrinsics.checkNotNullExpressionValue(getTopicsRequestBuild3, "Builder()\n            .s…ion)\n            .build()");
                return getTopicsRequestBuild3;
            case 3:
            default:
                return super.a(request);
            case 4:
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(request, "request");
                GetTopicsRequest.Builder builderK4 = j.k();
                request.getClass();
                GetTopicsRequest getTopicsRequestBuild4 = builderK4.setAdsSdkName("com.google.android.gms.ads").setShouldRecordObservation(request.f20437a).build();
                Intrinsics.checkNotNullExpressionValue(getTopicsRequestBuild4, "Builder()\n            .s…ion)\n            .build()");
                return getTopicsRequestBuild4;
        }
    }

    @Override // h6.h
    public c b(GetTopicsResponse response) {
        switch (this.f20443b) {
            case 0:
                Intrinsics.checkNotNullParameter(response, "response");
                return wa.a.h(response);
            case 1:
            default:
                return super.b(response);
            case 2:
                Intrinsics.checkNotNullParameter(response, "response");
                return wa.a.h(response);
        }
    }
}
