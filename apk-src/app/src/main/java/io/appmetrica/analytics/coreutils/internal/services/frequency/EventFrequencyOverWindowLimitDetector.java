package io.appmetrica.analytics.coreutils.internal.services.frequency;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class EventFrequencyOverWindowLimitDetector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f21836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f21837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EventFrequencyStorage f21838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SystemTimeProvider f21839d = new SystemTimeProvider();

    public EventFrequencyOverWindowLimitDetector(long j10, int i, @NotNull EventFrequencyStorage eventFrequencyStorage) {
        this.f21836a = j10;
        this.f21837b = i;
        this.f21838c = eventFrequencyStorage;
    }

    public final boolean detect(@NotNull String str) {
        long jLongValue;
        long jUptimeMillis = this.f21839d.uptimeMillis();
        EventFrequencyStorage eventFrequencyStorage = this.f21838c;
        Long windowStart = eventFrequencyStorage.getWindowStart(str);
        if (windowStart == null) {
            eventFrequencyStorage.putWindowStart(str, jUptimeMillis);
            jLongValue = jUptimeMillis;
        } else {
            jLongValue = windowStart.longValue();
        }
        long j10 = jUptimeMillis - jLongValue;
        if (j10 < 0 || j10 > this.f21836a) {
            this.f21838c.putWindowStart(str, jUptimeMillis);
            this.f21838c.putWindowOccurrencesCount(str, 1);
            return false;
        }
        Integer windowOccurrencesCount = this.f21838c.getWindowOccurrencesCount(str);
        int iIntValue = (windowOccurrencesCount != null ? windowOccurrencesCount.intValue() : 0) + 1;
        this.f21838c.putWindowOccurrencesCount(str, iIntValue);
        return iIntValue > this.f21837b;
    }

    public final synchronized void updateParameters(long j10, int i) {
        this.f21836a = j10;
        this.f21837b = i;
    }
}
