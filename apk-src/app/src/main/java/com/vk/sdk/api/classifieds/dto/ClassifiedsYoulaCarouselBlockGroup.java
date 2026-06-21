package com.vk.sdk.api.classifieds.dto;

import com.google.android.gms.internal.ads.om1;
import com.vk.dto.common.id.UserId;
import gf.a;
import kotlin.Metadata;
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
public final class ClassifiedsYoulaCarouselBlockGroup {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    @NotNull
    private final UserId f15152id;

    @b("name")
    @NotNull
    private final String name;

    @b("photo_100")
    @NotNull
    private final String photo100;

    @b("photo_200")
    @NotNull
    private final String photo200;

    @b("photo_50")
    @NotNull
    private final String photo50;

    @b("url")
    @NotNull
    private final String url;

    public ClassifiedsYoulaCarouselBlockGroup(@NotNull UserId id2, @NotNull String name, @NotNull String photo50, @NotNull String photo100, @NotNull String photo200, @NotNull String url) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(photo50, "photo50");
        Intrinsics.checkNotNullParameter(photo100, "photo100");
        Intrinsics.checkNotNullParameter(photo200, "photo200");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f15152id = id2;
        this.name = name;
        this.photo50 = photo50;
        this.photo100 = photo100;
        this.photo200 = photo200;
        this.url = url;
    }

    public static /* synthetic */ ClassifiedsYoulaCarouselBlockGroup copy$default(ClassifiedsYoulaCarouselBlockGroup classifiedsYoulaCarouselBlockGroup, UserId userId, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            userId = classifiedsYoulaCarouselBlockGroup.f15152id;
        }
        if ((i & 2) != 0) {
            str = classifiedsYoulaCarouselBlockGroup.name;
        }
        if ((i & 4) != 0) {
            str2 = classifiedsYoulaCarouselBlockGroup.photo50;
        }
        if ((i & 8) != 0) {
            str3 = classifiedsYoulaCarouselBlockGroup.photo100;
        }
        if ((i & 16) != 0) {
            str4 = classifiedsYoulaCarouselBlockGroup.photo200;
        }
        if ((i & 32) != 0) {
            str5 = classifiedsYoulaCarouselBlockGroup.url;
        }
        String str6 = str4;
        String str7 = str5;
        return classifiedsYoulaCarouselBlockGroup.copy(userId, str, str2, str3, str6, str7);
    }

    @NotNull
    public final UserId component1() {
        return this.f15152id;
    }

    @NotNull
    public final String component2() {
        return this.name;
    }

    @NotNull
    public final String component3() {
        return this.photo50;
    }

    @NotNull
    public final String component4() {
        return this.photo100;
    }

    @NotNull
    public final String component5() {
        return this.photo200;
    }

    @NotNull
    public final String component6() {
        return this.url;
    }

    @NotNull
    public final ClassifiedsYoulaCarouselBlockGroup copy(@NotNull UserId id2, @NotNull String name, @NotNull String photo50, @NotNull String photo100, @NotNull String photo200, @NotNull String url) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(photo50, "photo50");
        Intrinsics.checkNotNullParameter(photo100, "photo100");
        Intrinsics.checkNotNullParameter(photo200, "photo200");
        Intrinsics.checkNotNullParameter(url, "url");
        return new ClassifiedsYoulaCarouselBlockGroup(id2, name, photo50, photo100, photo200, url);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassifiedsYoulaCarouselBlockGroup)) {
            return false;
        }
        ClassifiedsYoulaCarouselBlockGroup classifiedsYoulaCarouselBlockGroup = (ClassifiedsYoulaCarouselBlockGroup) obj;
        return Intrinsics.a(this.f15152id, classifiedsYoulaCarouselBlockGroup.f15152id) && Intrinsics.a(this.name, classifiedsYoulaCarouselBlockGroup.name) && Intrinsics.a(this.photo50, classifiedsYoulaCarouselBlockGroup.photo50) && Intrinsics.a(this.photo100, classifiedsYoulaCarouselBlockGroup.photo100) && Intrinsics.a(this.photo200, classifiedsYoulaCarouselBlockGroup.photo200) && Intrinsics.a(this.url, classifiedsYoulaCarouselBlockGroup.url);
    }

    @NotNull
    public final UserId getId() {
        return this.f15152id;
    }

    @NotNull
    public final String getName() {
        return this.name;
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
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.url.hashCode() + a.e(a.e(a.e(a.e(this.f15152id.hashCode() * 31, 31, this.name), 31, this.photo50), 31, this.photo100), 31, this.photo200);
    }

    @NotNull
    public String toString() {
        UserId userId = this.f15152id;
        String str = this.name;
        String str2 = this.photo50;
        String str3 = this.photo100;
        String str4 = this.photo200;
        String str5 = this.url;
        StringBuilder sb2 = new StringBuilder("ClassifiedsYoulaCarouselBlockGroup(id=");
        sb2.append(userId);
        sb2.append(", name=");
        sb2.append(str);
        sb2.append(", photo50=");
        o.t(sb2, str2, ", photo100=", str3, ", photo200=");
        return om1.n(sb2, str4, ", url=", str5, ")");
    }
}
