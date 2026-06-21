package ag;

import com.vk.sdk.api.ApiResponseParser;
import com.vk.sdk.api.messages.MessagesService;
import com.vk.sdk.api.newsfeed.NewsfeedService;
import com.yandex.div.histogram.HistogramFilter;
import me.p;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements ApiResponseParser, HistogramFilter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f928b;

    public /* synthetic */ a(int i) {
        this.f928b = i;
    }

    @Override // com.vk.sdk.api.ApiResponseParser
    public Object parseResponse(p pVar) {
        switch (this.f928b) {
            case 0:
                return MessagesService.m350messagesSearchConversationsExtended$lambda245(pVar);
            case 1:
                return MessagesService.m325messagesGetConversationMembers$lambda76(pVar);
            case 2:
                return MessagesService.m334messagesGetIntentUsers$lambda151(pVar);
            case 3:
                return MessagesService.m351messagesSearchExtended$lambda228(pVar);
            case 4:
                return MessagesService.m349messagesSearchConversations$lambda238(pVar);
            case 5:
                return MessagesService.m328messagesGetConversationsByIdExtended$lambda95(pVar);
            case 6:
                return MessagesService.m321messagesGetByConversationMessageIdExtended$lambda53(pVar);
            case 7:
                return MessagesService.m323messagesGetByIdExtended$lambda64(pVar);
            case 8:
                return MessagesService.m324messagesGetChatPreview$lambda70(pVar);
            case 9:
                return MessagesService.m322messagesGetById$lambda58(pVar);
            case 10:
                return MessagesService.m317messagesDenyMessagesFromGroup$lambda28(pVar);
            case 11:
                return MessagesService.m344messagesMarkAsRead$lambda200(pVar);
            case 12:
                return MessagesService.m320messagesGetByConversationMessageId$lambda48(pVar);
            case 13:
                return MessagesService.m327messagesGetConversationsById$lambda90(pVar);
            case 14:
                return MessagesService.m342messagesMarkAsImportant$lambda192(pVar);
            case 15:
                return MessagesService.m329messagesGetHistory$lambda100(pVar);
            case 16:
                return MessagesService.m353messagesSendMessageEventAnswer$lambda278(pVar);
            case 17:
            case 18:
            default:
                return NewsfeedService.m361newsfeedGetBanned$lambda24(pVar);
            case 19:
                return NewsfeedService.m365newsfeedGetListsExtended$lambda49(pVar);
            case 20:
                return NewsfeedService.m366newsfeedGetMentions$lambda52(pVar);
            case 21:
                return NewsfeedService.m367newsfeedGetRecommended$lambda59(pVar);
            case 22:
                return NewsfeedService.m373newsfeedUnignoreItem$lambda106(pVar);
            case 23:
                return NewsfeedService.m358newsfeedDeleteBan$lambda4(pVar);
            case 24:
                return NewsfeedService.m369newsfeedIgnoreItem$lambda75(pVar);
            case 25:
                return NewsfeedService.m370newsfeedSaveList$lambda79(pVar);
            case 26:
                return NewsfeedService.m357newsfeedAddBan$lambda0(pVar);
            case 27:
                return NewsfeedService.m362newsfeedGetBannedExtended$lambda29(pVar);
            case 28:
                return NewsfeedService.m368newsfeedGetSuggestedSources$lambda68(pVar);
        }
    }
}
