package com.vk.api.sdk.utils;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
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
public final class VKValidationLocker {
    public static final VKValidationLocker INSTANCE = new VKValidationLocker();
    private static final Condition lockCondition;
    private static final ReentrantLock locker;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        locker = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        Intrinsics.checkNotNullExpressionValue(conditionNewCondition, "locker.newCondition()");
        lockCondition = conditionNewCondition;
    }

    private VKValidationLocker() {
    }

    public final void await() {
        try {
            ReentrantLock reentrantLock = locker;
            reentrantLock.lock();
            try {
                lockCondition.await();
                Unit unit = Unit.f27471a;
            } finally {
                reentrantLock.unlock();
            }
        } catch (InterruptedException unused) {
        }
    }

    public final void signal() {
        ReentrantLock reentrantLock = locker;
        reentrantLock.lock();
        try {
            lockCondition.signalAll();
            Unit unit = Unit.f27471a;
        } finally {
            reentrantLock.unlock();
        }
    }
}
