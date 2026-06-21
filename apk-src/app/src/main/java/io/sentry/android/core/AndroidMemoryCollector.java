package io.sentry.android.core;

import android.os.Debug;
import io.sentry.IPerformanceSnapshotCollector;
import io.sentry.PerformanceCollectionData;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class AndroidMemoryCollector implements IPerformanceSnapshotCollector {
    @Override // io.sentry.IPerformanceSnapshotCollector
    public void collect(@NotNull PerformanceCollectionData performanceCollectionData) {
        long jFreeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long nativeHeapSize = Debug.getNativeHeapSize() - Debug.getNativeHeapFreeSize();
        performanceCollectionData.setUsedHeapMemory(Long.valueOf(jFreeMemory));
        performanceCollectionData.setUsedNativeMemory(Long.valueOf(nativeHeapSize));
    }

    @Override // io.sentry.IPerformanceSnapshotCollector
    public void setup() {
    }
}
