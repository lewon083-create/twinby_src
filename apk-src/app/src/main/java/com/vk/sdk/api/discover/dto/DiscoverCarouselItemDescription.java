package com.vk.sdk.api.discover.dto;

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
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class DiscoverCarouselItemDescription {

    @b("text")
    @Nullable
    private final String text;

    @b("type")
    @Nullable
    private final DiscoverCarouselItemDescriptionType type;

    public DiscoverCarouselItemDescription() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DiscoverCarouselItemDescription copy$default(DiscoverCarouselItemDescription discoverCarouselItemDescription, String str, DiscoverCarouselItemDescriptionType discoverCarouselItemDescriptionType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = discoverCarouselItemDescription.text;
        }
        if ((i & 2) != 0) {
            discoverCarouselItemDescriptionType = discoverCarouselItemDescription.type;
        }
        return discoverCarouselItemDescription.copy(str, discoverCarouselItemDescriptionType);
    }

    @Nullable
    public final String component1() {
        return this.text;
    }

    @Nullable
    public final DiscoverCarouselItemDescriptionType component2() {
        return this.type;
    }

    @NotNull
    public final DiscoverCarouselItemDescription copy(@Nullable String str, @Nullable DiscoverCarouselItemDescriptionType discoverCarouselItemDescriptionType) {
        return new DiscoverCarouselItemDescription(str, discoverCarouselItemDescriptionType);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscoverCarouselItemDescription)) {
            return false;
        }
        DiscoverCarouselItemDescription discoverCarouselItemDescription = (DiscoverCarouselItemDescription) obj;
        return Intrinsics.a(this.text, discoverCarouselItemDescription.text) && this.type == discoverCarouselItemDescription.type;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final DiscoverCarouselItemDescriptionType getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        DiscoverCarouselItemDescriptionType discoverCarouselItemDescriptionType = this.type;
        return iHashCode + (discoverCarouselItemDescriptionType != null ? discoverCarouselItemDescriptionType.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DiscoverCarouselItemDescription(text=" + this.text + ", type=" + this.type + ")";
    }

    public DiscoverCarouselItemDescription(@Nullable String str, @Nullable DiscoverCarouselItemDescriptionType discoverCarouselItemDescriptionType) {
        this.text = str;
        this.type = discoverCarouselItemDescriptionType;
    }

    public /* synthetic */ DiscoverCarouselItemDescription(String str, DiscoverCarouselItemDescriptionType discoverCarouselItemDescriptionType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : discoverCarouselItemDescriptionType);
    }
}
