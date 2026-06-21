package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class NetworkTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f25333a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f25334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IExecutionPolicy f25335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ExponentialBackoffPolicy f25336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final UnderlyingNetworkTask f25337e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f25338f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f25339g;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public enum Method {
        GET,
        POST
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public interface ShouldTryNextHostCondition {
        boolean shouldTryNextHost(int i);
    }

    public NetworkTask(@NonNull Executor executor, @NonNull IExecutionPolicy iExecutionPolicy, @NonNull ExponentialBackoffPolicy exponentialBackoffPolicy, @NonNull UnderlyingNetworkTask underlyingNetworkTask, @NonNull List<ShouldTryNextHostCondition> list, @NonNull String str) {
        this.f25334b = executor;
        this.f25335c = iExecutionPolicy;
        this.f25336d = exponentialBackoffPolicy;
        this.f25337e = underlyingNetworkTask;
        this.f25338f = list;
        this.f25339g = str;
    }

    private synchronized boolean a(int i) {
        if (!a(i)) {
            return false;
        }
        this.f25333a = i;
        return true;
    }

    @NonNull
    public String description() {
        return this.f25337e.description();
    }

    @NonNull
    public IExecutionPolicy getConnectionExecutionPolicy() {
        return this.f25335c;
    }

    @NonNull
    public Executor getExecutor() {
        return this.f25334b;
    }

    @NonNull
    public ExponentialBackoffPolicy getExponentialBackoffPolicy() {
        return this.f25336d;
    }

    @NonNull
    public RequestDataHolder getRequestDataHolder() {
        return this.f25337e.getRequestDataHolder();
    }

    @NonNull
    public ResponseDataHolder getResponseDataHolder() {
        return this.f25337e.getResponseDataHolder();
    }

    public RetryPolicyConfig getRetryPolicyConfig() {
        return this.f25337e.getRetryPolicyConfig();
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.f25337e.getSslSocketFactory();
    }

    @NonNull
    public UnderlyingNetworkTask getUnderlyingTask() {
        return this.f25337e;
    }

    public String getUrl() {
        return this.f25337e.getFullUrlFormer().getUrl();
    }

    @NonNull
    public String getUserAgent() {
        return this.f25339g;
    }

    public boolean isRemoved() {
        return this.f25333a == 9;
    }

    public boolean onCreateNetworkTask() {
        if (a(3)) {
            return this.f25337e.onCreateTask();
        }
        return false;
    }

    public boolean onPerformRequest() {
        boolean zA = a(4);
        if (zA) {
            this.f25337e.getFullUrlFormer().incrementAttemptNumber();
            this.f25337e.getFullUrlFormer().buildAndSetFullHostUrl();
            this.f25337e.onPerformRequest();
        }
        return zA;
    }

    public boolean onRequestComplete() {
        boolean zOnRequestComplete;
        boolean z5;
        synchronized (this) {
            try {
                if (a(5, 6)) {
                    zOnRequestComplete = this.f25337e.onRequestComplete();
                    if (zOnRequestComplete) {
                        this.f25333a = 5;
                    } else {
                        this.f25333a = 6;
                    }
                    z5 = true;
                } else {
                    zOnRequestComplete = false;
                    z5 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z5) {
            this.f25337e.onPostRequestComplete(zOnRequestComplete);
        }
        return zOnRequestComplete;
    }

    public void onRequestError(Throwable th2) {
        if (a(6)) {
            this.f25337e.onRequestError(th2);
        }
    }

    public void onShouldNotExecute() {
        if (a(7)) {
            this.f25337e.onShouldNotExecute();
        }
    }

    public boolean onTaskAdded() {
        boolean zA = a(2);
        if (zA) {
            this.f25337e.onTaskAdded();
        }
        return zA;
    }

    public void onTaskFinished() {
        int i;
        boolean zA;
        synchronized (this) {
            i = this.f25333a;
            zA = a(8);
        }
        if (zA) {
            this.f25337e.onTaskFinished();
            if (i == 5) {
                this.f25337e.onSuccessfulTaskFinished();
            } else if (i == 6 || i == 7) {
                this.f25337e.onUnsuccessfulTaskFinished();
            }
        }
    }

    public void onTaskRemoved() {
        if (a(9)) {
            this.f25337e.onTaskRemoved();
        }
    }

    public synchronized boolean shouldTryNextHost() {
        boolean zHasMoreHosts;
        boolean z5;
        int i;
        try {
            zHasMoreHosts = this.f25337e.getFullUrlFormer().hasMoreHosts();
            int responseCode = this.f25337e.getResponseDataHolder().getResponseCode();
            Iterator it = this.f25338f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z5 = true;
                    break;
                }
                if (!((ShouldTryNextHostCondition) it.next()).shouldTryNextHost(responseCode)) {
                    z5 = false;
                    break;
                }
            }
            i = this.f25333a;
        } catch (Throwable th2) {
            throw th2;
        }
        return i != 9 && i != 8 && zHasMoreHosts && z5;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized boolean a(int... r14) {
        /*
            r13 = this;
            monitor-enter(r13)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L1f
            int r1 = r13.f25333a     // Catch: java.lang.Throwable -> L1f
            int r2 = r14.length     // Catch: java.lang.Throwable -> L1f
            r3 = 0
            r4 = r3
        L8:
            if (r4 >= r2) goto L84
            r5 = r14[r4]     // Catch: java.lang.Throwable -> L1f
            int r5 = io.appmetrica.analytics.networktasks.impl.e.a(r5)     // Catch: java.lang.Throwable -> L1f
            r6 = 4
            r7 = 2
            r8 = 6
            r9 = 5
            r10 = 3
            r11 = 9
            r12 = 1
            switch(r5) {
                case 0: goto L76;
                case 1: goto L6d;
                case 2: goto L63;
                case 3: goto L54;
                case 4: goto L4a;
                case 5: goto L4a;
                case 6: goto L45;
                case 7: goto L2f;
                case 8: goto L22;
                default: goto L1b;
            }     // Catch: java.lang.Throwable -> L1f
        L1b:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L1f
            goto L77
        L1f:
            r14 = move-exception
            goto L8f
        L22:
            if (r1 != r12) goto L26
            goto L76
        L26:
            if (r1 == r11) goto L29
            goto L2a
        L29:
            r12 = r3
        L2a:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r12)     // Catch: java.lang.Throwable -> L1f
            goto L77
        L2f:
            if (r1 == r9) goto L42
            if (r1 == r8) goto L42
            r5 = 7
            if (r1 == r5) goto L42
            if (r1 == r7) goto L42
            if (r1 == r10) goto L42
            if (r1 != r6) goto L3d
            goto L42
        L3d:
            if (r1 != r11) goto L76
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L1f
            goto L77
        L42:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L1f
            goto L77
        L45:
            if (r1 != r10) goto L63
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L1f
            goto L77
        L4a:
            if (r1 != r6) goto L4f
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L1f
            goto L77
        L4f:
            if (r1 != r11) goto L76
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L1f
            goto L77
        L54:
            if (r1 == r10) goto L60
            if (r1 == r9) goto L60
            if (r1 != r8) goto L5b
            goto L60
        L5b:
            if (r1 != r11) goto L76
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L1f
            goto L77
        L60:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L1f
            goto L77
        L63:
            if (r1 != r7) goto L68
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L1f
            goto L77
        L68:
            if (r1 != r11) goto L76
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L1f
            goto L77
        L6d:
            if (r1 != r12) goto L70
            goto L71
        L70:
            r12 = r3
        L71:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r12)     // Catch: java.lang.Throwable -> L1f
            goto L77
        L76:
            r5 = 0
        L77:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L1f
            boolean r6 = r6.equals(r5)     // Catch: java.lang.Throwable -> L1f
            if (r6 != 0) goto L81
            r0 = r5
            goto L84
        L81:
            int r4 = r4 + 1
            goto L8
        L84:
            java.lang.Boolean r14 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L1f
            r14.equals(r0)     // Catch: java.lang.Throwable -> L1f
            boolean r14 = r14.equals(r0)     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r13)
            return r14
        L8f:
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L1f
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.networktasks.internal.NetworkTask.a(int[]):boolean");
    }
}
