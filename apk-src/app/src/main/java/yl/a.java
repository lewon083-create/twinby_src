package yl;

import android.content.Context;
import g8.f;
import ii.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m.h3;
import ti.t0;
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
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class a implements ei.b, fi.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q f45751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f45752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f f45753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h3 f45754e;

    @Override // fi.a
    public final void onAttachedToActivity(fi.b binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        b bVar = this.f45752c;
        if (bVar != null) {
            bVar.f45757d = (w) ((h3) binding).f28250b;
        }
        f fVar = this.f45753d;
        Intrinsics.b(fVar);
        h3 h3Var = (h3) binding;
        h3Var.a(fVar);
        this.f45754e = h3Var;
    }

    @Override // ei.b
    public final void onAttachedToEngine(ei.a binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        ii.f fVar = binding.f16383c;
        Intrinsics.checkNotNullExpressionValue(fVar, "getBinaryMessenger(...)");
        q qVar = new q(fVar, "flutter_login_vk");
        t0 t0Var = new t0();
        Context context = binding.f16381a;
        Intrinsics.checkNotNullExpressionValue(context, "getApplicationContext(...)");
        b bVar = new b(context, t0Var);
        f fVar2 = new f(t0Var);
        qVar.b(bVar);
        this.f45753d = fVar2;
        this.f45752c = bVar;
        this.f45751b = qVar;
    }

    @Override // fi.a
    public final void onDetachedFromActivity() {
        h3 h3Var = this.f45754e;
        if (h3Var != null) {
            f fVar = this.f45753d;
            Intrinsics.b(fVar);
            h3Var.g(fVar);
        }
        b bVar = this.f45752c;
        if (bVar != null) {
            bVar.f45757d = null;
        }
        this.f45754e = null;
    }

    @Override // fi.a
    public final void onDetachedFromActivityForConfigChanges() {
        h3 h3Var = this.f45754e;
        if (h3Var != null) {
            f fVar = this.f45753d;
            Intrinsics.b(fVar);
            h3Var.g(fVar);
        }
        b bVar = this.f45752c;
        if (bVar != null) {
            bVar.f45757d = null;
        }
        this.f45754e = null;
    }

    @Override // ei.b
    public final void onDetachedFromEngine(ei.a binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        q qVar = this.f45751b;
        if (qVar != null) {
            qVar.b(null);
        }
        this.f45752c = null;
        this.f45754e = null;
        this.f45753d = null;
    }

    @Override // fi.a
    public final void onReattachedToActivityForConfigChanges(fi.b binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        b bVar = this.f45752c;
        if (bVar != null) {
            bVar.f45757d = (w) ((h3) binding).f28250b;
        }
        f fVar = this.f45753d;
        Intrinsics.b(fVar);
        h3 h3Var = (h3) binding;
        h3Var.a(fVar);
        this.f45754e = h3Var;
    }
}
