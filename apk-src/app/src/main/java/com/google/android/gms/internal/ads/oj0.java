package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class oj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ua.a f8698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oq0 f8699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bt0 f8700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f8701d = new LinkedHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f8702e = ((Boolean) q9.s.f31967e.f31970c.a(al.C7)).booleanValue();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ei0 f8703f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f8704g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f8705h;
    public long i;

    public oj0(ua.a aVar, oq0 oq0Var, ei0 ei0Var, bt0 bt0Var) {
        this.f8698a = aVar;
        this.f8699b = oq0Var;
        this.f8703f = ei0Var;
        this.f8700c = bt0Var;
    }

    public final synchronized void a(List list) {
        this.f8698a.getClass();
        this.i = SystemClock.elapsedRealtime();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xp0 xp0Var = (xp0) it.next();
            String str = xp0Var.f12268w;
            if (!TextUtils.isEmpty(str)) {
                this.f8701d.put(xp0Var, new nj0(str, xp0Var.f12238f0, Integer.MAX_VALUE, 0L, null));
            }
        }
    }

    public final synchronized void b(eq0 eq0Var, xp0 xp0Var, ed.d dVar, at0 at0Var) {
        zp0 zp0Var = (zp0) eq0Var.f5033b.f4348d;
        this.f8698a.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String str = xp0Var.f12268w;
        if (str != null) {
            this.f8701d.put(xp0Var, new nj0(str, xp0Var.f12238f0, 9, 0L, null));
            mj0 mj0Var = new mj0(this, jElapsedRealtime, zp0Var, xp0Var, str, at0Var, eq0Var);
            dVar.a(new l81(0, dVar, mj0Var), hx.f6285g);
        }
    }

    public final synchronized void c(xp0 xp0Var) {
        nj0 nj0Var = (nj0) this.f8701d.get(xp0Var);
        if (nj0Var == null || this.f8704g) {
            return;
        }
        nj0Var.f8319c = 8;
    }

    public final synchronized String d() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.f8701d.entrySet().iterator();
            while (it.hasNext()) {
                nj0 nj0Var = (nj0) ((Map.Entry) it.next()).getValue();
                if (nj0Var.f8319c != Integer.MAX_VALUE) {
                    arrayList.add(nj0Var.toString());
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return TextUtils.join("_", arrayList);
    }
}
