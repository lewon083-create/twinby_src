package com.vk.sdk.api.market.dto;

import a0.u;
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
public final class MarketCurrency {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    private final int f15185id;

    @b("name")
    @NotNull
    private final String name;

    @b("title")
    @NotNull
    private final String title;

    public MarketCurrency(int i, @NotNull String name, @NotNull String title) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f15185id = i;
        this.name = name;
        this.title = title;
    }

    public static /* synthetic */ MarketCurrency copy$default(MarketCurrency marketCurrency, int i, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = marketCurrency.f15185id;
        }
        if ((i10 & 2) != 0) {
            str = marketCurrency.name;
        }
        if ((i10 & 4) != 0) {
            str2 = marketCurrency.title;
        }
        return marketCurrency.copy(i, str, str2);
    }

    public final int component1() {
        return this.f15185id;
    }

    @NotNull
    public final String component2() {
        return this.name;
    }

    @NotNull
    public final String component3() {
        return this.title;
    }

    @NotNull
    public final MarketCurrency copy(int i, @NotNull String name, @NotNull String title) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(title, "title");
        return new MarketCurrency(i, name, title);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketCurrency)) {
            return false;
        }
        MarketCurrency marketCurrency = (MarketCurrency) obj;
        return this.f15185id == marketCurrency.f15185id && Intrinsics.a(this.name, marketCurrency.name) && Intrinsics.a(this.title, marketCurrency.title);
    }

    public final int getId() {
        return this.f15185id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.title.hashCode() + a.e(Integer.hashCode(this.f15185id) * 31, 31, this.name);
    }

    @NotNull
    public String toString() {
        int i = this.f15185id;
        String str = this.name;
        return u.o(pe.a.i(i, "MarketCurrency(id=", ", name=", str, ", title="), this.title, ")");
    }
}
