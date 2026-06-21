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
public final class AdsAccesses {

    @b("client_id")
    @Nullable
    private final String clientId;

    @b("role")
    @Nullable
    private final AdsAccessRole role;

    public AdsAccesses() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AdsAccesses copy$default(AdsAccesses adsAccesses, String str, AdsAccessRole adsAccessRole, int i, Object obj) {
        if ((i & 1) != 0) {
            str = adsAccesses.clientId;
        }
        if ((i & 2) != 0) {
            adsAccessRole = adsAccesses.role;
        }
        return adsAccesses.copy(str, adsAccessRole);
    }

    @Nullable
    public final String component1() {
        return this.clientId;
    }

    @Nullable
    public final AdsAccessRole component2() {
        return this.role;
    }

    @NotNull
    public final AdsAccesses copy(@Nullable String str, @Nullable AdsAccessRole adsAccessRole) {
        return new AdsAccesses(str, adsAccessRole);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsAccesses)) {
            return false;
        }
        AdsAccesses adsAccesses = (AdsAccesses) obj;
        return Intrinsics.a(this.clientId, adsAccesses.clientId) && this.role == adsAccesses.role;
    }

    @Nullable
    public final String getClientId() {
        return this.clientId;
    }

    @Nullable
    public final AdsAccessRole getRole() {
        return this.role;
    }

    public int hashCode() {
        String str = this.clientId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        AdsAccessRole adsAccessRole = this.role;
        return iHashCode + (adsAccessRole != null ? adsAccessRole.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AdsAccesses(clientId=" + this.clientId + ", role=" + this.role + ")";
    }

    public AdsAccesses(@Nullable String str, @Nullable AdsAccessRole adsAccessRole) {
        this.clientId = str;
        this.role = adsAccessRole;
    }

    public /* synthetic */ AdsAccesses(String str, AdsAccessRole adsAccessRole, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : adsAccessRole);
    }
}
