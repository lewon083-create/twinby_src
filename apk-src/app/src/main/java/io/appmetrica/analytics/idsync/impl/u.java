package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.network.internal.NetworkClient;
import io.appmetrica.analytics.network.internal.Request;
import io.appmetrica.analytics.network.internal.Response;
import kotlin.text.Charsets;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ServiceContext f22028a;

    public u(ServiceContext serviceContext) {
        this.f22028a = serviceContext;
    }

    public final boolean a(String str, String str2) {
        try {
            Response responseExecute = new NetworkClient.Builder().withSslSocketFactory(this.f22028a.getNetworkContext().getSslSocketFactoryProvider().getSslSocketFactory()).withUseCaches(false).withInstanceFollowRedirects(true).withMaxResponseSize(10240).build().newCall(new Request.Builder(str).post(str2.getBytes(Charsets.UTF_8)).addHeader("Content-Type", "application/json").build()).execute();
            if (responseExecute.isCompleted()) {
                if (responseExecute.getCode() != 200) {
                    int code = responseExecute.getCode();
                    if (400 > code || code >= 500) {
                    }
                }
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
