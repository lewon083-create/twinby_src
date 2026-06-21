package com.vk.api.sdk.okhttp;

import a0.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
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
public final class LoggingInterceptor$sensitiveKeysResponseTransformer$2 extends r implements Function0<Function1<? super MatchResult, ? extends String>> {
    public static final LoggingInterceptor$sensitiveKeysResponseTransformer$2 INSTANCE = new LoggingInterceptor$sensitiveKeysResponseTransformer$2();

    /* JADX INFO: renamed from: com.vk.api.sdk.okhttp.LoggingInterceptor$sensitiveKeysResponseTransformer$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AnonymousClass1 extends r implements Function1<MatchResult, String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(MatchResult match) {
            Intrinsics.checkNotNullParameter(match, "match");
            return u.o(new StringBuilder("\""), (String) match.a().get(1), "\":<HIDE>");
        }
    }

    public LoggingInterceptor$sensitiveKeysResponseTransformer$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Function1<MatchResult, String> invoke() {
        return AnonymousClass1.INSTANCE;
    }
}
