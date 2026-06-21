package io.sentry.android.core.performance;

import a0.u;
import android.os.Looper;
import android.os.SystemClock;
import io.sentry.ISpan;
import io.sentry.Instrumenter;
import io.sentry.SentryDate;
import io.sentry.SpanDataConvention;
import io.sentry.SpanStatus;
import io.sentry.android.core.AndroidDateUtils;
import io.sentry.android.core.internal.util.AndroidThreadChecker;
import io.sentry.protocol.SentryThread;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class ActivityLifecycleSpanHelper {
    private static final String APP_METRICS_ACTIVITIES_OP = "activity.load";

    @NotNull
    private final String activityName;

    @Nullable
    private SentryDate onCreateStartTimestamp = null;

    @Nullable
    private SentryDate onStartStartTimestamp = null;

    @Nullable
    private ISpan onCreateSpan = null;

    @Nullable
    private ISpan onStartSpan = null;

    public ActivityLifecycleSpanHelper(@NotNull String str) {
        this.activityName = str;
    }

    @NotNull
    private ISpan createLifecycleSpan(@NotNull ISpan iSpan, @NotNull String str, @NotNull SentryDate sentryDate) {
        ISpan iSpanStartChild = iSpan.startChild(APP_METRICS_ACTIVITIES_OP, str, sentryDate, Instrumenter.SENTRY);
        setDefaultStartSpanData(iSpanStartChild);
        return iSpanStartChild;
    }

    private void setDefaultStartSpanData(@NotNull ISpan iSpan) {
        iSpan.setData(SpanDataConvention.THREAD_ID, Long.valueOf(AndroidThreadChecker.getThreadId(Looper.getMainLooper().getThread())));
        iSpan.setData(SpanDataConvention.THREAD_NAME, SentryThread.JsonKeys.MAIN);
        Boolean bool = Boolean.TRUE;
        iSpan.setData(SpanDataConvention.CONTRIBUTES_TTID, bool);
        iSpan.setData(SpanDataConvention.CONTRIBUTES_TTFD, bool);
    }

    public void clear() {
        ISpan iSpan = this.onCreateSpan;
        if (iSpan != null && !iSpan.isFinished()) {
            this.onCreateSpan.finish(SpanStatus.CANCELLED);
        }
        this.onCreateSpan = null;
        ISpan iSpan2 = this.onStartSpan;
        if (iSpan2 != null && !iSpan2.isFinished()) {
            this.onStartSpan.finish(SpanStatus.CANCELLED);
        }
        this.onStartSpan = null;
    }

    public void createAndStopOnCreateSpan(@Nullable ISpan iSpan) {
        if (this.onCreateStartTimestamp == null || iSpan == null) {
            return;
        }
        ISpan iSpanCreateLifecycleSpan = createLifecycleSpan(iSpan, u.o(new StringBuilder(), this.activityName, ".onCreate"), this.onCreateStartTimestamp);
        this.onCreateSpan = iSpanCreateLifecycleSpan;
        iSpanCreateLifecycleSpan.finish();
    }

    public void createAndStopOnStartSpan(@Nullable ISpan iSpan) {
        if (this.onStartStartTimestamp == null || iSpan == null) {
            return;
        }
        ISpan iSpanCreateLifecycleSpan = createLifecycleSpan(iSpan, u.o(new StringBuilder(), this.activityName, ".onStart"), this.onStartStartTimestamp);
        this.onStartSpan = iSpanCreateLifecycleSpan;
        iSpanCreateLifecycleSpan.finish();
    }

    @Nullable
    public ISpan getOnCreateSpan() {
        return this.onCreateSpan;
    }

    @Nullable
    public SentryDate getOnCreateStartTimestamp() {
        return this.onCreateStartTimestamp;
    }

    @Nullable
    public ISpan getOnStartSpan() {
        return this.onStartSpan;
    }

    @Nullable
    public SentryDate getOnStartStartTimestamp() {
        return this.onStartStartTimestamp;
    }

    public void saveSpanToAppStartMetrics() {
        ISpan iSpan = this.onCreateSpan;
        if (iSpan == null || this.onStartSpan == null) {
            return;
        }
        SentryDate finishDate = iSpan.getFinishDate();
        SentryDate finishDate2 = this.onStartSpan.getFinishDate();
        if (finishDate == null || finishDate2 == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        SentryDate currentSentryDateTime = AndroidDateUtils.getCurrentSentryDateTime();
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        long millis = timeUnit.toMillis(currentSentryDateTime.diff(this.onCreateSpan.getStartDate()));
        long millis2 = timeUnit.toMillis(currentSentryDateTime.diff(finishDate));
        long millis3 = timeUnit.toMillis(currentSentryDateTime.diff(this.onStartSpan.getStartDate()));
        long millis4 = timeUnit.toMillis(currentSentryDateTime.diff(finishDate2));
        ActivityLifecycleTimeSpan activityLifecycleTimeSpan = new ActivityLifecycleTimeSpan();
        activityLifecycleTimeSpan.getOnCreate().setup(this.onCreateSpan.getDescription(), timeUnit.toMillis(this.onCreateSpan.getStartDate().nanoTimestamp()), jUptimeMillis - millis, jUptimeMillis - millis2);
        activityLifecycleTimeSpan.getOnStart().setup(this.onStartSpan.getDescription(), timeUnit.toMillis(this.onStartSpan.getStartDate().nanoTimestamp()), jUptimeMillis - millis3, jUptimeMillis - millis4);
        AppStartMetrics.getInstance().addActivityLifecycleTimeSpans(activityLifecycleTimeSpan);
    }

    public void setOnCreateStartTimestamp(@NotNull SentryDate sentryDate) {
        this.onCreateStartTimestamp = sentryDate;
    }

    public void setOnStartStartTimestamp(@NotNull SentryDate sentryDate) {
        this.onStartStartTimestamp = sentryDate;
    }
}
