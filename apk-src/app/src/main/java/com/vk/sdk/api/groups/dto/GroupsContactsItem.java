package com.vk.sdk.api.groups.dto;

import com.google.android.gms.internal.ads.om1;
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
public final class GroupsContactsItem {

    @b("desc")
    @Nullable
    private final String desc;

    @b("email")
    @Nullable
    private final String email;

    @b("phone")
    @Nullable
    private final String phone;

    @b(TraceContext.JsonKeys.USER_ID)
    @Nullable
    private final UserId userId;

    public GroupsContactsItem() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ GroupsContactsItem copy$default(GroupsContactsItem groupsContactsItem, UserId userId, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            userId = groupsContactsItem.userId;
        }
        if ((i & 2) != 0) {
            str = groupsContactsItem.desc;
        }
        if ((i & 4) != 0) {
            str2 = groupsContactsItem.phone;
        }
        if ((i & 8) != 0) {
            str3 = groupsContactsItem.email;
        }
        return groupsContactsItem.copy(userId, str, str2, str3);
    }

    @Nullable
    public final UserId component1() {
        return this.userId;
    }

    @Nullable
    public final String component2() {
        return this.desc;
    }

    @Nullable
    public final String component3() {
        return this.phone;
    }

    @Nullable
    public final String component4() {
        return this.email;
    }

    @NotNull
    public final GroupsContactsItem copy(@Nullable UserId userId, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        return new GroupsContactsItem(userId, str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsContactsItem)) {
            return false;
        }
        GroupsContactsItem groupsContactsItem = (GroupsContactsItem) obj;
        return Intrinsics.a(this.userId, groupsContactsItem.userId) && Intrinsics.a(this.desc, groupsContactsItem.desc) && Intrinsics.a(this.phone, groupsContactsItem.phone) && Intrinsics.a(this.email, groupsContactsItem.email);
    }

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    @Nullable
    public final String getEmail() {
        return this.email;
    }

    @Nullable
    public final String getPhone() {
        return this.phone;
    }

    @Nullable
    public final UserId getUserId() {
        return this.userId;
    }

    public int hashCode() {
        UserId userId = this.userId;
        int iHashCode = (userId == null ? 0 : userId.hashCode()) * 31;
        String str = this.desc;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.phone;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.email;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        UserId userId = this.userId;
        String str = this.desc;
        String str2 = this.phone;
        String str3 = this.email;
        StringBuilder sb2 = new StringBuilder("GroupsContactsItem(userId=");
        sb2.append(userId);
        sb2.append(", desc=");
        sb2.append(str);
        sb2.append(", phone=");
        return om1.n(sb2, str2, ", email=", str3, ")");
    }

    public GroupsContactsItem(@Nullable UserId userId, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.userId = userId;
        this.desc = str;
        this.phone = str2;
        this.email = str3;
    }

    public /* synthetic */ GroupsContactsItem(UserId userId, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : userId, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
