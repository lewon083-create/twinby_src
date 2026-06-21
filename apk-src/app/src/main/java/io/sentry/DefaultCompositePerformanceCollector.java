package io.sentry;

import com.google.android.gms.internal.ads.om1;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class DefaultCompositePerformanceCollector implements CompositePerformanceCollector {
    private static final long TRANSACTION_COLLECTION_INTERVAL_MILLIS = 100;
    private static final long TRANSACTION_COLLECTION_TIMEOUT_MILLIS = 30000;
    private final boolean hasNoCollectors;

    @NotNull
    private final SentryOptions options;

    @NotNull
    private final AutoClosableReentrantLock timerLock = new AutoClosableReentrantLock();

    @Nullable
    private volatile Timer timer = null;

    @NotNull
    private final Map<String, CompositeData> compositeDataMap = new ConcurrentHashMap();

    @NotNull
    private final AtomicBoolean isStarted = new AtomicBoolean(false);
    private long lastCollectionTimestamp = 0;

    @NotNull
    private final List<IPerformanceSnapshotCollector> snapshotCollectors = new ArrayList();

    @NotNull
    private final List<IPerformanceContinuousCollector> continuousCollectors = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public class CompositeData {

        @NotNull
        private final List<PerformanceCollectionData> dataList;
        private final long startTimestamp;

        @Nullable
        private final ITransaction transaction;

        public boolean addDataAndCheckTimeout(@NotNull PerformanceCollectionData performanceCollectionData) {
            this.dataList.add(performanceCollectionData);
            if (this.transaction != null) {
                return DefaultCompositePerformanceCollector.this.options.getDateProvider().now().nanoTimestamp() > TimeUnit.MILLISECONDS.toNanos(30000L) + this.startTimestamp;
            }
            return false;
        }

        private CompositeData(@Nullable ITransaction iTransaction) {
            this.dataList = new ArrayList();
            this.transaction = iTransaction;
            this.startTimestamp = DefaultCompositePerformanceCollector.this.options.getDateProvider().now().nanoTimestamp();
        }
    }

    public DefaultCompositePerformanceCollector(@NotNull SentryOptions sentryOptions) {
        boolean z5 = false;
        this.options = (SentryOptions) Objects.requireNonNull(sentryOptions, "The options object is required.");
        for (IPerformanceCollector iPerformanceCollector : sentryOptions.getPerformanceCollectors()) {
            if (iPerformanceCollector instanceof IPerformanceSnapshotCollector) {
                this.snapshotCollectors.add((IPerformanceSnapshotCollector) iPerformanceCollector);
            }
            if (iPerformanceCollector instanceof IPerformanceContinuousCollector) {
                this.continuousCollectors.add((IPerformanceContinuousCollector) iPerformanceCollector);
            }
        }
        if (this.snapshotCollectors.isEmpty() && this.continuousCollectors.isEmpty()) {
            z5 = true;
        }
        this.hasNoCollectors = z5;
    }

    @Override // io.sentry.CompositePerformanceCollector
    public void close() {
        this.options.getLogger().log(SentryLevel.DEBUG, "stop collecting all performance info for transactions", new Object[0]);
        this.compositeDataMap.clear();
        Iterator<IPerformanceContinuousCollector> it = this.continuousCollectors.iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        if (this.isStarted.getAndSet(false)) {
            ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.timerLock.acquire();
            try {
                if (this.timer != null) {
                    this.timer.cancel();
                    this.timer = null;
                }
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                }
            } catch (Throwable th2) {
                if (iSentryLifecycleTokenAcquire != null) {
                    try {
                        iSentryLifecycleTokenAcquire.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    @Override // io.sentry.CompositePerformanceCollector
    public void onSpanFinished(@NotNull ISpan iSpan) {
        Iterator<IPerformanceContinuousCollector> it = this.continuousCollectors.iterator();
        while (it.hasNext()) {
            it.next().onSpanFinished(iSpan);
        }
    }

    @Override // io.sentry.CompositePerformanceCollector
    public void onSpanStarted(@NotNull ISpan iSpan) {
        Iterator<IPerformanceContinuousCollector> it = this.continuousCollectors.iterator();
        while (it.hasNext()) {
            it.next().onSpanStarted(iSpan);
        }
    }

    @Override // io.sentry.CompositePerformanceCollector
    public void start(@NotNull ITransaction iTransaction) {
        if (this.hasNoCollectors) {
            this.options.getLogger().log(SentryLevel.INFO, "No collector found. Performance stats will not be captured during transactions.", new Object[0]);
            return;
        }
        Iterator<IPerformanceContinuousCollector> it = this.continuousCollectors.iterator();
        while (it.hasNext()) {
            it.next().onSpanStarted(iTransaction);
        }
        String string = iTransaction.getEventId().toString();
        if (!this.compositeDataMap.containsKey(string)) {
            this.compositeDataMap.put(string, new CompositeData(iTransaction));
        }
        start(string);
    }

    @Override // io.sentry.CompositePerformanceCollector
    @Nullable
    public List<PerformanceCollectionData> stop(@NotNull ITransaction iTransaction) {
        this.options.getLogger().log(SentryLevel.DEBUG, "stop collecting performance info for transactions %s (%s)", iTransaction.getName(), iTransaction.getSpanContext().getTraceId().toString());
        Iterator<IPerformanceContinuousCollector> it = this.continuousCollectors.iterator();
        while (it.hasNext()) {
            it.next().onSpanFinished(iTransaction);
        }
        return stop(iTransaction.getEventId().toString());
    }

    @Override // io.sentry.CompositePerformanceCollector
    @Nullable
    public List<PerformanceCollectionData> stop(@NotNull String str) {
        CompositeData compositeDataRemove = this.compositeDataMap.remove(str);
        this.options.getLogger().log(SentryLevel.DEBUG, om1.k("stop collecting performance info for ", str), new Object[0]);
        if (this.compositeDataMap.isEmpty()) {
            close();
        }
        if (compositeDataRemove != null) {
            return compositeDataRemove.dataList;
        }
        return null;
    }

    @Override // io.sentry.CompositePerformanceCollector
    public void start(@NotNull String str) {
        if (this.hasNoCollectors) {
            this.options.getLogger().log(SentryLevel.INFO, "No collector found. Performance stats will not be captured during transactions.", new Object[0]);
            return;
        }
        if (!this.compositeDataMap.containsKey(str)) {
            this.compositeDataMap.put(str, new CompositeData(null));
        }
        if (this.isStarted.getAndSet(true)) {
            return;
        }
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.timerLock.acquire();
        try {
            if (this.timer == null) {
                this.timer = new Timer(true);
            }
            this.timer.schedule(new TimerTask() { // from class: io.sentry.DefaultCompositePerformanceCollector.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    Iterator it = DefaultCompositePerformanceCollector.this.snapshotCollectors.iterator();
                    while (it.hasNext()) {
                        ((IPerformanceSnapshotCollector) it.next()).setup();
                    }
                }
            }, 0L);
            final ArrayList arrayList = new ArrayList();
            this.timer.scheduleAtFixedRate(new TimerTask() { // from class: io.sentry.DefaultCompositePerformanceCollector.2
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - DefaultCompositePerformanceCollector.this.lastCollectionTimestamp <= 10) {
                        return;
                    }
                    arrayList.clear();
                    DefaultCompositePerformanceCollector.this.lastCollectionTimestamp = jCurrentTimeMillis;
                    PerformanceCollectionData performanceCollectionData = new PerformanceCollectionData(DefaultCompositePerformanceCollector.this.options.getDateProvider().now().nanoTimestamp());
                    Iterator it = DefaultCompositePerformanceCollector.this.snapshotCollectors.iterator();
                    while (it.hasNext()) {
                        ((IPerformanceSnapshotCollector) it.next()).collect(performanceCollectionData);
                    }
                    for (CompositeData compositeData : DefaultCompositePerformanceCollector.this.compositeDataMap.values()) {
                        if (compositeData.addDataAndCheckTimeout(performanceCollectionData) && compositeData.transaction != null) {
                            arrayList.add(compositeData.transaction);
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        DefaultCompositePerformanceCollector.this.stop((ITransaction) it2.next());
                    }
                }
            }, TRANSACTION_COLLECTION_INTERVAL_MILLIS, TRANSACTION_COLLECTION_INTERVAL_MILLIS);
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
        } finally {
        }
    }
}
