package com.vk.api.sdk.okhttp;

import com.vk.api.sdk.VKApiProgressListener;
import i0.o;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nl.g;
import nl.h;
import nl.k;
import nl.q;
import nl.v;
import zk.b0;
import zk.p;

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
public final class ProgressRequestBody extends b0 {
    public static final Companion Companion = new Companion(null);
    private static final long NOTIFY_INTERVAL = TimeUnit.MILLISECONDS.toMillis(160);
    private long lastNotifyTime;
    private final VKApiProgressListener progressListener;
    private final b0 requestBody;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public final class CountingSink extends k {
        private long bytesWritten;
        private long contentLength;
        final /* synthetic */ ProgressRequestBody this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CountingSink(ProgressRequestBody this$0, v delegate) {
            super(delegate);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.this$0 = this$0;
            this.contentLength = -1L;
        }

        @Override // nl.k, nl.v
        public void write(g source, long j10) {
            Intrinsics.checkNotNullParameter(source, "source");
            super.write(source, j10);
            this.bytesWritten += j10;
            if (this.contentLength < 0) {
                this.contentLength = this.this$0.contentLength();
            }
            long j11 = this.contentLength;
            if (j11 < 0) {
                this.this$0.notifyProgressSend(0L, 1L);
            } else {
                this.this$0.notifyProgressSend(this.bytesWritten, j11);
            }
        }
    }

    public ProgressRequestBody(b0 requestBody, VKApiProgressListener vKApiProgressListener) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        this.requestBody = requestBody;
        this.progressListener = vKApiProgressListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyProgressSend(long j10, long j11) {
        if (this.progressListener != null && System.currentTimeMillis() - this.lastNotifyTime >= NOTIFY_INTERVAL) {
            float f10 = j11;
            float f11 = 1000.0f / f10;
            this.progressListener.onProgress((int) (j10 * f11), (int) (f10 * f11));
            this.lastNotifyTime = System.currentTimeMillis();
        }
    }

    @Override // zk.b0
    public long contentLength() {
        return this.requestBody.contentLength();
    }

    @Override // zk.b0
    public p contentType() {
        return this.requestBody.contentType();
    }

    @Override // zk.b0
    public void writeTo(h sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        q qVarF = o.f(new CountingSink(this, sink));
        this.requestBody.writeTo(qVarF);
        qVarF.flush();
    }
}
