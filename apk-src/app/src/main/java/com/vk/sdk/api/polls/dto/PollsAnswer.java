package com.vk.sdk.api.polls.dto;

import gf.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l7.o;
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
public final class PollsAnswer {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    private final int f15227id;

    @b("rate")
    private final float rate;

    @b("text")
    @NotNull
    private final String text;

    @b("votes")
    private final int votes;

    public PollsAnswer(int i, float f10, @NotNull String text, int i10) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f15227id = i;
        this.rate = f10;
        this.text = text;
        this.votes = i10;
    }

    public static /* synthetic */ PollsAnswer copy$default(PollsAnswer pollsAnswer, int i, float f10, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i = pollsAnswer.f15227id;
        }
        if ((i11 & 2) != 0) {
            f10 = pollsAnswer.rate;
        }
        if ((i11 & 4) != 0) {
            str = pollsAnswer.text;
        }
        if ((i11 & 8) != 0) {
            i10 = pollsAnswer.votes;
        }
        return pollsAnswer.copy(i, f10, str, i10);
    }

    public final int component1() {
        return this.f15227id;
    }

    public final float component2() {
        return this.rate;
    }

    @NotNull
    public final String component3() {
        return this.text;
    }

    public final int component4() {
        return this.votes;
    }

    @NotNull
    public final PollsAnswer copy(int i, float f10, @NotNull String text, int i10) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new PollsAnswer(i, f10, text, i10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PollsAnswer)) {
            return false;
        }
        PollsAnswer pollsAnswer = (PollsAnswer) obj;
        return this.f15227id == pollsAnswer.f15227id && Float.valueOf(this.rate).equals(Float.valueOf(pollsAnswer.rate)) && Intrinsics.a(this.text, pollsAnswer.text) && this.votes == pollsAnswer.votes;
    }

    public final int getId() {
        return this.f15227id;
    }

    public final float getRate() {
        return this.rate;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public final int getVotes() {
        return this.votes;
    }

    public int hashCode() {
        return Integer.hashCode(this.votes) + a.e(o.b(this.rate, Integer.hashCode(this.f15227id) * 31, 31), 31, this.text);
    }

    @NotNull
    public String toString() {
        return "PollsAnswer(id=" + this.f15227id + ", rate=" + this.rate + ", text=" + this.text + ", votes=" + this.votes + ")";
    }
}
