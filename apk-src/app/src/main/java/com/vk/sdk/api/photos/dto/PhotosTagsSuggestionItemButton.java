package com.vk.sdk.api.photos.dto;

import com.vk.api.sdk.exceptions.VKApiCodes;
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
public final class PhotosTagsSuggestionItemButton {

    @b("action")
    @Nullable
    private final Action action;

    @b("style")
    @Nullable
    private final Style style;

    @b("title")
    @Nullable
    private final String title;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public enum Action {
        CONFIRM(VKApiCodes.EXTRA_CONFIRM),
        DECLINE("decline"),
        SHOW_TAGS("show_tags");


        @NotNull
        private final String value;

        Action(String str) {
            this.value = str;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public enum Style {
        PRIMARY("primary"),
        SECONDARY("secondary");


        @NotNull
        private final String value;

        Style(String str) {
            this.value = str;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    public PhotosTagsSuggestionItemButton() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ PhotosTagsSuggestionItemButton copy$default(PhotosTagsSuggestionItemButton photosTagsSuggestionItemButton, String str, Action action, Style style, int i, Object obj) {
        if ((i & 1) != 0) {
            str = photosTagsSuggestionItemButton.title;
        }
        if ((i & 2) != 0) {
            action = photosTagsSuggestionItemButton.action;
        }
        if ((i & 4) != 0) {
            style = photosTagsSuggestionItemButton.style;
        }
        return photosTagsSuggestionItemButton.copy(str, action, style);
    }

    @Nullable
    public final String component1() {
        return this.title;
    }

    @Nullable
    public final Action component2() {
        return this.action;
    }

    @Nullable
    public final Style component3() {
        return this.style;
    }

    @NotNull
    public final PhotosTagsSuggestionItemButton copy(@Nullable String str, @Nullable Action action, @Nullable Style style) {
        return new PhotosTagsSuggestionItemButton(str, action, style);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosTagsSuggestionItemButton)) {
            return false;
        }
        PhotosTagsSuggestionItemButton photosTagsSuggestionItemButton = (PhotosTagsSuggestionItemButton) obj;
        return Intrinsics.a(this.title, photosTagsSuggestionItemButton.title) && this.action == photosTagsSuggestionItemButton.action && this.style == photosTagsSuggestionItemButton.style;
    }

    @Nullable
    public final Action getAction() {
        return this.action;
    }

    @Nullable
    public final Style getStyle() {
        return this.style;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Action action = this.action;
        int iHashCode2 = (iHashCode + (action == null ? 0 : action.hashCode())) * 31;
        Style style = this.style;
        return iHashCode2 + (style != null ? style.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PhotosTagsSuggestionItemButton(title=" + this.title + ", action=" + this.action + ", style=" + this.style + ")";
    }

    public PhotosTagsSuggestionItemButton(@Nullable String str, @Nullable Action action, @Nullable Style style) {
        this.title = str;
        this.action = action;
        this.style = style;
    }

    public /* synthetic */ PhotosTagsSuggestionItemButton(String str, Action action, Style style, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : action, (i & 4) != 0 ? null : style);
    }
}
