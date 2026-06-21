package com.vk.sdk.api.calls.dto;

import a0.u;
import io.sentry.protocol.SentryThread;
import io.sentry.rrweb.RRWebVideoEvent;
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
public final class CallsCall {

    @b("duration")
    @Nullable
    private final Integer duration;

    @b("initiator_id")
    private final int initiatorId;

    @b("participants")
    @Nullable
    private final CallsParticipants participants;

    @b("receiver_id")
    private final int receiverId;

    @b(SentryThread.JsonKeys.STATE)
    @NotNull
    private final CallsEndState state;

    @b("time")
    private final int time;

    @b(RRWebVideoEvent.EVENT_TAG)
    @Nullable
    private final Boolean video;

    public CallsCall(int i, int i10, @NotNull CallsEndState state, int i11, @Nullable Integer num, @Nullable Boolean bool, @Nullable CallsParticipants callsParticipants) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.initiatorId = i;
        this.receiverId = i10;
        this.state = state;
        this.time = i11;
        this.duration = num;
        this.video = bool;
        this.participants = callsParticipants;
    }

    public static /* synthetic */ CallsCall copy$default(CallsCall callsCall, int i, int i10, CallsEndState callsEndState, int i11, Integer num, Boolean bool, CallsParticipants callsParticipants, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i = callsCall.initiatorId;
        }
        if ((i12 & 2) != 0) {
            i10 = callsCall.receiverId;
        }
        if ((i12 & 4) != 0) {
            callsEndState = callsCall.state;
        }
        if ((i12 & 8) != 0) {
            i11 = callsCall.time;
        }
        if ((i12 & 16) != 0) {
            num = callsCall.duration;
        }
        if ((i12 & 32) != 0) {
            bool = callsCall.video;
        }
        if ((i12 & 64) != 0) {
            callsParticipants = callsCall.participants;
        }
        Boolean bool2 = bool;
        CallsParticipants callsParticipants2 = callsParticipants;
        Integer num2 = num;
        CallsEndState callsEndState2 = callsEndState;
        return callsCall.copy(i, i10, callsEndState2, i11, num2, bool2, callsParticipants2);
    }

    public final int component1() {
        return this.initiatorId;
    }

    public final int component2() {
        return this.receiverId;
    }

    @NotNull
    public final CallsEndState component3() {
        return this.state;
    }

    public final int component4() {
        return this.time;
    }

    @Nullable
    public final Integer component5() {
        return this.duration;
    }

    @Nullable
    public final Boolean component6() {
        return this.video;
    }

    @Nullable
    public final CallsParticipants component7() {
        return this.participants;
    }

    @NotNull
    public final CallsCall copy(int i, int i10, @NotNull CallsEndState state, int i11, @Nullable Integer num, @Nullable Boolean bool, @Nullable CallsParticipants callsParticipants) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new CallsCall(i, i10, state, i11, num, bool, callsParticipants);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallsCall)) {
            return false;
        }
        CallsCall callsCall = (CallsCall) obj;
        return this.initiatorId == callsCall.initiatorId && this.receiverId == callsCall.receiverId && this.state == callsCall.state && this.time == callsCall.time && Intrinsics.a(this.duration, callsCall.duration) && Intrinsics.a(this.video, callsCall.video) && Intrinsics.a(this.participants, callsCall.participants);
    }

    @Nullable
    public final Integer getDuration() {
        return this.duration;
    }

    public final int getInitiatorId() {
        return this.initiatorId;
    }

    @Nullable
    public final CallsParticipants getParticipants() {
        return this.participants;
    }

    public final int getReceiverId() {
        return this.receiverId;
    }

    @NotNull
    public final CallsEndState getState() {
        return this.state;
    }

    public final int getTime() {
        return this.time;
    }

    @Nullable
    public final Boolean getVideo() {
        return this.video;
    }

    public int hashCode() {
        int iG = u.g(this.time, (this.state.hashCode() + u.g(this.receiverId, Integer.hashCode(this.initiatorId) * 31, 31)) * 31, 31);
        Integer num = this.duration;
        int iHashCode = (iG + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.video;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        CallsParticipants callsParticipants = this.participants;
        return iHashCode2 + (callsParticipants != null ? callsParticipants.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.initiatorId;
        int i10 = this.receiverId;
        CallsEndState callsEndState = this.state;
        int i11 = this.time;
        Integer num = this.duration;
        Boolean bool = this.video;
        CallsParticipants callsParticipants = this.participants;
        StringBuilder sbI = z.i("CallsCall(initiatorId=", i, ", receiverId=", i10, ", state=");
        sbI.append(callsEndState);
        sbI.append(", time=");
        sbI.append(i11);
        sbI.append(", duration=");
        sbI.append(num);
        sbI.append(", video=");
        sbI.append(bool);
        sbI.append(", participants=");
        sbI.append(callsParticipants);
        sbI.append(")");
        return sbI.toString();
    }

    public /* synthetic */ CallsCall(int i, int i10, CallsEndState callsEndState, int i11, Integer num, Boolean bool, CallsParticipants callsParticipants, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i10, callsEndState, i11, (i12 & 16) != 0 ? null : num, (i12 & 32) != 0 ? null : bool, (i12 & 64) != 0 ? null : callsParticipants);
    }
}
