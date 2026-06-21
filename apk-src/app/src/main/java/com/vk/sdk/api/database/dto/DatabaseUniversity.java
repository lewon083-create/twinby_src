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
public final class DatabaseUniversity {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    @Nullable
    private final Integer f15163id;

    @b("title")
    @Nullable
    private final String title;

    public DatabaseUniversity() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DatabaseUniversity copy$default(DatabaseUniversity databaseUniversity, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = databaseUniversity.f15163id;
        }
        if ((i & 2) != 0) {
            str = databaseUniversity.title;
        }
        return databaseUniversity.copy(num, str);
    }

    @Nullable
    public final Integer component1() {
        return this.f15163id;
    }

    @Nullable
    public final String component2() {
        return this.title;
    }

    @NotNull
    public final DatabaseUniversity copy(@Nullable Integer num, @Nullable String str) {
        return new DatabaseUniversity(num, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DatabaseUniversity)) {
            return false;
        }
        DatabaseUniversity databaseUniversity = (DatabaseUniversity) obj;
        return Intrinsics.a(this.f15163id, databaseUniversity.f15163id) && Intrinsics.a(this.title, databaseUniversity.title);
    }

    @Nullable
    public final Integer getId() {
        return this.f15163id;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        Integer num = this.f15163id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.title;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DatabaseUniversity(id=" + this.f15163id + ", title=" + this.title + ")";
    }

    public DatabaseUniversity(@Nullable Integer num, @Nullable String str) {
        this.f15163id = num;
        this.title = str;
    }

    public /* synthetic */ DatabaseUniversity(Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
    }
}
