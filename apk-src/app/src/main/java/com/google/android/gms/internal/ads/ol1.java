package com.google.android.gms.internal.ads;

import android.os.Build;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.Collections;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ol1 implements q91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f8734a = new byte[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f8735b = {0};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zd1 f8736c;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ll1 ll1Var = ll1.f7570b;
        wj1 wj1Var = wj1.f11818b;
        map.put(ll1Var, wj1Var);
        map2.put(wj1Var, ll1Var);
        ll1 ll1Var2 = ll1.f7571c;
        wj1 wj1Var2 = wj1.f11819c;
        map.put(ll1Var2, wj1Var2);
        map2.put(wj1Var2, ll1Var2);
        ll1 ll1Var3 = ll1.f7572d;
        wj1 wj1Var3 = wj1.f11820d;
        map.put(ll1Var3, wj1Var3);
        map2.put(wj1Var3, ll1Var3);
        f8736c = new zd1(25, (Object) Collections.unmodifiableMap(map), (Object) Collections.unmodifiableMap(map2), false);
    }

    public static q91 b(bk1 bk1Var) {
        try {
            int i = ge1.f5788a;
            if (Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
                (!Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT)).getClass();
            }
            Provider providerE = c80.e();
            if (providerE != null) {
                return xk1.c(bk1Var, providerE);
            }
            throw new NoSuchProviderException("RSA-PKCS1.5 using Conscrypt is not supported.");
        } catch (NoSuchProviderException unused) {
            KeyFactory keyFactory = (KeyFactory) il1.f6539g.f6540a.b("RSA");
            BigInteger bigInteger = bk1Var.f3805e;
            yj1 yj1Var = bk1Var.f3804d;
            return new tk1((RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger, yj1Var.f12637b)), (ll1) f8736c.s(yj1Var.f12639d), bk1Var.f3806f.b(), yj1Var.f12638c.equals(xj1.f12172d) ? f8735b : f8734a);
        }
    }
}
