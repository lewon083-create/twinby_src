package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.interfaces.ECPublicKey;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class qk1 implements q91 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f9535g = new byte[0];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f9536h = {0};
    public static final zd1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final zd1 f9537j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final zd1 f9538k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ECPublicKey f9539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fl1 f9541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f9542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f9543e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Provider f9544f;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ea1 ea1Var = ea1.f4904n;
        ll1 ll1Var = ll1.f7570b;
        map.put(ll1Var, ea1Var);
        map2.put(ea1Var, ll1Var);
        ea1 ea1Var2 = ea1.f4905o;
        ll1 ll1Var2 = ll1.f7571c;
        map.put(ll1Var2, ea1Var2);
        map2.put(ea1Var2, ll1Var2);
        ea1 ea1Var3 = ea1.f4906p;
        ll1 ll1Var3 = ll1.f7572d;
        map.put(ll1Var3, ea1Var3);
        map2.put(ea1Var3, ll1Var3);
        i = new zd1(25, (Object) Collections.unmodifiableMap(map), (Object) Collections.unmodifiableMap(map2), false);
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        fa1 fa1Var = fa1.f5301k;
        fl1 fl1Var = fl1.f5383b;
        map3.put(fl1Var, fa1Var);
        map4.put(fa1Var, fl1Var);
        fa1 fa1Var2 = fa1.f5302l;
        fl1 fl1Var2 = fl1.f5384c;
        map3.put(fl1Var2, fa1Var2);
        map4.put(fa1Var2, fl1Var2);
        f9537j = new zd1(25, (Object) Collections.unmodifiableMap(map3), (Object) Collections.unmodifiableMap(map4), false);
        HashMap map5 = new HashMap();
        HashMap map6 = new HashMap();
        gj1 gj1Var = gj1.f5829c;
        el1 el1Var = el1.f4997b;
        map5.put(el1Var, gj1Var);
        map6.put(gj1Var, el1Var);
        gj1 gj1Var2 = gj1.f5830d;
        el1 el1Var2 = el1.f4998c;
        map5.put(el1Var2, gj1Var2);
        map6.put(gj1Var2, el1Var2);
        gj1 gj1Var3 = gj1.f5831e;
        el1 el1Var3 = el1.f4999d;
        map5.put(el1Var3, gj1Var3);
        map6.put(gj1Var3, el1Var3);
        f9538k = new zd1(25, (Object) Collections.unmodifiableMap(map5), (Object) Collections.unmodifiableMap(map6), false);
    }

    public qk1(ECPublicKey eCPublicKey, ll1 ll1Var, fl1 fl1Var, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!gr.x(2)) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
        }
        gr.F(ll1Var);
        this.f9540b = ll1Var.toString().concat("withECDSA");
        this.f9539a = eCPublicKey;
        this.f9541c = fl1Var;
        this.f9542d = bArr;
        this.f9543e = bArr2;
        this.f9544f = provider;
    }

    @Override // com.google.android.gms.internal.ads.q91
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f9542d;
        int length = bArr3.length;
        if (length == 0) {
            b(bArr, bArr2);
        } else {
            if (!ge1.c(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            b(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0138 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(byte[] r18, byte[] r19) throws java.security.GeneralSecurityException {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qk1.b(byte[], byte[]):void");
    }
}
