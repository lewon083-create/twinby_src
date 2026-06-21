package wf;

import com.vk.sdk.api.ApiResponseParser;
import com.vk.sdk.api.groups.GroupsService;
import me.p;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements ApiResponseParser {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f35249b;

    public /* synthetic */ a(int i) {
        this.f35249b = i;
    }

    @Override // com.vk.sdk.api.ApiResponseParser
    public final Object parseResponse(p pVar) {
        switch (this.f35249b) {
            case 0:
                return GroupsService.m235groupsGetCatalogInfoExtended$lambda168(pVar);
            case 1:
                return GroupsService.m237groupsGetInvitedUsers$lambda171(pVar);
            case 2:
                return GroupsService.m261groupsTagDelete$lambda362(pVar);
            case 3:
                return GroupsService.m221groupsEditAddress$lambda84(pVar);
            case 4:
                return GroupsService.m212groupsAddLink$lambda11(pVar);
            case 5:
                return GroupsService.m216groupsDeleteAddress$lambda30(pVar);
            case 6:
                return GroupsService.m264groupsUnban$lambda369(pVar);
            case 7:
                return GroupsService.m219groupsDisableOnline$lambda36(pVar);
            case 8:
                return GroupsService.m242groupsGetMembers$lambda190(pVar);
            case 9:
                return GroupsService.m249groupsIsMember$lambda214(pVar);
            case 10:
                return GroupsService.m230groupsGetCallbackConfirmationCode$lambda153(pVar);
            case 11:
                return GroupsService.m229groupsGetById$lambda147(pVar);
            case 12:
                return GroupsService.m223groupsEditLink$lambda101(pVar);
            case 13:
                return GroupsService.m232groupsGetCallbackSettings$lambda158(pVar);
            case 14:
                return GroupsService.m217groupsDeleteCallbackServer$lambda32(pVar);
            case 15:
                return GroupsService.m233groupsGetCatalog$lambda161(pVar);
            case 16:
                return GroupsService.m234groupsGetCatalogInfo$lambda165(pVar);
            case 17:
                return GroupsService.m257groupsSetSettings$lambda348(pVar);
            case 18:
                return GroupsService.m225groupsEnableOnline$lambda111(pVar);
            case 19:
                return GroupsService.m210groupsAddAddress$lambda0(pVar);
            case 20:
                return GroupsService.m247groupsGetTokenPermissions$lambda211(pVar);
            case 21:
                return GroupsService.m254groupsSearch$lambda229(pVar);
            case 22:
                return GroupsService.m224groupsEditManager$lambda104(pVar);
            case 23:
                return GroupsService.m213groupsApproveRequest$lambda14(pVar);
            case 24:
                return GroupsService.m220groupsEdit$lambda38(pVar);
            case 25:
                return GroupsService.m231groupsGetCallbackServers$lambda155(pVar);
            case 26:
                return GroupsService.m253groupsReorderLink$lambda226(pVar);
            case 27:
                return GroupsService.m227groupsGetAddresses$lambda131(pVar);
            case 28:
                return GroupsService.m211groupsAddCallbackServer$lambda8(pVar);
            default:
                return GroupsService.m240groupsGetLongPollServer$lambda186(pVar);
        }
    }
}
