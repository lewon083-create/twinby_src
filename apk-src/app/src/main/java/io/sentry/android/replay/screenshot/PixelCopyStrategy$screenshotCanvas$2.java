package io.sentry.android.replay.screenshot;

import android.graphics.Canvas;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.r;

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
public final class PixelCopyStrategy$screenshotCanvas$2 extends r implements Function0<Canvas> {
    final /* synthetic */ PixelCopyStrategy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PixelCopyStrategy$screenshotCanvas$2(PixelCopyStrategy pixelCopyStrategy) {
        super(0);
        this.this$0 = pixelCopyStrategy;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Canvas invoke() {
        return new Canvas(this.this$0.screenshot);
    }
}
