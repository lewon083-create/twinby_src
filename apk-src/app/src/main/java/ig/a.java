package ig;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.UiModeManager;
import android.database.sqlite.SQLiteDatabase;
import android.telephony.SubscriptionManager;
import com.vk.sdk.api.ApiResponseParser;
import com.vk.sdk.api.appWidgets.AppWidgetsService;
import com.vk.sdk.api.polls.PollsService;
import e5.h;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.impl.C0167fn;
import io.appmetrica.analytics.impl.C0172g2;
import io.appmetrica.analytics.impl.C0368nl;
import io.appmetrica.analytics.impl.C0466rk;
import io.appmetrica.analytics.impl.C0548v2;
import io.appmetrica.analytics.impl.G0;
import io.appmetrica.analytics.impl.Id;
import io.appmetrica.analytics.impl.InterfaceC0244in;
import io.appmetrica.analytics.impl.InterfaceC0253j6;
import io.appmetrica.analytics.impl.O7;
import io.appmetrica.analytics.impl.Rd;
import io.appmetrica.analytics.impl.Zk;
import io.appmetrica.analytics.impl.vo;
import io.appmetrica.analytics.impl.wo;
import io.appmetrica.analytics.impl.yo;
import io.sentry.Hint;
import io.sentry.IScope;
import io.sentry.ScopeCallback;
import io.sentry.SentryEvent;
import io.sentry.SentryOptions;
import io.sentry.android.replay.capture.SessionCaptureStrategy;
import io.sentry.flutter.SentryFlutterPlugin;
import io.sentry.util.HintUtils;
import io.sentry.util.TracingUtils;
import j3.p;
import org.json.JSONObject;
import zc.e;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements ApiResponseParser, Rd, FunctionWithThrowable, InterfaceC0253j6, InterfaceC0244in, yo, ScopeCallback, SentryOptions.BeforeSendCallback, HintUtils.SentryHintFallback, HintUtils.SentryConsumer, e, h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21301b;

    public /* synthetic */ a(int i) {
        this.f21301b = i;
    }

    @Override // io.appmetrica.analytics.impl.Rd
    public Zk a(G0 g02) {
        switch (this.f21301b) {
            case 9:
                return Id.b(g02);
            default:
                return Id.a(g02);
        }
    }

    @Override // io.sentry.util.HintUtils.SentryConsumer
    public void accept(Object obj) {
        HintUtils.lambda$runIfDoesNotHaveType$0(obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    /* JADX INFO: renamed from: apply */
    public Object mo625apply(Object obj) {
        switch (this.f21301b) {
            case 11:
                return O7.a((UiModeManager) obj);
            case 12:
                return C0167fn.b((Activity) obj);
            case 13:
            case 15:
            default:
                p pVar = (p) obj;
                return pVar.f26349a + ": " + pVar.f26350b;
            case 14:
                return C0368nl.a((SubscriptionManager) obj);
            case 16:
                return C0548v2.a((ActivityManager) obj);
        }
    }

    @Override // io.sentry.SentryOptions.BeforeSendCallback
    public SentryEvent execute(SentryEvent sentryEvent, Hint hint) {
        return SentryFlutterPlugin.Companion.setupBeforeSend$lambda$0(sentryEvent, hint);
    }

    @Override // com.vk.sdk.api.ApiResponseParser
    public Object parseResponse(me.p pVar) {
        switch (this.f21301b) {
            case 0:
                return PollsService.m462pollsGetPhotoUploadServer$lambda38(pVar);
            case 1:
                return PollsService.m464pollsSavePhoto$lambda51(pVar);
            case 2:
                return PollsService.m457pollsCreate$lambda4(pVar);
            case 3:
                return PollsService.m461pollsGetById$lambda31(pVar);
            case 4:
                return PollsService.m458pollsDeleteVote$lambda16(pVar);
            case 5:
                return PollsService.m456pollsAddVote$lambda0(pVar);
            case 6:
                return PollsService.m459pollsEdit$lambda20(pVar);
            case 7:
                return PollsService.m460pollsGetBackgrounds$lambda30(pVar);
            case 8:
                return PollsService.m463pollsGetVoters$lambda41(pVar);
            case 26:
                return AppWidgetsService.m106appWidgetsSaveGroupImage$lambda18(pVar);
            case 27:
                return AppWidgetsService.m102appWidgetsGetGroupImageUploadServer$lambda7(pVar);
            case 28:
                return AppWidgetsService.m101appWidgetsGetAppImages$lambda2(pVar);
            default:
                return AppWidgetsService.m100appWidgetsGetAppImageUploadServer$lambda0(pVar);
        }
    }

    @Override // io.sentry.ScopeCallback
    public void run(IScope iScope) {
        switch (this.f21301b) {
            case 19:
                SessionCaptureStrategy.stop$lambda$1(iScope);
                break;
            default:
                TracingUtils.lambda$startNewTrace$1(iScope);
                break;
        }
    }

    @Override // io.appmetrica.analytics.impl.yo
    public JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        switch (this.f21301b) {
            case 17:
                return vo.a(jSONObject, jSONObject2);
            default:
                return wo.a(jSONObject, jSONObject2);
        }
    }

    @Override // io.sentry.util.HintUtils.SentryHintFallback
    public void accept(Object obj, Class cls) {
        HintUtils.lambda$runIfHasType$2(obj, cls);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0244in
    public boolean a(SQLiteDatabase sQLiteDatabase) {
        return C0466rk.a(sQLiteDatabase);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0253j6
    public boolean a(Throwable th2) {
        return C0172g2.a(th2);
    }

    @Override // e5.h
    public boolean a(int i, int i10, int i11, int i12, int i13) {
        if (i10 == 67 && i11 == 79 && i12 == 77 && (i13 == 77 || i == 2)) {
            return true;
        }
        if (i10 == 77 && i11 == 76 && i12 == 76) {
            return i13 == 84 || i == 2;
        }
        return false;
    }
}
