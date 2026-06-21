package com.vk.sdk.api.classifieds.dto;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ne.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.a;

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
public final class ClassifiedsYoulaItemOnClickOptions {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @b("w")
    @NotNull
    private final String f15155w;

    public ClassifiedsYoulaItemOnClickOptions(@NotNull String w10) {
        Intrinsics.checkNotNullParameter(w10, "w");
        this.f15155w = w10;
    }

    public static /* synthetic */ ClassifiedsYoulaItemOnClickOptions copy$default(ClassifiedsYoulaItemOnClickOptions classifiedsYoulaItemOnClickOptions, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = classifiedsYoulaItemOnClickOptions.f15155w;
        }
        return classifiedsYoulaItemOnClickOptions.copy(str);
    }

    @NotNull
    public final String component1() {
        return this.f15155w;
    }

    @NotNull
    public final ClassifiedsYoulaItemOnClickOptions copy(@NotNull String w10) {
        Intrinsics.checkNotNullParameter(w10, "w");
        return new ClassifiedsYoulaItemOnClickOptions(w10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClassifiedsYoulaItemOnClickOptions) && Intrinsics.a(this.f15155w, ((ClassifiedsYoulaItemOnClickOptions) obj).f15155w);
    }

    @NotNull
    public final String getW() {
        return this.f15155w;
    }

    public int hashCode() {
        return this.f15155w.hashCode();
    }

    @NotNull
    public String toString() {
        return a.f("ClassifiedsYoulaItemOnClickOptions(w=", this.f15155w, ")");
    }
}
