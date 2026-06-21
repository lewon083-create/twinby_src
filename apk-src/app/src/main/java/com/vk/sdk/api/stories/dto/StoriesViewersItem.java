package com.vk.sdk.api.stories.dto;

import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.users.dto.UsersUserFull;
import io.sentry.SentryBaseEvent;
import io.sentry.TraceContext;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l7.o;
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
public final class StoriesViewersItem {

    @b("is_liked")
    private final boolean isLiked;

    @b(SentryBaseEvent.JsonKeys.USER)
    @Nullable
    private final UsersUserFull user;

    @b(TraceContext.JsonKeys.USER_ID)
    @NotNull
    private final UserId userId;

    public StoriesViewersItem(boolean z5, @NotNull UserId userId, @Nullable UsersUserFull usersUserFull) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.isLiked = z5;
        this.userId = userId;
        this.user = usersUserFull;
    }

    public static /* synthetic */ StoriesViewersItem copy$default(StoriesViewersItem storiesViewersItem, boolean z5, UserId userId, UsersUserFull usersUserFull, int i, Object obj) {
        if ((i & 1) != 0) {
            z5 = storiesViewersItem.isLiked;
        }
        if ((i & 2) != 0) {
            userId = storiesViewersItem.userId;
        }
        if ((i & 4) != 0) {
            usersUserFull = storiesViewersItem.user;
        }
        return storiesViewersItem.copy(z5, userId, usersUserFull);
    }

    public final boolean component1() {
        return this.isLiked;
    }

    @NotNull
    public final UserId component2() {
        return this.userId;
    }

    @Nullable
    public final UsersUserFull component3() {
        return this.user;
    }

    @NotNull
    public final StoriesViewersItem copy(boolean z5, @NotNull UserId userId, @Nullable UsersUserFull usersUserFull) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        return new StoriesViewersItem(z5, userId, usersUserFull);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesViewersItem)) {
            return false;
        }
        StoriesViewersItem storiesViewersItem = (StoriesViewersItem) obj;
        return this.isLiked == storiesViewersItem.isLiked && Intrinsics.a(this.userId, storiesViewersItem.userId) && Intrinsics.a(this.user, storiesViewersItem.user);
    }

    @Nullable
    public final UsersUserFull getUser() {
        return this.user;
    }

    @NotNull
    public final UserId getUserId() {
        return this.userId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public int hashCode() {
        boolean z5 = this.isLiked;
        ?? r02 = z5;
        if (z5) {
            r02 = 1;
        }
        int iE = o.e(this.userId, r02 * 31, 31);
        UsersUserFull usersUserFull = this.user;
        return iE + (usersUserFull == null ? 0 : usersUserFull.hashCode());
    }

    public final boolean isLiked() {
        return this.isLiked;
    }

    @NotNull
    public String toString() {
        return "StoriesViewersItem(isLiked=" + this.isLiked + ", userId=" + this.userId + ", user=" + this.user + ")";
    }

    public /* synthetic */ StoriesViewersItem(boolean z5, UserId userId, UsersUserFull usersUserFull, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z5, userId, (i & 4) != 0 ? null : usersUserFull);
    }
}
