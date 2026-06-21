package com.yandex.div.core.dagger;

import android.content.Context;
import com.yandex.div.histogram.DivParsingHistogramReporter;
import com.yandex.div.histogram.reporter.HistogramReporterDelegate;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.storage.DivStorageComponent;
import com.yandex.div.storage.DivStorageComponent$Companion$create$1;
import com.yandex.div.storage.util.LazyProvider;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

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
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class DivStorageModule {

    @NotNull
    public static final DivStorageModule INSTANCE = new DivStorageModule();

    private DivStorageModule() {
    }

    @NotNull
    public final DivStorageComponent provideDivStorageComponent(@NotNull ExternalOptional<DivStorageComponent> externalOptional, @NotNull Context context, @NotNull HistogramReporterDelegate histogramReporterDelegate, @NotNull final DivParsingHistogramReporter divParsingHistogramReporter) {
        if (externalOptional.getOptional().f27400a == null) {
            return DivStorageComponent.Companion.create(context, (92 & 2) != 0 ? HistogramReporterDelegate.NoOp.INSTANCE : histogramReporterDelegate, (92 & 4) != 0 ? null : null, (92 & 8) != 0 ? ParsingErrorLogger.LOG : null, (92 & 16) == 0 ? null : null, (92 & 32) != 0 ? new LazyProvider(DivStorageComponent$Companion$create$1.INSTANCE) : new hj.a() { // from class: com.yandex.div.core.dagger.c
                @Override // hj.a
                public final Object get() {
                    return DivStorageModule.provideDivStorageComponent$lambda$0(divParsingHistogramReporter);
                }
            }, (92 & 64) != 0 ? "" : null);
        }
        Object obj = externalOptional.getOptional().f27400a;
        if (obj != null) {
            return (DivStorageComponent) obj;
        }
        throw new NoSuchElementException("No value present");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivParsingHistogramReporter provideDivStorageComponent$lambda$0(DivParsingHistogramReporter divParsingHistogramReporter) {
        return divParsingHistogramReporter;
    }
}
