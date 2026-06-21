package ti;

import com.vk.api.sdk.auth.VKAccessToken;
import com.vk.api.sdk.auth.VKAuthCallback;
import com.vk.api.sdk.exceptions.VKAuthException;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class t0 implements yc.c, VKAuthCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public hi.g f33898b;

    public /* synthetic */ t0(hi.g gVar) {
        this.f33898b = gVar;
    }

    @Override // yc.c
    public void b() {
        this.f33898b.success(null);
    }

    @Override // com.vk.api.sdk.auth.VKAuthCallback
    public void onLogin(VKAccessToken accessToken) {
        Intrinsics.checkNotNullParameter(accessToken, "token");
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        HashMap mapF = kotlin.collections.j0.f(new Pair("accessToken", a.a.b(accessToken)));
        hi.g gVar = this.f33898b;
        if (gVar != null) {
            gVar.success(mapF);
        }
        this.f33898b = null;
    }

    @Override // com.vk.api.sdk.auth.VKAuthCallback
    public void onLoginFailed(VKAuthException authException) {
        Intrinsics.checkNotNullParameter(authException, "authException");
        if (authException.isCanceled()) {
            HashMap mapF = kotlin.collections.j0.f(new Pair("isCanceled", Boolean.TRUE));
            hi.g gVar = this.f33898b;
            if (gVar != null) {
                gVar.success(mapF);
            }
            this.f33898b = null;
            return;
        }
        int webViewError = authException.getWebViewError();
        String message = l7.o.i(webViewError, "Login failed: ");
        String authError = authException.getAuthError();
        yl.d error = new yl.d(webViewError, authError);
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(error, "error");
        HashMap mapF2 = kotlin.collections.j0.f(new Pair("apiCode", Integer.valueOf(webViewError)), new Pair("message", authError));
        Intrinsics.checkNotNullParameter("API_ERROR", "code");
        hi.g gVar2 = this.f33898b;
        if (gVar2 != null) {
            gVar2.b("API_ERROR", message, mapF2);
        }
        this.f33898b = null;
    }
}
