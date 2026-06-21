package io.sentry.android.core.internal.util;

import io.sentry.transport.ICurrentDateProvider;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class Debouncer {

    @NotNull
    private final AtomicInteger executions = new AtomicInteger(0);

    @NotNull
    private final AtomicLong lastExecutionTime = new AtomicLong(0);
    private final int maxExecutions;

    @NotNull
    private final ICurrentDateProvider timeProvider;
    private final long waitTimeMs;

    public Debouncer(@NotNull ICurrentDateProvider iCurrentDateProvider, long j10, int i) {
        this.timeProvider = iCurrentDateProvider;
        this.waitTimeMs = j10;
        this.maxExecutions = i <= 0 ? 1 : i;
    }

    public boolean checkForDebounce() {
        long currentTimeMillis = this.timeProvider.getCurrentTimeMillis();
        if (this.lastExecutionTime.get() == 0 || this.lastExecutionTime.get() + this.waitTimeMs <= currentTimeMillis) {
            this.executions.set(0);
            this.lastExecutionTime.set(currentTimeMillis);
            return false;
        }
        if (this.executions.incrementAndGet() < this.maxExecutions) {
            return false;
        }
        this.executions.set(0);
        return true;
    }
}
