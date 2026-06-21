package com.vk.sdk.api.discover.dto;

import a0.u;
import gf.a;
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
public final class DiscoverCarouselButtonContext {

    @b("object_id")
    private final int objectId;

    @b("original_url")
    @Nullable
    private final String originalUrl;

    @b("view_url")
    @NotNull
    private final String viewUrl;

    public DiscoverCarouselButtonContext(int i, @NotNull String viewUrl, @Nullable String str) {
        Intrinsics.checkNotNullParameter(viewUrl, "viewUrl");
        this.objectId = i;
        this.viewUrl = viewUrl;
        this.originalUrl = str;
    }

    public static /* synthetic */ DiscoverCarouselButtonContext copy$default(DiscoverCarouselButtonContext discoverCarouselButtonContext, int i, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = discoverCarouselButtonContext.objectId;
        }
        if ((i10 & 2) != 0) {
            str = discoverCarouselButtonContext.viewUrl;
        }
        if ((i10 & 4) != 0) {
            str2 = discoverCarouselButtonContext.originalUrl;
        }
        return discoverCarouselButtonContext.copy(i, str, str2);
    }

    public final int component1() {
        return this.objectId;
    }

    @NotNull
    public final String component2() {
        return this.viewUrl;
    }

    @Nullable
    public final String component3() {
        return this.originalUrl;
    }

    @NotNull
    public final DiscoverCarouselButtonContext copy(int i, @NotNull String viewUrl, @Nullable String str) {
        Intrinsics.checkNotNullParameter(viewUrl, "viewUrl");
        return new DiscoverCarouselButtonContext(i, viewUrl, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscoverCarouselButtonContext)) {
            return false;
        }
        DiscoverCarouselButtonContext discoverCarouselButtonContext = (DiscoverCarouselButtonContext) obj;
        return this.objectId == discoverCarouselButtonContext.objectId && Intrinsics.a(this.viewUrl, discoverCarouselButtonContext.viewUrl) && Intrinsics.a(this.originalUrl, discoverCarouselButtonContext.originalUrl);
    }

    public final int getObjectId() {
        return this.objectId;
    }

    @Nullable
    public final String getOriginalUrl() {
        return this.originalUrl;
    }

    @NotNull
    public final String getViewUrl() {
        return this.viewUrl;
    }

    public int hashCode() {
        int iE = a.e(Integer.hashCode(this.objectId) * 31, 31, this.viewUrl);
        String str = this.originalUrl;
        return iE + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        int i = this.objectId;
        String str = this.viewUrl;
        return u.o(pe.a.i(i, "DiscoverCarouselButtonContext(objectId=", ", viewUrl=", str, ", originalUrl="), this.originalUrl, ")");
    }

    public /* synthetic */ DiscoverCarouselButtonContext(int i, String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i10 & 4) != 0 ? null : str2);
    }
}
