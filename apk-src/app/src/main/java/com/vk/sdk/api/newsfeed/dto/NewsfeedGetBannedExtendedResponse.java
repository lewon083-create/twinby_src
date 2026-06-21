package com.vk.sdk.api.newsfeed.dto;

import com.vk.sdk.api.groups.dto.GroupsGroupFull;
import com.vk.sdk.api.users.dto.UsersUserFull;
import java.util.List;
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
public final class NewsfeedGetBannedExtendedResponse {

    @b("groups")
    @Nullable
    private final List<GroupsGroupFull> groups;

    @b("profiles")
    @Nullable
    private final List<UsersUserFull> profiles;

    public NewsfeedGetBannedExtendedResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NewsfeedGetBannedExtendedResponse copy$default(NewsfeedGetBannedExtendedResponse newsfeedGetBannedExtendedResponse, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = newsfeedGetBannedExtendedResponse.profiles;
        }
        if ((i & 2) != 0) {
            list2 = newsfeedGetBannedExtendedResponse.groups;
        }
        return newsfeedGetBannedExtendedResponse.copy(list, list2);
    }

    @Nullable
    public final List<UsersUserFull> component1() {
        return this.profiles;
    }

    @Nullable
    public final List<GroupsGroupFull> component2() {
        return this.groups;
    }

    @NotNull
    public final NewsfeedGetBannedExtendedResponse copy(@Nullable List<UsersUserFull> list, @Nullable List<GroupsGroupFull> list2) {
        return new NewsfeedGetBannedExtendedResponse(list, list2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedGetBannedExtendedResponse)) {
            return false;
        }
        NewsfeedGetBannedExtendedResponse newsfeedGetBannedExtendedResponse = (NewsfeedGetBannedExtendedResponse) obj;
        return Intrinsics.a(this.profiles, newsfeedGetBannedExtendedResponse.profiles) && Intrinsics.a(this.groups, newsfeedGetBannedExtendedResponse.groups);
    }

    @Nullable
    public final List<GroupsGroupFull> getGroups() {
        return this.groups;
    }

    @Nullable
    public final List<UsersUserFull> getProfiles() {
        return this.profiles;
    }

    public int hashCode() {
        List<UsersUserFull> list = this.profiles;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<GroupsGroupFull> list2 = this.groups;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "NewsfeedGetBannedExtendedResponse(profiles=" + this.profiles + ", groups=" + this.groups + ")";
    }

    public NewsfeedGetBannedExtendedResponse(@Nullable List<UsersUserFull> list, @Nullable List<GroupsGroupFull> list2) {
        this.profiles = list;
        this.groups = list2;
    }

    public /* synthetic */ NewsfeedGetBannedExtendedResponse(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }
}
