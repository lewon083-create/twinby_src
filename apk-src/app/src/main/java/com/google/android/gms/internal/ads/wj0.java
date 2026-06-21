package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class wj0 implements bi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gd0 f11816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f11817c;

    public wj0(jk0 jk0Var, gd0 gd0Var) {
        this.f11815a = 1;
        this.f11817c = jk0Var;
        this.f11816b = gd0Var;
    }

    @Override // com.google.android.gms.internal.ads.bi0
    public final ci0 a(String str, JSONObject jSONObject) {
        ci0 ci0Var;
        os osVarB;
        switch (this.f11815a) {
            case 0:
                synchronized (this) {
                    try {
                        HashMap map = (HashMap) this.f11817c;
                        ci0Var = (ci0) map.get(str);
                        if (ci0Var == null) {
                            ci0Var = new ci0(this.f11816b.a(str, jSONObject), new xi0(), str);
                            map.put(str, ci0Var);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return ci0Var;
            default:
                if (((Boolean) q9.s.f31967e.f31970c.a(al.b2)).booleanValue()) {
                    try {
                        osVarB = this.f11816b.b(str);
                    } catch (RemoteException e3) {
                        u9.i.f("Coundn't create RTB adapter: ", e3);
                    }
                    break;
                } else {
                    ConcurrentHashMap concurrentHashMap = ((jk0) this.f11817c).f6863a;
                    osVarB = concurrentHashMap.containsKey(str) ? (os) concurrentHashMap.get(str) : null;
                }
                if (osVarB == null) {
                    return null;
                }
                return new ci0(osVarB, new wi0(), str);
        }
    }

    public wj0(gd0 gd0Var) {
        this.f11815a = 0;
        this.f11817c = new HashMap();
        this.f11816b = gd0Var;
    }
}
