package com.vk.sdk.api.fave.dto;

import a0.u;
import com.vk.sdk.api.groups.dto.GroupsGroupFull;
import com.vk.sdk.api.users.dto.UsersUserFull;
import io.sentry.SentryBaseEvent;
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
public final class FavePage {

    @b("description")
    @NotNull
    private final String description;

    @b("group")
    @Nullable
    private final GroupsGroupFull group;

    @b("tags")
    @NotNull
    private final List<FaveTag> tags;

    @b("type")
    @NotNull
    private final FavePageType type;

    @b("updated_date")
    @Nullable
    private final Integer updatedDate;

    @b(SentryBaseEvent.JsonKeys.USER)
    @Nullable
    private final UsersUserFull user;

    public FavePage(@NotNull String description, @NotNull List<FaveTag> tags, @NotNull FavePageType type, @Nullable GroupsGroupFull groupsGroupFull, @Nullable Integer num, @Nullable UsersUserFull usersUserFull) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(type, "type");
        this.description = description;
        this.tags = tags;
        this.type = type;
        this.group = groupsGroupFull;
        this.updatedDate = num;
        this.user = usersUserFull;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FavePage copy$default(FavePage favePage, String str, List list, FavePageType favePageType, GroupsGroupFull groupsGroupFull, Integer num, UsersUserFull usersUserFull, int i, Object obj) {
        if ((i & 1) != 0) {
            str = favePage.description;
        }
        if ((i & 2) != 0) {
            list = favePage.tags;
        }
        if ((i & 4) != 0) {
            favePageType = favePage.type;
        }
        if ((i & 8) != 0) {
            groupsGroupFull = favePage.group;
        }
        if ((i & 16) != 0) {
            num = favePage.updatedDate;
        }
        if ((i & 32) != 0) {
            usersUserFull = favePage.user;
        }
        Integer num2 = num;
        UsersUserFull usersUserFull2 = usersUserFull;
        return favePage.copy(str, list, favePageType, groupsGroupFull, num2, usersUserFull2);
    }

    @NotNull
    public final String component1() {
        return this.description;
    }

    @NotNull
    public final List<FaveTag> component2() {
        return this.tags;
    }

    @NotNull
    public final FavePageType component3() {
        return this.type;
    }

    @Nullable
    public final GroupsGroupFull component4() {
        return this.group;
    }

    @Nullable
    public final Integer component5() {
        return this.updatedDate;
    }

    @Nullable
    public final UsersUserFull component6() {
        return this.user;
    }

    @NotNull
    public final FavePage copy(@NotNull String description, @NotNull List<FaveTag> tags, @NotNull FavePageType type, @Nullable GroupsGroupFull groupsGroupFull, @Nullable Integer num, @Nullable UsersUserFull usersUserFull) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(type, "type");
        return new FavePage(description, tags, type, groupsGroupFull, num, usersUserFull);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FavePage)) {
            return false;
        }
        FavePage favePage = (FavePage) obj;
        return Intrinsics.a(this.description, favePage.description) && Intrinsics.a(this.tags, favePage.tags) && this.type == favePage.type && Intrinsics.a(this.group, favePage.group) && Intrinsics.a(this.updatedDate, favePage.updatedDate) && Intrinsics.a(this.user, favePage.user);
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final GroupsGroupFull getGroup() {
        return this.group;
    }

    @NotNull
    public final List<FaveTag> getTags() {
        return this.tags;
    }

    @NotNull
    public final FavePageType getType() {
        return this.type;
    }

    @Nullable
    public final Integer getUpdatedDate() {
        return this.updatedDate;
    }

    @Nullable
    public final UsersUserFull getUser() {
        return this.user;
    }

    public int hashCode() {
        int iHashCode = (this.type.hashCode() + u.i(this.tags, this.description.hashCode() * 31, 31)) * 31;
        GroupsGroupFull groupsGroupFull = this.group;
        int iHashCode2 = (iHashCode + (groupsGroupFull == null ? 0 : groupsGroupFull.hashCode())) * 31;
        Integer num = this.updatedDate;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        UsersUserFull usersUserFull = this.user;
        return iHashCode3 + (usersUserFull != null ? usersUserFull.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FavePage(description=" + this.description + ", tags=" + this.tags + ", type=" + this.type + ", group=" + this.group + ", updatedDate=" + this.updatedDate + ", user=" + this.user + ")";
    }

    public /* synthetic */ FavePage(String str, List list, FavePageType favePageType, GroupsGroupFull groupsGroupFull, Integer num, UsersUserFull usersUserFull, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, favePageType, (i & 8) != 0 ? null : groupsGroupFull, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : usersUserFull);
    }
}
