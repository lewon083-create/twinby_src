package com.vk.sdk.api.newsfeed.dto;

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
public final class NewsfeedItemDigestHeader {

    @b("button")
    @Nullable
    private final NewsfeedItemDigestButton button;

    @b("style")
    @NotNull
    private final Style style;

    @b("subtitle")
    @Nullable
    private final String subtitle;

    @b("title")
    @NotNull
    private final String title;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public enum Style {
        SINGLELINE("singleline"),
        MULTILINE("multiline");


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

    public NewsfeedItemDigestHeader(@NotNull String title, @NotNull Style style, @Nullable String str, @Nullable NewsfeedItemDigestButton newsfeedItemDigestButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(style, "style");
        this.title = title;
        this.style = style;
        this.subtitle = str;
        this.button = newsfeedItemDigestButton;
    }

    public static /* synthetic */ NewsfeedItemDigestHeader copy$default(NewsfeedItemDigestHeader newsfeedItemDigestHeader, String str, Style style, String str2, NewsfeedItemDigestButton newsfeedItemDigestButton, int i, Object obj) {
        if ((i & 1) != 0) {
            str = newsfeedItemDigestHeader.title;
        }
        if ((i & 2) != 0) {
            style = newsfeedItemDigestHeader.style;
        }
        if ((i & 4) != 0) {
            str2 = newsfeedItemDigestHeader.subtitle;
        }
        if ((i & 8) != 0) {
            newsfeedItemDigestButton = newsfeedItemDigestHeader.button;
        }
        return newsfeedItemDigestHeader.copy(str, style, str2, newsfeedItemDigestButton);
    }

    @NotNull
    public final String component1() {
        return this.title;
    }

    @NotNull
    public final Style component2() {
        return this.style;
    }

    @Nullable
    public final String component3() {
        return this.subtitle;
    }

    @Nullable
    public final NewsfeedItemDigestButton component4() {
        return this.button;
    }

    @NotNull
    public final NewsfeedItemDigestHeader copy(@NotNull String title, @NotNull Style style, @Nullable String str, @Nullable NewsfeedItemDigestButton newsfeedItemDigestButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(style, "style");
        return new NewsfeedItemDigestHeader(title, style, str, newsfeedItemDigestButton);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedItemDigestHeader)) {
            return false;
        }
        NewsfeedItemDigestHeader newsfeedItemDigestHeader = (NewsfeedItemDigestHeader) obj;
        return Intrinsics.a(this.title, newsfeedItemDigestHeader.title) && this.style == newsfeedItemDigestHeader.style && Intrinsics.a(this.subtitle, newsfeedItemDigestHeader.subtitle) && Intrinsics.a(this.button, newsfeedItemDigestHeader.button);
    }

    @Nullable
    public final NewsfeedItemDigestButton getButton() {
        return this.button;
    }

    @NotNull
    public final Style getStyle() {
        return this.style;
    }

    @Nullable
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = (this.style.hashCode() + (this.title.hashCode() * 31)) * 31;
        String str = this.subtitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        NewsfeedItemDigestButton newsfeedItemDigestButton = this.button;
        return iHashCode2 + (newsfeedItemDigestButton != null ? newsfeedItemDigestButton.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "NewsfeedItemDigestHeader(title=" + this.title + ", style=" + this.style + ", subtitle=" + this.subtitle + ", button=" + this.button + ")";
    }

    public /* synthetic */ NewsfeedItemDigestHeader(String str, Style style, String str2, NewsfeedItemDigestButton newsfeedItemDigestButton, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, style, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : newsfeedItemDigestButton);
    }
}
