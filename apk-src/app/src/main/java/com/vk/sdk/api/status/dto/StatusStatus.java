package com.vk.sdk.api.status.dto;

import com.vk.sdk.api.audio.dto.AudioAudio;
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
public final class StatusStatus {

    @b("audio")
    @Nullable
    private final AudioAudio audio;

    @b("text")
    @NotNull
    private final String text;

    public StatusStatus(@NotNull String text, @Nullable AudioAudio audioAudio) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.audio = audioAudio;
    }

    public static /* synthetic */ StatusStatus copy$default(StatusStatus statusStatus, String str, AudioAudio audioAudio, int i, Object obj) {
        if ((i & 1) != 0) {
            str = statusStatus.text;
        }
        if ((i & 2) != 0) {
            audioAudio = statusStatus.audio;
        }
        return statusStatus.copy(str, audioAudio);
    }

    @NotNull
    public final String component1() {
        return this.text;
    }

    @Nullable
    public final AudioAudio component2() {
        return this.audio;
    }

    @NotNull
    public final StatusStatus copy(@NotNull String text, @Nullable AudioAudio audioAudio) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new StatusStatus(text, audioAudio);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatusStatus)) {
            return false;
        }
        StatusStatus statusStatus = (StatusStatus) obj;
        return Intrinsics.a(this.text, statusStatus.text) && Intrinsics.a(this.audio, statusStatus.audio);
    }

    @Nullable
    public final AudioAudio getAudio() {
        return this.audio;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        AudioAudio audioAudio = this.audio;
        return iHashCode + (audioAudio == null ? 0 : audioAudio.hashCode());
    }

    @NotNull
    public String toString() {
        return "StatusStatus(text=" + this.text + ", audio=" + this.audio + ")";
    }

    public /* synthetic */ StatusStatus(String str, AudioAudio audioAudio, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : audioAudio);
    }
}
