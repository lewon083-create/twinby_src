package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import io.sentry.SentryLockReason;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class gd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oq0 f5781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fd0 f5782b;

    public gd0(oq0 oq0Var, fd0 fd0Var) {
        this.f5781a = oq0Var;
        this.f5782b = fd0Var;
    }

    public final pq0 a(String str, JSONObject jSONObject) {
        kr krVarW;
        fd0 fd0Var = this.f5782b;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                krVarW = new yr(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                krVarW = new yr(new zzbwl());
            } else {
                ir irVar = (ir) ((AtomicReference) this.f5781a.f8764e).get();
                if (irVar == null) {
                    u9.i.h("Unexpected call to adapter creator.");
                    throw new RemoteException();
                }
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString(SentryLockReason.JsonKeys.CLASS_NAME);
                        krVarW = irVar.Q(string) ? irVar.w("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") : irVar.F(string) ? irVar.w(string) : irVar.w("com.google.ads.mediation.customevent.CustomEventAdapter");
                    } catch (JSONException e3) {
                        u9.i.f("Invalid custom event.", e3);
                        krVarW = irVar.w(str);
                    }
                } else {
                    krVarW = irVar.w(str);
                }
            }
            pq0 pq0Var = new pq0(krVarW);
            fd0Var.a(str, pq0Var);
            return pq0Var;
        } catch (Throwable th2) {
            if (((Boolean) q9.s.f31967e.f31970c.a(al.Ca)).booleanValue()) {
                fd0Var.a(str, null);
            }
            throw new kq0(th2);
        }
    }

    public final os b(String str) {
        ir irVar = (ir) ((AtomicReference) this.f5781a.f8764e).get();
        if (irVar == null) {
            u9.i.h("Unexpected call to adapter creator.");
            throw new RemoteException();
        }
        os osVarD = irVar.D(str);
        fd0 fd0Var = this.f5782b;
        synchronized (fd0Var) {
            if (fd0Var.f5329a.containsKey(str)) {
                return osVarD;
            }
            try {
                fd0Var.f5329a.put(str, new ed0(str, osVarD.c(), osVarD.k(), true));
                return osVarD;
            } catch (Throwable unused) {
                return osVarD;
            }
        }
    }
}
