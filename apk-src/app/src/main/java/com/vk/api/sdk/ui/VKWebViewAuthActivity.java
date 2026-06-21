package com.vk.api.sdk.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import com.vk.api.sdk.R;
import com.vk.api.sdk.VK;
import com.vk.api.sdk.VKApiValidationHandler;
import com.vk.api.sdk.auth.VKAuthManager;
import com.vk.api.sdk.auth.VKAuthParams;
import com.vk.api.sdk.exceptions.VKApiCodes;
import com.vk.api.sdk.extensions.ContextExtKt;
import com.vk.api.sdk.utils.VKUtils;
import com.vk.api.sdk.utils.VKValidationLocker;
import io.sentry.TraceContext;
import io.sentry.protocol.Message;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.j0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.a0;

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
public class VKWebViewAuthActivity extends Activity {
    public static final Companion Companion = new Companion(null);
    private static final String LOG_TAG = "VKWebViewAuthActivity";
    public static final String VK_EXTRA_AUTH_PARAMS = "vk_auth_params";
    private static final String VK_EXTRA_VALIDATION_URL = "vk_validation_url";
    public static final String VK_RESULT_INTENT_NAME = "com.vk.auth-token";
    private static VKApiValidationHandler.Credentials validationResult;
    private VKAuthParams params;
    private ProgressBar progress;
    private WebView webView;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Intent createAuthIntent$core_release(Context ctx, VKAuthParams params) {
            Intrinsics.checkNotNullParameter(ctx, "ctx");
            Intrinsics.checkNotNullParameter(params, "params");
            Intent intentPutExtra = new Intent(ctx, (Class<?>) VKWebViewAuthActivity.class).putExtra(VKWebViewAuthActivity.VK_EXTRA_AUTH_PARAMS, params.toBundle());
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "Intent(ctx, VKWebViewAut…ARAMS, params.toBundle())");
            return intentPutExtra;
        }

        public final VKApiValidationHandler.Credentials getValidationResult() {
            return VKWebViewAuthActivity.validationResult;
        }

        public final void setValidationResult(VKApiValidationHandler.Credentials credentials) {
            VKWebViewAuthActivity.validationResult = credentials;
        }

        public final void startForAuth(Activity activity, VKAuthParams params, int i) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(params, "params");
            activity.startActivityForResult(createAuthIntent$core_release(activity, params), i);
        }

        public final void startForValidation(Context context, String validationUrl) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(validationUrl, "validationUrl");
            Intent intentPutExtra = new Intent(context, (Class<?>) VKWebViewAuthActivity.class).putExtra(VKWebViewAuthActivity.VK_EXTRA_VALIDATION_URL, validationUrl);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "Intent(context, VKWebVie…ATION_URL, validationUrl)");
            if (ContextExtKt.toActivitySafe(context) == null) {
                intentPutExtra.addFlags(268435456);
            }
            context.startActivity(intentPutExtra);
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public final class OAuthWebViewClient extends WebViewClient {
        private boolean hasError;
        final /* synthetic */ VKWebViewAuthActivity this$0;

        public OAuthWebViewClient(VKWebViewAuthActivity this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.this$0 = this$0;
        }

        private final boolean handleUrl(String str) {
            int i = 0;
            if (str != null) {
                if (this.this$0.needValidationResult()) {
                    Uri uri = Uri.parse(a0.l(str, "#", "?"));
                    if (uri.getQueryParameter("success") != null) {
                        VKWebViewAuthActivity vKWebViewAuthActivity = this.this$0;
                        Intrinsics.checkNotNullExpressionValue(uri, "uri");
                        vKWebViewAuthActivity.handleSuccess(uri);
                        return false;
                    }
                    if (uri.getQueryParameter("cancel") != null) {
                        this.this$0.notifyLockerAndFinish();
                        return false;
                    }
                } else {
                    String redirectUrl = this.this$0.getRedirectUrl();
                    if (redirectUrl == null || a0.n(str, redirectUrl, false)) {
                        Intent intent = new Intent(VKWebViewAuthActivity.VK_RESULT_INTENT_NAME);
                        String strSubstring = str.substring(StringsKt.C(str, "#", 0, false, 6) + 1);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.String).substring(startIndex)");
                        intent.putExtra(VKAuthManager.VK_EXTRA_TOKEN_DATA, strSubstring);
                        Map<String, String> mapExplodeQueryString = VKUtils.explodeQueryString(strSubstring);
                        if (mapExplodeQueryString == null || (!mapExplodeQueryString.containsKey("error") && !mapExplodeQueryString.containsKey("cancel"))) {
                            i = -1;
                        }
                        this.this$0.setResult(i, intent);
                        this.this$0.notifyLockerAndFinish();
                        return true;
                    }
                }
            }
            return false;
        }

        private final void onError(int i) {
            this.hasError = true;
            Intent intent = new Intent();
            intent.putExtra(VKApiCodes.EXTRA_VW_LOGIN_ERROR, i);
            this.this$0.setResult(0, intent);
            this.this$0.finish();
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (this.hasError) {
                return;
            }
            this.this$0.showWebView();
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            handleUrl(str);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError webResourceError) {
            String string;
            int errorCode;
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(request, "request");
            super.onReceivedError(view, request, webResourceError);
            String string2 = request.getUrl().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "request.url.toString()");
            if (webResourceError != null) {
                string = webResourceError.getDescription().toString();
                errorCode = webResourceError.getErrorCode();
            } else {
                string = "no_description";
                errorCode = -1;
            }
            Log.w(VKWebViewAuthActivity.LOG_TAG, errorCode + ':' + string + ':' + string2);
            WebView webView = this.this$0.webView;
            if (webView == null) {
                Intrinsics.g("webView");
                throw null;
            }
            if (Intrinsics.a(webView.getUrl(), string2)) {
                onError(errorCode);
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return handleUrl(String.valueOf(webResourceRequest == null ? null : webResourceRequest.getUrl()));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return handleUrl(str);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i);
            sb2.append(':');
            sb2.append((Object) str);
            sb2.append(':');
            sb2.append((Object) str2);
            Log.w(VKWebViewAuthActivity.LOG_TAG, sb2.toString());
            WebView webView2 = this.this$0.webView;
            if (webView2 == null) {
                Intrinsics.g("webView");
                throw null;
            }
            if (Intrinsics.a(webView2.getUrl(), str2)) {
                onError(i);
            }
        }
    }

    private final void configureWebView() {
        WebView webView = this.webView;
        if (webView == null) {
            Intrinsics.g("webView");
            throw null;
        }
        webView.setWebViewClient(new OAuthWebViewClient(this));
        webView.setVerticalScrollBarEnabled(false);
        webView.setVisibility(4);
        webView.setOverScrollMode(2);
        WebView webView2 = this.webView;
        if (webView2 != null) {
            webView2.getSettings().setJavaScriptEnabled(true);
        } else {
            Intrinsics.g("webView");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getRedirectUrl() {
        if (needValidationResult()) {
            return getIntent().getStringExtra(VK_EXTRA_VALIDATION_URL);
        }
        VKAuthParams vKAuthParams = this.params;
        if (vKAuthParams != null) {
            return vKAuthParams.getRedirectUrl();
        }
        Intrinsics.g(Message.JsonKeys.PARAMS);
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleSuccess(Uri uri) {
        VKApiValidationHandler.Credentials empty;
        if (uri.getQueryParameter(VKApiCodes.EXTRA_ACCESS_TOKEN) != null) {
            String queryParameter = uri.getQueryParameter(VKApiCodes.EXTRA_ACCESS_TOKEN);
            String queryParameter2 = uri.getQueryParameter("secret");
            String queryParameter3 = uri.getQueryParameter(TraceContext.JsonKeys.USER_ID);
            empty = new VKApiValidationHandler.Credentials(queryParameter2, queryParameter, queryParameter3 == null ? null : Integer.valueOf(Integer.parseInt(queryParameter3)));
        } else {
            empty = VKApiValidationHandler.Credentials.Companion.getEMPTY();
        }
        validationResult = empty;
        notifyLockerAndFinish();
    }

    private final void loadUrl() {
        String string;
        try {
            if (needValidationResult()) {
                string = getIntent().getStringExtra(VK_EXTRA_VALIDATION_URL);
                if (string == null) {
                    throw new IllegalStateException("There is no vk_validation_url key inside");
                }
            } else {
                Uri.Builder builderBuildUpon = Uri.parse("https://oauth.vk.com/authorize").buildUpon();
                for (Map.Entry<String, String> entry : getUrlParams().entrySet()) {
                    builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                }
                string = builderBuildUpon.build().toString();
                Intrinsics.checkNotNullExpressionValue(string, "{\n                val ur….toString()\n            }");
            }
            WebView webView = this.webView;
            if (webView == null) {
                Intrinsics.g("webView");
                throw null;
            }
            webView.loadUrl(string);
        } catch (Exception e3) {
            e3.printStackTrace();
            setResult(0);
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean needValidationResult() {
        return getIntent().getStringExtra(VK_EXTRA_VALIDATION_URL) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyLockerAndFinish() {
        VKValidationLocker.INSTANCE.signal();
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showWebView() {
        ProgressBar progressBar = this.progress;
        if (progressBar == null) {
            Intrinsics.g("progress");
            throw null;
        }
        progressBar.setVisibility(8);
        WebView webView = this.webView;
        if (webView != null) {
            webView.setVisibility(0);
        } else {
            Intrinsics.g("webView");
            throw null;
        }
    }

    public Map<String, String> getUrlParams() {
        VKAuthParams vKAuthParams = this.params;
        if (vKAuthParams == null) {
            Intrinsics.g(Message.JsonKeys.PARAMS);
            throw null;
        }
        Pair pair = new Pair("client_id", String.valueOf(vKAuthParams.getAppId()));
        VKAuthParams vKAuthParams2 = this.params;
        if (vKAuthParams2 == null) {
            Intrinsics.g(Message.JsonKeys.PARAMS);
            throw null;
        }
        Pair pair2 = new Pair("scope", vKAuthParams2.getScopeString());
        VKAuthParams vKAuthParams3 = this.params;
        if (vKAuthParams3 != null) {
            return j0.g(pair, pair2, new Pair(VKApiCodes.PARAM_REDIRECT_URI, vKAuthParams3.getRedirectUrl()), new Pair("response_type", "token"), new Pair("display", "mobile"), new Pair("v", VK.getApiVersion()), new Pair("revoke", "1"));
        }
        Intrinsics.g(Message.JsonKeys.PARAMS);
        throw null;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.vk_webview_auth_dialog);
        View viewFindViewById = findViewById(R.id.webView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.webView)");
        this.webView = (WebView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.progress);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(R.id.progress)");
        this.progress = (ProgressBar) viewFindViewById2;
        VKAuthParams vKAuthParamsFromBundle = VKAuthParams.Companion.fromBundle(getIntent().getBundleExtra(VK_EXTRA_AUTH_PARAMS));
        if (vKAuthParamsFromBundle != null) {
            this.params = vKAuthParamsFromBundle;
        } else if (!needValidationResult()) {
            finish();
        }
        configureWebView();
        loadUrl();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        WebView webView = this.webView;
        if (webView == null) {
            Intrinsics.g("webView");
            throw null;
        }
        webView.destroy();
        VKValidationLocker.INSTANCE.signal();
        super.onDestroy();
    }
}
