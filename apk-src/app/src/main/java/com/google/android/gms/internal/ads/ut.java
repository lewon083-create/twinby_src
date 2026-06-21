package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.RemoteException;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class ut implements a7, la, kx, k81, o00, z9.a, ep0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static pw f11059e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f11061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f11062d;

    public /* synthetic */ ut(int i, Object obj) {
        this.f11060b = i;
        this.f11062d = obj;
    }

    public static pw d(Context context) {
        pw pwVar;
        synchronized (ut.class) {
            try {
                if (f11059e == null) {
                    q9.o oVar = q9.r.f31959g.f31961b;
                    fr frVar = new fr();
                    oVar.getClass();
                    f11059e = (pw) new q9.e(oVar, context, frVar).d(context, false);
                }
                pwVar = f11059e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pwVar;
    }

    public static void n(ut utVar, zd1 zd1Var) {
        l91 l91Var = (l91) zd1Var.f12971c;
        l91 l91Var2 = (l91) utVar.f11061c;
        long[] jArr = (long[]) l91Var2.f7465c;
        long[] jArr2 = (long[]) l91Var.f7465c;
        long[] jArr3 = (long[]) zd1Var.f12972d;
        rs.D(jArr, jArr2, jArr3);
        long[] jArr4 = (long[]) l91Var2.f7466d;
        long[] jArr5 = (long[]) l91Var.f7466d;
        long[] jArr6 = (long[]) l91Var.f7467e;
        rs.D(jArr4, jArr5, jArr6);
        rs.D((long[]) l91Var2.f7467e, jArr6, jArr3);
        rs.D((long[]) utVar.f11062d, jArr2, jArr5);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0271 A[LOOP:0: B:160:0x0012->B:149:0x0271, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0291 A[EDGE_INSN: B:181:0x0291->B:150:0x0291 BREAK  A[LOOP:0: B:160:0x0012->B:149:0x0271], SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.la
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.internal.ads.oa a(com.google.android.gms.internal.ads.qa r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 708
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ut.a(com.google.android.gms.internal.ads.qa):com.google.android.gms.internal.ads.oa");
    }

    @Override // com.google.android.gms.internal.ads.o00
    public /* synthetic */ void b(int i, String str, String str2, boolean z5) {
        za0 za0Var = (za0) this.f11061c;
        Map map = (Map) this.f11062d;
        HashMap map2 = new HashMap();
        map2.put("messageType", "htmlLoaded");
        map2.put("id", (String) map.get("id"));
        za0Var.f12932b.d(map2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:196:0x03ad, code lost:
    
        r0.addAll(r12);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e5  */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v31 */
    @Override // com.google.android.gms.internal.ads.a7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(int r19, int r20, a4.g r21, byte[] r22) {
        /*
            Method dump skipped, instruction units count: 1069
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ut.c(int, int, a4.g, byte[]):void");
    }

    public void e(jr0 jr0Var) {
        ze zeVar = new ze(5, (ch0) this.f11061c);
        gx gxVar = (gx) ((r81) this.f11062d);
        ed.d dVarB = gxVar.b(zeVar);
        dVarB.a(new l81(0, dVarB, new cf(25, this, jr0Var)), gxVar);
    }

    @Override // z9.a
    public /* synthetic */ void f(ct ctVar) {
        ((pf0) this.f11061c).l4(ctVar, (String) this.f11062d);
    }

    @Override // com.google.android.gms.internal.ads.ep0
    public Object g() {
        z50 z50Var;
        synchronized (this) {
            z50Var = (z50) this.f11062d;
        }
        return z50Var;
    }

    @Override // com.google.android.gms.internal.ads.kx, com.google.android.gms.internal.ads.vm, com.google.android.gms.internal.ads.al0
    /* JADX INFO: renamed from: h */
    public void mo4h() {
        t9.c0.m("callJs > getEngine: Promise rejected");
        ((jx) this.f11061c).d(new c7.k("Unable to obtain a JavascriptEngine."));
        ((pq) this.f11062d).h();
    }

    @Override // com.google.android.gms.internal.ads.k81
    /* JADX INFO: renamed from: i */
    public void mo6i(Object obj) {
        switch (this.f11060b) {
            case 8:
                ((lx) this.f11061c).mo7a(obj);
                break;
            case 11:
                x40 x40Var = (x40) this.f11062d;
                x40Var.getClass();
                hx.f6284f.execute(new h30(2, x40Var));
                ((z7) this.f11061c).mo6i((r40) obj);
                break;
            case 14:
                ((sz) obj).s1((String) this.f11061c, (vo) this.f11062d);
                break;
        }
    }

    public void j(sd1 sd1Var) throws GeneralSecurityException {
        if (sd1Var == null) {
            throw new NullPointerException("primitive constructor must be non-null");
        }
        ud1 ud1Var = new ud1(sd1Var.f10247a, sd1Var.f10248b);
        HashMap map = (HashMap) this.f11061c;
        if (!map.containsKey(ud1Var)) {
            map.put(ud1Var, sd1Var);
            return;
        }
        sd1 sd1Var2 = (sd1) map.get(ud1Var);
        if (!sd1Var2.equals(sd1Var) || !sd1Var.equals(sd1Var2)) {
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(ud1Var.toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.k81
    public void k(Throwable th2) {
        switch (this.f11060b) {
            case 8:
                ((kx) this.f11062d).mo4h();
                break;
            case 11:
                x40 x40Var = (x40) this.f11062d;
                x40Var.getClass();
                hx.f6284f.execute(new h30(2, x40Var));
                ((z7) this.f11061c).k(th2);
                break;
            case 14:
                break;
            default:
                xr0 xr0Var = (xr0) this.f11062d;
                xr0Var.g(th2);
                xr0Var.a(false);
                ((as0) this.f11061c).a(xr0Var);
                break;
        }
    }

    public synchronized ed.d m(n90 n90Var, dp0 dp0Var, z50 z50Var) {
        ku kuVar;
        this.f11062d = z50Var;
        if (z50Var == null || (kuVar = (ku) n90Var.f8248c) == null) {
            return ((xo0) this.f11061c).f(n90Var, dp0Var, z50Var);
        }
        b50 b50VarH = z50Var.h();
        return b50VarH.c(b50VarH.a(vv.d(kuVar)));
    }

    public void o(xd1 xd1Var) throws GeneralSecurityException {
        HashMap map = (HashMap) this.f11062d;
        Class clsH = xd1Var.h();
        if (!map.containsKey(clsH)) {
            map.put(clsH, xd1Var);
            return;
        }
        xd1 xd1Var2 = (xd1) map.get(clsH);
        if (!xd1Var2.equals(xd1Var) || !xd1Var.equals(xd1Var2)) {
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(clsH.toString()));
        }
    }

    public void p(da.a aVar) {
        pw pwVar;
        xa.b bVar;
        q9.d3 d3VarA;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Context context = (Context) this.f11061c;
        pw pwVarD = d(context);
        if (pwVarD == null) {
            aVar.a("Internal Error, query info generator is null.");
            return;
        }
        xa.b bVar2 = new xa.b(context);
        q9.f2 f2Var = (q9.f2) this.f11062d;
        if (f2Var == null) {
            bVar = bVar2;
            pwVar = pwVarD;
            d3VarA = new q9.d3(8, -1L, new Bundle(), -1, new ArrayList(), false, -1, false, null, null, null, null, new Bundle(), new Bundle(), new ArrayList(), null, null, false, null, -1, null, new ArrayList(), 60000, null, 0, jCurrentTimeMillis, 0L);
        } else {
            pwVar = pwVarD;
            bVar = bVar2;
            f2Var.f31854m = jCurrentTimeMillis;
            d3VarA = q9.f3.a(context, f2Var);
        }
        try {
            pwVar.q3(bVar, new tw(null, "BANNER", null, d3VarA, 0, null), new tt(this, aVar));
        } catch (RemoteException unused) {
            aVar.a("Internal Error.");
        }
    }

    public void q(boolean z5, boolean z10) {
        synchronized (this) {
            boolean z11 = false;
            if (z5) {
                if (((PowerManager.WakeLock) this.f11062d) == null) {
                    Context context = (Context) this.f11061c;
                    if (context.checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                        rs.r("WakeLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                        return;
                    }
                    PowerManager powerManager = (PowerManager) context.getSystemService("power");
                    if (powerManager == null) {
                        rs.r("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                        return;
                    } else {
                        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                        this.f11062d = wakeLockNewWakeLock;
                        wakeLockNewWakeLock.setReferenceCounted(false);
                    }
                }
            }
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.f11062d;
            if (wakeLock == null) {
                return;
            }
            if (z5 && z10) {
                z11 = true;
            }
            if (z11) {
                wakeLock.acquire();
            } else {
                wakeLock.release();
            }
        }
    }

    public boolean r(int i) {
        return ((cw1) this.f11061c).f4351a.get(i);
    }

    public ij1 t() throws GeneralSecurityException {
        ECPoint eCPoint;
        jj1 jj1Var = (jj1) this.f11061c;
        if (jj1Var == null) {
            throw new GeneralSecurityException("Cannot build without a ecdsa public key");
        }
        in0 in0Var = (in0) this.f11062d;
        if (in0Var == null) {
            throw new GeneralSecurityException("Cannot build without a private value");
        }
        BigInteger bigInteger = (BigInteger) in0Var.f6553c;
        ECPoint eCPoint2 = jj1Var.f6860e;
        gj1 gj1Var = jj1Var.f6859d.f6162b;
        BigInteger order = gj1Var.f5833b.getOrder();
        if (bigInteger.signum() <= 0 || bigInteger.compareTo(order) >= 0) {
            throw new GeneralSecurityException("Invalid private value");
        }
        ECParameterSpec eCParameterSpec = gj1Var.f5833b;
        if (!lc1.b(eCParameterSpec, lc1.f7480a) && !lc1.b(eCParameterSpec, lc1.f7481b) && !lc1.b(eCParameterSpec, lc1.f7482c)) {
            throw new GeneralSecurityException("spec must be NIST P256, P384 or P521");
        }
        if (bigInteger.signum() != 1) {
            throw new GeneralSecurityException("k must be positive");
        }
        if (bigInteger.compareTo(eCParameterSpec.getOrder()) >= 0) {
            throw new GeneralSecurityException("k must be smaller than the order of the generator");
        }
        EllipticCurve curve = eCParameterSpec.getCurve();
        ECPoint generator = eCParameterSpec.getGenerator();
        lc1.a(generator, curve);
        BigInteger a10 = eCParameterSpec.getCurve().getA();
        BigInteger bigIntegerC = lc1.c(curve);
        kc1 kc1VarD = lc1.d(ECPoint.POINT_INFINITY, bigIntegerC);
        kc1 kc1VarD2 = lc1.d(generator, bigIntegerC);
        for (int iBitLength = bigInteger.bitLength(); iBitLength >= 0; iBitLength--) {
            if (bigInteger.testBit(iBitLength)) {
                kc1VarD = lc1.f(kc1VarD, kc1VarD2, a10, bigIntegerC);
                kc1VarD2 = lc1.e(kc1VarD2, a10, bigIntegerC);
            } else {
                kc1VarD2 = lc1.f(kc1VarD, kc1VarD2, a10, bigIntegerC);
                kc1VarD = lc1.e(kc1VarD, a10, bigIntegerC);
            }
        }
        if (kc1VarD.f7199c.equals(BigInteger.ZERO)) {
            eCPoint = ECPoint.POINT_INFINITY;
        } else {
            BigInteger bigIntegerModInverse = kc1VarD.f7199c.modInverse(bigIntegerC);
            BigInteger bigIntegerMod = bigIntegerModInverse.multiply(bigIntegerModInverse).mod(bigIntegerC);
            eCPoint = new ECPoint(kc1VarD.f7197a.multiply(bigIntegerMod).mod(bigIntegerC), kc1VarD.f7198b.multiply(bigIntegerMod).mod(bigIntegerC).multiply(bigIntegerModInverse).mod(bigIntegerC));
        }
        lc1.a(eCPoint, curve);
        if (eCPoint.equals(eCPoint2)) {
            return new ij1((jj1) this.f11061c, (in0) this.f11062d);
        }
        throw new GeneralSecurityException("Invalid private value");
    }

    public Set u(q50 q50Var) {
        return Collections.singleton(new s80(q50Var, hx.f6285g));
    }

    public Set v(q50 q50Var) {
        return Collections.singleton(new s80(q50Var, hx.f6285g));
    }

    @Override // com.google.android.gms.internal.ads.ep0
    public /* bridge */ /* synthetic */ ed.d x(n90 n90Var, dp0 dp0Var) {
        return m(n90Var, dp0Var, null);
    }

    public /* synthetic */ ut(int i, Object obj, Object obj2) {
        this.f11060b = i;
        this.f11061c = obj;
        this.f11062d = obj2;
    }

    public /* synthetic */ ut(int i, Object obj, boolean z5) {
        this.f11060b = i;
        this.f11061c = obj;
    }

    public /* synthetic */ ut(Object obj, Object obj2, Object obj3, int i) {
        this.f11060b = i;
        this.f11061c = obj2;
        this.f11062d = obj3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ut(int i) {
        this(23, new l91(4), new long[10]);
        this.f11060b = i;
        switch (i) {
            case 22:
                break;
            case 23:
                break;
            case 24:
                this.f11061c = new HashMap();
                this.f11062d = new HashMap();
                break;
            case 25:
                this.f11061c = null;
                this.f11062d = null;
                break;
            default:
                this.f11061c = new tk0();
                this.f11062d = new c8();
                break;
        }
    }

    public /* synthetic */ ut(MediaCodec.CryptoInfo cryptoInfo) {
        this.f11060b = 26;
        this.f11061c = cryptoInfo;
        this.f11062d = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public ut(c6 c6Var) {
        this.f11060b = 4;
        ya yaVar = new ya(0, false);
        this.f11061c = c6Var;
        this.f11062d = yaVar;
    }

    public ut(el elVar) {
        this.f11060b = 5;
        this.f11062d = elVar;
        this.f11061c = new HashMap();
    }

    public ut(en enVar) {
        this.f11060b = 7;
        this.f11061c = enVar;
        Drawable drawable = null;
        try {
            xa.a aVarJ = enVar.j();
            if (aVarJ != null) {
                drawable = (Drawable) xa.b.X1(aVarJ);
            }
        } catch (RemoteException e3) {
            u9.i.f("", e3);
        }
        this.f11062d = drawable;
        try {
            ((en) this.f11061c).l();
        } catch (RemoteException e7) {
            u9.i.f("", e7);
        }
        try {
            ((en) this.f11061c).g();
        } catch (RemoteException e10) {
            u9.i.f("", e10);
        }
        try {
            ((en) this.f11061c).i();
        } catch (RemoteException e11) {
            u9.i.f("", e11);
        }
        try {
            ((en) this.f11061c).c();
        } catch (RemoteException e12) {
            u9.i.f("", e12);
        }
        if (((Boolean) q9.s.f31967e.f31970c.a(al.F4)).booleanValue()) {
            try {
                ((en) this.f11061c).k();
            } catch (RemoteException unused) {
            }
        }
    }

    private final void l(Throwable th2) {
    }

    private final void s(Object obj) {
    }

    public ut(n10 n10Var, Context context, String str) {
        this.f11060b = 9;
        ns1 ns1VarA = ns1.a(context);
        ls1 ls1Var = n10Var.I0;
        fp0 fp0Var = new fp0(ns1VarA, ls1Var, n10Var.J0, 1);
        ls1 ls1VarA = ls1.a(new wm0(ls1Var, 7));
        ls1 ls1VarA2 = ls1.a(c80.I);
        ls1 ls1VarA3 = ls1.a(new l90(ns1VarA, n10Var.f8106c, n10Var.F, fp0Var, ls1VarA, ls1VarA2));
        this.f11061c = ls1.a(new vp0(0, ls1VarA3, ls1VarA, ls1VarA2));
        this.f11062d = ls1.a(new ta0(ns1.b(str), ls1VarA3, ns1VarA, ls1VarA, ls1VarA2, n10Var.f8116h, n10Var.G, n10Var.f8118j));
    }

    public ut(x40 x40Var, z7 z7Var) {
        this.f11060b = 11;
        this.f11061c = z7Var;
        Objects.requireNonNull(x40Var);
        this.f11062d = x40Var;
    }

    public ut(kc0 kc0Var, String str, vo voVar) {
        this.f11060b = 14;
        this.f11061c = str;
        this.f11062d = voVar;
        Objects.requireNonNull(kc0Var);
    }

    public ut(r51 r51Var, int[] iArr) {
        this.f11060b = 21;
        this.f11061c = x41.v(r51Var);
        this.f11062d = iArr;
    }

    public ut(cw1 cw1Var, SparseArray sparseArray) {
        this.f11060b = 27;
        this.f11061c = cw1Var;
        SparseBooleanArray sparseBooleanArray = cw1Var.f4351a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i = 0; i < sparseBooleanArray.size(); i++) {
            int iA = cw1Var.a(i);
            xu1 xu1Var = (xu1) sparseArray.get(iA);
            xu1Var.getClass();
            sparseArray2.append(iA, xu1Var);
        }
        this.f11062d = sparseArray2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ut(zd1 zd1Var) {
        this(23);
        this.f11060b = 23;
        n(this, zd1Var);
    }

    public /* synthetic */ ut(vd1 vd1Var) {
        this.f11060b = 24;
        this.f11061c = new HashMap(vd1Var.f11364a);
        this.f11062d = new HashMap(vd1Var.f11365b);
    }
}
