package com.yandex.div.storage;

import android.content.Context;
import com.yandex.div.histogram.reporter.HistogramReporterDelegate;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.storage.analytics.CardErrorLoggerFactory;
import com.yandex.div.storage.database.AndroidDatabaseOpenHelper;
import com.yandex.div.storage.database.DatabaseOpenHelper;
import com.yandex.div.storage.histogram.HistogramNameProvider;
import com.yandex.div.storage.histogram.HistogramRecorder;
import com.yandex.div.storage.templates.TemplatesContainer;
import com.yandex.div.storage.util.LazyProvider;
import e5.g;
import hj.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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
public interface DivStorageComponent {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    @Metadata
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DatabaseOpenHelper createInternal$lambda$0(Context context, String str, int i, DatabaseOpenHelper.CreateCallback createCallback, DatabaseOpenHelper.UpgradeCallback upgradeCallback) {
            return new AndroidDatabaseOpenHelper(context, str, i, createCallback, upgradeCallback);
        }

        @NotNull
        public final DivStorageComponent create(@NotNull Context context, @NotNull HistogramReporterDelegate histogramReporterDelegate, @Nullable HistogramNameProvider histogramNameProvider, @NotNull ParsingErrorLogger parsingErrorLogger, @Nullable a aVar, @NotNull a aVar2, @NotNull String str) {
            return createInternal$div_storage_release(context, histogramReporterDelegate, histogramNameProvider, parsingErrorLogger, aVar, aVar2, str);
        }

        @NotNull
        public final InternalStorageComponent createInternal$div_storage_release(@NotNull Context context, @NotNull HistogramReporterDelegate histogramReporterDelegate, @Nullable HistogramNameProvider histogramNameProvider, @NotNull ParsingErrorLogger parsingErrorLogger, @Nullable a aVar, @NotNull a aVar2, @NotNull String str) {
            DivStorageImpl divStorageImpl = new DivStorageImpl(context, new g(9), str);
            LazyProvider lazyProvider = new LazyProvider(new DivStorageComponent$Companion$createInternal$parsingHistogramProxy$1(aVar2));
            HistogramRecorder histogramRecorder = new HistogramRecorder(histogramReporterDelegate, histogramNameProvider);
            TemplatesContainer templatesContainer = new TemplatesContainer(divStorageImpl, parsingErrorLogger, histogramRecorder, lazyProvider, histogramNameProvider);
            return new InternalStorageComponent(new DivDataRepositoryImpl(divStorageImpl, templatesContainer, histogramRecorder, histogramNameProvider, lazyProvider, new CardErrorLoggerFactory(aVar, templatesContainer, parsingErrorLogger)), new RawJsonRepositoryImpl(divStorageImpl), divStorageImpl);
        }
    }
}
