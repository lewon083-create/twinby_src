package com.vk.api.sdk.chain;

import com.vk.api.sdk.VKApiManager;
import com.vk.api.sdk.VKApiProgressListener;
import com.vk.api.sdk.VKApiResponseParser;
import com.vk.api.sdk.VKHttpPostCall;
import com.vk.api.sdk.exceptions.VKApiException;
import com.vk.api.sdk.okhttp.OkHttpExecutor;
import com.vk.api.sdk.okhttp.OkHttpPostCall;
import com.vk.api.sdk.utils.ApiExtKt;
import kotlin.Metadata;
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
public class HttpPostChainCall<T> extends ChainCall<T> {
    private final VKHttpPostCall call;
    private final OkHttpExecutor okHttpExecutor;
    private final VKApiResponseParser<T> parser;
    private final VKApiProgressListener progressListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpPostChainCall(VKApiManager manager, OkHttpExecutor okHttpExecutor, VKHttpPostCall call, VKApiProgressListener vKApiProgressListener, VKApiResponseParser<T> vKApiResponseParser) {
        super(manager);
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(okHttpExecutor, "okHttpExecutor");
        Intrinsics.checkNotNullParameter(call, "call");
        this.okHttpExecutor = okHttpExecutor;
        this.call = call;
        this.progressListener = vKApiProgressListener;
        this.parser = vKApiResponseParser;
    }

    @Override // com.vk.api.sdk.chain.ChainCall
    public T call(ChainArgs args) {
        Intrinsics.checkNotNullParameter(args, "args");
        return handleResponse(this.okHttpExecutor.execute(new OkHttpPostCall(this.call), this.progressListener));
    }

    public final VKHttpPostCall getCall() {
        return this.call;
    }

    public final OkHttpExecutor getOkHttpExecutor() {
        return this.okHttpExecutor;
    }

    public final VKApiResponseParser<T> getParser() {
        return this.parser;
    }

    public final VKApiProgressListener getProgressListener() {
        return this.progressListener;
    }

    public final T handleResponse(String str) throws VKApiException {
        if (str == null) {
            throw new VKApiException("Response returned null instead of valid string response");
        }
        if (ApiExtKt.hasSimpleError(str)) {
            throw ApiExtKt.toSimpleError$default(str, "post", null, 2, null);
        }
        VKApiResponseParser<T> vKApiResponseParser = this.parser;
        if (vKApiResponseParser == null) {
            return null;
        }
        return vKApiResponseParser.parse(str);
    }
}
