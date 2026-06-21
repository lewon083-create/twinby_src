package com.vk.api.sdk.okhttp;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.j0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

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
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class RequestTag {
    private final Boolean awaitNetwork;
    private final String reason;
    private final Integer retryCount;
    private final Long uid;

    public RequestTag() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ RequestTag copy$default(RequestTag requestTag, Long l10, Boolean bool, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            l10 = requestTag.uid;
        }
        if ((i & 2) != 0) {
            bool = requestTag.awaitNetwork;
        }
        if ((i & 4) != 0) {
            str = requestTag.reason;
        }
        if ((i & 8) != 0) {
            num = requestTag.retryCount;
        }
        return requestTag.copy(l10, bool, str, num);
    }

    public final Long component1() {
        return this.uid;
    }

    public final Boolean component2() {
        return this.awaitNetwork;
    }

    public final String component3() {
        return this.reason;
    }

    public final Integer component4() {
        return this.retryCount;
    }

    public final RequestTag copy(Long l10, Boolean bool, String str, Integer num) {
        return new RequestTag(l10, bool, str, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestTag)) {
            return false;
        }
        RequestTag requestTag = (RequestTag) obj;
        return Intrinsics.a(this.uid, requestTag.uid) && Intrinsics.a(this.awaitNetwork, requestTag.awaitNetwork) && Intrinsics.a(this.reason, requestTag.reason) && Intrinsics.a(this.retryCount, requestTag.retryCount);
    }

    public final Boolean getAwaitNetwork() {
        return this.awaitNetwork;
    }

    public final String getReason() {
        return this.reason;
    }

    public final Integer getRetryCount() {
        return this.retryCount;
    }

    public final Long getUid() {
        return this.uid;
    }

    public int hashCode() {
        Long l10 = this.uid;
        int iHashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
        Boolean bool = this.awaitNetwork;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.reason;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.retryCount;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final Map<String, Object> toMap() {
        return j0.h(new Pair("UID", this.uid), new Pair("AWAIT_NETWORK", this.awaitNetwork), new Pair("REASON", this.reason), new Pair("RETRY_COUNT", this.retryCount));
    }

    public String toString() {
        return "RequestTag(uid=" + this.uid + ", awaitNetwork=" + this.awaitNetwork + ", reason=" + ((Object) this.reason) + ", retryCount=" + this.retryCount + ')';
    }

    public RequestTag(Long l10) {
        this(l10, null, null, null, 14, null);
    }

    public RequestTag(Long l10, Boolean bool) {
        this(l10, bool, null, null, 12, null);
    }

    public RequestTag(Long l10, Boolean bool, String str) {
        this(l10, bool, str, null, 8, null);
    }

    public RequestTag(Long l10, Boolean bool, String str, Integer num) {
        this.uid = l10;
        this.awaitNetwork = bool;
        this.reason = str;
        this.retryCount = num;
    }

    public /* synthetic */ RequestTag(Long l10, Boolean bool, String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l10, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : num);
    }
}
