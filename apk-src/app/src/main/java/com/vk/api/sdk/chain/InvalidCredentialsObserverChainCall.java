package com.vk.api.sdk.chain;

import com.vk.api.sdk.VKApiIllegalCredentialsListener;
import com.vk.api.sdk.VKApiManager;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
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
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class InvalidCredentialsObserverChainCall<T> extends ChainCall<T> {
    private final ChainCall<T> chain;
    private final int checkAuthCount;

    public /* synthetic */ InvalidCredentialsObserverChainCall(VKApiManager vKApiManager, ChainCall chainCall, int i, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(vKApiManager, chainCall, (i10 & 4) != 0 ? 0 : i);
    }

    private final T callWithAuthCheck(ChainArgs chainArgs, int i) throws VKApiExecutionException {
        try {
            return this.chain.call(chainArgs);
        } catch (VKApiExecutionException e3) {
            if (e3.isInvalidCredentialsError()) {
                int i10 = this.checkAuthCount;
                if (i10 > 0 && i < i10) {
                    String accessToken = e3.getAccessToken();
                    String accessToken2 = getManager().getExecutor().getAccessToken();
                    String ignoredAccessToken = getManager().getExecutor().getIgnoredAccessToken();
                    boolean zA = Intrinsics.a(accessToken, accessToken2);
                    boolean z5 = ignoredAccessToken != null && Intrinsics.a(accessToken, ignoredAccessToken);
                    if (accessToken != null && (!zA || z5)) {
                        return callWithAuthCheck(chainArgs, i + 1);
                    }
                }
                if (e3.getCode() == 3610) {
                    VKApiIllegalCredentialsListener illegalCredentialsListener = getManager().getIllegalCredentialsListener();
                    if (illegalCredentialsListener != null) {
                        illegalCredentialsListener.onUserDeactivated(e3.getApiMethod());
                    }
                } else {
                    VKApiIllegalCredentialsListener illegalCredentialsListener2 = getManager().getIllegalCredentialsListener();
                    if (illegalCredentialsListener2 != null) {
                        illegalCredentialsListener2.onInvalidCredentials(e3.getApiMethod(), e3.getUserBanInfo());
                    }
                }
            }
            throw e3;
        }
    }

    @Override // com.vk.api.sdk.chain.ChainCall
    public T call(ChainArgs args) {
        Intrinsics.checkNotNullParameter(args, "args");
        return callWithAuthCheck(args, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InvalidCredentialsObserverChainCall(VKApiManager manager, ChainCall<? extends T> chain, int i) {
        super(manager);
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(chain, "chain");
        this.chain = chain;
        this.checkAuthCount = i;
    }
}
