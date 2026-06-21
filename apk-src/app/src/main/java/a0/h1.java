package a0;

import com.vk.sdk.api.ApiResponseParser;
import com.vk.sdk.api.messages.MessagesService;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h1 implements p.a, ApiResponseParser {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f104b;

    public /* synthetic */ h1(int i) {
        this.f104b = i;
    }

    @Override // p.a
    public Object apply(Object obj) {
        j1 j1Var = k1.B;
        return null;
    }

    @Override // com.vk.sdk.api.ApiResponseParser
    public Object parseResponse(me.p pVar) {
        switch (this.f104b) {
            case 1:
                return MessagesService.m319messagesEditChat$lambda45(pVar);
            case 2:
                return MessagesService.m332messagesGetImportantMessages$lambda133(pVar);
            case 3:
                return MessagesService.m318messagesEdit$lambda30(pVar);
            case 4:
                return MessagesService.m341messagesMarkAsAnsweredConversation$lambda188(pVar);
            case 5:
                return MessagesService.m313messagesCreateChat$lambda7(pVar);
            case 6:
                return MessagesService.m333messagesGetImportantMessagesExtended$lambda142(pVar);
            case 7:
                return MessagesService.m356messagesUnpin$lambda289(pVar);
            case 8:
                return MessagesService.m346messagesRemoveChatUser$lambda211(pVar);
            case 9:
                return MessagesService.m311messagesAddChatUser$lambda0(pVar);
            case 10:
                return MessagesService.m343messagesMarkAsImportantConversation$lambda196(pVar);
            case 11:
                return MessagesService.m345messagesPin$lambda207(pVar);
            case 12:
                return MessagesService.m347messagesRestore$lambda215(pVar);
            case 13:
                return MessagesService.m315messagesDeleteChatPhoto$lambda20(pVar);
            case 14:
                return MessagesService.m339messagesIsMessagesFromGroupAllowed$lambda184(pVar);
            case 15:
                return MessagesService.m314messagesDelete$lambda12(pVar);
            case 16:
                return MessagesService.m355messagesSetChatPhoto$lambda287(pVar);
            case 17:
                return MessagesService.m316messagesDeleteConversation$lambda23(pVar);
            case 18:
                return MessagesService.m336messagesGetLastActivity$lambda162(pVar);
            case 19:
                return MessagesService.m331messagesGetHistoryExtended$lambda111(pVar);
            case 20:
                return MessagesService.m335messagesGetInviteLink$lambda158(pVar);
            case 21:
                return MessagesService.m354messagesSetActivity$lambda281(pVar);
            case 22:
                return MessagesService.m348messagesSearch$lambda218(pVar);
            case 23:
                return MessagesService.m312messagesAllowMessagesFromGroup$lambda4(pVar);
            case 24:
                return MessagesService.m340messagesJoinChatByInviteLink$lambda186(pVar);
            case 25:
                return MessagesService.m352messagesSend$lambda252(pVar);
            case 26:
                return MessagesService.m330messagesGetHistoryAttachments$lambda122(pVar);
            case 27:
                return MessagesService.m326messagesGetConversations$lambda81(pVar);
            case 28:
                return MessagesService.m338messagesGetLongPollServer$lambda179(pVar);
            default:
                return MessagesService.m337messagesGetLongPollHistory$lambda164(pVar);
        }
    }
}
