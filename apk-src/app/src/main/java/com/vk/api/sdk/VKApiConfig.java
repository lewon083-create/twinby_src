package com.vk.api.sdk;

import a0.u;
import android.content.Context;
import com.vk.api.sdk.VKOkHttpProvider;
import com.vk.api.sdk.auth.VKAccessTokenProvider;
import com.vk.api.sdk.okhttp.DefaultLoggingPrefixer;
import com.vk.api.sdk.okhttp.LoggingPrefixer;
import com.vk.api.sdk.utils.ApiMethodPriorityBackoff;
import com.vk.api.sdk.utils.log.DefaultApiLogger;
import com.vk.api.sdk.utils.log.Logger;
import ij.g;
import ij.h;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.r;
import l7.o;

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
public final class VKApiConfig {
    public static final Companion Companion = new Companion(null);
    public static final String DEFAULT_API_DOMAIN = "api.vk.com";
    public static final String DEFAULT_API_ENDPOINT = "https://api.vk.com/method";
    public static final String DEFAULT_API_VERSION = "5.131";
    public static final String DEFAULT_DOMAIN = "vk.com";
    public static final String DEFAULT_LANGUAGE = "en";
    public static final String DEFAULT_OAUTH_DOMAIN = "oauth.vk.com";
    public static final String DEFAULT_STATIC_DOMAIN = "static.vk.com";
    private final g accessToken;
    private final g anonymousTokenProvider;
    private final VKApiCallListener apiCallListener;
    private final ApiMethodPriorityBackoff apiMethodPriorityBackoff;
    private final int appId;
    private final int callsPerSecondLimit;
    private final String clientSecret;
    private final Context context;
    private final g customApiEndpoint;
    private final g debugCycleCalls;
    private final g deviceId;
    private final g externalDeviceId;
    private final Function0<String> httpApiHostProvider;
    private final VKKeyValueStorage keyValueStorage;
    private final Function0<String> langProvider;
    private final boolean logFilterCredentials;
    private final Logger logger;
    private final LoggingPrefixer loggingPrefixer;
    private final VKOkHttpProvider okHttpProvider;
    private final long rateLimitBackoffTimeoutMs;
    private final g responseValidator;
    private final g secret;
    private final VKApiValidationHandler validationHandler;
    private final String version;

    /* JADX INFO: renamed from: com.vk.api.sdk.VKApiConfig$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AnonymousClass1 extends r implements Function0<String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "";
        }
    }

    /* JADX INFO: renamed from: com.vk.api.sdk.VKApiConfig$10, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AnonymousClass10 extends r implements Function0 {
        public static final AnonymousClass10 INSTANCE = new AnonymousClass10();

        public AnonymousClass10() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Void invoke() {
            return null;
        }
    }

    /* JADX INFO: renamed from: com.vk.api.sdk.VKApiConfig$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AnonymousClass2 extends r implements Function0<Logger.LogLevel> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Logger.LogLevel invoke() {
            return Logger.LogLevel.NONE;
        }
    }

    /* JADX INFO: renamed from: com.vk.api.sdk.VKApiConfig$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AnonymousClass3 extends r implements Function0<String> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "";
        }
    }

    /* JADX INFO: renamed from: com.vk.api.sdk.VKApiConfig$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AnonymousClass4 extends r implements Function0 {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        public AnonymousClass4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Void invoke() {
            return null;
        }
    }

    /* JADX INFO: renamed from: com.vk.api.sdk.VKApiConfig$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AnonymousClass5 extends r implements Function0<Boolean> {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        public AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: com.vk.api.sdk.VKApiConfig$6, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AnonymousClass6 extends r implements Function0<String> {
        public static final AnonymousClass6 INSTANCE = new AnonymousClass6();

        public AnonymousClass6() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return VKApiConfig.DEFAULT_API_DOMAIN;
        }
    }

    /* JADX INFO: renamed from: com.vk.api.sdk.VKApiConfig$7, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AnonymousClass7 extends r implements Function0<String> {
        public static final AnonymousClass7 INSTANCE = new AnonymousClass7();

        public AnonymousClass7() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return VKApiConfig.DEFAULT_LANGUAGE;
        }
    }

    /* JADX INFO: renamed from: com.vk.api.sdk.VKApiConfig$8, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AnonymousClass8 extends r implements Function0<String> {
        public static final AnonymousClass8 INSTANCE = new AnonymousClass8();

        public AnonymousClass8() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return VKApiConfig.DEFAULT_API_ENDPOINT;
        }
    }

    /* JADX INFO: renamed from: com.vk.api.sdk.VKApiConfig$9, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AnonymousClass9 extends r implements Function0 {
        public static final AnonymousClass9 INSTANCE = new AnonymousClass9();

        public AnonymousClass9() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Void invoke() {
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class Builder {
        private VKApiConfig config;

        public Builder(VKApiConfig config) {
            Intrinsics.checkNotNullParameter(config, "config");
            this.config = config;
        }

        public final VKApiConfig build() {
            return this.config;
        }

        public final Builder setAccessToken(String accessToken) {
            Intrinsics.checkNotNullParameter(accessToken, "accessToken");
            this.config = VKApiConfig.copy$default(this.config, null, 0, null, null, null, null, null, null, null, h.b(new VKApiConfig$Builder$setAccessToken$1$1(accessToken)), null, null, false, null, 0, null, null, null, null, 0L, null, null, null, null, 16776703, null);
            return this;
        }

        public final Builder setAnonymousTokenProvider(VKAccessTokenProvider vKAccessTokenProvider) {
            this.config = VKApiConfig.copy$default(this.config, null, 0, null, null, null, null, null, null, null, null, null, null, false, null, 0, null, null, null, null, 0L, null, null, h.b(new VKApiConfig$Builder$setAnonymousTokenProvider$1$1(vKAccessTokenProvider)), null, 12582911, null);
            return this;
        }

        public final Builder setApiVersion(String version) {
            Intrinsics.checkNotNullParameter(version, "version");
            this.config = VKApiConfig.copy$default(this.config, null, 0, null, null, null, version, null, null, null, null, null, null, false, null, 0, null, null, null, null, 0L, null, null, null, null, 16777183, null);
            return this;
        }

        public final Builder setAppId(int i) {
            this.config = VKApiConfig.copy$default(this.config, null, i, null, null, null, null, null, null, null, null, null, null, false, null, 0, null, null, null, null, 0L, null, null, null, null, 16777213, null);
            return this;
        }

        public final Builder setCallsPerSecondLimit(int i) {
            this.config = VKApiConfig.copy$default(this.config, null, 0, null, null, null, null, null, null, null, null, null, null, false, null, i, null, null, null, null, 0L, null, null, null, null, 16760831, null);
            return this;
        }

        public final Builder setClientSecret(String clientSecret) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            this.config = VKApiConfig.copy$default(this.config, null, 0, null, null, null, null, null, null, null, null, null, clientSecret, false, null, 0, null, null, null, null, 0L, null, null, null, null, 16775167, null);
            return this;
        }

        public final Builder setCustomApiEndpoint(String endpoint) {
            Intrinsics.checkNotNullParameter(endpoint, "endpoint");
            this.config = VKApiConfig.copy$default(this.config, null, 0, null, null, null, null, null, null, null, null, null, null, false, null, 0, null, null, null, h.b(new VKApiConfig$Builder$setCustomApiEndpoint$1$1(endpoint)), 0L, null, null, null, null, 16515071, null);
            return this;
        }

        public final Builder setCustomValueStorage(VKKeyValueStorage storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            this.config = VKApiConfig.copy$default(this.config, null, 0, null, null, null, null, null, null, null, null, null, null, false, null, 0, null, null, storage, null, 0L, null, null, null, null, 16646143, null);
            return this;
        }

        public final Builder setDebugCycleCalls(boolean z5) {
            this.config = VKApiConfig.copy$default(this.config, null, 0, null, null, null, null, null, null, null, null, null, null, false, h.b(new VKApiConfig$Builder$setDebugCycleCalls$1$1(z5)), 0, null, null, null, null, 0L, null, null, null, null, 16769023, null);
            return this;
        }

        public final Builder setDeviceID(String deviceId) {
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            this.config = VKApiConfig.copy$default(this.config, null, 0, null, null, h.b(new VKApiConfig$Builder$setDeviceID$1$1(deviceId)), null, null, null, null, null, null, null, false, null, 0, null, null, null, null, 0L, null, null, null, null, 16777199, null);
            return this;
        }

        public final Builder setExternalDeviceID(String str) {
            this.config = VKApiConfig.copy$default(this.config, null, 0, null, null, null, null, null, null, null, null, null, null, false, null, 0, null, null, null, null, 0L, null, h.b(new VKApiConfig$Builder$setExternalDeviceID$1$1(str)), null, null, 14680063, null);
            return this;
        }

        public final Builder setHttpApiHostProvider(Function0<String> hostProvider) {
            Intrinsics.checkNotNullParameter(hostProvider, "hostProvider");
            this.config = VKApiConfig.copy$default(this.config, null, 0, null, null, null, null, null, null, null, null, null, null, false, null, 0, hostProvider, null, null, null, 0L, null, null, null, null, 16744447, null);
            return this;
        }

        public final Builder setLangProvider(Function0<String> langProvider) {
            Intrinsics.checkNotNullParameter(langProvider, "langProvider");
            this.config = VKApiConfig.copy$default(this.config, null, 0, null, null, null, null, null, null, null, null, null, null, false, null, 0, null, langProvider, null, null, 0L, null, null, null, null, 16711679, null);
            return this;
        }

        public final Builder setLogFilterCredentials(boolean z5) {
            this.config = VKApiConfig.copy$default(this.config, null, 0, null, null, null, null, null, null, null, null, null, null, z5, null, 0, null, null, null, null, 0L, null, null, null, null, 16773119, null);
            return this;
        }

        public final Builder setLogger(Logger logger) {
            Intrinsics.checkNotNullParameter(logger, "logger");
            this.config = VKApiConfig.copy$default(this.config, null, 0, null, null, null, null, null, logger, null, null, null, null, false, null, 0, null, null, null, null, 0L, null, null, null, null, 16777087, null);
            return this;
        }

        public final Builder setOkHttpProvider(VKOkHttpProvider okHttpProvider) {
            Intrinsics.checkNotNullParameter(okHttpProvider, "okHttpProvider");
            this.config = VKApiConfig.copy$default(this.config, null, 0, null, null, null, null, okHttpProvider, null, null, null, null, null, false, null, 0, null, null, null, null, 0L, null, null, null, null, 16777151, null);
            return this;
        }

        public final Builder setRateLimitBackoff(long j10) {
            this.config = VKApiConfig.copy$default(this.config, null, 0, null, null, null, null, null, null, null, null, null, null, false, null, 0, null, null, null, null, j10, null, null, null, null, 16252927, null);
            return this;
        }

        public final Builder setValidationHandler(VKApiValidationHandler vKApiValidationHandler) {
            this.config = VKApiConfig.copy$default(this.config, null, 0, vKApiValidationHandler, null, null, null, null, null, null, null, null, null, false, null, 0, null, null, null, null, 0L, null, null, null, null, 16777211, null);
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public VKApiConfig(Context context, int i, VKApiValidationHandler vKApiValidationHandler, VKApiCallListener vKApiCallListener, g deviceId, String version, VKOkHttpProvider okHttpProvider, Logger logger, LoggingPrefixer loggingPrefixer, g accessToken, g secret, String clientSecret, boolean z5, g debugCycleCalls, int i10, Function0<String> httpApiHostProvider, Function0<String> langProvider, VKKeyValueStorage keyValueStorage, g customApiEndpoint, long j10, ApiMethodPriorityBackoff apiMethodPriorityBackoff, g externalDeviceId, g anonymousTokenProvider, g gVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(okHttpProvider, "okHttpProvider");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(loggingPrefixer, "loggingPrefixer");
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(secret, "secret");
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(debugCycleCalls, "debugCycleCalls");
        Intrinsics.checkNotNullParameter(httpApiHostProvider, "httpApiHostProvider");
        Intrinsics.checkNotNullParameter(langProvider, "langProvider");
        Intrinsics.checkNotNullParameter(keyValueStorage, "keyValueStorage");
        Intrinsics.checkNotNullParameter(customApiEndpoint, "customApiEndpoint");
        Intrinsics.checkNotNullParameter(apiMethodPriorityBackoff, "apiMethodPriorityBackoff");
        Intrinsics.checkNotNullParameter(externalDeviceId, "externalDeviceId");
        Intrinsics.checkNotNullParameter(anonymousTokenProvider, "anonymousTokenProvider");
        this.context = context;
        this.appId = i;
        this.validationHandler = vKApiValidationHandler;
        this.apiCallListener = vKApiCallListener;
        this.deviceId = deviceId;
        this.version = version;
        this.okHttpProvider = okHttpProvider;
        this.logger = logger;
        this.loggingPrefixer = loggingPrefixer;
        this.accessToken = accessToken;
        this.secret = secret;
        this.clientSecret = clientSecret;
        this.logFilterCredentials = z5;
        this.debugCycleCalls = debugCycleCalls;
        this.callsPerSecondLimit = i10;
        this.httpApiHostProvider = httpApiHostProvider;
        this.langProvider = langProvider;
        this.keyValueStorage = keyValueStorage;
        this.customApiEndpoint = customApiEndpoint;
        this.rateLimitBackoffTimeoutMs = j10;
        this.apiMethodPriorityBackoff = apiMethodPriorityBackoff;
        this.externalDeviceId = externalDeviceId;
        this.anonymousTokenProvider = anonymousTokenProvider;
        this.responseValidator = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VKApiConfig copy$default(VKApiConfig vKApiConfig, Context context, int i, VKApiValidationHandler vKApiValidationHandler, VKApiCallListener vKApiCallListener, g gVar, String str, VKOkHttpProvider vKOkHttpProvider, Logger logger, LoggingPrefixer loggingPrefixer, g gVar2, g gVar3, String str2, boolean z5, g gVar4, int i10, Function0 function0, Function0 function02, VKKeyValueStorage vKKeyValueStorage, g gVar5, long j10, ApiMethodPriorityBackoff apiMethodPriorityBackoff, g gVar6, g gVar7, g gVar8, int i11, Object obj) {
        g gVar9;
        g gVar10;
        Context context2 = (i11 & 1) != 0 ? vKApiConfig.context : context;
        int i12 = (i11 & 2) != 0 ? vKApiConfig.appId : i;
        VKApiValidationHandler vKApiValidationHandler2 = (i11 & 4) != 0 ? vKApiConfig.validationHandler : vKApiValidationHandler;
        VKApiCallListener vKApiCallListener2 = (i11 & 8) != 0 ? vKApiConfig.apiCallListener : vKApiCallListener;
        g gVar11 = (i11 & 16) != 0 ? vKApiConfig.deviceId : gVar;
        String str3 = (i11 & 32) != 0 ? vKApiConfig.version : str;
        VKOkHttpProvider vKOkHttpProvider2 = (i11 & 64) != 0 ? vKApiConfig.okHttpProvider : vKOkHttpProvider;
        Logger logger2 = (i11 & 128) != 0 ? vKApiConfig.logger : logger;
        LoggingPrefixer loggingPrefixer2 = (i11 & 256) != 0 ? vKApiConfig.loggingPrefixer : loggingPrefixer;
        g gVar12 = (i11 & 512) != 0 ? vKApiConfig.accessToken : gVar2;
        g gVar13 = (i11 & 1024) != 0 ? vKApiConfig.secret : gVar3;
        String str4 = (i11 & 2048) != 0 ? vKApiConfig.clientSecret : str2;
        boolean z10 = (i11 & 4096) != 0 ? vKApiConfig.logFilterCredentials : z5;
        g gVar14 = (i11 & 8192) != 0 ? vKApiConfig.debugCycleCalls : gVar4;
        Context context3 = context2;
        int i13 = (i11 & 16384) != 0 ? vKApiConfig.callsPerSecondLimit : i10;
        Function0 function03 = (i11 & 32768) != 0 ? vKApiConfig.httpApiHostProvider : function0;
        Function0 function04 = (i11 & 65536) != 0 ? vKApiConfig.langProvider : function02;
        VKKeyValueStorage vKKeyValueStorage2 = (i11 & 131072) != 0 ? vKApiConfig.keyValueStorage : vKKeyValueStorage;
        g gVar15 = (i11 & 262144) != 0 ? vKApiConfig.customApiEndpoint : gVar5;
        int i14 = i13;
        long j11 = (i11 & 524288) != 0 ? vKApiConfig.rateLimitBackoffTimeoutMs : j10;
        ApiMethodPriorityBackoff apiMethodPriorityBackoff2 = (i11 & 1048576) != 0 ? vKApiConfig.apiMethodPriorityBackoff : apiMethodPriorityBackoff;
        g gVar16 = (i11 & 2097152) != 0 ? vKApiConfig.externalDeviceId : gVar6;
        ApiMethodPriorityBackoff apiMethodPriorityBackoff3 = apiMethodPriorityBackoff2;
        g gVar17 = (i11 & 4194304) != 0 ? vKApiConfig.anonymousTokenProvider : gVar7;
        if ((i11 & 8388608) != 0) {
            gVar10 = gVar17;
            gVar9 = vKApiConfig.responseValidator;
        } else {
            gVar9 = gVar8;
            gVar10 = gVar17;
        }
        return vKApiConfig.copy(context3, i12, vKApiValidationHandler2, vKApiCallListener2, gVar11, str3, vKOkHttpProvider2, logger2, loggingPrefixer2, gVar12, gVar13, str4, z10, gVar14, i14, function03, function04, vKKeyValueStorage2, gVar15, j11, apiMethodPriorityBackoff3, gVar16, gVar10, gVar9);
    }

    public final Builder buildUpon() {
        return new Builder(this);
    }

    public final Builder builder(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new Builder(new VKApiConfig(context, 0, new VKDefaultValidationHandler(context), null, null, null, null, null, null, null, null, null, false, null, 0, null, null, null, null, 0L, null, null, null, null, 16777210, null));
    }

    public final Context component1() {
        return this.context;
    }

    public final g component10$core_release() {
        return this.accessToken;
    }

    public final g component11$core_release() {
        return this.secret;
    }

    public final String component12() {
        return this.clientSecret;
    }

    public final boolean component13() {
        return this.logFilterCredentials;
    }

    public final g component14() {
        return this.debugCycleCalls;
    }

    public final int component15() {
        return this.callsPerSecondLimit;
    }

    public final Function0<String> component16() {
        return this.httpApiHostProvider;
    }

    public final Function0<String> component17() {
        return this.langProvider;
    }

    public final VKKeyValueStorage component18() {
        return this.keyValueStorage;
    }

    public final g component19() {
        return this.customApiEndpoint;
    }

    public final int component2() {
        return this.appId;
    }

    public final long component20() {
        return this.rateLimitBackoffTimeoutMs;
    }

    public final ApiMethodPriorityBackoff component21() {
        return this.apiMethodPriorityBackoff;
    }

    public final g component22() {
        return this.externalDeviceId;
    }

    public final g component23() {
        return this.anonymousTokenProvider;
    }

    public final g component24() {
        return this.responseValidator;
    }

    public final VKApiValidationHandler component3() {
        return this.validationHandler;
    }

    public final VKApiCallListener component4() {
        return this.apiCallListener;
    }

    public final g component5() {
        return this.deviceId;
    }

    public final String component6() {
        return this.version;
    }

    public final VKOkHttpProvider component7() {
        return this.okHttpProvider;
    }

    public final Logger component8() {
        return this.logger;
    }

    public final LoggingPrefixer component9() {
        return this.loggingPrefixer;
    }

    public final VKApiConfig copy(Context context, int i, VKApiValidationHandler vKApiValidationHandler, VKApiCallListener vKApiCallListener, g deviceId, String version, VKOkHttpProvider okHttpProvider, Logger logger, LoggingPrefixer loggingPrefixer, g accessToken, g secret, String clientSecret, boolean z5, g debugCycleCalls, int i10, Function0<String> httpApiHostProvider, Function0<String> langProvider, VKKeyValueStorage keyValueStorage, g customApiEndpoint, long j10, ApiMethodPriorityBackoff apiMethodPriorityBackoff, g externalDeviceId, g anonymousTokenProvider, g gVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(okHttpProvider, "okHttpProvider");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(loggingPrefixer, "loggingPrefixer");
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(secret, "secret");
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(debugCycleCalls, "debugCycleCalls");
        Intrinsics.checkNotNullParameter(httpApiHostProvider, "httpApiHostProvider");
        Intrinsics.checkNotNullParameter(langProvider, "langProvider");
        Intrinsics.checkNotNullParameter(keyValueStorage, "keyValueStorage");
        Intrinsics.checkNotNullParameter(customApiEndpoint, "customApiEndpoint");
        Intrinsics.checkNotNullParameter(apiMethodPriorityBackoff, "apiMethodPriorityBackoff");
        Intrinsics.checkNotNullParameter(externalDeviceId, "externalDeviceId");
        Intrinsics.checkNotNullParameter(anonymousTokenProvider, "anonymousTokenProvider");
        return new VKApiConfig(context, i, vKApiValidationHandler, vKApiCallListener, deviceId, version, okHttpProvider, logger, loggingPrefixer, accessToken, secret, clientSecret, z5, debugCycleCalls, i10, httpApiHostProvider, langProvider, keyValueStorage, customApiEndpoint, j10, apiMethodPriorityBackoff, externalDeviceId, anonymousTokenProvider, gVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VKApiConfig)) {
            return false;
        }
        VKApiConfig vKApiConfig = (VKApiConfig) obj;
        return Intrinsics.a(this.context, vKApiConfig.context) && this.appId == vKApiConfig.appId && Intrinsics.a(this.validationHandler, vKApiConfig.validationHandler) && Intrinsics.a(this.apiCallListener, vKApiConfig.apiCallListener) && Intrinsics.a(this.deviceId, vKApiConfig.deviceId) && Intrinsics.a(this.version, vKApiConfig.version) && Intrinsics.a(this.okHttpProvider, vKApiConfig.okHttpProvider) && Intrinsics.a(this.logger, vKApiConfig.logger) && Intrinsics.a(this.loggingPrefixer, vKApiConfig.loggingPrefixer) && Intrinsics.a(this.accessToken, vKApiConfig.accessToken) && Intrinsics.a(this.secret, vKApiConfig.secret) && Intrinsics.a(this.clientSecret, vKApiConfig.clientSecret) && this.logFilterCredentials == vKApiConfig.logFilterCredentials && Intrinsics.a(this.debugCycleCalls, vKApiConfig.debugCycleCalls) && this.callsPerSecondLimit == vKApiConfig.callsPerSecondLimit && Intrinsics.a(this.httpApiHostProvider, vKApiConfig.httpApiHostProvider) && Intrinsics.a(this.langProvider, vKApiConfig.langProvider) && Intrinsics.a(this.keyValueStorage, vKApiConfig.keyValueStorage) && Intrinsics.a(this.customApiEndpoint, vKApiConfig.customApiEndpoint) && this.rateLimitBackoffTimeoutMs == vKApiConfig.rateLimitBackoffTimeoutMs && Intrinsics.a(this.apiMethodPriorityBackoff, vKApiConfig.apiMethodPriorityBackoff) && Intrinsics.a(this.externalDeviceId, vKApiConfig.externalDeviceId) && Intrinsics.a(this.anonymousTokenProvider, vKApiConfig.anonymousTokenProvider) && Intrinsics.a(this.responseValidator, vKApiConfig.responseValidator);
    }

    public final g getAccessToken$core_release() {
        return this.accessToken;
    }

    public final g getAnonymousTokenProvider() {
        return this.anonymousTokenProvider;
    }

    public final VKApiCallListener getApiCallListener() {
        return this.apiCallListener;
    }

    public final ApiMethodPriorityBackoff getApiMethodPriorityBackoff() {
        return this.apiMethodPriorityBackoff;
    }

    public final int getAppId() {
        return this.appId;
    }

    public final int getCallsPerSecondLimit() {
        return this.callsPerSecondLimit;
    }

    public final String getClientSecret() {
        return this.clientSecret;
    }

    public final Context getContext() {
        return this.context;
    }

    public final g getCustomApiEndpoint() {
        return this.customApiEndpoint;
    }

    public final g getDebugCycleCalls() {
        return this.debugCycleCalls;
    }

    public final g getDeviceId() {
        return this.deviceId;
    }

    public final g getExternalDeviceId() {
        return this.externalDeviceId;
    }

    public final Function0<String> getHttpApiHostProvider() {
        return this.httpApiHostProvider;
    }

    public final VKKeyValueStorage getKeyValueStorage() {
        return this.keyValueStorage;
    }

    public final String getLang() {
        return (String) this.langProvider.invoke();
    }

    public final Function0<String> getLangProvider() {
        return this.langProvider;
    }

    public final boolean getLogFilterCredentials() {
        return this.logFilterCredentials;
    }

    public final Logger getLogger() {
        return this.logger;
    }

    public final LoggingPrefixer getLoggingPrefixer() {
        return this.loggingPrefixer;
    }

    public final VKOkHttpProvider getOkHttpProvider() {
        return this.okHttpProvider;
    }

    public final long getRateLimitBackoffTimeoutMs() {
        return this.rateLimitBackoffTimeoutMs;
    }

    public final g getResponseValidator() {
        return this.responseValidator;
    }

    public final g getSecret$core_release() {
        return this.secret;
    }

    public final VKApiValidationHandler getValidationHandler() {
        return this.validationHandler;
    }

    public final String getVersion() {
        return this.version;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v24, types: [int] */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v49 */
    public int hashCode() {
        int iG = u.g(this.appId, this.context.hashCode() * 31, 31);
        VKApiValidationHandler vKApiValidationHandler = this.validationHandler;
        int iHashCode = (iG + (vKApiValidationHandler == null ? 0 : vKApiValidationHandler.hashCode())) * 31;
        VKApiCallListener vKApiCallListener = this.apiCallListener;
        int iE = gf.a.e((this.secret.hashCode() + ((this.accessToken.hashCode() + ((this.loggingPrefixer.hashCode() + ((this.logger.hashCode() + ((this.okHttpProvider.hashCode() + gf.a.e((this.deviceId.hashCode() + ((iHashCode + (vKApiCallListener == null ? 0 : vKApiCallListener.hashCode())) * 31)) * 31, 31, this.version)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.clientSecret);
        boolean z5 = this.logFilterCredentials;
        ?? r22 = z5;
        if (z5) {
            r22 = 1;
        }
        int iHashCode2 = (this.anonymousTokenProvider.hashCode() + ((this.externalDeviceId.hashCode() + ((this.apiMethodPriorityBackoff.hashCode() + o.d(this.rateLimitBackoffTimeoutMs, (this.customApiEndpoint.hashCode() + ((this.keyValueStorage.hashCode() + ((this.langProvider.hashCode() + ((this.httpApiHostProvider.hashCode() + u.g(this.callsPerSecondLimit, (this.debugCycleCalls.hashCode() + ((iE + r22) * 31)) * 31, 31)) * 31)) * 31)) * 31)) * 31, 31)) * 31)) * 31)) * 31;
        g gVar = this.responseValidator;
        return iHashCode2 + (gVar != null ? gVar.hashCode() : 0);
    }

    public String toString() {
        return "VKApiConfig(context=" + this.context + ", appId=" + this.appId + ", validationHandler=" + this.validationHandler + ", apiCallListener=" + this.apiCallListener + ", deviceId=" + this.deviceId + ", version=" + this.version + ", okHttpProvider=" + this.okHttpProvider + ", logger=" + this.logger + ", loggingPrefixer=" + this.loggingPrefixer + ", accessToken=" + this.accessToken + ", secret=" + this.secret + ", clientSecret=" + this.clientSecret + ", logFilterCredentials=" + this.logFilterCredentials + ", debugCycleCalls=" + this.debugCycleCalls + ", callsPerSecondLimit=" + this.callsPerSecondLimit + ", httpApiHostProvider=" + this.httpApiHostProvider + ", langProvider=" + this.langProvider + ", keyValueStorage=" + this.keyValueStorage + ", customApiEndpoint=" + this.customApiEndpoint + ", rateLimitBackoffTimeoutMs=" + this.rateLimitBackoffTimeoutMs + ", apiMethodPriorityBackoff=" + this.apiMethodPriorityBackoff + ", externalDeviceId=" + this.externalDeviceId + ", anonymousTokenProvider=" + this.anonymousTokenProvider + ", responseValidator=" + this.responseValidator + ')';
    }

    public /* synthetic */ VKApiConfig(Context context, int i, VKApiValidationHandler vKApiValidationHandler, VKApiCallListener vKApiCallListener, g gVar, String str, VKOkHttpProvider vKOkHttpProvider, Logger logger, LoggingPrefixer loggingPrefixer, g gVar2, g gVar3, String str2, boolean z5, g gVar4, int i10, Function0 function0, Function0 function02, VKKeyValueStorage vKKeyValueStorage, g gVar5, long j10, ApiMethodPriorityBackoff apiMethodPriorityBackoff, g gVar6, g gVar7, g gVar8, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        int i12;
        VKApiValidationHandler vKApiValidationHandler2;
        Context context2;
        VKKeyValueStorage vKPreferencesKeyValueStorage;
        VKKeyValueStorage vKKeyValueStorage2;
        g gVar9;
        long millis;
        int i13 = (i11 & 2) != 0 ? 0 : i;
        VKApiValidationHandler vKApiValidationHandler3 = (i11 & 4) != 0 ? null : vKApiValidationHandler;
        VKApiCallListener vKApiCallListener2 = (i11 & 8) != 0 ? null : vKApiCallListener;
        g gVarB = (i11 & 16) != 0 ? h.b(AnonymousClass1.INSTANCE) : gVar;
        String str3 = (i11 & 32) != 0 ? DEFAULT_API_VERSION : str;
        VKOkHttpProvider defaultProvider = (i11 & 64) != 0 ? new VKOkHttpProvider.DefaultProvider() : vKOkHttpProvider;
        Logger defaultApiLogger = (i11 & 128) != 0 ? new DefaultApiLogger(h.b(AnonymousClass2.INSTANCE), "VKSdkApi") : logger;
        LoggingPrefixer defaultLoggingPrefixer = (i11 & 256) != 0 ? new DefaultLoggingPrefixer() : loggingPrefixer;
        g gVarB2 = (i11 & 512) != 0 ? h.b(AnonymousClass3.INSTANCE) : gVar2;
        g gVarB3 = (i11 & 1024) != 0 ? h.b(AnonymousClass4.INSTANCE) : gVar3;
        String str4 = (i11 & 2048) != 0 ? "" : str2;
        boolean z10 = (i11 & 4096) != 0 ? true : z5;
        g gVarB4 = (i11 & 8192) != 0 ? h.b(AnonymousClass5.INSTANCE) : gVar4;
        int i14 = (i11 & 16384) != 0 ? 3 : i10;
        Function0 function03 = (i11 & 32768) != 0 ? AnonymousClass6.INSTANCE : function0;
        Function0 function04 = (i11 & 65536) != 0 ? AnonymousClass7.INSTANCE : function02;
        if ((i11 & 131072) != 0) {
            i12 = i13;
            vKApiValidationHandler2 = vKApiValidationHandler3;
            context2 = context;
            vKPreferencesKeyValueStorage = new VKPreferencesKeyValueStorage(context2, null, 2, null);
        } else {
            i12 = i13;
            vKApiValidationHandler2 = vKApiValidationHandler3;
            context2 = context;
            vKPreferencesKeyValueStorage = vKKeyValueStorage;
        }
        g gVarB5 = (i11 & 262144) != 0 ? h.b(AnonymousClass8.INSTANCE) : gVar5;
        if ((i11 & 524288) != 0) {
            vKKeyValueStorage2 = vKPreferencesKeyValueStorage;
            gVar9 = gVarB5;
            millis = TimeUnit.HOURS.toMillis(1L);
        } else {
            vKKeyValueStorage2 = vKPreferencesKeyValueStorage;
            gVar9 = gVarB5;
            millis = j10;
        }
        this(context2, i12, vKApiValidationHandler2, vKApiCallListener2, gVarB, str3, defaultProvider, defaultApiLogger, defaultLoggingPrefixer, gVarB2, gVarB3, str4, z10, gVarB4, i14, function03, function04, vKKeyValueStorage2, gVar9, millis, (i11 & 1048576) != 0 ? ApiMethodPriorityBackoff.Companion.getDEFAULT() : apiMethodPriorityBackoff, (i11 & 2097152) != 0 ? h.b(AnonymousClass9.INSTANCE) : gVar6, (i11 & 4194304) != 0 ? h.b(AnonymousClass10.INSTANCE) : gVar7, (i11 & 8388608) != 0 ? null : gVar8);
    }
}
