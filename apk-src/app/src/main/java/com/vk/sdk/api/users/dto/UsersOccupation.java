package com.vk.sdk.api.users.dto;

import a0.u;
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
public final class UsersOccupation {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    @Nullable
    private final Integer f15241id;

    @b("name")
    @Nullable
    private final String name;

    @b("type")
    @Nullable
    private final String type;

    public UsersOccupation() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ UsersOccupation copy$default(UsersOccupation usersOccupation, Integer num, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = usersOccupation.f15241id;
        }
        if ((i & 2) != 0) {
            str = usersOccupation.name;
        }
        if ((i & 4) != 0) {
            str2 = usersOccupation.type;
        }
        return usersOccupation.copy(num, str, str2);
    }

    @Nullable
    public final Integer component1() {
        return this.f15241id;
    }

    @Nullable
    public final String component2() {
        return this.name;
    }

    @Nullable
    public final String component3() {
        return this.type;
    }

    @NotNull
    public final UsersOccupation copy(@Nullable Integer num, @Nullable String str, @Nullable String str2) {
        return new UsersOccupation(num, str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersOccupation)) {
            return false;
        }
        UsersOccupation usersOccupation = (UsersOccupation) obj;
        return Intrinsics.a(this.f15241id, usersOccupation.f15241id) && Intrinsics.a(this.name, usersOccupation.name) && Intrinsics.a(this.type, usersOccupation.type);
    }

    @Nullable
    public final Integer getId() {
        return this.f15241id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        Integer num = this.f15241id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.type;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.f15241id;
        String str = this.name;
        String str2 = this.type;
        StringBuilder sb2 = new StringBuilder("UsersOccupation(id=");
        sb2.append(num);
        sb2.append(", name=");
        sb2.append(str);
        sb2.append(", type=");
        return u.o(sb2, str2, ")");
    }

    public UsersOccupation(@Nullable Integer num, @Nullable String str, @Nullable String str2) {
        this.f15241id = num;
        this.name = str;
        this.type = str2;
    }

    public /* synthetic */ UsersOccupation(Integer num, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
