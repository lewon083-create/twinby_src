package com.vk.sdk.api.wall.dto;

import com.google.android.gms.internal.ads.om1;
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
public final class WallAppPost {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    @Nullable
    private final Integer f15254id;

    @b("name")
    @Nullable
    private final String name;

    @b("photo_130")
    @Nullable
    private final String photo130;

    @b("photo_604")
    @Nullable
    private final String photo604;

    public WallAppPost() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ WallAppPost copy$default(WallAppPost wallAppPost, Integer num, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = wallAppPost.f15254id;
        }
        if ((i & 2) != 0) {
            str = wallAppPost.name;
        }
        if ((i & 4) != 0) {
            str2 = wallAppPost.photo130;
        }
        if ((i & 8) != 0) {
            str3 = wallAppPost.photo604;
        }
        return wallAppPost.copy(num, str, str2, str3);
    }

    @Nullable
    public final Integer component1() {
        return this.f15254id;
    }

    @Nullable
    public final String component2() {
        return this.name;
    }

    @Nullable
    public final String component3() {
        return this.photo130;
    }

    @Nullable
    public final String component4() {
        return this.photo604;
    }

    @NotNull
    public final WallAppPost copy(@Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        return new WallAppPost(num, str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallAppPost)) {
            return false;
        }
        WallAppPost wallAppPost = (WallAppPost) obj;
        return Intrinsics.a(this.f15254id, wallAppPost.f15254id) && Intrinsics.a(this.name, wallAppPost.name) && Intrinsics.a(this.photo130, wallAppPost.photo130) && Intrinsics.a(this.photo604, wallAppPost.photo604);
    }

    @Nullable
    public final Integer getId() {
        return this.f15254id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getPhoto130() {
        return this.photo130;
    }

    @Nullable
    public final String getPhoto604() {
        return this.photo604;
    }

    public int hashCode() {
        Integer num = this.f15254id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.photo130;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.photo604;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.f15254id;
        String str = this.name;
        String str2 = this.photo130;
        String str3 = this.photo604;
        StringBuilder sb2 = new StringBuilder("WallAppPost(id=");
        sb2.append(num);
        sb2.append(", name=");
        sb2.append(str);
        sb2.append(", photo130=");
        return om1.n(sb2, str2, ", photo604=", str3, ")");
    }

    public WallAppPost(@Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.f15254id = num;
        this.name = str;
        this.photo130 = str2;
        this.photo604 = str3;
    }

    public /* synthetic */ WallAppPost(Integer num, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
