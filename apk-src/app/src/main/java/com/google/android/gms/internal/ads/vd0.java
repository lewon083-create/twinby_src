package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class vd0 implements sr0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qd0 f11361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ua.a f11362d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f11360b = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f11363e = new HashMap();

    public vd0(qd0 qd0Var, Set set, ua.a aVar) {
        this.f11361c = qd0Var;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ud0 ud0Var = (ud0) it.next();
            HashMap map = this.f11363e;
            ud0Var.getClass();
            map.put(pr0.RENDERER, ud0Var);
        }
        this.f11362d = aVar;
    }

    public final void a(pr0 pr0Var, boolean z5) {
        ud0 ud0Var = (ud0) this.f11363e.get(pr0Var);
        if (ud0Var == null) {
            return;
        }
        String str = true != z5 ? "f." : "s.";
        pr0 pr0Var2 = ud0Var.f10910b;
        HashMap map = this.f11360b;
        if (map.containsKey(pr0Var2)) {
            this.f11362d.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime() - ((Long) map.get(pr0Var2)).longValue();
            String str2 = ud0Var.f10909a;
            ConcurrentHashMap concurrentHashMap = this.f11361c.f9459a;
            StringBuilder sb2 = new StringBuilder(String.valueOf(jElapsedRealtime).length() + 2);
            sb2.append(str);
            sb2.append(jElapsedRealtime);
            concurrentHashMap.put("label.".concat(str2), sb2.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.sr0
    public final void g(pr0 pr0Var, String str, Throwable th2) {
        HashMap map = this.f11360b;
        if (map.containsKey(pr0Var)) {
            this.f11362d.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime() - ((Long) map.get(pr0Var)).longValue();
            this.f11361c.f9459a.put("task.".concat(String.valueOf(str)), "f.".concat(String.valueOf(Long.toString(jElapsedRealtime))));
        }
        if (this.f11363e.containsKey(pr0Var)) {
            a(pr0Var, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.sr0
    public final void x(pr0 pr0Var, String str) {
        this.f11362d.getClass();
        this.f11360b.put(pr0Var, Long.valueOf(SystemClock.elapsedRealtime()));
    }

    @Override // com.google.android.gms.internal.ads.sr0
    public final void y(pr0 pr0Var, String str) {
        HashMap map = this.f11360b;
        if (map.containsKey(pr0Var)) {
            this.f11362d.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime() - ((Long) map.get(pr0Var)).longValue();
            this.f11361c.f9459a.put("task.".concat(String.valueOf(str)), "s.".concat(String.valueOf(Long.toString(jElapsedRealtime))));
        }
        if (this.f11363e.containsKey(pr0Var)) {
            a(pr0Var, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.sr0
    public final void b(String str) {
    }
}
