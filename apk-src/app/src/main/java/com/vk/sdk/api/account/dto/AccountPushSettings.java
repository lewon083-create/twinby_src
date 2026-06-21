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
public final class AccountPushSettings {

    @b("conversations")
    @Nullable
    private final AccountPushConversations conversations;

    @b("disabled")
    @Nullable
    private final BaseBoolInt disabled;

    @b("disabled_until")
    @Nullable
    private final Integer disabledUntil;

    @b("settings")
    @Nullable
    private final AccountPushParams settings;

    public AccountPushSettings() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ AccountPushSettings copy$default(AccountPushSettings accountPushSettings, BaseBoolInt baseBoolInt, Integer num, AccountPushParams accountPushParams, AccountPushConversations accountPushConversations, int i, Object obj) {
        if ((i & 1) != 0) {
            baseBoolInt = accountPushSettings.disabled;
        }
        if ((i & 2) != 0) {
            num = accountPushSettings.disabledUntil;
        }
        if ((i & 4) != 0) {
            accountPushParams = accountPushSettings.settings;
        }
        if ((i & 8) != 0) {
            accountPushConversations = accountPushSettings.conversations;
        }
        return accountPushSettings.copy(baseBoolInt, num, accountPushParams, accountPushConversations);
    }

    @Nullable
    public final BaseBoolInt component1() {
        return this.disabled;
    }

    @Nullable
    public final Integer component2() {
        return this.disabledUntil;
    }

    @Nullable
    public final AccountPushParams component3() {
        return this.settings;
    }

    @Nullable
    public final AccountPushConversations component4() {
        return this.conversations;
    }

    @NotNull
    public final AccountPushSettings copy(@Nullable BaseBoolInt baseBoolInt, @Nullable Integer num, @Nullable AccountPushParams accountPushParams, @Nullable AccountPushConversations accountPushConversations) {
        return new AccountPushSettings(baseBoolInt, num, accountPushParams, accountPushConversations);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountPushSettings)) {
            return false;
        }
        AccountPushSettings accountPushSettings = (AccountPushSettings) obj;
        return this.disabled == accountPushSettings.disabled && Intrinsics.a(this.disabledUntil, accountPushSettings.disabledUntil) && Intrinsics.a(this.settings, accountPushSettings.settings) && Intrinsics.a(this.conversations, accountPushSettings.conversations);
    }

    @Nullable
    public final AccountPushConversations getConversations() {
        return this.conversations;
    }

    @Nullable
    public final BaseBoolInt getDisabled() {
        return this.disabled;
    }

    @Nullable
    public final Integer getDisabledUntil() {
        return this.disabledUntil;
    }

    @Nullable
    public final AccountPushParams getSettings() {
        return this.settings;
    }

    public int hashCode() {
        BaseBoolInt baseBoolInt = this.disabled;
        int iHashCode = (baseBoolInt == null ? 0 : baseBoolInt.hashCode()) * 31;
        Integer num = this.disabledUntil;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        AccountPushParams accountPushParams = this.settings;
        int iHashCode3 = (iHashCode2 + (accountPushParams == null ? 0 : accountPushParams.hashCode())) * 31;
        AccountPushConversations accountPushConversations = this.conversations;
        return iHashCode3 + (accountPushConversations != null ? accountPushConversations.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AccountPushSettings(disabled=" + this.disabled + ", disabledUntil=" + this.disabledUntil + ", settings=" + this.settings + ", conversations=" + this.conversations + ")";
    }

    public AccountPushSettings(@Nullable BaseBoolInt baseBoolInt, @Nullable Integer num, @Nullable AccountPushParams accountPushParams, @Nullable AccountPushConversations accountPushConversations) {
        this.disabled = baseBoolInt;
        this.disabledUntil = num;
        this.settings = accountPushParams;
        this.conversations = accountPushConversations;
    }

    public /* synthetic */ AccountPushSettings(BaseBoolInt baseBoolInt, Integer num, AccountPushParams accountPushParams, AccountPushConversations accountPushConversations, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : baseBoolInt, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : accountPushParams, (i & 8) != 0 ? null : accountPushConversations);
    }
}
