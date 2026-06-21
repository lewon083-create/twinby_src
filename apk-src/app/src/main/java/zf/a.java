package zf;

import android.os.Bundle;
import com.vk.sdk.api.ApiResponseParser;
import com.vk.sdk.api.market.MarketService;
import com.yandex.div.json.TemplateParsingEnvironment;
import me.p;
import yads.am1;
import yads.ao0;
import yads.bj1;
import yads.d6;
import yads.du;
import yads.e6;
import yads.el2;
import yads.em1;
import yads.f0;
import yads.gc2;
import yads.gw0;
import yads.h63;
import yads.hm1;
import yads.hw2;
import yads.i0;
import yads.k73;
import yads.k93;
import yads.l00;
import yads.nq0;
import yads.oe2;
import yads.of1;
import yads.sq0;
import yads.wq;
import yads.xq;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements ApiResponseParser, TemplateParsingEnvironment.TemplateFactory, wq, of1, du, sq0, l00 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f46270b;

    public /* synthetic */ a(int i) {
        this.f46270b = i;
    }

    @Override // yads.sq0
    public nq0[] createExtractors() {
        switch (this.f46270b) {
            case 16:
                return bj1.a();
            case 19:
                return el2.a();
            case 21:
                return f0.a();
            case 23:
                return gw0.a();
            case 27:
                return i0.a();
            default:
                return k93.a();
        }
    }

    @Override // yads.wq
    public xq fromBundle(Bundle bundle) {
        switch (this.f46270b) {
            case 13:
                return am1.a(bundle);
            case 14:
            case 15:
            case 16:
            case 19:
            case 21:
            case 23:
            default:
                return k73.a(bundle);
            case 17:
                return d6.a(bundle);
            case 18:
                return e6.a(bundle);
            case 20:
                return em1.a(bundle);
            case 22:
                return gc2.b(bundle);
            case 24:
                return h63.b(bundle);
            case 25:
                return hm1.a(bundle);
        }
    }

    @Override // yads.of1
    public void invoke(Object obj) {
        ao0.b((oe2) obj);
    }

    @Override // yads.l00
    public void onInitializationCompleted() {
        hw2.a();
    }

    @Override // com.vk.sdk.api.ApiResponseParser
    public Object parseResponse(p pVar) {
        switch (this.f46270b) {
            case 0:
                return MarketService.m277marketAdd$lambda0(pVar);
            case 1:
                return MarketService.m299marketGetOrders$lambda114(pVar);
            case 2:
                return MarketService.m294marketGetComments$lambda93(pVar);
            case 3:
                return MarketService.m295marketGetExtended$lambda70(pVar);
            case 4:
                return MarketService.m293marketGetCategories$lambda89(pVar);
            case 5:
                return MarketService.m280marketCreateComment$lambda20(pVar);
            case 6:
                return MarketService.m302marketReorderAlbums$lambda128(pVar);
            case 7:
                return MarketService.m286marketEditComment$lambda46(pVar);
            case 8:
                return MarketService.m305marketReportComment$lambda140(pVar);
            case 9:
                return MarketService.m310marketSearchItems$lambda170(pVar);
            case 10:
                return MarketService.m303marketReorderItems$lambda132(pVar);
            default:
                return MarketService.m281marketDelete$lambda28(pVar);
        }
    }
}
