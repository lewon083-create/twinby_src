package yf;

import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.vk.sdk.api.ApiResponseParser;
import com.vk.sdk.api.likes.LikesService;
import com.vk.sdk.api.market.MarketService;
import md.e;
import me.p;
import q9.o;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements ApiResponseParser, e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f45619b;

    public /* synthetic */ a(int i) {
        this.f45619b = i;
    }

    @Override // md.e
    public Object l(o oVar) {
        return FirebaseInstallationsRegistrar.lambda$getComponents$0(oVar);
    }

    @Override // com.vk.sdk.api.ApiResponseParser
    public Object parseResponse(p pVar) {
        switch (this.f45619b) {
            case 0:
                return LikesService.m275likesGetListExtended$lambda18(pVar);
            case 1:
                return LikesService.m274likesGetList$lambda8(pVar);
            case 2:
                return LikesService.m273likesDelete$lambda4(pVar);
            case 3:
                return LikesService.m272likesAdd$lambda0(pVar);
            case 4:
                return LikesService.m276likesIsLiked$lambda28(pVar);
            case 5:
            case 6:
            case 7:
            default:
                return MarketService.m289marketGetAlbumById$lambda79(pVar);
            case 8:
                return MarketService.m290marketGetAlbums$lambda81(pVar);
            case 9:
                return MarketService.m283marketDeleteComment$lambda32(pVar);
            case 10:
                return MarketService.m308marketSearch$lambda146(pVar);
            case 11:
                return MarketService.m284marketEdit$lambda34(pVar);
            case 12:
                return MarketService.m282marketDeleteAlbum$lambda30(pVar);
            case 13:
                return MarketService.m300marketGetOrdersExtended$lambda120(pVar);
            case 14:
                return MarketService.m278marketAddAlbum$lambda13(pVar);
            case 15:
                return MarketService.m287marketEditOrder$lambda50(pVar);
            case 16:
                return MarketService.m285marketEditAlbum$lambda41(pVar);
            case 17:
                return MarketService.m279marketAddToAlbum$lambda18(pVar);
            case 18:
                return MarketService.m306marketRestore$lambda142(pVar);
            case 19:
                return MarketService.m296marketGetGroupOrders$lambda102(pVar);
            case 20:
                return MarketService.m301marketRemoveFromAlbum$lambda126(pVar);
            case 21:
                return MarketService.m292marketGetByIdExtended$lambda87(pVar);
            case 22:
                return MarketService.m307marketRestoreComment$lambda144(pVar);
            case 23:
                return MarketService.m298marketGetOrderItems$lambda109(pVar);
            case 24:
                return MarketService.m304marketReport$lambda137(pVar);
            case 25:
                return MarketService.m288marketGet$lambda61(pVar);
            case 26:
                return MarketService.m309marketSearchExtended$lambda158(pVar);
            case 27:
                return MarketService.m297marketGetOrderById$lambda106(pVar);
            case 28:
                return MarketService.m291marketGetById$lambda85(pVar);
        }
    }
}
