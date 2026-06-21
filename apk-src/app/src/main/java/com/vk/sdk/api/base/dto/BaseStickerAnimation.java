package com.vk.sdk.api.base.dto;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class BaseStickerAnimation {

    @b("type")
    @Nullable
    private final Type type;

    @b("url")
    @Nullable
    private final String url;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public enum Type {
        LIGHT("light"),
        DARK("dark");


        @NotNull
        private final String value;

        Type(String str) {
            this.value = str;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    public BaseStickerAnimation() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BaseStickerAnimation copy$default(BaseStickerAnimation baseStickerAnimation, Type type, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            type = baseStickerAnimation.type;
        }
        if ((i & 2) != 0) {
            str = baseStickerAnimation.url;
        }
        return baseStickerAnimation.copy(type, str);
    }

    @Nullable
    public final Type component1() {
        return this.type;
    }

    @Nullable
    public final String component2() {
        return this.url;
    }

    @NotNull
    public final BaseStickerAnimation copy(@Nullable Type type, @Nullable String str) {
        return new BaseStickerAnimation(type, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseStickerAnimation)) {
            return false;
        }
        BaseStickerAnimation baseStickerAnimation = (BaseStickerAnimation) obj;
        return this.type == baseStickerAnimation.type && Intrinsics.a(this.url, baseStickerAnimation.url);
    }

    @Nullable
    public final Type getType() {
        return this.type;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        Type type = this.type;
        int iHashCode = (type == null ? 0 : type.hashCode()) * 31;
        String str = this.url;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BaseStickerAnimation(type=" + this.type + ", url=" + this.url + ")";
    }

    public BaseStickerAnimation(@Nullable Type type, @Nullable String str) {
        this.type = type;
        this.url = str;
    }

    public /* synthetic */ BaseStickerAnimation(Type type, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : type, (i & 2) != 0 ? null : str);
    }
}
