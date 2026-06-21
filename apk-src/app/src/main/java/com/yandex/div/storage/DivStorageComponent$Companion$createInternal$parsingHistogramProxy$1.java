package com.yandex.div.storage;

import com.yandex.div.histogram.DivParsingHistogramReporter;
import com.yandex.div.storage.templates.DivParsingHistogramProxy;
import hj.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;

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
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class DivStorageComponent$Companion$createInternal$parsingHistogramProxy$1 extends r implements Function0<DivParsingHistogramProxy> {
    final /* synthetic */ a $parsingHistogramReporter;

    /* JADX INFO: renamed from: com.yandex.div.storage.DivStorageComponent$Companion$createInternal$parsingHistogramProxy$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class AnonymousClass1 extends r implements Function0<DivParsingHistogramReporter> {
        final /* synthetic */ a $parsingHistogramReporter;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar) {
            super(0);
            this.$parsingHistogramReporter = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final DivParsingHistogramReporter invoke() {
            return (DivParsingHistogramReporter) this.$parsingHistogramReporter.get();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivStorageComponent$Companion$createInternal$parsingHistogramProxy$1(a aVar) {
        super(0);
        this.$parsingHistogramReporter = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final DivParsingHistogramProxy invoke() {
        return new DivParsingHistogramProxy(new AnonymousClass1(this.$parsingHistogramReporter));
    }
}
