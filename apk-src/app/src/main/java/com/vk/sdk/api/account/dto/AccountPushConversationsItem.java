package com.vk.sdk.api.account.dto;

import a0.u;
import com.vk.sdk.api.base.dto.BaseBoolInt;
import gf.a;
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
public final class AccountPushConversationsItem {

    @b("disabled_mass_mentions")
    @Nullable
    private final BaseBoolInt disabledMassMentions;

    @b("disabled_mentions")
    @Nullable
    private final BaseBoolInt disabledMentions;

    @b("disabled_until")
    private final int disabledUntil;

    @b("peer_id")
    private final int peerId;

    @b("sound")
    @NotNull
    private final BaseBoolInt sound;

    public AccountPushConversationsItem(int i, int i10, @NotNull BaseBoolInt sound, @Nullable BaseBoolInt baseBoolInt, @Nullable BaseBoolInt baseBoolInt2) {
        Intrinsics.checkNotNullParameter(sound, "sound");
        this.disabledUntil = i;
        this.peerId = i10;
        this.sound = sound;
        this.disabledMentions = baseBoolInt;
        this.disabledMassMentions = baseBoolInt2;
    }

    public static /* synthetic */ AccountPushConversationsItem copy$default(AccountPushConversationsItem accountPushConversationsItem, int i, int i10, BaseBoolInt baseBoolInt, BaseBoolInt baseBoolInt2, BaseBoolInt baseBoolInt3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i = accountPushConversationsItem.disabledUntil;
        }
        if ((i11 & 2) != 0) {
            i10 = accountPushConversationsItem.peerId;
        }
        if ((i11 & 4) != 0) {
            baseBoolInt = accountPushConversationsItem.sound;
        }
        if ((i11 & 8) != 0) {
            baseBoolInt2 = accountPushConversationsItem.disabledMentions;
        }
        if ((i11 & 16) != 0) {
            baseBoolInt3 = accountPushConversationsItem.disabledMassMentions;
        }
        BaseBoolInt baseBoolInt4 = baseBoolInt3;
        BaseBoolInt baseBoolInt5 = baseBoolInt;
        return accountPushConversationsItem.copy(i, i10, baseBoolInt5, baseBoolInt2, baseBoolInt4);
    }

    public final int component1() {
        return this.disabledUntil;
    }

    public final int component2() {
        return this.peerId;
    }

    @NotNull
    public final BaseBoolInt component3() {
        return this.sound;
    }

    @Nullable
    public final BaseBoolInt component4() {
        return this.disabledMentions;
    }

    @Nullable
    public final BaseBoolInt component5() {
        return this.disabledMassMentions;
    }

    @NotNull
    public final AccountPushConversationsItem copy(int i, int i10, @NotNull BaseBoolInt sound, @Nullable BaseBoolInt baseBoolInt, @Nullable BaseBoolInt baseBoolInt2) {
        Intrinsics.checkNotNullParameter(sound, "sound");
        return new AccountPushConversationsItem(i, i10, sound, baseBoolInt, baseBoolInt2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountPushConversationsItem)) {
            return false;
        }
        AccountPushConversationsItem accountPushConversationsItem = (AccountPushConversationsItem) obj;
        return this.disabledUntil == accountPushConversationsItem.disabledUntil && this.peerId == accountPushConversationsItem.peerId && this.sound == accountPushConversationsItem.sound && this.disabledMentions == accountPushConversationsItem.disabledMentions && this.disabledMassMentions == accountPushConversationsItem.disabledMassMentions;
    }

    @Nullable
    public final BaseBoolInt getDisabledMassMentions() {
        return this.disabledMassMentions;
    }

    @Nullable
    public final BaseBoolInt getDisabledMentions() {
        return this.disabledMentions;
    }

    public final int getDisabledUntil() {
        return this.disabledUntil;
    }

    public final int getPeerId() {
        return this.peerId;
    }

    @NotNull
    public final BaseBoolInt getSound() {
        return this.sound;
    }

    public int hashCode() {
        int iF = a.f(this.sound, u.g(this.peerId, Integer.hashCode(this.disabledUntil) * 31, 31), 31);
        BaseBoolInt baseBoolInt = this.disabledMentions;
        int iHashCode = (iF + (baseBoolInt == null ? 0 : baseBoolInt.hashCode())) * 31;
        BaseBoolInt baseBoolInt2 = this.disabledMassMentions;
        return iHashCode + (baseBoolInt2 != null ? baseBoolInt2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.disabledUntil;
        int i10 = this.peerId;
        BaseBoolInt baseBoolInt = this.sound;
        BaseBoolInt baseBoolInt2 = this.disabledMentions;
        BaseBoolInt baseBoolInt3 = this.disabledMassMentions;
        StringBuilder sbI = z.i("AccountPushConversationsItem(disabledUntil=", i, ", peerId=", i10, ", sound=");
        a.s(sbI, baseBoolInt, ", disabledMentions=", baseBoolInt2, ", disabledMassMentions=");
        sbI.append(baseBoolInt3);
        sbI.append(")");
        return sbI.toString();
    }

    public /* synthetic */ AccountPushConversationsItem(int i, int i10, BaseBoolInt baseBoolInt, BaseBoolInt baseBoolInt2, BaseBoolInt baseBoolInt3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i10, baseBoolInt, (i11 & 8) != 0 ? null : baseBoolInt2, (i11 & 16) != 0 ? null : baseBoolInt3);
    }
}
