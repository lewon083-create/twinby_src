package qi;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.h5;
import com.google.android.gms.tasks.Task;
import ge.l;
import he.p;
import ii.i;
import ij.k;
import ij.m;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import m3.c0;

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
public final class f implements FlutterFirebasePlugin, ei.b, ii.h, d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i f32124c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ii.f f32126e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f32123b = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f32125d = new Handler(Looper.getMainLooper());

    public static HashMap a(ge.e eVar) {
        String str;
        HashMap map = new HashMap();
        map.put("fetchTimeout", Long.valueOf(eVar.c().f20557c.f10771b));
        map.put("minimumFetchInterval", Long.valueOf(eVar.c().f20557c.f10772c));
        map.put("lastFetchTime", Long.valueOf(eVar.c().f20555a));
        int i = eVar.c().f20556b;
        if (i == -1) {
            str = "success";
        } else if (i != 0) {
            str = "failure";
            if (i != 1 && i == 2) {
                str = "throttled";
            }
        } else {
            str = "noFetchYet";
        }
        map.put("lastFetchStatus", str);
        return map;
    }

    public static ge.e b(String str) {
        fd.g gVarF = fd.g.f(str);
        Intrinsics.checkNotNullExpressionValue(gVarF, "getInstance(...)");
        ge.e eVarC = ((l) gVarF.c(l.class)).c();
        Intrinsics.checkNotNullExpressionValue(eVarC, "getInstance(...)");
        return eVarC;
    }

    public static void c(Function1 function1, Exception exc) {
        String message;
        HashMap map = new HashMap();
        if (exc instanceof ge.h) {
            map.put("code", "throttled");
            map.put("message", "frequency of requests exceeds throttled limits");
        } else if (exc instanceof ge.f) {
            map.put("code", "internal");
            map.put("message", "internal remote config fetch error");
        } else if (exc instanceof ge.i) {
            map.put("code", "remote-config-server-error");
            ge.i iVar = (ge.i) exc;
            map.put("message", iVar.getMessage());
            Throwable cause = iVar.getCause();
            if (cause != null && (message = cause.getMessage()) != null && StringsKt.y(message, "Forbidden", false)) {
                map.put("code", "forbidden");
            }
        } else {
            map.put("code", "unknown");
            map.put("message", "unknown remote config error");
        }
        k kVar = m.f21341c;
        function1.invoke(new m(h5.s(new g(exc != null ? exc.getMessage() : null, map))));
    }

    public static HashMap d(HashMap map) {
        HashMap map2 = new HashMap();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            Intrinsics.b(obj);
            p pVar = (p) obj;
            int i = pVar.f20559b;
            HashMap map3 = new HashMap();
            map3.put("value", i == 0 ? ge.e.f20122l : pVar.f20558a.getBytes(he.h.f20516e));
            String str2 = "static";
            if (i != 0) {
                if (i == 1) {
                    str2 = "default";
                } else if (i == 2) {
                    str2 = "remote";
                }
            }
            map3.put("source", str2);
            map2.put(str, map3);
        }
        return map2;
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public final Task didReinitializeFirebaseCore() {
        sb.g gVar = new sb.g();
        FlutterFirebasePlugin.cachedThreadPool.execute(new c0(18, this, gVar));
        sb.m mVar = gVar.f32858a;
        Intrinsics.checkNotNullExpressionValue(mVar, "getTask(...)");
        return mVar;
    }

    @Override // ii.h
    public final void e(Object arguments, ii.g events) {
        he.i iVar;
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(events, "events");
        Object obj = ((Map) arguments).get("appName");
        Objects.requireNonNull(obj);
        String str = (String) obj;
        ge.e eVarB = b(str);
        HashMap map = this.f32123b;
        e eVar = new e(this, events);
        bb.e eVar2 = eVarB.f20131j;
        synchronized (eVar2) {
            ((LinkedHashSet) eVar2.f2019c).add(eVar);
            eVar2.a();
            iVar = new he.i(eVar2, eVar);
        }
        map.put(str, iVar);
    }

    public final void f() {
        HashMap map = this.f32123b;
        for (he.i iVar : map.values()) {
            bb.e eVar = iVar.f20522b;
            e eVar2 = iVar.f20521a;
            synchronized (eVar) {
                ((LinkedHashSet) eVar.f2019c).remove(eVar2);
            }
        }
        map.clear();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public final Task getPluginConstantsForFirebaseApp(fd.g firebaseApp) {
        Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
        sb.g gVar = new sb.g();
        FlutterFirebasePlugin.cachedThreadPool.execute(new pi.c(firebaseApp, this, gVar));
        sb.m mVar = gVar.f32858a;
        Intrinsics.checkNotNullExpressionValue(mVar, "getTask(...)");
        return mVar;
    }

    @Override // ii.h
    public final void k(Object obj) {
        HashMap map = this.f32123b;
        Map map2 = obj instanceof Map ? (Map) obj : null;
        if (map2 == null) {
            return;
        }
        Object obj2 = map2.get("appName");
        Objects.requireNonNull(obj2);
        String str = (String) obj2;
        he.i iVar = (he.i) map.get(str);
        if (iVar != null) {
            bb.e eVar = iVar.f20522b;
            e eVar2 = iVar.f20521a;
            synchronized (eVar) {
                ((LinkedHashSet) eVar.f2019c).remove(eVar2);
            }
            map.remove(str);
        }
    }

    @Override // ei.b
    public final void onAttachedToEngine(ei.a binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        ii.f fVar = binding.f16383c;
        Intrinsics.checkNotNullExpressionValue(fVar, "getBinaryMessenger(...)");
        c.b(d.Y1, fVar, this);
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_remote_config", this);
        i iVar = new i(fVar, "plugins.flutter.io/firebase_remote_config_updated");
        this.f32124c = iVar;
        iVar.a(this);
        this.f32126e = fVar;
    }

    @Override // ei.b
    public final void onDetachedFromEngine(ei.a binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        ii.f fVar = this.f32126e;
        if (fVar == null) {
            throw new IllegalStateException("Required value was null.");
        }
        c.b(d.Y1, fVar, null);
        this.f32126e = null;
        i iVar = this.f32124c;
        Intrinsics.b(iVar);
        iVar.a(null);
        this.f32124c = null;
        f();
    }
}
