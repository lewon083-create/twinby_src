package com.vk.api.sdk;

import com.vk.api.sdk.auth.VKAccessToken;
import ij.g;
import ij.h;
import ij.i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class VKApiCredentials {
    public static final Companion Companion = new Companion(null);
    private final String accessToken;
    private final String secret;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g lazyFrom(String accessToken, String str) {
            Intrinsics.checkNotNullParameter(accessToken, "accessToken");
            return h.a(i.f21338c, new VKApiCredentials$Companion$lazyFrom$1(accessToken, str));
        }

        private Companion() {
        }

        public final g lazyFrom(Function0<VKAccessToken> tokenProvider) {
            Intrinsics.checkNotNullParameter(tokenProvider, "tokenProvider");
            return h.b(new VKApiCredentials$Companion$lazyFrom$2(tokenProvider));
        }
    }

    public VKApiCredentials(String accessToken, String str) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        this.accessToken = accessToken;
        this.secret = str;
    }

    public static /* synthetic */ VKApiCredentials copy$default(VKApiCredentials vKApiCredentials, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vKApiCredentials.accessToken;
        }
        if ((i & 2) != 0) {
            str2 = vKApiCredentials.secret;
        }
        return vKApiCredentials.copy(str, str2);
    }

    public final String component1() {
        return this.accessToken;
    }

    public final String component2() {
        return this.secret;
    }

    public final VKApiCredentials copy(String accessToken, String str) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        return new VKApiCredentials(accessToken, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VKApiCredentials)) {
            return false;
        }
        VKApiCredentials vKApiCredentials = (VKApiCredentials) obj;
        return Intrinsics.a(this.accessToken, vKApiCredentials.accessToken) && Intrinsics.a(this.secret, vKApiCredentials.secret);
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final String getSecret() {
        return this.secret;
    }

    public int hashCode() {
        int iHashCode = this.accessToken.hashCode() * 31;
        String str = this.secret;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "VKApiCredentials(accessToken=" + this.accessToken + ", secret=" + ((Object) this.secret) + ')';
    }
}
