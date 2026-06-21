package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s91 {
    static {
        int i = fi1.zza;
        try {
            a();
        } catch (GeneralSecurityException e3) {
            throw new ExceptionInInitializerError(e3);
        }
    }

    public static void a() {
        z91 z91Var = z91.f12921a;
        id1 id1Var = id1.f6470b;
        id1Var.b(z91.f12921a);
        id1Var.a(z91.f12922b);
        se1.a();
        int i = da1.f4538e;
        if (!gr.x(i)) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        nd1 nd1Var = mb1.f7842a;
        jd1 jd1Var = jd1.f6829b;
        jd1Var.c(mb1.f7842a);
        jd1Var.d(mb1.f7843b);
        jd1Var.a(mb1.f7844c);
        jd1Var.b(mb1.f7845d);
        id1Var.a(da1.f4534a);
        hd1 hd1Var = hd1.f6102b;
        HashMap map = new HashMap();
        map.put("AES128_CTR_HMAC_SHA256", fb1.f5314e);
        hi hiVar = new hi(6);
        hiVar.b(16);
        hiVar.f(32);
        hiVar.m(16);
        hiVar.k(16);
        ea1 ea1Var = ea1.f4897f;
        hiVar.f6145f = ea1Var;
        fa1 fa1Var = fa1.f5296e;
        hiVar.f6146g = fa1Var;
        map.put("AES128_CTR_HMAC_SHA256_RAW", hiVar.n());
        map.put("AES256_CTR_HMAC_SHA256", fb1.f5315f);
        hi hiVar2 = new hi(6);
        hiVar2.b(32);
        hiVar2.f(32);
        hiVar2.m(32);
        hiVar2.k(16);
        hiVar2.f6145f = ea1Var;
        hiVar2.f6146g = fa1Var;
        map.put("AES256_CTR_HMAC_SHA256_RAW", hiVar2.n());
        hd1Var.b(Collections.unmodifiableMap(map));
        ed1 ed1Var = ed1.f4924b;
        ed1Var.a(da1.f4536c, ga1.class);
        cd1 cd1Var = cd1.f4188b;
        cd1Var.a(da1.f4537d, ga1.class);
        qc1 qc1Var = qc1.f9455d;
        qc1Var.c(da1.f4535b, i, true);
        int i10 = ma1.f7832e;
        if (!gr.x(i10)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        jd1Var.c(pb1.f9005a);
        jd1Var.d(pb1.f9006b);
        jd1Var.a(pb1.f9007c);
        jd1Var.b(pb1.f9008d);
        id1Var.a(ma1.f7828a);
        HashMap map2 = new HashMap();
        map2.put("AES128_GCM", fb1.f5310a);
        na1 na1Var = new na1(0);
        na1Var.d();
        na1Var.a(16);
        na1Var.g();
        h91 h91Var = h91.i;
        na1Var.f8262f = h91Var;
        map2.put("AES128_GCM_RAW", na1Var.j());
        map2.put("AES256_GCM", fb1.f5311b);
        na1 na1Var2 = new na1(0);
        na1Var2.d();
        na1Var2.a(32);
        na1Var2.g();
        na1Var2.f8262f = h91Var;
        map2.put("AES256_GCM_RAW", na1Var2.j());
        hd1Var.b(Collections.unmodifiableMap(map2));
        ed1Var.a(ma1.f7830c, oa1.class);
        cd1Var.a(ma1.f7831d, oa1.class);
        qc1Var.c(ma1.f7829b, i10, true);
        if (gc1.a()) {
            return;
        }
        sd1 sd1Var = ia1.f6446a;
        if (!gr.x(1)) {
            throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        }
        jd1Var.c(nb1.f8268a);
        jd1Var.d(nb1.f8269b);
        jd1Var.a(nb1.f8270c);
        jd1Var.b(nb1.f8271d);
        id1Var.a(ia1.f6446a);
        HashMap map3 = new HashMap();
        map3.put("AES128_EAX", fb1.f5312c);
        cw cwVar = new cw(29);
        cwVar.p(16);
        cwVar.g(16);
        cwVar.s();
        ja1 ja1Var = ja1.f6792e;
        cwVar.f4350f = ja1Var;
        map3.put("AES128_EAX_RAW", cwVar.y());
        map3.put("AES256_EAX", fb1.f5313d);
        cw cwVar2 = new cw(29);
        cwVar2.p(16);
        cwVar2.g(32);
        cwVar2.s();
        cwVar2.f4350f = ja1Var;
        map3.put("AES256_EAX_RAW", cwVar2.y());
        hd1Var.b(Collections.unmodifiableMap(map3));
        cd1Var.a(ia1.f6448c, ka1.class);
        qc1Var.a(ia1.f6447b, true);
        sd1 sd1Var2 = qa1.f9389a;
        ea1 ea1Var2 = ea1.f4901k;
        if (!gr.x(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        jd1Var.c(rb1.f9811a);
        jd1Var.d(rb1.f9812b);
        jd1Var.a(rb1.f9813c);
        jd1Var.b(rb1.f9814d);
        HashMap map4 = new HashMap();
        ea1 ea1Var3 = ea1.i;
        map4.put("AES128_GCM_SIV", new ra1(16, ea1Var3));
        map4.put("AES128_GCM_SIV_RAW", new ra1(16, ea1Var2));
        map4.put("AES256_GCM_SIV", new ra1(32, ea1Var3));
        map4.put("AES256_GCM_SIV_RAW", new ra1(32, ea1Var2));
        hd1Var.b(Collections.unmodifiableMap(map4));
        ed1Var.a(ca1.f4125c, ra1.class);
        cd1Var.a(ba1.f3696e, ra1.class);
        id1Var.a(qa1.f9389a);
        qc1Var.a(qa1.f9390b, true);
        sd1 sd1Var3 = ta1.f10573a;
        if (!gr.x(1)) {
            throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        }
        jd1Var.c(ub1.f10904a);
        jd1Var.d(ub1.f10905b);
        jd1Var.a(ub1.f10906c);
        jd1Var.b(ub1.f10907d);
        id1Var.a(ta1.f10573a);
        cd1Var.a(ba1.f3697f, ua1.class);
        HashMap map5 = new HashMap();
        map5.put("CHACHA20_POLY1305", new ua1(fa1.f5297f));
        map5.put("CHACHA20_POLY1305_RAW", new ua1(fa1.f5299h));
        hd1Var.b(Collections.unmodifiableMap(map5));
        qc1Var.a(ta1.f10574b, true);
        sd1 sd1Var4 = va1.f11322a;
        if (!gr.x(1)) {
            throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
        }
        jd1Var.c(za1.f12935a);
        jd1Var.d(za1.f12936b);
        jd1Var.a(za1.f12937c);
        jd1Var.b(za1.f12938d);
        id1Var.a(va1.f11322a);
        cd1Var.a(va1.f11324c, ya1.class);
        qc1Var.a(va1.f11323b, true);
        wc1 wc1Var = wa1.f11714a;
        if (!gr.x(1)) {
            throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        jd1Var.c(eb1.f4911a);
        jd1Var.d(eb1.f4912b);
        jd1Var.a(eb1.f4913c);
        jd1Var.b(eb1.f4914d);
        cd1Var.a(wa1.f11715b, bb1.class);
        id1Var.a(wa1.f11716c);
        qc1Var.a(wa1.f11714a, true);
        sd1 sd1Var5 = kb1.f7180a;
        if (!gr.x(1)) {
            throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        }
        jd1Var.c(dc1.f4553a);
        jd1Var.d(dc1.f4554b);
        jd1Var.a(dc1.f4555c);
        jd1Var.b(dc1.f4556d);
        id1Var.a(kb1.f7180a);
        HashMap map6 = new HashMap();
        map6.put("XCHACHA20_POLY1305", new lb1(ja1.f6795h));
        map6.put("XCHACHA20_POLY1305_RAW", new lb1(ja1.f6796j));
        hd1Var.b(Collections.unmodifiableMap(map6));
        cd1Var.a(kb1.f7183d, lb1.class);
        ed1Var.a(kb1.f7182c, lb1.class);
        qc1Var.a(kb1.f7181b, true);
        sd1 sd1Var6 = hb1.f6091a;
        jd1Var.c(ac1.f2842a);
        jd1Var.d(ac1.f2843b);
        jd1Var.a(ac1.f2844c);
        jd1Var.b(ac1.f2845d);
        HashMap map7 = new HashMap();
        map7.put("XAES_256_GCM_192_BIT_NONCE", fb1.f5316g);
        map7.put("XAES_256_GCM_192_BIT_NONCE_NO_PREFIX", fb1.f5317h);
        map7.put("XAES_256_GCM_160_BIT_NONCE_NO_PREFIX", fb1.i);
        map7.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", fb1.f5318j);
        hd1Var.b(Collections.unmodifiableMap(map7));
        id1Var.a(hb1.f6091a);
        cd1Var.a(ba1.i, ib1.class);
    }
}
