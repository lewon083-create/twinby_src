package com.vk.sdk.api.classifieds.dto;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ne.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t.z;

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
public final class ClassifiedsYoulaItemStatusInfo {

    @b("description")
    @NotNull
    private final String description;

    @b("title")
    @NotNull
    private final String title;

    public ClassifiedsYoulaItemStatusInfo(@NotNull String title, @NotNull String description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.title = title;
        this.description = description;
    }

    public static /* synthetic */ ClassifiedsYoulaItemStatusInfo copy$default(ClassifiedsYoulaItemStatusInfo classifiedsYoulaItemStatusInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = classifiedsYoulaItemStatusInfo.title;
        }
        if ((i & 2) != 0) {
            str2 = classifiedsYoulaItemStatusInfo.description;
        }
        return classifiedsYoulaItemStatusInfo.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.title;
    }

    @NotNull
    public final String component2() {
        return this.description;
    }

    @NotNull
    public final ClassifiedsYoulaItemStatusInfo copy(@NotNull String title, @NotNull String description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        return new ClassifiedsYoulaItemStatusInfo(title, description);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassifiedsYoulaItemStatusInfo)) {
            return false;
        }
        ClassifiedsYoulaItemStatusInfo classifiedsYoulaItemStatusInfo = (ClassifiedsYoulaItemStatusInfo) obj;
        return Intrinsics.a(this.title, classifiedsYoulaItemStatusInfo.title) && Intrinsics.a(this.description, classifiedsYoulaItemStatusInfo.description);
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.description.hashCode() + (this.title.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return z.f("ClassifiedsYoulaItemStatusInfo(title=", this.title, ", description=", this.description, ")");
    }
}
