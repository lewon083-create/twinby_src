package com.vk.sdk.api.market.dto;

import gf.a;
import kotlin.Metadata;
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
public final class MarketMarketCategory {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    private final int f15187id;

    @b("name")
    @NotNull
    private final String name;

    @b("section")
    @NotNull
    private final MarketSection section;

    public MarketMarketCategory(int i, @NotNull String name, @NotNull MarketSection section) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(section, "section");
        this.f15187id = i;
        this.name = name;
        this.section = section;
    }

    public static /* synthetic */ MarketMarketCategory copy$default(MarketMarketCategory marketMarketCategory, int i, String str, MarketSection marketSection, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = marketMarketCategory.f15187id;
        }
        if ((i10 & 2) != 0) {
            str = marketMarketCategory.name;
        }
        if ((i10 & 4) != 0) {
            marketSection = marketMarketCategory.section;
        }
        return marketMarketCategory.copy(i, str, marketSection);
    }

    public final int component1() {
        return this.f15187id;
    }

    @NotNull
    public final String component2() {
        return this.name;
    }

    @NotNull
    public final MarketSection component3() {
        return this.section;
    }

    @NotNull
    public final MarketMarketCategory copy(int i, @NotNull String name, @NotNull MarketSection section) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(section, "section");
        return new MarketMarketCategory(i, name, section);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketMarketCategory)) {
            return false;
        }
        MarketMarketCategory marketMarketCategory = (MarketMarketCategory) obj;
        return this.f15187id == marketMarketCategory.f15187id && Intrinsics.a(this.name, marketMarketCategory.name) && Intrinsics.a(this.section, marketMarketCategory.section);
    }

    public final int getId() {
        return this.f15187id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final MarketSection getSection() {
        return this.section;
    }

    public int hashCode() {
        return this.section.hashCode() + a.e(Integer.hashCode(this.f15187id) * 31, 31, this.name);
    }

    @NotNull
    public String toString() {
        int i = this.f15187id;
        String str = this.name;
        MarketSection marketSection = this.section;
        StringBuilder sbI = pe.a.i(i, "MarketMarketCategory(id=", ", name=", str, ", section=");
        sbI.append(marketSection);
        sbI.append(")");
        return sbI.toString();
    }
}
