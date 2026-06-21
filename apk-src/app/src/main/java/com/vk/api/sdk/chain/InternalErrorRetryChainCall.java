package com.vk.api.sdk.chain;

import com.vk.api.sdk.VKApiManager;
import com.vk.api.sdk.exceptions.VKApiException;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.api.sdk.exceptions.VKInternalServerErrorException;
import com.vk.api.sdk.utils.ExponentialBackoff;
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
public final class InternalErrorRetryChainCall<T> extends RetryChainCall<T> {
    private final ExponentialBackoff backoff;
    private final ChainCall<T> chain;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InternalErrorRetryChainCall(VKApiManager manager, int i, ChainCall<? extends T> chain) {
        super(manager, i);
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(chain, "chain");
        this.chain = chain;
        this.backoff = new ExponentialBackoff(1000L, 60000L, 1.5f, 0.0f, 0.0f, 24, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.vk.api.sdk.exceptions.VKInternalServerErrorException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.vk.api.sdk.exceptions.VKApiIllegalResponseException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.vk.api.sdk.exceptions.VKApiExecutionException, java.lang.Throwable] */
    @Override // com.vk.api.sdk.chain.ChainCall
    public T call(ChainArgs args) throws InterruptedException, VKApiException {
        Intrinsics.checkNotNullParameter(args, "args");
        ?? e3 = 0;
        while (true) {
            if (getRetryLimit() >= 0 && this.backoff.getErrorsCount() > getRetryLimit()) {
                if (e3 == 0) {
                    throw new VKApiException("api-call failed due to retry limits, but no exception has tracked");
                }
                throw e3;
            }
            if (this.backoff.shouldWait()) {
                Thread.sleep(this.backoff.getDelayMs());
            }
            try {
                return this.chain.call(args);
            } catch (VKApiExecutionException e7) {
                e3 = e7;
                if (!e3.isInternalServerError()) {
                    throw e3;
                }
                logWarning("", e3);
                this.backoff.onError();
            } catch (VKApiIllegalResponseException e10) {
                e3 = e10;
                logWarning("", e3);
                this.backoff.onError();
            } catch (VKInternalServerErrorException e11) {
                e3 = e11;
                logWarning("", e3);
                this.backoff.onError();
            }
        }
    }

    public final ChainCall<T> getChain() {
        return this.chain;
    }
}
