package jf;

import com.vk.sdk.api.ApiResponseParser;
import com.vk.sdk.api.appWidgets.AppWidgetsService;
import com.vk.sdk.api.apps.AppsService;
import com.vk.sdk.api.prettyCards.PrettyCardsService;
import com.yandex.varioqub.config.Varioqub;
import fe.c;
import ii.b;
import java.util.ArrayList;
import java.util.Map;
import k5.l;
import k5.q;
import me.p;
import q4.k;
import q4.n;
import zc.e;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements ApiResponseParser, b, e, n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26621b;

    public /* synthetic */ a(int i) {
        this.f26621b = i;
    }

    @Override // zc.e
    public Object apply(Object obj) {
        switch (this.f26621b) {
            case 21:
                return Long.valueOf(((n5.a) obj).f29102b);
            case 22:
                return Long.valueOf(((n5.a) obj).f29103c);
            default:
                return (q) obj;
        }
    }

    @Override // q4.n
    public k[] createExtractors() {
        return new k[]{new l(n5.k.U1, 16)};
    }

    @Override // com.vk.sdk.api.ApiResponseParser
    public Object parseResponse(p pVar) {
        switch (this.f26621b) {
            case 0:
                return AppWidgetsService.m107appWidgetsUpdate$lambda20(pVar);
            case 1:
                return AppWidgetsService.m104appWidgetsGetImagesById$lambda14(pVar);
            case 2:
                return AppWidgetsService.m103appWidgetsGetGroupImages$lambda9(pVar);
            case 3:
                return AppWidgetsService.m105appWidgetsSaveAppImage$lambda16(pVar);
            case 4:
                return PrettyCardsService.m468prettyCardsGet$lambda15(pVar);
            case 5:
                return PrettyCardsService.m470prettyCardsGetUploadURL$lambda21(pVar);
            case 6:
                return PrettyCardsService.m466prettyCardsDelete$lambda5(pVar);
            case 7:
                return PrettyCardsService.m467prettyCardsEdit$lambda7(pVar);
            case 8:
                return PrettyCardsService.m465prettyCardsCreate$lambda0(pVar);
            case 9:
                return PrettyCardsService.m469prettyCardsGetById$lambda19(pVar);
            case 25:
                return AppsService.m112appsGetFriendsListExtended$lambda29(pVar);
            case 26:
                return AppsService.m115appsGetMiniAppPolicies$lambda42(pVar);
            case 27:
                return AppsService.m119appsPromoUseGift$lambda52(pVar);
            case 28:
                return AppsService.m111appsGetFriendsList$lambda22(pVar);
            default:
                return AppsService.m116appsGetScopes$lambda44(pVar);
        }
    }

    @Override // ii.b
    public void q(Object obj, h3.e eVar) {
        Long lValueOf;
        switch (this.f26621b) {
            case 10:
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                try {
                    Varioqub.putClientFeature((String) arrayList2.get(0), (String) arrayList2.get(1));
                    arrayList.add(0, null);
                } catch (Throwable th2) {
                    arrayList = a.a.t(th2);
                }
                eVar.i(arrayList);
                break;
            case 11:
                ArrayList arrayList3 = new ArrayList();
                try {
                    Varioqub.clearClientFeatures();
                    arrayList3.add(0, null);
                } catch (Throwable th3) {
                    arrayList3 = a.a.t(th3);
                }
                eVar.i(arrayList3);
                break;
            case 12:
                ArrayList arrayList4 = new ArrayList();
                try {
                    arrayList4.add(0, new ArrayList(Varioqub.getAllKeys()));
                } catch (Throwable th4) {
                    arrayList4 = a.a.t(th4);
                }
                eVar.i(arrayList4);
                break;
            case 13:
                ArrayList arrayList5 = new ArrayList();
                try {
                    Varioqub.setDefaults((Map) ((ArrayList) obj).get(0));
                    arrayList5.add(0, null);
                } catch (Throwable th5) {
                    arrayList5 = a.a.t(th5);
                }
                eVar.i(arrayList5);
                break;
            case 14:
                Varioqub.fetchConfig(new c(23, new jh.b(new ArrayList(), eVar, 0)));
                break;
            case 15:
                ArrayList arrayList6 = new ArrayList();
                try {
                    Varioqub.activateConfig(null);
                    arrayList6.add(0, null);
                } catch (Throwable th6) {
                    arrayList6 = a.a.t(th6);
                }
                eVar.i(arrayList6);
                break;
            case 16:
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = (ArrayList) obj;
                try {
                    arrayList7.add(0, Varioqub.getString((String) arrayList8.get(0), (String) arrayList8.get(1)));
                } catch (Throwable th7) {
                    arrayList7 = a.a.t(th7);
                }
                eVar.i(arrayList7);
                break;
            case 17:
                ArrayList arrayList9 = new ArrayList();
                ArrayList arrayList10 = (ArrayList) obj;
                try {
                    arrayList9.add(0, Boolean.valueOf(Varioqub.getBoolean((String) arrayList10.get(0), ((Boolean) arrayList10.get(1)).booleanValue())));
                } catch (Throwable th8) {
                    arrayList9 = a.a.t(th8);
                }
                eVar.i(arrayList9);
                break;
            case 18:
                ArrayList arrayList11 = new ArrayList();
                ArrayList arrayList12 = (ArrayList) obj;
                String str = (String) arrayList12.get(0);
                Number number = (Number) arrayList12.get(1);
                if (number == null) {
                    lValueOf = null;
                } else {
                    try {
                        lValueOf = Long.valueOf(number.longValue());
                    } catch (Throwable th9) {
                        arrayList11 = a.a.t(th9);
                    }
                }
                arrayList11.add(0, Long.valueOf(Varioqub.getLong(str, lValueOf.longValue())));
                eVar.i(arrayList11);
                break;
            case 19:
                ArrayList arrayList13 = new ArrayList();
                ArrayList arrayList14 = (ArrayList) obj;
                try {
                    arrayList13.add(0, Double.valueOf(Varioqub.getDouble((String) arrayList14.get(0), ((Double) arrayList14.get(1)).doubleValue())));
                } catch (Throwable th10) {
                    arrayList13 = a.a.t(th10);
                }
                eVar.i(arrayList13);
                break;
            default:
                ArrayList arrayList15 = new ArrayList();
                try {
                    arrayList15.add(0, Varioqub.getId());
                } catch (Throwable th11) {
                    arrayList15 = a.a.t(th11);
                }
                eVar.i(arrayList15);
                break;
        }
    }
}
