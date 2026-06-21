package com.vk.api.sdk.okhttp;

import com.vk.api.sdk.VKMethodCall;
import java.util.HashMap;
import java.util.Map;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
@Metadata
public class OkHttpMethodCall {
    private final boolean allowNoAuth;
    private final Map<String, String> args;
    private final Object customTag;
    private final String method;
    private final String requestUrl;
    private final int retryCount;
    private final RequestTag tag;
    private final String version;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static class Builder {
        private boolean allowNoAuth;
        private Object customTag;
        private String requestUrl;
        private RequestTag tag;
        private String method = "";
        private String version = "";
        private Map<String, String> args = new HashMap();
        private int retryCount = 4;

        public final Builder allowNoAuth(boolean z5) {
            this.allowNoAuth = z5;
            return this;
        }

        public Builder args(Map<String, String> args) {
            Intrinsics.checkNotNullParameter(args, "args");
            getArgs().putAll(args);
            return this;
        }

        public OkHttpMethodCall build() {
            return new OkHttpMethodCall(this);
        }

        public final Builder customTag(Object obj) {
            this.customTag = obj;
            return this;
        }

        public Builder from(VKMethodCall call) {
            Intrinsics.checkNotNullParameter(call, "call");
            method(call.getMethod());
            version(call.getVersion());
            args(call.getArgs());
            allowNoAuth(call.getAllowNoAuth());
            retryCount(call.getRetryCount());
            url(call.getRequestUrl());
            return this;
        }

        public final boolean getAllowNoAuth() {
            return this.allowNoAuth;
        }

        public final Map<String, String> getArgs() {
            return this.args;
        }

        public final Object getCustomTag() {
            return this.customTag;
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

        public final RequestTag getTag() {
            return this.tag;
        }

        public final String getVersion() {
            return this.version;
        }

        public Builder method(String method) {
            Intrinsics.checkNotNullParameter(method, "method");
            this.method = method;
            return this;
        }

        public final Builder retryCount(int i) {
            this.retryCount = i;
            return this;
        }

        public final Builder tag(RequestTag requestTag) {
            this.tag = requestTag;
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

        public final String args(String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return this.args.get(key);
        }
    }

    public OkHttpMethodCall(Builder b2) {
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
        this.tag = b2.getTag();
        this.customTag = b2.getCustomTag();
        this.allowNoAuth = b2.getAllowNoAuth();
        this.retryCount = b2.getRetryCount();
    }

    public final boolean getAllowNoAuth() {
        return this.allowNoAuth;
    }

    public final Map<String, String> getArgs() {
        return this.args;
    }

    public final Object getCustomTag() {
        return this.customTag;
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

    public final RequestTag getTag() {
        return this.tag;
    }

    public final String getVersion() {
        return this.version;
    }

    public final boolean isExtended() {
        return Intrinsics.a(this.args.get("extended"), "true") || Intrinsics.a(this.args.get("extended"), "1");
    }
}
