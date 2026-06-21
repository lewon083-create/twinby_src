package com.vk.api.sdk.utils;

import com.vk.api.sdk.utils.ThreadLocalDelegate;
import dk.i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
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
public final class ThreadLocalDelegateImpl<T> implements ThreadLocalDelegate<T> {
    private final Function0<T> factory;
    private final ThreadLocal<T> value;

    /* JADX WARN: Multi-variable type inference failed */
    public ThreadLocalDelegateImpl(Function0<? extends T> factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.factory = factory;
        this.value = new ThreadLocal<T>(this) { // from class: com.vk.api.sdk.utils.ThreadLocalDelegateImpl$value$1
            final /* synthetic */ ThreadLocalDelegateImpl<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.ThreadLocal
            public T initialValue() {
                return (T) this.this$0.getFactory().invoke();
            }
        };
    }

    @Override // com.vk.api.sdk.utils.ThreadLocalDelegate
    public T get() {
        T t10 = this.value.get();
        Intrinsics.b(t10);
        return t10;
    }

    public final Function0<T> getFactory() {
        return this.factory;
    }

    @Override // com.vk.api.sdk.utils.ThreadLocalDelegate
    public T getValue(Object obj, i iVar) {
        return (T) ThreadLocalDelegate.DefaultImpls.getValue(this, obj, iVar);
    }
}
