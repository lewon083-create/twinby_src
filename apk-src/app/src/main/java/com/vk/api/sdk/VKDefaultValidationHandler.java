package com.vk.api.sdk;

import android.content.Context;
import com.vk.api.sdk.VKApiValidationHandler;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.api.sdk.ui.VKCaptchaActivity;
import com.vk.api.sdk.ui.VKConfirmationActivity;
import com.vk.api.sdk.ui.VKWebViewAuthActivity;
import com.vk.api.sdk.utils.VKValidationLocker;
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
public class VKDefaultValidationHandler implements VKApiValidationHandler {
    private final Context context;

    public VKDefaultValidationHandler(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final void checkCaptchaActivity(VKApiValidationHandler.Callback<String> callback) {
        VKCaptchaActivity.Companion companion = VKCaptchaActivity.Companion;
        if (companion.getLastKey() == null) {
            callback.cancel();
            return;
        }
        String lastKey = companion.getLastKey();
        Intrinsics.b(lastKey);
        callback.submit(lastKey);
    }

    public final Context getContext() {
        return this.context;
    }

    @Override // com.vk.api.sdk.VKApiValidationHandler
    public void handleCaptcha(String img, VKApiValidationHandler.Callback<String> cb2) {
        Intrinsics.checkNotNullParameter(img, "img");
        Intrinsics.checkNotNullParameter(cb2, "cb");
        VKCaptchaActivity.Companion.start(this.context, img);
        VKValidationLocker.INSTANCE.await();
        checkCaptchaActivity(cb2);
    }

    @Override // com.vk.api.sdk.VKApiValidationHandler
    public void handleConfirm(String confirmationText, VKApiValidationHandler.Callback<Boolean> cb2) {
        Intrinsics.checkNotNullParameter(confirmationText, "confirmationText");
        Intrinsics.checkNotNullParameter(cb2, "cb");
        VKConfirmationActivity.Companion companion = VKConfirmationActivity.Companion;
        companion.setResult(false);
        companion.start(this.context, confirmationText);
        VKValidationLocker.INSTANCE.await();
        cb2.submit(Boolean.valueOf(companion.getResult()));
        companion.setResult(false);
    }

    @Override // com.vk.api.sdk.VKApiValidationHandler
    public void handleValidation(String validationUrl, VKApiValidationHandler.Callback<VKApiValidationHandler.Credentials> cb2) {
        Unit unit;
        Intrinsics.checkNotNullParameter(validationUrl, "validationUrl");
        Intrinsics.checkNotNullParameter(cb2, "cb");
        VKWebViewAuthActivity.Companion companion = VKWebViewAuthActivity.Companion;
        companion.setValidationResult(null);
        companion.startForValidation(this.context, validationUrl);
        VKValidationLocker.INSTANCE.await();
        VKApiValidationHandler.Credentials validationResult = companion.getValidationResult();
        if (validationResult == null) {
            unit = null;
        } else {
            cb2.submit(validationResult);
            unit = Unit.f27471a;
        }
        if (unit == null) {
            cb2.cancel();
        }
        companion.setValidationResult(null);
    }

    @Override // com.vk.api.sdk.VKApiValidationHandler
    public void tryToHandleException(VKApiExecutionException vKApiExecutionException, VKApiManager vKApiManager) throws VKApiExecutionException {
        VKApiValidationHandler.DefaultImpls.tryToHandleException(this, vKApiExecutionException, vKApiManager);
    }
}
