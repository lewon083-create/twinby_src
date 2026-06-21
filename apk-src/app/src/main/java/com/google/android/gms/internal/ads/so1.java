package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class so1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final so1 f10369c = new so1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f10371b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kx0 f10370a = new kx0(1);

    public final yo1 a(Class cls) {
        yo1 yo1VarZ;
        Charset charset = ao1.f3341a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f10371b;
        yo1 yo1Var = (yo1) concurrentHashMap.get(cls);
        if (yo1Var != null) {
            return yo1Var;
        }
        kx0 kx0Var = this.f10370a;
        kx0Var.getClass();
        c6 c6Var = zo1.f13054a;
        if (!sn1.class.isAssignableFrom(cls)) {
            int i = tm1.f10663a;
        }
        uo1 uo1VarD = ((nu0) kx0Var.f7326c).d(cls);
        if ((uo1VarD.f11038d & 2) == 2) {
            int i10 = tm1.f10663a;
            c6 c6Var2 = zo1.f13054a;
            jl1 jl1Var = ln1.f7586a;
            yo1VarZ = new oo1(c6Var2, uo1VarD.f11035a);
        } else {
            int i11 = tm1.f10663a;
            int i12 = po1.f9143a;
            int i13 = go1.f5885a;
            c6 c6Var3 = zo1.f13054a;
            jl1 jl1Var2 = uo1VarD.a() + (-1) != 1 ? ln1.f7586a : null;
            int i14 = ko1.f7276a;
            yo1VarZ = no1.z(uo1VarD, c6Var3, jl1Var2);
        }
        yo1 yo1Var2 = (yo1) concurrentHashMap.putIfAbsent(cls, yo1VarZ);
        return yo1Var2 != null ? yo1Var2 : yo1VarZ;
    }
}
