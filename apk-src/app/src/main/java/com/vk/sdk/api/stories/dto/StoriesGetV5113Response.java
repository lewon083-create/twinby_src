package com.vk.sdk.api.stories.dto;

import a0.u;
import com.vk.sdk.api.groups.dto.GroupsGroup;
import com.vk.sdk.api.users.dto.UsersUserFull;
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
public final class StoriesGetV5113Response {

    @b("count")
    private final int count;

    @b("groups")
    @Nullable
    private final List<GroupsGroup> groups;

    @b("items")
    @NotNull
    private final List<StoriesFeedItem> items;

    @b("need_upload_screen")
    @Nullable
    private final Boolean needUploadScreen;

    @b("profiles")
    @Nullable
    private final List<UsersUserFull> profiles;

    public StoriesGetV5113Response(int i, @NotNull List<StoriesFeedItem> items, @Nullable List<UsersUserFull> list, @Nullable List<GroupsGroup> list2, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.count = i;
        this.items = items;
        this.profiles = list;
        this.groups = list2;
        this.needUploadScreen = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StoriesGetV5113Response copy$default(StoriesGetV5113Response storiesGetV5113Response, int i, List list, List list2, List list3, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = storiesGetV5113Response.count;
        }
        if ((i10 & 2) != 0) {
            list = storiesGetV5113Response.items;
        }
        if ((i10 & 4) != 0) {
            list2 = storiesGetV5113Response.profiles;
        }
        if ((i10 & 8) != 0) {
            list3 = storiesGetV5113Response.groups;
        }
        if ((i10 & 16) != 0) {
            bool = storiesGetV5113Response.needUploadScreen;
        }
        Boolean bool2 = bool;
        List list4 = list2;
        return storiesGetV5113Response.copy(i, list, list4, list3, bool2);
    }

    public final int component1() {
        return this.count;
    }

    @NotNull
    public final List<StoriesFeedItem> component2() {
        return this.items;
    }

    @Nullable
    public final List<UsersUserFull> component3() {
        return this.profiles;
    }

    @Nullable
    public final List<GroupsGroup> component4() {
        return this.groups;
    }

    @Nullable
    public final Boolean component5() {
        return this.needUploadScreen;
    }

    @NotNull
    public final StoriesGetV5113Response copy(int i, @NotNull List<StoriesFeedItem> items, @Nullable List<UsersUserFull> list, @Nullable List<GroupsGroup> list2, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new StoriesGetV5113Response(i, items, list, list2, bool);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesGetV5113Response)) {
            return false;
        }
        StoriesGetV5113Response storiesGetV5113Response = (StoriesGetV5113Response) obj;
        return this.count == storiesGetV5113Response.count && Intrinsics.a(this.items, storiesGetV5113Response.items) && Intrinsics.a(this.profiles, storiesGetV5113Response.profiles) && Intrinsics.a(this.groups, storiesGetV5113Response.groups) && Intrinsics.a(this.needUploadScreen, storiesGetV5113Response.needUploadScreen);
    }

    public final int getCount() {
        return this.count;
    }

    @Nullable
    public final List<GroupsGroup> getGroups() {
        return this.groups;
    }

    @NotNull
    public final List<StoriesFeedItem> getItems() {
        return this.items;
    }

    @Nullable
    public final Boolean getNeedUploadScreen() {
        return this.needUploadScreen;
    }

    @Nullable
    public final List<UsersUserFull> getProfiles() {
        return this.profiles;
    }

    public int hashCode() {
        int i = u.i(this.items, Integer.hashCode(this.count) * 31, 31);
        List<UsersUserFull> list = this.profiles;
        int iHashCode = (i + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroup> list2 = this.groups;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.needUploadScreen;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.count;
        List<StoriesFeedItem> list = this.items;
        List<UsersUserFull> list2 = this.profiles;
        List<GroupsGroup> list3 = this.groups;
        Boolean bool = this.needUploadScreen;
        StringBuilder sbM = a.m(i, "StoriesGetV5113Response(count=", ", items=", ", profiles=", list);
        a.u(sbM, list2, ", groups=", list3, ", needUploadScreen=");
        sbM.append(bool);
        sbM.append(")");
        return sbM.toString();
    }

    public /* synthetic */ StoriesGetV5113Response(int i, List list, List list2, List list3, Boolean bool, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, list, (i10 & 4) != 0 ? null : list2, (i10 & 8) != 0 ? null : list3, (i10 & 16) != 0 ? null : bool);
    }
}
