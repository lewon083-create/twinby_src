package df;

import android.content.Context;
import com.appsflyer.AppsFlyerProperties;
import ii.o;
import ii.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

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
public final class e implements ei.b, o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q f15789b;

    @Override // ei.b
    public final void onAttachedToEngine(ei.a flutterPluginBinding) {
        Intrinsics.checkNotNullParameter(flutterPluginBinding, "flutterPluginBinding");
        Context context = flutterPluginBinding.f16381a;
        q qVar = new q(flutterPluginBinding.f16383c, "com.twinby/device_format");
        this.f15789b = qVar;
        qVar.b(this);
    }

    @Override // ei.b
    public final void onDetachedFromEngine(ei.a flutterPluginBinding) {
        Intrinsics.checkNotNullParameter(flutterPluginBinding, "flutterPluginBinding");
        q qVar = this.f15789b;
        if (qVar != null) {
            qVar.b(null);
        } else {
            Intrinsics.g(AppsFlyerProperties.CHANNEL);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    @Override // ii.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMethodCall(ii.n r21, ii.p r22) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: df.e.onMethodCall(ii.n, ii.p):void");
    }
}
