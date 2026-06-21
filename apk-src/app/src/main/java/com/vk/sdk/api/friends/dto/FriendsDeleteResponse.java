package com.vk.sdk.api.friends.dto;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class FriendsDeleteResponse {

    @b("friend_deleted")
    @Nullable
    private final FriendDeleted friendDeleted;

    @b("in_request_deleted")
    @Nullable
    private final InRequestDeleted inRequestDeleted;

    @b("out_request_deleted")
    @Nullable
    private final OutRequestDeleted outRequestDeleted;

    @b("success")
    private final int success;

    @b("suggestion_deleted")
    @Nullable
    private final SuggestionDeleted suggestionDeleted;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public enum FriendDeleted {
        OK(1);

        private final int value;

        FriendDeleted(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public enum InRequestDeleted {
        OK(1);

        private final int value;

        InRequestDeleted(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public enum OutRequestDeleted {
        OK(1);

        private final int value;

        OutRequestDeleted(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public enum SuggestionDeleted {
        OK(1);

        private final int value;

        SuggestionDeleted(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    public FriendsDeleteResponse(int i, @Nullable FriendDeleted friendDeleted, @Nullable OutRequestDeleted outRequestDeleted, @Nullable InRequestDeleted inRequestDeleted, @Nullable SuggestionDeleted suggestionDeleted) {
        this.success = i;
        this.friendDeleted = friendDeleted;
        this.outRequestDeleted = outRequestDeleted;
        this.inRequestDeleted = inRequestDeleted;
        this.suggestionDeleted = suggestionDeleted;
    }

    public static /* synthetic */ FriendsDeleteResponse copy$default(FriendsDeleteResponse friendsDeleteResponse, int i, FriendDeleted friendDeleted, OutRequestDeleted outRequestDeleted, InRequestDeleted inRequestDeleted, SuggestionDeleted suggestionDeleted, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = friendsDeleteResponse.success;
        }
        if ((i10 & 2) != 0) {
            friendDeleted = friendsDeleteResponse.friendDeleted;
        }
        if ((i10 & 4) != 0) {
            outRequestDeleted = friendsDeleteResponse.outRequestDeleted;
        }
        if ((i10 & 8) != 0) {
            inRequestDeleted = friendsDeleteResponse.inRequestDeleted;
        }
        if ((i10 & 16) != 0) {
            suggestionDeleted = friendsDeleteResponse.suggestionDeleted;
        }
        SuggestionDeleted suggestionDeleted2 = suggestionDeleted;
        OutRequestDeleted outRequestDeleted2 = outRequestDeleted;
        return friendsDeleteResponse.copy(i, friendDeleted, outRequestDeleted2, inRequestDeleted, suggestionDeleted2);
    }

    public final int component1() {
        return this.success;
    }

    @Nullable
    public final FriendDeleted component2() {
        return this.friendDeleted;
    }

    @Nullable
    public final OutRequestDeleted component3() {
        return this.outRequestDeleted;
    }

    @Nullable
    public final InRequestDeleted component4() {
        return this.inRequestDeleted;
    }

    @Nullable
    public final SuggestionDeleted component5() {
        return this.suggestionDeleted;
    }

    @NotNull
    public final FriendsDeleteResponse copy(int i, @Nullable FriendDeleted friendDeleted, @Nullable OutRequestDeleted outRequestDeleted, @Nullable InRequestDeleted inRequestDeleted, @Nullable SuggestionDeleted suggestionDeleted) {
        return new FriendsDeleteResponse(i, friendDeleted, outRequestDeleted, inRequestDeleted, suggestionDeleted);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsDeleteResponse)) {
            return false;
        }
        FriendsDeleteResponse friendsDeleteResponse = (FriendsDeleteResponse) obj;
        return this.success == friendsDeleteResponse.success && this.friendDeleted == friendsDeleteResponse.friendDeleted && this.outRequestDeleted == friendsDeleteResponse.outRequestDeleted && this.inRequestDeleted == friendsDeleteResponse.inRequestDeleted && this.suggestionDeleted == friendsDeleteResponse.suggestionDeleted;
    }

    @Nullable
    public final FriendDeleted getFriendDeleted() {
        return this.friendDeleted;
    }

    @Nullable
    public final InRequestDeleted getInRequestDeleted() {
        return this.inRequestDeleted;
    }

    @Nullable
    public final OutRequestDeleted getOutRequestDeleted() {
        return this.outRequestDeleted;
    }

    public final int getSuccess() {
        return this.success;
    }

    @Nullable
    public final SuggestionDeleted getSuggestionDeleted() {
        return this.suggestionDeleted;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.success) * 31;
        FriendDeleted friendDeleted = this.friendDeleted;
        int iHashCode2 = (iHashCode + (friendDeleted == null ? 0 : friendDeleted.hashCode())) * 31;
        OutRequestDeleted outRequestDeleted = this.outRequestDeleted;
        int iHashCode3 = (iHashCode2 + (outRequestDeleted == null ? 0 : outRequestDeleted.hashCode())) * 31;
        InRequestDeleted inRequestDeleted = this.inRequestDeleted;
        int iHashCode4 = (iHashCode3 + (inRequestDeleted == null ? 0 : inRequestDeleted.hashCode())) * 31;
        SuggestionDeleted suggestionDeleted = this.suggestionDeleted;
        return iHashCode4 + (suggestionDeleted != null ? suggestionDeleted.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FriendsDeleteResponse(success=" + this.success + ", friendDeleted=" + this.friendDeleted + ", outRequestDeleted=" + this.outRequestDeleted + ", inRequestDeleted=" + this.inRequestDeleted + ", suggestionDeleted=" + this.suggestionDeleted + ")";
    }

    public /* synthetic */ FriendsDeleteResponse(int i, FriendDeleted friendDeleted, OutRequestDeleted outRequestDeleted, InRequestDeleted inRequestDeleted, SuggestionDeleted suggestionDeleted, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i10 & 2) != 0 ? null : friendDeleted, (i10 & 4) != 0 ? null : outRequestDeleted, (i10 & 8) != 0 ? null : inRequestDeleted, (i10 & 16) != 0 ? null : suggestionDeleted);
    }
}
