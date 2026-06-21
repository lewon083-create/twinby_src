package com.vk.api.sdk.chain;

import com.vk.api.sdk.VKApiManager;
import com.vk.api.sdk.exceptions.VKApiException;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.api.sdk.utils.ExponentialBackoff;
import com.vk.api.sdk.utils.tmr.TooManyRequestLimitBackoff;
import kotlin.Metadata;
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
public final class TooManyRequestRetryChainCall<T> extends RetryChainCall<T> {
    private static final int MAX_CALLS_PER_SECOND = 3;
    private static final long MAX_LIMIT = 1000;
    private static final long TIMEOUT = 1000;
    private final TooManyRequestLimitBackoff backoff;
    private final ChainCall<T> chain;
    public static final Companion Companion = new Companion(null);
    private static final ExponentialBackoff errorBackoff = new ExponentialBackoff(1000, 8000, 1.2f, 0.0f, 0.0f, 24, null);

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TooManyRequestRetryChainCall(VKApiManager manager, int i, TooManyRequestLimitBackoff backoff, ChainCall<? extends T> chain) {
        super(manager, i);
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(backoff, "backoff");
        Intrinsics.checkNotNullParameter(chain, "chain");
        this.backoff = backoff;
        this.chain = chain;
    }

    @Override // com.vk.api.sdk.chain.ChainCall
    public T call(ChainArgs args) throws InterruptedException, VKApiException {
        Intrinsics.checkNotNullParameter(args, "args");
        int retryLimit = getRetryLimit();
        if (retryLimit >= 0) {
            int i = 0;
            while (true) {
                int i10 = i + 1;
                ExponentialBackoff exponentialBackoff = errorBackoff;
                exponentialBackoff.waitIfNeeded();
                this.backoff.waitBeforeCall(3, 1000L);
                try {
                    T tCall = this.chain.call(args);
                    exponentialBackoff.reset();
                    return tCall;
                } catch (VKApiExecutionException e3) {
                    if (!e3.isTooManyRequestsError()) {
                        throw e3;
                    }
                    logDebug("Too many requests", e3);
                    errorBackoff.onError();
                    if (i == retryLimit) {
                        break;
                    }
                    i = i10;
                }
            }
        }
        throw new VKApiException("Can't handle too many requests due to retry limit! (retryLimit=" + getRetryLimit() + ')');
    }

    public final TooManyRequestLimitBackoff getBackoff() {
        return this.backoff;
    }

    public final ChainCall<T> getChain() {
        return this.chain;
    }
}
