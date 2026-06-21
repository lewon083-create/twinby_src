package com.vk.sdk.api.photos.dto;

import com.vk.sdk.api.base.dto.BaseLinkButton;
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
public final class PhotosTagsSuggestionItemEndCard {

    @b("button")
    @Nullable
    private final BaseLinkButton button;

    @b("subtitle")
    @Nullable
    private final String subtitle;

    public PhotosTagsSuggestionItemEndCard() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PhotosTagsSuggestionItemEndCard copy$default(PhotosTagsSuggestionItemEndCard photosTagsSuggestionItemEndCard, String str, BaseLinkButton baseLinkButton, int i, Object obj) {
        if ((i & 1) != 0) {
            str = photosTagsSuggestionItemEndCard.subtitle;
        }
        if ((i & 2) != 0) {
            baseLinkButton = photosTagsSuggestionItemEndCard.button;
        }
        return photosTagsSuggestionItemEndCard.copy(str, baseLinkButton);
    }

    @Nullable
    public final String component1() {
        return this.subtitle;
    }

    @Nullable
    public final BaseLinkButton component2() {
        return this.button;
    }

    @NotNull
    public final PhotosTagsSuggestionItemEndCard copy(@Nullable String str, @Nullable BaseLinkButton baseLinkButton) {
        return new PhotosTagsSuggestionItemEndCard(str, baseLinkButton);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosTagsSuggestionItemEndCard)) {
            return false;
        }
        PhotosTagsSuggestionItemEndCard photosTagsSuggestionItemEndCard = (PhotosTagsSuggestionItemEndCard) obj;
        return Intrinsics.a(this.subtitle, photosTagsSuggestionItemEndCard.subtitle) && Intrinsics.a(this.button, photosTagsSuggestionItemEndCard.button);
    }

    @Nullable
    public final BaseLinkButton getButton() {
        return this.button;
    }

    @Nullable
    public final String getSubtitle() {
        return this.subtitle;
    }

    public int hashCode() {
        String str = this.subtitle;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        BaseLinkButton baseLinkButton = this.button;
        return iHashCode + (baseLinkButton != null ? baseLinkButton.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PhotosTagsSuggestionItemEndCard(subtitle=" + this.subtitle + ", button=" + this.button + ")";
    }

    public PhotosTagsSuggestionItemEndCard(@Nullable String str, @Nullable BaseLinkButton baseLinkButton) {
        this.subtitle = str;
        this.button = baseLinkButton;
    }

    public /* synthetic */ PhotosTagsSuggestionItemEndCard(String str, BaseLinkButton baseLinkButton, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : baseLinkButton);
    }
}
