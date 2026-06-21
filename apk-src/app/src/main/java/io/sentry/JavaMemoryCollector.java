package io.sentry;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class JavaMemoryCollector implements IPerformanceSnapshotCollector {

    @NotNull
    private final Runtime runtime = Runtime.getRuntime();

    @Override // io.sentry.IPerformanceSnapshotCollector
    public void collect(@NotNull PerformanceCollectionData performanceCollectionData) {
        performanceCollectionData.setUsedHeapMemory(Long.valueOf(this.runtime.totalMemory() - this.runtime.freeMemory()));
    }

    @Override // io.sentry.IPerformanceSnapshotCollector
    public void setup() {
    }
}
