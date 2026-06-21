package io.appmetrica.analytics.coreutils.internal.cache;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler;
import io.appmetrica.analytics.coreapi.internal.cache.UpdateConditionsChecker;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.locationapi.internal.ILastKnownUpdater;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class LocationDataCacheUpdateScheduler implements CacheUpdateScheduler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ICommonExecutor f21790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ILastKnownUpdater f21791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final UpdateConditionsChecker f21792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f21793d = new a(this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f21794e = new b(this);

    public LocationDataCacheUpdateScheduler(@NonNull ICommonExecutor iCommonExecutor, @NonNull ILastKnownUpdater iLastKnownUpdater, @NonNull UpdateConditionsChecker updateConditionsChecker, @NonNull String str) {
        this.f21790a = iCommonExecutor;
        this.f21791b = iLastKnownUpdater;
        this.f21792c = updateConditionsChecker;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler
    public void onStateUpdated() {
        this.f21790a.remove(this.f21793d);
        this.f21790a.executeDelayed(this.f21793d, 90L, TimeUnit.SECONDS);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler
    public void scheduleUpdateIfNeededNow() {
        this.f21790a.execute(this.f21794e);
    }

    public void startUpdates() {
        onStateUpdated();
    }

    public void stopUpdates() {
        this.f21790a.remove(this.f21793d);
        this.f21790a.remove(this.f21794e);
    }
}
