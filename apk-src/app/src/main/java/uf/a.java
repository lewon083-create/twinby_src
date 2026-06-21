package uf;

import com.vk.sdk.api.ApiResponseParser;
import com.vk.sdk.api.friends.FriendsService;
import com.vk.sdk.api.video.VideoService;
import me.p;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements ApiResponseParser {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f34473b;

    public /* synthetic */ a(int i) {
        this.f34473b = i;
    }

    @Override // com.vk.sdk.api.ApiResponseParser
    public final Object parseResponse(p pVar) {
        switch (this.f34473b) {
            case 0:
                return FriendsService.m195friendsDeleteAllRequests$lambda17(pVar);
            case 1:
                return FriendsService.m202friendsGetLists$lambda46(pVar);
            case 2:
                return FriendsService.m208friendsSearch$lambda90(pVar);
            case 3:
                return FriendsService.m197friendsEdit$lambda20(pVar);
            case 4:
                return FriendsService.m205friendsGetRecent$lambda66(pVar);
            case 5:
                return FriendsService.m191friendsAddList$lambda5(pVar);
            case 6:
                return FriendsService.m203friendsGetMutual$lambda50(pVar);
            case 7:
                return FriendsService.m207friendsGetSuggestions$lambda81(pVar);
            case 8:
                return FriendsService.m201friendsGetByPhones$lambda41(pVar);
            case 9:
                return FriendsService.m193friendsAreFriendsExtended$lambda11(pVar);
            case 10:
                return FriendsService.m206friendsGetRequests$lambda69(pVar);
            case 11:
                return FriendsService.m200friendsGetAppUsers$lambda40(pVar);
            case 12:
                return FriendsService.m204friendsGetOnline$lambda58(pVar);
            case 13:
                return VideoService.m543videoGetAlbumById$lambda60(pVar);
            case 14:
                return VideoService.m546videoGetAlbumsByVideoExtended$lambda78(pVar);
            case 15:
                return VideoService.m535videoCreateComment$lambda14(pVar);
            case 16:
                return VideoService.m550videoRemoveFromAlbum$lambda99(pVar);
            case 17:
                return VideoService.m537videoDeleteAlbum$lambda27(pVar);
            case 18:
                return VideoService.m532videoAdd$lambda0(pVar);
            case 19:
                return VideoService.m541videoEditComment$lambda47(pVar);
            case 20:
                return VideoService.m533videoAddAlbum$lambda3(pVar);
            case 21:
                return VideoService.m556videoRestoreComment$lambda128(pVar);
            case 22:
                return VideoService.m544videoGetAlbums$lambda63(pVar);
            case 23:
                return VideoService.m559videoSearchExtended$lambda159(pVar);
            case 24:
                return VideoService.m554videoReportComment$lambda122(pVar);
            case 25:
                return VideoService.m545videoGetAlbumsByVideo$lambda75(pVar);
            case 26:
                return VideoService.m536videoDelete$lambda23(pVar);
            case 27:
                return VideoService.m558videoSearch$lambda145(pVar);
            case 28:
                return VideoService.m551videoReorderAlbums$lambda104(pVar);
            default:
                return VideoService.m547videoGetAlbumsExtended$lambda69(pVar);
        }
    }
}
