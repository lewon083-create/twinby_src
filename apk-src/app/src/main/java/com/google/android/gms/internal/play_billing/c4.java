package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c4 f14151c = new c4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f14153b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t3 f14152a = new t3();

    public final f4 a(Class cls) {
        f4 f4VarU;
        Charset charset = l3.f14238a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f14153b;
        f4 f4Var = (f4) concurrentHashMap.get(cls);
        if (f4Var != null) {
            return f4Var;
        }
        t3 t3Var = this.f14152a;
        t3Var.getClass();
        e3 e3Var = g4.f14200a;
        g3.class.isAssignableFrom(cls);
        e4 e4VarC = ((t3) t3Var.f14315a).c(cls);
        if ((e4VarC.f14174d & 2) == 2) {
            e3 e3Var2 = g4.f14200a;
            e3 e3Var3 = a3.f14133a;
            f4VarU = new z3(e3Var2, e4VarC.f14171a);
        } else {
            int i = a4.f14134a;
            int i10 = r3.f14296a;
            e3 e3Var4 = g4.f14200a;
            e3 e3Var5 = e4VarC.a() + (-1) != 1 ? a3.f14133a : null;
            int i11 = v3.f14340a;
            f4VarU = y3.u(e4VarC, e3Var4, e3Var5);
        }
        f4 f4Var2 = (f4) concurrentHashMap.putIfAbsent(cls, f4VarU);
        return f4Var2 == null ? f4VarU : f4Var2;
    }
}
