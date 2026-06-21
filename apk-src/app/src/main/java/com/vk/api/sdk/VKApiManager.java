package com.vk.api.sdk;

import com.vk.api.sdk.chain.ApiMethodPriorityChainCall;
import com.vk.api.sdk.chain.ChainArgs;
import com.vk.api.sdk.chain.ChainCall;
import com.vk.api.sdk.chain.HttpPostChainCall;
import com.vk.api.sdk.chain.InternalErrorRetryChainCall;
import com.vk.api.sdk.chain.InvalidCredentialsObserverChainCall;
import com.vk.api.sdk.chain.MethodChainCall;
import com.vk.api.sdk.chain.RateLimitReachedChainCall;
import com.vk.api.sdk.chain.TooManyRequestRetryChainCall;
import com.vk.api.sdk.chain.ValidationHandlerChainCall;
import com.vk.api.sdk.internal.ApiCommand;
import com.vk.api.sdk.okhttp.OkHttpExecutor;
import com.vk.api.sdk.okhttp.OkHttpMethodCall;
import com.vk.api.sdk.utils.RateLimitTokenBackoff;
import com.vk.api.sdk.utils.tmr.TooManyRequestBackoffGlobal;
import ij.g;
import ij.h;
import kotlin.Metadata;
import kotlin.Unit;
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
public class VKApiManager {
    private final VKApiConfig config;
    private final g executor$delegate;
    private volatile VKApiIllegalCredentialsListener illegalCredentialsListener;
    private final g rateLimitBackoff$delegate;
    private final VKApiValidationHandler validationHandler;

    public VKApiManager(VKApiConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.config = config;
        this.rateLimitBackoff$delegate = h.b(new VKApiManager$rateLimitBackoff$2(this));
        this.validationHandler = config.getValidationHandler();
        this.executor$delegate = h.b(new VKApiManager$executor$2(this));
    }

    public static /* synthetic */ ChainCall createMethodChainCall$default(VKApiManager vKApiManager, VKMethodCall vKMethodCall, VKApiResponseParser vKApiResponseParser, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createMethodChainCall");
        }
        if ((i & 2) != 0) {
            vKApiResponseParser = null;
        }
        return vKApiManager.createMethodChainCall(vKMethodCall, vKApiResponseParser);
    }

    public static /* synthetic */ Object execute$default(VKApiManager vKApiManager, VKMethodCall vKMethodCall, VKApiResponseParser vKApiResponseParser, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: execute");
        }
        if ((i & 2) != 0) {
            vKApiResponseParser = null;
        }
        return vKApiManager.execute(vKMethodCall, vKApiResponseParser);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: execute$lambda-0, reason: not valid java name */
    public static final Unit m21execute$lambda0(String str) {
        return Unit.f27471a;
    }

    private final RateLimitTokenBackoff getRateLimitBackoff() {
        return (RateLimitTokenBackoff) this.rateLimitBackoff$delegate.getValue();
    }

    public <T> ChainCall<T> createMethodChainCall(VKMethodCall call, VKApiResponseParser<T> vKApiResponseParser) {
        Intrinsics.checkNotNullParameter(call, "call");
        return new MethodChainCall(this, getExecutor(), new OkHttpMethodCall.Builder().from(call), (String) this.config.getDeviceId().getValue(), this.config.getLang(), vKApiResponseParser);
    }

    public <T> HttpPostChainCall<T> createPostMethodChainCall(VKHttpPostCall call, VKApiProgressListener vKApiProgressListener, VKApiResponseParser<T> vKApiResponseParser) {
        Intrinsics.checkNotNullParameter(call, "call");
        return new HttpPostChainCall<>(this, getExecutor(), call, vKApiProgressListener, vKApiResponseParser);
    }

    public <T> TooManyRequestRetryChainCall<T> createTooManyRequestRetryChainCall(VKMethodCall call, ChainCall<? extends T> chainCall) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(chainCall, "chainCall");
        return new TooManyRequestRetryChainCall<>(this, call.getRetryCount(), TooManyRequestBackoffGlobal.INSTANCE, chainCall);
    }

    public <T> ValidationHandlerChainCall<T> createValidationHandlerChainCall(int i, ChainCall<? extends T> chainCall) {
        Intrinsics.checkNotNullParameter(chainCall, "chainCall");
        return new ValidationHandlerChainCall<>(this, i, chainCall);
    }

    public final <T> T execute(VKHttpPostCall call) {
        Intrinsics.checkNotNullParameter(call, "call");
        return (T) execute$default(this, call, null, null, 6, null);
    }

    public <T> T executeWithExceptionAdjust(ChainCall<? extends T> cc2) {
        Intrinsics.checkNotNullParameter(cc2, "cc");
        T tCall = cc2.call(new ChainArgs());
        Intrinsics.b(tCall);
        return tCall;
    }

    public final VKApiConfig getConfig() {
        return this.config;
    }

    public OkHttpExecutor getExecutor() {
        return (OkHttpExecutor) this.executor$delegate.getValue();
    }

    public final VKApiIllegalCredentialsListener getIllegalCredentialsListener() {
        return this.illegalCredentialsListener;
    }

    public final VKApiValidationHandler getValidationHandler$core_release() {
        return this.validationHandler;
    }

    public final void ignoreAccessToken(String str) {
        getExecutor().ignoreAccessToken(str);
    }

    public final void setCredentials(String accessToken, String str) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        getExecutor().setCredentials(accessToken, str);
    }

    public final void setIllegalCredentialsListener(VKApiIllegalCredentialsListener vKApiIllegalCredentialsListener) {
        this.illegalCredentialsListener = vKApiIllegalCredentialsListener;
    }

    public <T> ChainCall<T> wrapCall(VKMethodCall call, ChainCall<? extends T> chainCall) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(chainCall, "chainCall");
        if (!call.getSkipValidation()) {
            chainCall = createValidationHandlerChainCall(call.getRetryCount(), chainCall);
        }
        RateLimitReachedChainCall rateLimitReachedChainCall = new RateLimitReachedChainCall(this, call.getMethod(), getRateLimitBackoff(), createTooManyRequestRetryChainCall(call, new InvalidCredentialsObserverChainCall(this, new ApiMethodPriorityChainCall(this, chainCall, call, this.config.getApiMethodPriorityBackoff()), 1)));
        return call.getRetryCount() > 0 ? new InternalErrorRetryChainCall(this, call.getRetryCount(), rateLimitReachedChainCall) : rateLimitReachedChainCall;
    }

    public static /* synthetic */ Object execute$default(VKApiManager vKApiManager, VKHttpPostCall vKHttpPostCall, VKApiProgressListener vKApiProgressListener, VKApiResponseParser vKApiResponseParser, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: execute");
        }
        if ((i & 2) != 0) {
            vKApiProgressListener = null;
        }
        if ((i & 4) != 0) {
            vKApiResponseParser = null;
        }
        return vKApiManager.execute(vKHttpPostCall, vKApiProgressListener, vKApiResponseParser);
    }

    public final <T> T execute(VKHttpPostCall call, VKApiProgressListener vKApiProgressListener) {
        Intrinsics.checkNotNullParameter(call, "call");
        return (T) execute$default(this, call, vKApiProgressListener, null, 4, null);
    }

    public final void setCredentials(g credentialsProvider) {
        Intrinsics.checkNotNullParameter(credentialsProvider, "credentialsProvider");
        getExecutor().setCredentials$core_release(credentialsProvider);
    }

    public final void execute(VKMethodCall call) {
        Intrinsics.checkNotNullParameter(call, "call");
        execute(call, new a());
    }

    public final <T> T execute(VKMethodCall call, VKApiResponseParser<T> vKApiResponseParser) {
        Intrinsics.checkNotNullParameter(call, "call");
        return (T) executeWithExceptionAdjust(wrapCall(call, createMethodChainCall(call, vKApiResponseParser)));
    }

    public <T> T execute(ApiCommand<T> cmd) {
        Intrinsics.checkNotNullParameter(cmd, "cmd");
        return cmd.execute(this);
    }

    public final <T> T execute(VKHttpPostCall call, VKApiProgressListener vKApiProgressListener, VKApiResponseParser<T> vKApiResponseParser) {
        Intrinsics.checkNotNullParameter(call, "call");
        return (T) executeWithExceptionAdjust(wrapCall(call, createPostMethodChainCall(call, vKApiProgressListener, vKApiResponseParser)));
    }

    public <T> ChainCall<T> wrapCall(VKHttpPostCall call, ChainCall<? extends T> chainCall) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(chainCall, "chainCall");
        ValidationHandlerChainCall<T> validationHandlerChainCallCreateValidationHandlerChainCall = createValidationHandlerChainCall(call.getRetryCount(), chainCall);
        return call.getRetryCount() > 0 ? new InternalErrorRetryChainCall(this, call.getRetryCount(), validationHandlerChainCallCreateValidationHandlerChainCall) : validationHandlerChainCallCreateValidationHandlerChainCall;
    }
}
