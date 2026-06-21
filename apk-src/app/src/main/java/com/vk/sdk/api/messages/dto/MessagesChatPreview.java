package com.vk.sdk.api.messages.dto;

import a0.u;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.base.dto.BaseLinkButton;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ne.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.a;

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
public final class MessagesChatPreview {

    @b("admin_id")
    @Nullable
    private final UserId adminId;

    @b("button")
    @Nullable
    private final BaseLinkButton button;

    @b("is_don")
    @Nullable
    private final Boolean isDon;

    @b("is_group_channel")
    @Nullable
    private final Boolean isGroupChannel;

    @b("is_member")
    @Nullable
    private final Boolean isMember;

    @b("joined")
    @Nullable
    private final Boolean joined;

    @b("local_id")
    @Nullable
    private final Integer localId;

    @b("members")
    @Nullable
    private final List<UserId> members;

    @b("members_count")
    @Nullable
    private final Integer membersCount;

    @b("photo")
    @Nullable
    private final MessagesChatSettingsPhoto photo;

    @b("title")
    @Nullable
    private final String title;

    public MessagesChatPreview() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MessagesChatPreview copy$default(MessagesChatPreview messagesChatPreview, UserId userId, Boolean bool, Integer num, List list, Integer num2, String str, Boolean bool2, MessagesChatSettingsPhoto messagesChatSettingsPhoto, Boolean bool3, Boolean bool4, BaseLinkButton baseLinkButton, int i, Object obj) {
        if ((i & 1) != 0) {
            userId = messagesChatPreview.adminId;
        }
        if ((i & 2) != 0) {
            bool = messagesChatPreview.joined;
        }
        if ((i & 4) != 0) {
            num = messagesChatPreview.localId;
        }
        if ((i & 8) != 0) {
            list = messagesChatPreview.members;
        }
        if ((i & 16) != 0) {
            num2 = messagesChatPreview.membersCount;
        }
        if ((i & 32) != 0) {
            str = messagesChatPreview.title;
        }
        if ((i & 64) != 0) {
            bool2 = messagesChatPreview.isMember;
        }
        if ((i & 128) != 0) {
            messagesChatSettingsPhoto = messagesChatPreview.photo;
        }
        if ((i & 256) != 0) {
            bool3 = messagesChatPreview.isDon;
        }
        if ((i & 512) != 0) {
            bool4 = messagesChatPreview.isGroupChannel;
        }
        if ((i & 1024) != 0) {
            baseLinkButton = messagesChatPreview.button;
        }
        Boolean bool5 = bool4;
        BaseLinkButton baseLinkButton2 = baseLinkButton;
        MessagesChatSettingsPhoto messagesChatSettingsPhoto2 = messagesChatSettingsPhoto;
        Boolean bool6 = bool3;
        String str2 = str;
        Boolean bool7 = bool2;
        Integer num3 = num2;
        Integer num4 = num;
        return messagesChatPreview.copy(userId, bool, num4, list, num3, str2, bool7, messagesChatSettingsPhoto2, bool6, bool5, baseLinkButton2);
    }

    @Nullable
    public final UserId component1() {
        return this.adminId;
    }

    @Nullable
    public final Boolean component10() {
        return this.isGroupChannel;
    }

    @Nullable
    public final BaseLinkButton component11() {
        return this.button;
    }

    @Nullable
    public final Boolean component2() {
        return this.joined;
    }

    @Nullable
    public final Integer component3() {
        return this.localId;
    }

    @Nullable
    public final List<UserId> component4() {
        return this.members;
    }

    @Nullable
    public final Integer component5() {
        return this.membersCount;
    }

    @Nullable
    public final String component6() {
        return this.title;
    }

    @Nullable
    public final Boolean component7() {
        return this.isMember;
    }

    @Nullable
    public final MessagesChatSettingsPhoto component8() {
        return this.photo;
    }

    @Nullable
    public final Boolean component9() {
        return this.isDon;
    }

    @NotNull
    public final MessagesChatPreview copy(@Nullable UserId userId, @Nullable Boolean bool, @Nullable Integer num, @Nullable List<UserId> list, @Nullable Integer num2, @Nullable String str, @Nullable Boolean bool2, @Nullable MessagesChatSettingsPhoto messagesChatSettingsPhoto, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable BaseLinkButton baseLinkButton) {
        return new MessagesChatPreview(userId, bool, num, list, num2, str, bool2, messagesChatSettingsPhoto, bool3, bool4, baseLinkButton);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesChatPreview)) {
            return false;
        }
        MessagesChatPreview messagesChatPreview = (MessagesChatPreview) obj;
        return Intrinsics.a(this.adminId, messagesChatPreview.adminId) && Intrinsics.a(this.joined, messagesChatPreview.joined) && Intrinsics.a(this.localId, messagesChatPreview.localId) && Intrinsics.a(this.members, messagesChatPreview.members) && Intrinsics.a(this.membersCount, messagesChatPreview.membersCount) && Intrinsics.a(this.title, messagesChatPreview.title) && Intrinsics.a(this.isMember, messagesChatPreview.isMember) && Intrinsics.a(this.photo, messagesChatPreview.photo) && Intrinsics.a(this.isDon, messagesChatPreview.isDon) && Intrinsics.a(this.isGroupChannel, messagesChatPreview.isGroupChannel) && Intrinsics.a(this.button, messagesChatPreview.button);
    }

    @Nullable
    public final UserId getAdminId() {
        return this.adminId;
    }

    @Nullable
    public final BaseLinkButton getButton() {
        return this.button;
    }

    @Nullable
    public final Boolean getJoined() {
        return this.joined;
    }

    @Nullable
    public final Integer getLocalId() {
        return this.localId;
    }

    @Nullable
    public final List<UserId> getMembers() {
        return this.members;
    }

    @Nullable
    public final Integer getMembersCount() {
        return this.membersCount;
    }

    @Nullable
    public final MessagesChatSettingsPhoto getPhoto() {
        return this.photo;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        UserId userId = this.adminId;
        int iHashCode = (userId == null ? 0 : userId.hashCode()) * 31;
        Boolean bool = this.joined;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.localId;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List<UserId> list = this.members;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.membersCount;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.title;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.isMember;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        MessagesChatSettingsPhoto messagesChatSettingsPhoto = this.photo;
        int iHashCode8 = (iHashCode7 + (messagesChatSettingsPhoto == null ? 0 : messagesChatSettingsPhoto.hashCode())) * 31;
        Boolean bool3 = this.isDon;
        int iHashCode9 = (iHashCode8 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isGroupChannel;
        int iHashCode10 = (iHashCode9 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        BaseLinkButton baseLinkButton = this.button;
        return iHashCode10 + (baseLinkButton != null ? baseLinkButton.hashCode() : 0);
    }

    @Nullable
    public final Boolean isDon() {
        return this.isDon;
    }

    @Nullable
    public final Boolean isGroupChannel() {
        return this.isGroupChannel;
    }

    @Nullable
    public final Boolean isMember() {
        return this.isMember;
    }

    @NotNull
    public String toString() {
        UserId userId = this.adminId;
        Boolean bool = this.joined;
        Integer num = this.localId;
        List<UserId> list = this.members;
        Integer num2 = this.membersCount;
        String str = this.title;
        Boolean bool2 = this.isMember;
        MessagesChatSettingsPhoto messagesChatSettingsPhoto = this.photo;
        Boolean bool3 = this.isDon;
        Boolean bool4 = this.isGroupChannel;
        BaseLinkButton baseLinkButton = this.button;
        StringBuilder sb2 = new StringBuilder("MessagesChatPreview(adminId=");
        sb2.append(userId);
        sb2.append(", joined=");
        sb2.append(bool);
        sb2.append(", localId=");
        sb2.append(num);
        sb2.append(", members=");
        sb2.append(list);
        sb2.append(", membersCount=");
        a.r(num2, ", title=", str, ", isMember=", sb2);
        sb2.append(bool2);
        sb2.append(", photo=");
        sb2.append(messagesChatSettingsPhoto);
        sb2.append(", isDon=");
        u.s(sb2, bool3, ", isGroupChannel=", bool4, ", button=");
        sb2.append(baseLinkButton);
        sb2.append(")");
        return sb2.toString();
    }

    public MessagesChatPreview(@Nullable UserId userId, @Nullable Boolean bool, @Nullable Integer num, @Nullable List<UserId> list, @Nullable Integer num2, @Nullable String str, @Nullable Boolean bool2, @Nullable MessagesChatSettingsPhoto messagesChatSettingsPhoto, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable BaseLinkButton baseLinkButton) {
        this.adminId = userId;
        this.joined = bool;
        this.localId = num;
        this.members = list;
        this.membersCount = num2;
        this.title = str;
        this.isMember = bool2;
        this.photo = messagesChatSettingsPhoto;
        this.isDon = bool3;
        this.isGroupChannel = bool4;
        this.button = baseLinkButton;
    }

    public /* synthetic */ MessagesChatPreview(UserId userId, Boolean bool, Integer num, List list, Integer num2, String str, Boolean bool2, MessagesChatSettingsPhoto messagesChatSettingsPhoto, Boolean bool3, Boolean bool4, BaseLinkButton baseLinkButton, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : userId, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : bool2, (i & 128) != 0 ? null : messagesChatSettingsPhoto, (i & 256) != 0 ? null : bool3, (i & 512) != 0 ? null : bool4, (i & 1024) != 0 ? null : baseLinkButton);
    }
}
