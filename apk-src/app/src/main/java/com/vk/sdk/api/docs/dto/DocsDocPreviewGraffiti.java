package com.vk.sdk.api.docs.dto;

import a0.u;
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
public final class DocsDocPreviewGraffiti {

    @b("height")
    private final int height;

    @b("src")
    @NotNull
    private final String src;

    @b("width")
    private final int width;

    public DocsDocPreviewGraffiti(@NotNull String src, int i, int i10) {
        Intrinsics.checkNotNullParameter(src, "src");
        this.src = src;
        this.width = i;
        this.height = i10;
    }

    public static /* synthetic */ DocsDocPreviewGraffiti copy$default(DocsDocPreviewGraffiti docsDocPreviewGraffiti, String str, int i, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = docsDocPreviewGraffiti.src;
        }
        if ((i11 & 2) != 0) {
            i = docsDocPreviewGraffiti.width;
        }
        if ((i11 & 4) != 0) {
            i10 = docsDocPreviewGraffiti.height;
        }
        return docsDocPreviewGraffiti.copy(str, i, i10);
    }

    @NotNull
    public final String component1() {
        return this.src;
    }

    public final int component2() {
        return this.width;
    }

    public final int component3() {
        return this.height;
    }

    @NotNull
    public final DocsDocPreviewGraffiti copy(@NotNull String src, int i, int i10) {
        Intrinsics.checkNotNullParameter(src, "src");
        return new DocsDocPreviewGraffiti(src, i, i10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocsDocPreviewGraffiti)) {
            return false;
        }
        DocsDocPreviewGraffiti docsDocPreviewGraffiti = (DocsDocPreviewGraffiti) obj;
        return Intrinsics.a(this.src, docsDocPreviewGraffiti.src) && this.width == docsDocPreviewGraffiti.width && this.height == docsDocPreviewGraffiti.height;
    }

    public final int getHeight() {
        return this.height;
    }

    @NotNull
    public final String getSrc() {
        return this.src;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Integer.hashCode(this.height) + u.g(this.width, this.src.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.src;
        int i = this.width;
        int i10 = this.height;
        StringBuilder sb2 = new StringBuilder("DocsDocPreviewGraffiti(src=");
        sb2.append(str);
        sb2.append(", width=");
        sb2.append(i);
        sb2.append(", height=");
        return z.d(i10, ")", sb2);
    }
}
