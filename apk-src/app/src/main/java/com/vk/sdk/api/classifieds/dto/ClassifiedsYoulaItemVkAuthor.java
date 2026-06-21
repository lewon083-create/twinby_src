package com.vk.sdk.api.classifieds.dto;

import com.vk.dto.common.id.UserId;
import gf.a;
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
public final class ClassifiedsYoulaItemVkAuthor {

    @b("active_items_count")
    @Nullable
    private final Integer activeItemsCount;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    @NotNull
    private final UserId f15156id;

    @b("name")
    @NotNull
    private final String name;

    @b("photo_url")
    @Nullable
    private final String photoUrl;

    @b("profile_link")
    @NotNull
    private final String profileLink;

    @b("seller_profile_url")
    @Nullable
    private final String sellerProfileUrl;

    public ClassifiedsYoulaItemVkAuthor(@NotNull UserId id2, @NotNull String name, @NotNull String profileLink, @Nullable String str, @Nullable String str2, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(profileLink, "profileLink");
        this.f15156id = id2;
        this.name = name;
        this.profileLink = profileLink;
        this.sellerProfileUrl = str;
        this.photoUrl = str2;
        this.activeItemsCount = num;
    }

    public static /* synthetic */ ClassifiedsYoulaItemVkAuthor copy$default(ClassifiedsYoulaItemVkAuthor classifiedsYoulaItemVkAuthor, UserId userId, String str, String str2, String str3, String str4, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            userId = classifiedsYoulaItemVkAuthor.f15156id;
        }
        if ((i & 2) != 0) {
            str = classifiedsYoulaItemVkAuthor.name;
        }
        if ((i & 4) != 0) {
            str2 = classifiedsYoulaItemVkAuthor.profileLink;
        }
        if ((i & 8) != 0) {
            str3 = classifiedsYoulaItemVkAuthor.sellerProfileUrl;
        }
        if ((i & 16) != 0) {
            str4 = classifiedsYoulaItemVkAuthor.photoUrl;
        }
        if ((i & 32) != 0) {
            num = classifiedsYoulaItemVkAuthor.activeItemsCount;
        }
        String str5 = str4;
        Integer num2 = num;
        return classifiedsYoulaItemVkAuthor.copy(userId, str, str2, str3, str5, num2);
    }

    @NotNull
    public final UserId component1() {
        return this.f15156id;
    }

    @NotNull
    public final String component2() {
        return this.name;
    }

    @NotNull
    public final String component3() {
        return this.profileLink;
    }

    @Nullable
    public final String component4() {
        return this.sellerProfileUrl;
    }

    @Nullable
    public final String component5() {
        return this.photoUrl;
    }

    @Nullable
    public final Integer component6() {
        return this.activeItemsCount;
    }

    @NotNull
    public final ClassifiedsYoulaItemVkAuthor copy(@NotNull UserId id2, @NotNull String name, @NotNull String profileLink, @Nullable String str, @Nullable String str2, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(profileLink, "profileLink");
        return new ClassifiedsYoulaItemVkAuthor(id2, name, profileLink, str, str2, num);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassifiedsYoulaItemVkAuthor)) {
            return false;
        }
        ClassifiedsYoulaItemVkAuthor classifiedsYoulaItemVkAuthor = (ClassifiedsYoulaItemVkAuthor) obj;
        return Intrinsics.a(this.f15156id, classifiedsYoulaItemVkAuthor.f15156id) && Intrinsics.a(this.name, classifiedsYoulaItemVkAuthor.name) && Intrinsics.a(this.profileLink, classifiedsYoulaItemVkAuthor.profileLink) && Intrinsics.a(this.sellerProfileUrl, classifiedsYoulaItemVkAuthor.sellerProfileUrl) && Intrinsics.a(this.photoUrl, classifiedsYoulaItemVkAuthor.photoUrl) && Intrinsics.a(this.activeItemsCount, classifiedsYoulaItemVkAuthor.activeItemsCount);
    }

    @Nullable
    public final Integer getActiveItemsCount() {
        return this.activeItemsCount;
    }

    @NotNull
    public final UserId getId() {
        return this.f15156id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    @NotNull
    public final String getProfileLink() {
        return this.profileLink;
    }

    @Nullable
    public final String getSellerProfileUrl() {
        return this.sellerProfileUrl;
    }

    public int hashCode() {
        int iE = a.e(a.e(this.f15156id.hashCode() * 31, 31, this.name), 31, this.profileLink);
        String str = this.sellerProfileUrl;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.photoUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.activeItemsCount;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        UserId userId = this.f15156id;
        String str = this.name;
        String str2 = this.profileLink;
        String str3 = this.sellerProfileUrl;
        String str4 = this.photoUrl;
        Integer num = this.activeItemsCount;
        StringBuilder sb2 = new StringBuilder("ClassifiedsYoulaItemVkAuthor(id=");
        sb2.append(userId);
        sb2.append(", name=");
        sb2.append(str);
        sb2.append(", profileLink=");
        o.t(sb2, str2, ", sellerProfileUrl=", str3, ", photoUrl=");
        sb2.append(str4);
        sb2.append(", activeItemsCount=");
        sb2.append(num);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ ClassifiedsYoulaItemVkAuthor(UserId userId, String str, String str2, String str3, String str4, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(userId, str, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : num);
    }
}
