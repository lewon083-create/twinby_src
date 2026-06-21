package com.vk.sdk.api.calls.dto;

import java.util.List;
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
public final class CallsParticipants {

    @b("count")
    @Nullable
    private final Integer count;

    @b("list")
    @Nullable
    private final List<Long> list;

    public CallsParticipants() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CallsParticipants copy$default(CallsParticipants callsParticipants, List list, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            list = callsParticipants.list;
        }
        if ((i & 2) != 0) {
            num = callsParticipants.count;
        }
        return callsParticipants.copy(list, num);
    }

    @Nullable
    public final List<Long> component1() {
        return this.list;
    }

    @Nullable
    public final Integer component2() {
        return this.count;
    }

    @NotNull
    public final CallsParticipants copy(@Nullable List<Long> list, @Nullable Integer num) {
        return new CallsParticipants(list, num);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallsParticipants)) {
            return false;
        }
        CallsParticipants callsParticipants = (CallsParticipants) obj;
        return Intrinsics.a(this.list, callsParticipants.list) && Intrinsics.a(this.count, callsParticipants.count);
    }

    @Nullable
    public final Integer getCount() {
        return this.count;
    }

    @Nullable
    public final List<Long> getList() {
        return this.list;
    }

    public int hashCode() {
        List<Long> list = this.list;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.count;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CallsParticipants(list=" + this.list + ", count=" + this.count + ")";
    }

    public CallsParticipants(@Nullable List<Long> list, @Nullable Integer num) {
        this.list = list;
        this.count = num;
    }

    public /* synthetic */ CallsParticipants(List list, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : num);
    }
}
