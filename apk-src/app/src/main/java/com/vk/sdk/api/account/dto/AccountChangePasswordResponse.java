package com.vk.sdk.api.account.dto;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
public final class AccountChangePasswordResponse {

    @b("secret")
    @Nullable
    private final String secret;

    @b("token")
    @NotNull
    private final String token;

    public AccountChangePasswordResponse(@NotNull String token, @Nullable String str) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.token = token;
        this.secret = str;
    }

    public static /* synthetic */ AccountChangePasswordResponse copy$default(AccountChangePasswordResponse accountChangePasswordResponse, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = accountChangePasswordResponse.token;
        }
        if ((i & 2) != 0) {
            str2 = accountChangePasswordResponse.secret;
        }
        return accountChangePasswordResponse.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.token;
    }

    @Nullable
    public final String component2() {
        return this.secret;
    }

    @NotNull
    public final AccountChangePasswordResponse copy(@NotNull String token, @Nullable String str) {
        Intrinsics.checkNotNullParameter(token, "token");
        return new AccountChangePasswordResponse(token, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountChangePasswordResponse)) {
            return false;
        }
        AccountChangePasswordResponse accountChangePasswordResponse = (AccountChangePasswordResponse) obj;
        return Intrinsics.a(this.token, accountChangePasswordResponse.token) && Intrinsics.a(this.secret, accountChangePasswordResponse.secret);
    }

    @Nullable
    public final String getSecret() {
        return this.secret;
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        int iHashCode = this.token.hashCode() * 31;
        String str = this.secret;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return z.f("AccountChangePasswordResponse(token=", this.token, ", secret=", this.secret, ")");
    }

    public /* synthetic */ AccountChangePasswordResponse(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
