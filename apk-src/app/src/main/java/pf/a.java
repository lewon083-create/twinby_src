package pf;

import com.vk.sdk.api.ApiResponseParser;
import com.vk.sdk.api.docs.DocsService;
import com.vk.sdk.api.donut.DonutService;
import com.vk.sdk.api.store.StoreService;
import com.vk.sdk.api.stories.StoriesService;
import java.lang.reflect.Constructor;
import me.p;
import q4.k;
import qc.w;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements ApiResponseParser, w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31466b;

    public /* synthetic */ a(int i) {
        this.f31466b = i;
    }

    public Constructor a() {
        switch (this.f31466b) {
            case 7:
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(k.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(k.class).getConstructor(null);
        }
    }

    @Override // com.vk.sdk.api.ApiResponseParser
    public Object parseResponse(p pVar) {
        switch (this.f31466b) {
            case 0:
                return DocsService.m149docsAdd$lambda0(pVar);
            case 1:
                return DocsService.m152docsGet$lambda8(pVar);
            case 2:
                return StoreService.m493storeGetStickersKeywords$lambda10(pVar);
            case 3:
                return StoreService.m494storeRemoveStickersFromFavorite$lambda17(pVar);
            case 4:
                return StoreService.m492storeGetProducts$lambda3(pVar);
            case 5:
                return StoreService.m490storeAddStickersToFavorite$lambda0(pVar);
            case 6:
                return StoreService.m491storeGetFavoriteStickers$lambda2(pVar);
            case 7:
            case 8:
            case 9:
            default:
                return StoriesService.m509storiesSave$lambda62(pVar);
            case 10:
                return DonutService.m163donutIsDon$lambda13(pVar);
            case 11:
                return DonutService.m161donutGetSubscription$lambda5(pVar);
            case 12:
                return DonutService.m160donutGetFriends$lambda0(pVar);
            case 13:
                return DonutService.m162donutGetSubscriptions$lambda7(pVar);
            case 14:
                return StoriesService.m510storiesSearch$lambda65(pVar);
            case 15:
                return StoriesService.m497storiesGet$lambda7(pVar);
            case 16:
                return StoriesService.m512storiesUnbanOwner$lambda81(pVar);
            case 17:
                return StoriesService.m511storiesSendInteraction$lambda75(pVar);
            case 18:
                return StoriesService.m496storiesDelete$lambda2(pVar);
            case 19:
                return StoriesService.m498storiesGetBanned$lambda12(pVar);
            case 20:
                return StoriesService.m508storiesHideReply$lambda60(pVar);
            case 21:
                return StoriesService.m500storiesGetById$lambda20(pVar);
            case 22:
                return StoriesService.m505storiesGetViewers$lambda49(pVar);
            case 23:
                return StoriesService.m504storiesGetVideoUploadServer$lambda40(pVar);
            case 24:
                return StoriesService.m495storiesBanOwner$lambda0(pVar);
            case 25:
                return StoriesService.m503storiesGetStats$lambda38(pVar);
            case 26:
                return StoriesService.m507storiesHideAllReplies$lambda57(pVar);
            case 27:
                return StoriesService.m506storiesGetViewersExtended$lambda53(pVar);
            case 28:
                return StoriesService.m502storiesGetReplies$lambda33(pVar);
        }
    }
}
