package io.sentry;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class PerformanceCollectionData {
    private final long nanoTimestamp;

    @Nullable
    private Double cpuUsagePercentage = null;

    @Nullable
    private Long usedHeapMemory = null;

    @Nullable
    private Long usedNativeMemory = null;

    public PerformanceCollectionData(long j10) {
        this.nanoTimestamp = j10;
    }

    @Nullable
    public Double getCpuUsagePercentage() {
        return this.cpuUsagePercentage;
    }

    public long getNanoTimestamp() {
        return this.nanoTimestamp;
    }

    @Nullable
    public Long getUsedHeapMemory() {
        return this.usedHeapMemory;
    }

    @Nullable
    public Long getUsedNativeMemory() {
        return this.usedNativeMemory;
    }

    public void setCpuUsagePercentage(@Nullable Double d10) {
        this.cpuUsagePercentage = d10;
    }

    public void setUsedHeapMemory(@Nullable Long l10) {
        this.usedHeapMemory = l10;
    }

    public void setUsedNativeMemory(@Nullable Long l10) {
        this.usedNativeMemory = l10;
    }
}
