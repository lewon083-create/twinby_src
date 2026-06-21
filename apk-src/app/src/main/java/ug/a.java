package ug;

import ad.j0;
import com.vk.sdk.api.ApiResponseParser;
import com.vk.sdk.api.gifts.GiftsService;
import com.vk.sdk.api.video.VideoService;
import com.vk.sdk.api.wall.WallService;
import j4.i;
import me.p;
import q4.k;
import q4.n;
import v4.c;
import zc.e;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements ApiResponseParser, e, n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f34474b;

    public /* synthetic */ a(int i) {
        this.f34474b = i;
    }

    @Override // zc.e
    public Object apply(Object obj) {
        return j0.w(Integer.valueOf(((i) obj).f26482b));
    }

    @Override // q4.n
    public k[] createExtractors() {
        return new k[]{new c()};
    }

    @Override // com.vk.sdk.api.ApiResponseParser
    public Object parseResponse(p pVar) {
        switch (this.f34474b) {
            case 0:
                return VideoService.m548videoGetComments$lambda81(pVar);
            case 1:
                return VideoService.m538videoDeleteComment$lambda30(pVar);
            case 2:
                return VideoService.m557videoSave$lambda131(pVar);
            case 3:
                return VideoService.m534videoAddToAlbum$lambda9(pVar);
            case 4:
                return VideoService.m552videoReorderVideos$lambda109(pVar);
            case 5:
                return VideoService.m553videoReport$lambda117(pVar);
            case 6:
                return VideoService.m555videoRestore$lambda125(pVar);
            case 7:
                return VideoService.m539videoEdit$lambda33(pVar);
            case 8:
                return VideoService.m542videoGet$lambda52(pVar);
            case 9:
                return VideoService.m540videoEditAlbum$lambda42(pVar);
            case 10:
                return VideoService.m549videoGetCommentsExtended$lambda90(pVar);
            case 11:
            case 12:
            default:
                return WallService.m571wallGetComment$lambda86(pVar);
            case 13:
                return GiftsService.m209giftsGet$lambda0(pVar);
            case 14:
                return WallService.m578wallPin$lambda132(pVar);
            case 15:
                return WallService.m568wallGet$lambda58(pVar);
            case 16:
                return WallService.m577wallOpenComments$lambda130(pVar);
            case 17:
                return WallService.m573wallGetComments$lambda96(pVar);
            case 18:
                return WallService.m574wallGetCommentsExtended$lambda110(pVar);
            case 19:
                return WallService.m570wallGetByIdExtended$lambda81(pVar);
            case 20:
                return WallService.m562wallCreateComment$lambda4(pVar);
            case 21:
                return WallService.m566wallEditAdsStealth$lambda40(pVar);
            case 22:
                return WallService.m565wallEdit$lambda20(pVar);
            case 23:
                return WallService.m580wallPostAdsStealth$lambda156(pVar);
            case 24:
                return WallService.m576wallGetReposts$lambda124(pVar);
            case 25:
                return WallService.m561wallCloseComments$lambda2(pVar);
            case 26:
                return WallService.m581wallReportComment$lambda169(pVar);
            case 27:
                return WallService.m584wallRestore$lambda181(pVar);
            case 28:
                return WallService.m572wallGetCommentExtended$lambda91(pVar);
        }
    }
}
