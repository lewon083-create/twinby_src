package com.vk.sdk.api.newsfeed.dto;

import a0.u;
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
public final class NewsfeedGetCommentsResponse {

    @b("groups")
    @NotNull
    private final List<GroupsGroupFull> groups;

    @b("items")
    @NotNull
    private final List<NewsfeedNewsfeedItem> items;

    @b("next_from")
    @Nullable
    private final String nextFrom;

    @b("profiles")
    @NotNull
    private final List<UsersUserFull> profiles;

    /* JADX WARN: Multi-variable type inference failed */
    public NewsfeedGetCommentsResponse(@NotNull List<? extends NewsfeedNewsfeedItem> items, @NotNull List<UsersUserFull> profiles, @NotNull List<GroupsGroupFull> groups, @Nullable String str) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(profiles, "profiles");
        Intrinsics.checkNotNullParameter(groups, "groups");
        this.items = items;
        this.profiles = profiles;
        this.groups = groups;
        this.nextFrom = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NewsfeedGetCommentsResponse copy$default(NewsfeedGetCommentsResponse newsfeedGetCommentsResponse, List list, List list2, List list3, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = newsfeedGetCommentsResponse.items;
        }
        if ((i & 2) != 0) {
            list2 = newsfeedGetCommentsResponse.profiles;
        }
        if ((i & 4) != 0) {
            list3 = newsfeedGetCommentsResponse.groups;
        }
        if ((i & 8) != 0) {
            str = newsfeedGetCommentsResponse.nextFrom;
        }
        return newsfeedGetCommentsResponse.copy(list, list2, list3, str);
    }

    @NotNull
    public final List<NewsfeedNewsfeedItem> component1() {
        return this.items;
    }

    @NotNull
    public final List<UsersUserFull> component2() {
        return this.profiles;
    }

    @NotNull
    public final List<GroupsGroupFull> component3() {
        return this.groups;
    }

    @Nullable
    public final String component4() {
        return this.nextFrom;
    }

    @NotNull
    public final NewsfeedGetCommentsResponse copy(@NotNull List<? extends NewsfeedNewsfeedItem> items, @NotNull List<UsersUserFull> profiles, @NotNull List<GroupsGroupFull> groups, @Nullable String str) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(profiles, "profiles");
        Intrinsics.checkNotNullParameter(groups, "groups");
        return new NewsfeedGetCommentsResponse(items, profiles, groups, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedGetCommentsResponse)) {
            return false;
        }
        NewsfeedGetCommentsResponse newsfeedGetCommentsResponse = (NewsfeedGetCommentsResponse) obj;
        return Intrinsics.a(this.items, newsfeedGetCommentsResponse.items) && Intrinsics.a(this.profiles, newsfeedGetCommentsResponse.profiles) && Intrinsics.a(this.groups, newsfeedGetCommentsResponse.groups) && Intrinsics.a(this.nextFrom, newsfeedGetCommentsResponse.nextFrom);
    }

    @NotNull
    public final List<GroupsGroupFull> getGroups() {
        return this.groups;
    }

    @NotNull
    public final List<NewsfeedNewsfeedItem> getItems() {
        return this.items;
    }

    @Nullable
    public final String getNextFrom() {
        return this.nextFrom;
    }

    @NotNull
    public final List<UsersUserFull> getProfiles() {
        return this.profiles;
    }

    public int hashCode() {
        int i = u.i(this.groups, u.i(this.profiles, this.items.hashCode() * 31, 31), 31);
        String str = this.nextFrom;
        return i + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "NewsfeedGetCommentsResponse(items=" + this.items + ", profiles=" + this.profiles + ", groups=" + this.groups + ", nextFrom=" + this.nextFrom + ")";
    }

    public /* synthetic */ NewsfeedGetCommentsResponse(List list, List list2, List list3, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, list3, (i & 8) != 0 ? null : str);
    }
}
