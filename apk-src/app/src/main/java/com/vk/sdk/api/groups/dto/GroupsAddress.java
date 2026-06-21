package com.vk.sdk.api.groups.dto;

import a0.u;
import io.sentry.SentryLockReason;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
public final class GroupsAddress {

    @b("additional_address")
    @Nullable
    private final String additionalAddress;

    @b(SentryLockReason.JsonKeys.ADDRESS)
    @Nullable
    private final String address;

    @b("city_id")
    @Nullable
    private final Integer cityId;

    @b("country_id")
    @Nullable
    private final Integer countryId;

    @b("distance")
    @Nullable
    private final Integer distance;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    private final int f15172id;

    @b("latitude")
    @Nullable
    private final Float latitude;

    @b("longitude")
    @Nullable
    private final Float longitude;

    @b("metro_station_id")
    @Nullable
    private final Integer metroStationId;

    @b("phone")
    @Nullable
    private final String phone;

    @b("place_id")
    @Nullable
    private final Integer placeId;

    @b("time_offset")
    @Nullable
    private final Integer timeOffset;

    @b("timetable")
    @Nullable
    private final GroupsAddressTimetable timetable;

    @b("title")
    @Nullable
    private final String title;

    @b("work_info_status")
    @Nullable
    private final GroupsAddressWorkInfoStatus workInfoStatus;

    public GroupsAddress(int i, @Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Float f10, @Nullable Float f11, @Nullable Integer num4, @Nullable String str3, @Nullable Integer num5, @Nullable GroupsAddressTimetable groupsAddressTimetable, @Nullable String str4, @Nullable GroupsAddressWorkInfoStatus groupsAddressWorkInfoStatus, @Nullable Integer num6) {
        this.f15172id = i;
        this.additionalAddress = str;
        this.address = str2;
        this.cityId = num;
        this.countryId = num2;
        this.distance = num3;
        this.latitude = f10;
        this.longitude = f11;
        this.metroStationId = num4;
        this.phone = str3;
        this.timeOffset = num5;
        this.timetable = groupsAddressTimetable;
        this.title = str4;
        this.workInfoStatus = groupsAddressWorkInfoStatus;
        this.placeId = num6;
    }

    public final int component1() {
        return this.f15172id;
    }

    @Nullable
    public final String component10() {
        return this.phone;
    }

    @Nullable
    public final Integer component11() {
        return this.timeOffset;
    }

    @Nullable
    public final GroupsAddressTimetable component12() {
        return this.timetable;
    }

    @Nullable
    public final String component13() {
        return this.title;
    }

    @Nullable
    public final GroupsAddressWorkInfoStatus component14() {
        return this.workInfoStatus;
    }

    @Nullable
    public final Integer component15() {
        return this.placeId;
    }

    @Nullable
    public final String component2() {
        return this.additionalAddress;
    }

    @Nullable
    public final String component3() {
        return this.address;
    }

    @Nullable
    public final Integer component4() {
        return this.cityId;
    }

    @Nullable
    public final Integer component5() {
        return this.countryId;
    }

    @Nullable
    public final Integer component6() {
        return this.distance;
    }

    @Nullable
    public final Float component7() {
        return this.latitude;
    }

    @Nullable
    public final Float component8() {
        return this.longitude;
    }

    @Nullable
    public final Integer component9() {
        return this.metroStationId;
    }

    @NotNull
    public final GroupsAddress copy(int i, @Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Float f10, @Nullable Float f11, @Nullable Integer num4, @Nullable String str3, @Nullable Integer num5, @Nullable GroupsAddressTimetable groupsAddressTimetable, @Nullable String str4, @Nullable GroupsAddressWorkInfoStatus groupsAddressWorkInfoStatus, @Nullable Integer num6) {
        return new GroupsAddress(i, str, str2, num, num2, num3, f10, f11, num4, str3, num5, groupsAddressTimetable, str4, groupsAddressWorkInfoStatus, num6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsAddress)) {
            return false;
        }
        GroupsAddress groupsAddress = (GroupsAddress) obj;
        return this.f15172id == groupsAddress.f15172id && Intrinsics.a(this.additionalAddress, groupsAddress.additionalAddress) && Intrinsics.a(this.address, groupsAddress.address) && Intrinsics.a(this.cityId, groupsAddress.cityId) && Intrinsics.a(this.countryId, groupsAddress.countryId) && Intrinsics.a(this.distance, groupsAddress.distance) && Intrinsics.a(this.latitude, groupsAddress.latitude) && Intrinsics.a(this.longitude, groupsAddress.longitude) && Intrinsics.a(this.metroStationId, groupsAddress.metroStationId) && Intrinsics.a(this.phone, groupsAddress.phone) && Intrinsics.a(this.timeOffset, groupsAddress.timeOffset) && Intrinsics.a(this.timetable, groupsAddress.timetable) && Intrinsics.a(this.title, groupsAddress.title) && this.workInfoStatus == groupsAddress.workInfoStatus && Intrinsics.a(this.placeId, groupsAddress.placeId);
    }

    @Nullable
    public final String getAdditionalAddress() {
        return this.additionalAddress;
    }

    @Nullable
    public final String getAddress() {
        return this.address;
    }

    @Nullable
    public final Integer getCityId() {
        return this.cityId;
    }

    @Nullable
    public final Integer getCountryId() {
        return this.countryId;
    }

    @Nullable
    public final Integer getDistance() {
        return this.distance;
    }

    public final int getId() {
        return this.f15172id;
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
    public final Integer getMetroStationId() {
        return this.metroStationId;
    }

    @Nullable
    public final String getPhone() {
        return this.phone;
    }

    @Nullable
    public final Integer getPlaceId() {
        return this.placeId;
    }

    @Nullable
    public final Integer getTimeOffset() {
        return this.timeOffset;
    }

    @Nullable
    public final GroupsAddressTimetable getTimetable() {
        return this.timetable;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final GroupsAddressWorkInfoStatus getWorkInfoStatus() {
        return this.workInfoStatus;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f15172id) * 31;
        String str = this.additionalAddress;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.address;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.cityId;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.countryId;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.distance;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Float f10 = this.latitude;
        int iHashCode7 = (iHashCode6 + (f10 == null ? 0 : f10.hashCode())) * 31;
        Float f11 = this.longitude;
        int iHashCode8 = (iHashCode7 + (f11 == null ? 0 : f11.hashCode())) * 31;
        Integer num4 = this.metroStationId;
        int iHashCode9 = (iHashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str3 = this.phone;
        int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num5 = this.timeOffset;
        int iHashCode11 = (iHashCode10 + (num5 == null ? 0 : num5.hashCode())) * 31;
        GroupsAddressTimetable groupsAddressTimetable = this.timetable;
        int iHashCode12 = (iHashCode11 + (groupsAddressTimetable == null ? 0 : groupsAddressTimetable.hashCode())) * 31;
        String str4 = this.title;
        int iHashCode13 = (iHashCode12 + (str4 == null ? 0 : str4.hashCode())) * 31;
        GroupsAddressWorkInfoStatus groupsAddressWorkInfoStatus = this.workInfoStatus;
        int iHashCode14 = (iHashCode13 + (groupsAddressWorkInfoStatus == null ? 0 : groupsAddressWorkInfoStatus.hashCode())) * 31;
        Integer num6 = this.placeId;
        return iHashCode14 + (num6 != null ? num6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.f15172id;
        String str = this.additionalAddress;
        String str2 = this.address;
        Integer num = this.cityId;
        Integer num2 = this.countryId;
        Integer num3 = this.distance;
        Float f10 = this.latitude;
        Float f11 = this.longitude;
        Integer num4 = this.metroStationId;
        String str3 = this.phone;
        Integer num5 = this.timeOffset;
        GroupsAddressTimetable groupsAddressTimetable = this.timetable;
        String str4 = this.title;
        GroupsAddressWorkInfoStatus groupsAddressWorkInfoStatus = this.workInfoStatus;
        Integer num6 = this.placeId;
        StringBuilder sbI = a.i(i, "GroupsAddress(id=", ", additionalAddress=", str, ", address=");
        gf.a.r(num, str2, ", cityId=", ", countryId=", sbI);
        gf.a.t(sbI, num2, ", distance=", num3, ", latitude=");
        sbI.append(f10);
        sbI.append(", longitude=");
        sbI.append(f11);
        sbI.append(", metroStationId=");
        a.r(num4, ", phone=", str3, ", timeOffset=", sbI);
        sbI.append(num5);
        sbI.append(", timetable=");
        sbI.append(groupsAddressTimetable);
        sbI.append(", title=");
        sbI.append(str4);
        sbI.append(", workInfoStatus=");
        sbI.append(groupsAddressWorkInfoStatus);
        sbI.append(", placeId=");
        return u.m(sbI, num6, ")");
    }

    public /* synthetic */ GroupsAddress(int i, String str, String str2, Integer num, Integer num2, Integer num3, Float f10, Float f11, Integer num4, String str3, Integer num5, GroupsAddressTimetable groupsAddressTimetable, String str4, GroupsAddressWorkInfoStatus groupsAddressWorkInfoStatus, Integer num6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : num, (i10 & 16) != 0 ? null : num2, (i10 & 32) != 0 ? null : num3, (i10 & 64) != 0 ? null : f10, (i10 & 128) != 0 ? null : f11, (i10 & 256) != 0 ? null : num4, (i10 & 512) != 0 ? null : str3, (i10 & 1024) != 0 ? null : num5, (i10 & 2048) != 0 ? null : groupsAddressTimetable, (i10 & 4096) != 0 ? null : str4, (i10 & 8192) != 0 ? null : groupsAddressWorkInfoStatus, (i10 & 16384) != 0 ? null : num6);
    }
}
