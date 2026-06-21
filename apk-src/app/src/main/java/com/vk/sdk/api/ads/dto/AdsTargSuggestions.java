package com.vk.sdk.api.ads.dto;

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
public final class AdsTargSuggestions {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    @Nullable
    private final Integer f15124id;

    @b("name")
    @Nullable
    private final String name;

    public AdsTargSuggestions() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AdsTargSuggestions copy$default(AdsTargSuggestions adsTargSuggestions, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = adsTargSuggestions.f15124id;
        }
        if ((i & 2) != 0) {
            str = adsTargSuggestions.name;
        }
        return adsTargSuggestions.copy(num, str);
    }

    @Nullable
    public final Integer component1() {
        return this.f15124id;
    }

    @Nullable
    public final String component2() {
        return this.name;
    }

    @NotNull
    public final AdsTargSuggestions copy(@Nullable Integer num, @Nullable String str) {
        return new AdsTargSuggestions(num, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsTargSuggestions)) {
            return false;
        }
        AdsTargSuggestions adsTargSuggestions = (AdsTargSuggestions) obj;
        return Intrinsics.a(this.f15124id, adsTargSuggestions.f15124id) && Intrinsics.a(this.name, adsTargSuggestions.name);
    }

    @Nullable
    public final Integer getId() {
        return this.f15124id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        Integer num = this.f15124id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.name;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AdsTargSuggestions(id=" + this.f15124id + ", name=" + this.name + ")";
    }

    public AdsTargSuggestions(@Nullable Integer num, @Nullable String str) {
        this.f15124id = num;
        this.name = str;
    }

    public /* synthetic */ AdsTargSuggestions(Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
    }
}
