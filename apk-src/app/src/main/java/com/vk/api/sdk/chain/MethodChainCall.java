package com.vk.api.sdk.chain;

import com.vk.api.sdk.VKApiManager;
import com.vk.api.sdk.VKApiResponseParser;
import com.vk.api.sdk.VKApiResponseValidator;
import com.vk.api.sdk.exceptions.VKApiCodes;
import com.vk.api.sdk.exceptions.VKApiException;
import com.vk.api.sdk.okhttp.OkHttpExecutor;
import com.vk.api.sdk.okhttp.OkHttpMethodCall;
import com.vk.api.sdk.utils.ApiExtKt;
import ij.g;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

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
public class MethodChainCall<T> extends ChainCall<T> {
    private final OkHttpMethodCall.Builder callBuilder;
    private String defaultDeviceId;
    private final String defaultLang;
    private final OkHttpExecutor okHttpExecutor;
    private final VKApiResponseParser<T> parser;
    private final g responseValidator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MethodChainCall(VKApiManager manager, OkHttpExecutor okHttpExecutor, OkHttpMethodCall.Builder callBuilder, String defaultDeviceId, String defaultLang, VKApiResponseParser<T> vKApiResponseParser) {
        super(manager);
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(okHttpExecutor, "okHttpExecutor");
        Intrinsics.checkNotNullParameter(callBuilder, "callBuilder");
        Intrinsics.checkNotNullParameter(defaultDeviceId, "defaultDeviceId");
        Intrinsics.checkNotNullParameter(defaultLang, "defaultLang");
        this.okHttpExecutor = okHttpExecutor;
        this.callBuilder = callBuilder;
        this.defaultDeviceId = defaultDeviceId;
        this.defaultLang = defaultLang;
        this.parser = vKApiResponseParser;
        this.responseValidator = manager.getConfig().getResponseValidator();
    }

    @Override // com.vk.api.sdk.chain.ChainCall
    public T call(ChainArgs args) {
        Intrinsics.checkNotNullParameter(args, "args");
        if (args.hasCaptcha()) {
            this.callBuilder.args(VKApiCodes.EXTRA_CAPTCHA_SID, args.getCaptchaSid()).args(VKApiCodes.EXTRA_CAPTCHA_KEY, args.getCaptchaKey());
        }
        if (args.getUserConfirmed()) {
            this.callBuilder.args(VKApiCodes.EXTRA_CONFIRM, "1");
        }
        String strArgs = this.callBuilder.args(VKApiCodes.PARAM_DEVICE_ID);
        if (strArgs == null) {
            strArgs = "";
        }
        if (StringsKt.D(strArgs)) {
            strArgs = this.defaultDeviceId;
        }
        OkHttpMethodCall.Builder builder = this.callBuilder;
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        if (strArgs == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String lowerCase = strArgs.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        builder.args(VKApiCodes.PARAM_DEVICE_ID, lowerCase);
        String strArgs2 = this.callBuilder.args(VKApiCodes.PARAM_LANG);
        String str = strArgs2 != null ? strArgs2 : "";
        if (StringsKt.D(str)) {
            str = this.defaultLang;
        }
        OkHttpMethodCall.Builder builder2 = this.callBuilder;
        Locale locale2 = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale2, "getDefault()");
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String lowerCase2 = str.toLowerCase(locale2);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "(this as java.lang.String).toLowerCase(locale)");
        builder2.args(VKApiCodes.PARAM_LANG, lowerCase2);
        return runRequest(this.callBuilder.build());
    }

    public final OkHttpMethodCall.Builder getCallBuilder() {
        return this.callBuilder;
    }

    public final String getDefaultDeviceId() {
        return this.defaultDeviceId;
    }

    public final String getDefaultLang() {
        return this.defaultLang;
    }

    public final OkHttpExecutor getOkHttpExecutor() {
        return this.okHttpExecutor;
    }

    public final VKApiResponseParser<T> getParser() {
        return this.parser;
    }

    public final T parseResult(OkHttpExecutor.MethodResponse methodResponse, String methodName, boolean z5, int[] iArr) throws VKApiException {
        VKApiResponseValidator vKApiResponseValidator;
        Intrinsics.checkNotNullParameter(methodResponse, "methodResponse");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        String response = methodResponse.getResponse();
        if (response == null) {
            throw new VKApiException("Response returned null instead of valid string response");
        }
        if (ApiExtKt.hasSimpleError(response)) {
            throw ApiExtKt.toSimpleError(response, methodName, methodResponse.getExecutorRequestAccessToken());
        }
        if (ApiExtKt.hasExecuteError(response, iArr)) {
            throw ApiExtKt.toExecuteError(response, methodName, iArr);
        }
        try {
            g gVar = this.responseValidator;
            if (gVar != null && (vKApiResponseValidator = (VKApiResponseValidator) gVar.getValue()) != null) {
                vKApiResponseValidator.validateResponse(methodName, z5, response, methodResponse.getHeaders());
            }
        } catch (Throwable unused) {
        }
        VKApiResponseParser<T> vKApiResponseParser = this.parser;
        if (vKApiResponseParser == null) {
            return null;
        }
        return vKApiResponseParser.parse(response);
    }

    public T runRequest(OkHttpMethodCall mc2) {
        Intrinsics.checkNotNullParameter(mc2, "mc");
        return parseResult(this.okHttpExecutor.execute(mc2), mc2.getMethod(), mc2.isExtended(), null);
    }

    public final void setDefaultDeviceId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.defaultDeviceId = str;
    }
}
