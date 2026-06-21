package com.vk.api.sdk.okhttp;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.r;
import kotlin.text.Regex;
import kotlin.text.s;

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
public final class LoggingInterceptor$sensitiveKeysRequestRegex$2 extends r implements Function0<Regex> {
    final /* synthetic */ LoggingInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoggingInterceptor$sensitiveKeysRequestRegex$2(LoggingInterceptor loggingInterceptor) {
        super(0);
        this.this$0 = loggingInterceptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Regex invoke() {
        String str = "(" + CollectionsKt.I(this.this$0.keysToFilter, "|", null, null, null, 62) + ")=[a-z0-9]+";
        Intrinsics.checkNotNullExpressionValue(str, "StringBuilder().apply {\n…]+\")\n        }.toString()");
        return new Regex(str, s.f27578c);
    }
}
