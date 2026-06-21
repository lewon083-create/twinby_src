package bg;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.t;
import com.vk.sdk.api.ApiResponseParser;
import com.vk.sdk.api.newsfeed.NewsfeedService;
import com.vk.sdk.api.notes.NotesService;
import com.vk.sdk.api.notifications.NotificationsService;
import com.yandex.div.internal.AssertionErrorHandler;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonParsers;
import com.yandex.div.internal.parser.JsonTopologicalSorting;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.ValueValidator;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import me.p;
import q9.o;
import v8.e;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements ApiResponseParser, AssertionErrorHandler, ValueValidator, ListValidator, sb.a, e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2150b;

    public /* synthetic */ a(int i) {
        this.f2150b = i;
    }

    @Override // v8.e
    public Object apply(Object obj) {
        ee.e eVar = (ee.e) obj;
        bb.e eVar2 = t.f14871a;
        eVar2.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            eVar2.n(byteArrayOutputStream, eVar);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // sb.a
    public Object g(Task task) throws IOException {
        int i;
        switch (this.f2150b) {
            case 23:
                i = 403;
                break;
            case 24:
                i = -1;
                break;
            default:
                Bundle bundle = (Bundle) task.g(IOException.class);
                if (bundle == null) {
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
                String string = bundle.getString("registration_id");
                if (string != null || (string = bundle.getString("unregistered")) != null) {
                    return string;
                }
                String string2 = bundle.getString("error");
                if ("RST".equals(string2)) {
                    throw new IOException("INSTANCE_ID_RESET");
                }
                if (string2 != null) {
                    throw new IOException(string2);
                }
                Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        return Integer.valueOf(i);
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        switch (this.f2150b) {
            case 18:
                return JsonFieldParser.lambda$static$0((String) obj);
            case 19:
                return JsonParsers.lambda$static$0(obj);
            case 20:
                return JsonParsers.lambda$static$1((String) obj);
            default:
                return JsonTopologicalSorting.TYPE_VALIDATOR$lambda$0((String) obj);
        }
    }

    @Override // com.vk.sdk.api.ApiResponseParser
    public Object parseResponse(p pVar) {
        switch (this.f2150b) {
            case 0:
                return NewsfeedService.m360newsfeedGet$lambda10(pVar);
            case 1:
                return NewsfeedService.m371newsfeedSearch$lambda84(pVar);
            case 2:
                return NewsfeedService.m359newsfeedDeleteList$lambda8(pVar);
            case 3:
                return NewsfeedService.m372newsfeedSearchExtended$lambda95(pVar);
            case 4:
                return NewsfeedService.m363newsfeedGetComments$lambda34(pVar);
            case 5:
                return NewsfeedService.m374newsfeedUnsubscribe$lambda109(pVar);
            case 6:
                return NewsfeedService.m364newsfeedGetLists$lambda46(pVar);
            case 7:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            default:
                return NotificationsService.m387notificationsSendMessage$lambda9(pVar);
            case 8:
                return NotesService.m383notesGetComments$lambda32(pVar);
            case 9:
                return NotesService.m382notesGetById$lambda28(pVar);
            case 10:
                return NotesService.m375notesAdd$lambda0(pVar);
            case 11:
                return NotesService.m384notesRestoreComment$lambda38(pVar);
            case 12:
                return NotesService.m380notesEditComment$lambda18(pVar);
            case 13:
                return NotesService.m378notesDeleteComment$lambda11(pVar);
            case 14:
                return NotesService.m379notesEdit$lambda14(pVar);
            case 15:
                return NotesService.m377notesDelete$lambda9(pVar);
            case 16:
                return NotesService.m376notesCreateComment$lambda4(pVar);
            case 17:
                return NotesService.m381notesGet$lambda21(pVar);
            case 27:
                return NotificationsService.m385notificationsGet$lambda0(pVar);
            case 28:
                return NotificationsService.m386notificationsMarkAsViewed$lambda8(pVar);
        }
    }

    public /* synthetic */ a(o oVar) {
        this.f2150b = 25;
    }

    @Override // com.yandex.div.internal.parser.ListValidator
    public boolean isValid(List list) {
        return JsonParsers.lambda$static$2(list);
    }
}
