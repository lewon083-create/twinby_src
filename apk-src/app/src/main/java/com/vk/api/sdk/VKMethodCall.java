package com.vk.api.sdk;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
@Metadata
public class VKMethodCall {
    public static final Companion Companion = new Companion(null);
    public static final int DEFAULT_RETRY_COUNT = 4;
    private final boolean allowNoAuth;
    private final Map<String, String> args;
    private final int[] ignoreExecuteErrors;
    private final boolean isAnonymous;
    private final boolean isAwaitNetwork;
    private final String method;
    private final String requestUrl;
    private final int retryCount;
    private final boolean skipValidation;
    private final String version;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static class Builder {
        private boolean allowNoAuth;
        private int[] ignoreExecuteErrors;
        private boolean isAnonymous;
        private boolean isAwaitNetwork;
        private String requestUrl;
        private boolean skipValidation;
        private String method = "";
        private String version = "";
        private Map<String, String> args = new LinkedHashMap();
        private int retryCount = 4;

        public Builder allowNoAuth(boolean z5) {
            this.allowNoAuth = z5;
            return this;
        }

        public Builder args(Map<String, String> args) {
            Intrinsics.checkNotNullParameter(args, "args");
            getArgs().putAll(args);
            return this;
        }

        public Builder awaitNetwork(boolean z5) {
            this.isAwaitNetwork = z5;
            return this;
        }

        public VKMethodCall build() {
            return new VKMethodCall(this);
        }

        public final boolean getAllowNoAuth() {
            return this.allowNoAuth;
        }

        public final Map<String, String> getArgs() {
            return this.args;
        }

        public final int[] getIgnoreExecuteErrors() {
            return this.ignoreExecuteErrors;
        }

        public final String getMethod() {
            return this.method;
        }

        public final String getRequestUrl() {
            return this.requestUrl;
        }

        public final int getRetryCount() {
            return this.retryCount;
        }

        public final boolean getSkipValidation() {
            return this.skipValidation;
        }

        public final String getVersion() {
            return this.version;
        }

        public Builder ignoreExecuteErrors(int[] iArr) {
            this.ignoreExecuteErrors = iArr;
            return this;
        }

        public final boolean isAnonymous() {
            return this.isAnonymous;
        }

        public final boolean isAwaitNetwork() {
            return this.isAwaitNetwork;
        }

        public Builder method(String method) {
            Intrinsics.checkNotNullParameter(method, "method");
            this.method = method;
            return this;
        }

        public Builder retryCount(int i) {
            this.retryCount = i;
            return this;
        }

        public Builder setAnonymous(boolean z5) {
            this.isAnonymous = z5;
            return this;
        }

        public Builder skipValidation(boolean z5) {
            this.skipValidation = z5;
            return this;
        }

        public Builder url(String str) {
            this.requestUrl = str;
            return this;
        }

        public Builder version(String version) {
            Intrinsics.checkNotNullParameter(version, "version");
            this.version = version;
            return this;
        }

        public Builder args(String key, String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            getArgs().put(key, value);
            return this;
        }

        public Builder args(String key, boolean z5) {
            Intrinsics.checkNotNullParameter(key, "key");
            getArgs().put(key, z5 ? "1" : CommonUrlParts.Values.FALSE_INTEGER);
            return this;
        }

        public Builder args(String key, Object value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            getArgs().put(key, value.toString());
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

    public VKMethodCall(Builder b2) {
        Intrinsics.checkNotNullParameter(b2, "b");
        if (StringsKt.D(b2.getMethod())) {
            throw new IllegalArgumentException("method is null or empty");
        }
        if (StringsKt.D(b2.getVersion())) {
            throw new IllegalArgumentException("version is null or empty");
        }
        this.requestUrl = b2.getRequestUrl();
        this.method = b2.getMethod();
        this.version = b2.getVersion();
        this.args = b2.getArgs();
        this.retryCount = b2.getRetryCount();
        this.skipValidation = b2.getSkipValidation();
        this.isAwaitNetwork = b2.isAwaitNetwork();
        this.ignoreExecuteErrors = b2.getIgnoreExecuteErrors();
        this.allowNoAuth = b2.getAllowNoAuth();
        this.isAnonymous = b2.isAnonymous();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj == null ? null : obj.getClass())) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.vk.api.sdk.VKMethodCall");
        }
        VKMethodCall vKMethodCall = (VKMethodCall) obj;
        return Intrinsics.a(this.method, vKMethodCall.method) && Intrinsics.a(this.args, vKMethodCall.args);
    }

    public final boolean getAllowNoAuth() {
        return this.allowNoAuth;
    }

    public final Map<String, String> getArgs() {
        return this.args;
    }

    public final int[] getIgnoreExecuteErrors() {
        return this.ignoreExecuteErrors;
    }

    public final String getMethod() {
        return this.method;
    }

    public final String getRequestUrl() {
        return this.requestUrl;
    }

    public final int getRetryCount() {
        return this.retryCount;
    }

    public final boolean getSkipValidation() {
        return this.skipValidation;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.args.hashCode() + (this.method.hashCode() * 31);
    }

    public final boolean isAnonymous() {
        return this.isAnonymous;
    }

    public final boolean isAwaitNetwork() {
        return this.isAwaitNetwork;
    }

    public String toString() {
        return "VKMethodCall(method='" + this.method + "', args=" + this.args + ')';
    }
}
