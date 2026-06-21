package com.vk.api.sdk.utils;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

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
public class ExponentialBackoff {
    public static final Companion Companion = new Companion(null);
    private final float criticalFactor;
    private volatile long delayMs;
    private volatile int errorsCount;
    private final float factor;
    private final float jitter;
    private final long maxDelayMs;
    private final long minDelayMs;
    private final Random random;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ExponentialBackoff forNetworkWait() {
            return new ExponentialBackoff(500L, 60000L, 1.5f, 0.0f, 0.0f, 24, null);
        }

        private Companion() {
        }
    }

    public ExponentialBackoff() {
        this(0L, 0L, 0.0f, 0.0f, 0.0f, 31, null);
    }

    public static final ExponentialBackoff forNetworkWait() {
        return Companion.forNetworkWait();
    }

    private final void increase(float f10) {
        this.delayMs = (long) Math.min(this.delayMs * f10, this.maxDelayMs);
        this.delayMs += variance(this.delayMs * this.jitter);
        this.errorsCount++;
    }

    private final long variance(float f10) {
        return (long) (this.random.nextGaussian() * ((double) f10));
    }

    public final long getDelayMs() {
        return this.delayMs;
    }

    public final int getErrorsCount() {
        return this.errorsCount;
    }

    public final void onCriticalError() {
        increase(this.criticalFactor);
    }

    public final void onError() {
        increase(this.factor);
    }

    public final void reset() {
        this.delayMs = this.minDelayMs;
        this.errorsCount = 0;
    }

    public final boolean shouldWait() {
        return this.errorsCount > 0;
    }

    public final void waitIfNeeded() throws InterruptedException {
        if (shouldWait()) {
            Thread.sleep(this.delayMs);
        }
    }

    public ExponentialBackoff(long j10, long j11, float f10, float f11, float f12) {
        this.minDelayMs = j10;
        this.maxDelayMs = j11;
        this.factor = f10;
        this.criticalFactor = f11;
        this.jitter = f12;
        this.random = new Random(System.currentTimeMillis());
        this.delayMs = j10;
    }

    public /* synthetic */ ExponentialBackoff(long j10, long j11, float f10, float f11, float f12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? TimeUnit.MILLISECONDS.toMillis(100L) : j10, (i & 2) != 0 ? TimeUnit.MINUTES.toMillis(5L) : j11, (i & 4) != 0 ? 2.0f : f10, (i & 8) != 0 ? 5.0f : f11, (i & 16) != 0 ? 0.1f : f12);
    }
}
