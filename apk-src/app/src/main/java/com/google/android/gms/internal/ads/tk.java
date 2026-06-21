package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tk implements Callable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ tk f10631c = new tk(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ tk f10632d = new tk(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ tk f10633e = new tk(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ tk f10634f = new tk(6);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ tk f10635g = new tk(7);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10636b;

    public /* synthetic */ tk(int i) {
        this.f10636b = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        switch (this.f10636b) {
            case 0:
                return Boolean.valueOf("mounted".equals(Environment.getExternalStorageState()));
            case 1:
                p9.k kVar = p9.k.C;
                kVar.f31304k.getClass();
                return new km0(System.currentTimeMillis() - kVar.f31302h.g().n().f12771f);
            case 2:
                p9.k kVar2 = p9.k.C;
                t9.l lVar = kVar2.f31308o;
                synchronized (lVar.f33626a) {
                    str = lVar.f33628c;
                    break;
                }
                return new qm0(str, kVar2.f31308o.h());
            case 3:
                Bundle bundle = new Bundle();
                Runtime runtime = Runtime.getRuntime();
                bundle.putLong("runtime_free", runtime.freeMemory());
                bundle.putLong("runtime_max", runtime.maxMemory());
                bundle.putLong("runtime_total", runtime.totalMemory());
                p9.k kVar3 = p9.k.C;
                bundle.putInt("web_view_count", kVar3.f31302h.f3949k.get());
                if (((Boolean) q9.s.f31967e.f31970c.a(al.Df)).booleanValue()) {
                    ActivityManager.MemoryInfo memoryInfoI = u9.d.i(kVar3.f31302h.f3944e);
                    if (memoryInfoI != null) {
                        if (Build.VERSION.SDK_INT >= 34) {
                            bundle.putLong("a_ad_mem", memoryInfoI.advertisedMem);
                        }
                        bundle.putLong("a_total", memoryInfoI.totalMem);
                        bundle.putLong("a_avai", memoryInfoI.availMem);
                        bundle.putLong("a_threshold", memoryInfoI.threshold);
                        bundle.putBoolean("a_is_low_mem", memoryInfoI.lowMemory);
                    }
                    bundle.putLong("runtime_avai_processors", runtime.availableProcessors());
                }
                return new pl0(1, bundle);
            case 4:
                wk wkVar = al.f2922a6;
                q9.s sVar = q9.s.f31967e;
                if (!((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
                    return new kl0(null, 3);
                }
                if (!((Boolean) sVar.f31970c.a(al.f3061j6)).booleanValue()) {
                    p9.k.C.f31317x.getClass();
                    return new kl0(l80.g(), 3);
                }
                if (jm0.f6883c == null) {
                    p9.k.C.f31317x.getClass();
                    jm0.f6883c = l80.g();
                }
                return new kl0(jm0.f6883c, 3);
            case 5:
                return new ul0(2, new JSONObject());
            case 6:
                HashMap map = new HashMap();
                wk wkVar2 = al.f3071k0;
                q9.s sVar2 = q9.s.f31967e;
                String str2 = (String) sVar2.f31970c.a(wkVar2);
                if (str2 != null && !str2.isEmpty()) {
                    if (Build.VERSION.SDK_INT >= ((Integer) sVar2.f31970c.a(al.f3087l0)).intValue()) {
                        for (String str3 : str2.split(StringUtils.COMMA, -1)) {
                            map.put(str3, t9.b0.a(str3));
                        }
                    }
                }
                return new zm0(map, 1);
            default:
                return null;
        }
    }
}
