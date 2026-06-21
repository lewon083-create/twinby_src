package com.vk.sdk.api.docs.dto;

import gf.a;
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
public final class DocsDocTypes {

    @b("count")
    private final int count;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    private final int f15165id;

    @b("name")
    @NotNull
    private final String name;

    public DocsDocTypes(int i, @NotNull String name, int i10) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f15165id = i;
        this.name = name;
        this.count = i10;
    }

    public static /* synthetic */ DocsDocTypes copy$default(DocsDocTypes docsDocTypes, int i, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i = docsDocTypes.f15165id;
        }
        if ((i11 & 2) != 0) {
            str = docsDocTypes.name;
        }
        if ((i11 & 4) != 0) {
            i10 = docsDocTypes.count;
        }
        return docsDocTypes.copy(i, str, i10);
    }

    public final int component1() {
        return this.f15165id;
    }

    @NotNull
    public final String component2() {
        return this.name;
    }

    public final int component3() {
        return this.count;
    }

    @NotNull
    public final DocsDocTypes copy(int i, @NotNull String name, int i10) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new DocsDocTypes(i, name, i10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocsDocTypes)) {
            return false;
        }
        DocsDocTypes docsDocTypes = (DocsDocTypes) obj;
        return this.f15165id == docsDocTypes.f15165id && Intrinsics.a(this.name, docsDocTypes.name) && this.count == docsDocTypes.count;
    }

    public final int getCount() {
        return this.count;
    }

    public final int getId() {
        return this.f15165id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return Integer.hashCode(this.count) + a.e(Integer.hashCode(this.f15165id) * 31, 31, this.name);
    }

    @NotNull
    public String toString() {
        return z.d(this.count, ")", pe.a.i(this.f15165id, "DocsDocTypes(id=", ", name=", this.name, ", count="));
    }
}
