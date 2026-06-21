package gg;

import android.view.View;
import com.google.firebase.abt.component.AbtRegistrar;
import com.vk.sdk.api.ApiResponseParser;
import com.vk.sdk.api.ads.AdsService;
import com.vk.sdk.api.photos.PhotosService;
import gj.c;
import md.e;
import me.p;
import q9.o;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements ApiResponseParser, c, e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20147b;

    public /* synthetic */ b(int i) {
        this.f20147b = i;
    }

    @Override // gj.c
    public boolean a(View view) {
        return view.hasFocus();
    }

    @Override // md.e
    public Object l(o oVar) {
        return AbtRegistrar.lambda$getComponents$0(oVar);
    }

    @Override // com.vk.sdk.api.ApiResponseParser
    public Object parseResponse(p pVar) {
        switch (this.f20147b) {
            case 0:
                return PhotosService.m416photosGetAlbumsCount$lambda87(pVar);
            case 1:
                return PhotosService.m414photosGet$lambda56(pVar);
            case 2:
                return PhotosService.m439photosPutTag$lambda203(pVar);
            case 3:
                return PhotosService.m422photosGetChatUploadServer$lambda122(pVar);
            case 4:
                return PhotosService.m451photosSaveOwnerCoverPhoto$lambda256(pVar);
            case 5:
            case 6:
            default:
                return AdsService.m89adsImportTargetContacts$lambda132(pVar);
            case 7:
                return AdsService.m60adsCreateTargetPixel$lambda20(pVar);
            case 8:
                return AdsService.m58adsCreateLookalikeRequest$lambda11(pVar);
            case 9:
                return AdsService.m86adsGetTargetingStats$lambda115(pVar);
            case 10:
                return AdsService.m62adsDeleteCampaigns$lambda26(pVar);
            case 11:
                return AdsService.m82adsGetStatistics$lambda98(pVar);
            case 12:
                return AdsService.m80adsGetPostsReach$lambda94(pVar);
            case 13:
                return AdsService.m71adsGetCampaigns$lambda65(pVar);
            case 14:
                return AdsService.m83adsGetSuggestions$lambda102(pVar);
            case 15:
                return AdsService.m74adsGetDemographics$lambda77(pVar);
            case 16:
                return AdsService.m88adsGetVideoUploadURL$lambda131(pVar);
            case 17:
                return AdsService.m70adsGetBudget$lambda63(pVar);
            case 18:
                return AdsService.m92adsSaveLookalikeRequestResult$lambda140(pVar);
            case 19:
                return AdsService.m73adsGetClients$lambda75(pVar);
            case 20:
                return AdsService.m77adsGetMusicians$lambda88(pVar);
            case 21:
                return AdsService.m94adsUpdateAds$lambda147(pVar);
            case 22:
                return AdsService.m95adsUpdateCampaigns$lambda149(pVar);
            case 23:
                return AdsService.m72adsGetCategories$lambda72(pVar);
            case 24:
                return AdsService.m61adsDeleteAds$lambda24(pVar);
            case 25:
                return AdsService.m66adsGetAccounts$lambda36(pVar);
            case 26:
                return AdsService.m67adsGetAds$lambda37(pVar);
            case 27:
                return AdsService.m84adsGetTargetGroups$lambda109(pVar);
            case 28:
                return AdsService.m93adsShareTargetGroup$lambda143(pVar);
        }
    }
}
