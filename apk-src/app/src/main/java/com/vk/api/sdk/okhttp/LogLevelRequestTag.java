package com.vk.api.sdk.okhttp;

import com.vk.api.sdk.utils.log.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

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
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class LogLevelRequestTag {
    private final Logger.LogLevel level;

    public LogLevelRequestTag(Logger.LogLevel level) {
        Intrinsics.checkNotNullParameter(level, "level");
        this.level = level;
    }

    public static /* synthetic */ LogLevelRequestTag copy$default(LogLevelRequestTag logLevelRequestTag, Logger.LogLevel logLevel, int i, Object obj) {
        if ((i & 1) != 0) {
            logLevel = logLevelRequestTag.level;
        }
        return logLevelRequestTag.copy(logLevel);
    }

    public final Logger.LogLevel component1() {
        return this.level;
    }

    public final LogLevelRequestTag copy(Logger.LogLevel level) {
        Intrinsics.checkNotNullParameter(level, "level");
        return new LogLevelRequestTag(level);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LogLevelRequestTag) && this.level == ((LogLevelRequestTag) obj).level;
    }

    public final Logger.LogLevel getLevel() {
        return this.level;
    }

    public int hashCode() {
        return this.level.hashCode();
    }

    public String toString() {
        return "LogLevelRequestTag(level=" + this.level + ')';
    }
}
