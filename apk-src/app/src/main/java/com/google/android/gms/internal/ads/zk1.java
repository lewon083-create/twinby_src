package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zk1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nd1 f13017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ld1 f13018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final tc1 f13019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final rc1 f13020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final tc1 f13021e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final rc1 f13022f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final zd1 f13023g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final zd1 f13024h;

    static {
        sl1 sl1VarA = ge1.a("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
        sl1 sl1VarA2 = ge1.a("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey");
        f13017a = new nd1(gk1.class, nk1.f8351z);
        f13018b = new ld1(sl1VarA, nk1.f8346u);
        f13019c = new tc1(ik1.class, nk1.f8347v);
        f13020d = new rc1(sl1VarA2, nk1.f8348w);
        f13021e = new tc1(hk1.class, nk1.f8349x);
        f13022f = new rc1(sl1VarA, nk1.f8350y);
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ei1 ei1Var = ei1.RAW;
        fk1 fk1Var = fk1.f5377e;
        map.put(ei1Var, fk1Var);
        map2.put(fk1Var, ei1Var);
        ei1 ei1Var2 = ei1.TINK;
        fk1 fk1Var2 = fk1.f5374b;
        map.put(ei1Var2, fk1Var2);
        map2.put(fk1Var2, ei1Var2);
        ei1 ei1Var3 = ei1.CRUNCHY;
        fk1 fk1Var3 = fk1.f5375c;
        map.put(ei1Var3, fk1Var3);
        map2.put(fk1Var3, ei1Var3);
        ei1 ei1Var4 = ei1.LEGACY;
        fk1 fk1Var4 = fk1.f5376d;
        map.put(ei1Var4, fk1Var4);
        map2.put(fk1Var4, ei1Var4);
        f13023g = new zd1(25, (Object) Collections.unmodifiableMap(map), (Object) Collections.unmodifiableMap(map2), false);
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        bh1 bh1Var = bh1.SHA256;
        ek1 ek1Var = ek1.f4988b;
        map3.put(bh1Var, ek1Var);
        map4.put(ek1Var, bh1Var);
        bh1 bh1Var2 = bh1.SHA384;
        ek1 ek1Var2 = ek1.f4989c;
        map3.put(bh1Var2, ek1Var2);
        map4.put(ek1Var2, bh1Var2);
        bh1 bh1Var3 = bh1.SHA512;
        ek1 ek1Var3 = ek1.f4990d;
        map3.put(bh1Var3, ek1Var3);
        map4.put(ek1Var3, bh1Var3);
        f13024h = new zd1(25, (Object) Collections.unmodifiableMap(map3), (Object) Collections.unmodifiableMap(map4), false);
    }

    public static ri1 a(gk1 gk1Var) {
        qi1 qi1VarC = ri1.C();
        ek1 ek1Var = gk1Var.f5842d;
        zd1 zd1Var = f13024h;
        bh1 bh1Var = (bh1) zd1Var.s(ek1Var);
        qi1VarC.b();
        ((ri1) qi1VarC.f9560c).E(bh1Var);
        bh1 bh1Var2 = (bh1) zd1Var.s(gk1Var.f5843e);
        qi1VarC.b();
        ((ri1) qi1VarC.f9560c).F(bh1Var2);
        int i = gk1Var.f5844f;
        qi1VarC.b();
        ((ri1) qi1VarC.f9560c).G(i);
        return (ri1) qi1VarC.d();
    }

    public static vi1 b(ik1 ik1Var) {
        ui1 ui1VarE = vi1.E();
        ri1 ri1VarA = a(ik1Var.f6522d);
        ui1VarE.b();
        ((vi1) ui1VarE.f9560c).I(ri1VarA);
        byte[] bArrO = fs1.o(ik1Var.f6523e);
        zm1 zm1Var = bn1.f3837c;
        zm1 zm1VarA = bn1.A(bArrO, 0, bArrO.length);
        ui1VarE.b();
        ((vi1) ui1VarE.f9560c).J(zm1VarA);
        byte[] bArrO2 = fs1.o(ik1Var.f6522d.f5840b);
        zm1 zm1VarA2 = bn1.A(bArrO2, 0, bArrO2.length);
        ui1VarE.b();
        ((vi1) ui1VarE.f9560c).K(zm1VarA2);
        ui1VarE.b();
        ((vi1) ui1VarE.f9560c).H(0);
        return (vi1) ui1VarE.d();
    }

    public static in0 c(bn1 bn1Var) {
        return new in0(12, new BigInteger(1, bn1Var.D()));
    }
}
