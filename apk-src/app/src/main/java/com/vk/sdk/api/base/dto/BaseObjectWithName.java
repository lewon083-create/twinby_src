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
public final class BaseObjectWithName {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    private final int f15147id;

    @b("name")
    @NotNull
    private final String name;

    public BaseObjectWithName(int i, @NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f15147id = i;
        this.name = name;
    }

    public static /* synthetic */ BaseObjectWithName copy$default(BaseObjectWithName baseObjectWithName, int i, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = baseObjectWithName.f15147id;
        }
        if ((i10 & 2) != 0) {
            str = baseObjectWithName.name;
        }
        return baseObjectWithName.copy(i, str);
    }

    public final int component1() {
        return this.f15147id;
    }

    @NotNull
    public final String component2() {
        return this.name;
    }

    @NotNull
    public final BaseObjectWithName copy(int i, @NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new BaseObjectWithName(i, name);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseObjectWithName)) {
            return false;
        }
        BaseObjectWithName baseObjectWithName = (BaseObjectWithName) obj;
        return this.f15147id == baseObjectWithName.f15147id && Intrinsics.a(this.name, baseObjectWithName.name);
    }

    public final int getId() {
        return this.f15147id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode() + (Integer.hashCode(this.f15147id) * 31);
    }

    @NotNull
    public String toString() {
        return "BaseObjectWithName(id=" + this.f15147id + ", name=" + this.name + ")";
    }
}
