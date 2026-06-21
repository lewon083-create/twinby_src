package com.vk.sdk.api.auth.dto;

import io.sentry.Session;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class AuthRestoreResponse {

    @b(Session.JsonKeys.SID)
    @Nullable
    private final String sid;

    @b("success")
    @Nullable
    private final Success success;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public enum Success {
        OK(1);

        private final int value;

        Success(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    public AuthRestoreResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AuthRestoreResponse copy$default(AuthRestoreResponse authRestoreResponse, Success success, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            success = authRestoreResponse.success;
        }
        if ((i & 2) != 0) {
            str = authRestoreResponse.sid;
        }
        return authRestoreResponse.copy(success, str);
    }

    @Nullable
    public final Success component1() {
        return this.success;
    }

    @Nullable
    public final String component2() {
        return this.sid;
    }

    @NotNull
    public final AuthRestoreResponse copy(@Nullable Success success, @Nullable String str) {
        return new AuthRestoreResponse(success, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthRestoreResponse)) {
            return false;
        }
        AuthRestoreResponse authRestoreResponse = (AuthRestoreResponse) obj;
        return this.success == authRestoreResponse.success && Intrinsics.a(this.sid, authRestoreResponse.sid);
    }

    @Nullable
    public final String getSid() {
        return this.sid;
    }

    @Nullable
    public final Success getSuccess() {
        return this.success;
    }

    public int hashCode() {
        Success success = this.success;
        int iHashCode = (success == null ? 0 : success.hashCode()) * 31;
        String str = this.sid;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AuthRestoreResponse(success=" + this.success + ", sid=" + this.sid + ")";
    }

    public AuthRestoreResponse(@Nullable Success success, @Nullable String str) {
        this.success = success;
        this.sid = str;
    }

    public /* synthetic */ AuthRestoreResponse(Success success, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : success, (i & 2) != 0 ? null : str);
    }
}
