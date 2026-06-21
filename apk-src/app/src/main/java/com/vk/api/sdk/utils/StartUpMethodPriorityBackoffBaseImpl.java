package com.vk.api.sdk.utils;

import com.vk.api.sdk.utils.log.Logger;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

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
public final class StartUpMethodPriorityBackoffBaseImpl implements ApiMethodPriorityBackoff {
    public static final long METHOD_WAIT_TIMEOUT = 500;
    private final Collection<String> exceptionMethods;
    private final Map<Integer, Condition> locks;
    private final Logger logger;
    private final ReentrantLock operationsLock;
    private final CopyOnWriteArrayList<String> startUpMethodsQueue;
    public static final Companion Companion = new Companion(null);
    private static final AtomicInteger idGenerator = new AtomicInteger();

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public StartUpMethodPriorityBackoffBaseImpl(Collection<String> startUpPriorityMethods, Collection<String> exceptionMethods, Logger logger) {
        Intrinsics.checkNotNullParameter(startUpPriorityMethods, "startUpPriorityMethods");
        Intrinsics.checkNotNullParameter(exceptionMethods, "exceptionMethods");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.exceptionMethods = exceptionMethods;
        this.logger = logger;
        this.locks = new LinkedHashMap();
        this.operationsLock = new ReentrantLock();
        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.addAll(startUpPriorityMethods);
        Unit unit = Unit.f27471a;
        this.startUpMethodsQueue = copyOnWriteArrayList;
    }

    private final void debug(Logger logger, String str) {
        Logger.DefaultImpls.log$default(this.logger, Logger.LogLevel.DEBUG, Intrinsics.f(str, "StartUpMethodPriorityBackoffBaseImpl:"), null, 4, null);
    }

    private final void notifyAwaiters(String str) {
        debug(this.logger, Intrinsics.f(str, "notifyMethodCall:"));
        if (this.startUpMethodsQueue.isEmpty()) {
            notifyLocks();
        } else if (this.startUpMethodsQueue.contains(str)) {
            this.startUpMethodsQueue.remove(str);
            debug(this.logger, Intrinsics.f(str, "remove method from name "));
            notifyLocks();
        }
    }

    private final void notifyLocks() {
        Iterator<T> it = this.locks.values().iterator();
        while (it.hasNext()) {
            ((Condition) it.next()).signalAll();
        }
    }

    @Override // com.vk.api.sdk.utils.ApiMethodPriorityBackoff
    public void clear() {
        ReentrantLock reentrantLock = this.operationsLock;
        reentrantLock.lock();
        try {
            debug(this.logger, "clear startup method queue");
            this.startUpMethodsQueue.clear();
            notifyLocks();
            this.locks.clear();
            Unit unit = Unit.f27471a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.vk.api.sdk.utils.ApiMethodPriorityBackoff
    public boolean isActive() {
        return !this.startUpMethodsQueue.isEmpty();
    }

    @Override // com.vk.api.sdk.utils.ApiMethodPriorityBackoff
    public int newId() {
        int iIncrementAndGet = idGenerator.incrementAndGet();
        ReentrantLock reentrantLock = this.operationsLock;
        reentrantLock.lock();
        try {
            Map<Integer, Condition> map = this.locks;
            Integer numValueOf = Integer.valueOf(iIncrementAndGet);
            Condition conditionNewCondition = this.operationsLock.newCondition();
            Intrinsics.checkNotNullExpressionValue(conditionNewCondition, "operationsLock.newCondition()");
            map.put(numValueOf, conditionNewCondition);
            Unit unit = Unit.f27471a;
            return iIncrementAndGet;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.vk.api.sdk.utils.ApiMethodPriorityBackoff
    public void processMethod(int i, String methodName) {
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        ReentrantLock reentrantLock = this.operationsLock;
        reentrantLock.lock();
        try {
            Condition condition = this.locks.get(Integer.valueOf(i));
            if (condition == null) {
                reentrantLock.unlock();
                return;
            }
            if (shouldWait(methodName)) {
                debug(this.logger, "should wait for " + methodName + " queue.size:" + this.startUpMethodsQueue.size());
                condition.await(500L, TimeUnit.MILLISECONDS);
            }
            Unit unit = Unit.f27471a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // com.vk.api.sdk.utils.ApiMethodPriorityBackoff
    public boolean shouldWait(String methodName) {
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        ReentrantLock reentrantLock = this.operationsLock;
        reentrantLock.lock();
        try {
            boolean z5 = false;
            if (this.exceptionMethods.contains(methodName)) {
                notifyAwaiters(methodName);
                return false;
            }
            if (!this.startUpMethodsQueue.isEmpty() && !this.startUpMethodsQueue.contains(methodName)) {
                z5 = true;
            }
            if (!z5) {
                notifyAwaiters(methodName);
            }
            return z5;
        } finally {
            reentrantLock.unlock();
        }
    }
}
