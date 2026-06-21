package com.vk.sdk.api.classifieds.dto;

import a0.u;
import com.vk.dto.common.id.UserId;
import gf.a;
import java.util.List;
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
public final class ClassifiedsYoulaGroupsBlockItem {

    @b("group_id")
    @NotNull
    private final UserId groupId;

    @b("has_new")
    private final boolean hasNew;

    @b("is_subscribed")
    private final boolean isSubscribed;

    @b("last_photo_text")
    @Nullable
    private final String lastPhotoText;

    @b("new_count")
    private final int newCount;

    @b("photo_100")
    @NotNull
    private final String photo100;

    @b("photo_200")
    @NotNull
    private final String photo200;

    @b("photo_50")
    @NotNull
    private final String photo50;

    @b("products")
    @NotNull
    private final List<ClassifiedsYoulaGroupsBlockProduct> products;

    @b("subtitle")
    @NotNull
    private final String subtitle;

    @b("title")
    @NotNull
    private final String title;

    @b("url")
    @NotNull
    private final String url;

    public ClassifiedsYoulaGroupsBlockItem(@NotNull UserId groupId, @NotNull String title, @NotNull String subtitle, @NotNull String url, @NotNull List<ClassifiedsYoulaGroupsBlockProduct> products, boolean z5, int i, @NotNull String photo50, @NotNull String photo100, @NotNull String photo200, boolean z10, @Nullable String str) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(photo50, "photo50");
        Intrinsics.checkNotNullParameter(photo100, "photo100");
        Intrinsics.checkNotNullParameter(photo200, "photo200");
        this.groupId = groupId;
        this.title = title;
        this.subtitle = subtitle;
        this.url = url;
        this.products = products;
        this.hasNew = z5;
        this.newCount = i;
        this.photo50 = photo50;
        this.photo100 = photo100;
        this.photo200 = photo200;
        this.isSubscribed = z10;
        this.lastPhotoText = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ClassifiedsYoulaGroupsBlockItem copy$default(ClassifiedsYoulaGroupsBlockItem classifiedsYoulaGroupsBlockItem, UserId userId, String str, String str2, String str3, List list, boolean z5, int i, String str4, String str5, String str6, boolean z10, String str7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            userId = classifiedsYoulaGroupsBlockItem.groupId;
        }
        if ((i10 & 2) != 0) {
            str = classifiedsYoulaGroupsBlockItem.title;
        }
        if ((i10 & 4) != 0) {
            str2 = classifiedsYoulaGroupsBlockItem.subtitle;
        }
        if ((i10 & 8) != 0) {
            str3 = classifiedsYoulaGroupsBlockItem.url;
        }
        if ((i10 & 16) != 0) {
            list = classifiedsYoulaGroupsBlockItem.products;
        }
        if ((i10 & 32) != 0) {
            z5 = classifiedsYoulaGroupsBlockItem.hasNew;
        }
        if ((i10 & 64) != 0) {
            i = classifiedsYoulaGroupsBlockItem.newCount;
        }
        if ((i10 & 128) != 0) {
            str4 = classifiedsYoulaGroupsBlockItem.photo50;
        }
        if ((i10 & 256) != 0) {
            str5 = classifiedsYoulaGroupsBlockItem.photo100;
        }
        if ((i10 & 512) != 0) {
            str6 = classifiedsYoulaGroupsBlockItem.photo200;
        }
        if ((i10 & 1024) != 0) {
            z10 = classifiedsYoulaGroupsBlockItem.isSubscribed;
        }
        if ((i10 & 2048) != 0) {
            str7 = classifiedsYoulaGroupsBlockItem.lastPhotoText;
        }
        boolean z11 = z10;
        String str8 = str7;
        String str9 = str5;
        String str10 = str6;
        int i11 = i;
        String str11 = str4;
        List list2 = list;
        boolean z12 = z5;
        return classifiedsYoulaGroupsBlockItem.copy(userId, str, str2, str3, list2, z12, i11, str11, str9, str10, z11, str8);
    }

    @NotNull
    public final UserId component1() {
        return this.groupId;
    }

    @NotNull
    public final String component10() {
        return this.photo200;
    }

    public final boolean component11() {
        return this.isSubscribed;
    }

    @Nullable
    public final String component12() {
        return this.lastPhotoText;
    }

    @NotNull
    public final String component2() {
        return this.title;
    }

    @NotNull
    public final String component3() {
        return this.subtitle;
    }

    @NotNull
    public final String component4() {
        return this.url;
    }

    @NotNull
    public final List<ClassifiedsYoulaGroupsBlockProduct> component5() {
        return this.products;
    }

    public final boolean component6() {
        return this.hasNew;
    }

    public final int component7() {
        return this.newCount;
    }

    @NotNull
    public final String component8() {
        return this.photo50;
    }

    @NotNull
    public final String component9() {
        return this.photo100;
    }

    @NotNull
    public final ClassifiedsYoulaGroupsBlockItem copy(@NotNull UserId groupId, @NotNull String title, @NotNull String subtitle, @NotNull String url, @NotNull List<ClassifiedsYoulaGroupsBlockProduct> products, boolean z5, int i, @NotNull String photo50, @NotNull String photo100, @NotNull String photo200, boolean z10, @Nullable String str) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(photo50, "photo50");
        Intrinsics.checkNotNullParameter(photo100, "photo100");
        Intrinsics.checkNotNullParameter(photo200, "photo200");
        return new ClassifiedsYoulaGroupsBlockItem(groupId, title, subtitle, url, products, z5, i, photo50, photo100, photo200, z10, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassifiedsYoulaGroupsBlockItem)) {
            return false;
        }
        ClassifiedsYoulaGroupsBlockItem classifiedsYoulaGroupsBlockItem = (ClassifiedsYoulaGroupsBlockItem) obj;
        return Intrinsics.a(this.groupId, classifiedsYoulaGroupsBlockItem.groupId) && Intrinsics.a(this.title, classifiedsYoulaGroupsBlockItem.title) && Intrinsics.a(this.subtitle, classifiedsYoulaGroupsBlockItem.subtitle) && Intrinsics.a(this.url, classifiedsYoulaGroupsBlockItem.url) && Intrinsics.a(this.products, classifiedsYoulaGroupsBlockItem.products) && this.hasNew == classifiedsYoulaGroupsBlockItem.hasNew && this.newCount == classifiedsYoulaGroupsBlockItem.newCount && Intrinsics.a(this.photo50, classifiedsYoulaGroupsBlockItem.photo50) && Intrinsics.a(this.photo100, classifiedsYoulaGroupsBlockItem.photo100) && Intrinsics.a(this.photo200, classifiedsYoulaGroupsBlockItem.photo200) && this.isSubscribed == classifiedsYoulaGroupsBlockItem.isSubscribed && Intrinsics.a(this.lastPhotoText, classifiedsYoulaGroupsBlockItem.lastPhotoText);
    }

    @NotNull
    public final UserId getGroupId() {
        return this.groupId;
    }

    public final boolean getHasNew() {
        return this.hasNew;
    }

    @Nullable
    public final String getLastPhotoText() {
        return this.lastPhotoText;
    }

    public final int getNewCount() {
        return this.newCount;
    }

    @NotNull
    public final String getPhoto100() {
        return this.photo100;
    }

    @NotNull
    public final String getPhoto200() {
        return this.photo200;
    }

    @NotNull
    public final String getPhoto50() {
        return this.photo50;
    }

    @NotNull
    public final List<ClassifiedsYoulaGroupsBlockProduct> getProducts() {
        return this.products;
    }

    @NotNull
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public int hashCode() {
        int i = u.i(this.products, a.e(a.e(a.e(this.groupId.hashCode() * 31, 31, this.title), 31, this.subtitle), 31, this.url), 31);
        boolean z5 = this.hasNew;
        ?? r22 = z5;
        if (z5) {
            r22 = 1;
        }
        int iE = a.e(a.e(a.e(u.g(this.newCount, (i + r22) * 31, 31), 31, this.photo50), 31, this.photo100), 31, this.photo200);
        boolean z10 = this.isSubscribed;
        int i10 = (iE + (z10 ? 1 : z10)) * 31;
        String str = this.lastPhotoText;
        return i10 + (str == null ? 0 : str.hashCode());
    }

    public final boolean isSubscribed() {
        return this.isSubscribed;
    }

    @NotNull
    public String toString() {
        UserId userId = this.groupId;
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.url;
        List<ClassifiedsYoulaGroupsBlockProduct> list = this.products;
        boolean z5 = this.hasNew;
        int i = this.newCount;
        String str4 = this.photo50;
        String str5 = this.photo100;
        String str6 = this.photo200;
        boolean z10 = this.isSubscribed;
        String str7 = this.lastPhotoText;
        StringBuilder sb2 = new StringBuilder("ClassifiedsYoulaGroupsBlockItem(groupId=");
        sb2.append(userId);
        sb2.append(", title=");
        sb2.append(str);
        sb2.append(", subtitle=");
        o.t(sb2, str2, ", url=", str3, ", products=");
        sb2.append(list);
        sb2.append(", hasNew=");
        sb2.append(z5);
        sb2.append(", newCount=");
        a.q(i, ", photo50=", str4, ", photo100=", sb2);
        o.t(sb2, str5, ", photo200=", str6, ", isSubscribed=");
        sb2.append(z10);
        sb2.append(", lastPhotoText=");
        sb2.append(str7);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ ClassifiedsYoulaGroupsBlockItem(UserId userId, String str, String str2, String str3, List list, boolean z5, int i, String str4, String str5, String str6, boolean z10, String str7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(userId, str, str2, str3, list, z5, i, str4, str5, str6, z10, (i10 & 2048) != 0 ? null : str7);
    }
}
