package com.vk.api.sdk.chain;

import com.vk.api.sdk.VKApiManager;
import com.vk.api.sdk.exceptions.RateLimitReachedException;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.api.sdk.utils.RateLimitTokenBackoff;
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
public final class RateLimitReachedChainCall<T> extends ChainCall<T> {
    public static final Companion Companion = new Companion(null);
    private static final String DETAIL_MESSAGE = "Rate limit reached.";
    private final RateLimitTokenBackoff backoff;
    private final ChainCall<T> chainCall;
    private final String method;

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
    public RateLimitReachedChainCall(VKApiManager manager, String method, RateLimitTokenBackoff backoff, ChainCall<? extends T> chainCall) {
        super(manager);
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(backoff, "backoff");
        Intrinsics.checkNotNullParameter(chainCall, "chainCall");
        this.method = method;
        this.backoff = backoff;
        this.chainCall = chainCall;
    }

    @Override // com.vk.api.sdk.chain.ChainCall
    public T call(ChainArgs args) throws VKApiExecutionException {
        Intrinsics.checkNotNullParameter(args, "args");
        if (this.backoff.shouldWait(this.method)) {
            throw new RateLimitReachedException(this.method, DETAIL_MESSAGE);
        }
        this.backoff.reset(this.method);
        try {
            return this.chainCall.call(args);
        } catch (VKApiExecutionException e3) {
            if (e3.isRateLimitReachedError()) {
                this.backoff.backoff(this.method);
                logDebug(DETAIL_MESSAGE, e3);
            }
            throw e3;
        }
    }
}
