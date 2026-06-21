package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ei0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public zp0 f4965d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public xp0 f4966e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q9.i3 f4967f = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f4963b = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f4962a = Collections.synchronizedList(new ArrayList());

    public ei0(String str) {
        this.f4964c = str;
    }

    public static String d(xp0 xp0Var) {
        return ((Boolean) q9.s.f31967e.f31970c.a(al.f3106m4)).booleanValue() ? xp0Var.f12255p0 : xp0Var.f12268w;
    }

    public final void a(xp0 xp0Var) {
        String strD = d(xp0Var);
        Map map = this.f4963b;
        Object obj = map.get(strD);
        List list = this.f4962a;
        int iIndexOf = list.indexOf(obj);
        if (iIndexOf < 0 || iIndexOf >= map.size()) {
            iIndexOf = list.indexOf(this.f4967f);
        }
        if (iIndexOf < 0 || iIndexOf >= map.size()) {
            return;
        }
        this.f4967f = (q9.i3) list.get(iIndexOf);
        while (true) {
            iIndexOf++;
            if (iIndexOf >= list.size()) {
                return;
            }
            q9.i3 i3Var = (q9.i3) list.get(iIndexOf);
            i3Var.f31903c = 0L;
            i3Var.f31904d = null;
        }
    }

    public final synchronized void b(xp0 xp0Var, int i) {
        Map map = this.f4963b;
        String strD = d(xp0Var);
        if (map.containsKey(strD)) {
            return;
        }
        Bundle bundle = new Bundle();
        JSONObject jSONObject = xp0Var.f12266v;
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                bundle.putString(next, jSONObject.getString(next));
            } catch (JSONException unused) {
            }
        }
        q9.i3 i3Var = new q9.i3(xp0Var.E, 0L, null, bundle, xp0Var.F, xp0Var.G, xp0Var.H, xp0Var.I);
        try {
            this.f4962a.add(i, i3Var);
        } catch (IndexOutOfBoundsException e3) {
            p9.k.C.f31302h.d("AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation", e3);
        }
        this.f4963b.put(strD, i3Var);
    }

    public final void c(xp0 xp0Var, long j10, q9.x1 x1Var, boolean z5) {
        String strD = d(xp0Var);
        Map map = this.f4963b;
        if (map.containsKey(strD)) {
            if (this.f4966e == null) {
                this.f4966e = xp0Var;
            }
            q9.i3 i3Var = (q9.i3) map.get(strD);
            i3Var.f31903c = j10;
            i3Var.f31904d = x1Var;
            if (((Boolean) q9.s.f31967e.f31970c.a(al.y7)).booleanValue() && z5) {
                this.f4967f = i3Var;
            }
        }
    }
}
