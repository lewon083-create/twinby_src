package com.vk.sdk.api.newsfeed.dto;

import a0.u;
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
public final class NewsfeedItemFeedbackPollBanner {

    @b("button_text")
    @NotNull
    private final String buttonText;

    @b("subtitle")
    @NotNull
    private final String subtitle;

    @b("title")
    @NotNull
    private final String title;

    public NewsfeedItemFeedbackPollBanner(@NotNull String title, @NotNull String subtitle, @NotNull String buttonText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        this.title = title;
        this.subtitle = subtitle;
        this.buttonText = buttonText;
    }

    public static /* synthetic */ NewsfeedItemFeedbackPollBanner copy$default(NewsfeedItemFeedbackPollBanner newsfeedItemFeedbackPollBanner, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = newsfeedItemFeedbackPollBanner.title;
        }
        if ((i & 2) != 0) {
            str2 = newsfeedItemFeedbackPollBanner.subtitle;
        }
        if ((i & 4) != 0) {
            str3 = newsfeedItemFeedbackPollBanner.buttonText;
        }
        return newsfeedItemFeedbackPollBanner.copy(str, str2, str3);
    }

    @NotNull
    public final String component1() {
        return this.title;
    }

    @NotNull
    public final String component2() {
        return this.subtitle;
    }

    @NotNull
    public final String component3() {
        return this.buttonText;
    }

    @NotNull
    public final NewsfeedItemFeedbackPollBanner copy(@NotNull String title, @NotNull String subtitle, @NotNull String buttonText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        return new NewsfeedItemFeedbackPollBanner(title, subtitle, buttonText);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedItemFeedbackPollBanner)) {
            return false;
        }
        NewsfeedItemFeedbackPollBanner newsfeedItemFeedbackPollBanner = (NewsfeedItemFeedbackPollBanner) obj;
        return Intrinsics.a(this.title, newsfeedItemFeedbackPollBanner.title) && Intrinsics.a(this.subtitle, newsfeedItemFeedbackPollBanner.subtitle) && Intrinsics.a(this.buttonText, newsfeedItemFeedbackPollBanner.buttonText);
    }

    @NotNull
    public final String getButtonText() {
        return this.buttonText;
    }

    @NotNull
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.buttonText.hashCode() + a.e(this.title.hashCode() * 31, 31, this.subtitle);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        return u.o(z.j("NewsfeedItemFeedbackPollBanner(title=", str, ", subtitle=", str2, ", buttonText="), this.buttonText, ")");
    }
}
