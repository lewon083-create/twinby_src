package com.vk.sdk.api.stories.dto;

import a0.u;
import com.google.android.gms.internal.ads.om1;
import gf.a;
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
public final class StoriesGetViewersExtendedV5115Response {

    @b("count")
    private final int count;

    @b("hidden_reason")
    @Nullable
    private final String hiddenReason;

    @b("items")
    @NotNull
    private final List<StoriesViewersItem> items;

    @b("next_from")
    @Nullable
    private final String nextFrom;

    public StoriesGetViewersExtendedV5115Response(int i, @NotNull List<StoriesViewersItem> items, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.count = i;
        this.items = items;
        this.hiddenReason = str;
        this.nextFrom = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StoriesGetViewersExtendedV5115Response copy$default(StoriesGetViewersExtendedV5115Response storiesGetViewersExtendedV5115Response, int i, List list, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = storiesGetViewersExtendedV5115Response.count;
        }
        if ((i10 & 2) != 0) {
            list = storiesGetViewersExtendedV5115Response.items;
        }
        if ((i10 & 4) != 0) {
            str = storiesGetViewersExtendedV5115Response.hiddenReason;
        }
        if ((i10 & 8) != 0) {
            str2 = storiesGetViewersExtendedV5115Response.nextFrom;
        }
        return storiesGetViewersExtendedV5115Response.copy(i, list, str, str2);
    }

    public final int component1() {
        return this.count;
    }

    @NotNull
    public final List<StoriesViewersItem> component2() {
        return this.items;
    }

    @Nullable
    public final String component3() {
        return this.hiddenReason;
    }

    @Nullable
    public final String component4() {
        return this.nextFrom;
    }

    @NotNull
    public final StoriesGetViewersExtendedV5115Response copy(int i, @NotNull List<StoriesViewersItem> items, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new StoriesGetViewersExtendedV5115Response(i, items, str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesGetViewersExtendedV5115Response)) {
            return false;
        }
        StoriesGetViewersExtendedV5115Response storiesGetViewersExtendedV5115Response = (StoriesGetViewersExtendedV5115Response) obj;
        return this.count == storiesGetViewersExtendedV5115Response.count && Intrinsics.a(this.items, storiesGetViewersExtendedV5115Response.items) && Intrinsics.a(this.hiddenReason, storiesGetViewersExtendedV5115Response.hiddenReason) && Intrinsics.a(this.nextFrom, storiesGetViewersExtendedV5115Response.nextFrom);
    }

    public final int getCount() {
        return this.count;
    }

    @Nullable
    public final String getHiddenReason() {
        return this.hiddenReason;
    }

    @NotNull
    public final List<StoriesViewersItem> getItems() {
        return this.items;
    }

    @Nullable
    public final String getNextFrom() {
        return this.nextFrom;
    }

    public int hashCode() {
        int i = u.i(this.items, Integer.hashCode(this.count) * 31, 31);
        String str = this.hiddenReason;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.nextFrom;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.count;
        List<StoriesViewersItem> list = this.items;
        return om1.n(a.m(i, "StoriesGetViewersExtendedV5115Response(count=", ", items=", ", hiddenReason=", list), this.hiddenReason, ", nextFrom=", this.nextFrom, ")");
    }

    public /* synthetic */ StoriesGetViewersExtendedV5115Response(int i, List list, String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, list, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : str2);
    }
}
