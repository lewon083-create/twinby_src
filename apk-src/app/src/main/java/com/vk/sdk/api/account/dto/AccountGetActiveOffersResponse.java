package com.vk.sdk.api.account.dto;

import gf.a;
import java.util.List;
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
public final class AccountGetActiveOffersResponse {

    @b("count")
    private final int count;

    @b("items")
    @NotNull
    private final List<AccountOffer> items;

    public AccountGetActiveOffersResponse(int i, @NotNull List<AccountOffer> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.count = i;
        this.items = items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AccountGetActiveOffersResponse copy$default(AccountGetActiveOffersResponse accountGetActiveOffersResponse, int i, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = accountGetActiveOffersResponse.count;
        }
        if ((i10 & 2) != 0) {
            list = accountGetActiveOffersResponse.items;
        }
        return accountGetActiveOffersResponse.copy(i, list);
    }

    public final int component1() {
        return this.count;
    }

    @NotNull
    public final List<AccountOffer> component2() {
        return this.items;
    }

    @NotNull
    public final AccountGetActiveOffersResponse copy(int i, @NotNull List<AccountOffer> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new AccountGetActiveOffersResponse(i, items);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountGetActiveOffersResponse)) {
            return false;
        }
        AccountGetActiveOffersResponse accountGetActiveOffersResponse = (AccountGetActiveOffersResponse) obj;
        return this.count == accountGetActiveOffersResponse.count && Intrinsics.a(this.items, accountGetActiveOffersResponse.items);
    }

    public final int getCount() {
        return this.count;
    }

    @NotNull
    public final List<AccountOffer> getItems() {
        return this.items;
    }

    public int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    @NotNull
    public String toString() {
        return a.h(this.count, "AccountGetActiveOffersResponse(count=", ", items=", ")", this.items);
    }
}
