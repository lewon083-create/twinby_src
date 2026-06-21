package com.vk.sdk.api.newsfeed.dto;

import gf.a;
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
public final class NewsfeedItemDigestFooter {

    @b("button")
    @Nullable
    private final NewsfeedItemDigestButton button;

    @b("style")
    @NotNull
    private final Style style;

    @b("text")
    @NotNull
    private final String text;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public enum Style {
        TEXT("text"),
        BUTTON("button");


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

    public NewsfeedItemDigestFooter(@NotNull Style style, @NotNull String text, @Nullable NewsfeedItemDigestButton newsfeedItemDigestButton) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(text, "text");
        this.style = style;
        this.text = text;
        this.button = newsfeedItemDigestButton;
    }

    public static /* synthetic */ NewsfeedItemDigestFooter copy$default(NewsfeedItemDigestFooter newsfeedItemDigestFooter, Style style, String str, NewsfeedItemDigestButton newsfeedItemDigestButton, int i, Object obj) {
        if ((i & 1) != 0) {
            style = newsfeedItemDigestFooter.style;
        }
        if ((i & 2) != 0) {
            str = newsfeedItemDigestFooter.text;
        }
        if ((i & 4) != 0) {
            newsfeedItemDigestButton = newsfeedItemDigestFooter.button;
        }
        return newsfeedItemDigestFooter.copy(style, str, newsfeedItemDigestButton);
    }

    @NotNull
    public final Style component1() {
        return this.style;
    }

    @NotNull
    public final String component2() {
        return this.text;
    }

    @Nullable
    public final NewsfeedItemDigestButton component3() {
        return this.button;
    }

    @NotNull
    public final NewsfeedItemDigestFooter copy(@NotNull Style style, @NotNull String text, @Nullable NewsfeedItemDigestButton newsfeedItemDigestButton) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(text, "text");
        return new NewsfeedItemDigestFooter(style, text, newsfeedItemDigestButton);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedItemDigestFooter)) {
            return false;
        }
        NewsfeedItemDigestFooter newsfeedItemDigestFooter = (NewsfeedItemDigestFooter) obj;
        return this.style == newsfeedItemDigestFooter.style && Intrinsics.a(this.text, newsfeedItemDigestFooter.text) && Intrinsics.a(this.button, newsfeedItemDigestFooter.button);
    }

    @Nullable
    public final NewsfeedItemDigestButton getButton() {
        return this.button;
    }

    @NotNull
    public final Style getStyle() {
        return this.style;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iE = a.e(this.style.hashCode() * 31, 31, this.text);
        NewsfeedItemDigestButton newsfeedItemDigestButton = this.button;
        return iE + (newsfeedItemDigestButton == null ? 0 : newsfeedItemDigestButton.hashCode());
    }

    @NotNull
    public String toString() {
        return "NewsfeedItemDigestFooter(style=" + this.style + ", text=" + this.text + ", button=" + this.button + ")";
    }

    public /* synthetic */ NewsfeedItemDigestFooter(Style style, String str, NewsfeedItemDigestButton newsfeedItemDigestButton, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(style, str, (i & 4) != 0 ? null : newsfeedItemDigestButton);
    }
}
