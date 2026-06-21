package io.appmetrica.analytics.coreutils.internal.time;

import java.util.concurrent.TimeUnit;
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
public final class SystemTimeOffsetProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SystemTimeProvider f21846a;

    public SystemTimeOffsetProvider(@NotNull SystemTimeProvider systemTimeProvider) {
        this.f21846a = systemTimeProvider;
    }

    public final long elapsedRealtimeOffset(long j10, @NotNull TimeUnit timeUnit) {
        return this.f21846a.elapsedRealtime() - timeUnit.toMillis(j10);
    }

    public final long elapsedRealtimeOffsetInSeconds(long j10, @NotNull TimeUnit timeUnit) {
        return TimeUnit.MILLISECONDS.toSeconds(elapsedRealtimeOffset(j10, timeUnit));
    }

    public final long offsetInSecondsIfNotZero(long j10, @NotNull TimeUnit timeUnit) {
        if (j10 == 0) {
            return 0L;
        }
        return this.f21846a.currentTimeSeconds() - timeUnit.toSeconds(j10);
    }

    public final long systemNanoTimeOffsetInNanos(long j10, @NotNull TimeUnit timeUnit) {
        return this.f21846a.systemNanoTime() - timeUnit.toNanos(j10);
    }

    public final long systemNanoTimeOffsetInSeconds(long j10, @NotNull TimeUnit timeUnit) {
        return TimeUnit.NANOSECONDS.toSeconds(systemNanoTimeOffsetInNanos(j10, timeUnit));
    }

    public SystemTimeOffsetProvider() {
        this(new SystemTimeProvider());
    }
}
