package com.vk.sdk.api.base.dto;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ne.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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
public final class BaseCountry {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    private final int f15134id;

    @b("title")
    @NotNull
    private final String title;

    public BaseCountry(int i, @NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f15134id = i;
        this.title = title;
    }

    public static /* synthetic */ BaseCountry copy$default(BaseCountry baseCountry, int i, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = baseCountry.f15134id;
        }
        if ((i10 & 2) != 0) {
            str = baseCountry.title;
        }
        return baseCountry.copy(i, str);
    }

    public final int component1() {
        return this.f15134id;
    }

    @NotNull
    public final String component2() {
        return this.title;
    }

    @NotNull
    public final BaseCountry copy(int i, @NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new BaseCountry(i, title);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseCountry)) {
            return false;
        }
        BaseCountry baseCountry = (BaseCountry) obj;
        return this.f15134id == baseCountry.f15134id && Intrinsics.a(this.title, baseCountry.title);
    }

    public final int getId() {
        return this.f15134id;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.title.hashCode() + (Integer.hashCode(this.f15134id) * 31);
    }

    @NotNull
    public String toString() {
        return "BaseCountry(id=" + this.f15134id + ", title=" + this.title + ")";
    }
}
