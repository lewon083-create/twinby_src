package z7;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.lifecycle.q0;
import com.google.android.gms.internal.ads.b7;
import ei.b;
import hi.g;
import ii.n;
import ii.o;
import ii.p;
import ii.q;
import ii.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l6.i;
import m.h3;
import z2.w;

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
public final class a implements b, o, fi.a, s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static g f46198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static q0 f46199e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q f46200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public fi.b f46201c;

    @Override // ii.s
    public final boolean a(int i, int i10, Intent intent) {
        g gVar;
        if (i != 1001 || (gVar = f46198d) == null) {
            return false;
        }
        gVar.b("authorization-error/canceled", "The user closed the Custom Tab", null);
        f46198d = null;
        f46199e = null;
        return false;
    }

    @Override // fi.a
    public final void onAttachedToActivity(fi.b binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f46201c = binding;
        ((h3) binding).a(this);
    }

    @Override // ei.b
    public final void onAttachedToEngine(ei.a flutterPluginBinding) {
        Intrinsics.checkNotNullParameter(flutterPluginBinding, "flutterPluginBinding");
        q qVar = new q(flutterPluginBinding.f16383c, "com.aboutyou.dart_packages.sign_in_with_apple");
        this.f46200b = qVar;
        qVar.b(this);
    }

    @Override // fi.a
    public final void onDetachedFromActivity() {
        fi.b bVar = this.f46201c;
        if (bVar != null) {
            ((h3) bVar).g(this);
        }
        this.f46201c = null;
    }

    @Override // fi.a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // ei.b
    public final void onDetachedFromEngine(ei.a binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        q qVar = this.f46200b;
        if (qVar != null) {
            qVar.b(null);
        }
        this.f46200b = null;
    }

    @Override // ii.o
    public final void onMethodCall(n call, p result) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        String str = call.f21315a;
        Object obj = call.f21316b;
        if (str.equals("isAvailable")) {
            ((g) result).success(Boolean.TRUE);
            return;
        }
        if (!str.equals("performAuthorizationRequest")) {
            ((g) result).a();
            return;
        }
        fi.b bVar = this.f46201c;
        w wVar = bVar != null ? (w) ((h3) bVar).f28250b : null;
        if (wVar == null) {
            ((g) result).b("MISSING_ACTIVITY", "Plugin is not attached to an activity", obj);
            return;
        }
        String str2 = (String) call.a("url");
        if (str2 == null) {
            ((g) result).b("MISSING_ARG", "Missing 'url' argument", obj);
            return;
        }
        g gVar = f46198d;
        if (gVar != null) {
            gVar.b("NEW_REQUEST", "A new request came in while this was still pending. The previous request (this one) was then cancelled.", null);
        }
        q0 q0Var = f46199e;
        if (q0Var != null) {
            q0Var.invoke();
        }
        f46198d = (g) result;
        f46199e = new q0(10, wVar);
        i iVarA = new b7().a();
        Intent intent = (Intent) iVarA.f27978c;
        Intrinsics.checkNotNullExpressionValue(iVarA, "build(...)");
        intent.setData(Uri.parse(str2));
        wVar.startActivityForResult(intent, 1001, (Bundle) iVarA.f27979d);
    }

    @Override // fi.a
    public final void onReattachedToActivityForConfigChanges(fi.b binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        onAttachedToActivity(binding);
    }
}
