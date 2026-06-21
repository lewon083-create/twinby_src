package com.vk.sdk.api.classifieds.dto;

import com.vk.dto.common.id.UserId;
import gf.a;
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
public final class ClassifiedsYoulaItemActionProperties {

    @b("hash")
    @NotNull
    private final String hash;

    @b("is_incomplete")
    @Nullable
    private final Boolean isIncomplete;

    @b("message_chat_id")
    @Nullable
    private final Integer messageChatId;

    @b("message_enabled")
    private final boolean messageEnabled;

    @b("message_wallitem_id")
    @Nullable
    private final String messageWallitemId;

    @b("owner_id")
    @NotNull
    private final UserId ownerId;

    @b("phone_enabled")
    private final boolean phoneEnabled;

    public ClassifiedsYoulaItemActionProperties(@NotNull UserId ownerId, @NotNull String hash, boolean z5, boolean z10, @Nullable String str, @Nullable Integer num, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(hash, "hash");
        this.ownerId = ownerId;
        this.hash = hash;
        this.phoneEnabled = z5;
        this.messageEnabled = z10;
        this.messageWallitemId = str;
        this.messageChatId = num;
        this.isIncomplete = bool;
    }

    public static /* synthetic */ ClassifiedsYoulaItemActionProperties copy$default(ClassifiedsYoulaItemActionProperties classifiedsYoulaItemActionProperties, UserId userId, String str, boolean z5, boolean z10, String str2, Integer num, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            userId = classifiedsYoulaItemActionProperties.ownerId;
        }
        if ((i & 2) != 0) {
            str = classifiedsYoulaItemActionProperties.hash;
        }
        if ((i & 4) != 0) {
            z5 = classifiedsYoulaItemActionProperties.phoneEnabled;
        }
        if ((i & 8) != 0) {
            z10 = classifiedsYoulaItemActionProperties.messageEnabled;
        }
        if ((i & 16) != 0) {
            str2 = classifiedsYoulaItemActionProperties.messageWallitemId;
        }
        if ((i & 32) != 0) {
            num = classifiedsYoulaItemActionProperties.messageChatId;
        }
        if ((i & 64) != 0) {
            bool = classifiedsYoulaItemActionProperties.isIncomplete;
        }
        Integer num2 = num;
        Boolean bool2 = bool;
        String str3 = str2;
        boolean z11 = z5;
        return classifiedsYoulaItemActionProperties.copy(userId, str, z11, z10, str3, num2, bool2);
    }

    @NotNull
    public final UserId component1() {
        return this.ownerId;
    }

    @NotNull
    public final String component2() {
        return this.hash;
    }

    public final boolean component3() {
        return this.phoneEnabled;
    }

    public final boolean component4() {
        return this.messageEnabled;
    }

    @Nullable
    public final String component5() {
        return this.messageWallitemId;
    }

    @Nullable
    public final Integer component6() {
        return this.messageChatId;
    }

    @Nullable
    public final Boolean component7() {
        return this.isIncomplete;
    }

    @NotNull
    public final ClassifiedsYoulaItemActionProperties copy(@NotNull UserId ownerId, @NotNull String hash, boolean z5, boolean z10, @Nullable String str, @Nullable Integer num, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(hash, "hash");
        return new ClassifiedsYoulaItemActionProperties(ownerId, hash, z5, z10, str, num, bool);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassifiedsYoulaItemActionProperties)) {
            return false;
        }
        ClassifiedsYoulaItemActionProperties classifiedsYoulaItemActionProperties = (ClassifiedsYoulaItemActionProperties) obj;
        return Intrinsics.a(this.ownerId, classifiedsYoulaItemActionProperties.ownerId) && Intrinsics.a(this.hash, classifiedsYoulaItemActionProperties.hash) && this.phoneEnabled == classifiedsYoulaItemActionProperties.phoneEnabled && this.messageEnabled == classifiedsYoulaItemActionProperties.messageEnabled && Intrinsics.a(this.messageWallitemId, classifiedsYoulaItemActionProperties.messageWallitemId) && Intrinsics.a(this.messageChatId, classifiedsYoulaItemActionProperties.messageChatId) && Intrinsics.a(this.isIncomplete, classifiedsYoulaItemActionProperties.isIncomplete);
    }

    @NotNull
    public final String getHash() {
        return this.hash;
    }

    @Nullable
    public final Integer getMessageChatId() {
        return this.messageChatId;
    }

    public final boolean getMessageEnabled() {
        return this.messageEnabled;
    }

    @Nullable
    public final String getMessageWallitemId() {
        return this.messageWallitemId;
    }

    @NotNull
    public final UserId getOwnerId() {
        return this.ownerId;
    }

    public final boolean getPhoneEnabled() {
        return this.phoneEnabled;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v5 */
    public int hashCode() {
        int iE = a.e(this.ownerId.hashCode() * 31, 31, this.hash);
        boolean z5 = this.phoneEnabled;
        ?? r22 = z5;
        if (z5) {
            r22 = 1;
        }
        int i = (iE + r22) * 31;
        boolean z10 = this.messageEnabled;
        int i10 = (i + (z10 ? 1 : z10)) * 31;
        String str = this.messageWallitemId;
        int iHashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.messageChatId;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.isIncomplete;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @Nullable
    public final Boolean isIncomplete() {
        return this.isIncomplete;
    }

    @NotNull
    public String toString() {
        UserId userId = this.ownerId;
        String str = this.hash;
        boolean z5 = this.phoneEnabled;
        boolean z10 = this.messageEnabled;
        String str2 = this.messageWallitemId;
        Integer num = this.messageChatId;
        Boolean bool = this.isIncomplete;
        StringBuilder sb2 = new StringBuilder("ClassifiedsYoulaItemActionProperties(ownerId=");
        sb2.append(userId);
        sb2.append(", hash=");
        sb2.append(str);
        sb2.append(", phoneEnabled=");
        sb2.append(z5);
        sb2.append(", messageEnabled=");
        sb2.append(z10);
        sb2.append(", messageWallitemId=");
        a.r(num, str2, ", messageChatId=", ", isIncomplete=", sb2);
        sb2.append(bool);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ ClassifiedsYoulaItemActionProperties(UserId userId, String str, boolean z5, boolean z10, String str2, Integer num, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(userId, str, z5, z10, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : bool);
    }
}
