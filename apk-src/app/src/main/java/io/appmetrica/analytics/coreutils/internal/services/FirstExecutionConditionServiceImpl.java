package io.appmetrica.analytics.coreutils.internal.services;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionConditionService;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionDelayedTask;
import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class FirstExecutionConditionServiceImpl implements FirstExecutionConditionService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f21810a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private UtilityServiceConfiguration f21811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final UtilityServiceProvider f21812c;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static class FirstExecutionConditionChecker {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f21813a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f21814b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f21815c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f21816d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final FirstExecutionDelayChecker f21817e;
        public final String tag;

        public FirstExecutionConditionChecker(UtilityServiceConfiguration utilityServiceConfiguration, @NonNull FirstExecutionDelayChecker firstExecutionDelayChecker, @NonNull String str) {
            this.f21817e = firstExecutionDelayChecker;
            this.f21815c = utilityServiceConfiguration == null ? 0L : utilityServiceConfiguration.getInitialConfigTime();
            this.f21814b = utilityServiceConfiguration != null ? utilityServiceConfiguration.getLastUpdateConfigTime() : 0L;
            this.f21816d = Long.MAX_VALUE;
            this.tag = str;
        }

        public final void a(long j10) {
            this.f21816d = TimeUnit.SECONDS.toMillis(j10);
        }

        public final boolean b() {
            if (this.f21813a) {
                return true;
            }
            return this.f21817e.delaySinceFirstStartupWasPassed(this.f21815c, this.f21814b, this.f21816d);
        }

        public final void a() {
            this.f21813a = true;
        }

        public final void a(UtilityServiceConfiguration utilityServiceConfiguration) {
            this.f21815c = utilityServiceConfiguration.getInitialConfigTime();
            this.f21814b = utilityServiceConfiguration.getLastUpdateConfigTime();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static class FirstExecutionDelayChecker {
        public boolean delaySinceFirstStartupWasPassed(long j10, long j11, long j12) {
            return j11 - j10 >= j12;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static class FirstExecutionHandler implements FirstExecutionDelayedTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final FirstExecutionConditionChecker f21818a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WaitForActivationDelayBarrier.ActivationBarrierHelper f21819b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ICommonExecutor f21820c;

        public /* synthetic */ FirstExecutionHandler(ICommonExecutor iCommonExecutor, WaitForActivationDelayBarrier.ActivationBarrierHelper activationBarrierHelper, FirstExecutionConditionChecker firstExecutionConditionChecker, int i) {
            this(iCommonExecutor, activationBarrierHelper, firstExecutionConditionChecker);
        }

        public boolean canExecute() {
            boolean zB = this.f21818a.b();
            if (zB) {
                this.f21818a.a();
            }
            return zB;
        }

        @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionDelayedTask
        public void setInitialDelaySeconds(long j10) {
            this.f21818a.a(j10);
        }

        @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionDelayedTask
        public boolean tryExecute(long j10) {
            if (!this.f21818a.b()) {
                return false;
            }
            this.f21819b.subscribeIfNeeded(TimeUnit.SECONDS.toMillis(j10), this.f21820c);
            this.f21818a.a();
            return true;
        }

        public void updateConfig(@NonNull UtilityServiceConfiguration utilityServiceConfiguration) {
            this.f21818a.a(utilityServiceConfiguration);
        }

        private FirstExecutionHandler(ICommonExecutor iCommonExecutor, WaitForActivationDelayBarrier.ActivationBarrierHelper activationBarrierHelper, FirstExecutionConditionChecker firstExecutionConditionChecker) {
            this.f21819b = activationBarrierHelper;
            this.f21818a = firstExecutionConditionChecker;
            this.f21820c = iCommonExecutor;
        }
    }

    public FirstExecutionConditionServiceImpl(@NonNull UtilityServiceProvider utilityServiceProvider) {
        this.f21812c = utilityServiceProvider;
    }

    public final synchronized FirstExecutionHandler a(ICommonExecutor iCommonExecutor, WaitForActivationDelayBarrier.ActivationBarrierHelper activationBarrierHelper, FirstExecutionConditionChecker firstExecutionConditionChecker) {
        FirstExecutionHandler firstExecutionHandler;
        firstExecutionHandler = new FirstExecutionHandler(iCommonExecutor, activationBarrierHelper, firstExecutionConditionChecker, 0);
        this.f21810a.add(firstExecutionHandler);
        return firstExecutionHandler;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionConditionService
    @NonNull
    public synchronized FirstExecutionDelayedTask createDelayedTask(@NonNull String str, @NonNull ICommonExecutor iCommonExecutor, @NonNull Runnable runnable) {
        return a(iCommonExecutor, new WaitForActivationDelayBarrier.ActivationBarrierHelper(runnable, this.f21812c.getActivationBarrier()), new FirstExecutionConditionChecker(this.f21811b, new FirstExecutionDelayChecker(), str));
    }

    public void updateConfig(@NonNull UtilityServiceConfiguration utilityServiceConfiguration) {
        ArrayList arrayList;
        synchronized (this) {
            this.f21811b = utilityServiceConfiguration;
            arrayList = new ArrayList(this.f21810a);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((FirstExecutionHandler) it.next()).updateConfig(utilityServiceConfiguration);
        }
    }
}
