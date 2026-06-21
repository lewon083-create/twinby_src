package com.vk.sdk.api.database.dto;

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
public final class DatabaseStation {

    @b("city_id")
    @Nullable
    private final Integer cityId;

    @b("color")
    @Nullable
    private final String color;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    private final int f15162id;

    @b("name")
    @NotNull
    private final String name;

    public DatabaseStation(int i, @NotNull String name, @Nullable Integer num, @Nullable String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f15162id = i;
        this.name = name;
        this.cityId = num;
        this.color = str;
    }

    public static /* synthetic */ DatabaseStation copy$default(DatabaseStation databaseStation, int i, String str, Integer num, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = databaseStation.f15162id;
        }
        if ((i10 & 2) != 0) {
            str = databaseStation.name;
        }
        if ((i10 & 4) != 0) {
            num = databaseStation.cityId;
        }
        if ((i10 & 8) != 0) {
            str2 = databaseStation.color;
        }
        return databaseStation.copy(i, str, num, str2);
    }

    public final int component1() {
        return this.f15162id;
    }

    @NotNull
    public final String component2() {
        return this.name;
    }

    @Nullable
    public final Integer component3() {
        return this.cityId;
    }

    @Nullable
    public final String component4() {
        return this.color;
    }

    @NotNull
    public final DatabaseStation copy(int i, @NotNull String name, @Nullable Integer num, @Nullable String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new DatabaseStation(i, name, num, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DatabaseStation)) {
            return false;
        }
        DatabaseStation databaseStation = (DatabaseStation) obj;
        return this.f15162id == databaseStation.f15162id && Intrinsics.a(this.name, databaseStation.name) && Intrinsics.a(this.cityId, databaseStation.cityId) && Intrinsics.a(this.color, databaseStation.color);
    }

    @Nullable
    public final Integer getCityId() {
        return this.cityId;
    }

    @Nullable
    public final String getColor() {
        return this.color;
    }

    public final int getId() {
        return this.f15162id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int iE = a.e(Integer.hashCode(this.f15162id) * 31, 31, this.name);
        Integer num = this.cityId;
        int iHashCode = (iE + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.color;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.f15162id;
        String str = this.name;
        Integer num = this.cityId;
        String str2 = this.color;
        StringBuilder sbI = pe.a.i(i, "DatabaseStation(id=", ", name=", str, ", cityId=");
        sbI.append(num);
        sbI.append(", color=");
        sbI.append(str2);
        sbI.append(")");
        return sbI.toString();
    }

    public /* synthetic */ DatabaseStation(int i, String str, Integer num, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i10 & 4) != 0 ? null : num, (i10 & 8) != 0 ? null : str2);
    }
}
