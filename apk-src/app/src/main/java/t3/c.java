package t3;

import com.vk.sdk.api.ApiResponseParser;
import com.vk.sdk.api.fave.FaveService;
import m3.k;
import me.p;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements k, ApiResponseParser {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33416b;

    public /* synthetic */ c(int i) {
        this.f33416b = i;
    }

    @Override // m3.k, yads.of1
    public void invoke(Object obj) {
        i iVar = (i) obj;
        switch (this.f33416b) {
            case 0:
                iVar.getClass();
                break;
            case 1:
                iVar.getClass();
                break;
            case 2:
                iVar.getClass();
                break;
            case 3:
                iVar.getClass();
                break;
            case 4:
                iVar.getClass();
                break;
            case 5:
                iVar.getClass();
                break;
            case 6:
                iVar.getClass();
                break;
            case 7:
                iVar.getClass();
                break;
            case 8:
                iVar.getClass();
                break;
            case 9:
                iVar.getClass();
                break;
            case 10:
                iVar.getClass();
                break;
            case 11:
                iVar.getClass();
                break;
            case 12:
                iVar.getClass();
                break;
            case 13:
                iVar.getClass();
                break;
            case 14:
                iVar.getClass();
                break;
            case 15:
                iVar.getClass();
                break;
            default:
                iVar.getClass();
                break;
        }
    }

    @Override // com.vk.sdk.api.ApiResponseParser
    public Object parseResponse(p pVar) {
        switch (this.f33416b) {
            case 17:
                return FaveService.m177faveGetTags$lambda47(pVar);
            case 18:
                return FaveService.m173faveEditTag$lambda21(pVar);
            case 19:
                return FaveService.m181faveRemovePage$lambda55(pVar);
            case 20:
                return FaveService.m166faveAddArticle$lambda0(pVar);
            case 21:
                return FaveService.m167faveAddLink$lambda2(pVar);
            case 22:
                return FaveService.m186faveReorderTags$lambda67(pVar);
            case 23:
                return FaveService.m188faveSetTags$lambda74(pVar);
            case 24:
                return FaveService.m171faveAddTag$lambda14(pVar);
            case 25:
                return FaveService.m182faveRemovePost$lambda59(pVar);
            case 26:
                return FaveService.m183faveRemoveProduct$lambda61(pVar);
            case 27:
                return FaveService.m169faveAddPost$lambda8(pVar);
            case 28:
                return FaveService.m185faveRemoveVideo$lambda65(pVar);
            default:
                return FaveService.m189faveTrackPageInteraction$lambda82(pVar);
        }
    }
}
