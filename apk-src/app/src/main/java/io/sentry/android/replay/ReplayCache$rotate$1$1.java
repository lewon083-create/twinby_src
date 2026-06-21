package io.sentry.android.replay;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.f0;
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
public final class ReplayCache$rotate$1$1 extends r implements Function1<ReplayFrame, Boolean> {
    final /* synthetic */ f0 $screen;
    final /* synthetic */ long $until;
    final /* synthetic */ ReplayCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReplayCache$rotate$1$1(long j10, ReplayCache replayCache, f0 f0Var) {
        super(1);
        this.$until = j10;
        this.this$0 = replayCache;
        this.$screen = f0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(ReplayFrame it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.getTimestamp() < this.$until) {
            this.this$0.deleteFile(it.getScreenshot());
            return Boolean.TRUE;
        }
        f0 f0Var = this.$screen;
        if (f0Var.f27510b == null) {
            f0Var.f27510b = it.getScreen();
        }
        return Boolean.FALSE;
    }
}
