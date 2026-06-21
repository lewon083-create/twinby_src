package com.vk.api.sdk;

import com.vk.api.sdk.auth.VKAccessToken;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.r;

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
public final class VKApiCredentials$Companion$lazyFrom$2 extends r implements Function0<VKApiCredentials> {
    final /* synthetic */ Function0<VKAccessToken> $tokenProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VKApiCredentials$Companion$lazyFrom$2(Function0<VKAccessToken> function0) {
        super(0);
        this.$tokenProvider = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final VKApiCredentials invoke() {
        String accessToken;
        VKAccessToken vKAccessToken = (VKAccessToken) this.$tokenProvider.invoke();
        String str = "";
        if (vKAccessToken != null && (accessToken = vKAccessToken.getAccessToken()) != null) {
            str = accessToken;
        }
        return new VKApiCredentials(str, vKAccessToken == null ? null : vKAccessToken.getSecret());
    }
}
