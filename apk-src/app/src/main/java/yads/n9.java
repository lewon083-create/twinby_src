package yads;

import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class n9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bc f41199a = new bc();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dg2 f41200b = new dg2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ct2 f41201c = new ct2();

    public final ho2 a(g9 g9Var) {
        String str;
        boolean z5;
        ho2 ho2Var = new ho2((Map) null, 3);
        if (g9Var != null) {
            Map map = g9Var.f38682g;
            this.f41199a.getClass();
            HashMap map2 = new HashMap();
            if (!kotlin.jvm.internal.k0.d(map2)) {
                map2 = null;
            }
            if (map2 == null) {
                map2 = new LinkedHashMap();
            }
            if (map != null) {
                String str2 = (String) map.get("adapter_network_name");
                String str3 = (String) map.get("adapter_version");
                String str4 = (String) map.get("adapter_network_sdk_version");
                if (str2 != null) {
                    map2.put("adapter_network_name", str2);
                }
                if (str3 != null) {
                    map2.put("adapter_version", str3);
                }
                if (str4 != null) {
                    map2.put("adapter_network_sdk_version", str4);
                }
            }
            this.f41200b.getClass();
            ag2 ag2Var = (ag2) cg2.f37391a.getValue();
            if (ag2Var != null) {
                int iOrdinal = ag2Var.ordinal();
                if (iOrdinal == 0) {
                    str = PluginErrorDetails.Platform.FLUTTER;
                } else if (iOrdinal == 1) {
                    str = "react-native";
                } else {
                    if (iOrdinal != 2) {
                        throw new ij.j();
                    }
                    str = PluginErrorDetails.Platform.UNITY;
                }
            } else {
                str = map != null ? (String) map.get("plugin_type") : null;
            }
            String str5 = map != null ? (String) map.get("plugin_version") : null;
            jj.i builder = new jj.i();
            if (str != null) {
                builder.put("plugin_type", str);
            }
            if (str5 != null) {
                builder.put("plugin_version", str5);
            }
            Intrinsics.checkNotNullParameter(builder, "builder");
            jj.i iVarB = builder.b();
            String str6 = g9Var.f38686l;
            ct2 ct2Var = this.f41201c;
            ct2Var.getClass();
            HashMap map3 = new HashMap();
            if (!kotlin.jvm.internal.k0.d(map3)) {
                map3 = null;
            }
            if (map3 == null) {
                map3 = new LinkedHashMap();
            }
            gw2 gw2Var = ct2Var.f37499a;
            gw2Var.getClass();
            synchronized (gw2.f38918j) {
                z5 = gw2Var.f38926g;
            }
            map3.put("app_ad_analytics_enabled", Boolean.valueOf(z5));
            ho2Var.f39286a.putAll(map2);
            ho2Var.f39286a.putAll(iVarB);
            ho2Var.a(str6, "preload_type");
            ho2Var.f39286a.putAll(map3);
        }
        String str7 = g9Var != null ? g9Var.f38683h : null;
        if (str7 != null && str7.length() != 0) {
            ho2Var.a("openbidding", "integration_type");
        }
        return ho2Var;
    }
}
