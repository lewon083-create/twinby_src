package com.yandex.varioqub.analyticadapter.data;

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
public final class ConfigData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f15317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f15318c;

    public ConfigData(@NotNull String str, @NotNull String str2, long j10) {
        this.f15316a = str;
        this.f15317b = str2;
        this.f15318c = j10;
    }

    public final long getConfigLoadTimestamp() {
        return this.f15318c;
    }

    @NotNull
    public final String getNewConfigVersion() {
        return this.f15317b;
    }

    @NotNull
    public final String getOldConfigVersion() {
        return this.f15316a;
    }
}
