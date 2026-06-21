package io.appmetrica.analytics.idsync.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.idsync.internal.model.Preconditions;
import io.appmetrica.analytics.idsync.internal.model.RequestConfig;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.network.internal.NetworkClient;
import io.appmetrica.analytics.network.internal.Request;
import io.appmetrica.analytics.network.internal.Response;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import t.v0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ServiceContext f22003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G f22004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SdkIdentifiers f22005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SystemTimeProvider f22006d = new SystemTimeProvider();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o f22007e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final x f22008f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q f22009g;

    public n(@NotNull ServiceContext serviceContext, @NotNull G g10, @NotNull SdkIdentifiers sdkIdentifiers) {
        this.f22003a = serviceContext;
        this.f22004b = g10;
        this.f22005c = sdkIdentifiers;
        this.f22007e = new o(serviceContext.getNetworkContext().getSslSocketFactoryProvider(), this);
        this.f22008f = new x(serviceContext);
        this.f22009g = new q(serviceContext);
    }

    public static final void a(D d10, n nVar, RequestConfig requestConfig) {
        if (d10.f21937b) {
            G g10 = nVar.f22004b;
            String str = d10.f21936a;
            g10.f21953d.put(str, new E(str, nVar.f22006d.currentTimeMillis(), d10.f21939d ? 2 : 4));
            g10.f21950a.putString(g10.f21952c, g10.f21951b.fromModel(CollectionsKt.R(g10.f21953d.values())));
            q qVar = nVar.f22009g;
            SdkIdentifiers sdkIdentifiers = nVar.f22005c;
            qVar.f22014a.getClass();
            String strA = v.a(d10);
            t tVar = qVar.f22015b;
            tVar.getClass();
            ArrayList arrayList = new ArrayList();
            if (requestConfig.getReportEventEnabled()) {
                arrayList.add(new p(tVar.f22027a));
            }
            String reportUrl = requestConfig.getReportUrl();
            if (reportUrl != null && !StringsKt.D(reportUrl)) {
                arrayList.add(new r(tVar.f22027a, requestConfig.getReportUrl()));
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((s) it.next()).a(strA, sdkIdentifiers);
            }
        }
    }

    @NotNull
    public final SdkIdentifiers a() {
        return this.f22005c;
    }

    public final void a(@NotNull SdkIdentifiers sdkIdentifiers) {
        this.f22005c = sdkIdentifiers;
    }

    public static final void a(n nVar, RequestConfig requestConfig) {
        y c0007a;
        x xVar = nVar.f22008f;
        Preconditions preconditions = requestConfig.getPreconditions();
        xVar.getClass();
        if (w.f22029a[preconditions.getNetworkType().ordinal()] == 1) {
            c0007a = new C0008b(xVar.f22030a);
        } else {
            c0007a = new C0007a();
        }
        if (c0007a.a()) {
            o oVar = nVar.f22007e;
            oVar.getClass();
            Request.Builder builder = new Request.Builder(requestConfig.getUrl());
            for (Map.Entry<String, List<String>> entry : requestConfig.getHeaders().entrySet()) {
                builder.addHeader(entry.getKey(), CollectionsKt.I(entry.getValue(), ", ", null, null, null, 62));
            }
            Response responseExecute = new NetworkClient.Builder().withSslSocketFactory(oVar.f22010a.getSslSocketFactory()).withUseCaches(false).withInstanceFollowRedirects(true).withMaxResponseSize(102400).build().newCall(builder.build()).execute();
            oVar.f22011b.a(new D(requestConfig.getType(), responseExecute.isCompleted(), responseExecute.getUrl(), requestConfig.getValidResponseCodes().contains(Integer.valueOf(responseExecute.getCode())), responseExecute.getCode(), responseExecute.getResponseData().length == 0 ? responseExecute.getErrorData() : responseExecute.getResponseData(), responseExecute.getHeaders()), requestConfig);
        }
    }

    public final void a(@NotNull D d10, @NotNull RequestConfig requestConfig) {
        this.f22003a.getExecutorProvider().getModuleExecutor().execute(new q0.o(d10, this, requestConfig, 8));
    }

    public final void a(@NotNull RequestConfig requestConfig) {
        long resendIntervalForValidResponse;
        if (TextUtils.isEmpty(requestConfig.getType()) || TextUtils.isEmpty(requestConfig.getUrl()) || requestConfig.getValidResponseCodes().isEmpty()) {
            return;
        }
        E e3 = (E) this.f22004b.f21953d.get(requestConfig.getType());
        if (e3 != null) {
            long jCurrentTimeMillis = this.f22006d.currentTimeMillis();
            int iA = A.a(e3.f21945c);
            if (iA != 1) {
                resendIntervalForValidResponse = iA != 3 ? 0L : requestConfig.getResendIntervalForInvalidResponse();
            } else {
                resendIntervalForValidResponse = requestConfig.getResendIntervalForValidResponse();
            }
            if (jCurrentTimeMillis - e3.f21944b < resendIntervalForValidResponse) {
                return;
            }
        }
        this.f22003a.getExecutorProvider().getSupportIOExecutor().execute(new v0(7, this, requestConfig));
    }
}
