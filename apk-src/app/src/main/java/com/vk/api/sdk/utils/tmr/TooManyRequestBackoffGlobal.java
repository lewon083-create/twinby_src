package com.vk.api.sdk.utils.tmr;

import android.os.SystemClock;
import java.util.ArrayDeque;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

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
public final class TooManyRequestBackoffGlobal implements TooManyRequestLimitBackoff {
    public static final TooManyRequestBackoffGlobal INSTANCE = new TooManyRequestBackoffGlobal();
    private static final ArrayDeque<Long> lastTimestamps = new ArrayDeque<>();

    private TooManyRequestBackoffGlobal() {
    }

    private final synchronized void fillIfNeeded(int i) {
        try {
            ArrayDeque<Long> arrayDeque = lastTimestamps;
            if (i == arrayDeque.size()) {
                return;
            }
            int i10 = 0;
            if (i > arrayDeque.size()) {
                int size = i - arrayDeque.size();
                while (i10 < size) {
                    lastTimestamps.addFirst(0L);
                    i10++;
                }
            } else {
                int size2 = arrayDeque.size() - i;
                while (i10 < size2) {
                    lastTimestamps.removeFirst();
                    i10++;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.vk.api.sdk.utils.tmr.TooManyRequestLimitBackoff
    public synchronized void waitBeforeCall(int i, long j10) {
        fillIfNeeded(i);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        ArrayDeque<Long> arrayDeque = lastTimestamps;
        arrayDeque.addLast(Long.valueOf(jElapsedRealtime));
        Long firstTimestamp = arrayDeque.removeFirst();
        Intrinsics.checkNotNullExpressionValue(firstTimestamp, "firstTimestamp");
        long jLongValue = j10 - (jElapsedRealtime - firstTimestamp.longValue());
        if (jLongValue > 0) {
            Thread.sleep(jLongValue);
        }
    }
}
