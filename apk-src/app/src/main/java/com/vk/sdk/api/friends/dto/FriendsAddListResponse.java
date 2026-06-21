package com.vk.sdk.api.friends.dto;

import a0.u;
import kotlin.Metadata;
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
public final class FriendsAddListResponse {

    @b("list_id")
    private final int listId;

    public FriendsAddListResponse(int i) {
        this.listId = i;
    }

    public static /* synthetic */ FriendsAddListResponse copy$default(FriendsAddListResponse friendsAddListResponse, int i, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = friendsAddListResponse.listId;
        }
        return friendsAddListResponse.copy(i);
    }

    public final int component1() {
        return this.listId;
    }

    @NotNull
    public final FriendsAddListResponse copy(int i) {
        return new FriendsAddListResponse(i);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FriendsAddListResponse) && this.listId == ((FriendsAddListResponse) obj).listId;
    }

    public final int getListId() {
        return this.listId;
    }

    public int hashCode() {
        return Integer.hashCode(this.listId);
    }

    @NotNull
    public String toString() {
        return u.k(this.listId, "FriendsAddListResponse(listId=", ")");
    }
}
