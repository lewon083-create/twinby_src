package com.vk.sdk.api.newsfeed.dto;

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
public final class NewsfeedGetBannedResponse {

    @b("groups")
    @Nullable
    private final List<Integer> groups;

    @b("members")
    @Nullable
    private final List<Integer> members;

    public NewsfeedGetBannedResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NewsfeedGetBannedResponse copy$default(NewsfeedGetBannedResponse newsfeedGetBannedResponse, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = newsfeedGetBannedResponse.groups;
        }
        if ((i & 2) != 0) {
            list2 = newsfeedGetBannedResponse.members;
        }
        return newsfeedGetBannedResponse.copy(list, list2);
    }

    @Nullable
    public final List<Integer> component1() {
        return this.groups;
    }

    @Nullable
    public final List<Integer> component2() {
        return this.members;
    }

    @NotNull
    public final NewsfeedGetBannedResponse copy(@Nullable List<Integer> list, @Nullable List<Integer> list2) {
        return new NewsfeedGetBannedResponse(list, list2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedGetBannedResponse)) {
            return false;
        }
        NewsfeedGetBannedResponse newsfeedGetBannedResponse = (NewsfeedGetBannedResponse) obj;
        return Intrinsics.a(this.groups, newsfeedGetBannedResponse.groups) && Intrinsics.a(this.members, newsfeedGetBannedResponse.members);
    }

    @Nullable
    public final List<Integer> getGroups() {
        return this.groups;
    }

    @Nullable
    public final List<Integer> getMembers() {
        return this.members;
    }

    public int hashCode() {
        List<Integer> list = this.groups;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<Integer> list2 = this.members;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "NewsfeedGetBannedResponse(groups=" + this.groups + ", members=" + this.members + ")";
    }

    public NewsfeedGetBannedResponse(@Nullable List<Integer> list, @Nullable List<Integer> list2) {
        this.groups = list;
        this.members = list2;
    }

    public /* synthetic */ NewsfeedGetBannedResponse(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }
}
