package com.vk.sdk.api.leadForms.dto;

import kotlin.Metadata;
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
public final class LeadFormsAnswer {

    @b("answer")
    @NotNull
    private final LeadFormsAnswerItem answer;

    @b("key")
    @NotNull
    private final String key;

    public LeadFormsAnswer(@NotNull String key, @NotNull LeadFormsAnswerItem answer) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(answer, "answer");
        this.key = key;
        this.answer = answer;
    }

    public static /* synthetic */ LeadFormsAnswer copy$default(LeadFormsAnswer leadFormsAnswer, String str, LeadFormsAnswerItem leadFormsAnswerItem, int i, Object obj) {
        if ((i & 1) != 0) {
            str = leadFormsAnswer.key;
        }
        if ((i & 2) != 0) {
            leadFormsAnswerItem = leadFormsAnswer.answer;
        }
        return leadFormsAnswer.copy(str, leadFormsAnswerItem);
    }

    @NotNull
    public final String component1() {
        return this.key;
    }

    @NotNull
    public final LeadFormsAnswerItem component2() {
        return this.answer;
    }

    @NotNull
    public final LeadFormsAnswer copy(@NotNull String key, @NotNull LeadFormsAnswerItem answer) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(answer, "answer");
        return new LeadFormsAnswer(key, answer);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeadFormsAnswer)) {
            return false;
        }
        LeadFormsAnswer leadFormsAnswer = (LeadFormsAnswer) obj;
        return Intrinsics.a(this.key, leadFormsAnswer.key) && Intrinsics.a(this.answer, leadFormsAnswer.answer);
    }

    @NotNull
    public final LeadFormsAnswerItem getAnswer() {
        return this.answer;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    public int hashCode() {
        return this.answer.hashCode() + (this.key.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "LeadFormsAnswer(key=" + this.key + ", answer=" + this.answer + ")";
    }
}
