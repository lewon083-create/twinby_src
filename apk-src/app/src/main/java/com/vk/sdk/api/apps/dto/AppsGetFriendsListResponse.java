package com.vk.sdk.api.apps.dto;

import com.vk.dto.common.id.UserId;
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
public final class AppsGetFriendsListResponse {

    @b("count")
    private final int count;

    @b("items")
    @Nullable
    private final List<UserId> items;

    public AppsGetFriendsListResponse(int i, @Nullable List<UserId> list) {
        this.count = i;
        this.items = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AppsGetFriendsListResponse copy$default(AppsGetFriendsListResponse appsGetFriendsListResponse, int i, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = appsGetFriendsListResponse.count;
        }
        if ((i10 & 2) != 0) {
            list = appsGetFriendsListResponse.items;
        }
        return appsGetFriendsListResponse.copy(i, list);
    }

    public final int component1() {
        return this.count;
    }

    @Nullable
    public final List<UserId> component2() {
        return this.items;
    }

    @NotNull
    public final AppsGetFriendsListResponse copy(int i, @Nullable List<UserId> list) {
        return new AppsGetFriendsListResponse(i, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsGetFriendsListResponse)) {
            return false;
        }
        AppsGetFriendsListResponse appsGetFriendsListResponse = (AppsGetFriendsListResponse) obj;
        return this.count == appsGetFriendsListResponse.count && Intrinsics.a(this.items, appsGetFriendsListResponse.items);
    }

    public final int getCount() {
        return this.count;
    }

    @Nullable
    public final List<UserId> getItems() {
        return this.items;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.count) * 31;
        List<UserId> list = this.items;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        return a.h(this.count, "AppsGetFriendsListResponse(count=", ", items=", ")", this.items);
    }

    public /* synthetic */ AppsGetFriendsListResponse(int i, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i10 & 2) != 0 ? null : list);
    }
}
