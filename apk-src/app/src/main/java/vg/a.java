package vg;

import com.vk.sdk.api.ApiResponseParser;
import com.vk.sdk.api.groups.GroupsService;
import com.vk.sdk.api.wall.WallService;
import me.p;
import q4.k;
import q4.n;
import w0.f;
import w4.b;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements ApiResponseParser, p.a, n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f34859b;

    public /* synthetic */ a(int i) {
        this.f34859b = i;
    }

    @Override // p.a
    public Object apply(Object obj) {
        return f.f34958b;
    }

    @Override // q4.n
    public k[] createExtractors() {
        return new k[]{new b()};
    }

    @Override // com.vk.sdk.api.ApiResponseParser
    public Object parseResponse(p pVar) {
        switch (this.f34859b) {
            case 0:
                return WallService.m582wallReportPost$lambda172(pVar);
            case 1:
                return WallService.m569wallGetById$lambda76(pVar);
            case 2:
                return WallService.m560wallCheckCopyrightLink$lambda0(pVar);
            case 3:
                return WallService.m567wallEditComment$lambda53(pVar);
            case 4:
                return WallService.m579wallPost$lambda135(pVar);
            case 5:
                return WallService.m583wallRepost$lambda175(pVar);
            case 6:
                return WallService.m575wallGetExtended$lambda67(pVar);
            case 7:
                return WallService.m588wallUnpin$lambda208(pVar);
            case 8:
                return WallService.m585wallRestoreComment$lambda185(pVar);
            case 9:
                return WallService.m586wallSearch$lambda188(pVar);
            case 10:
                return WallService.m563wallDelete$lambda13(pVar);
            case 11:
                return WallService.m564wallDeleteComment$lambda17(pVar);
            case 12:
                return WallService.m587wallSearchExtended$lambda198(pVar);
            case 13:
            case 14:
            default:
                return GroupsService.m236groupsGetExtended$lambda122(pVar);
            case 15:
                return GroupsService.m256groupsSetLongPollSettings$lambda295(pVar);
            case 16:
                return GroupsService.m258groupsSetUserNote$lambda354(pVar);
            case 17:
                return GroupsService.m218groupsDeleteLink$lambda34(pVar);
            case 18:
                return GroupsService.m259groupsTagAdd$lambda357(pVar);
            case 19:
                return GroupsService.m263groupsToggleMarket$lambda366(pVar);
            case 20:
                return GroupsService.m243groupsGetOnlineStatus$lambda199(pVar);
            case 21:
                return GroupsService.m246groupsGetTagList$lambda209(pVar);
            case 22:
                return GroupsService.m244groupsGetRequests$lambda201(pVar);
            case 23:
                return GroupsService.m238groupsGetInvites$lambda178(pVar);
            case 24:
                return GroupsService.m215groupsCreate$lambda23(pVar);
            case 25:
                return GroupsService.m255groupsSetCallbackSettings$lambda239(pVar);
            case 26:
                return GroupsService.m250groupsJoin$lambda218(pVar);
            case 27:
                return GroupsService.m222groupsEditCallbackServer$lambda98(pVar);
            case 28:
                return GroupsService.m228groupsGetBanned$lambda140(pVar);
        }
    }
}
