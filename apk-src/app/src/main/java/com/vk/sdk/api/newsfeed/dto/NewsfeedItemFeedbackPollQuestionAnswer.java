package com.vk.sdk.api.newsfeed.dto;

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
public final class NewsfeedItemFeedbackPollQuestionAnswer {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    @NotNull
    private final String f15200id;

    @b("title")
    @NotNull
    private final String title;

    public NewsfeedItemFeedbackPollQuestionAnswer(@NotNull String title, @NotNull String id2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(id2, "id");
        this.title = title;
        this.f15200id = id2;
    }

    public static /* synthetic */ NewsfeedItemFeedbackPollQuestionAnswer copy$default(NewsfeedItemFeedbackPollQuestionAnswer newsfeedItemFeedbackPollQuestionAnswer, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = newsfeedItemFeedbackPollQuestionAnswer.title;
        }
        if ((i & 2) != 0) {
            str2 = newsfeedItemFeedbackPollQuestionAnswer.f15200id;
        }
        return newsfeedItemFeedbackPollQuestionAnswer.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.title;
    }

    @NotNull
    public final String component2() {
        return this.f15200id;
    }

    @NotNull
    public final NewsfeedItemFeedbackPollQuestionAnswer copy(@NotNull String title, @NotNull String id2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(id2, "id");
        return new NewsfeedItemFeedbackPollQuestionAnswer(title, id2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedItemFeedbackPollQuestionAnswer)) {
            return false;
        }
        NewsfeedItemFeedbackPollQuestionAnswer newsfeedItemFeedbackPollQuestionAnswer = (NewsfeedItemFeedbackPollQuestionAnswer) obj;
        return Intrinsics.a(this.title, newsfeedItemFeedbackPollQuestionAnswer.title) && Intrinsics.a(this.f15200id, newsfeedItemFeedbackPollQuestionAnswer.f15200id);
    }

    @NotNull
    public final String getId() {
        return this.f15200id;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.f15200id.hashCode() + (this.title.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return z.f("NewsfeedItemFeedbackPollQuestionAnswer(title=", this.title, ", id=", this.f15200id, ")");
    }
}
