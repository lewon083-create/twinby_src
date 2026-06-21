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
public final class NewsfeedItemDigestButton {

    @b("style")
    @Nullable
    private final Style style;

    @b("title")
    @NotNull
    private final String title;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public enum Style {
        PRIMARY("primary");


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

    public NewsfeedItemDigestButton(@NotNull String title, @Nullable Style style) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.style = style;
    }

    public static /* synthetic */ NewsfeedItemDigestButton copy$default(NewsfeedItemDigestButton newsfeedItemDigestButton, String str, Style style, int i, Object obj) {
        if ((i & 1) != 0) {
            str = newsfeedItemDigestButton.title;
        }
        if ((i & 2) != 0) {
            style = newsfeedItemDigestButton.style;
        }
        return newsfeedItemDigestButton.copy(str, style);
    }

    @NotNull
    public final String component1() {
        return this.title;
    }

    @Nullable
    public final Style component2() {
        return this.style;
    }

    @NotNull
    public final NewsfeedItemDigestButton copy(@NotNull String title, @Nullable Style style) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new NewsfeedItemDigestButton(title, style);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedItemDigestButton)) {
            return false;
        }
        NewsfeedItemDigestButton newsfeedItemDigestButton = (NewsfeedItemDigestButton) obj;
        return Intrinsics.a(this.title, newsfeedItemDigestButton.title) && this.style == newsfeedItemDigestButton.style;
    }

    @Nullable
    public final Style getStyle() {
        return this.style;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        Style style = this.style;
        return iHashCode + (style == null ? 0 : style.hashCode());
    }

    @NotNull
    public String toString() {
        return "NewsfeedItemDigestButton(title=" + this.title + ", style=" + this.style + ")";
    }

    public /* synthetic */ NewsfeedItemDigestButton(String str, Style style, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : style);
    }
}
