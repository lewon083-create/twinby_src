package com.vk.sdk.api.users.dto;

import com.vk.dto.common.id.UserId;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class UsersRelative {

    @b("birth_date")
    @Nullable
    private final String birthDate;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    @Nullable
    private final UserId f15242id;

    @b("name")
    @Nullable
    private final String name;

    @b("type")
    @NotNull
    private final Type type;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public enum Type {
        PARENT("parent"),
        CHILD("child"),
        GRANDPARENT("grandparent"),
        GRANDCHILD("grandchild"),
        SIBLING("sibling");


        @NotNull
        private final String value;

        Type(String str) {
            this.value = str;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    public UsersRelative(@NotNull Type type, @Nullable String str, @Nullable UserId userId, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.birthDate = str;
        this.f15242id = userId;
        this.name = str2;
    }

    public static /* synthetic */ UsersRelative copy$default(UsersRelative usersRelative, Type type, String str, UserId userId, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            type = usersRelative.type;
        }
        if ((i & 2) != 0) {
            str = usersRelative.birthDate;
        }
        if ((i & 4) != 0) {
            userId = usersRelative.f15242id;
        }
        if ((i & 8) != 0) {
            str2 = usersRelative.name;
        }
        return usersRelative.copy(type, str, userId, str2);
    }

    @NotNull
    public final Type component1() {
        return this.type;
    }

    @Nullable
    public final String component2() {
        return this.birthDate;
    }

    @Nullable
    public final UserId component3() {
        return this.f15242id;
    }

    @Nullable
    public final String component4() {
        return this.name;
    }

    @NotNull
    public final UsersRelative copy(@NotNull Type type, @Nullable String str, @Nullable UserId userId, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new UsersRelative(type, str, userId, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersRelative)) {
            return false;
        }
        UsersRelative usersRelative = (UsersRelative) obj;
        return this.type == usersRelative.type && Intrinsics.a(this.birthDate, usersRelative.birthDate) && Intrinsics.a(this.f15242id, usersRelative.f15242id) && Intrinsics.a(this.name, usersRelative.name);
    }

    @Nullable
    public final String getBirthDate() {
        return this.birthDate;
    }

    @Nullable
    public final UserId getId() {
        return this.f15242id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final Type getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        String str = this.birthDate;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        UserId userId = this.f15242id;
        int iHashCode3 = (iHashCode2 + (userId == null ? 0 : userId.hashCode())) * 31;
        String str2 = this.name;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UsersRelative(type=" + this.type + ", birthDate=" + this.birthDate + ", id=" + this.f15242id + ", name=" + this.name + ")";
    }

    public /* synthetic */ UsersRelative(Type type, String str, UserId userId, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(type, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : userId, (i & 8) != 0 ? null : str2);
    }
}
