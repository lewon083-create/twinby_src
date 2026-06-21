package com.vk.sdk.api.database.dto;

import com.vk.sdk.api.base.dto.BaseBoolInt;
import gf.a;
import io.sentry.protocol.Geo;
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
public final class DatabaseCity {

    @b("area")
    @Nullable
    private final String area;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    private final int f15157id;

    @b("important")
    @Nullable
    private final BaseBoolInt important;

    @b(Geo.JsonKeys.REGION)
    @Nullable
    private final String region;

    @b("title")
    @NotNull
    private final String title;

    public DatabaseCity(int i, @NotNull String title, @Nullable String str, @Nullable String str2, @Nullable BaseBoolInt baseBoolInt) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f15157id = i;
        this.title = title;
        this.area = str;
        this.region = str2;
        this.important = baseBoolInt;
    }

    public static /* synthetic */ DatabaseCity copy$default(DatabaseCity databaseCity, int i, String str, String str2, String str3, BaseBoolInt baseBoolInt, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = databaseCity.f15157id;
        }
        if ((i10 & 2) != 0) {
            str = databaseCity.title;
        }
        if ((i10 & 4) != 0) {
            str2 = databaseCity.area;
        }
        if ((i10 & 8) != 0) {
            str3 = databaseCity.region;
        }
        if ((i10 & 16) != 0) {
            baseBoolInt = databaseCity.important;
        }
        BaseBoolInt baseBoolInt2 = baseBoolInt;
        String str4 = str2;
        return databaseCity.copy(i, str, str4, str3, baseBoolInt2);
    }

    public final int component1() {
        return this.f15157id;
    }

    @NotNull
    public final String component2() {
        return this.title;
    }

    @Nullable
    public final String component3() {
        return this.area;
    }

    @Nullable
    public final String component4() {
        return this.region;
    }

    @Nullable
    public final BaseBoolInt component5() {
        return this.important;
    }

    @NotNull
    public final DatabaseCity copy(int i, @NotNull String title, @Nullable String str, @Nullable String str2, @Nullable BaseBoolInt baseBoolInt) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new DatabaseCity(i, title, str, str2, baseBoolInt);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DatabaseCity)) {
            return false;
        }
        DatabaseCity databaseCity = (DatabaseCity) obj;
        return this.f15157id == databaseCity.f15157id && Intrinsics.a(this.title, databaseCity.title) && Intrinsics.a(this.area, databaseCity.area) && Intrinsics.a(this.region, databaseCity.region) && this.important == databaseCity.important;
    }

    @Nullable
    public final String getArea() {
        return this.area;
    }

    public final int getId() {
        return this.f15157id;
    }

    @Nullable
    public final BaseBoolInt getImportant() {
        return this.important;
    }

    @Nullable
    public final String getRegion() {
        return this.region;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iE = a.e(Integer.hashCode(this.f15157id) * 31, 31, this.title);
        String str = this.area;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.region;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        BaseBoolInt baseBoolInt = this.important;
        return iHashCode2 + (baseBoolInt != null ? baseBoolInt.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.f15157id;
        String str = this.title;
        String str2 = this.area;
        String str3 = this.region;
        BaseBoolInt baseBoolInt = this.important;
        StringBuilder sbI = pe.a.i(i, "DatabaseCity(id=", ", title=", str, ", area=");
        o.t(sbI, str2, ", region=", str3, ", important=");
        sbI.append(baseBoolInt);
        sbI.append(")");
        return sbI.toString();
    }

    public /* synthetic */ DatabaseCity(int i, String str, String str2, String str3, BaseBoolInt baseBoolInt, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : baseBoolInt);
    }
}
