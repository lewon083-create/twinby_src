package com.vk.sdk.api.account.dto;

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
public final class AccountUserSettingsInterest {

    @b("title")
    @NotNull
    private final String title;

    @b("value")
    @NotNull
    private final String value;

    public AccountUserSettingsInterest(@NotNull String title, @NotNull String value) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        this.title = title;
        this.value = value;
    }

    public static /* synthetic */ AccountUserSettingsInterest copy$default(AccountUserSettingsInterest accountUserSettingsInterest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = accountUserSettingsInterest.title;
        }
        if ((i & 2) != 0) {
            str2 = accountUserSettingsInterest.value;
        }
        return accountUserSettingsInterest.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.title;
    }

    @NotNull
    public final String component2() {
        return this.value;
    }

    @NotNull
    public final AccountUserSettingsInterest copy(@NotNull String title, @NotNull String value) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        return new AccountUserSettingsInterest(title, value);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountUserSettingsInterest)) {
            return false;
        }
        AccountUserSettingsInterest accountUserSettingsInterest = (AccountUserSettingsInterest) obj;
        return Intrinsics.a(this.title, accountUserSettingsInterest.title) && Intrinsics.a(this.value, accountUserSettingsInterest.value);
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + (this.title.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return z.f("AccountUserSettingsInterest(title=", this.title, ", value=", this.value, ")");
    }
}
