package com.vk.sdk.api.newsfeed.dto;

import a0.u;
import com.vk.sdk.api.groups.dto.GroupsGroupFull;
import com.vk.sdk.api.users.dto.UsersUserFull;
import com.vk.sdk.api.wall.dto.WallWallpostFull;
import gf.a;
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
public final class NewsfeedSearchExtendedResponse {

    @b("count")
    @Nullable
    private final Integer count;

    @b("groups")
    @Nullable
    private final List<GroupsGroupFull> groups;

    @b("items")
    @Nullable
    private final List<WallWallpostFull> items;

    @b("next_from")
    @Nullable
    private final String nextFrom;

    @b("profiles")
    @Nullable
    private final List<UsersUserFull> profiles;

    @b("suggested_queries")
    @Nullable
    private final List<String> suggestedQueries;

    @b("total_count")
    @Nullable
    private final Integer totalCount;

    public NewsfeedSearchExtendedResponse() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NewsfeedSearchExtendedResponse copy$default(NewsfeedSearchExtendedResponse newsfeedSearchExtendedResponse, List list, List list2, List list3, List list4, String str, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = newsfeedSearchExtendedResponse.items;
        }
        if ((i & 2) != 0) {
            list2 = newsfeedSearchExtendedResponse.profiles;
        }
        if ((i & 4) != 0) {
            list3 = newsfeedSearchExtendedResponse.groups;
        }
        if ((i & 8) != 0) {
            list4 = newsfeedSearchExtendedResponse.suggestedQueries;
        }
        if ((i & 16) != 0) {
            str = newsfeedSearchExtendedResponse.nextFrom;
        }
        if ((i & 32) != 0) {
            num = newsfeedSearchExtendedResponse.count;
        }
        if ((i & 64) != 0) {
            num2 = newsfeedSearchExtendedResponse.totalCount;
        }
        Integer num3 = num;
        Integer num4 = num2;
        String str2 = str;
        List list5 = list3;
        return newsfeedSearchExtendedResponse.copy(list, list2, list5, list4, str2, num3, num4);
    }

    @Nullable
    public final List<WallWallpostFull> component1() {
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
    public final List<String> component4() {
        return this.suggestedQueries;
    }

    @Nullable
    public final String component5() {
        return this.nextFrom;
    }

    @Nullable
    public final Integer component6() {
        return this.count;
    }

    @Nullable
    public final Integer component7() {
        return this.totalCount;
    }

    @NotNull
    public final NewsfeedSearchExtendedResponse copy(@Nullable List<WallWallpostFull> list, @Nullable List<UsersUserFull> list2, @Nullable List<GroupsGroupFull> list3, @Nullable List<String> list4, @Nullable String str, @Nullable Integer num, @Nullable Integer num2) {
        return new NewsfeedSearchExtendedResponse(list, list2, list3, list4, str, num, num2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedSearchExtendedResponse)) {
            return false;
        }
        NewsfeedSearchExtendedResponse newsfeedSearchExtendedResponse = (NewsfeedSearchExtendedResponse) obj;
        return Intrinsics.a(this.items, newsfeedSearchExtendedResponse.items) && Intrinsics.a(this.profiles, newsfeedSearchExtendedResponse.profiles) && Intrinsics.a(this.groups, newsfeedSearchExtendedResponse.groups) && Intrinsics.a(this.suggestedQueries, newsfeedSearchExtendedResponse.suggestedQueries) && Intrinsics.a(this.nextFrom, newsfeedSearchExtendedResponse.nextFrom) && Intrinsics.a(this.count, newsfeedSearchExtendedResponse.count) && Intrinsics.a(this.totalCount, newsfeedSearchExtendedResponse.totalCount);
    }

    @Nullable
    public final Integer getCount() {
        return this.count;
    }

    @Nullable
    public final List<GroupsGroupFull> getGroups() {
        return this.groups;
    }

    @Nullable
    public final List<WallWallpostFull> getItems() {
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

    @Nullable
    public final List<String> getSuggestedQueries() {
        return this.suggestedQueries;
    }

    @Nullable
    public final Integer getTotalCount() {
        return this.totalCount;
    }

    public int hashCode() {
        List<WallWallpostFull> list = this.items;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<UsersUserFull> list2 = this.profiles;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<GroupsGroupFull> list3 = this.groups;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<String> list4 = this.suggestedQueries;
        int iHashCode4 = (iHashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str = this.nextFrom;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.count;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.totalCount;
        return iHashCode6 + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<WallWallpostFull> list = this.items;
        List<UsersUserFull> list2 = this.profiles;
        List<GroupsGroupFull> list3 = this.groups;
        List<String> list4 = this.suggestedQueries;
        String str = this.nextFrom;
        Integer num = this.count;
        Integer num2 = this.totalCount;
        StringBuilder sb2 = new StringBuilder("NewsfeedSearchExtendedResponse(items=");
        sb2.append(list);
        sb2.append(", profiles=");
        sb2.append(list2);
        sb2.append(", groups=");
        a.u(sb2, list3, ", suggestedQueries=", list4, ", nextFrom=");
        a.r(num, str, ", count=", ", totalCount=", sb2);
        return u.m(sb2, num2, ")");
    }

    public NewsfeedSearchExtendedResponse(@Nullable List<WallWallpostFull> list, @Nullable List<UsersUserFull> list2, @Nullable List<GroupsGroupFull> list3, @Nullable List<String> list4, @Nullable String str, @Nullable Integer num, @Nullable Integer num2) {
        this.items = list;
        this.profiles = list2;
        this.groups = list3;
        this.suggestedQueries = list4;
        this.nextFrom = str;
        this.count = num;
        this.totalCount = num2;
    }

    public /* synthetic */ NewsfeedSearchExtendedResponse(List list, List list2, List list3, List list4, String str, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3, (i & 8) != 0 ? null : list4, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : num2);
    }
}
