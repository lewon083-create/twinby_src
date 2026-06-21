package com.vk.sdk.api.messages.dto;

import com.vk.sdk.api.base.dto.BaseBoolInt;
import io.sentry.protocol.Device;
import kotlin.Metadata;
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
public final class MessagesLastActivity {

    @b(Device.JsonKeys.ONLINE)
    @NotNull
    private final BaseBoolInt online;

    @b("time")
    private final int time;

    public MessagesLastActivity(@NotNull BaseBoolInt online, int i) {
        Intrinsics.checkNotNullParameter(online, "online");
        this.online = online;
        this.time = i;
    }

    public static /* synthetic */ MessagesLastActivity copy$default(MessagesLastActivity messagesLastActivity, BaseBoolInt baseBoolInt, int i, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            baseBoolInt = messagesLastActivity.online;
        }
        if ((i10 & 2) != 0) {
            i = messagesLastActivity.time;
        }
        return messagesLastActivity.copy(baseBoolInt, i);
    }

    @NotNull
    public final BaseBoolInt component1() {
        return this.online;
    }

    public final int component2() {
        return this.time;
    }

    @NotNull
    public final MessagesLastActivity copy(@NotNull BaseBoolInt online, int i) {
        Intrinsics.checkNotNullParameter(online, "online");
        return new MessagesLastActivity(online, i);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesLastActivity)) {
            return false;
        }
        MessagesLastActivity messagesLastActivity = (MessagesLastActivity) obj;
        return this.online == messagesLastActivity.online && this.time == messagesLastActivity.time;
    }

    @NotNull
    public final BaseBoolInt getOnline() {
        return this.online;
    }

    public final int getTime() {
        return this.time;
    }

    public int hashCode() {
        return Integer.hashCode(this.time) + (this.online.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "MessagesLastActivity(online=" + this.online + ", time=" + this.time + ")";
    }
}
