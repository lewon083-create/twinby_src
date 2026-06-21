package com.vk.sdk.api.messages.dto;

import a0.u;
import com.vk.dto.common.id.UserId;
import gf.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l7.o;
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
public final class MessagesAudioMessage {

    @b("access_key")
    @Nullable
    private final String accessKey;

    @b("duration")
    private final int duration;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b("id")
    private final int f15192id;

    @b("link_mp3")
    @NotNull
    private final String linkMp3;

    @b("link_ogg")
    @NotNull
    private final String linkOgg;

    @b("owner_id")
    @NotNull
    private final UserId ownerId;

    @b("transcript_error")
    @Nullable
    private final Integer transcriptError;

    @b("waveform")
    @NotNull
    private final List<Integer> waveform;

    public MessagesAudioMessage(int i, int i10, @NotNull String linkMp3, @NotNull String linkOgg, @NotNull UserId ownerId, @NotNull List<Integer> waveform, @Nullable String str, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(linkMp3, "linkMp3");
        Intrinsics.checkNotNullParameter(linkOgg, "linkOgg");
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(waveform, "waveform");
        this.duration = i;
        this.f15192id = i10;
        this.linkMp3 = linkMp3;
        this.linkOgg = linkOgg;
        this.ownerId = ownerId;
        this.waveform = waveform;
        this.accessKey = str;
        this.transcriptError = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MessagesAudioMessage copy$default(MessagesAudioMessage messagesAudioMessage, int i, int i10, String str, String str2, UserId userId, List list, String str3, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i = messagesAudioMessage.duration;
        }
        if ((i11 & 2) != 0) {
            i10 = messagesAudioMessage.f15192id;
        }
        if ((i11 & 4) != 0) {
            str = messagesAudioMessage.linkMp3;
        }
        if ((i11 & 8) != 0) {
            str2 = messagesAudioMessage.linkOgg;
        }
        if ((i11 & 16) != 0) {
            userId = messagesAudioMessage.ownerId;
        }
        if ((i11 & 32) != 0) {
            list = messagesAudioMessage.waveform;
        }
        if ((i11 & 64) != 0) {
            str3 = messagesAudioMessage.accessKey;
        }
        if ((i11 & 128) != 0) {
            num = messagesAudioMessage.transcriptError;
        }
        String str4 = str3;
        Integer num2 = num;
        UserId userId2 = userId;
        List list2 = list;
        return messagesAudioMessage.copy(i, i10, str, str2, userId2, list2, str4, num2);
    }

    public final int component1() {
        return this.duration;
    }

    public final int component2() {
        return this.f15192id;
    }

    @NotNull
    public final String component3() {
        return this.linkMp3;
    }

    @NotNull
    public final String component4() {
        return this.linkOgg;
    }

    @NotNull
    public final UserId component5() {
        return this.ownerId;
    }

    @NotNull
    public final List<Integer> component6() {
        return this.waveform;
    }

    @Nullable
    public final String component7() {
        return this.accessKey;
    }

    @Nullable
    public final Integer component8() {
        return this.transcriptError;
    }

    @NotNull
    public final MessagesAudioMessage copy(int i, int i10, @NotNull String linkMp3, @NotNull String linkOgg, @NotNull UserId ownerId, @NotNull List<Integer> waveform, @Nullable String str, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(linkMp3, "linkMp3");
        Intrinsics.checkNotNullParameter(linkOgg, "linkOgg");
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(waveform, "waveform");
        return new MessagesAudioMessage(i, i10, linkMp3, linkOgg, ownerId, waveform, str, num);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesAudioMessage)) {
            return false;
        }
        MessagesAudioMessage messagesAudioMessage = (MessagesAudioMessage) obj;
        return this.duration == messagesAudioMessage.duration && this.f15192id == messagesAudioMessage.f15192id && Intrinsics.a(this.linkMp3, messagesAudioMessage.linkMp3) && Intrinsics.a(this.linkOgg, messagesAudioMessage.linkOgg) && Intrinsics.a(this.ownerId, messagesAudioMessage.ownerId) && Intrinsics.a(this.waveform, messagesAudioMessage.waveform) && Intrinsics.a(this.accessKey, messagesAudioMessage.accessKey) && Intrinsics.a(this.transcriptError, messagesAudioMessage.transcriptError);
    }

    @Nullable
    public final String getAccessKey() {
        return this.accessKey;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final int getId() {
        return this.f15192id;
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
    public final UserId getOwnerId() {
        return this.ownerId;
    }

    @Nullable
    public final Integer getTranscriptError() {
        return this.transcriptError;
    }

    @NotNull
    public final List<Integer> getWaveform() {
        return this.waveform;
    }

    public int hashCode() {
        int i = u.i(this.waveform, o.e(this.ownerId, a.e(a.e(u.g(this.f15192id, Integer.hashCode(this.duration) * 31, 31), 31, this.linkMp3), 31, this.linkOgg), 31), 31);
        String str = this.accessKey;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.transcriptError;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.duration;
        int i10 = this.f15192id;
        String str = this.linkMp3;
        String str2 = this.linkOgg;
        UserId userId = this.ownerId;
        List<Integer> list = this.waveform;
        String str3 = this.accessKey;
        Integer num = this.transcriptError;
        StringBuilder sbI = z.i("MessagesAudioMessage(duration=", i, ", id=", i10, ", linkMp3=");
        o.t(sbI, str, ", linkOgg=", str2, ", ownerId=");
        sbI.append(userId);
        sbI.append(", waveform=");
        sbI.append(list);
        sbI.append(", accessKey=");
        sbI.append(str3);
        sbI.append(", transcriptError=");
        sbI.append(num);
        sbI.append(")");
        return sbI.toString();
    }

    public /* synthetic */ MessagesAudioMessage(int i, int i10, String str, String str2, UserId userId, List list, String str3, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i10, str, str2, userId, list, (i11 & 64) != 0 ? null : str3, (i11 & 128) != 0 ? null : num);
    }
}
