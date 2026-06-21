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
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class NewsfeedItemFeedbackPollQuestionEntry {

    @b("item")
    @NotNull
    private final NewsfeedNewsfeedItem item;

    @b("title")
    @Nullable
    private final String title;

    public NewsfeedItemFeedbackPollQuestionEntry(@NotNull NewsfeedNewsfeedItem item, @Nullable String str) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.item = item;
        this.title = str;
    }

    public static /* synthetic */ NewsfeedItemFeedbackPollQuestionEntry copy$default(NewsfeedItemFeedbackPollQuestionEntry newsfeedItemFeedbackPollQuestionEntry, NewsfeedNewsfeedItem newsfeedNewsfeedItem, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            newsfeedNewsfeedItem = newsfeedItemFeedbackPollQuestionEntry.item;
        }
        if ((i & 2) != 0) {
            str = newsfeedItemFeedbackPollQuestionEntry.title;
        }
        return newsfeedItemFeedbackPollQuestionEntry.copy(newsfeedNewsfeedItem, str);
    }

    @NotNull
    public final NewsfeedNewsfeedItem component1() {
        return this.item;
    }

    @Nullable
    public final String component2() {
        return this.title;
    }

    @NotNull
    public final NewsfeedItemFeedbackPollQuestionEntry copy(@NotNull NewsfeedNewsfeedItem item, @Nullable String str) {
        Intrinsics.checkNotNullParameter(item, "item");
        return new NewsfeedItemFeedbackPollQuestionEntry(item, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedItemFeedbackPollQuestionEntry)) {
            return false;
        }
        NewsfeedItemFeedbackPollQuestionEntry newsfeedItemFeedbackPollQuestionEntry = (NewsfeedItemFeedbackPollQuestionEntry) obj;
        return Intrinsics.a(this.item, newsfeedItemFeedbackPollQuestionEntry.item) && Intrinsics.a(this.title, newsfeedItemFeedbackPollQuestionEntry.title);
    }

    @NotNull
    public final NewsfeedNewsfeedItem getItem() {
        return this.item;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.item.hashCode() * 31;
        String str = this.title;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "NewsfeedItemFeedbackPollQuestionEntry(item=" + this.item + ", title=" + this.title + ")";
    }

    public /* synthetic */ NewsfeedItemFeedbackPollQuestionEntry(NewsfeedNewsfeedItem newsfeedNewsfeedItem, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(newsfeedNewsfeedItem, (i & 2) != 0 ? null : str);
    }
}
