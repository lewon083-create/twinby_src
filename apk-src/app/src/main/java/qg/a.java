package qg;

import com.google.android.gms.internal.ads.oc;
import com.vk.sdk.api.ApiResponseParser;
import com.vk.sdk.api.downloadedGames.DownloadedGamesService;
import com.vk.sdk.api.execute.ExecuteService;
import com.vk.sdk.api.stories.StoriesService;
import com.vk.sdk.api.streaming.StreamingService;
import com.vk.sdk.api.users.UsersService;
import j3.h0;
import j3.m;
import m3.k;
import m3.l;
import me.p;
import q4.n;
import s3.i;
import s3.y;
import t.q0;
import t.s0;
import zc.e;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements ApiResponseParser, n, e, k, l, p.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32109b;

    public /* synthetic */ a(int i) {
        this.f32109b = i;
    }

    @Override // zc.e
    public Object apply(Object obj) {
        switch (this.f32109b) {
            case 9:
                break;
            case 20:
                break;
            case 21:
                break;
            case 23:
                break;
            case 25:
                int i = q0.f33233g;
                break;
            default:
                int i10 = s0.f33277h;
                break;
        }
        return Boolean.FALSE;
    }

    @Override // m3.l
    public void b(Object obj, m mVar) {
        ((h0) obj).l();
    }

    @Override // q4.n
    public q4.k[] createExtractors() {
        return new q4.k[]{new r4.a()};
    }

    @Override // m3.k, yads.of1
    public void invoke(Object obj) {
        switch (this.f32109b) {
            case 10:
                ((h0) obj).onPlayerError(new i(2, new oc("Player release timed out."), 1003));
                break;
            case 11:
            default:
                ((t3.i) obj).getClass();
                break;
            case 12:
                ((h0) obj).getClass();
                break;
        }
    }

    @Override // com.vk.sdk.api.ApiResponseParser
    public Object parseResponse(p pVar) {
        switch (this.f32109b) {
            case 0:
                return StoriesService.m501storiesGetPhotoUploadServer$lambda24(pVar);
            case 1:
                return StoriesService.m499storiesGetBannedExtended$lambda16(pVar);
            case 2:
            case 9:
            case 10:
            case 11:
            case 12:
            default:
                return UsersService.m522usersReport$lambda28(pVar);
            case 3:
                return DownloadedGamesService.m164downloadedGamesGetPaidStatus$lambda0(pVar);
            case 4:
                return StreamingService.m513streamingGetServerUrl$lambda0(pVar);
            case 5:
                return StreamingService.m515streamingGetStats$lambda2(pVar);
            case 6:
                return StreamingService.m514streamingGetSettings$lambda1(pVar);
            case 7:
                return StreamingService.m516streamingGetStem$lambda8(pVar);
            case 8:
                return StreamingService.m517streamingSetSettings$lambda10(pVar);
            case 13:
                return ExecuteService.m165execute$lambda0(pVar);
            case 14:
                return UsersService.m521usersGetSubscriptionsExtended$lambda21(pVar);
            case 15:
                return UsersService.m523usersSearch$lambda31(pVar);
            case 16:
                return UsersService.m520usersGetSubscriptions$lambda14(pVar);
            case 17:
                return UsersService.m518usersGet$lambda0(pVar);
            case 18:
                return UsersService.m519usersGetFollowers$lambda6(pVar);
        }
    }

    public /* synthetic */ a(y yVar) {
        this.f32109b = 11;
    }
}
