package a1;

import a0.i0;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.webkit.ClientCertRequest;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import androidx.camera.video.internal.compat.quirk.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import com.appsflyer.internal.AFa1ySDK;
import com.appsflyer.internal.AFd1wSDK;
import com.appsflyer.internal.AFi1aSDK;
import com.appsflyer.internal.AFj1sSDK;
import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.measurement.m1;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.yandex.varioqub.config.impl.B;
import e1.a0;
import e1.b0;
import e1.c0;
import e1.x;
import e4.h0;
import fh.bz;
import fj.z0;
import g0.s1;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.impl.C0041b0;
import io.appmetrica.analytics.impl.C0522u1;
import io.appmetrica.analytics.impl.L0;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.sentry.IScope;
import io.sentry.ReplayRecording;
import io.sentry.SentryOptions;
import io.sentry.SpanContext;
import io.sentry.android.ndk.NdkScopeObserver;
import io.sentry.android.replay.ReplayCache;
import io.sentry.android.replay.screenshot.PixelCopyStrategy;
import io.sentry.android.replay.util.ExecutorsKt;
import io.sentry.android.replay.util.PersistableLinkedList;
import io.sentry.android.replay.viewhierarchy.ViewHierarchyNode;
import io.sentry.cache.PersistingScopeObserver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import t.z;
import x0.v;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f319e;

    public /* synthetic */ c(d9.a aVar, y8.j jVar, wf.b bVar, y8.i iVar) {
        this.f316b = 6;
        this.f317c = aVar;
        this.f318d = jVar;
        this.f319e = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d0 d0VarJ;
        JSONObject jSONObjectOptJSONObject;
        int i = 6;
        Object obj = null;
        int i10 = 1;
        switch (this.f316b) {
            case 0:
                g gVar = (g) this.f317c;
                Executor executor = (Executor) this.f318d;
                v vVar = (v) this.f319e;
                int iM = z.m(gVar.f332g);
                if (iM == 0) {
                    gVar.f334j = executor;
                    gVar.f335k = vVar;
                    return;
                } else {
                    if (iM == 1 || iM == 2) {
                        throw new AssertionError("The audio recording callback must be registered before the audio source is started.");
                    }
                    return;
                }
            case 1:
                s sVar = (s) this.f317c;
                f fVar = (f) this.f318d;
                j0.i iVar = (j0.i) this.f319e;
                l lVar = sVar.f390g;
                f2.g.h("AudioStream can not be started when setCallback.", !lVar.f353d.get());
                lVar.a();
                lVar.f357h = fVar;
                lVar.i = iVar;
                if (Build.VERSION.SDK_INT >= 29) {
                    k kVar = lVar.f359k;
                    if (kVar != null) {
                        b1.a.e(lVar.f350a, kVar);
                    }
                    if (lVar.f359k == null) {
                        lVar.f359k = new k(lVar);
                    }
                    b1.a.d(lVar.f350a, iVar, lVar.f359k);
                    return;
                }
                return;
            case 2:
                ((AFa1ySDK) this.f317c).e_((Context) this.f318d, (Intent) this.f319e);
                return;
            case 3:
                AFd1wSDK.getCurrencyIso4217Code((AFd1wSDK) this.f317c, (Throwable) this.f318d, (String) this.f319e);
                return;
            case 4:
                ((AFj1sSDK) this.f317c).getCurrencyIso4217Code((AFi1aSDK) this.f318d, (Runnable) this.f319e);
                return;
            case 5:
                com.google.firebase.messaging.f fVar2 = (com.google.firebase.messaging.f) this.f317c;
                Intent intent = (Intent) this.f318d;
                sb.g gVar2 = (sb.g) this.f319e;
                fVar2.getClass();
                try {
                    fVar2.handleIntent(intent);
                    return;
                } finally {
                    gVar2.b(null);
                }
            case 6:
                d9.a aVar = (d9.a) this.f317c;
                y8.j jVar = (y8.j) this.f318d;
                String str = jVar.f36552a;
                y8.i iVar2 = (y8.i) this.f319e;
                aVar.getClass();
                Logger logger = d9.a.f15718f;
                try {
                    z8.e eVarA = aVar.f15721c.a(str);
                    if (eVarA == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        new IllegalArgumentException(str2);
                    } else {
                        ((f9.j) aVar.f15723e).j(new com.google.firebase.messaging.o(aVar, jVar, ((w8.b) eVarA).a(iVar2), i10));
                    }
                    return;
                } catch (Exception e3) {
                    logger.warning("Error scheduling event " + e3.getMessage());
                    return;
                }
            case 7:
                ((e1.n) this.f317c).c(new e1.h((String) this.f318d, (Throwable) this.f319e));
                return;
            case 8:
                c0 c0Var = (c0) this.f317c;
                ArrayList arrayList = (ArrayList) this.f318d;
                Runnable runnable = (Runnable) this.f319e;
                if (c0Var.G != 8) {
                    if (!arrayList.isEmpty()) {
                        com.google.android.gms.internal.auth.g.e(c0Var.f15917a, "encoded data and input buffers are returned");
                    }
                    if ((c0Var.f15923g instanceof b0) && !c0Var.D && c1.a.f2187a.i(StopCodecAfterSurfaceRemovalCrashMediaServerQuirk.class) == null) {
                        if (c0Var.f15935t) {
                            com.google.android.gms.internal.auth.g.e(c0Var.f15917a, "mMediaCodec.stop()");
                            c0Var.f15922f.stop();
                        } else {
                            com.google.android.gms.internal.auth.g.e(c0Var.f15917a, "mMediaCodec.flush()");
                            c0Var.f15922f.flush();
                        }
                        c0Var.C = true;
                    } else {
                        com.google.android.gms.internal.auth.g.e(c0Var.f15917a, "mMediaCodec.stop()");
                        c0Var.f15922f.stop();
                    }
                }
                runnable.run();
                int i11 = c0Var.G;
                if (i11 == 7) {
                    c0Var.g();
                    return;
                }
                if (!c0Var.C) {
                    c0Var.i();
                }
                c0Var.k(1);
                if (i11 == 5 || i11 == 6) {
                    c0Var.m();
                    if (i11 == 6) {
                        c0Var.f();
                        return;
                    }
                    return;
                }
                return;
            case 9:
                x xVar = (x) this.f317c;
                s1 s1Var = (s1) this.f319e;
                Executor executor2 = (Executor) this.f318d;
                LinkedHashMap linkedHashMap = xVar.f16004b;
                s1Var.getClass();
                executor2.getClass();
                linkedHashMap.put(s1Var, executor2);
                executor2.execute(new a0.d(28, s1Var, xVar.f16005c));
                return;
            case 10:
                a0 a0Var = (a0) this.f317c;
                Executor executor3 = (Executor) this.f318d;
                e1.n nVar = (e1.n) this.f319e;
                c0 c0Var2 = a0Var.f15894l;
                if (c0Var2.G == 8) {
                    return;
                }
                try {
                    Objects.requireNonNull(nVar);
                    executor3.execute(new e1.z(nVar, 1));
                    return;
                } catch (RejectedExecutionException e7) {
                    com.google.android.gms.internal.auth.g.l(c0Var2.f15917a, "Unable to post to the supplied executor.", e7);
                    return;
                }
            case 11:
                e4.e eVar = (e4.e) this.f317c;
                String str3 = (String) this.f318d;
                e4.d dVar = (e4.d) this.f319e;
                e4.q qVar = (e4.q) eVar.f16066d.f13c;
                e4.s sVar2 = qVar.f16173d;
                qVar.f16172c = str3;
                h0 h0VarA = dVar.A();
                if (h0VarA != null) {
                    sVar2.f16183e.f16154j.f16222d.put(Integer.valueOf(dVar.i()), h0VarA);
                    sVar2.f16200w = true;
                }
                sVar2.h();
                return;
            case 12:
                z0 pigeon_instanceArg = (z0) this.f317c;
                WebView viewArg = (WebView) this.f318d;
                ClientCertRequest requestArg = (ClientCertRequest) this.f319e;
                fj.m mVar = pigeon_instanceArg.f19466a;
                ch.a callback = new ch.a(i);
                mVar.getClass();
                Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
                Intrinsics.checkNotNullParameter(viewArg, "viewArg");
                Intrinsics.checkNotNullParameter(requestArg, "requestArg");
                Intrinsics.checkNotNullParameter(callback, "callback");
                m mVar2 = mVar.f19374a;
                mVar2.getClass();
                if (((fj.c) mVar2.f363c).d(pigeon_instanceArg)) {
                    new s7.g((ii.f) mVar2.f362b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedClientCertRequest", mVar2.m(), obj).K(kotlin.collections.s.f(pigeon_instanceArg, viewArg, requestArg), new bz(26, callback));
                    return;
                }
                ij.k kVar2 = ij.m.f21341c;
                om1.r("missing-instance-error", "Callback to `WebViewClient.onReceivedClientCertRequest` failed because native instance was not in the instance manager.", "");
                int i12 = z0.f19465c;
                return;
            case 13:
                z0 pigeon_instanceArg2 = (z0) this.f317c;
                WebView webViewArg = (WebView) this.f318d;
                WebResourceRequest requestArg2 = (WebResourceRequest) this.f319e;
                fj.m mVar3 = pigeon_instanceArg2.f19466a;
                ch.a callback2 = new ch.a(i);
                mVar3.getClass();
                Intrinsics.checkNotNullParameter(pigeon_instanceArg2, "pigeon_instanceArg");
                Intrinsics.checkNotNullParameter(webViewArg, "webViewArg");
                Intrinsics.checkNotNullParameter(requestArg2, "requestArg");
                Intrinsics.checkNotNullParameter(callback2, "callback");
                m mVar4 = mVar3.f19374a;
                mVar4.getClass();
                if (((fj.c) mVar4.f363c).d(pigeon_instanceArg2)) {
                    new s7.g((ii.f) mVar4.f362b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.requestLoading", mVar4.m(), obj).K(kotlin.collections.s.f(pigeon_instanceArg2, webViewArg, requestArg2), new bz(27, callback2));
                    return;
                }
                ij.k kVar3 = ij.m.f21341c;
                om1.r("missing-instance-error", "Callback to `WebViewClient.requestLoading` failed because native instance was not in the instance manager.", "");
                int i13 = z0.f19465c;
                return;
            case 14:
                Throwable th2 = (Throwable) this.f317c;
                g0.a aVar2 = (g0.a) this.f318d;
                List list = (List) this.f319e;
                if (th2 != null) {
                    aVar2.f19504b.onError(th2);
                    return;
                } else {
                    aVar2.f19504b.a(list);
                    return;
                }
            case 15:
                ArrayList arrayList2 = (ArrayList) this.f317c;
                e0 e0Var = (e0) this.f318d;
                String str4 = (String) this.f319e;
                try {
                    Iterator it = arrayList2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (Intrinsics.a(((g0.d0) next).e(), str4)) {
                                obj = next;
                            }
                        }
                    }
                    g0.d0 d0Var = (g0.d0) obj;
                    if (d0Var == null || (d0VarJ = d0Var.j()) == null) {
                        return;
                    }
                    d0VarJ.j(e0Var);
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            case 16:
                ge.j jVar2 = (ge.j) this.f317c;
                String str5 = (String) this.f318d;
                he.d dVar2 = (he.d) this.f319e;
                h3.e eVar2 = jVar2.f20134a;
                jd.b bVar = (jd.b) ((yd.a) eVar2.f20375c).get();
                if (bVar == null) {
                    return;
                }
                JSONObject jSONObject = dVar2.f20499e;
                if (jSONObject.length() < 1) {
                    return;
                }
                JSONObject jSONObject2 = dVar2.f20496b;
                if (jSONObject2.length() >= 1 && (jSONObjectOptJSONObject = jSONObject.optJSONObject(str5)) != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("choiceId");
                    if (strOptString.isEmpty()) {
                        return;
                    }
                    synchronized (((Map) eVar2.f20376d)) {
                        try {
                            if (!strOptString.equals(((Map) eVar2.f20376d).get(str5))) {
                                ((Map) eVar2.f20376d).put(str5, strOptString);
                                Bundle bundle = new Bundle();
                                bundle.putString("arm_key", str5);
                                bundle.putString("arm_value", jSONObject2.optString(str5));
                                bundle.putString("personalization_id", jSONObjectOptJSONObject.optString("personalizationId"));
                                bundle.putInt("arm_index", jSONObjectOptJSONObject.optInt("armIndex", -1));
                                bundle.putString("group", jSONObjectOptJSONObject.optString("group"));
                                jd.c cVar = (jd.c) bVar;
                                cVar.a("fp", "personalization_assignment", bundle);
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("_fpid", strOptString);
                                cVar.a("fp", "_fpc", bundle2);
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            case 17:
                B.a((B) this.f317c, (String) this.f318d, (String) this.f319e);
                return;
            case 18:
                L0.a((L0) this.f317c, (PluginErrorDetails) this.f318d, (String) this.f319e);
                return;
            case 19:
                C0041b0.a((C0041b0) this.f317c, (Context) this.f318d, (AppMetricaLibraryAdapterConfig) this.f319e);
                return;
            case 20:
                ((C0522u1) this.f317c).b((Context) this.f318d, (AppMetricaConfig) this.f319e);
                return;
            case 21:
                ((NdkScopeObserver) this.f317c).lambda$addAttachment$8((byte[]) this.f318d, (String) this.f319e);
                return;
            case 22:
                PixelCopyStrategy.applyMaskingAndNotify$lambda$2((PixelCopyStrategy) this.f317c, (View) this.f318d, (List) this.f319e);
                return;
            case 23:
                ((PixelCopyStrategy) this.f317c).applyMaskingAndNotify((View) this.f318d, (ViewHierarchyNode) this.f319e);
                return;
            case 24:
                ExecutorsKt.submitSafely$lambda$0((Runnable) this.f317c, (SentryOptions) this.f318d, (String) this.f319e);
                return;
            case 25:
                PersistableLinkedList.persistRecording$lambda$1((PersistableLinkedList) this.f317c, (ReplayRecording) this.f318d, (ReplayCache) this.f319e);
                return;
            case 26:
                ((PersistingScopeObserver) this.f317c).lambda$setTrace$10((SpanContext) this.f318d, (IScope) this.f319e);
                return;
            case 27:
                oi.j jVar3 = (oi.j) this.f317c;
                String str6 = (String) this.f318d;
                sb.g gVar3 = (sb.g) this.f319e;
                try {
                    FirebaseAnalytics firebaseAnalytics = jVar3.f30690b;
                    if (firebaseAnalytics == null) {
                        Intrinsics.g("analytics");
                        throw null;
                    }
                    m1 m1Var = firebaseAnalytics.f14753a;
                    m1Var.getClass();
                    m1Var.c(new com.google.android.gms.internal.measurement.z0(m1Var, str6));
                    gVar3.b(null);
                    return;
                } catch (Exception e10) {
                    gVar3.a(e10);
                    return;
                }
            case 28:
                q0.f fVar3 = (q0.f) this.f317c;
                i0 i0Var = (i0) this.f318d;
                Map map = Collections.EMPTY_MAP;
                j1.h hVar = (j1.h) this.f319e;
                try {
                    fVar3.f31566b.f(i0Var);
                    hVar.b(null);
                    return;
                } catch (RuntimeException e11) {
                    hVar.d(e11);
                    return;
                }
            default:
                q0.f fVar4 = (q0.f) this.f317c;
                Runnable runnable2 = (Runnable) this.f318d;
                Runnable runnable3 = (Runnable) this.f319e;
                if (fVar4.f31574k) {
                    runnable2.run();
                    return;
                } else {
                    runnable3.run();
                    return;
                }
        }
    }

    public /* synthetic */ c(e1.n nVar, int i, String str, Throwable th2) {
        this.f316b = 7;
        this.f317c = nVar;
        this.f318d = str;
        this.f319e = th2;
    }

    public /* synthetic */ c(x xVar, s1 s1Var, Executor executor) {
        this.f316b = 9;
        this.f317c = xVar;
        this.f319e = s1Var;
        this.f318d = executor;
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, int i) {
        this.f316b = i;
        this.f317c = obj;
        this.f318d = obj2;
        this.f319e = obj3;
    }

    public /* synthetic */ c(q0.f fVar, i0 i0Var, j1.h hVar) {
        this.f316b = 28;
        Map map = Collections.EMPTY_MAP;
        this.f317c = fVar;
        this.f318d = i0Var;
        this.f319e = hVar;
    }
}
