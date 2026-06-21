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
public final class NewsfeedGetResponse {

    @b("groups")
    @Nullable
    private final List<GroupsGroupFull> groups;

    @b("items")
    @Nullable
    private final List<NewsfeedNewsfeedItem> items;

    @b("next_from")
    @Nullable
    private final String nextFrom;

    @b("profiles")
    @Nullable
    private final List<UsersUserFull> profiles;

    public NewsfeedGetResponse() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NewsfeedGetResponse copy$default(NewsfeedGetResponse newsfeedGetResponse, List list, List list2, List list3, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = newsfeedGetResponse.items;
        }
        if ((i & 2) != 0) {
            list2 = newsfeedGetResponse.profiles;
        }
        if ((i & 4) != 0) {
            list3 = newsfeedGetResponse.groups;
        }
        if ((i & 8) != 0) {
            str = newsfeedGetResponse.nextFrom;
        }
        return newsfeedGetResponse.copy(list, list2, list3, str);
    }

    @Nullable
    public final List<NewsfeedNewsfeedItem> component1() {
        return this.items;
    }

    @Nullable
    public final List<UsersUserFull> component2() {
        return this.profiles;
    }

    @Nullable
    public final List<GroupsGroupFull> component3() {
        return this.groups;
    }

    @Nullable
    public final String component4() {
        return this.nextFrom;
    }

    @NotNull
    public final NewsfeedGetResponse copy(@Nullable List<? extends NewsfeedNewsfeedItem> list, @Nullable List<UsersUserFull> list2, @Nullable List<GroupsGroupFull> list3, @Nullable String str) {
        return new NewsfeedGetResponse(list, list2, list3, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedGetResponse)) {
            return false;
        }
        NewsfeedGetResponse newsfeedGetResponse = (NewsfeedGetResponse) obj;
        return Intrinsics.a(this.items, newsfeedGetResponse.items) && Intrinsics.a(this.profiles, newsfeedGetResponse.profiles) && Intrinsics.a(this.groups, newsfeedGetResponse.groups) && Intrinsics.a(this.nextFrom, newsfeedGetResponse.nextFrom);
    }

    @Nullable
    public final List<GroupsGroupFull> getGroups() {
        return this.groups;
    }

    @Nullable
    public final List<NewsfeedNewsfeedItem> getItems() {
        return this.items;
    }

    @Nullable
    public final String getNextFrom() {
        return this.nextFrom;
    }

    @Nullable
    public final List<UsersUserFull> getProfiles() {
        return this.profiles;
    }

    public int hashCode() {
        List<NewsfeedNewsfeedItem> list = this.items;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<UsersUserFull> list2 = this.profiles;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<GroupsGroupFull> list3 = this.groups;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str = this.nextFrom;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "NewsfeedGetResponse(items=" + this.items + ", profiles=" + this.profiles + ", groups=" + this.groups + ", nextFrom=" + this.nextFrom + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NewsfeedGetResponse(@Nullable List<? extends NewsfeedNewsfeedItem> list, @Nullable List<UsersUserFull> list2, @Nullable List<GroupsGroupFull> list3, @Nullable String str) {
        this.items = list;
        this.profiles = list2;
        this.groups = list3;
        this.nextFrom = str;
    }

    public /* synthetic */ NewsfeedGetResponse(List list, List list2, List list3, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3, (i & 8) != 0 ? null : str);
    }
}
