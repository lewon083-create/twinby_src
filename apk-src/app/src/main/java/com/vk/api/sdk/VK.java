package com.vk.api.sdk;

import a0.d;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.vk.api.sdk.auth.VKAccessToken;
import com.vk.api.sdk.auth.VKAuthCallback;
import com.vk.api.sdk.auth.VKAuthManager;
import com.vk.api.sdk.auth.VKAuthResultContract;
import com.vk.api.sdk.auth.VKScope;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.api.sdk.internal.ApiCommand;
import com.vk.api.sdk.requests.VKBooleanRequest;
import com.vk.api.sdk.utils.DefaultUserAgent;
import com.vk.api.sdk.utils.VKUrlResolver;
import com.vk.api.sdk.utils.VKUtils;
import com.vk.dto.common.id.UserId;
import d.n;
import f.c;
import ij.g;
import ij.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.d0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.r;

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
public final class VK {
    private static final String SDK_APP_ID = "com_vk_sdk_AppId";
    private static final String SDK_UA_PREFIX = "VKAndroidSDK";
    private static final String SDK_VERSION = "VKSdkVersion";
    private static final String SDK_VERSION_CODE = "VKSdkVersionCode";
    public static VKApiManager apiManager;
    private static VKAuthManager authManager;
    private static int cachedResourceAppId;
    private static VKApiConfig config;
    public static final VK INSTANCE = new VK();
    private static final ArrayList<VKTokenExpiredHandler> tokenExpiredHandlers = new ArrayList<>();
    private static final g urlResolver$delegate = h.b(VK$urlResolver$2.INSTANCE);

    /* JADX INFO: renamed from: com.vk.api.sdk.VK$setConfig$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AnonymousClass1 extends r implements Function0<VKAccessToken> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final VKAccessToken invoke() {
            VKAuthManager vKAuthManager = VK.authManager;
            if (vKAuthManager != null) {
                return vKAuthManager.getCurrentToken();
            }
            Intrinsics.g("authManager");
            throw null;
        }
    }

    private VK() {
    }

    public static final void addTokenExpiredHandler(VKTokenExpiredHandler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        tokenExpiredHandlers.add(handler);
    }

    public static final void clearAccessToken(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        VKAuthManager vKAuthManager = authManager;
        if (vKAuthManager != null) {
            if (vKAuthManager != null) {
                vKAuthManager.clearAccessToken();
            } else {
                Intrinsics.g("authManager");
                throw null;
            }
        }
    }

    public static final <T> void execute(ApiCommand<T> request, VKApiCallback<? super T> vKApiCallback) {
        Intrinsics.checkNotNullParameter(request, "request");
        VKScheduler.INSTANCE.getNetworkExecutor().submit(new d(18, request, vKApiCallback));
    }

    public static /* synthetic */ void execute$default(ApiCommand apiCommand, VKApiCallback vKApiCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            vKApiCallback = null;
        }
        execute(apiCommand, vKApiCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: execute$lambda-3, reason: not valid java name */
    public static final void m18execute$lambda3(ApiCommand request, VKApiCallback vKApiCallback) {
        Intrinsics.checkNotNullParameter(request, "$request");
        try {
            VKScheduler.runOnMainThread$default(new d(16, vKApiCallback, executeSync(request)), 0L, 2, null);
        } catch (Exception e3) {
            VKScheduler.runOnMainThread$default(new d(17, e3, vKApiCallback), 0L, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: execute$lambda-3$lambda-1, reason: not valid java name */
    public static final void m19execute$lambda3$lambda1(VKApiCallback vKApiCallback, Object obj) {
        if (vKApiCallback == null) {
            return;
        }
        vKApiCallback.success(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: execute$lambda-3$lambda-2, reason: not valid java name */
    public static final void m20execute$lambda3$lambda2(Exception e3, VKApiCallback vKApiCallback) {
        Intrinsics.checkNotNullParameter(e3, "$e");
        if ((e3 instanceof VKApiExecutionException) && ((VKApiExecutionException) e3).isInvalidCredentialsError()) {
            INSTANCE.handleTokenExpired$core_release();
        }
        if (vKApiCallback == null) {
            return;
        }
        vKApiCallback.fail(e3);
    }

    public static final <T> T executeSync(ApiCommand<T> cmd) {
        Intrinsics.checkNotNullParameter(cmd, "cmd");
        return cmd.execute(INSTANCE.getApiManager$core_release());
    }

    public static final String getApiVersion() {
        VKApiConfig vKApiConfig = config;
        if (vKApiConfig != null) {
            return vKApiConfig.getVersion();
        }
        Intrinsics.g("config");
        throw null;
    }

    public static final int getAppId(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            return INSTANCE.getApiManager$core_release().getConfig().getAppId();
        } catch (Exception unused) {
            return INSTANCE.getAppIdFromResources(context);
        }
    }

    private final int getAppIdFromResources(Context context) {
        int integer;
        int i = cachedResourceAppId;
        if (i != 0) {
            return i;
        }
        try {
            integer = context.getResources().getInteger(context.getResources().getIdentifier(SDK_APP_ID, "integer", context.getPackageName()));
        } catch (Exception unused) {
            integer = 0;
        }
        if (integer == 0) {
            throw new RuntimeException("<integer name=\"com_vk_sdk_AppId\">your_app_id</integer> is not found in your resources.xml");
        }
        cachedResourceAppId = integer;
        return integer;
    }

    public static final UserId getUserId() {
        VKAuthManager vKAuthManager = authManager;
        if (vKAuthManager == null) {
            Intrinsics.g("authManager");
            throw null;
        }
        VKAccessToken currentToken = vKAuthManager.getCurrentToken();
        UserId userId = currentToken != null ? currentToken.getUserId() : null;
        return userId == null ? UserId.DEFAULT : userId;
    }

    public static final g.b getVKAuthActivityResultContract() {
        VKAuthManager vKAuthManager = authManager;
        if (vKAuthManager != null) {
            return new VKAuthResultContract(vKAuthManager);
        }
        Intrinsics.g("authManager");
        throw null;
    }

    public static final void initialize(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        VK vk2 = INSTANCE;
        setConfig(new VKApiConfig(context, vk2.getAppIdFromResources(context), new VKDefaultValidationHandler(context), null, null, null, null, null, null, null, null, null, false, null, 0, null, null, null, null, 0L, null, null, null, null, 16777208, null));
        if (isLoggedIn()) {
            vk2.trackVisitor$core_release();
        }
    }

    public static final boolean isLoggedIn() {
        VKAuthManager vKAuthManager = authManager;
        if (vKAuthManager != null) {
            return vKAuthManager.isLoggedIn();
        }
        Intrinsics.g("authManager");
        throw null;
    }

    public static final void login(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        login$default(activity, null, 2, null);
    }

    public static void login$default(Activity activity, Collection collection, int i, Object obj) {
        if ((i & 2) != 0) {
            collection = d0.f27478b;
        }
        login(activity, (Collection<? extends VKScope>) collection);
    }

    public static final void logout() {
        VKAuthManager vKAuthManager = authManager;
        if (vKAuthManager == null) {
            Intrinsics.g("authManager");
            throw null;
        }
        vKAuthManager.clearAccessToken();
        VKUtils vKUtils = VKUtils.INSTANCE;
        VKApiConfig vKApiConfig = config;
        if (vKApiConfig != null) {
            vKUtils.clearAllCookies(vKApiConfig.getContext());
        } else {
            Intrinsics.g("config");
            throw null;
        }
    }

    public static final boolean onActivityResult(int i, int i10, Intent intent, VKAuthCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        return onActivityResult$default(i, i10, intent, callback, false, 16, null);
    }

    public static /* synthetic */ boolean onActivityResult$default(int i, int i10, Intent intent, VKAuthCallback vKAuthCallback, boolean z5, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            z5 = true;
        }
        return onActivityResult(i, i10, intent, vKAuthCallback, z5);
    }

    public static final void removeTokenExpiredHandler(VKTokenExpiredHandler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        tokenExpiredHandlers.remove(handler);
    }

    public static final void saveAccessToken(Context context, UserId userId, String accessToken, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        setCredentials(context, userId, accessToken, str, true);
    }

    public static final void setConfig(VKApiConfig config2) {
        Intrinsics.checkNotNullParameter(config2, "config");
        config = config2;
        VK vk2 = INSTANCE;
        vk2.setApiManager$core_release(new VKApiManager(config2));
        authManager = new VKAuthManager(config2.getKeyValueStorage());
        vk2.getApiManager$core_release().setCredentials(VKApiCredentials.Companion.lazyFrom(AnonymousClass1.INSTANCE));
    }

    public static final void setCredentials(Context context, UserId userId, String accessToken, String str, boolean z5) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        if (z5) {
            VKAccessToken vKAccessToken = new VKAccessToken(userId, accessToken, str);
            VKApiConfig vKApiConfig = config;
            if (vKApiConfig == null) {
                Intrinsics.g("config");
                throw null;
            }
            vKAccessToken.save(vKApiConfig.getKeyValueStorage());
        }
        INSTANCE.getApiManager$core_release().setCredentials(accessToken, str);
    }

    public static /* synthetic */ void setCredentials$default(Context context, UserId userId, String str, String str2, boolean z5, int i, Object obj) {
        if ((i & 16) != 0) {
            z5 = true;
        }
        setCredentials(context, userId, str, str2, z5);
    }

    public final VKApiManager getApiManager$core_release() {
        VKApiManager vKApiManager = apiManager;
        if (vKApiManager != null) {
            return vKApiManager;
        }
        Intrinsics.g("apiManager");
        throw null;
    }

    public final DefaultUserAgent getSDKUserAgent$core_release() throws PackageManager.NameNotFoundException {
        VKApiConfig vKApiConfig = config;
        if (vKApiConfig == null) {
            throw new RuntimeException("please call VK.initialize first!");
        }
        if (vKApiConfig == null) {
            Intrinsics.g("config");
            throw null;
        }
        PackageManager packageManager = vKApiConfig.getContext().getPackageManager();
        VKApiConfig vKApiConfig2 = config;
        if (vKApiConfig2 == null) {
            Intrinsics.g("config");
            throw null;
        }
        ApplicationInfo applicationInfo = packageManager.getApplicationInfo(vKApiConfig2.getContext().getPackageName(), 128);
        Intrinsics.checkNotNullExpressionValue(applicationInfo, "config.context.packageMa…ageManager.GET_META_DATA)");
        String strValueOf = String.valueOf(applicationInfo.metaData.get(SDK_VERSION));
        String strValueOf2 = String.valueOf(applicationInfo.metaData.get(SDK_VERSION_CODE));
        VKUtils vKUtils = VKUtils.INSTANCE;
        VKApiConfig vKApiConfig3 = config;
        if (vKApiConfig3 != null) {
            return new DefaultUserAgent(SDK_UA_PREFIX, strValueOf, strValueOf2, vKUtils.getPhysicalDisplaySize(vKApiConfig3.getContext()));
        }
        Intrinsics.g("config");
        throw null;
    }

    public final VKUrlResolver getUrlResolver() {
        return (VKUrlResolver) urlResolver$delegate.getValue();
    }

    public final void handleTokenExpired$core_release() {
        VKAuthManager vKAuthManager = authManager;
        if (vKAuthManager == null) {
            Intrinsics.g("authManager");
            throw null;
        }
        vKAuthManager.clearAccessToken();
        Iterator<T> it = tokenExpiredHandlers.iterator();
        while (it.hasNext()) {
            ((VKTokenExpiredHandler) it.next()).onTokenExpired();
        }
    }

    public final void setApiManager$core_release(VKApiManager vKApiManager) {
        Intrinsics.checkNotNullParameter(vKApiManager, "<set-?>");
        apiManager = vKApiManager;
    }

    public final void trackVisitor$core_release() {
        execute$default(new VKBooleanRequest("stats.trackVisitor"), null, 2, null);
    }

    public static final void login(Activity activity, Collection<? extends VKScope> scopes) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        VKAuthManager vKAuthManager = authManager;
        if (vKAuthManager != null) {
            vKAuthManager.login(activity, scopes);
        } else {
            Intrinsics.g("authManager");
            throw null;
        }
    }

    public static final boolean onActivityResult(int i, int i10, Intent intent, VKAuthCallback callback, boolean z5) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        VKAuthManager vKAuthManager = authManager;
        if (vKAuthManager == null) {
            Intrinsics.g("authManager");
            throw null;
        }
        VKApiConfig vKApiConfig = config;
        if (vKApiConfig == null) {
            Intrinsics.g("config");
            throw null;
        }
        boolean zOnActivityResult = vKAuthManager.onActivityResult(vKApiConfig.getContext(), i, i10, intent, callback, z5);
        if (zOnActivityResult && isLoggedIn()) {
            INSTANCE.trackVisitor$core_release();
        }
        return zOnActivityResult;
    }

    public static final c login(n activity, f.b callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        c cVarRegisterForActivityResult = activity.registerForActivityResult(getVKAuthActivityResultContract(), callback);
        Intrinsics.checkNotNullExpressionValue(cVarRegisterForActivityResult, "activity.registerForActi…sultContract(), callback)");
        return cVarRegisterForActivityResult;
    }
}
