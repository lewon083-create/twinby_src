package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class yd0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f12597e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final wd0 f12598f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f12594b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12595c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12596d = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t9.e0 f12593a = p9.k.C.f31302h.g();

    public yd0(wd0 wd0Var, String str) {
        this.f12597e = str;
        this.f12598f = wd0Var;
    }

    public final synchronized void a(String str) {
        if (((Boolean) q9.s.f31967e.f31970c.a(al.f3250w2)).booleanValue()) {
            HashMap mapE = e();
            mapE.put("action", "adapter_init_started");
            mapE.put("ancn", str);
            this.f12594b.add(mapE);
        }
    }

    public final synchronized void b(String str) {
        if (((Boolean) q9.s.f31967e.f31970c.a(al.f3250w2)).booleanValue()) {
            HashMap mapE = e();
            mapE.put("action", "adapter_init_finished");
            mapE.put("ancn", str);
            this.f12594b.add(mapE);
        }
    }

    public final synchronized void c(String str, String str2) {
        if (((Boolean) q9.s.f31967e.f31970c.a(al.f3250w2)).booleanValue()) {
            HashMap mapE = e();
            mapE.put("action", "adapter_init_finished");
            mapE.put("ancn", str);
            mapE.put("rqe", str2);
            this.f12594b.add(mapE);
        }
    }

    public final synchronized void d() {
        if (((Boolean) q9.s.f31967e.f31970c.a(al.f3250w2)).booleanValue() && !this.f12595c) {
            HashMap mapE = e();
            mapE.put("action", "init_started");
            this.f12594b.add(mapE);
            this.f12595c = true;
        }
    }

    public final HashMap e() {
        wd0 wd0Var = this.f12598f;
        wd0Var.getClass();
        HashMap map = new HashMap(wd0Var.f11747a);
        p9.k.C.f31304k.getClass();
        map.put("tms", Long.toString(SystemClock.elapsedRealtime(), 10));
        map.put("tid", this.f12593a.t() ? "" : this.f12597e);
        return map;
    }
}
