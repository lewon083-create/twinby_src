package com.vk.sdk.api.database.dto;

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
public final class DatabaseSchool {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    @Nullable
    private final Integer f15161id;

    @b("title")
    @Nullable
    private final String title;

    public DatabaseSchool() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DatabaseSchool copy$default(DatabaseSchool databaseSchool, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = databaseSchool.f15161id;
        }
        if ((i & 2) != 0) {
            str = databaseSchool.title;
        }
        return databaseSchool.copy(num, str);
    }

    @Nullable
    public final Integer component1() {
        return this.f15161id;
    }

    @Nullable
    public final String component2() {
        return this.title;
    }

    @NotNull
    public final DatabaseSchool copy(@Nullable Integer num, @Nullable String str) {
        return new DatabaseSchool(num, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DatabaseSchool)) {
            return false;
        }
        DatabaseSchool databaseSchool = (DatabaseSchool) obj;
        return Intrinsics.a(this.f15161id, databaseSchool.f15161id) && Intrinsics.a(this.title, databaseSchool.title);
    }

    @Nullable
    public final Integer getId() {
        return this.f15161id;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        Integer num = this.f15161id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.title;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DatabaseSchool(id=" + this.f15161id + ", title=" + this.title + ")";
    }

    public DatabaseSchool(@Nullable Integer num, @Nullable String str) {
        this.f15161id = num;
        this.title = str;
    }

    public /* synthetic */ DatabaseSchool(Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
    }
}
