package bb;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.internal.auth.g2;
import com.vk.api.sdk.exceptions.VKApiCodes;
import l7.n;
import oa.p;
import q9.o;
import tb.q;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends rl.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2022a;

    public /* synthetic */ f(int i) {
        this.f2022a = i;
    }

    @Override // rl.b
    public na.c a(Context context, Looper looper, o oVar, Object obj, na.g gVar, na.h hVar) {
        switch (this.f2022a) {
            case 3:
                return new cb.e(context, looper, oVar, (ia.b) obj, (p) gVar, (p) hVar);
            case 4:
                return new ka.e(context, looper, oVar, (GoogleSignInOptions) obj, (p) gVar, (p) hVar);
            case 5:
                oVar.getClass();
                Integer num = (Integer) oVar.f31951f;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new qb.a(context, looper, oVar, bundle, gVar, hVar);
            case 6:
                throw y8.e.a(obj);
            case 7:
            default:
                return super.a(context, looper, oVar, obj, gVar, hVar);
            case 8:
                q qVar = (q) obj;
                if (qVar == null) {
                    qVar = new q(new n(11));
                }
                return new jb.a(context, looper, oVar, (p) gVar, (p) hVar, qVar.f33743b);
        }
    }

    @Override // rl.b
    public na.c b(Context context, Looper looper, o oVar, Object obj, p pVar, p pVar2) {
        switch (this.f2022a) {
            case 0:
                return new b(context, looper, VKApiCodes.CODE_PHOTO_ALBUM_LIMIT_EXCEED, oVar, pVar, pVar2, 0);
            case 1:
                return new g2(context, looper, 224, oVar, pVar, pVar2, 0);
            case 2:
                return new gb.h(context, looper, oVar, pVar, pVar2);
            case 7:
                return new ra.c(context, looper, oVar, (pa.p) obj, pVar, pVar2);
            default:
                return super.b(context, looper, oVar, obj, pVar, pVar2);
        }
    }
}
