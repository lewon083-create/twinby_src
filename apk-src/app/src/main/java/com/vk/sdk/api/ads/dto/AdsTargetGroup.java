package com.vk.sdk.api.ads.dto;

import com.google.android.gms.internal.ads.om1;
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
public final class AdsTargetGroup {

    @b("audience_count")
    @Nullable
    private final Integer audienceCount;

    @b("domain")
    @Nullable
    private final String domain;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    @Nullable
    private final Integer f15125id;

    @b("lifetime")
    @Nullable
    private final Integer lifetime;

    @b("name")
    @Nullable
    private final String name;

    @b("pixel")
    @Nullable
    private final String pixel;

    public AdsTargetGroup() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ AdsTargetGroup copy$default(AdsTargetGroup adsTargetGroup, Integer num, String str, Integer num2, Integer num3, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = adsTargetGroup.audienceCount;
        }
        if ((i & 2) != 0) {
            str = adsTargetGroup.domain;
        }
        if ((i & 4) != 0) {
            num2 = adsTargetGroup.f15125id;
        }
        if ((i & 8) != 0) {
            num3 = adsTargetGroup.lifetime;
        }
        if ((i & 16) != 0) {
            str2 = adsTargetGroup.name;
        }
        if ((i & 32) != 0) {
            str3 = adsTargetGroup.pixel;
        }
        String str4 = str2;
        String str5 = str3;
        return adsTargetGroup.copy(num, str, num2, num3, str4, str5);
    }

    @Nullable
    public final Integer component1() {
        return this.audienceCount;
    }

    @Nullable
    public final String component2() {
        return this.domain;
    }

    @Nullable
    public final Integer component3() {
        return this.f15125id;
    }

    @Nullable
    public final Integer component4() {
        return this.lifetime;
    }

    @Nullable
    public final String component5() {
        return this.name;
    }

    @Nullable
    public final String component6() {
        return this.pixel;
    }

    @NotNull
    public final AdsTargetGroup copy(@Nullable Integer num, @Nullable String str, @Nullable Integer num2, @Nullable Integer num3, @Nullable String str2, @Nullable String str3) {
        return new AdsTargetGroup(num, str, num2, num3, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsTargetGroup)) {
            return false;
        }
        AdsTargetGroup adsTargetGroup = (AdsTargetGroup) obj;
        return Intrinsics.a(this.audienceCount, adsTargetGroup.audienceCount) && Intrinsics.a(this.domain, adsTargetGroup.domain) && Intrinsics.a(this.f15125id, adsTargetGroup.f15125id) && Intrinsics.a(this.lifetime, adsTargetGroup.lifetime) && Intrinsics.a(this.name, adsTargetGroup.name) && Intrinsics.a(this.pixel, adsTargetGroup.pixel);
    }

    @Nullable
    public final Integer getAudienceCount() {
        return this.audienceCount;
    }

    @Nullable
    public final String getDomain() {
        return this.domain;
    }

    @Nullable
    public final Integer getId() {
        return this.f15125id;
    }

    @Nullable
    public final Integer getLifetime() {
        return this.lifetime;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getPixel() {
        return this.pixel;
    }

    public int hashCode() {
        Integer num = this.audienceCount;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.domain;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.f15125id;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.lifetime;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.name;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.pixel;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.audienceCount;
        String str = this.domain;
        Integer num2 = this.f15125id;
        Integer num3 = this.lifetime;
        String str2 = this.name;
        String str3 = this.pixel;
        StringBuilder sb2 = new StringBuilder("AdsTargetGroup(audienceCount=");
        sb2.append(num);
        sb2.append(", domain=");
        sb2.append(str);
        sb2.append(", id=");
        a.t(sb2, num2, ", lifetime=", num3, ", name=");
        return om1.n(sb2, str2, ", pixel=", str3, ")");
    }

    public AdsTargetGroup(@Nullable Integer num, @Nullable String str, @Nullable Integer num2, @Nullable Integer num3, @Nullable String str2, @Nullable String str3) {
        this.audienceCount = num;
        this.domain = str;
        this.f15125id = num2;
        this.lifetime = num3;
        this.name = str2;
        this.pixel = str3;
    }

    public /* synthetic */ AdsTargetGroup(Integer num, String str, Integer num2, Integer num3, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3);
    }
}
