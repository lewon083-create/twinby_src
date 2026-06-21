package com.vk.sdk.api.messages.dto;

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
public final class MessagesPushSettings {

    @b("disabled_forever")
    private final boolean disabledForever;

    @b("disabled_mass_mentions")
    @Nullable
    private final Boolean disabledMassMentions;

    @b("disabled_mentions")
    @Nullable
    private final Boolean disabledMentions;

    @b("disabled_until")
    @Nullable
    private final Integer disabledUntil;

    @b("no_sound")
    private final boolean noSound;

    public MessagesPushSettings(boolean z5, boolean z10, @Nullable Integer num, @Nullable Boolean bool, @Nullable Boolean bool2) {
        this.disabledForever = z5;
        this.noSound = z10;
        this.disabledUntil = num;
        this.disabledMentions = bool;
        this.disabledMassMentions = bool2;
    }

    public static /* synthetic */ MessagesPushSettings copy$default(MessagesPushSettings messagesPushSettings, boolean z5, boolean z10, Integer num, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            z5 = messagesPushSettings.disabledForever;
        }
        if ((i & 2) != 0) {
            z10 = messagesPushSettings.noSound;
        }
        if ((i & 4) != 0) {
            num = messagesPushSettings.disabledUntil;
        }
        if ((i & 8) != 0) {
            bool = messagesPushSettings.disabledMentions;
        }
        if ((i & 16) != 0) {
            bool2 = messagesPushSettings.disabledMassMentions;
        }
        Boolean bool3 = bool2;
        Integer num2 = num;
        return messagesPushSettings.copy(z5, z10, num2, bool, bool3);
    }

    public final boolean component1() {
        return this.disabledForever;
    }

    public final boolean component2() {
        return this.noSound;
    }

    @Nullable
    public final Integer component3() {
        return this.disabledUntil;
    }

    @Nullable
    public final Boolean component4() {
        return this.disabledMentions;
    }

    @Nullable
    public final Boolean component5() {
        return this.disabledMassMentions;
    }

    @NotNull
    public final MessagesPushSettings copy(boolean z5, boolean z10, @Nullable Integer num, @Nullable Boolean bool, @Nullable Boolean bool2) {
        return new MessagesPushSettings(z5, z10, num, bool, bool2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesPushSettings)) {
            return false;
        }
        MessagesPushSettings messagesPushSettings = (MessagesPushSettings) obj;
        return this.disabledForever == messagesPushSettings.disabledForever && this.noSound == messagesPushSettings.noSound && Intrinsics.a(this.disabledUntil, messagesPushSettings.disabledUntil) && Intrinsics.a(this.disabledMentions, messagesPushSettings.disabledMentions) && Intrinsics.a(this.disabledMassMentions, messagesPushSettings.disabledMassMentions);
    }

    public final boolean getDisabledForever() {
        return this.disabledForever;
    }

    @Nullable
    public final Boolean getDisabledMassMentions() {
        return this.disabledMassMentions;
    }

    @Nullable
    public final Boolean getDisabledMentions() {
        return this.disabledMentions;
    }

    @Nullable
    public final Integer getDisabledUntil() {
        return this.disabledUntil;
    }

    public final boolean getNoSound() {
        return this.noSound;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11 */
    public int hashCode() {
        boolean z5 = this.disabledForever;
        ?? r02 = z5;
        if (z5) {
            r02 = 1;
        }
        int i = r02 * 31;
        boolean z10 = this.noSound;
        int i10 = (i + (z10 ? 1 : z10)) * 31;
        Integer num = this.disabledUntil;
        int iHashCode = (i10 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.disabledMentions;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.disabledMassMentions;
        return iHashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MessagesPushSettings(disabledForever=" + this.disabledForever + ", noSound=" + this.noSound + ", disabledUntil=" + this.disabledUntil + ", disabledMentions=" + this.disabledMentions + ", disabledMassMentions=" + this.disabledMassMentions + ")";
    }

    public /* synthetic */ MessagesPushSettings(boolean z5, boolean z10, Integer num, Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z5, z10, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : bool2);
    }
}
