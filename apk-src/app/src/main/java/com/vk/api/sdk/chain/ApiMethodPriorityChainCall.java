package com.vk.api.sdk.chain;

import com.vk.api.sdk.VKApiManager;
import com.vk.api.sdk.VKMethodCall;
import com.vk.api.sdk.utils.ApiMethodPriorityBackoff;
import ij.g;
import ij.h;
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
public final class ApiMethodPriorityChainCall<T> extends ChainCall<T> {
    private final VKMethodCall call;
    private final ChainCall<T> chain;
    private final g chainId$delegate;
    private final ApiMethodPriorityBackoff priorityBackoff;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ApiMethodPriorityChainCall(VKApiManager manager, ChainCall<? extends T> chain, VKMethodCall call, ApiMethodPriorityBackoff priorityBackoff) {
        super(manager);
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(priorityBackoff, "priorityBackoff");
        this.chain = chain;
        this.call = call;
        this.priorityBackoff = priorityBackoff;
        this.chainId$delegate = h.b(new ApiMethodPriorityChainCall$chainId$2(this));
    }

    private final int getChainId() {
        return ((Number) this.chainId$delegate.getValue()).intValue();
    }

    @Override // com.vk.api.sdk.chain.ChainCall
    public T call(ChainArgs args) throws InterruptedException {
        Intrinsics.checkNotNullParameter(args, "args");
        if (!this.priorityBackoff.isActive()) {
            return this.chain.call(args);
        }
        String method = this.call.getMethod();
        while (this.priorityBackoff.shouldWait(method)) {
            if (Thread.interrupted()) {
                throw new InterruptedException("request interrupted");
            }
            this.priorityBackoff.processMethod(getChainId(), method);
        }
        return this.chain.call(args);
    }
}
