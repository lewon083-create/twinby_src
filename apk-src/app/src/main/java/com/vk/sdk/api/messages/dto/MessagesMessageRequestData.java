package com.vk.sdk.api.messages.dto;

import a0.u;
import com.vk.dto.common.id.UserId;
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
public final class MessagesMessageRequestData {

    @b("inviter_id")
    @Nullable
    private final UserId inviterId;

    @b("request_date")
    @Nullable
    private final Integer requestDate;

    @b("status")
    @Nullable
    private final String status;

    public MessagesMessageRequestData() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ MessagesMessageRequestData copy$default(MessagesMessageRequestData messagesMessageRequestData, String str, UserId userId, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = messagesMessageRequestData.status;
        }
        if ((i & 2) != 0) {
            userId = messagesMessageRequestData.inviterId;
        }
        if ((i & 4) != 0) {
            num = messagesMessageRequestData.requestDate;
        }
        return messagesMessageRequestData.copy(str, userId, num);
    }

    @Nullable
    public final String component1() {
        return this.status;
    }

    @Nullable
    public final UserId component2() {
        return this.inviterId;
    }

    @Nullable
    public final Integer component3() {
        return this.requestDate;
    }

    @NotNull
    public final MessagesMessageRequestData copy(@Nullable String str, @Nullable UserId userId, @Nullable Integer num) {
        return new MessagesMessageRequestData(str, userId, num);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesMessageRequestData)) {
            return false;
        }
        MessagesMessageRequestData messagesMessageRequestData = (MessagesMessageRequestData) obj;
        return Intrinsics.a(this.status, messagesMessageRequestData.status) && Intrinsics.a(this.inviterId, messagesMessageRequestData.inviterId) && Intrinsics.a(this.requestDate, messagesMessageRequestData.requestDate);
    }

    @Nullable
    public final UserId getInviterId() {
        return this.inviterId;
    }

    @Nullable
    public final Integer getRequestDate() {
        return this.requestDate;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.status;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        UserId userId = this.inviterId;
        int iHashCode2 = (iHashCode + (userId == null ? 0 : userId.hashCode())) * 31;
        Integer num = this.requestDate;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.status;
        UserId userId = this.inviterId;
        Integer num = this.requestDate;
        StringBuilder sb2 = new StringBuilder("MessagesMessageRequestData(status=");
        sb2.append(str);
        sb2.append(", inviterId=");
        sb2.append(userId);
        sb2.append(", requestDate=");
        return u.m(sb2, num, ")");
    }

    public MessagesMessageRequestData(@Nullable String str, @Nullable UserId userId, @Nullable Integer num) {
        this.status = str;
        this.inviterId = userId;
        this.requestDate = num;
    }

    public /* synthetic */ MessagesMessageRequestData(String str, UserId userId, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : userId, (i & 4) != 0 ? null : num);
    }
}
