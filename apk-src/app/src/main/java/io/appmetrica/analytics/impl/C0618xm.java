package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.networktasks.internal.ConfigProvider;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.xm, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0618xm implements UnderlyingNetworkTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0668zm f25041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0089cm f25042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Il f25043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RequestDataHolder f25044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConfigProvider f25045e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ResponseDataHolder f25046f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final FullUrlFormer f25047g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Ql f25048h;

    public C0618xm(@NonNull C0668zm c0668zm, @NonNull FullUrlFormer<C0037am> fullUrlFormer, @NonNull RequestDataHolder requestDataHolder, @NonNull ResponseDataHolder responseDataHolder, @NonNull ConfigProvider<C0037am> configProvider) {
        this(c0668zm, new Ql(), fullUrlFormer, requestDataHolder, responseDataHolder, configProvider);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final String description() {
        return "Startup task for component: " + this.f25041a.f25129a.f22088f.toString();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final FullUrlFormer<?> getFullUrlFormer() {
        return this.f25047g;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final RequestDataHolder getRequestDataHolder() {
        return this.f25044d;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final ResponseDataHolder getResponseDataHolder() {
        return this.f25046f;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final RetryPolicyConfig getRetryPolicyConfig() {
        return ((C0037am) this.f25045e.getConfig()).getRetryPolicyConfig();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final SSLSocketFactory getSslSocketFactory() {
        ((C0667zl) C0382oa.I.z()).getClass();
        return null;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onCreateTask() {
        this.f25044d.setHeader("Accept-Encoding", "encrypted");
        return this.f25041a.g();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPostRequestComplete(boolean z5) {
        if (z5) {
            return;
        }
        this.f25043c = Il.PARSE;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onRequestComplete() {
        C0089cm c0089cmHandle = this.f25048h.handle(this.f25046f);
        this.f25042b = c0089cmHandle;
        return c0089cmHandle != null;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onRequestError(Throwable th2) {
        this.f25043c = Il.NETWORK;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onShouldNotExecute() {
        this.f25043c = Il.NETWORK;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onSuccessfulTaskFinished() {
        if (this.f25042b == null || this.f25046f.getResponseHeaders() == null) {
            return;
        }
        this.f25041a.a(this.f25042b, (C0037am) this.f25045e.getConfig(), this.f25046f.getResponseHeaders());
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onUnsuccessfulTaskFinished() {
        if (this.f25043c == null) {
            this.f25043c = Il.UNKNOWN;
        }
        this.f25041a.a(this.f25043c);
    }

    public C0618xm(C0668zm c0668zm, Ql ql2, FullUrlFormer fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, ConfigProvider configProvider) {
        this.f25041a = c0668zm;
        this.f25048h = ql2;
        this.f25044d = requestDataHolder;
        this.f25046f = responseDataHolder;
        this.f25045e = configProvider;
        this.f25047g = fullUrlFormer;
        fullUrlFormer.setHosts(((C0037am) configProvider.getConfig()).k());
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPerformRequest() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskAdded() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskFinished() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskRemoved() {
    }
}
