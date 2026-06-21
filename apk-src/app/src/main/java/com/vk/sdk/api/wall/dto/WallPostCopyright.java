package com.vk.sdk.api.wall.dto;

import com.vk.dto.common.id.UserId;
import gf.a;
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
public final class WallPostCopyright {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    @Nullable
    private final UserId f15257id;

    @b("link")
    @NotNull
    private final String link;

    @b("name")
    @NotNull
    private final String name;

    @b("type")
    @NotNull
    private final String type;

    public WallPostCopyright(@NotNull String link, @NotNull String name, @NotNull String type, @Nullable UserId userId) {
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        this.link = link;
        this.name = name;
        this.type = type;
        this.f15257id = userId;
    }

    public static /* synthetic */ WallPostCopyright copy$default(WallPostCopyright wallPostCopyright, String str, String str2, String str3, UserId userId, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wallPostCopyright.link;
        }
        if ((i & 2) != 0) {
            str2 = wallPostCopyright.name;
        }
        if ((i & 4) != 0) {
            str3 = wallPostCopyright.type;
        }
        if ((i & 8) != 0) {
            userId = wallPostCopyright.f15257id;
        }
        return wallPostCopyright.copy(str, str2, str3, userId);
    }

    @NotNull
    public final String component1() {
        return this.link;
    }

    @NotNull
    public final String component2() {
        return this.name;
    }

    @NotNull
    public final String component3() {
        return this.type;
    }

    @Nullable
    public final UserId component4() {
        return this.f15257id;
    }

    @NotNull
    public final WallPostCopyright copy(@NotNull String link, @NotNull String name, @NotNull String type, @Nullable UserId userId) {
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        return new WallPostCopyright(link, name, type, userId);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallPostCopyright)) {
            return false;
        }
        WallPostCopyright wallPostCopyright = (WallPostCopyright) obj;
        return Intrinsics.a(this.link, wallPostCopyright.link) && Intrinsics.a(this.name, wallPostCopyright.name) && Intrinsics.a(this.type, wallPostCopyright.type) && Intrinsics.a(this.f15257id, wallPostCopyright.f15257id);
    }

    @Nullable
    public final UserId getId() {
        return this.f15257id;
    }

    @NotNull
    public final String getLink() {
        return this.link;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iE = a.e(a.e(this.link.hashCode() * 31, 31, this.name), 31, this.type);
        UserId userId = this.f15257id;
        return iE + (userId == null ? 0 : userId.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.link;
        String str2 = this.name;
        String str3 = this.type;
        UserId userId = this.f15257id;
        StringBuilder sbJ = z.j("WallPostCopyright(link=", str, ", name=", str2, ", type=");
        sbJ.append(str3);
        sbJ.append(", id=");
        sbJ.append(userId);
        sbJ.append(")");
        return sbJ.toString();
    }

    public /* synthetic */ WallPostCopyright(String str, String str2, String str3, UserId userId, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : userId);
    }
}
