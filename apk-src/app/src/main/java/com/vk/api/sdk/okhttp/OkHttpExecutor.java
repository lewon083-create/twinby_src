package com.vk.api.sdk.okhttp;

import al.b;
import android.content.Context;
import android.net.Uri;
import com.vk.api.sdk.VKApiCredentials;
import com.vk.api.sdk.VKApiProgressListener;
import com.vk.api.sdk.VKOkHttpProvider;
import com.vk.api.sdk.exceptions.IgnoredAccessTokenException;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.api.sdk.exceptions.VKInternalServerErrorException;
import com.vk.api.sdk.exceptions.VKLargeEntityException;
import com.vk.api.sdk.internal.HttpMultipartEntry;
import com.vk.api.sdk.internal.QueryStringGenerator;
import com.vk.api.sdk.utils.log.Logger;
import ij.g;
import ij.h;
import io.sentry.protocol.Request;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.a0;
import nl.i;
import pe.a;
import zk.b0;
import zk.c;
import zk.d0;
import zk.f0;
import zk.k;
import zk.p;
import zk.q;
import zk.r;
import zk.s;
import zk.t;
import zk.u;
import zk.w;
import zk.x;
import zk.z;

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
public class OkHttpExecutor {
    public static final Companion Companion = new Companion(null);
    public static final String MIME_APPLICATION = "application/x-www-form-urlencoded; charset=utf-8";
    private static final String UTF_8 = "UTF-8";
    private final OkHttpExecutorConfig config;
    private final Context context;
    private volatile g credentialsProvider;
    private final String customEndpoint;
    private volatile String ignoredAccessToken;
    private final Object lock;
    private final g okHttpProvider$delegate;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String defaultApiEndpoint(String str) {
            return a.f("https://", str, "/method");
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class MethodResponse {
        private final String executorRequestAccessToken;
        private final k headers;
        private final String response;

        public MethodResponse(String str, k headers, String str2) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.response = str;
            this.headers = headers;
            this.executorRequestAccessToken = str2;
        }

        public static /* synthetic */ MethodResponse copy$default(MethodResponse methodResponse, String str, k kVar, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = methodResponse.response;
            }
            if ((i & 2) != 0) {
                kVar = methodResponse.headers;
            }
            if ((i & 4) != 0) {
                str2 = methodResponse.executorRequestAccessToken;
            }
            return methodResponse.copy(str, kVar, str2);
        }

        public final String component1() {
            return this.response;
        }

        public final k component2() {
            return this.headers;
        }

        public final String component3() {
            return this.executorRequestAccessToken;
        }

        public final MethodResponse copy(String str, k headers, String str2) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            return new MethodResponse(str, headers, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MethodResponse)) {
                return false;
            }
            MethodResponse methodResponse = (MethodResponse) obj;
            return Intrinsics.a(this.response, methodResponse.response) && Intrinsics.a(this.headers, methodResponse.headers) && Intrinsics.a(this.executorRequestAccessToken, methodResponse.executorRequestAccessToken);
        }

        public final String getExecutorRequestAccessToken() {
            return this.executorRequestAccessToken;
        }

        public final k getHeaders() {
            return this.headers;
        }

        public final String getResponse() {
            return this.response;
        }

        public int hashCode() {
            String str = this.response;
            int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.headers.f46414b)) * 31;
            String str2 = this.executorRequestAccessToken;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "MethodResponse(response=" + ((Object) this.response) + ", headers=" + this.headers + ", executorRequestAccessToken=" + ((Object) this.executorRequestAccessToken) + ')';
        }
    }

    public OkHttpExecutor(OkHttpExecutorConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.config = config;
        this.context = config.getContext();
        this.lock = new Object();
        this.okHttpProvider$delegate = h.b(new OkHttpExecutor$okHttpProvider$2(this));
        this.credentialsProvider = VKApiCredentials.Companion.lazyFrom(config.getAccessToken(), config.getSecret());
        this.customEndpoint = config.getCustomEndpoint();
    }

    private final String convertFileNameToSafeValue(String str) throws UnsupportedEncodingException {
        String strEncode = URLEncoder.encode(a0.l(str, "\"", "\\\""), UTF_8);
        Intrinsics.checkNotNullExpressionValue(strEncode, "encode(fileName.replace(\"\\\"\", \"\\\\\\\"\"), UTF_8)");
        return strEncode;
    }

    private final VKOkHttpProvider getOkHttpProvider() {
        return (VKOkHttpProvider) this.okHttpProvider$delegate.getValue();
    }

    private final String resolveEndpoint(String str) {
        return this.customEndpoint.length() > 0 ? this.customEndpoint : Companion.defaultApiEndpoint(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateClient(VKOkHttpProvider vKOkHttpProvider) {
        vKOkHttpProvider.updateClient(new VKOkHttpProvider.BuilderUpdateFunction() { // from class: com.vk.api.sdk.okhttp.OkHttpExecutor.updateClient.1
            @Override // com.vk.api.sdk.VKOkHttpProvider.BuilderUpdateFunction
            public t update(t builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                if (Logger.LogLevel.NONE != OkHttpExecutor.this.getConfig().getLogger().getLogLevel().getValue()) {
                    OkHttpExecutor okHttpExecutor = OkHttpExecutor.this;
                    LoggingInterceptor interceptor = okHttpExecutor.createLoggingInterceptor(okHttpExecutor.getConfig().getLogFilterCredentials(), OkHttpExecutor.this.getConfig().getLogger(), OkHttpExecutor.this.getConfig().getLoggingPrefixer());
                    builder.getClass();
                    Intrinsics.checkNotNullParameter(interceptor, "interceptor");
                    builder.f46452c.add(interceptor);
                }
                return builder;
            }
        });
    }

    private final q updateWith(q qVar, Map<String, ? extends HttpMultipartEntry> map) throws UnsupportedEncodingException {
        for (Map.Entry<String, ? extends HttpMultipartEntry> entry : map.entrySet()) {
            String name = entry.getKey();
            HttpMultipartEntry value = entry.getValue();
            if (value instanceof HttpMultipartEntry.Text) {
                String value2 = ((HttpMultipartEntry.Text) value).getTextValue();
                qVar.getClass();
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(value2, "value");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(value2, "value");
                b0.Companion.getClass();
                r part = com.google.android.gms.internal.auth.g.d(name, null, zk.a0.a(value2, null));
                Intrinsics.checkNotNullParameter(part, "part");
                qVar.f46439c.add(part);
            } else if (value instanceof HttpMultipartEntry.File) {
                HttpMultipartEntry.File file = (HttpMultipartEntry.File) value;
                FileFullRequestBody body = new FileFullRequestBody(this.context, file.getFileUri());
                String fileName = file.getFileName();
                if (fileName == null) {
                    fileName = "";
                }
                String strConvertFileNameToSafeValue = convertFileNameToSafeValue(fileName);
                qVar.getClass();
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(body, "body");
                r part2 = com.google.android.gms.internal.auth.g.d(name, strConvertFileNameToSafeValue, body);
                Intrinsics.checkNotNullParameter(part2, "part");
                qVar.f46439c.add(part2);
            }
        }
        return qVar;
    }

    public final void checkAccessTokenIsIgnored(String method, String str) throws IgnoredAccessTokenException {
        Intrinsics.checkNotNullParameter(method, "method");
        if (this.ignoredAccessToken != null && str != null && str.equals(this.ignoredAccessToken)) {
            throw new IgnoredAccessTokenException(method);
        }
    }

    public void checkNonSecretMethodCall(OkHttpMethodCall call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public LoggingInterceptor createLoggingInterceptor(boolean z5, Logger logger, LoggingPrefixer loggingPrefixer) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(loggingPrefixer, "loggingPrefixer");
        return new LoggingInterceptor(z5, logger, loggingPrefixer);
    }

    public MethodResponse execute(OkHttpMethodCall call) throws VKApiExecutionException {
        Intrinsics.checkNotNullParameter(call, "call");
        String actualAccessToken = getActualAccessToken(call);
        checkAccessTokenIsIgnored(call.getMethod(), actualAccessToken);
        String actualSecret = getActualSecret(call);
        checkNonSecretMethodCall(call);
        String strBuildSignedQueryStringForMethod = QueryStringGenerator.INSTANCE.buildSignedQueryStringForMethod(call.getMethod(), call.getArgs(), call.getVersion(), actualAccessToken, actualSecret, this.config.getAppId());
        zk.a0 a0Var = b0.Companion;
        String strValidateQueryString = validateQueryString(call, strBuildSignedQueryStringForMethod);
        Pattern pattern = p.f46432d;
        p pVarL = a.a.l(MIME_APPLICATION);
        a0Var.getClass();
        z body = zk.a0.a(strValidateQueryString, pVarL);
        String requestUrl = call.getRequestUrl();
        if (requestUrl == null) {
            requestUrl = getHost();
        }
        w wVar = new w();
        Intrinsics.checkNotNullParameter(body, "body");
        wVar.c("POST", body);
        wVar.f(resolveEndpoint(requestUrl) + '/' + call.getMethod());
        c cacheControl = c.f46318n;
        Intrinsics.checkNotNullParameter(cacheControl, "cacheControl");
        String string = cacheControl.toString();
        if (string.length() == 0) {
            wVar.d("Cache-Control");
        } else {
            wVar.b("Cache-Control", string);
        }
        RequestTag tag = call.getTag();
        wVar.e(tag == null ? null : tag.toMap(), Map.class);
        Object customTag = call.getCustomTag();
        if (customTag != null) {
            wVar.e(customTag, customTag.getClass());
        }
        x xVarA = wVar.a();
        String accessToken = getAccessToken();
        d0 d0VarExecuteRequest = executeRequest(xVarA);
        return new MethodResponse(readResponse(d0VarExecuteRequest), d0VarExecuteRequest.f46351g, accessToken);
    }

    public final d0 executeRequest(x request) {
        Intrinsics.checkNotNullParameter(request, "request");
        u client = getOkHttpProvider().getClient();
        client.getClass();
        Intrinsics.checkNotNullParameter(request, "request");
        return new dl.g(client, request).c();
    }

    public final String getAccessToken() {
        return ((VKApiCredentials) this.credentialsProvider.getValue()).getAccessToken();
    }

    public String getActualAccessToken(OkHttpMethodCall call) {
        Intrinsics.checkNotNullParameter(call, "call");
        return getAccessToken();
    }

    public String getActualSecret(OkHttpMethodCall call) {
        Intrinsics.checkNotNullParameter(call, "call");
        return getSecret();
    }

    public final OkHttpExecutorConfig getConfig() {
        return this.config;
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getHost() {
        return (String) this.config.getHostProvider().invoke();
    }

    public final String getIgnoredAccessToken() {
        return this.ignoredAccessToken;
    }

    public final String getSecret() {
        return ((VKApiCredentials) this.credentialsProvider.getValue()).getSecret();
    }

    public final void ignoreAccessToken(String str) {
        this.ignoredAccessToken = str;
    }

    public w makePostCallRequestBuilder(OkHttpPostCall call, b0 body) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(body, "requestBody");
        w wVar = new w();
        Intrinsics.checkNotNullParameter(body, "body");
        wVar.c("POST", body);
        wVar.f(call.getUrl());
        c cacheControl = c.f46318n;
        Intrinsics.checkNotNullParameter(cacheControl, "cacheControl");
        String string = cacheControl.toString();
        if (string.length() == 0) {
            wVar.d("Cache-Control");
            return wVar;
        }
        wVar.b("Cache-Control", string);
        return wVar;
    }

    public final String readResponse(d0 response) throws VKInternalServerErrorException, IOException, VKLargeEntityException {
        Charset charsetA;
        String str;
        Intrinsics.checkNotNullParameter(response, "response");
        int i = response.f46349e;
        if (i == 413) {
            throw new VKLargeEntityException(response.f46348d);
        }
        f0 f0Var = response.f46352h;
        if (f0Var == null) {
            str = null;
        } else {
            try {
                i iVarH = f0Var.h();
                try {
                    p pVarD = f0Var.d();
                    if (pVarD == null || (charsetA = pVarD.a(Charsets.UTF_8)) == null) {
                        charsetA = Charsets.UTF_8;
                    }
                    String strU = iVarH.u(b.q(iVarH, charsetA));
                    iVarH.close();
                    f0Var.close();
                    str = strU;
                } finally {
                }
            } finally {
            }
        }
        if (500 > i || i > 599) {
            return str;
        }
        if (str == null) {
            str = "null";
        }
        throw new VKInternalServerErrorException(i, str);
    }

    public final void setCredentials(String accessToken, String str) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        this.credentialsProvider = VKApiCredentials.Companion.lazyFrom(accessToken, str);
    }

    public final void setCredentials$core_release(g credentialsProvider) {
        Intrinsics.checkNotNullParameter(credentialsProvider, "credentialsProvider");
        this.credentialsProvider = credentialsProvider;
    }

    public final String validateQueryString(OkHttpMethodCall call, String paramsString) throws VKApiExecutionException {
        List<String> queryParameters;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(paramsString, "paramsString");
        if (a0.n(call.getMethod(), "execute.", false)) {
            Uri uri = Uri.parse(Intrinsics.f(paramsString, "https://vk.com/?"));
            if (uri.getQueryParameters(Request.JsonKeys.METHOD).contains("execute") && (queryParameters = uri.getQueryParameters("code")) != null && !queryParameters.isEmpty()) {
                throw new VKApiExecutionException(15, call.getMethod(), false, "Hey dude don't execute your hacky code ;)", null, null, null, null, 0, 496, null);
            }
        }
        return paramsString;
    }

    public final String execute(OkHttpPostCall call, VKApiProgressListener vKApiProgressListener) throws UnsupportedEncodingException {
        b0 b0VarA;
        Intrinsics.checkNotNullParameter(call, "call");
        if (call.isMultipart()) {
            q qVar = new q();
            p type = s.f46443f;
            Intrinsics.checkNotNullParameter(type, "type");
            if (!Intrinsics.a(type.f46435b, "multipart")) {
                throw new IllegalArgumentException(("multipart != " + type).toString());
            }
            qVar.f46438b = type;
            q qVarUpdateWith = updateWith(qVar, call.getParts());
            ArrayList arrayList = qVarUpdateWith.f46439c;
            if (!arrayList.isEmpty()) {
                b0VarA = new s(qVarUpdateWith.f46437a, qVarUpdateWith.f46438b, b.v(arrayList));
            } else {
                throw new IllegalStateException("Multipart body must have at least one part.");
            }
        } else {
            Map<String, HttpMultipartEntry> parts = call.getParts();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, HttpMultipartEntry> entry : parts.entrySet()) {
                if (entry.getValue() instanceof HttpMultipartEntry.Text) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                arrayList2.add(((String) entry2.getKey()) + '=' + ((Object) URLEncoder.encode(((HttpMultipartEntry.Text) entry2.getValue()).getTextValue(), UTF_8)));
            }
            String strI = CollectionsKt.I(arrayList2, "&", null, null, null, 62);
            zk.a0 a0Var = b0.Companion;
            Pattern pattern = p.f46432d;
            p pVarH = a.a.h(MIME_APPLICATION);
            a0Var.getClass();
            b0VarA = zk.a0.a(strI, pVarH);
        }
        return readResponse(executeRequest(makePostCallRequestBuilder(call, new ProgressRequestBody(b0VarA, vKApiProgressListener)).a()));
    }
}
