package com.vk.sdk.api.friends.dto;

import com.vk.dto.common.id.UserId;
import io.sentry.TraceContext;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
public final class FriendsFriendExtendedStatus {

    @b("friend_status")
    @NotNull
    private final FriendsFriendStatusStatus friendStatus;

    @b("is_request_unread")
    @Nullable
    private final Boolean isRequestUnread;

    @b("sign")
    @Nullable
    private final String sign;

    @b(TraceContext.JsonKeys.USER_ID)
    @NotNull
    private final UserId userId;

    public FriendsFriendExtendedStatus(@NotNull FriendsFriendStatusStatus friendStatus, @NotNull UserId userId, @Nullable Boolean bool, @Nullable String str) {
        Intrinsics.checkNotNullParameter(friendStatus, "friendStatus");
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.friendStatus = friendStatus;
        this.userId = userId;
        this.isRequestUnread = bool;
        this.sign = str;
    }

    public static /* synthetic */ FriendsFriendExtendedStatus copy$default(FriendsFriendExtendedStatus friendsFriendExtendedStatus, FriendsFriendStatusStatus friendsFriendStatusStatus, UserId userId, Boolean bool, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            friendsFriendStatusStatus = friendsFriendExtendedStatus.friendStatus;
        }
        if ((i & 2) != 0) {
            userId = friendsFriendExtendedStatus.userId;
        }
        if ((i & 4) != 0) {
            bool = friendsFriendExtendedStatus.isRequestUnread;
        }
        if ((i & 8) != 0) {
            str = friendsFriendExtendedStatus.sign;
        }
        return friendsFriendExtendedStatus.copy(friendsFriendStatusStatus, userId, bool, str);
    }

    @NotNull
    public final FriendsFriendStatusStatus component1() {
        return this.friendStatus;
    }

    @NotNull
    public final UserId component2() {
        return this.userId;
    }

    @Nullable
    public final Boolean component3() {
        return this.isRequestUnread;
    }

    @Nullable
    public final String component4() {
        return this.sign;
    }

    @NotNull
    public final FriendsFriendExtendedStatus copy(@NotNull FriendsFriendStatusStatus friendStatus, @NotNull UserId userId, @Nullable Boolean bool, @Nullable String str) {
        Intrinsics.checkNotNullParameter(friendStatus, "friendStatus");
        Intrinsics.checkNotNullParameter(userId, "userId");
        return new FriendsFriendExtendedStatus(friendStatus, userId, bool, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsFriendExtendedStatus)) {
            return false;
        }
        FriendsFriendExtendedStatus friendsFriendExtendedStatus = (FriendsFriendExtendedStatus) obj;
        return this.friendStatus == friendsFriendExtendedStatus.friendStatus && Intrinsics.a(this.userId, friendsFriendExtendedStatus.userId) && Intrinsics.a(this.isRequestUnread, friendsFriendExtendedStatus.isRequestUnread) && Intrinsics.a(this.sign, friendsFriendExtendedStatus.sign);
    }

    @NotNull
    public final FriendsFriendStatusStatus getFriendStatus() {
        return this.friendStatus;
    }

    @Nullable
    public final String getSign() {
        return this.sign;
    }

    @NotNull
    public final UserId getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iE = o.e(this.userId, this.friendStatus.hashCode() * 31, 31);
        Boolean bool = this.isRequestUnread;
        int iHashCode = (iE + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.sign;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Nullable
    public final Boolean isRequestUnread() {
        return this.isRequestUnread;
    }

    @NotNull
    public String toString() {
        return "FriendsFriendExtendedStatus(friendStatus=" + this.friendStatus + ", userId=" + this.userId + ", isRequestUnread=" + this.isRequestUnread + ", sign=" + this.sign + ")";
    }

    public /* synthetic */ FriendsFriendExtendedStatus(FriendsFriendStatusStatus friendsFriendStatusStatus, UserId userId, Boolean bool, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(friendsFriendStatusStatus, userId, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str);
    }
}
