package com.vk.api.sdk;

import android.net.Uri;
import com.vk.api.sdk.internal.HttpMultipartEntry;
import java.util.HashMap;
import java.util.Iterator;
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
public class VKHttpPostCall {
    private final boolean isAwaitNetwork;
    private final boolean isMultipart;
    private final Map<String, HttpMultipartEntry> parts;
    private final int retryCount;
    private final long timeoutMs;
    private final String url;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static class Builder {
        private boolean isAwaitNetwork;
        private long timeoutMs;
        private String url = "";
        private boolean isMultipart = true;
        private Map<String, HttpMultipartEntry> parts = new HashMap();
        private int retryCount = Integer.MAX_VALUE;

        public Builder args(String key, String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            getParts().put(key, new HttpMultipartEntry.Text(value));
            return this;
        }

        public Builder awaitNetwork(boolean z5) {
            this.isAwaitNetwork = z5;
            return this;
        }

        public VKHttpPostCall build() {
            return new VKHttpPostCall(this);
        }

        public final Map<String, HttpMultipartEntry> getParts() {
            return this.parts;
        }

        public final int getRetryCount() {
            return this.retryCount;
        }

        public final long getTimeoutMs() {
            return this.timeoutMs;
        }

        public final String getUrl() {
            return this.url;
        }

        public final boolean isAwaitNetwork() {
            return this.isAwaitNetwork;
        }

        public final boolean isMultipart() {
            return this.isMultipart;
        }

        public Builder multipart(boolean z5) {
            this.isMultipart = z5;
            return this;
        }

        public Builder parts(Map<String, ? extends HttpMultipartEntry> parts) {
            Intrinsics.checkNotNullParameter(parts, "parts");
            getParts().putAll(parts);
            return this;
        }

        public Builder retryCount(int i) {
            this.retryCount = i;
            return this;
        }

        public Builder timeout(long j10) {
            this.timeoutMs = j10;
            return this;
        }

        public Builder url(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
            return this;
        }

        public Builder args(String key, Uri fileUri) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(fileUri, "fileUri");
            getParts().put(key, new HttpMultipartEntry.File(fileUri));
            return this;
        }

        public Builder args(String key, Uri fileUri, String fileName) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(fileUri, "fileUri");
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            getParts().put(key, new HttpMultipartEntry.File(fileUri, fileName));
            return this;
        }
    }

    public VKHttpPostCall(Builder b2) {
        Intrinsics.checkNotNullParameter(b2, "b");
        if (StringsKt.D(b2.getUrl())) {
            throw new IllegalArgumentException(Intrinsics.f(b2.getUrl(), "Illegal url value: "));
        }
        if (b2.getTimeoutMs() < 0) {
            throw new IllegalArgumentException(Intrinsics.f(Long.valueOf(b2.getTimeoutMs()), "Illegal timeout value: "));
        }
        if (!b2.isMultipart()) {
            Map<String, HttpMultipartEntry> parts = b2.getParts();
            if (!parts.isEmpty()) {
                Iterator<Map.Entry<String, HttpMultipartEntry>> it = parts.entrySet().iterator();
                while (it.hasNext()) {
                    if (!(it.next().getValue() instanceof HttpMultipartEntry.Text)) {
                        throw new IllegalStateException("Non multipart calls should consist of text arguments only");
                    }
                }
            }
        }
        this.url = b2.getUrl();
        this.isMultipart = b2.isMultipart();
        this.parts = b2.getParts();
        this.retryCount = b2.getRetryCount();
        this.timeoutMs = b2.getTimeoutMs();
        this.isAwaitNetwork = b2.isAwaitNetwork();
    }

    public final Map<String, HttpMultipartEntry> getParts() {
        return this.parts;
    }

    public final int getRetryCount() {
        return this.retryCount;
    }

    public final long getTimeoutMs() {
        return this.timeoutMs;
    }

    public final String getUrl() {
        return this.url;
    }

    public final boolean isAwaitNetwork() {
        return this.isAwaitNetwork;
    }

    public final boolean isMultipart() {
        return this.isMultipart;
    }
}
