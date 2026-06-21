package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class fd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f5329a = new HashMap();

    public final synchronized void a(String str, pq0 pq0Var) {
        kq0 kq0Var;
        ts tsVarN;
        if (this.f5329a.containsKey(str)) {
            return;
        }
        ts tsVarT0 = null;
        if (pq0Var == null) {
            tsVarN = null;
        } else {
            try {
                tsVarN = pq0Var.f9154a.N();
            } finally {
                try {
                } catch (kq0 unused) {
                }
            }
        }
        if (pq0Var != null) {
            try {
                tsVarT0 = pq0Var.f9154a.t0();
            } finally {
                try {
                } catch (kq0 unused2) {
                }
            }
        }
        boolean z5 = true;
        if (((Boolean) q9.s.f31967e.f31970c.a(al.Ca)).booleanValue()) {
            if (pq0Var == null) {
                z5 = false;
            } else {
                try {
                    pq0Var.a();
                } catch (kq0 unused3) {
                    z5 = false;
                }
            }
        }
        this.f5329a.put(str, new ed0(str, tsVarN, tsVarT0, z5));
    }

    public final synchronized ed0 b(String str) {
        return (ed0) this.f5329a.get(str);
    }
}
