package io.flutter.plugins.firebase.core;

import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import oi.f;
import pi.c;
import sb.g;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Keep
public class FlutterFirebasePluginRegistry {
    private static final Map<String, FlutterFirebasePlugin> registeredPlugins = new WeakHashMap();

    public static Task<Void> didReinitializeFirebaseCore() {
        g gVar = new g();
        FlutterFirebasePlugin.cachedThreadPool.execute(new f(2, gVar));
        return gVar.f32858a;
    }

    public static Task<Map<String, Object>> getPluginConstantsForFirebaseApp(fd.g gVar) {
        g gVar2 = new g();
        FlutterFirebasePlugin.cachedThreadPool.execute(new c(gVar, gVar2, 1));
        return gVar2.f32858a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$didReinitializeFirebaseCore$1(g gVar) {
        try {
            Iterator<Map.Entry<String, FlutterFirebasePlugin>> it = registeredPlugins.entrySet().iterator();
            while (it.hasNext()) {
                b4.b(it.next().getValue().didReinitializeFirebaseCore());
            }
            gVar.b(null);
        } catch (Exception e3) {
            gVar.a(e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getPluginConstantsForFirebaseApp$0(fd.g gVar, g gVar2) {
        try {
            Map<String, FlutterFirebasePlugin> map = registeredPlugins;
            HashMap map2 = new HashMap(map.size());
            for (Map.Entry<String, FlutterFirebasePlugin> entry : map.entrySet()) {
                map2.put(entry.getKey(), b4.b(entry.getValue().getPluginConstantsForFirebaseApp(gVar)));
            }
            gVar2.b(map2);
        } catch (Exception e3) {
            gVar2.a(e3);
        }
    }

    public static void registerPlugin(String str, FlutterFirebasePlugin flutterFirebasePlugin) {
        registeredPlugins.put(str, flutterFirebasePlugin);
    }
}
