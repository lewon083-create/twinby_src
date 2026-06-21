package com.vk.sdk.api.base.dto;

import a0.u;
import com.appsflyer.AdRevenueScheme;
import io.sentry.SentryLockReason;
import io.sentry.protocol.Geo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l7.o;
import ne.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.a;

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
public final class BasePlace {

    @b(SentryLockReason.JsonKeys.ADDRESS)
    @Nullable
    private final String address;

    @b("checkins")
    @Nullable
    private final Integer checkins;

    @b(Geo.JsonKeys.CITY)
    @Nullable
    private final String city;

    @b(AdRevenueScheme.COUNTRY)
    @Nullable
    private final String country;

    @b("created")
    @Nullable
    private final Integer created;

    @b("icon")
    @Nullable
    private final String icon;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    @Nullable
    private final Integer f15148id;

    @b("latitude")
    @Nullable
    private final Float latitude;

    @b("longitude")
    @Nullable
    private final Float longitude;

    @b("title")
    @Nullable
    private final String title;

    @b("type")
    @Nullable
    private final String type;

    public BasePlace() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public static /* synthetic */ BasePlace copy$default(BasePlace basePlace, String str, Integer num, String str2, String str3, Integer num2, String str4, Integer num3, Float f10, Float f11, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = basePlace.address;
        }
        if ((i & 2) != 0) {
            num = basePlace.checkins;
        }
        if ((i & 4) != 0) {
            str2 = basePlace.city;
        }
        if ((i & 8) != 0) {
            str3 = basePlace.country;
        }
        if ((i & 16) != 0) {
            num2 = basePlace.created;
        }
        if ((i & 32) != 0) {
            str4 = basePlace.icon;
        }
        if ((i & 64) != 0) {
            num3 = basePlace.f15148id;
        }
        if ((i & 128) != 0) {
            f10 = basePlace.latitude;
        }
        if ((i & 256) != 0) {
            f11 = basePlace.longitude;
        }
        if ((i & 512) != 0) {
            str5 = basePlace.title;
        }
        if ((i & 1024) != 0) {
            str6 = basePlace.type;
        }
        String str7 = str5;
        String str8 = str6;
        Float f12 = f10;
        Float f13 = f11;
        String str9 = str4;
        Integer num4 = num3;
        Integer num5 = num2;
        String str10 = str2;
        return basePlace.copy(str, num, str10, str3, num5, str9, num4, f12, f13, str7, str8);
    }

    @Nullable
    public final String component1() {
        return this.address;
    }

    @Nullable
    public final String component10() {
        return this.title;
    }

    @Nullable
    public final String component11() {
        return this.type;
    }

    @Nullable
    public final Integer component2() {
        return this.checkins;
    }

    @Nullable
    public final String component3() {
        return this.city;
    }

    @Nullable
    public final String component4() {
        return this.country;
    }

    @Nullable
    public final Integer component5() {
        return this.created;
    }

    @Nullable
    public final String component6() {
        return this.icon;
    }

    @Nullable
    public final Integer component7() {
        return this.f15148id;
    }

    @Nullable
    public final Float component8() {
        return this.latitude;
    }

    @Nullable
    public final Float component9() {
        return this.longitude;
    }

    @NotNull
    public final BasePlace copy(@Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable String str3, @Nullable Integer num2, @Nullable String str4, @Nullable Integer num3, @Nullable Float f10, @Nullable Float f11, @Nullable String str5, @Nullable String str6) {
        return new BasePlace(str, num, str2, str3, num2, str4, num3, f10, f11, str5, str6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BasePlace)) {
            return false;
        }
        BasePlace basePlace = (BasePlace) obj;
        return Intrinsics.a(this.address, basePlace.address) && Intrinsics.a(this.checkins, basePlace.checkins) && Intrinsics.a(this.city, basePlace.city) && Intrinsics.a(this.country, basePlace.country) && Intrinsics.a(this.created, basePlace.created) && Intrinsics.a(this.icon, basePlace.icon) && Intrinsics.a(this.f15148id, basePlace.f15148id) && Intrinsics.a(this.latitude, basePlace.latitude) && Intrinsics.a(this.longitude, basePlace.longitude) && Intrinsics.a(this.title, basePlace.title) && Intrinsics.a(this.type, basePlace.type);
    }

    @Nullable
    public final String getAddress() {
        return this.address;
    }

    @Nullable
    public final Integer getCheckins() {
        return this.checkins;
    }

    @Nullable
    public final String getCity() {
        return this.city;
    }

    @Nullable
    public final String getCountry() {
        return this.country;
    }

    @Nullable
    public final Integer getCreated() {
        return this.created;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final Integer getId() {
        return this.f15148id;
    }

    @Nullable
    public final Float getLatitude() {
        return this.latitude;
    }

    @Nullable
    public final Float getLongitude() {
        return this.longitude;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.address;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.checkins;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.city;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.country;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.created;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.icon;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num3 = this.f15148id;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Float f10 = this.latitude;
        int iHashCode8 = (iHashCode7 + (f10 == null ? 0 : f10.hashCode())) * 31;
        Float f11 = this.longitude;
        int iHashCode9 = (iHashCode8 + (f11 == null ? 0 : f11.hashCode())) * 31;
        String str5 = this.title;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.type;
        return iHashCode10 + (str6 != null ? str6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.address;
        Integer num = this.checkins;
        String str2 = this.city;
        String str3 = this.country;
        Integer num2 = this.created;
        String str4 = this.icon;
        Integer num3 = this.f15148id;
        Float f10 = this.latitude;
        Float f11 = this.longitude;
        String str5 = this.title;
        String str6 = this.type;
        StringBuilder sb2 = new StringBuilder("BasePlace(address=");
        sb2.append(str);
        sb2.append(", checkins=");
        sb2.append(num);
        sb2.append(", city=");
        o.t(sb2, str2, ", country=", str3, ", created=");
        a.r(num2, ", icon=", str4, ", id=", sb2);
        sb2.append(num3);
        sb2.append(", latitude=");
        sb2.append(f10);
        sb2.append(", longitude=");
        sb2.append(f11);
        sb2.append(", title=");
        sb2.append(str5);
        sb2.append(", type=");
        return u.o(sb2, str6, ")");
    }

    public BasePlace(@Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable String str3, @Nullable Integer num2, @Nullable String str4, @Nullable Integer num3, @Nullable Float f10, @Nullable Float f11, @Nullable String str5, @Nullable String str6) {
        this.address = str;
        this.checkins = num;
        this.city = str2;
        this.country = str3;
        this.created = num2;
        this.icon = str4;
        this.f15148id = num3;
        this.latitude = f10;
        this.longitude = f11;
        this.title = str5;
        this.type = str6;
    }

    public /* synthetic */ BasePlace(String str, Integer num, String str2, String str3, Integer num2, String str4, Integer num3, Float f10, Float f11, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : num3, (i & 128) != 0 ? null : f10, (i & 256) != 0 ? null : f11, (i & 512) != 0 ? null : str5, (i & 1024) != 0 ? null : str6);
    }
}
