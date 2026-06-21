package com.vk.sdk.api.notifications.dto;

import com.vk.dto.common.id.UserId;
import io.sentry.TraceContext;
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
public final class NotificationsSendMessageItem {

    @b("error")
    @Nullable
    private final NotificationsSendMessageError error;

    @b("status")
    @Nullable
    private final Boolean status;

    @b(TraceContext.JsonKeys.USER_ID)
    @Nullable
    private final UserId userId;

    public NotificationsSendMessageItem() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ NotificationsSendMessageItem copy$default(NotificationsSendMessageItem notificationsSendMessageItem, UserId userId, Boolean bool, NotificationsSendMessageError notificationsSendMessageError, int i, Object obj) {
        if ((i & 1) != 0) {
            userId = notificationsSendMessageItem.userId;
        }
        if ((i & 2) != 0) {
            bool = notificationsSendMessageItem.status;
        }
        if ((i & 4) != 0) {
            notificationsSendMessageError = notificationsSendMessageItem.error;
        }
        return notificationsSendMessageItem.copy(userId, bool, notificationsSendMessageError);
    }

    @Nullable
    public final UserId component1() {
        return this.userId;
    }

    @Nullable
    public final Boolean component2() {
        return this.status;
    }

    @Nullable
    public final NotificationsSendMessageError component3() {
        return this.error;
    }

    @NotNull
    public final NotificationsSendMessageItem copy(@Nullable UserId userId, @Nullable Boolean bool, @Nullable NotificationsSendMessageError notificationsSendMessageError) {
        return new NotificationsSendMessageItem(userId, bool, notificationsSendMessageError);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationsSendMessageItem)) {
            return false;
        }
        NotificationsSendMessageItem notificationsSendMessageItem = (NotificationsSendMessageItem) obj;
        return Intrinsics.a(this.userId, notificationsSendMessageItem.userId) && Intrinsics.a(this.status, notificationsSendMessageItem.status) && Intrinsics.a(this.error, notificationsSendMessageItem.error);
    }

    @Nullable
    public final NotificationsSendMessageError getError() {
        return this.error;
    }

    @Nullable
    public final Boolean getStatus() {
        return this.status;
    }

    @Nullable
    public final UserId getUserId() {
        return this.userId;
    }

    public int hashCode() {
        UserId userId = this.userId;
        int iHashCode = (userId == null ? 0 : userId.hashCode()) * 31;
        Boolean bool = this.status;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        NotificationsSendMessageError notificationsSendMessageError = this.error;
        return iHashCode2 + (notificationsSendMessageError != null ? notificationsSendMessageError.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "NotificationsSendMessageItem(userId=" + this.userId + ", status=" + this.status + ", error=" + this.error + ")";
    }

    public NotificationsSendMessageItem(@Nullable UserId userId, @Nullable Boolean bool, @Nullable NotificationsSendMessageError notificationsSendMessageError) {
        this.userId = userId;
        this.status = bool;
        this.error = notificationsSendMessageError;
    }

    public /* synthetic */ NotificationsSendMessageItem(UserId userId, Boolean bool, NotificationsSendMessageError notificationsSendMessageError, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : userId, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : notificationsSendMessageError);
    }
}
