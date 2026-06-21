package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e20 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f20 f4795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Runnable f4796d;

    public /* synthetic */ e20(f20 f20Var, Runnable runnable, int i) {
        this.f4794b = i;
        this.f4795c = f20Var;
        this.f4796d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kq0 kq0Var;
        switch (this.f4794b) {
            case 0:
                hx.f6284f.execute(new e20(this.f4795c, this.f4796d, 1));
                return;
            default:
                pa.c0.e("Adapters must be initialized on the main thread.");
                HashMap map = p9.k.C.f31302h.g().n().f12768c;
                if (map.isEmpty()) {
                    return;
                }
                Runnable runnable = this.f4796d;
                if (runnable != null) {
                    try {
                        runnable.run();
                    } catch (Throwable th2) {
                        u9.i.i("Could not initialize rewarded ads.", th2);
                        return;
                    }
                    break;
                }
                f20 f20Var = this.f4795c;
                if (((ir) ((AtomicReference) f20Var.f5184d.f5781a.f8764e).get()) != null) {
                    HashMap map2 = new HashMap();
                    Iterator it = map.values().iterator();
                    while (it.hasNext()) {
                        for (dr drVar : ((er) it.next()).f5056a) {
                            String str = drVar.f4632b;
                            for (String str2 : drVar.f4631a) {
                                if (!map2.containsKey(str2)) {
                                    map2.put(str2, new ArrayList());
                                }
                                if (str != null) {
                                    ((List) map2.get(str2)).add(str);
                                }
                            }
                        }
                    }
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry entry : map2.entrySet()) {
                        String str3 = (String) entry.getKey();
                        try {
                            ci0 ci0VarA = f20Var.f5185e.a(str3, jSONObject);
                            if (ci0VarA != null) {
                                pq0 pq0Var = (pq0) ci0VarA.f4217b;
                                boolean zA = pq0Var.a();
                                kr krVar = pq0Var.f9154a;
                                if (!zA) {
                                    try {
                                        if (krVar.G()) {
                                            try {
                                                krVar.Y1(new xa.b(f20Var.f5182b), (xi0) ci0VarA.f4218c, (List) entry.getValue());
                                                StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 45);
                                                sb2.append("Initialized rewarded video mediation adapter ");
                                                sb2.append(str3);
                                                u9.i.c(sb2.toString());
                                            } finally {
                                            }
                                        }
                                    } finally {
                                    }
                                }
                            }
                        } catch (kq0 e3) {
                            StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 56);
                            sb3.append("Failed to initialize rewarded video mediation adapter \"");
                            sb3.append(str3);
                            sb3.append("\"");
                            u9.i.i(sb3.toString(), e3);
                        }
                    }
                    return;
                }
                return;
        }
    }
}
