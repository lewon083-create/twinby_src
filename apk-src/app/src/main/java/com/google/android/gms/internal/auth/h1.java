package com.google.android.gms.internal.auth;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h1 f13228c = new h1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f13230b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w0 f13229a = new w0();

    public final k1 a(Class cls) {
        k1 k1VarO;
        Class cls2;
        Charset charset = o0.f13269a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f13230b;
        k1 k1Var = (k1) concurrentHashMap.get(cls);
        if (k1Var != null) {
            return k1Var;
        }
        w0 w0Var = this.f13229a;
        w0Var.getClass();
        Class cls3 = l1.f13257a;
        if (!l0.class.isAssignableFrom(cls) && (cls2 = l1.f13257a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        j1 j1VarC = ((v0) w0Var.f13295c).c(cls);
        int i = j1VarC.f13249c;
        b0 b0Var = j1VarC.f13247a;
        if ((i & 2) == 2) {
            if (l0.class.isAssignableFrom(cls)) {
                k1VarO = new d1(l1.f13259c, j0.f13245a, b0Var);
            } else {
                o1 o1Var = l1.f13258b;
                i0 i0Var = j0.f13246b;
                if (i0Var == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                k1VarO = new d1(o1Var, i0Var, b0Var);
            }
        } else if (l0.class.isAssignableFrom(cls)) {
            if (((j1VarC.f13249c & 1) != 0 ? 1 : 2) - 1 != 1) {
                int i10 = f1.f13207a;
                t0 t0Var = u0.f13289b;
                o1 o1Var2 = l1.f13259c;
                i0 i0Var2 = j0.f13245a;
                int i11 = z0.f13313a;
                k1VarO = c1.o(j1VarC, t0Var, o1Var2);
            } else {
                int i12 = f1.f13207a;
                t0 t0Var2 = u0.f13289b;
                o1 o1Var3 = l1.f13259c;
                int i13 = z0.f13313a;
                k1VarO = c1.o(j1VarC, t0Var2, o1Var3);
            }
        } else {
            if (((j1VarC.f13249c & 1) != 0 ? 1 : 2) - 1 != 1) {
                int i14 = f1.f13207a;
                s0 s0Var = u0.f13288a;
                o1 o1Var4 = l1.f13258b;
                if (j0.f13246b == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                int i15 = z0.f13313a;
                k1VarO = c1.o(j1VarC, s0Var, o1Var4);
            } else {
                int i16 = f1.f13207a;
                s0 s0Var2 = u0.f13288a;
                o1 o1Var5 = l1.f13258b;
                int i17 = z0.f13313a;
                k1VarO = c1.o(j1VarC, s0Var2, o1Var5);
            }
        }
        k1 k1Var2 = (k1) concurrentHashMap.putIfAbsent(cls, k1VarO);
        return k1Var2 == null ? k1VarO : k1Var2;
    }
}
