package qh;

import a1.m;
import aj.e;
import android.content.Context;
import androidx.lifecycle.q0;
import ii.q;
import ij.h;
import java.util.concurrent.atomic.AtomicBoolean;
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
/* JADX INFO: loaded from: classes2.dex */
@Metadata
public final class a implements ei.b, fi.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m f32110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f32111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q f32112d;

    @Override // fi.a
    public final void onAttachedToActivity(fi.b binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        b bVar = this.f32111c;
        if (bVar == null) {
            Intrinsics.g("manager");
            throw null;
        }
        h3 h3Var = (h3) binding;
        h3Var.a(bVar);
        m mVar = this.f32110b;
        if (mVar != null) {
            mVar.f363c = (w) h3Var.f28250b;
        } else {
            Intrinsics.g("share");
            throw null;
        }
    }

    @Override // ei.b
    public final void onAttachedToEngine(ei.a binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f32112d = new q(binding.f16383c, "dev.fluttercommunity.plus/share");
        Context context = binding.f16381a;
        Intrinsics.checkNotNullExpressionValue(context, "getApplicationContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        b bVar = new b();
        bVar.f32114c = new AtomicBoolean(true);
        this.f32111c = bVar;
        Intrinsics.checkNotNullExpressionValue(context, "getApplicationContext(...)");
        b manager = this.f32111c;
        if (manager == null) {
            Intrinsics.g("manager");
            throw null;
        }
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(manager, "manager");
        m mVar = new m();
        mVar.f362b = context;
        mVar.f363c = null;
        mVar.f364d = manager;
        mVar.f365e = h.b(new q0(7, mVar));
        mVar.f366f = h.b(new e(8));
        this.f32110b = mVar;
        b bVar2 = this.f32111c;
        if (bVar2 == null) {
            Intrinsics.g("manager");
            throw null;
        }
        i iVar = new i(mVar, bVar2);
        q qVar = this.f32112d;
        if (qVar != null) {
            qVar.b(iVar);
        } else {
            Intrinsics.g("methodChannel");
            throw null;
        }
    }

    @Override // fi.a
    public final void onDetachedFromActivity() {
        m mVar = this.f32110b;
        if (mVar != null) {
            mVar.f363c = null;
        } else {
            Intrinsics.g("share");
            throw null;
        }
    }

    @Override // fi.a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // ei.b
    public final void onDetachedFromEngine(ei.a binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        q qVar = this.f32112d;
        if (qVar != null) {
            qVar.b(null);
        } else {
            Intrinsics.g("methodChannel");
            throw null;
        }
    }

    @Override // fi.a
    public final void onReattachedToActivityForConfigChanges(fi.b binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        onAttachedToActivity(binding);
    }
}
