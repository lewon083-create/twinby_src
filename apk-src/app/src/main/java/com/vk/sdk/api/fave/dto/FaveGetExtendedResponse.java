package com.vk.sdk.api.fave.dto;

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
public final class FaveGetExtendedResponse {

    @b("count")
    @Nullable
    private final Integer count;

    @b("groups")
    @Nullable
    private final List<GroupsGroup> groups;

    @b("items")
    @Nullable
    private final List<FaveBookmark> items;

    @b("profiles")
    @Nullable
    private final List<UsersUserFull> profiles;

    public FaveGetExtendedResponse() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FaveGetExtendedResponse copy$default(FaveGetExtendedResponse faveGetExtendedResponse, Integer num, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = faveGetExtendedResponse.count;
        }
        if ((i & 2) != 0) {
            list = faveGetExtendedResponse.items;
        }
        if ((i & 4) != 0) {
            list2 = faveGetExtendedResponse.profiles;
        }
        if ((i & 8) != 0) {
            list3 = faveGetExtendedResponse.groups;
        }
        return faveGetExtendedResponse.copy(num, list, list2, list3);
    }

    @Nullable
    public final Integer component1() {
        return this.count;
    }

    @Nullable
    public final List<FaveBookmark> component2() {
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

    @NotNull
    public final FaveGetExtendedResponse copy(@Nullable Integer num, @Nullable List<FaveBookmark> list, @Nullable List<UsersUserFull> list2, @Nullable List<GroupsGroup> list3) {
        return new FaveGetExtendedResponse(num, list, list2, list3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FaveGetExtendedResponse)) {
            return false;
        }
        FaveGetExtendedResponse faveGetExtendedResponse = (FaveGetExtendedResponse) obj;
        return Intrinsics.a(this.count, faveGetExtendedResponse.count) && Intrinsics.a(this.items, faveGetExtendedResponse.items) && Intrinsics.a(this.profiles, faveGetExtendedResponse.profiles) && Intrinsics.a(this.groups, faveGetExtendedResponse.groups);
    }

    @Nullable
    public final Integer getCount() {
        return this.count;
    }

    @Nullable
    public final List<GroupsGroup> getGroups() {
        return this.groups;
    }

    @Nullable
    public final List<FaveBookmark> getItems() {
        return this.items;
    }

    @Nullable
    public final List<UsersUserFull> getProfiles() {
        return this.profiles;
    }

    public int hashCode() {
        Integer num = this.count;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<FaveBookmark> list = this.items;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<UsersUserFull> list2 = this.profiles;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<GroupsGroup> list3 = this.groups;
        return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.count;
        List<FaveBookmark> list = this.items;
        List<UsersUserFull> list2 = this.profiles;
        List<GroupsGroup> list3 = this.groups;
        StringBuilder sb2 = new StringBuilder("FaveGetExtendedResponse(count=");
        sb2.append(num);
        sb2.append(", items=");
        sb2.append(list);
        sb2.append(", profiles=");
        return a.l(sb2, list2, ", groups=", list3, ")");
    }

    public FaveGetExtendedResponse(@Nullable Integer num, @Nullable List<FaveBookmark> list, @Nullable List<UsersUserFull> list2, @Nullable List<GroupsGroup> list3) {
        this.count = num;
        this.items = list;
        this.profiles = list2;
        this.groups = list3;
    }

    public /* synthetic */ FaveGetExtendedResponse(Integer num, List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3);
    }
}
