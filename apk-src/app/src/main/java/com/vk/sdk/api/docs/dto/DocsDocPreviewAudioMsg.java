package com.vk.sdk.api.docs.dto;

import gf.a;
import java.util.List;
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
public final class DocsDocPreviewAudioMsg {

    @b("duration")
    private final int duration;

    @b("link_mp3")
    @NotNull
    private final String linkMp3;

    @b("link_ogg")
    @NotNull
    private final String linkOgg;

    @b("waveform")
    @NotNull
    private final List<Integer> waveform;

    public DocsDocPreviewAudioMsg(int i, @NotNull String linkMp3, @NotNull String linkOgg, @NotNull List<Integer> waveform) {
        Intrinsics.checkNotNullParameter(linkMp3, "linkMp3");
        Intrinsics.checkNotNullParameter(linkOgg, "linkOgg");
        Intrinsics.checkNotNullParameter(waveform, "waveform");
        this.duration = i;
        this.linkMp3 = linkMp3;
        this.linkOgg = linkOgg;
        this.waveform = waveform;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DocsDocPreviewAudioMsg copy$default(DocsDocPreviewAudioMsg docsDocPreviewAudioMsg, int i, String str, String str2, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = docsDocPreviewAudioMsg.duration;
        }
        if ((i10 & 2) != 0) {
            str = docsDocPreviewAudioMsg.linkMp3;
        }
        if ((i10 & 4) != 0) {
            str2 = docsDocPreviewAudioMsg.linkOgg;
        }
        if ((i10 & 8) != 0) {
            list = docsDocPreviewAudioMsg.waveform;
        }
        return docsDocPreviewAudioMsg.copy(i, str, str2, list);
    }

    public final int component1() {
        return this.duration;
    }

    @NotNull
    public final String component2() {
        return this.linkMp3;
    }

    @NotNull
    public final String component3() {
        return this.linkOgg;
    }

    @NotNull
    public final List<Integer> component4() {
        return this.waveform;
    }

    @NotNull
    public final DocsDocPreviewAudioMsg copy(int i, @NotNull String linkMp3, @NotNull String linkOgg, @NotNull List<Integer> waveform) {
        Intrinsics.checkNotNullParameter(linkMp3, "linkMp3");
        Intrinsics.checkNotNullParameter(linkOgg, "linkOgg");
        Intrinsics.checkNotNullParameter(waveform, "waveform");
        return new DocsDocPreviewAudioMsg(i, linkMp3, linkOgg, waveform);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocsDocPreviewAudioMsg)) {
            return false;
        }
        DocsDocPreviewAudioMsg docsDocPreviewAudioMsg = (DocsDocPreviewAudioMsg) obj;
        return this.duration == docsDocPreviewAudioMsg.duration && Intrinsics.a(this.linkMp3, docsDocPreviewAudioMsg.linkMp3) && Intrinsics.a(this.linkOgg, docsDocPreviewAudioMsg.linkOgg) && Intrinsics.a(this.waveform, docsDocPreviewAudioMsg.waveform);
    }

    public final int getDuration() {
        return this.duration;
    }

    @NotNull
    public final String getLinkMp3() {
        return this.linkMp3;
    }

    @NotNull
    public final String getLinkOgg() {
        return this.linkOgg;
    }

    @NotNull
    public final List<Integer> getWaveform() {
        return this.waveform;
    }

    public int hashCode() {
        return this.waveform.hashCode() + a.e(a.e(Integer.hashCode(this.duration) * 31, 31, this.linkMp3), 31, this.linkOgg);
    }

    @NotNull
    public String toString() {
        int i = this.duration;
        String str = this.linkMp3;
        String str2 = this.linkOgg;
        List<Integer> list = this.waveform;
        StringBuilder sbI = pe.a.i(i, "DocsDocPreviewAudioMsg(duration=", ", linkMp3=", str, ", linkOgg=");
        sbI.append(str2);
        sbI.append(", waveform=");
        sbI.append(list);
        sbI.append(")");
        return sbI.toString();
    }
}
