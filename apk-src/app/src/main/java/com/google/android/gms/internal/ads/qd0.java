package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class qd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f9459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dx f9460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final iq0 f9461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final xe f9462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f9463e;

    public qd0(Context context, wd0 wd0Var, dx dxVar, iq0 iq0Var, String str, String str2, xe xeVar) {
        ActivityManager.MemoryInfo memoryInfoI;
        q9.d3 d3Var = iq0Var.f6572d;
        this.f9463e = new Bundle();
        wd0Var.getClass();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(wd0Var.f11747a);
        this.f9459a = concurrentHashMap;
        this.f9460b = dxVar;
        this.f9461c = iq0Var;
        this.f9462d = xeVar;
        concurrentHashMap.put("ad_format", str2.toUpperCase(Locale.ROOT));
        c();
        wk wkVar = al.B2;
        q9.s sVar = q9.s.f31967e;
        yk ykVar = sVar.f31970c;
        yk ykVar2 = sVar.f31970c;
        if (((Boolean) ykVar.a(wkVar)).booleanValue()) {
            Runtime runtime = Runtime.getRuntime();
            b("rt_f", String.valueOf(runtime.freeMemory()));
            b("rt_m", String.valueOf(runtime.maxMemory()));
            b("rt_t", String.valueOf(runtime.totalMemory()));
            b("wv_c", String.valueOf(p9.k.C.f31302h.f3949k.get()));
            if (((Boolean) ykVar2.a(al.J2)).booleanValue() && (memoryInfoI = u9.d.i(context)) != null) {
                b("mem_avl", String.valueOf(memoryInfoI.availMem));
                b("mem_tt", String.valueOf(memoryInfoI.totalMem));
                b("low_m", true != memoryInfoI.lowMemory ? CommonUrlParts.Values.FALSE_INTEGER : "1");
            }
        }
        if (((Boolean) ykVar2.a(al.L2)).booleanValue()) {
            b("ad_unit_id", iq0Var.f6575g);
        }
        if (((Boolean) ykVar2.a(al.I7)).booleanValue()) {
            int iA = hl.l.A(iq0Var) - 1;
            if (iA == 0) {
                concurrentHashMap.put(CommonUrlParts.REQUEST_ID, str);
                concurrentHashMap.put("scar", "false");
                return;
            }
            if (iA == 1) {
                concurrentHashMap.put(CommonUrlParts.REQUEST_ID, str);
                concurrentHashMap.put("se", "query_g");
            } else if (iA == 2) {
                concurrentHashMap.put("se", "r_adinfo");
            } else if (iA != 3) {
                concurrentHashMap.put("se", "r_both");
            } else {
                concurrentHashMap.put("se", "r_adstring");
            }
            concurrentHashMap.put("scar", "true");
            b("ragent", d3Var.f31815q);
            b("rtype", hl.l.w(hl.l.x(d3Var)));
        }
    }

    public final void a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey("cnt")) {
            b("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            b("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }

    public final void b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.f9459a.put(str, str2);
    }

    public final void c() {
        if (((Boolean) q9.s.f31967e.f31970c.a(al.Ma)).booleanValue()) {
            ve veVar = this.f9462d.f12136b;
            boolean z5 = veVar instanceof p9.e;
            ConcurrentHashMap concurrentHashMap = this.f9459a;
            if (z5) {
                int i = ((p9.e) veVar).f31277p;
                int i10 = i - 1;
                if (i == 0) {
                    throw null;
                }
                concurrentHashMap.put("asv", i10 != 0 ? "2" : "1");
                return;
            }
            if (!(veVar instanceof x00)) {
                concurrentHashMap.put("asv", "NA");
                return;
            }
            cz0 cz0Var = (cz0) ((rx0) ((x00) veVar).f11958c.f5837c).f10078b.f5992g.get();
            int iK = (cz0Var == null ? 1 : cz0Var.k()) - 1;
            concurrentHashMap.put("asv", iK != 1 ? iK != 2 ? iK != 3 ? "uns" : "3.0" : "2.0" : "1.0");
        }
    }
}
