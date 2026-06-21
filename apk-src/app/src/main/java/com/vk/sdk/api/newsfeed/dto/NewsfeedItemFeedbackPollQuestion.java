package com.vk.sdk.api.newsfeed.dto;

import a0.u;
import gf.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
public final class NewsfeedItemFeedbackPollQuestion {

    @b("answers")
    @NotNull
    private final List<NewsfeedItemFeedbackPollQuestionAnswer> answers;

    @b("button_text")
    @Nullable
    private final String buttonText;

    @b("entries")
    @NotNull
    private final List<NewsfeedItemFeedbackPollQuestionEntry> entries;

    @b("next_button_text")
    @NotNull
    private final String nextButtonText;

    @b("text")
    @NotNull
    private final String text;

    public NewsfeedItemFeedbackPollQuestion(@NotNull String text, @NotNull String nextButtonText, @NotNull List<NewsfeedItemFeedbackPollQuestionAnswer> answers, @NotNull List<NewsfeedItemFeedbackPollQuestionEntry> entries, @Nullable String str) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(nextButtonText, "nextButtonText");
        Intrinsics.checkNotNullParameter(answers, "answers");
        Intrinsics.checkNotNullParameter(entries, "entries");
        this.text = text;
        this.nextButtonText = nextButtonText;
        this.answers = answers;
        this.entries = entries;
        this.buttonText = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NewsfeedItemFeedbackPollQuestion copy$default(NewsfeedItemFeedbackPollQuestion newsfeedItemFeedbackPollQuestion, String str, String str2, List list, List list2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = newsfeedItemFeedbackPollQuestion.text;
        }
        if ((i & 2) != 0) {
            str2 = newsfeedItemFeedbackPollQuestion.nextButtonText;
        }
        if ((i & 4) != 0) {
            list = newsfeedItemFeedbackPollQuestion.answers;
        }
        if ((i & 8) != 0) {
            list2 = newsfeedItemFeedbackPollQuestion.entries;
        }
        if ((i & 16) != 0) {
            str3 = newsfeedItemFeedbackPollQuestion.buttonText;
        }
        String str4 = str3;
        List list3 = list;
        return newsfeedItemFeedbackPollQuestion.copy(str, str2, list3, list2, str4);
    }

    @NotNull
    public final String component1() {
        return this.text;
    }

    @NotNull
    public final String component2() {
        return this.nextButtonText;
    }

    @NotNull
    public final List<NewsfeedItemFeedbackPollQuestionAnswer> component3() {
        return this.answers;
    }

    @NotNull
    public final List<NewsfeedItemFeedbackPollQuestionEntry> component4() {
        return this.entries;
    }

    @Nullable
    public final String component5() {
        return this.buttonText;
    }

    @NotNull
    public final NewsfeedItemFeedbackPollQuestion copy(@NotNull String text, @NotNull String nextButtonText, @NotNull List<NewsfeedItemFeedbackPollQuestionAnswer> answers, @NotNull List<NewsfeedItemFeedbackPollQuestionEntry> entries, @Nullable String str) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(nextButtonText, "nextButtonText");
        Intrinsics.checkNotNullParameter(answers, "answers");
        Intrinsics.checkNotNullParameter(entries, "entries");
        return new NewsfeedItemFeedbackPollQuestion(text, nextButtonText, answers, entries, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedItemFeedbackPollQuestion)) {
            return false;
        }
        NewsfeedItemFeedbackPollQuestion newsfeedItemFeedbackPollQuestion = (NewsfeedItemFeedbackPollQuestion) obj;
        return Intrinsics.a(this.text, newsfeedItemFeedbackPollQuestion.text) && Intrinsics.a(this.nextButtonText, newsfeedItemFeedbackPollQuestion.nextButtonText) && Intrinsics.a(this.answers, newsfeedItemFeedbackPollQuestion.answers) && Intrinsics.a(this.entries, newsfeedItemFeedbackPollQuestion.entries) && Intrinsics.a(this.buttonText, newsfeedItemFeedbackPollQuestion.buttonText);
    }

    @NotNull
    public final List<NewsfeedItemFeedbackPollQuestionAnswer> getAnswers() {
        return this.answers;
    }

    @Nullable
    public final String getButtonText() {
        return this.buttonText;
    }

    @NotNull
    public final List<NewsfeedItemFeedbackPollQuestionEntry> getEntries() {
        return this.entries;
    }

    @NotNull
    public final String getNextButtonText() {
        return this.nextButtonText;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int i = u.i(this.entries, u.i(this.answers, a.e(this.text.hashCode() * 31, 31, this.nextButtonText), 31), 31);
        String str = this.buttonText;
        return i + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.text;
        String str2 = this.nextButtonText;
        List<NewsfeedItemFeedbackPollQuestionAnswer> list = this.answers;
        List<NewsfeedItemFeedbackPollQuestionEntry> list2 = this.entries;
        String str3 = this.buttonText;
        StringBuilder sbJ = z.j("NewsfeedItemFeedbackPollQuestion(text=", str, ", nextButtonText=", str2, ", answers=");
        a.u(sbJ, list, ", entries=", list2, ", buttonText=");
        return u.o(sbJ, str3, ")");
    }

    public /* synthetic */ NewsfeedItemFeedbackPollQuestion(String str, String str2, List list, List list2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, list, list2, (i & 16) != 0 ? null : str3);
    }
}
