package com.vk.api.sdk.chain;

import com.vk.api.sdk.VKApiManager;
import com.vk.api.sdk.VKApiValidationHandler;
import com.vk.api.sdk.exceptions.VKApiException;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import wj.n;

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
public final class ValidationHandlerChainCall<T> extends RetryChainCall<T> {
    private final ChainCall<T> chain;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ValidationHandlerChainCall(VKApiManager manager, int i, ChainCall<? extends T> chain) {
        super(manager, i);
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(chain, "chain");
        this.chain = chain;
    }

    private final void handleCaptcha(VKApiExecutionException vKApiExecutionException, ChainArgs chainArgs) throws VKApiExecutionException {
        String str = (String) awaitValidation(vKApiExecutionException.getCaptchaImg(), getManager().getValidationHandler$core_release(), ValidationHandlerChainCall$handleCaptcha$captcha$1.INSTANCE);
        if (str == null) {
            throw vKApiExecutionException;
        }
        chainArgs.setCaptchaSid(vKApiExecutionException.getCaptchaSid());
        chainArgs.setCaptchaKey(str);
    }

    private final void handleException(VKApiExecutionException vKApiExecutionException, ChainArgs chainArgs) throws VKApiExecutionException {
        Unit unit;
        if (vKApiExecutionException.isCaptchaError()) {
            handleCaptcha(vKApiExecutionException, chainArgs);
            return;
        }
        if (vKApiExecutionException.isValidationRequired()) {
            handleValidation(vKApiExecutionException);
            return;
        }
        if (vKApiExecutionException.isUserConfirmRequired()) {
            handleUserConfirmation(vKApiExecutionException, chainArgs);
            return;
        }
        VKApiValidationHandler validationHandler$core_release = getManager().getValidationHandler$core_release();
        if (validationHandler$core_release == null) {
            unit = null;
        } else {
            validationHandler$core_release.tryToHandleException(vKApiExecutionException, getManager());
            unit = Unit.f27471a;
        }
        if (unit == null) {
            throw vKApiExecutionException;
        }
    }

    private final void handleUserConfirmation(VKApiExecutionException vKApiExecutionException, ChainArgs chainArgs) throws VKApiExecutionException {
        Boolean bool = (Boolean) awaitValidation(vKApiExecutionException.getUserConfirmText(), getManager().getValidationHandler$core_release(), ValidationHandlerChainCall$handleUserConfirmation$confirmation$1.INSTANCE);
        if (bool == null || bool.equals(Boolean.FALSE)) {
            throw vKApiExecutionException;
        }
        chainArgs.setUserConfirmed(bool.booleanValue());
    }

    private final void handleValidation(VKApiExecutionException vKApiExecutionException) throws VKApiExecutionException {
        persistToken((VKApiValidationHandler.Credentials) awaitValidation(vKApiExecutionException.getValidationUrl(), getManager().getValidationHandler$core_release(), ValidationHandlerChainCall$handleValidation$credentials$1.INSTANCE), vKApiExecutionException);
    }

    public final <T, H> T awaitValidation(String extra, H h10, n handlerMethod) throws InterruptedException {
        Intrinsics.checkNotNullParameter(extra, "extra");
        Intrinsics.checkNotNullParameter(handlerMethod, "handlerMethod");
        if (h10 == null) {
            return null;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        VKApiValidationHandler.Callback callback = new VKApiValidationHandler.Callback(countDownLatch);
        handlerMethod.invoke(h10, extra, callback);
        countDownLatch.await();
        return (T) callback.getValue();
    }

    @Override // com.vk.api.sdk.chain.ChainCall
    public T call(ChainArgs args) throws VKApiException {
        Intrinsics.checkNotNullParameter(args, "args");
        int retryLimit = getRetryLimit();
        if (retryLimit >= 0) {
            int i = 0;
            while (true) {
                int i10 = i + 1;
                try {
                    return this.chain.call(args);
                } catch (VKApiExecutionException e3) {
                    handleException(e3, args);
                    if (i == retryLimit) {
                        break;
                    }
                    i = i10;
                }
            }
        }
        throw new VKApiException("Can't confirm validation due to retry limit!");
    }

    public final ChainCall<T> getChain() {
        return this.chain;
    }

    public final void persistToken(VKApiValidationHandler.Credentials credentials, VKApiExecutionException ex) throws VKApiExecutionException {
        Intrinsics.checkNotNullParameter(ex, "ex");
        if (Intrinsics.a(credentials, VKApiValidationHandler.Credentials.Companion.getEMPTY())) {
            return;
        }
        if (credentials == null || !credentials.isValid()) {
            throw ex;
        }
        VKApiManager manager = getManager();
        String token = credentials.getToken();
        Intrinsics.b(token);
        manager.setCredentials(token, credentials.getSecret());
    }
}
