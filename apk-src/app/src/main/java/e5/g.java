package e5;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import com.vk.sdk.api.ApiResponseParser;
import com.vk.sdk.api.account.AccountService;
import com.vk.sdk.api.orders.OrdersService;
import com.yandex.div.storage.database.DatabaseOpenHelperProvider;
import java.util.ArrayList;
import java.util.Set;
import md.q;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements h, ApiResponseParser, DatabaseOpenHelperProvider, f9.h, md.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16249b;

    public /* synthetic */ g(int i) {
        this.f16249b = i;
    }

    @Override // e5.h
    public boolean a(int i, int i10, int i11, int i12, int i13) {
        return false;
    }

    @Override // f9.h
    public Object apply(Object obj) {
        Cursor cursorRawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
        try {
            Cursor cursor = cursorRawQuery;
            ArrayList arrayList = new ArrayList();
            while (cursor.moveToNext()) {
                x7.b bVarA = y8.j.a();
                bVarA.d(cursor.getString(1));
                bVarA.f35979d = i9.a.b(cursor.getInt(2));
                String string = cursor.getString(3);
                bVarA.f35978c = string == null ? null : Base64.decode(string, 0);
                arrayList.add(bVarA.a());
            }
            return arrayList;
        } finally {
            cursorRawQuery.close();
        }
    }

    @Override // md.e
    public Object l(q9.o oVar) {
        Set setE = oVar.e(q.a(fe.a.class));
        fe.c cVar = fe.c.f16783d;
        if (cVar == null) {
            synchronized (fe.c.class) {
                try {
                    cVar = fe.c.f16783d;
                    if (cVar == null) {
                        cVar = new fe.c();
                        fe.c.f16783d = cVar;
                    }
                } finally {
                }
            }
        }
        return new fe.b(setE, cVar);
    }

    @Override // com.vk.sdk.api.ApiResponseParser
    public Object parseResponse(me.p pVar) {
        switch (this.f16249b) {
            case 1:
                return OrdersService.m388ordersCancelSubscription$lambda0(pVar);
            case 2:
                return OrdersService.m391ordersGetAmount$lambda12(pVar);
            case 3:
                return OrdersService.m393ordersGetUserSubscriptionById$lambda19(pVar);
            case 4:
                return OrdersService.m390ordersGet$lambda7(pVar);
            case 5:
                return OrdersService.m395ordersUpdateSubscription$lambda23(pVar);
            case 6:
                return OrdersService.m389ordersChangeState$lambda3(pVar);
            case 7:
                return OrdersService.m394ordersGetUserSubscriptions$lambda21(pVar);
            case 8:
                return OrdersService.m392ordersGetById$lambda14(pVar);
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            default:
                return AccountService.m50accountSetSilenceMode$lambda67(pVar);
            case 16:
                return AccountService.m47accountSetOffline$lambda58(pVar);
            case 17:
                return AccountService.m43accountGetPushSettings$lambda28(pVar);
            case 18:
                return AccountService.m39accountGetBanned$lambda14(pVar);
            case 19:
                return AccountService.m36accountChangePassword$lambda3(pVar);
            case 20:
                return AccountService.m52accountUnregisterDevice$lambda76(pVar);
            case 21:
                return AccountService.m46accountSetInfo$lambda54(pVar);
            case 22:
                return AccountService.m37accountGetActiveOffers$lambda8(pVar);
            case 23:
                return AccountService.m40accountGetCounters$lambda18(pVar);
            case 24:
                return AccountService.m35accountBan$lambda0(pVar);
            case 25:
                return AccountService.m38accountGetAppPermissions$lambda12(pVar);
            case 26:
                return AccountService.m45accountSaveProfileInfo$lambda38(pVar);
            case 27:
                return AccountService.m49accountSetPushSettings$lambda62(pVar);
            case 28:
                return AccountService.m42accountGetProfileInfo$lambda27(pVar);
        }
    }
}
