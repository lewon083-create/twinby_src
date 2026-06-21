package io.sentry.android.core.anr;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class AggregatedStackTrace {
    int count = 1;
    final int depth;
    private long endTimeMs;
    final float quality;
    private final StackTraceElement[] stack;
    private final int stackEndIdx;
    private final int stackStartIdx;
    private long startTimeMs;

    public AggregatedStackTrace(StackTraceElement[] stackTraceElementArr, int i, int i10, long j10, float f10) {
        this.stack = stackTraceElementArr;
        this.stackStartIdx = i;
        this.stackEndIdx = i10;
        this.depth = (i10 - i) + 1;
        this.startTimeMs = j10;
        this.endTimeMs = j10;
        this.quality = f10;
    }

    public void addOccurrence(long j10) {
        this.startTimeMs = Math.min(this.startTimeMs, j10);
        this.endTimeMs = Math.max(this.endTimeMs, j10);
        this.count++;
    }

    @NotNull
    public StackTraceElement[] getStack() {
        return (StackTraceElement[]) Arrays.copyOfRange(this.stack, this.stackStartIdx, this.stackEndIdx + 1);
    }
}
