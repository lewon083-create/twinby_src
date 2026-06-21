package com.vk.sdk.api.account.dto;

import com.vk.sdk.api.base.dto.BaseBoolInt;
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
public final class AccountSaveProfileInfoResponse {

    @b("changed")
    @NotNull
    private final BaseBoolInt changed;

    @b("name_request")
    @Nullable
    private final AccountNameRequest nameRequest;

    public AccountSaveProfileInfoResponse(@NotNull BaseBoolInt changed, @Nullable AccountNameRequest accountNameRequest) {
        Intrinsics.checkNotNullParameter(changed, "changed");
        this.changed = changed;
        this.nameRequest = accountNameRequest;
    }

    public static /* synthetic */ AccountSaveProfileInfoResponse copy$default(AccountSaveProfileInfoResponse accountSaveProfileInfoResponse, BaseBoolInt baseBoolInt, AccountNameRequest accountNameRequest, int i, Object obj) {
        if ((i & 1) != 0) {
            baseBoolInt = accountSaveProfileInfoResponse.changed;
        }
        if ((i & 2) != 0) {
            accountNameRequest = accountSaveProfileInfoResponse.nameRequest;
        }
        return accountSaveProfileInfoResponse.copy(baseBoolInt, accountNameRequest);
    }

    @NotNull
    public final BaseBoolInt component1() {
        return this.changed;
    }

    @Nullable
    public final AccountNameRequest component2() {
        return this.nameRequest;
    }

    @NotNull
    public final AccountSaveProfileInfoResponse copy(@NotNull BaseBoolInt changed, @Nullable AccountNameRequest accountNameRequest) {
        Intrinsics.checkNotNullParameter(changed, "changed");
        return new AccountSaveProfileInfoResponse(changed, accountNameRequest);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountSaveProfileInfoResponse)) {
            return false;
        }
        AccountSaveProfileInfoResponse accountSaveProfileInfoResponse = (AccountSaveProfileInfoResponse) obj;
        return this.changed == accountSaveProfileInfoResponse.changed && Intrinsics.a(this.nameRequest, accountSaveProfileInfoResponse.nameRequest);
    }

    @NotNull
    public final BaseBoolInt getChanged() {
        return this.changed;
    }

    @Nullable
    public final AccountNameRequest getNameRequest() {
        return this.nameRequest;
    }

    public int hashCode() {
        int iHashCode = this.changed.hashCode() * 31;
        AccountNameRequest accountNameRequest = this.nameRequest;
        return iHashCode + (accountNameRequest == null ? 0 : accountNameRequest.hashCode());
    }

    @NotNull
    public String toString() {
        return "AccountSaveProfileInfoResponse(changed=" + this.changed + ", nameRequest=" + this.nameRequest + ")";
    }

    public /* synthetic */ AccountSaveProfileInfoResponse(BaseBoolInt baseBoolInt, AccountNameRequest accountNameRequest, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(baseBoolInt, (i & 2) != 0 ? null : accountNameRequest);
    }
}
