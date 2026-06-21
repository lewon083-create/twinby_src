package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public interface UnderlyingNetworkTask {
    @NonNull
    String description();

    @NonNull
    FullUrlFormer<?> getFullUrlFormer();

    @NonNull
    RequestDataHolder getRequestDataHolder();

    @NonNull
    ResponseDataHolder getResponseDataHolder();

    RetryPolicyConfig getRetryPolicyConfig();

    SSLSocketFactory getSslSocketFactory();

    boolean onCreateTask();

    void onPerformRequest();

    void onPostRequestComplete(boolean z5);

    boolean onRequestComplete();

    void onRequestError(Throwable th2);

    void onShouldNotExecute();

    void onSuccessfulTaskFinished();

    void onTaskAdded();

    void onTaskFinished();

    void onTaskRemoved();

    void onUnsuccessfulTaskFinished();
}
