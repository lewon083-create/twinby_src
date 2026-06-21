package androidx.camera.video.internal.compat.quirk;

import g0.w1;
import kotlin.Metadata;

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
public final class PreviewFreezeAfterHighSpeedRecordingQuirk implements w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PreviewFreezeAfterHighSpeedRecordingQuirk f1271a = new PreviewFreezeAfterHighSpeedRecordingQuirk();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f1272b;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    static {
        /*
            androidx.camera.video.internal.compat.quirk.PreviewFreezeAfterHighSpeedRecordingQuirk r0 = new androidx.camera.video.internal.compat.quirk.PreviewFreezeAfterHighSpeedRecordingQuirk
            r0.<init>()
            androidx.camera.video.internal.compat.quirk.PreviewFreezeAfterHighSpeedRecordingQuirk.f1271a = r0
            java.lang.String r0 = android.os.Build.BRAND
            java.lang.String r1 = "google"
            boolean r0 = kotlin.text.a0.i(r0, r1)
            if (r0 == 0) goto L22
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r1 = "MODEL"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r1 = "Pixel"
            r2 = 1
            boolean r0 = kotlin.text.a0.n(r0, r1, r2)
            if (r0 == 0) goto L22
            goto L23
        L22:
            r2 = 0
        L23:
            androidx.camera.video.internal.compat.quirk.PreviewFreezeAfterHighSpeedRecordingQuirk.f1272b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.internal.compat.quirk.PreviewFreezeAfterHighSpeedRecordingQuirk.<clinit>():void");
    }

    private PreviewFreezeAfterHighSpeedRecordingQuirk() {
    }
}
