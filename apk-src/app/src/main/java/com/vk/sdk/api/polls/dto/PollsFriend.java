package com.vk.sdk.api.polls.dto;

import com.vk.dto.common.id.UserId;
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
public final class PollsFriend {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    @NotNull
    private final UserId f15229id;

    public PollsFriend(@NotNull UserId id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.f15229id = id2;
    }

    public static /* synthetic */ PollsFriend copy$default(PollsFriend pollsFriend, UserId userId, int i, Object obj) {
        if ((i & 1) != 0) {
            userId = pollsFriend.f15229id;
        }
        return pollsFriend.copy(userId);
    }

    @NotNull
    public final UserId component1() {
        return this.f15229id;
    }

    @NotNull
    public final PollsFriend copy(@NotNull UserId id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return new PollsFriend(id2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PollsFriend) && Intrinsics.a(this.f15229id, ((PollsFriend) obj).f15229id);
    }

    @NotNull
    public final UserId getId() {
        return this.f15229id;
    }

    public int hashCode() {
        return this.f15229id.hashCode();
    }

    @NotNull
    public String toString() {
        return "PollsFriend(id=" + this.f15229id + ")";
    }
}
