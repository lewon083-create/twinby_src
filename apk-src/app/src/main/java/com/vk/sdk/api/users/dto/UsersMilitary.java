package com.vk.sdk.api.users.dto;

import a0.u;
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
public final class UsersMilitary {

    @b("country_id")
    private final int countryId;

    @b("from")
    @Nullable
    private final Integer from;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    @Nullable
    private final Integer f15240id;

    @b("unit")
    @NotNull
    private final String unit;

    @b("unit_id")
    private final int unitId;

    @b("until")
    @Nullable
    private final Integer until;

    public UsersMilitary(int i, @NotNull String unit, int i10, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.countryId = i;
        this.unit = unit;
        this.unitId = i10;
        this.from = num;
        this.f15240id = num2;
        this.until = num3;
    }

    public static /* synthetic */ UsersMilitary copy$default(UsersMilitary usersMilitary, int i, String str, int i10, Integer num, Integer num2, Integer num3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i = usersMilitary.countryId;
        }
        if ((i11 & 2) != 0) {
            str = usersMilitary.unit;
        }
        if ((i11 & 4) != 0) {
            i10 = usersMilitary.unitId;
        }
        if ((i11 & 8) != 0) {
            num = usersMilitary.from;
        }
        if ((i11 & 16) != 0) {
            num2 = usersMilitary.f15240id;
        }
        if ((i11 & 32) != 0) {
            num3 = usersMilitary.until;
        }
        Integer num4 = num2;
        Integer num5 = num3;
        return usersMilitary.copy(i, str, i10, num, num4, num5);
    }

    public final int component1() {
        return this.countryId;
    }

    @NotNull
    public final String component2() {
        return this.unit;
    }

    public final int component3() {
        return this.unitId;
    }

    @Nullable
    public final Integer component4() {
        return this.from;
    }

    @Nullable
    public final Integer component5() {
        return this.f15240id;
    }

    @Nullable
    public final Integer component6() {
        return this.until;
    }

    @NotNull
    public final UsersMilitary copy(int i, @NotNull String unit, int i10, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return new UsersMilitary(i, unit, i10, num, num2, num3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersMilitary)) {
            return false;
        }
        UsersMilitary usersMilitary = (UsersMilitary) obj;
        return this.countryId == usersMilitary.countryId && Intrinsics.a(this.unit, usersMilitary.unit) && this.unitId == usersMilitary.unitId && Intrinsics.a(this.from, usersMilitary.from) && Intrinsics.a(this.f15240id, usersMilitary.f15240id) && Intrinsics.a(this.until, usersMilitary.until);
    }

    public final int getCountryId() {
        return this.countryId;
    }

    @Nullable
    public final Integer getFrom() {
        return this.from;
    }

    @Nullable
    public final Integer getId() {
        return this.f15240id;
    }

    @NotNull
    public final String getUnit() {
        return this.unit;
    }

    public final int getUnitId() {
        return this.unitId;
    }

    @Nullable
    public final Integer getUntil() {
        return this.until;
    }

    public int hashCode() {
        int iG = u.g(this.unitId, a.e(Integer.hashCode(this.countryId) * 31, 31, this.unit), 31);
        Integer num = this.from;
        int iHashCode = (iG + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f15240id;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.until;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.countryId;
        String str = this.unit;
        int i10 = this.unitId;
        Integer num = this.from;
        Integer num2 = this.f15240id;
        Integer num3 = this.until;
        StringBuilder sbI = pe.a.i(i, "UsersMilitary(countryId=", ", unit=", str, ", unitId=");
        sbI.append(i10);
        sbI.append(", from=");
        sbI.append(num);
        sbI.append(", id=");
        sbI.append(num2);
        sbI.append(", until=");
        sbI.append(num3);
        sbI.append(")");
        return sbI.toString();
    }

    public /* synthetic */ UsersMilitary(int i, String str, int i10, Integer num, Integer num2, Integer num3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, i10, (i11 & 8) != 0 ? null : num, (i11 & 16) != 0 ? null : num2, (i11 & 32) != 0 ? null : num3);
    }
}
