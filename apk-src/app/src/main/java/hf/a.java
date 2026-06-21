package hf;

import ad.j0;
import ad.q;
import com.vk.sdk.api.ApiResponseParser;
import com.vk.sdk.api.ads.AdsService;
import com.vk.sdk.api.podcasts.PodcastsService;
import i4.a0;
import i4.y0;
import j3.p0;
import m3.g;
import me.p;
import q4.k;
import zc.e;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements ApiResponseParser, p.a, e, g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20560b;

    public /* synthetic */ a(int i) {
        this.f20560b = i;
    }

    @Override // m3.g
    public void accept(Object obj) {
        ((y0) obj).f21080b.getClass();
    }

    @Override // p.a
    public Object apply(Object obj) {
        switch (this.f20560b) {
            case 25:
                return obj;
            case 26:
                k kVar = (k) obj;
                kVar.getClass();
                return kVar.getClass().getSimpleName();
            case 27:
                return j0.r(q.u(((a0) obj).getTrackGroups().f20936b, new a(29)));
            default:
                return Integer.valueOf(((p0) obj).f26353c);
        }
    }

    @Override // com.vk.sdk.api.ApiResponseParser
    public Object parseResponse(p pVar) {
        switch (this.f20560b) {
            case 0:
                return AdsService.m98adsUpdateTargetGroup$lambda155(pVar);
            case 1:
                return AdsService.m96adsUpdateClients$lambda151(pVar);
            case 2:
                return AdsService.m54adsCheckLink$lambda2(pVar);
            case 3:
                return AdsService.m76adsGetLookalikeRequests$lambda81(pVar);
            case 4:
                return AdsService.m69adsGetAdsTargeting$lambda55(pVar);
            case 5:
                return AdsService.m91adsRemoveTargetContacts$lambda137(pVar);
            case 6:
                return AdsService.m75adsGetFloodStats$lambda79(pVar);
            case 7:
                return AdsService.m64adsDeleteTargetGroup$lambda30(pVar);
            case 8:
                return AdsService.m56adsCreateCampaigns$lambda7(pVar);
            case 9:
                return AdsService.m79adsGetOfficeUsers$lambda92(pVar);
            case 10:
                return AdsService.m87adsGetUploadURL$lambda128(pVar);
            case 11:
                return AdsService.m55adsCreateAds$lambda5(pVar);
            case 12:
                return AdsService.m53adsAddOfficeUsers$lambda0(pVar);
            case 13:
                return AdsService.m99adsUpdateTargetPixel$lambda161(pVar);
            case 14:
                return AdsService.m81adsGetRejectionReason$lambda96(pVar);
            case 15:
                return AdsService.m68adsGetAdsLayout$lambda46(pVar);
            case 16:
                return AdsService.m90adsRemoveOfficeUsers$lambda135(pVar);
            case 17:
                return AdsService.m57adsCreateClients$lambda9(pVar);
            case 18:
                return AdsService.m85adsGetTargetPixels$lambda112(pVar);
            case 19:
                return AdsService.m78adsGetMusiciansByIds$lambda90(pVar);
            case 20:
                return AdsService.m59adsCreateTargetGroup$lambda15(pVar);
            case 21:
                return AdsService.m63adsDeleteClients$lambda28(pVar);
            case 22:
                return AdsService.m97adsUpdateOfficeUsers$lambda153(pVar);
            case 23:
                return AdsService.m65adsDeleteTargetPixel$lambda33(pVar);
            default:
                return PodcastsService.m455podcastsSearchPodcast$lambda0(pVar);
        }
    }
}
