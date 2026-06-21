package com.vk.sdk.api.messages.dto;

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
public final class MessagesChatPushSettings {

    @b("disabled_until")
    @Nullable
    private final Integer disabledUntil;

    @b("sound")
    @Nullable
    private final BaseBoolInt sound;

    public MessagesChatPushSettings() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ MessagesChatPushSettings copy$default(MessagesChatPushSettings messagesChatPushSettings, Integer num, BaseBoolInt baseBoolInt, int i, Object obj) {
        if ((i & 1) != 0) {
            num = messagesChatPushSettings.disabledUntil;
        }
        if ((i & 2) != 0) {
            baseBoolInt = messagesChatPushSettings.sound;
        }
        return messagesChatPushSettings.copy(num, baseBoolInt);
    }

    @Nullable
    public final Integer component1() {
        return this.disabledUntil;
    }

    @Nullable
    public final BaseBoolInt component2() {
        return this.sound;
    }

    @NotNull
    public final MessagesChatPushSettings copy(@Nullable Integer num, @Nullable BaseBoolInt baseBoolInt) {
        return new MessagesChatPushSettings(num, baseBoolInt);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesChatPushSettings)) {
            return false;
        }
        MessagesChatPushSettings messagesChatPushSettings = (MessagesChatPushSettings) obj;
        return Intrinsics.a(this.disabledUntil, messagesChatPushSettings.disabledUntil) && this.sound == messagesChatPushSettings.sound;
    }

    @Nullable
    public final Integer getDisabledUntil() {
        return this.disabledUntil;
    }

    @Nullable
    public final BaseBoolInt getSound() {
        return this.sound;
    }

    public int hashCode() {
        Integer num = this.disabledUntil;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        BaseBoolInt baseBoolInt = this.sound;
        return iHashCode + (baseBoolInt != null ? baseBoolInt.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MessagesChatPushSettings(disabledUntil=" + this.disabledUntil + ", sound=" + this.sound + ")";
    }

    public MessagesChatPushSettings(@Nullable Integer num, @Nullable BaseBoolInt baseBoolInt) {
        this.disabledUntil = num;
        this.sound = baseBoolInt;
    }

    public /* synthetic */ MessagesChatPushSettings(Integer num, BaseBoolInt baseBoolInt, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : baseBoolInt);
    }
}
