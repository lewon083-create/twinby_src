package kf;

import a0.o2;
import a0.z1;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.vk.sdk.api.ApiResponseParser;
import com.vk.sdk.api.apps.AppsService;
import com.vk.sdk.api.auth.AuthService;
import com.vk.sdk.api.search.SearchService;
import com.vk.sdk.api.secure.SecureService;
import com.vk.sdk.api.stats.StatsService;
import hl.d;
import i7.h;
import java.util.concurrent.ExecutorService;
import l5.c;
import m3.g;
import me.p;
import q4.k;
import q4.n;
import zc.e;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements ApiResponseParser, z1, e, n, g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27398b;

    public /* synthetic */ a(int i) {
        this.f27398b = i;
    }

    @Override // a0.z1
    public void a(o2 o2Var) {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(o2Var.f179b.getWidth(), o2Var.f179b.getHeight());
        surfaceTexture.detachFromGLContext();
        Surface surface = new Surface(surfaceTexture);
        o2Var.b(surface, d.j(), new h(1, surface, surfaceTexture));
    }

    @Override // m3.g
    public void accept(Object obj) {
        ((ExecutorService) obj).shutdown();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0312  */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v31, types: [android.text.Spannable, android.text.SpannableString] */
    @Override // zc.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object apply(java.lang.Object r36) {
        /*
            Method dump skipped, instruction units count: 876
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.a.apply(java.lang.Object):java.lang.Object");
    }

    @Override // q4.n
    public k[] createExtractors() {
        return new k[]{new c()};
    }

    @Override // com.vk.sdk.api.ApiResponseParser
    public Object parseResponse(p pVar) {
        switch (this.f27398b) {
            case 0:
                return AppsService.m109appsGet$lambda1(pVar);
            case 1:
                return AppsService.m110appsGetCatalog$lambda10(pVar);
            case 2:
                return AppsService.m117appsGetScore$lambda47(pVar);
            case 3:
                return AppsService.m108appsDeleteAppRequests$lambda0(pVar);
            case 4:
                return AppsService.m113appsGetLeaderboard$lambda36(pVar);
            case 5:
                return AppsService.m114appsGetLeaderboardExtended$lambda39(pVar);
            case 6:
                return AppsService.m118appsPromoHasActiveGift$lambda49(pVar);
            case 7:
                return AppsService.m120appsSendRequest$lambda55(pVar);
            case 8:
                return SearchService.m471searchGetHints$lambda0(pVar);
            case 9:
            case 10:
            case 11:
            case 22:
            case 23:
            default:
                return StatsService.m484statsTrackVisitor$lambda12(pVar);
            case 12:
                return SecureService.m480secureSendSMSNotification$lambda30(pVar);
            case 13:
                return SecureService.m475secureGetSMSHistory$lambda8(pVar);
            case 14:
                return SecureService.m477secureGetUserLevel$lambda22(pVar);
            case 15:
                return SecureService.m478secureGiveEventSticker$lambda24(pVar);
            case 16:
                return SecureService.m481secureSetCounter$lambda32(pVar);
            case 17:
                return SecureService.m476secureGetTransactionsHistory$lambda14(pVar);
            case 18:
                return Integer.valueOf(SecureService.m474secureGetAppBalance$lambda7(pVar));
            case 19:
                return SecureService.m472secureAddAppEvent$lambda0(pVar);
            case 20:
                return SecureService.m473secureCheckToken$lambda3(pVar);
            case 21:
                return SecureService.m479secureSendNotification$lambda26(pVar);
            case 24:
                return AuthService.m121authRestore$lambda0(pVar);
            case 25:
                return StatsService.m483statsGetPostReach$lambda10(pVar);
            case 26:
                return StatsService.m482statsGet$lambda0(pVar);
        }
    }
}
