package io.sentry.android.core.performance;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class ActivityLifecycleTimeSpan implements Comparable<ActivityLifecycleTimeSpan> {

    @NotNull
    private final TimeSpan onCreate = new TimeSpan();

    @NotNull
    private final TimeSpan onStart = new TimeSpan();

    @NotNull
    public final TimeSpan getOnCreate() {
        return this.onCreate;
    }

    @NotNull
    public final TimeSpan getOnStart() {
        return this.onStart;
    }

    @Override // java.lang.Comparable
    public int compareTo(ActivityLifecycleTimeSpan activityLifecycleTimeSpan) {
        int iCompare = Long.compare(this.onCreate.getStartUptimeMs(), activityLifecycleTimeSpan.onCreate.getStartUptimeMs());
        return iCompare == 0 ? Long.compare(this.onStart.getStartUptimeMs(), activityLifecycleTimeSpan.onStart.getStartUptimeMs()) : iCompare;
    }
}
