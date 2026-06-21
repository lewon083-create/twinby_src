package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
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
public final class ProcessLifecycleInitializer implements s6.b {
    @Override // s6.b
    public final List a() {
        return kotlin.collections.b0.f27475b;
    }

    @Override // s6.b
    public final Object create(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        s6.a aVarC = s6.a.c(context);
        Intrinsics.checkNotNullExpressionValue(aVarC, "getInstance(...)");
        if (!aVarC.f32782b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        AtomicBoolean atomicBoolean = r.f1585a;
        Intrinsics.checkNotNullParameter(context, "context");
        if (!r.f1585a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new q());
        }
        ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.f1526j;
        Intrinsics.checkNotNullParameter(context, "context");
        ProcessLifecycleOwner processLifecycleOwner2 = ProcessLifecycleOwner.f1526j;
        processLifecycleOwner2.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        processLifecycleOwner2.f1531f = new Handler();
        processLifecycleOwner2.f1532g.e(n.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        Intrinsics.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new h0(processLifecycleOwner2));
        return processLifecycleOwner2;
    }
}
