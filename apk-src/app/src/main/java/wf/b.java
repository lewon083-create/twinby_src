package wf;

import ad.b1;
import ad.h0;
import ad.j0;
import com.vk.sdk.api.ApiResponseParser;
import com.vk.sdk.api.groups.GroupsService;
import com.vk.sdk.api.leadForms.LeadFormsService;
import com.vk.sdk.api.widgets.WidgetsService;
import d2.h;
import m3.w;
import me.p;
import q4.k;
import q4.n;
import x5.c;
import x5.d;
import x5.t;
import y3.q;
import zc.e;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements ApiResponseParser, p.a, n, e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f35250b;

    public /* synthetic */ b(int i) {
        this.f35250b = i;
    }

    @Override // p.a
    public Object apply(Object obj) {
        switch (this.f35250b) {
            case 12:
                return null;
            default:
                q qVar = (q) obj;
                qVar.d();
                return j0.r(ad.q.u(qVar.J.f20936b, new hf.a(29)));
        }
    }

    @Override // q4.n
    public k[] createExtractors() {
        switch (this.f35250b) {
            case 15:
                return new k[]{new x5.a()};
            case 16:
                return new k[]{new c()};
            case 17:
                return new k[]{new d(0)};
            case 18:
                return new k[]{new x5.q()};
            case 19:
                w wVar = new w(0L);
                h0 h0Var = j0.f818c;
                return new k[]{new t(1, 1, n5.k.U1, wVar, new h(0, b1.f768f))};
            default:
                return new k[]{new y5.c()};
        }
    }

    @Override // com.vk.sdk.api.ApiResponseParser
    public Object parseResponse(p pVar) {
        switch (this.f35250b) {
            case 0:
                return GroupsService.m245groupsGetSettings$lambda207(pVar);
            case 1:
                return GroupsService.m239groupsGetInvitesExtended$lambda182(pVar);
            case 2:
                return GroupsService.m262groupsTagUpdate$lambda364(pVar);
            case 3:
                return GroupsService.m248groupsInvite$lambda212(pVar);
            case 4:
                return GroupsService.m260groupsTagBind$lambda360(pVar);
            case 5:
                return GroupsService.m252groupsRemoveUser$lambda224(pVar);
            case 6:
                return GroupsService.m214groupsBan$lambda16(pVar);
            case 7:
                return GroupsService.m251groupsLeave$lambda222(pVar);
            case 8:
                return GroupsService.m241groupsGetLongPollSettings$lambda188(pVar);
            case 9:
                return GroupsService.m226groupsGet$lambda113(pVar);
            case 10:
                return WidgetsService.m589widgetsGetComments$lambda0(pVar);
            case 11:
                return WidgetsService.m590widgetsGetPages$lambda10(pVar);
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            default:
                return LeadFormsService.m267leadFormsGet$lambda12(pVar);
            case 20:
                return LeadFormsService.m265leadFormsCreate$lambda0(pVar);
            case 21:
                return LeadFormsService.m270leadFormsList$lambda19(pVar);
            case 22:
                return LeadFormsService.m269leadFormsGetUploadURL$lambda18(pVar);
            case 23:
                return LeadFormsService.m271leadFormsUpdate$lambda21(pVar);
            case 24:
                return LeadFormsService.m266leadFormsDelete$lambda10(pVar);
            case 25:
                return LeadFormsService.m268leadFormsGetLeads$lambda14(pVar);
        }
    }
}
