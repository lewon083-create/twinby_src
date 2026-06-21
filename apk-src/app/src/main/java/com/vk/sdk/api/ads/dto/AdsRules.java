package com.vk.sdk.api.ads.dto;

import java.util.List;
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
public final class AdsRules {

    @b("paragraphs")
    @Nullable
    private final List<AdsParagraphs> paragraphs;

    @b("title")
    @Nullable
    private final String title;

    public AdsRules() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdsRules copy$default(AdsRules adsRules, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = adsRules.paragraphs;
        }
        if ((i & 2) != 0) {
            str = adsRules.title;
        }
        return adsRules.copy(list, str);
    }

    @Nullable
    public final List<AdsParagraphs> component1() {
        return this.paragraphs;
    }

    @Nullable
    public final String component2() {
        return this.title;
    }

    @NotNull
    public final AdsRules copy(@Nullable List<AdsParagraphs> list, @Nullable String str) {
        return new AdsRules(list, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsRules)) {
            return false;
        }
        AdsRules adsRules = (AdsRules) obj;
        return Intrinsics.a(this.paragraphs, adsRules.paragraphs) && Intrinsics.a(this.title, adsRules.title);
    }

    @Nullable
    public final List<AdsParagraphs> getParagraphs() {
        return this.paragraphs;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        List<AdsParagraphs> list = this.paragraphs;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.title;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AdsRules(paragraphs=" + this.paragraphs + ", title=" + this.title + ")";
    }

    public AdsRules(@Nullable List<AdsParagraphs> list, @Nullable String str) {
        this.paragraphs = list;
        this.title = str;
    }

    public /* synthetic */ AdsRules(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str);
    }
}
