package com.vk.sdk.api.users.dto;

import com.vk.dto.common.id.UserId;
import gf.a;
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
public final class UsersUserMin {

    @b("can_access_closed")
    @Nullable
    private final Boolean canAccessClosed;

    @b("deactivated")
    @Nullable
    private final String deactivated;

    @b("first_name")
    @Nullable
    private final String firstName;

    @b("hidden")
    @Nullable
    private final Integer hidden;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    @NotNull
    private final UserId f15249id;

    @b("is_closed")
    @Nullable
    private final Boolean isClosed;

    @b("last_name")
    @Nullable
    private final String lastName;

    public UsersUserMin(@NotNull UserId id2, @Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3, @Nullable Boolean bool, @Nullable Boolean bool2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.f15249id = id2;
        this.deactivated = str;
        this.firstName = str2;
        this.hidden = num;
        this.lastName = str3;
        this.canAccessClosed = bool;
        this.isClosed = bool2;
    }

    public static /* synthetic */ UsersUserMin copy$default(UsersUserMin usersUserMin, UserId userId, String str, String str2, Integer num, String str3, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            userId = usersUserMin.f15249id;
        }
        if ((i & 2) != 0) {
            str = usersUserMin.deactivated;
        }
        if ((i & 4) != 0) {
            str2 = usersUserMin.firstName;
        }
        if ((i & 8) != 0) {
            num = usersUserMin.hidden;
        }
        if ((i & 16) != 0) {
            str3 = usersUserMin.lastName;
        }
        if ((i & 32) != 0) {
            bool = usersUserMin.canAccessClosed;
        }
        if ((i & 64) != 0) {
            bool2 = usersUserMin.isClosed;
        }
        Boolean bool3 = bool;
        Boolean bool4 = bool2;
        String str4 = str3;
        String str5 = str2;
        return usersUserMin.copy(userId, str, str5, num, str4, bool3, bool4);
    }

    @NotNull
    public final UserId component1() {
        return this.f15249id;
    }

    @Nullable
    public final String component2() {
        return this.deactivated;
    }

    @Nullable
    public final String component3() {
        return this.firstName;
    }

    @Nullable
    public final Integer component4() {
        return this.hidden;
    }

    @Nullable
    public final String component5() {
        return this.lastName;
    }

    @Nullable
    public final Boolean component6() {
        return this.canAccessClosed;
    }

    @Nullable
    public final Boolean component7() {
        return this.isClosed;
    }

    @NotNull
    public final UsersUserMin copy(@NotNull UserId id2, @Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3, @Nullable Boolean bool, @Nullable Boolean bool2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return new UsersUserMin(id2, str, str2, num, str3, bool, bool2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersUserMin)) {
            return false;
        }
        UsersUserMin usersUserMin = (UsersUserMin) obj;
        return Intrinsics.a(this.f15249id, usersUserMin.f15249id) && Intrinsics.a(this.deactivated, usersUserMin.deactivated) && Intrinsics.a(this.firstName, usersUserMin.firstName) && Intrinsics.a(this.hidden, usersUserMin.hidden) && Intrinsics.a(this.lastName, usersUserMin.lastName) && Intrinsics.a(this.canAccessClosed, usersUserMin.canAccessClosed) && Intrinsics.a(this.isClosed, usersUserMin.isClosed);
    }

    @Nullable
    public final Boolean getCanAccessClosed() {
        return this.canAccessClosed;
    }

    @Nullable
    public final String getDeactivated() {
        return this.deactivated;
    }

    @Nullable
    public final String getFirstName() {
        return this.firstName;
    }

    @Nullable
    public final Integer getHidden() {
        return this.hidden;
    }

    @NotNull
    public final UserId getId() {
        return this.f15249id;
    }

    @Nullable
    public final String getLastName() {
        return this.lastName;
    }

    public int hashCode() {
        int iHashCode = this.f15249id.hashCode() * 31;
        String str = this.deactivated;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.firstName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.hidden;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.lastName;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.canAccessClosed;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isClosed;
        return iHashCode6 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @Nullable
    public final Boolean isClosed() {
        return this.isClosed;
    }

    @NotNull
    public String toString() {
        UserId userId = this.f15249id;
        String str = this.deactivated;
        String str2 = this.firstName;
        Integer num = this.hidden;
        String str3 = this.lastName;
        Boolean bool = this.canAccessClosed;
        Boolean bool2 = this.isClosed;
        StringBuilder sb2 = new StringBuilder("UsersUserMin(id=");
        sb2.append(userId);
        sb2.append(", deactivated=");
        sb2.append(str);
        sb2.append(", firstName=");
        a.r(num, str2, ", hidden=", ", lastName=", sb2);
        sb2.append(str3);
        sb2.append(", canAccessClosed=");
        sb2.append(bool);
        sb2.append(", isClosed=");
        sb2.append(bool2);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ UsersUserMin(UserId userId, String str, String str2, Integer num, String str3, Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(userId, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : bool2);
    }
}
