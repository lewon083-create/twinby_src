package com.vk.api.sdk;

import android.os.Handler;
import android.os.Looper;
import ij.g;
import ij.h;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
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
public final class VKScheduler {
    private static final int NETWORK_THREADS_COUNT = 32;
    public static final VKScheduler INSTANCE = new VKScheduler();
    private static final AtomicInteger counter = new AtomicInteger();
    private static final g handler$delegate = h.b(VKScheduler$handler$2.INSTANCE);
    private static final g networkExecutor$delegate = h.b(VKScheduler$networkExecutor$2.INSTANCE);

    private VKScheduler() {
    }

    private final Handler getHandler() {
        return (Handler) handler$delegate.getValue();
    }

    public static final void runOnMainThread(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        runOnMainThread$default(runnable, 0L, 2, null);
    }

    public static /* synthetic */ void runOnMainThread$default(Runnable runnable, long j10, int i, Object obj) {
        if ((i & 2) != 0) {
            j10 = 0;
        }
        runOnMainThread(runnable, j10);
    }

    public final ExecutorService getNetworkExecutor() {
        Object value = networkExecutor$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-networkExecutor>(...)");
        return (ExecutorService) value;
    }

    public static final void runOnMainThread(Runnable runnable, long j10) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        if (Intrinsics.a(Looper.myLooper(), Looper.getMainLooper()) && j10 == 0) {
            runnable.run();
        } else {
            INSTANCE.getHandler().postDelayed(runnable, j10);
        }
    }
}
