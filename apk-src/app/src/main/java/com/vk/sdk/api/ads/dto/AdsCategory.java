package com.vk.sdk.api.ads.dto;

import gf.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ne.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t.z;

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
public final class AdsCategory {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    private final int f15112id;

    @b("name")
    @NotNull
    private final String name;

    @b("subcategories")
    @Nullable
    private final List<AdsCategory> subcategories;

    public AdsCategory(int i, @NotNull String name, @Nullable List<AdsCategory> list) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f15112id = i;
        this.name = name;
        this.subcategories = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdsCategory copy$default(AdsCategory adsCategory, int i, String str, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = adsCategory.f15112id;
        }
        if ((i10 & 2) != 0) {
            str = adsCategory.name;
        }
        if ((i10 & 4) != 0) {
            list = adsCategory.subcategories;
        }
        return adsCategory.copy(i, str, list);
    }

    public final int component1() {
        return this.f15112id;
    }

    @NotNull
    public final String component2() {
        return this.name;
    }

    @Nullable
    public final List<AdsCategory> component3() {
        return this.subcategories;
    }

    @NotNull
    public final AdsCategory copy(int i, @NotNull String name, @Nullable List<AdsCategory> list) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new AdsCategory(i, name, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsCategory)) {
            return false;
        }
        AdsCategory adsCategory = (AdsCategory) obj;
        return this.f15112id == adsCategory.f15112id && Intrinsics.a(this.name, adsCategory.name) && Intrinsics.a(this.subcategories, adsCategory.subcategories);
    }

    public final int getId() {
        return this.f15112id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final List<AdsCategory> getSubcategories() {
        return this.subcategories;
    }

    public int hashCode() {
        int iE = a.e(Integer.hashCode(this.f15112id) * 31, 31, this.name);
        List<AdsCategory> list = this.subcategories;
        return iE + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        int i = this.f15112id;
        String str = this.name;
        return z.h(pe.a.i(i, "AdsCategory(id=", ", name=", str, ", subcategories="), this.subcategories, ")");
    }

    public /* synthetic */ AdsCategory(int i, String str, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i10 & 4) != 0 ? null : list);
    }
}
