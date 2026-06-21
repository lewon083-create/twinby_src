package com.vk.sdk.api.base.dto;

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
public final class BaseLinkApplicationStore {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    @Nullable
    private final Float f15145id;

    @b("name")
    @Nullable
    private final String name;

    public BaseLinkApplicationStore() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BaseLinkApplicationStore copy$default(BaseLinkApplicationStore baseLinkApplicationStore, Float f10, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            f10 = baseLinkApplicationStore.f15145id;
        }
        if ((i & 2) != 0) {
            str = baseLinkApplicationStore.name;
        }
        return baseLinkApplicationStore.copy(f10, str);
    }

    @Nullable
    public final Float component1() {
        return this.f15145id;
    }

    @Nullable
    public final String component2() {
        return this.name;
    }

    @NotNull
    public final BaseLinkApplicationStore copy(@Nullable Float f10, @Nullable String str) {
        return new BaseLinkApplicationStore(f10, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseLinkApplicationStore)) {
            return false;
        }
        BaseLinkApplicationStore baseLinkApplicationStore = (BaseLinkApplicationStore) obj;
        return Intrinsics.a(this.f15145id, baseLinkApplicationStore.f15145id) && Intrinsics.a(this.name, baseLinkApplicationStore.name);
    }

    @Nullable
    public final Float getId() {
        return this.f15145id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        Float f10 = this.f15145id;
        int iHashCode = (f10 == null ? 0 : f10.hashCode()) * 31;
        String str = this.name;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BaseLinkApplicationStore(id=" + this.f15145id + ", name=" + this.name + ")";
    }

    public BaseLinkApplicationStore(@Nullable Float f10, @Nullable String str) {
        this.f15145id = f10;
        this.name = str;
    }

    public /* synthetic */ BaseLinkApplicationStore(Float f10, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : f10, (i & 2) != 0 ? null : str);
    }
}
