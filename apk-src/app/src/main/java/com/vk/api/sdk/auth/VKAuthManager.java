package com.vk.api.sdk.auth;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.vk.api.sdk.R;
import com.vk.api.sdk.VK;
import com.vk.api.sdk.VKKeyValueStorage;
import com.vk.api.sdk.auth.VKAuthenticationResult;
import com.vk.api.sdk.exceptions.VKApiCodes;
import com.vk.api.sdk.exceptions.VKAuthException;
import com.vk.api.sdk.extensions.ContextExtKt;
import com.vk.api.sdk.ui.VKWebViewAuthActivity;
import com.vk.api.sdk.utils.VKUtils;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
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
public final class VKAuthManager {
    public static final Companion Companion = new Companion(null);
    public static final String VK_APP_AUTH_ACTION = "com.vkontakte.android.action.SDK_AUTH";
    private static final int VK_APP_AUTH_CODE = 282;
    public static final String VK_APP_PACKAGE_ID = "com.vkontakte.android";
    public static final String VK_AUTH_ERROR = "error";
    public static final String VK_EXTRA_TOKEN_DATA = "extra-token-data";
    private final VKKeyValueStorage keyValueStorage;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public VKAuthManager(VKKeyValueStorage keyValueStorage) {
        Intrinsics.checkNotNullParameter(keyValueStorage, "keyValueStorage");
        this.keyValueStorage = keyValueStorage;
    }

    private final VKAuthException obtainExceptionFromIntent(Intent intent) {
        Bundle extras = intent.getExtras();
        int i = extras == null ? 0 : extras.getInt(VKApiCodes.EXTRA_VW_LOGIN_ERROR);
        Bundle extras2 = intent.getExtras();
        return new VKAuthException(i, extras2 == null ? null : extras2.getString("error"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Collection<VKScope> prepareScopes(Collection<? extends VKScope> collection) {
        VKScope vKScope = VKScope.OFFLINE;
        return !collection.contains(vKScope) ? CollectionsKt.M(collection, vKScope) : collection;
    }

    private final void startAuthActivity(Activity activity, VKAuthParams vKAuthParams) {
        activity.startActivityForResult(createVKClientAuthIntent(vKAuthParams), VK_APP_AUTH_CODE);
    }

    private final void startInternalAuthActivity(Activity activity, VKAuthParams vKAuthParams) {
        VKWebViewAuthActivity.Companion.startForAuth(activity, vKAuthParams, VK_APP_AUTH_CODE);
    }

    public final void clearAccessToken() {
        VKAccessToken.Companion.remove(this.keyValueStorage);
    }

    public final Intent createVKClientAuthIntent(VKAuthParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intent intent = new Intent(VK_APP_AUTH_ACTION, (Uri) null);
        intent.setPackage(VK_APP_PACKAGE_ID);
        intent.putExtras(params.toExtraBundle());
        return intent;
    }

    public final VKAccessToken getCurrentToken() {
        return VKAccessToken.Companion.restore(this.keyValueStorage);
    }

    public final boolean isLoggedIn() {
        VKAccessToken currentToken = getCurrentToken();
        return currentToken != null && currentToken.isValid();
    }

    public final void login(Activity activity, Collection<? extends VKScope> scopes) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        VKAuthParams vKAuthParams = new VKAuthParams(VK.getAppId(activity), null, prepareScopes(scopes), 2, null);
        if (VKUtils.isIntentAvailable(activity, VK_APP_AUTH_ACTION, null, VK_APP_PACKAGE_ID)) {
            startAuthActivity(activity, vKAuthParams);
        } else {
            startInternalAuthActivity(activity, vKAuthParams);
        }
    }

    public final boolean onActivityResult(Context context, int i, int i10, Intent intent, VKAuthCallback callback, boolean z5) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (i != VK_APP_AUTH_CODE) {
            return false;
        }
        if (intent == null) {
            callback.onLoginFailed(new VKAuthException(0, null, 3, null));
            return true;
        }
        VKAuthenticationResult vKAuthenticationResultProcessResult = processResult(intent);
        if (i10 != -1 || (vKAuthenticationResultProcessResult instanceof VKAuthenticationResult.Failed)) {
            VKAuthenticationResult.Failed failed = vKAuthenticationResultProcessResult instanceof VKAuthenticationResult.Failed ? (VKAuthenticationResult.Failed) vKAuthenticationResultProcessResult : null;
            VKAuthException exception = failed != null ? failed.getException() : null;
            if (exception == null) {
                exception = obtainExceptionFromIntent(intent);
            }
            callback.onLoginFailed(exception);
            if (z5 && !exception.isCanceled()) {
                ContextExtKt.showToast(context, R.string.vk_message_login_error);
            }
        } else {
            VKAuthenticationResult.Success success = vKAuthenticationResultProcessResult instanceof VKAuthenticationResult.Success ? (VKAuthenticationResult.Success) vKAuthenticationResultProcessResult : null;
            if (success != null) {
                storeLoginResult(success);
                callback.onLogin(success.getToken());
            }
        }
        return true;
    }

    public final VKAuthenticationResult processResult(Intent intent) {
        Map map;
        if (intent == null) {
            return new VKAuthenticationResult.Failed(new VKAuthException(0, "No result from caller provided", 1, null));
        }
        if (intent.hasExtra(VK_EXTRA_TOKEN_DATA)) {
            map = VKUtils.explodeQueryString(intent.getStringExtra(VK_EXTRA_TOKEN_DATA));
        } else if (intent.getExtras() != null) {
            map = new HashMap();
            Bundle extras = intent.getExtras();
            Intrinsics.b(extras);
            for (String key : extras.keySet()) {
                Intrinsics.checkNotNullExpressionValue(key, "key");
                Bundle extras2 = intent.getExtras();
                Intrinsics.b(extras2);
                map.put(key, String.valueOf(extras2.get(key)));
            }
        } else {
            map = null;
        }
        if (map == null || map.get("error") != null) {
            return new VKAuthenticationResult.Failed(obtainExceptionFromIntent(intent));
        }
        try {
            return new VKAuthenticationResult.Success(new VKAccessToken(map));
        } catch (Exception e3) {
            Log.e("VKAuthManager", "Failed to get VK token", e3);
            return new VKAuthenticationResult.Failed(new VKAuthException(0, Intrinsics.f(e3.getMessage(), "Auth failed due to exception: "), 1, null));
        }
    }

    public final void storeLoginResult(VKAuthenticationResult.Success result) {
        Intrinsics.checkNotNullParameter(result, "result");
        result.getToken().save(this.keyValueStorage);
        VK.INSTANCE.getApiManager$core_release().setCredentials(result.getToken().getAccessToken(), result.getToken().getSecret());
    }
}
