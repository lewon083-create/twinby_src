package com.vk.sdk.api.messages.dto;

import a0.u;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.users.dto.UsersUserFull;
import gf.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ne.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t.z;

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
public final class MessagesGetIntentUsersResponse {

    @b("count")
    private final int count;

    @b("items")
    @NotNull
    private final List<UserId> items;

    @b("profiles")
    @Nullable
    private final List<UsersUserFull> profiles;

    public MessagesGetIntentUsersResponse(int i, @NotNull List<UserId> items, @Nullable List<UsersUserFull> list) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.count = i;
        this.items = items;
        this.profiles = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MessagesGetIntentUsersResponse copy$default(MessagesGetIntentUsersResponse messagesGetIntentUsersResponse, int i, List list, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = messagesGetIntentUsersResponse.count;
        }
        if ((i10 & 2) != 0) {
            list = messagesGetIntentUsersResponse.items;
        }
        if ((i10 & 4) != 0) {
            list2 = messagesGetIntentUsersResponse.profiles;
        }
        return messagesGetIntentUsersResponse.copy(i, list, list2);
    }

    public final int component1() {
        return this.count;
    }

    @NotNull
    public final List<UserId> component2() {
        return this.items;
    }

    @Nullable
    public final List<UsersUserFull> component3() {
        return this.profiles;
    }

    @NotNull
    public final MessagesGetIntentUsersResponse copy(int i, @NotNull List<UserId> items, @Nullable List<UsersUserFull> list) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new MessagesGetIntentUsersResponse(i, items, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesGetIntentUsersResponse)) {
            return false;
        }
        MessagesGetIntentUsersResponse messagesGetIntentUsersResponse = (MessagesGetIntentUsersResponse) obj;
        return this.count == messagesGetIntentUsersResponse.count && Intrinsics.a(this.items, messagesGetIntentUsersResponse.items) && Intrinsics.a(this.profiles, messagesGetIntentUsersResponse.profiles);
    }

    public final int getCount() {
        return this.count;
    }

    @NotNull
    public final List<UserId> getItems() {
        return this.items;
    }

    @Nullable
    public final List<UsersUserFull> getProfiles() {
        return this.profiles;
    }

    public int hashCode() {
        int i = u.i(this.items, Integer.hashCode(this.count) * 31, 31);
        List<UsersUserFull> list = this.profiles;
        return i + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        int i = this.count;
        List<UserId> list = this.items;
        return z.h(a.m(i, "MessagesGetIntentUsersResponse(count=", ", items=", ", profiles=", list), this.profiles, ")");
    }

    public /* synthetic */ MessagesGetIntentUsersResponse(int i, List list, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, list, (i10 & 4) != 0 ? null : list2);
    }
}
