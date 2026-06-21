package com.vk.sdk.api.friends.dto;

import a0.u;
import com.vk.dto.common.id.UserId;
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
public final class FriendsGetRequestsResponse {

    @b("count")
    @Nullable
    private final Integer count;

    @b("count_unread")
    @Nullable
    private final Integer countUnread;

    @b("items")
    @Nullable
    private final List<UserId> items;

    public FriendsGetRequestsResponse() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FriendsGetRequestsResponse copy$default(FriendsGetRequestsResponse friendsGetRequestsResponse, Integer num, List list, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = friendsGetRequestsResponse.count;
        }
        if ((i & 2) != 0) {
            list = friendsGetRequestsResponse.items;
        }
        if ((i & 4) != 0) {
            num2 = friendsGetRequestsResponse.countUnread;
        }
        return friendsGetRequestsResponse.copy(num, list, num2);
    }

    @Nullable
    public final Integer component1() {
        return this.count;
    }

    @Nullable
    public final List<UserId> component2() {
        return this.items;
    }

    @Nullable
    public final Integer component3() {
        return this.countUnread;
    }

    @NotNull
    public final FriendsGetRequestsResponse copy(@Nullable Integer num, @Nullable List<UserId> list, @Nullable Integer num2) {
        return new FriendsGetRequestsResponse(num, list, num2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsGetRequestsResponse)) {
            return false;
        }
        FriendsGetRequestsResponse friendsGetRequestsResponse = (FriendsGetRequestsResponse) obj;
        return Intrinsics.a(this.count, friendsGetRequestsResponse.count) && Intrinsics.a(this.items, friendsGetRequestsResponse.items) && Intrinsics.a(this.countUnread, friendsGetRequestsResponse.countUnread);
    }

    @Nullable
    public final Integer getCount() {
        return this.count;
    }

    @Nullable
    public final Integer getCountUnread() {
        return this.countUnread;
    }

    @Nullable
    public final List<UserId> getItems() {
        return this.items;
    }

    public int hashCode() {
        Integer num = this.count;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<UserId> list = this.items;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.countUnread;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.count;
        List<UserId> list = this.items;
        Integer num2 = this.countUnread;
        StringBuilder sb2 = new StringBuilder("FriendsGetRequestsResponse(count=");
        sb2.append(num);
        sb2.append(", items=");
        sb2.append(list);
        sb2.append(", countUnread=");
        return u.m(sb2, num2, ")");
    }

    public FriendsGetRequestsResponse(@Nullable Integer num, @Nullable List<UserId> list, @Nullable Integer num2) {
        this.count = num;
        this.items = list;
        this.countUnread = num2;
    }

    public /* synthetic */ FriendsGetRequestsResponse(Integer num, List list, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : num2);
    }
}
