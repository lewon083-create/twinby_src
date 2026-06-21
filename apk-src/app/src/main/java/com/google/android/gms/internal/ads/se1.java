package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class se1 {
    static {
        int i = fi1.zza;
        try {
            a();
        } catch (GeneralSecurityException e3) {
            throw new ExceptionInInitializerError(e3);
        }
    }

    public static void a() throws GeneralSecurityException {
        we1 we1Var = we1.f11795a;
        id1 id1Var = id1.f6470b;
        id1Var.b(we1.f11795a);
        id1Var.a(we1.f11796b);
        id1Var.b(le1.f7498a);
        int i = oe1.f8681f;
        if (!gr.x(i)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        zd1 zd1Var = af1.f2881a;
        jd1 jd1Var = jd1.f6829b;
        jd1Var.c(af1.f2883c);
        jd1Var.d(af1.f2884d);
        jd1Var.a(af1.f2885e);
        jd1Var.b(af1.f2886f);
        id1Var.a(oe1.f8676a);
        id1Var.a(oe1.f8677b);
        hd1 hd1Var = hd1.f6102b;
        HashMap map = new HashMap();
        map.put("HMAC_SHA256_128BITTAG", xe1.f12139a);
        na1 na1Var = new na1(2);
        na1Var.a(32);
        na1Var.e(16);
        qe1 qe1Var = qe1.f9473e;
        na1Var.f8262f = qe1Var;
        pe1 pe1Var = pe1.f9034d;
        na1Var.f8261e = pe1Var;
        map.put("HMAC_SHA256_128BITTAG_RAW", na1Var.k());
        na1 na1Var2 = new na1(2);
        na1Var2.a(32);
        na1Var2.e(32);
        qe1 qe1Var2 = qe1.f9470b;
        na1Var2.f8262f = qe1Var2;
        na1Var2.f8261e = pe1Var;
        map.put("HMAC_SHA256_256BITTAG", na1Var2.k());
        na1 na1Var3 = new na1(2);
        na1Var3.a(32);
        na1Var3.e(32);
        na1Var3.f8262f = qe1Var;
        na1Var3.f8261e = pe1Var;
        map.put("HMAC_SHA256_256BITTAG_RAW", na1Var3.k());
        na1 na1Var4 = new na1(2);
        na1Var4.a(64);
        na1Var4.e(16);
        na1Var4.f8262f = qe1Var2;
        pe1 pe1Var2 = pe1.f9036f;
        na1Var4.f8261e = pe1Var2;
        map.put("HMAC_SHA512_128BITTAG", na1Var4.k());
        na1 na1Var5 = new na1(2);
        na1Var5.a(64);
        na1Var5.e(16);
        na1Var5.f8262f = qe1Var;
        na1Var5.f8261e = pe1Var2;
        map.put("HMAC_SHA512_128BITTAG_RAW", na1Var5.k());
        na1 na1Var6 = new na1(2);
        na1Var6.a(64);
        na1Var6.e(32);
        na1Var6.f8262f = qe1Var2;
        na1Var6.f8261e = pe1Var2;
        map.put("HMAC_SHA512_256BITTAG", na1Var6.k());
        na1 na1Var7 = new na1(2);
        na1Var7.a(64);
        na1Var7.e(32);
        na1Var7.f8262f = qe1Var;
        na1Var7.f8261e = pe1Var2;
        map.put("HMAC_SHA512_256BITTAG_RAW", na1Var7.k());
        map.put("HMAC_SHA512_512BITTAG", xe1.f12140b);
        na1 na1Var8 = new na1(2);
        na1Var8.a(64);
        na1Var8.e(64);
        na1Var8.f8262f = qe1Var;
        na1Var8.f8261e = pe1Var2;
        map.put("HMAC_SHA512_512BITTAG_RAW", na1Var8.k());
        hd1Var.b(Collections.unmodifiableMap(map));
        cd1 cd1Var = cd1.f4188b;
        cd1Var.a(oe1.f8680e, re1.class);
        ed1.f4924b.a(oe1.f8679d, re1.class);
        qc1 qc1Var = qc1.f9455d;
        qc1Var.c(oe1.f8678c, i, true);
        if (gc1.a()) {
            return;
        }
        sd1 sd1Var = ie1.f6476a;
        if (!gr.x(1)) {
            throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        jd1Var.c(ze1.f12982a);
        jd1Var.d(ze1.f12983b);
        jd1Var.a(ze1.f12984c);
        jd1Var.b(ze1.f12985d);
        cd1Var.a(ba1.f3702l, je1.class);
        id1Var.a(ie1.f6476a);
        id1Var.a(ie1.f6477b);
        HashMap map2 = new HashMap();
        je1 je1Var = xe1.f12141c;
        map2.put("AES_CMAC", je1Var);
        map2.put("AES256_CMAC", je1Var);
        l91 l91Var = new l91(6);
        l91Var.c(32);
        l91Var.k(16);
        l91Var.f7467e = h91.f6072s;
        map2.put("AES256_CMAC_RAW", l91Var.s());
        hd1Var.b(Collections.unmodifiableMap(map2));
        qc1Var.a(ie1.f6478c, true);
    }
}
