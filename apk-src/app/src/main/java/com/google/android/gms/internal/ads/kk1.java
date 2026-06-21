package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class kk1 {
    static {
        int i = fi1.zza;
        try {
            a();
        } catch (GeneralSecurityException e3) {
            throw new ExceptionInInitializerError(e3);
        }
    }

    public static void a() throws GeneralSecurityException {
        rj1 rj1Var = rj1.f9947a;
        id1 id1Var = id1.f6470b;
        id1Var.b(rj1.f9947a);
        id1Var.a(rj1.f9948b);
        id1Var.b(uj1.f10951a);
        id1Var.a(uj1.f10952b);
        int i = kj1.f7247f;
        if (!gr.x(i)) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto module is not available.");
        }
        nd1 nd1Var = pk1.f9086a;
        jd1 jd1Var = jd1.f6829b;
        jd1Var.c(pk1.f9086a);
        jd1Var.d(pk1.f9087b);
        jd1Var.a(pk1.f9088c);
        jd1Var.b(pk1.f9089d);
        jd1Var.a(pk1.f9090e);
        jd1Var.b(pk1.f9091f);
        hd1 hd1Var = hd1.f6102b;
        HashMap map = new HashMap();
        map.put("ECDSA_P256", qj1.f9519a);
        map.put("ECDSA_P256_IEEE_P1363", qj1.f9522d);
        na1 na1Var = new na1(3);
        na1Var.f8261e = ea1.f4904n;
        na1Var.f8260d = gj1.f5829c;
        na1Var.f8259c = fa1.f5301k;
        na1Var.f8262f = ja1.f6800n;
        map.put("ECDSA_P256_RAW", na1Var.l());
        map.put("ECDSA_P256_IEEE_P1363_WITHOUT_PREFIX", qj1.f9524f);
        map.put("ECDSA_P384", qj1.f9520b);
        map.put("ECDSA_P384_IEEE_P1363", qj1.f9523e);
        na1 na1Var2 = new na1(3);
        na1Var2.f8261e = ea1.f4906p;
        gj1 gj1Var = gj1.f5830d;
        na1Var2.f8260d = gj1Var;
        fa1 fa1Var = fa1.f5302l;
        na1Var2.f8259c = fa1Var;
        ja1 ja1Var = ja1.f6797k;
        na1Var2.f8262f = ja1Var;
        map.put("ECDSA_P384_SHA512", na1Var2.l());
        na1 na1Var3 = new na1(3);
        na1Var3.f8261e = ea1.f4905o;
        na1Var3.f8260d = gj1Var;
        na1Var3.f8259c = fa1Var;
        na1Var3.f8262f = ja1Var;
        map.put("ECDSA_P384_SHA384", na1Var3.l());
        map.put("ECDSA_P521", qj1.f9521c);
        map.put("ECDSA_P521_IEEE_P1363", qj1.f9525g);
        hd1Var.b(Collections.unmodifiableMap(map));
        id1Var.a(kj1.f7242a);
        id1Var.a(kj1.f7243b);
        cd1 cd1Var = cd1.f4188b;
        cd1Var.a(kj1.f7246e, hj1.class);
        qc1 qc1Var = qc1.f9455d;
        qc1Var.c(kj1.f7244c, i, true);
        qc1Var.c(kj1.f7245d, i, false);
        int i10 = ck1.f4242f;
        if (!gr.x(i10)) {
            throw new GeneralSecurityException("Can not use RSA SSA PKCS1 in FIPS-mode, as BoringCrypto module is not available.");
        }
        jd1Var.c(vk1.f11404a);
        jd1Var.d(vk1.f11405b);
        jd1Var.a(vk1.f11406c);
        jd1Var.b(vk1.f11407d);
        jd1Var.a(vk1.f11408e);
        jd1Var.b(vk1.f11409f);
        HashMap map2 = new HashMap();
        map2.put("RSA_SSA_PKCS1_3072_SHA256_F4", qj1.f9526h);
        BigInteger bigInteger = yj1.f12635e;
        vj1 vj1Var = new vj1();
        vj1Var.f11398c = wj1.f11818b;
        vj1Var.a(3072);
        BigInteger bigInteger2 = yj1.f12635e;
        vj1Var.f11397b = bigInteger2;
        xj1 xj1Var = xj1.f12173e;
        vj1Var.f11399d = xj1Var;
        map2.put("RSA_SSA_PKCS1_3072_SHA256_F4_RAW", vj1Var.b());
        map2.put("RSA_SSA_PKCS1_3072_SHA256_F4_WITHOUT_PREFIX", qj1.i);
        map2.put("RSA_SSA_PKCS1_4096_SHA512_F4", qj1.f9527j);
        vj1 vj1Var2 = new vj1();
        vj1Var2.f11398c = wj1.f11820d;
        vj1Var2.a(4096);
        vj1Var2.f11397b = bigInteger2;
        vj1Var2.f11399d = xj1Var;
        map2.put("RSA_SSA_PKCS1_4096_SHA512_F4_RAW", vj1Var2.b());
        hd1Var.b(map2);
        id1Var.a(ck1.f4237a);
        id1Var.a(ck1.f4238b);
        cd1Var.a(ck1.f4241e, yj1.class);
        qc1Var.c(ck1.f4239c, i10, true);
        qc1Var.c(ck1.f4240d, i10, false);
        int i11 = jk1.f6870f;
        if (!gr.x(i11)) {
            throw new GeneralSecurityException("Can not use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        jd1Var.c(zk1.f13017a);
        jd1Var.d(zk1.f13018b);
        jd1Var.a(zk1.f13019c);
        jd1Var.b(zk1.f13020d);
        jd1Var.a(zk1.f13021e);
        jd1Var.b(zk1.f13022f);
        HashMap map3 = new HashMap();
        BigInteger bigInteger3 = gk1.f5838g;
        dk1 dk1Var = new dk1();
        ek1 ek1Var = ek1.f4988b;
        dk1Var.f4593c = ek1Var;
        dk1Var.f4594d = ek1Var;
        dk1Var.b(32);
        dk1Var.a(3072);
        BigInteger bigInteger4 = gk1.f5838g;
        dk1Var.f4592b = bigInteger4;
        fk1 fk1Var = fk1.f5374b;
        dk1Var.f4596f = fk1Var;
        map3.put("RSA_SSA_PSS_3072_SHA256_F4", dk1Var.c());
        dk1 dk1Var2 = new dk1();
        dk1Var2.f4593c = ek1Var;
        dk1Var2.f4594d = ek1Var;
        dk1Var2.b(32);
        dk1Var2.a(3072);
        dk1Var2.f4592b = bigInteger4;
        fk1 fk1Var2 = fk1.f5377e;
        dk1Var2.f4596f = fk1Var2;
        map3.put("RSA_SSA_PSS_3072_SHA256_F4_RAW", dk1Var2.c());
        map3.put("RSA_SSA_PSS_3072_SHA256_SHA256_32_F4", qj1.f9528k);
        dk1 dk1Var3 = new dk1();
        ek1 ek1Var2 = ek1.f4990d;
        dk1Var3.f4593c = ek1Var2;
        dk1Var3.f4594d = ek1Var2;
        dk1Var3.b(64);
        dk1Var3.a(4096);
        dk1Var3.f4592b = bigInteger4;
        dk1Var3.f4596f = fk1Var;
        map3.put("RSA_SSA_PSS_4096_SHA512_F4", dk1Var3.c());
        dk1 dk1Var4 = new dk1();
        dk1Var4.f4593c = ek1Var2;
        dk1Var4.f4594d = ek1Var2;
        dk1Var4.b(64);
        dk1Var4.a(4096);
        dk1Var4.f4592b = bigInteger4;
        dk1Var4.f4596f = fk1Var2;
        map3.put("RSA_SSA_PSS_4096_SHA512_F4_RAW", dk1Var4.c());
        map3.put("RSA_SSA_PSS_4096_SHA512_SHA512_64_F4", qj1.f9529l);
        hd1Var.b(Collections.unmodifiableMap(map3));
        id1Var.a(jk1.f6865a);
        id1Var.a(jk1.f6866b);
        cd1Var.a(jk1.f6869e, gk1.class);
        qc1Var.c(jk1.f6867c, i11, true);
        qc1Var.c(jk1.f6868d, i11, false);
        if (gc1.a()) {
            return;
        }
        sd1 sd1Var = oj1.f8706a;
        if (!gr.x(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        jd1Var.c(rk1.f9950a);
        jd1Var.d(rk1.f9951b);
        jd1Var.a(rk1.f9952c);
        jd1Var.b(rk1.f9953d);
        jd1Var.a(rk1.f9954e);
        jd1Var.b(rk1.f9955f);
        HashMap map4 = new HashMap();
        map4.put("ED25519", new mj1(lj1.f7546b));
        lj1 lj1Var = lj1.f7549e;
        map4.put("ED25519_RAW", new mj1(lj1Var));
        map4.put("ED25519WithRawOutput", new mj1(lj1Var));
        hd1Var.b(Collections.unmodifiableMap(map4));
        cd1Var.a(oj1.f8711f, mj1.class);
        ed1.f4924b.a(oj1.f8710e, mj1.class);
        id1Var.a(oj1.f8706a);
        id1Var.a(oj1.f8707b);
        qc1Var.a(oj1.f8708c, true);
        qc1Var.a(oj1.f8709d, false);
    }
}
