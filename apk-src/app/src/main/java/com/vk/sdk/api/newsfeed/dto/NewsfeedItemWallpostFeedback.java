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
public final class NewsfeedItemWallpostFeedback {

    @b("answers")
    @Nullable
    private final List<NewsfeedItemWallpostFeedbackAnswer> answers;

    @b("gratitude")
    @Nullable
    private final String gratitude;

    @b("question")
    @NotNull
    private final String question;

    @b("stars_count")
    @Nullable
    private final Integer starsCount;

    @b("type")
    @NotNull
    private final NewsfeedItemWallpostFeedbackType type;

    public NewsfeedItemWallpostFeedback(@NotNull NewsfeedItemWallpostFeedbackType type, @NotNull String question, @Nullable List<NewsfeedItemWallpostFeedbackAnswer> list, @Nullable Integer num, @Nullable String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(question, "question");
        this.type = type;
        this.question = question;
        this.answers = list;
        this.starsCount = num;
        this.gratitude = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NewsfeedItemWallpostFeedback copy$default(NewsfeedItemWallpostFeedback newsfeedItemWallpostFeedback, NewsfeedItemWallpostFeedbackType newsfeedItemWallpostFeedbackType, String str, List list, Integer num, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            newsfeedItemWallpostFeedbackType = newsfeedItemWallpostFeedback.type;
        }
        if ((i & 2) != 0) {
            str = newsfeedItemWallpostFeedback.question;
        }
        if ((i & 4) != 0) {
            list = newsfeedItemWallpostFeedback.answers;
        }
        if ((i & 8) != 0) {
            num = newsfeedItemWallpostFeedback.starsCount;
        }
        if ((i & 16) != 0) {
            str2 = newsfeedItemWallpostFeedback.gratitude;
        }
        String str3 = str2;
        List list2 = list;
        return newsfeedItemWallpostFeedback.copy(newsfeedItemWallpostFeedbackType, str, list2, num, str3);
    }

    @NotNull
    public final NewsfeedItemWallpostFeedbackType component1() {
        return this.type;
    }

    @NotNull
    public final String component2() {
        return this.question;
    }

    @Nullable
    public final List<NewsfeedItemWallpostFeedbackAnswer> component3() {
        return this.answers;
    }

    @Nullable
    public final Integer component4() {
        return this.starsCount;
    }

    @Nullable
    public final String component5() {
        return this.gratitude;
    }

    @NotNull
    public final NewsfeedItemWallpostFeedback copy(@NotNull NewsfeedItemWallpostFeedbackType type, @NotNull String question, @Nullable List<NewsfeedItemWallpostFeedbackAnswer> list, @Nullable Integer num, @Nullable String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(question, "question");
        return new NewsfeedItemWallpostFeedback(type, question, list, num, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedItemWallpostFeedback)) {
            return false;
        }
        NewsfeedItemWallpostFeedback newsfeedItemWallpostFeedback = (NewsfeedItemWallpostFeedback) obj;
        return this.type == newsfeedItemWallpostFeedback.type && Intrinsics.a(this.question, newsfeedItemWallpostFeedback.question) && Intrinsics.a(this.answers, newsfeedItemWallpostFeedback.answers) && Intrinsics.a(this.starsCount, newsfeedItemWallpostFeedback.starsCount) && Intrinsics.a(this.gratitude, newsfeedItemWallpostFeedback.gratitude);
    }

    @Nullable
    public final List<NewsfeedItemWallpostFeedbackAnswer> getAnswers() {
        return this.answers;
    }

    @Nullable
    public final String getGratitude() {
        return this.gratitude;
    }

    @NotNull
    public final String getQuestion() {
        return this.question;
    }

    @Nullable
    public final Integer getStarsCount() {
        return this.starsCount;
    }

    @NotNull
    public final NewsfeedItemWallpostFeedbackType getType() {
        return this.type;
    }

    public int hashCode() {
        int iE = a.e(this.type.hashCode() * 31, 31, this.question);
        List<NewsfeedItemWallpostFeedbackAnswer> list = this.answers;
        int iHashCode = (iE + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.starsCount;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.gratitude;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        NewsfeedItemWallpostFeedbackType newsfeedItemWallpostFeedbackType = this.type;
        String str = this.question;
        List<NewsfeedItemWallpostFeedbackAnswer> list = this.answers;
        Integer num = this.starsCount;
        String str2 = this.gratitude;
        StringBuilder sb2 = new StringBuilder("NewsfeedItemWallpostFeedback(type=");
        sb2.append(newsfeedItemWallpostFeedbackType);
        sb2.append(", question=");
        sb2.append(str);
        sb2.append(", answers=");
        sb2.append(list);
        sb2.append(", starsCount=");
        sb2.append(num);
        sb2.append(", gratitude=");
        return u.o(sb2, str2, ")");
    }

    public /* synthetic */ NewsfeedItemWallpostFeedback(NewsfeedItemWallpostFeedbackType newsfeedItemWallpostFeedbackType, String str, List list, Integer num, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(newsfeedItemWallpostFeedbackType, str, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str2);
    }
}
