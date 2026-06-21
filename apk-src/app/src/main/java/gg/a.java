package gg;

import com.vk.sdk.api.ApiResponseParser;
import com.vk.sdk.api.photos.PhotosService;
import me.p;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements ApiResponseParser {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20146b;

    public /* synthetic */ a(int i) {
        this.f20146b = i;
    }

    @Override // com.vk.sdk.api.ApiResponseParser
    public final Object parseResponse(p pVar) {
        switch (this.f20146b) {
            case 0:
                return PhotosService.m423photosGetComments$lambda127(pVar);
            case 1:
                return PhotosService.m424photosGetCommentsExtended$lambda138(pVar);
            case 2:
                return PhotosService.m436photosGetWallUploadServer$lambda193(pVar);
            case 3:
                return PhotosService.m408photosDelete$lambda24(pVar);
            case 4:
                return PhotosService.m447photosSave$lambda235(pVar);
            case 5:
                return PhotosService.m425photosGetExtended$lambda67(pVar);
            case 6:
                return PhotosService.m449photosSaveMarketPhoto$lambda247(pVar);
            case 7:
                return PhotosService.m410photosDeleteComment$lambda30(pVar);
            case 8:
                return PhotosService.m405photosCopy$lambda3(pVar);
            case 9:
                return PhotosService.m434photosGetUserPhotos$lambda181(pVar);
            case 10:
                return PhotosService.m428photosGetMessagesUploadServer$lambda157(pVar);
            case 11:
                return PhotosService.m452photosSaveOwnerPhoto$lambda258(pVar);
            case 12:
                return PhotosService.m443photosReport$lambda223(pVar);
            case 13:
                return PhotosService.m421photosGetByIdExtended$lambda119(pVar);
            case 14:
                return PhotosService.m407photosCreateComment$lambda14(pVar);
            case 15:
                return PhotosService.m426photosGetMarketAlbumUploadServer$lambda149(pVar);
            case 16:
                return PhotosService.m430photosGetOwnerCoverPhotoUploadServer$lambda164(pVar);
            case 17:
                return PhotosService.m406photosCreateAlbum$lambda6(pVar);
            case 18:
                return PhotosService.m433photosGetUploadServer$lambda177(pVar);
            case 19:
                return PhotosService.m404photosConfirmTag$lambda0(pVar);
            case 20:
                return PhotosService.m446photosRestoreComment$lambda232(pVar);
            case 21:
                return PhotosService.m440photosRemoveTag$lambda210(pVar);
            case 22:
                return PhotosService.m431photosGetOwnerPhotoUploadServer$lambda170(pVar);
            case 23:
                return PhotosService.m415photosGetAlbums$lambda78(pVar);
            case 24:
                return PhotosService.m412photosEditAlbum$lambda42(pVar);
            case 25:
                return PhotosService.m454photosSearch$lambda272(pVar);
            case 26:
                return PhotosService.m444photosReportComment$lambda226(pVar);
            case 27:
                return PhotosService.m450photosSaveMessagesPhoto$lambda252(pVar);
            case 28:
                return PhotosService.m442photosReorderPhotos$lambda218(pVar);
            default:
                return PhotosService.m413photosEditComment$lambda51(pVar);
        }
    }
}
