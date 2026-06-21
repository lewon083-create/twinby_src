package com.vk.api.sdk.okhttp;

import android.content.Context;
import com.vk.api.sdk.VKApiConfig;
import com.vk.api.sdk.VKOkHttpProvider;
import com.vk.api.sdk.internal.Validation;
import com.vk.api.sdk.utils.log.Logger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
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
public final class OkHttpExecutorConfig {
    private final VKApiConfig apiConfig;

    public OkHttpExecutorConfig(VKApiConfig apiConfig) {
        Intrinsics.checkNotNullParameter(apiConfig, "apiConfig");
        this.apiConfig = apiConfig;
        Validation validation = Validation.INSTANCE;
        validation.assertContextValid(getContext());
        validation.assertAccessTokenValid(getAccessToken());
    }

    public final String getAccessToken() {
        return (String) this.apiConfig.getAccessToken$core_release().getValue();
    }

    public final int getAppId() {
        return this.apiConfig.getAppId();
    }

    public final Context getContext() {
        return this.apiConfig.getContext();
    }

    public final String getCustomEndpoint() {
        return (String) this.apiConfig.getCustomApiEndpoint().getValue();
    }

    public final Function0<String> getHostProvider() {
        return this.apiConfig.getHttpApiHostProvider();
    }

    public final boolean getLogFilterCredentials() {
        return this.apiConfig.getLogFilterCredentials();
    }

    public final Logger getLogger() {
        return this.apiConfig.getLogger();
    }

    public final LoggingPrefixer getLoggingPrefixer() {
        return this.apiConfig.getLoggingPrefixer();
    }

    public final VKOkHttpProvider getOkHttpProvider() {
        return this.apiConfig.getOkHttpProvider();
    }

    public final String getSecret() {
        return (String) this.apiConfig.getSecret$core_release().getValue();
    }

    public String toString() {
        return "OkHttpExecutorConfig(host='" + ((String) getHostProvider().invoke()) + "', accessToken='" + getAccessToken() + "', secret='" + ((Object) getSecret()) + "', logFilterCredentials=" + getLogFilterCredentials() + ')';
    }
}
