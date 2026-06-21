package oi;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.measurement.h5;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.FirebaseAnalytics;
import ii.q;
import ij.k;
import ij.m;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import t.z;

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
public final class j implements FlutterFirebasePlugin, ei.b, d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FirebaseAnalytics f30690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q f30691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ii.f f30692d;

    public static Bundle a(Map map) {
        if (map == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                bundle.putString(str, (String) value);
            } else if (value instanceof Integer) {
                bundle.putLong(str, ((Number) value).intValue());
            } else if (value instanceof Long) {
                bundle.putLong(str, ((Number) value).longValue());
            } else if (value instanceof Double) {
                bundle.putDouble(str, ((Number) value).doubleValue());
            } else if (value instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) value).booleanValue());
            } else if (value == null) {
                bundle.putString(str, null);
            } else if (value instanceof Iterable) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : (Iterable) value) {
                    if (obj instanceof Map) {
                        Bundle bundleA = a((Map) obj);
                        if (bundleA != null) {
                            arrayList.add(bundleA);
                        }
                    } else if (obj != null) {
                        throw new IllegalArgumentException(z.e("Unsupported value type: ", obj.getClass().getCanonicalName(), " in list at key ", str));
                    }
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList.toArray(new Parcelable[0]));
            } else {
                if (!(value instanceof Map)) {
                    throw new IllegalArgumentException(om1.k("Unsupported value type: ", value.getClass().getCanonicalName()));
                }
                bundle.putParcelable(str, a((Map) value));
            }
        }
        return bundle;
    }

    public static void b(Task task, Function1 function1) {
        String message;
        if (task.isSuccessful()) {
            k kVar = m.f21341c;
            function1.invoke(new m(task.getResult()));
            return;
        }
        Exception exception = task.getException();
        if (exception == null || (message = exception.getMessage()) == null) {
            message = "An unknown error occurred";
        }
        k kVar2 = m.f21341c;
        function1.invoke(new m(h5.s(new e("firebase_analytics", message))));
    }

    public static void c(Task task, Function1 function1) {
        String message;
        if (task.isSuccessful()) {
            k kVar = m.f21341c;
            function1.invoke(new m(Unit.f27471a));
            return;
        }
        Exception exception = task.getException();
        if (exception == null || (message = exception.getMessage()) == null) {
            message = "An unknown error occurred";
        }
        k kVar2 = m.f21341c;
        function1.invoke(new m(h5.s(new e("firebase_analytics", message))));
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public final Task didReinitializeFirebaseCore() {
        sb.g gVar = new sb.g();
        FlutterFirebasePlugin.cachedThreadPool.execute(new f(1, gVar));
        sb.m mVar = gVar.f32858a;
        Intrinsics.checkNotNullExpressionValue(mVar, "getTask(...)");
        return mVar;
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public final Task getPluginConstantsForFirebaseApp(fd.g gVar) {
        sb.g gVar2 = new sb.g();
        FlutterFirebasePlugin.cachedThreadPool.execute(new f(0, gVar2));
        sb.m mVar = gVar2.f32858a;
        Intrinsics.checkNotNullExpressionValue(mVar, "getTask(...)");
        return mVar;
    }

    @Override // ei.b
    public final void onAttachedToEngine(ei.a binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        ii.f fVar = binding.f16383c;
        Intrinsics.checkNotNullExpressionValue(fVar, "getBinaryMessenger(...)");
        Context context = binding.f16381a;
        Intrinsics.checkNotNullExpressionValue(context, "getApplicationContext(...)");
        this.f30690b = FirebaseAnalytics.getInstance(context);
        this.f30691c = new q(fVar, "plugins.flutter.io/firebase_analytics");
        c.b(d.W1, fVar, this);
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_analytics", this);
        this.f30692d = fVar;
    }

    @Override // ei.b
    public final void onDetachedFromEngine(ei.a binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        q qVar = this.f30691c;
        if (qVar != null) {
            qVar.b(null);
        }
        ii.f fVar = this.f30692d;
        if (fVar == null) {
            throw new IllegalStateException("Required value was null.");
        }
        c.b(d.W1, fVar, null);
        this.f30691c = null;
        this.f30692d = null;
    }
}
