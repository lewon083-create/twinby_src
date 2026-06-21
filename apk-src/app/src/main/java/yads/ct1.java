package yads;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ct1 implements ko2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f37494e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ko2 f37495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f37496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f37497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ij.g f37498d;

    public ct1(gh ghVar, ij.g gVar, boolean z5, Executor executor) {
        this.f37495a = ghVar;
        this.f37496b = z5;
        this.f37497c = executor;
        this.f37498d = gVar;
    }

    public static void a(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.collections.i0.b(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), kotlin.collections.p.v((Object[]) entry.getValue()));
        }
        linkedHashMap.toString();
    }

    @Override // yads.ko2
    public final void reportAnr(Map map) {
        if (this.f37495a != null) {
            this.f37497c.execute(new t.v0(25, this, map));
        }
    }

    @Override // yads.sm0
    public final void reportError(String str, Throwable th2) {
        if (!this.f37496b || this.f37495a == null) {
            return;
        }
        this.f37497c.execute(new q0.o(this, str, th2, 17));
    }

    @Override // yads.ko2
    public final void reportUnhandledException(Throwable th2) {
        if (this.f37495a != null) {
            this.f37497c.execute(new t.v0(26, this, th2));
        }
    }

    public static void a(String str, Throwable th2) {
        Objects.toString(th2);
    }

    public static void a(String str, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.collections.i0.b(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object[] objArr = {entry.getValue()};
            StringBuilder sb2 = new StringBuilder(7);
            kotlin.collections.n.b(objArr, sb2, new ArrayList());
            linkedHashMap.put(key, sb2.toString());
        }
        linkedHashMap.toString();
    }

    public static void a(Throwable th2) {
        Objects.toString(th2);
    }

    public static final void a(ct1 ct1Var, Map map) {
        try {
            ct1Var.getClass();
            a(map);
            ct1Var.f37495a.reportAnr(map);
        } catch (Throwable unused) {
        }
    }

    public static final void a(ct1 ct1Var, String str, Throwable th2) {
        try {
            ct1Var.getClass();
            a(str, th2);
            ct1Var.f37495a.reportError(str, th2);
        } catch (Throwable unused) {
        }
    }

    @Override // yads.ko2
    public final void a(go2 go2Var) {
        if (this.f37495a != null) {
            this.f37497c.execute(new t.v0(24, this, go2Var));
        }
    }

    public static final void a(ct1 ct1Var, go2 go2Var) {
        try {
            ac3.a((ru3) ct1Var.f37498d.getValue(), go2Var);
            a(go2Var.f38838a, go2Var.f38839b);
            ct1Var.f37495a.a(go2Var);
        } catch (Throwable unused) {
        }
    }

    public static final void a(ct1 ct1Var, Throwable th2) {
        try {
            ct1Var.getClass();
            a(th2);
            ct1Var.f37495a.reportUnhandledException(th2);
        } catch (Throwable unused) {
        }
    }
}
