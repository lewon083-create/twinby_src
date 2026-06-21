package g8;

import com.google.android.gms.internal.ads.om1;
import com.vk.api.sdk.VKApiCallback;
import com.vk.sdk.api.base.dto.BaseBoolInt;
import com.vk.sdk.api.users.dto.UsersUserFull;
import io.sentry.protocol.Device;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.j0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements yc.b, VKApiCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public hi.g f20008b;

    @Override // yc.b
    public void a(yc.e eVar) {
        this.f20008b.b(Integer.toString(eVar.f45612a), eVar.f45613b, null);
    }

    @Override // com.vk.api.sdk.VKApiCallback
    public void fail(Exception error) {
        Intrinsics.checkNotNullParameter(error, "error");
        String message = om1.k("Get profile error: ", error.getMessage());
        String strValueOf = String.valueOf(error.getMessage());
        yl.d error2 = new yl.d(0, strValueOf);
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(error2, "error");
        Intrinsics.checkNotNullParameter(error2, "error");
        HashMap mapF = j0.f(new Pair("apiCode", 0), new Pair("message", strValueOf));
        Intrinsics.checkNotNullParameter("API_ERROR", "code");
        this.f20008b.b("API_ERROR", message, mapF);
    }

    @Override // com.vk.api.sdk.VKApiCallback
    public void success(Object obj) {
        List list = (List) obj;
        hi.g gVar = this.f20008b;
        if (list != null && !list.isEmpty()) {
            if (list.get(0) != null) {
                Object obj2 = list.get(0);
                Intrinsics.b(obj2);
                UsersUserFull user = (UsersUserFull) obj2;
                Intrinsics.checkNotNullParameter(user, "user");
                Pair pair = new Pair("userId", Long.valueOf(user.getId().getValue()));
                Pair pair2 = new Pair("firstName", user.getFirstName());
                Pair pair3 = new Pair("lastName", user.getLastName());
                BaseBoolInt online = user.getOnline();
                BaseBoolInt baseBoolInt = BaseBoolInt.YES;
                gVar.success(j0.f(pair, pair2, pair3, new Pair(Device.JsonKeys.ONLINE, Boolean.valueOf(online == baseBoolInt)), new Pair("onlineMobile", Boolean.valueOf(user.getOnlineMobile() == baseBoolInt)), new Pair("photo50", user.getPhoto50()), new Pair("photo100", user.getPhoto100()), new Pair("photo200", user.getPhoto200())));
                return;
            }
        }
        Intrinsics.checkNotNullParameter("Get profile error: the result is null", "message");
        Intrinsics.checkNotNullParameter("INVALID_RESULT", "code");
        gVar.b("INVALID_RESULT", "Get profile error: the result is null", null);
    }
}
