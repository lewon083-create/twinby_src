package lh;

import android.content.Context;
import android.provider.Settings;
import com.appsflyer.AppsFlyerProperties;
import ei.b;
import hi.g;
import ii.f;
import ii.n;
import ii.o;
import ii.p;
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
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class a implements o, b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q f28123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f28124c;

    @Override // ei.b
    public final void onAttachedToEngine(ei.a flutterPluginBinding) {
        Intrinsics.checkNotNullParameter(flutterPluginBinding, "flutterPluginBinding");
        Context context = flutterPluginBinding.f16381a;
        Intrinsics.checkNotNullExpressionValue(context, "getApplicationContext(...)");
        f fVar = flutterPluginBinding.f16383c;
        Intrinsics.checkNotNullExpressionValue(fVar, "getBinaryMessenger(...)");
        this.f28124c = context;
        q qVar = new q(fVar, "flutter_udid");
        this.f28123b = qVar;
        qVar.b(this);
    }

    @Override // ei.b
    public final void onDetachedFromEngine(ei.a binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f28124c = null;
        q qVar = this.f28123b;
        if (qVar != null) {
            qVar.b(null);
        } else {
            Intrinsics.g(AppsFlyerProperties.CHANNEL);
            throw null;
        }
    }

    @Override // ii.o
    public final void onMethodCall(n call, p result) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        if (!call.f21315a.equals("getUDID")) {
            ((g) result).a();
            return;
        }
        Context context = this.f28124c;
        String string = Settings.Secure.getString(context != null ? context.getContentResolver() : null, "android_id");
        if (string == null || string.length() == 0) {
            ((g) result).b("UNAVAILABLE", "UDID not available.", null);
        } else {
            ((g) result).success(string);
        }
    }
}
