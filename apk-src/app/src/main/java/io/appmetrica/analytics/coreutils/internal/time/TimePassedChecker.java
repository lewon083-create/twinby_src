package io.appmetrica.analytics.coreutils.internal.time;

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
public final class TimePassedChecker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TimeProvider f21847a;

    public TimePassedChecker(@NotNull TimeProvider timeProvider) {
        this.f21847a = timeProvider;
    }

    public final boolean didTimePassMillis(long j10, long j11, @NotNull String str) {
        long jCurrentTimeMillis = this.f21847a.currentTimeMillis();
        return jCurrentTimeMillis < j10 || jCurrentTimeMillis - j10 >= j11;
    }

    public final boolean didTimePassSeconds(long j10, long j11, @NotNull String str) {
        long jCurrentTimeSeconds = this.f21847a.currentTimeSeconds();
        return jCurrentTimeSeconds < j10 || jCurrentTimeSeconds - j10 >= j11;
    }

    public TimePassedChecker() {
        this(new SystemTimeProvider());
    }
}
