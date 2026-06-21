package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rk1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nd1 f9950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ld1 f9951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final tc1 f9952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final rc1 f9953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final tc1 f9954e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final rc1 f9955f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final zd1 f9956g;

    static {
        sl1 sl1VarA = ge1.a("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
        sl1 sl1VarA2 = ge1.a("type.googleapis.com/google.crypto.tink.Ed25519PublicKey");
        f9950a = new nd1(mj1.class, nk1.f8339n);
        f9951b = new ld1(sl1VarA, nk1.i);
        f9952c = new tc1(pj1.class, nk1.f8335j);
        f9953d = new rc1(sl1VarA2, nk1.f8336k);
        f9954e = new tc1(nj1.class, nk1.f8337l);
        f9955f = new rc1(sl1VarA, nk1.f8338m);
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ei1 ei1Var = ei1.RAW;
        lj1 lj1Var = lj1.f7549e;
        map.put(ei1Var, lj1Var);
        map2.put(lj1Var, ei1Var);
        ei1 ei1Var2 = ei1.TINK;
        lj1 lj1Var2 = lj1.f7546b;
        map.put(ei1Var2, lj1Var2);
        map2.put(lj1Var2, ei1Var2);
        ei1 ei1Var3 = ei1.CRUNCHY;
        lj1 lj1Var3 = lj1.f7547c;
        map.put(ei1Var3, lj1Var3);
        map2.put(lj1Var3, ei1Var3);
        ei1 ei1Var4 = ei1.LEGACY;
        lj1 lj1Var4 = lj1.f7548d;
        map.put(ei1Var4, lj1Var4);
        map2.put(lj1Var4, ei1Var4);
        f9956g = new zd1(25, (Object) Collections.unmodifiableMap(map), (Object) Collections.unmodifiableMap(map2), false);
    }

    public static ah1 a(pj1 pj1Var) {
        zg1 zg1VarC = ah1.C();
        byte[] bArrB = pj1Var.f9077e.b();
        zm1 zm1VarA = bn1.A(bArrB, 0, bArrB.length);
        zg1VarC.b();
        ((ah1) zg1VarC.f9560c).F(zm1VarA);
        return (ah1) zg1VarC.d();
    }
}
