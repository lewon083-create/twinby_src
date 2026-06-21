package com.vk.api.sdk.okhttp;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.r;
import kotlin.text.MatchResult;

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
public final class LoggingInterceptor$restoreKVKeysTransformer$2 extends r implements Function0<Function2<? super MatchResult, ? super String, ? extends String>> {
    public static final LoggingInterceptor$restoreKVKeysTransformer$2 INSTANCE = new LoggingInterceptor$restoreKVKeysTransformer$2();

    /* JADX INFO: renamed from: com.vk.api.sdk.okhttp.LoggingInterceptor$restoreKVKeysTransformer$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AnonymousClass1 extends r implements Function2<MatchResult, String, String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final String invoke(MatchResult match, String key) {
            Intrinsics.checkNotNullParameter(match, "match");
            Intrinsics.checkNotNullParameter(key, "key");
            return ((String) match.a().get(1)) + '\"' + key + '\"' + ((String) match.a().get(2));
        }
    }

    public LoggingInterceptor$restoreKVKeysTransformer$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Function2<MatchResult, String, String> invoke() {
        return AnonymousClass1.INSTANCE;
    }
}
