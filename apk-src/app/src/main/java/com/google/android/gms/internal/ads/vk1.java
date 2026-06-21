package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vk1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nd1 f11404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ld1 f11405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final tc1 f11406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final rc1 f11407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final tc1 f11408e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final rc1 f11409f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final zd1 f11410g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final zd1 f11411h;

    static {
        sl1 sl1VarA = ge1.a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
        sl1 sl1VarA2 = ge1.a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey");
        f11404a = new nd1(yj1.class, nk1.f8345t);
        f11405b = new ld1(sl1VarA, nk1.f8340o);
        f11406c = new tc1(bk1.class, nk1.f8341p);
        f11407d = new rc1(sl1VarA2, nk1.f8342q);
        f11408e = new tc1(ak1.class, nk1.f8343r);
        f11409f = new rc1(sl1VarA, nk1.f8344s);
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ei1 ei1Var = ei1.RAW;
        xj1 xj1Var = xj1.f12173e;
        map.put(ei1Var, xj1Var);
        map2.put(xj1Var, ei1Var);
        ei1 ei1Var2 = ei1.TINK;
        xj1 xj1Var2 = xj1.f12170b;
        map.put(ei1Var2, xj1Var2);
        map2.put(xj1Var2, ei1Var2);
        ei1 ei1Var3 = ei1.CRUNCHY;
        xj1 xj1Var3 = xj1.f12171c;
        map.put(ei1Var3, xj1Var3);
        map2.put(xj1Var3, ei1Var3);
        ei1 ei1Var4 = ei1.LEGACY;
        xj1 xj1Var4 = xj1.f12172d;
        map.put(ei1Var4, xj1Var4);
        map2.put(xj1Var4, ei1Var4);
        f11410g = new zd1(25, (Object) Collections.unmodifiableMap(map), (Object) Collections.unmodifiableMap(map2), false);
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        bh1 bh1Var = bh1.SHA256;
        wj1 wj1Var = wj1.f11818b;
        map3.put(bh1Var, wj1Var);
        map4.put(wj1Var, bh1Var);
        bh1 bh1Var2 = bh1.SHA384;
        wj1 wj1Var2 = wj1.f11819c;
        map3.put(bh1Var2, wj1Var2);
        map4.put(wj1Var2, bh1Var2);
        bh1 bh1Var3 = bh1.SHA512;
        wj1 wj1Var3 = wj1.f11820d;
        map3.put(bh1Var3, wj1Var3);
        map4.put(wj1Var3, bh1Var3);
        f11411h = new zd1(25, (Object) Collections.unmodifiableMap(map3), (Object) Collections.unmodifiableMap(map4), false);
    }

    public static ni1 a(bk1 bk1Var) {
        mi1 mi1VarE = ni1.E();
        yj1 yj1Var = bk1Var.f3804d;
        ii1 ii1VarA = ji1.A();
        bh1 bh1Var = (bh1) f11411h.s(yj1Var.f12639d);
        ii1VarA.b();
        ((ji1) ii1VarA.f9560c).C(bh1Var);
        ji1 ji1Var = (ji1) ii1VarA.d();
        mi1VarE.b();
        ((ni1) mi1VarE.f9560c).H(ji1Var);
        byte[] bArrO = fs1.o(bk1Var.f3805e);
        zm1 zm1Var = bn1.f3837c;
        zm1 zm1VarA = bn1.A(bArrO, 0, bArrO.length);
        mi1VarE.b();
        ((ni1) mi1VarE.f9560c).I(zm1VarA);
        byte[] bArrO2 = fs1.o(bk1Var.f3804d.f12637b);
        zm1 zm1VarA2 = bn1.A(bArrO2, 0, bArrO2.length);
        mi1VarE.b();
        ((ni1) mi1VarE.f9560c).J(zm1VarA2);
        return (ni1) mi1VarE.d();
    }

    public static in0 b(bn1 bn1Var) {
        return new in0(12, new BigInteger(1, bn1Var.D()));
    }
}
