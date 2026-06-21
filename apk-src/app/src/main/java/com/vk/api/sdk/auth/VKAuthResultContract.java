package com.vk.api.sdk.auth;

import android.content.Context;
import android.content.Intent;
import com.vk.api.sdk.VK;
import com.vk.api.sdk.auth.VKAuthenticationResult;
import com.vk.api.sdk.exceptions.VKAuthException;
import com.vk.api.sdk.ui.VKWebViewAuthActivity;
import com.vk.api.sdk.utils.VKUtils;
import g.b;
import java.util.Collection;
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
public final class VKAuthResultContract extends b {
    private final VKAuthManager authManager;

    public VKAuthResultContract(VKAuthManager authManager) {
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        this.authManager = authManager;
    }

    @Override // g.b
    public Intent createIntent(Context context, Collection<? extends VKScope> input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        VKAuthParams vKAuthParams = new VKAuthParams(VK.getAppId(context), null, input, 2, null);
        return VKUtils.isIntentAvailable(context, VKAuthManager.VK_APP_AUTH_ACTION, null, VKAuthManager.VK_APP_PACKAGE_ID) ? this.authManager.createVKClientAuthIntent(vKAuthParams) : VKWebViewAuthActivity.Companion.createAuthIntent$core_release(context, vKAuthParams);
    }

    @Override // g.b
    public VKAuthenticationResult parseResult(int i, Intent intent) {
        VKAuthenticationResult failed = i != -1 ? new VKAuthenticationResult.Failed(new VKAuthException(0, Intrinsics.f(Integer.valueOf(i), "Authentication cancelled with activity code = "), 1, null)) : this.authManager.processResult(intent);
        if (failed instanceof VKAuthenticationResult.Success) {
            this.authManager.storeLoginResult((VKAuthenticationResult.Success) failed);
            VK.INSTANCE.trackVisitor$core_release();
        }
        return failed;
    }
}
