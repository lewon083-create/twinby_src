package tf;

import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.rh0;
import com.vk.sdk.api.ApiResponseParser;
import com.vk.sdk.api.fave.FaveService;
import com.vk.sdk.api.friends.FriendsService;
import com.vk.sdk.api.utils.UtilsService;
import k6.t0;
import l4.p;
import m3.k;
import m3.z;
import o4.v;
import s3.a0;
import u3.j;
import u3.r;
import u3.w;
import u3.y;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements ApiResponseParser, k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33784b;

    public /* synthetic */ a(int i) {
        this.f33784b = i;
    }

    @Override // m3.k, yads.of1
    public void invoke(Object obj) {
        long jS;
        t0 t0Var;
        a0 a0Var;
        p pVar;
        switch (this.f33784b) {
            case 19:
                w wVar = (w) obj;
                y yVar = wVar.f34209b;
                if (wVar.equals(yVar.f34225j) && yVar.f34229n != null) {
                    rh0 rh0Var = yVar.f34231p;
                    int i = rh0Var.f9938c;
                    if (i != -1) {
                        long j10 = ((j) rh0Var.f9941f).f34133f / i;
                        r rVar = yVar.f34235t;
                        rVar.getClass();
                        jS = z.S(rVar.f34156a.getSampleRate(), j10);
                    } else {
                        jS = -9223372036854775807L;
                    }
                    long jElapsedRealtime = SystemClock.elapsedRealtime() - yVar.W;
                    t0 t0Var2 = yVar.f34229n;
                    int i10 = ((j) yVar.f34231p.f9941f).f34133f;
                    long jZ = z.Z(jS);
                    v vVar = ((u3.a0) t0Var2.f27180c).K0;
                    Handler handler = vVar.f29700a;
                    if (handler != null) {
                        handler.post(new u3.k(vVar, i10, jZ, jElapsedRealtime));
                        return;
                    }
                    return;
                }
                return;
            case 20:
                w wVar2 = (w) obj;
                wVar2.getClass();
                y.f34214c0.getAndDecrement();
                t0 t0Var3 = wVar2.f34209b.f34229n;
                if (t0Var3 != null) {
                    int i11 = wVar2.f34208a.f34128a;
                    u3.z zVar = new u3.z();
                    v vVar2 = ((u3.a0) t0Var3.f27180c).K0;
                    Handler handler2 = vVar2.f29700a;
                    if (handler2 != null) {
                        handler2.post(new u3.k(vVar2, zVar, 0));
                        return;
                    }
                    return;
                }
                return;
            case 21:
                w wVar3 = (w) obj;
                y yVar2 = wVar3.f34209b;
                if (wVar3.equals(yVar2.f34225j) && (t0Var = yVar2.f34229n) != null && yVar2.O && (a0Var = ((u3.a0) t0Var.f27180c).K) != null) {
                    a0Var.a();
                    return;
                }
                return;
            case 22:
                w wVar4 = (w) obj;
                y yVar3 = wVar4.f34209b;
                if (wVar4.equals(yVar3.f34225j)) {
                    yVar3.N = true;
                    return;
                }
                return;
            default:
                t0 t0Var4 = ((u3.v) obj).f34207a.f34229n;
                if (t0Var4 != null) {
                    u3.a0 a0Var2 = (u3.a0) t0Var4.f27180c;
                    synchronized (a0Var2.f32430b) {
                        pVar = a0Var2.f32446s;
                        break;
                    }
                    if (pVar != null) {
                        synchronized (pVar.f27902c) {
                            pVar.f27905f.getClass();
                            break;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // com.vk.sdk.api.ApiResponseParser
    public Object parseResponse(me.p pVar) {
        switch (this.f33784b) {
            case 0:
                return FaveService.m179faveRemoveArticle$lambda49(pVar);
            case 1:
                return FaveService.m180faveRemoveLink$lambda51(pVar);
            case 2:
                return FaveService.m175faveGetExtended$lambda31(pVar);
            case 3:
                return FaveService.m168faveAddPage$lambda4(pVar);
            case 4:
                return FaveService.m176faveGetPages$lambda39(pVar);
            case 5:
                return FaveService.m184faveRemoveTag$lambda63(pVar);
            case 6:
                return FaveService.m172faveAddVideo$lambda18(pVar);
            case 7:
                return FaveService.m178faveMarkSeen$lambda48(pVar);
            case 8:
                return FaveService.m170faveAddProduct$lambda11(pVar);
            case 9:
                return FaveService.m187faveSetPageTags$lambda69(pVar);
            case 10:
                return FaveService.m174faveGet$lambda23(pVar);
            case 11:
                return UtilsService.m530utilsGetShortLink$lambda21(pVar);
            case 12:
                return Integer.valueOf(UtilsService.m529utilsGetServerTime$lambda20(pVar));
            case 13:
                return UtilsService.m524utilsCheckLink$lambda0(pVar);
            case 14:
                return UtilsService.m531utilsResolveScreenName$lambda24(pVar);
            case 15:
                return UtilsService.m528utilsGetLinkStatsExtended$lambda14(pVar);
            case 16:
                return UtilsService.m527utilsGetLinkStats$lambda8(pVar);
            case 17:
                return UtilsService.m526utilsGetLastShortenedLinks$lambda4(pVar);
            case 18:
                return UtilsService.m525utilsDeleteFromLastShortened$lambda2(pVar);
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            default:
                return FriendsService.m199friendsGet$lambda29(pVar);
            case 24:
                return FriendsService.m198friendsEditList$lambda23(pVar);
            case 25:
                return FriendsService.m190friendsAdd$lambda0(pVar);
            case 26:
                return FriendsService.m196friendsDeleteList$lambda18(pVar);
            case 27:
                return FriendsService.m194friendsDelete$lambda14(pVar);
            case 28:
                return FriendsService.m192friendsAreFriends$lambda8(pVar);
        }
    }
}
