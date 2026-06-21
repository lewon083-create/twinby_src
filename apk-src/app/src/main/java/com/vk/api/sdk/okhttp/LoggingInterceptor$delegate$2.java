package com.vk.api.sdk.okhttp;

import com.vk.api.sdk.utils.log.Logger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.r;
import ml.b;
import ml.c;

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
public final class LoggingInterceptor$delegate$2 extends r implements Function0<c> {
    final /* synthetic */ LoggingInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoggingInterceptor$delegate$2(LoggingInterceptor loggingInterceptor) {
        super(0);
        this.this$0 = loggingInterceptor;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.vk.api.sdk.okhttp.LoggingInterceptor$delegate$2$1] */
    @Override // kotlin.jvm.functions.Function0
    public final c invoke() {
        final LoggingInterceptor loggingInterceptor = this.this$0;
        return new c(new b() { // from class: com.vk.api.sdk.okhttp.LoggingInterceptor$delegate$2.1
            private final String filterCredentials(String str) {
                return loggingInterceptor.removeSensitiveKeys(str);
            }

            @Override // ml.b
            public void log(String message) {
                Intrinsics.checkNotNullParameter(message, "message");
                String str = (String) loggingInterceptor.prefix.get();
                if (str != null) {
                    String str2 = str + ' ' + message;
                    if (str2 != null) {
                        message = str2;
                    }
                }
                if (loggingInterceptor.filterCredentials) {
                    message = filterCredentials(message);
                }
                Logger.DefaultImpls.log$default(loggingInterceptor.logger, (Logger.LogLevel) loggingInterceptor.logger.getLogLevel().getValue(), message, null, 4, null);
            }
        });
    }
}
