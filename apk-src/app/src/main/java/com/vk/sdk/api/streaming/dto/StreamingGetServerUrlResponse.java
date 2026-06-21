package com.vk.sdk.api.streaming.dto;

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
public final class StreamingGetServerUrlResponse {

    @b("endpoint")
    @Nullable
    private final String endpoint;

    @b("key")
    @Nullable
    private final String key;

    public StreamingGetServerUrlResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ StreamingGetServerUrlResponse copy$default(StreamingGetServerUrlResponse streamingGetServerUrlResponse, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = streamingGetServerUrlResponse.endpoint;
        }
        if ((i & 2) != 0) {
            str2 = streamingGetServerUrlResponse.key;
        }
        return streamingGetServerUrlResponse.copy(str, str2);
    }

    @Nullable
    public final String component1() {
        return this.endpoint;
    }

    @Nullable
    public final String component2() {
        return this.key;
    }

    @NotNull
    public final StreamingGetServerUrlResponse copy(@Nullable String str, @Nullable String str2) {
        return new StreamingGetServerUrlResponse(str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreamingGetServerUrlResponse)) {
            return false;
        }
        StreamingGetServerUrlResponse streamingGetServerUrlResponse = (StreamingGetServerUrlResponse) obj;
        return Intrinsics.a(this.endpoint, streamingGetServerUrlResponse.endpoint) && Intrinsics.a(this.key, streamingGetServerUrlResponse.key);
    }

    @Nullable
    public final String getEndpoint() {
        return this.endpoint;
    }

    @Nullable
    public final String getKey() {
        return this.key;
    }

    public int hashCode() {
        String str = this.endpoint;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.key;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return z.f("StreamingGetServerUrlResponse(endpoint=", this.endpoint, ", key=", this.key, ")");
    }

    public StreamingGetServerUrlResponse(@Nullable String str, @Nullable String str2) {
        this.endpoint = str;
        this.key = str2;
    }

    public /* synthetic */ StreamingGetServerUrlResponse(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
