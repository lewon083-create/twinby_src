package com.vk.sdk.api.ads.dto;

import a0.u;
import gf.a;
import kotlin.Metadata;
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
public final class AdsLinkStatus {

    @b("description")
    @NotNull
    private final String description;

    @b("redirect_url")
    @NotNull
    private final String redirectUrl;

    @b("status")
    @NotNull
    private final String status;

    public AdsLinkStatus(@NotNull String description, @NotNull String redirectUrl, @NotNull String status) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(redirectUrl, "redirectUrl");
        Intrinsics.checkNotNullParameter(status, "status");
        this.description = description;
        this.redirectUrl = redirectUrl;
        this.status = status;
    }

    public static /* synthetic */ AdsLinkStatus copy$default(AdsLinkStatus adsLinkStatus, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = adsLinkStatus.description;
        }
        if ((i & 2) != 0) {
            str2 = adsLinkStatus.redirectUrl;
        }
        if ((i & 4) != 0) {
            str3 = adsLinkStatus.status;
        }
        return adsLinkStatus.copy(str, str2, str3);
    }

    @NotNull
    public final String component1() {
        return this.description;
    }

    @NotNull
    public final String component2() {
        return this.redirectUrl;
    }

    @NotNull
    public final String component3() {
        return this.status;
    }

    @NotNull
    public final AdsLinkStatus copy(@NotNull String description, @NotNull String redirectUrl, @NotNull String status) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(redirectUrl, "redirectUrl");
        Intrinsics.checkNotNullParameter(status, "status");
        return new AdsLinkStatus(description, redirectUrl, status);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsLinkStatus)) {
            return false;
        }
        AdsLinkStatus adsLinkStatus = (AdsLinkStatus) obj;
        return Intrinsics.a(this.description, adsLinkStatus.description) && Intrinsics.a(this.redirectUrl, adsLinkStatus.redirectUrl) && Intrinsics.a(this.status, adsLinkStatus.status);
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.status.hashCode() + a.e(this.description.hashCode() * 31, 31, this.redirectUrl);
    }

    @NotNull
    public String toString() {
        String str = this.description;
        String str2 = this.redirectUrl;
        return u.o(z.j("AdsLinkStatus(description=", str, ", redirectUrl=", str2, ", status="), this.status, ")");
    }
}
