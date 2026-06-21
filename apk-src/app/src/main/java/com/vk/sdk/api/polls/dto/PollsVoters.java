package com.vk.sdk.api.polls.dto;

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
public final class PollsVoters {

    @b("answer_id")
    @Nullable
    private final Integer answerId;

    @b("users")
    @Nullable
    private final PollsVotersUsers users;

    public PollsVoters() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PollsVoters copy$default(PollsVoters pollsVoters, Integer num, PollsVotersUsers pollsVotersUsers, int i, Object obj) {
        if ((i & 1) != 0) {
            num = pollsVoters.answerId;
        }
        if ((i & 2) != 0) {
            pollsVotersUsers = pollsVoters.users;
        }
        return pollsVoters.copy(num, pollsVotersUsers);
    }

    @Nullable
    public final Integer component1() {
        return this.answerId;
    }

    @Nullable
    public final PollsVotersUsers component2() {
        return this.users;
    }

    @NotNull
    public final PollsVoters copy(@Nullable Integer num, @Nullable PollsVotersUsers pollsVotersUsers) {
        return new PollsVoters(num, pollsVotersUsers);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PollsVoters)) {
            return false;
        }
        PollsVoters pollsVoters = (PollsVoters) obj;
        return Intrinsics.a(this.answerId, pollsVoters.answerId) && Intrinsics.a(this.users, pollsVoters.users);
    }

    @Nullable
    public final Integer getAnswerId() {
        return this.answerId;
    }

    @Nullable
    public final PollsVotersUsers getUsers() {
        return this.users;
    }

    public int hashCode() {
        Integer num = this.answerId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        PollsVotersUsers pollsVotersUsers = this.users;
        return iHashCode + (pollsVotersUsers != null ? pollsVotersUsers.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PollsVoters(answerId=" + this.answerId + ", users=" + this.users + ")";
    }

    public PollsVoters(@Nullable Integer num, @Nullable PollsVotersUsers pollsVotersUsers) {
        this.answerId = num;
        this.users = pollsVotersUsers;
    }

    public /* synthetic */ PollsVoters(Integer num, PollsVotersUsers pollsVotersUsers, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : pollsVotersUsers);
    }
}
