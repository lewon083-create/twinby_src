package com.vk.sdk.api.newsfeed.dto;

import java.util.List;
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
public final class NewsfeedItemFeedbackPollPoll {

    @b("gratitude")
    @NotNull
    private final NewsfeedItemFeedbackPollGratitude gratitude;

    @b("questions")
    @NotNull
    private final List<NewsfeedItemFeedbackPollQuestion> questions;

    @b("title")
    @NotNull
    private final String title;

    public NewsfeedItemFeedbackPollPoll(@NotNull String title, @NotNull NewsfeedItemFeedbackPollGratitude gratitude, @NotNull List<NewsfeedItemFeedbackPollQuestion> questions) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(gratitude, "gratitude");
        Intrinsics.checkNotNullParameter(questions, "questions");
        this.title = title;
        this.gratitude = gratitude;
        this.questions = questions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NewsfeedItemFeedbackPollPoll copy$default(NewsfeedItemFeedbackPollPoll newsfeedItemFeedbackPollPoll, String str, NewsfeedItemFeedbackPollGratitude newsfeedItemFeedbackPollGratitude, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = newsfeedItemFeedbackPollPoll.title;
        }
        if ((i & 2) != 0) {
            newsfeedItemFeedbackPollGratitude = newsfeedItemFeedbackPollPoll.gratitude;
        }
        if ((i & 4) != 0) {
            list = newsfeedItemFeedbackPollPoll.questions;
        }
        return newsfeedItemFeedbackPollPoll.copy(str, newsfeedItemFeedbackPollGratitude, list);
    }

    @NotNull
    public final String component1() {
        return this.title;
    }

    @NotNull
    public final NewsfeedItemFeedbackPollGratitude component2() {
        return this.gratitude;
    }

    @NotNull
    public final List<NewsfeedItemFeedbackPollQuestion> component3() {
        return this.questions;
    }

    @NotNull
    public final NewsfeedItemFeedbackPollPoll copy(@NotNull String title, @NotNull NewsfeedItemFeedbackPollGratitude gratitude, @NotNull List<NewsfeedItemFeedbackPollQuestion> questions) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(gratitude, "gratitude");
        Intrinsics.checkNotNullParameter(questions, "questions");
        return new NewsfeedItemFeedbackPollPoll(title, gratitude, questions);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedItemFeedbackPollPoll)) {
            return false;
        }
        NewsfeedItemFeedbackPollPoll newsfeedItemFeedbackPollPoll = (NewsfeedItemFeedbackPollPoll) obj;
        return Intrinsics.a(this.title, newsfeedItemFeedbackPollPoll.title) && Intrinsics.a(this.gratitude, newsfeedItemFeedbackPollPoll.gratitude) && Intrinsics.a(this.questions, newsfeedItemFeedbackPollPoll.questions);
    }

    @NotNull
    public final NewsfeedItemFeedbackPollGratitude getGratitude() {
        return this.gratitude;
    }

    @NotNull
    public final List<NewsfeedItemFeedbackPollQuestion> getQuestions() {
        return this.questions;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.questions.hashCode() + ((this.gratitude.hashCode() + (this.title.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        NewsfeedItemFeedbackPollGratitude newsfeedItemFeedbackPollGratitude = this.gratitude;
        List<NewsfeedItemFeedbackPollQuestion> list = this.questions;
        StringBuilder sb2 = new StringBuilder("NewsfeedItemFeedbackPollPoll(title=");
        sb2.append(str);
        sb2.append(", gratitude=");
        sb2.append(newsfeedItemFeedbackPollGratitude);
        sb2.append(", questions=");
        return z.h(sb2, list, ")");
    }
}
