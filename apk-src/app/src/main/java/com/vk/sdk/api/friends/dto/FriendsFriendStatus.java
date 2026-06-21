package com.vk.sdk.api.friends.dto;

import a0.u;
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
public final class FriendsFriendStatus {

    @b("friend_status")
    @NotNull
    private final FriendsFriendStatusStatus friendStatus;

    @b("sign")
    @Nullable
    private final String sign;

    @b(TraceContext.JsonKeys.USER_ID)
    @NotNull
    private final UserId userId;

    public FriendsFriendStatus(@NotNull FriendsFriendStatusStatus friendStatus, @NotNull UserId userId, @Nullable String str) {
        Intrinsics.checkNotNullParameter(friendStatus, "friendStatus");
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.friendStatus = friendStatus;
        this.userId = userId;
        this.sign = str;
    }

    public static /* synthetic */ FriendsFriendStatus copy$default(FriendsFriendStatus friendsFriendStatus, FriendsFriendStatusStatus friendsFriendStatusStatus, UserId userId, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            friendsFriendStatusStatus = friendsFriendStatus.friendStatus;
        }
        if ((i & 2) != 0) {
            userId = friendsFriendStatus.userId;
        }
        if ((i & 4) != 0) {
            str = friendsFriendStatus.sign;
        }
        return friendsFriendStatus.copy(friendsFriendStatusStatus, userId, str);
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
    public final String component3() {
        return this.sign;
    }

    @NotNull
    public final FriendsFriendStatus copy(@NotNull FriendsFriendStatusStatus friendStatus, @NotNull UserId userId, @Nullable String str) {
        Intrinsics.checkNotNullParameter(friendStatus, "friendStatus");
        Intrinsics.checkNotNullParameter(userId, "userId");
        return new FriendsFriendStatus(friendStatus, userId, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsFriendStatus)) {
            return false;
        }
        FriendsFriendStatus friendsFriendStatus = (FriendsFriendStatus) obj;
        return this.friendStatus == friendsFriendStatus.friendStatus && Intrinsics.a(this.userId, friendsFriendStatus.userId) && Intrinsics.a(this.sign, friendsFriendStatus.sign);
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
        String str = this.sign;
        return iE + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        FriendsFriendStatusStatus friendsFriendStatusStatus = this.friendStatus;
        UserId userId = this.userId;
        String str = this.sign;
        StringBuilder sb2 = new StringBuilder("FriendsFriendStatus(friendStatus=");
        sb2.append(friendsFriendStatusStatus);
        sb2.append(", userId=");
        sb2.append(userId);
        sb2.append(", sign=");
        return u.o(sb2, str, ")");
    }

    public /* synthetic */ FriendsFriendStatus(FriendsFriendStatusStatus friendsFriendStatusStatus, UserId userId, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(friendsFriendStatusStatus, userId, (i & 4) != 0 ? null : str);
    }
}
