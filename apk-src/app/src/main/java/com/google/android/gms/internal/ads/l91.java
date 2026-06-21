package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import java.lang.ref.WeakReference;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.ECPoint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntConsumer;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l91 implements i, yz1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f7465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f7466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f7467e;

    public /* synthetic */ l91(int i, boolean z5) {
        this.f7464b = i;
        this.f7465c = null;
        this.f7466d = null;
        this.f7467e = null;
    }

    public static yd1 B(qh1 qh1Var) {
        return yd1.f(qh1Var.A().z(), qh1Var.A().A(), qh1Var.A().B(), qh1Var.C(), qh1Var.C() == ei1.RAW ? null : Integer.valueOf(qh1Var.B()));
    }

    public static boolean C(int i) {
        int i10 = i - 2;
        return i10 == 1 || i10 == 2 || i10 == 3;
    }

    public static final l91 a(rh1 rh1Var) throws GeneralSecurityException {
        gr zc1Var;
        boolean z5;
        if (rh1Var == null || rh1Var.B() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        ArrayList arrayList = new ArrayList(rh1Var.B());
        for (qh1 qh1Var : rh1Var.A()) {
            int iB = qh1Var.B();
            try {
                yd1 yd1VarB = B(qh1Var);
                jd1 jd1Var = jd1.f6829b;
                fe1 fe1Var = (fe1) jd1Var.f6830a.get();
                fe1Var.getClass();
                zc1Var = !fe1Var.f5331b.containsKey(new de1(yd1.class, (sl1) yd1VarB.f12601d)) ? new zc1(yd1VarB) : jd1Var.e(yd1VarB);
                z5 = false;
            } catch (GeneralSecurityException e3) {
                if (((AtomicBoolean) fc1.f5328a.f6553c).get()) {
                    throw e3;
                }
                zc1Var = new zc1(B(qh1Var));
                z5 = true;
            }
            if (((AtomicBoolean) fc1.f5328a.f6553c).get() && !C(qh1Var.H())) {
                throw new GeneralSecurityException("Parsing of a single key failed (wrong status) and Tink is configured via validateKeysetsOnParsing to reject such keysets.");
            }
            boolean z10 = true;
            int iH = qh1Var.H();
            if (iB != rh1Var.z()) {
                z10 = false;
            }
            arrayList.add(new k91(zc1Var, iH, iB, z10, z5, mp0.f7969g));
        }
        return new l91(Collections.unmodifiableList(arrayList), bd1.f3764b);
    }

    public static void e(l91 l91Var, zd1 zd1Var) {
        l91 l91Var2 = (l91) zd1Var.f12971c;
        long[] jArr = (long[]) l91Var.f7465c;
        long[] jArr2 = (long[]) l91Var2.f7465c;
        long[] jArr3 = (long[]) zd1Var.f12972d;
        rs.D(jArr, jArr2, jArr3);
        long[] jArr4 = (long[]) l91Var.f7466d;
        long[] jArr5 = (long[]) l91Var2.f7466d;
        long[] jArr6 = (long[]) l91Var2.f7467e;
        rs.D(jArr4, jArr5, jArr6);
        rs.D((long[]) l91Var.f7467e, jArr6, jArr3);
    }

    public static final l91 z(o91 o91Var) throws GeneralSecurityException {
        byte b2;
        int i;
        int i10;
        com.google.android.gms.internal.measurement.i4 i4Var = new com.google.android.gms.internal.measurement.i4(9);
        ArrayList<i91> arrayList = (ArrayList) i4Var.f13782c;
        i91 i91Var = new i91(o91Var);
        c6 c6Var = c6.i;
        i91Var.f6442c = c6Var;
        i91Var.f6440a = true;
        Iterator it = arrayList.iterator();
        while (true) {
            b2 = 0;
            if (!it.hasNext()) {
                break;
            }
            ((i91) it.next()).f6440a = false;
        }
        arrayList.add(i91Var);
        if (i4Var.f13781b) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        i4Var.f13781b = true;
        ArrayList<k91> arrayList2 = new ArrayList(arrayList.size());
        int i11 = 0;
        while (i11 < arrayList.size() - 1) {
            int i12 = i11 + 1;
            if (((i91) arrayList.get(i11)).f6442c == c6Var && ((i91) arrayList.get(i12)).f6442c != c6Var) {
                throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
            }
            i11 = i12;
        }
        HashSet hashSet = new HashSet();
        Integer num = null;
        for (i91 i91Var2 : arrayList) {
            i91Var2.getClass();
            o91 o91Var2 = i91Var2.f6441b;
            c6 c6Var2 = i91Var2.f6442c;
            if (c6Var2 == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            int i13 = 3;
            if (c6Var2 == c6Var) {
                int i14 = 0;
                while (true) {
                    if (i14 != 0 && !hashSet.contains(Integer.valueOf(i14))) {
                        break;
                    }
                    int i15 = ge1.f5788a;
                    i14 = 0;
                    while (i14 == 0) {
                        byte[] bArrA = ae1.a(4);
                        i14 = (bArrA[3] & 255) | ((bArrA[2] & 255) << 8) | ((bArrA[0] & 255) << 24) | ((bArrA[1] & 255) << 16);
                    }
                }
                i = i14;
            } else {
                i = 0;
            }
            Integer numValueOf = Integer.valueOf(i);
            if (hashSet.contains(numValueOf)) {
                int i16 = i;
                throw new GeneralSecurityException(l7.o.l(new StringBuilder(String.valueOf(i16).length() + 31), "Id ", i16, " is used twice in the keyset"));
            }
            hashSet.add(numValueOf);
            gr grVarB = cd1.f4188b.b(o91Var2, true != o91Var2.a() ? null : numValueOf);
            Object obj = h91.f6058d;
            if (obj.equals(obj)) {
                i10 = i13;
            } else if (h91.f6059e.equals(obj)) {
                i10 = 4;
            } else {
                if (!h91.f6060f.equals(obj)) {
                    throw new IllegalStateException("Unknown key status");
                }
                i13 = 5;
                i10 = i13;
            }
            boolean z5 = i91Var2.f6440a;
            k91 k91Var = new k91(grVarB, i10, i, z5, false, mp0.f7969g);
            if (z5) {
                if (num != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                num = numValueOf;
            }
            arrayList2.add(k91Var);
        }
        if (num == null) {
            throw new GeneralSecurityException("No primary was set");
        }
        bd1 bd1Var = (bd1) i4Var.f13783d;
        l91 l91Var = new l91(arrayList2, bd1Var);
        if (bd1Var.f3765a.isEmpty()) {
            return l91Var;
        }
        mp0 mp0Var = new mp0(10, b2);
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        for (k91 k91Var2 : arrayList2) {
            arrayList3.add(new k91(k91Var2.f7150a, k91Var2.f7156g, k91Var2.f7152c, k91Var2.f7153d, k91Var2.f7154e, mp0Var));
        }
        return new l91(arrayList3, bd1Var, l91Var, b2);
    }

    public Object A(gr grVar, Class cls) throws GeneralSecurityException {
        List list = (List) this.f7465c;
        l91 l91Var = (l91) this.f7467e;
        if (grVar == null) {
            throw new GeneralSecurityException("Currently only subclasses of InternalConfiguration are accepted");
        }
        rh1 rh1VarF = (l91Var == null ? this : l91Var).f();
        int i = r91.f9767a;
        int iZ = rh1VarF.z();
        boolean z5 = true;
        int i10 = 0;
        boolean z10 = false;
        for (qh1 qh1Var : rh1VarF.A()) {
            if (qh1Var.H() == 3) {
                if (!qh1Var.z()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(qh1Var.B())));
                }
                if (qh1Var.C() == ei1.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(qh1Var.B())));
                }
                if (qh1Var.H() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(qh1Var.B())));
                }
                if (qh1Var.B() == iZ) {
                    if (z10) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z10 = true;
                }
                z5 &= qh1Var.A().B() == 4;
                i10++;
            }
        }
        if (i10 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z10 && !z5) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (((k91) list.get(i11)).f7154e || !C(((k91) list.get(i11)).f7156g)) {
                String strZ = rh1VarF.C(i11).A().z();
                StringBuilder sb2 = new StringBuilder(String.valueOf(strZ).length() + String.valueOf(i11).length() + 44 + 32);
                sb2.append("Key parsing of key with index ");
                sb2.append(i11);
                sb2.append(" and type_url ");
                sb2.append(strZ);
                sb2.append(" failed, unable to get primitive");
                throw new GeneralSecurityException(sb2.toString());
            }
        }
        if (l91Var == null) {
            l91Var = this;
        }
        return grVar.r(l91Var, (bd1) this.f7466d, cls);
    }

    @Override // com.google.android.gms.internal.ads.yz1
    public r51 b(int i, pi piVar, int[] iArr) {
        v41 v41Var = x41.f12018c;
        fs1.y(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i10 = 0;
        int i11 = 0;
        while (i10 < piVar.f9070a) {
            int i12 = i;
            pi piVar2 = piVar;
            xz1 xz1Var = new xz1(i12, piVar2, i10, (uz1) this.f7465c, iArr[i10], (String) this.f7466d, (String) this.f7467e);
            int length = objArrCopyOf.length;
            int i13 = i11 + 1;
            int iD = s41.d(length, i13);
            if (iD > length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
            }
            objArrCopyOf[i11] = xz1Var;
            i10++;
            i11 = i13;
            i = i12;
            piVar = piVar2;
        }
        return x41.x(i11, objArrCopyOf);
    }

    public void c(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
        }
        this.f7465c = Integer.valueOf(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(com.google.android.gms.internal.ads.g91 r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, com.google.android.gms.internal.ads.az1 r15) throws com.google.android.gms.internal.ads.nz1 {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.l91.d(com.google.android.gms.internal.ads.g91, android.net.Uri, java.util.Map, long, long, com.google.android.gms.internal.ads.az1):void");
    }

    public rh1 f() {
        try {
            oh1 oh1VarF = rh1.F();
            for (k91 k91Var : (List) this.f7465c) {
                gr grVarA = k91Var.a();
                int i = k91Var.f7152c;
                int i10 = k91Var.f7156g;
                yd1 yd1Var = (yd1) jd1.f6829b.f(grVarA);
                Integer numB = grVarA.B();
                if (numB != null && numB.intValue() != i) {
                    throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
                }
                ph1 ph1VarD = qh1.D();
                jh1 jh1VarC = kh1.C();
                String str = (String) yd1Var.f12600c;
                jh1VarC.b();
                ((kh1) jh1VarC.f9560c).E(str);
                bn1 bn1Var = (bn1) yd1Var.f12602e;
                jh1VarC.b();
                ((kh1) jh1VarC.f9560c).F(bn1Var);
                int i11 = yd1Var.f12599b;
                jh1VarC.b();
                ((kh1) jh1VarC.f9560c).G(i11);
                ph1VarD.b();
                ((qh1) ph1VarD.f9560c).E((kh1) jh1VarC.d());
                ph1VarD.b();
                ((qh1) ph1VarD.f9560c).I(i10);
                ph1VarD.b();
                ((qh1) ph1VarD.f9560c).F(i);
                ei1 ei1Var = (ei1) yd1Var.f12603f;
                ph1VarD.b();
                ((qh1) ph1VarD.f9560c).G(ei1Var);
                qh1 qh1Var = (qh1) ph1VarD.d();
                oh1VarF.b();
                ((rh1) oh1VarF.f9560c).H(qh1Var);
                if (k91Var.f7153d) {
                    oh1VarF.b();
                    ((rh1) oh1VarF.f9560c).G(i);
                }
            }
            return (rh1) oh1VarF.d();
        } catch (GeneralSecurityException e3) {
            throw new oc(e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.i
    public synchronized void g() {
        ((zs1) this.f7467e).f13105c.g();
    }

    @Override // com.google.android.gms.internal.ads.i
    public synchronized h h() {
        h hVarH;
        zs1 zs1Var = (zs1) this.f7467e;
        androidx.datastore.preferences.protobuf.l lVar = zs1Var.f13105c;
        HashMap map = (HashMap) this.f7465c;
        hVarH = lVar.h();
        fv1 fv1Var = (fv1) this.f7466d;
        map.put(hVarH, fv1Var);
        ys1 ys1Var = (ys1) zs1Var.f13115n.get(fv1Var);
        if (ys1Var != null) {
            synchronized (ys1Var) {
                ys1Var.f12736d++;
            }
        }
        return hVarH;
    }

    @Override // com.google.android.gms.internal.ads.i
    public synchronized void i(h hVar) {
        ((zs1) this.f7467e).f13105c.i(hVar);
        y(hVar);
    }

    @Override // com.google.android.gms.internal.ads.i
    public synchronized void j(m6 m6Var) {
        ((zs1) this.f7467e).f13105c.j(m6Var);
        while (m6Var != null) {
            h hVar = (h) m6Var.f7790d;
            hVar.getClass();
            y(hVar);
            m6Var = (m6) m6Var.f7791e;
            if (m6Var == null || ((h) m6Var.f7790d) == null) {
                m6Var = null;
            }
        }
    }

    public void k(int i) throws GeneralSecurityException {
        if (i < 10 || i > 16) {
            throw new GeneralSecurityException(l7.o.j(i, "Invalid tag size for AesCmacParameters: ", new StringBuilder(String.valueOf(i).length() + 40)));
        }
        this.f7466d = Integer.valueOf(i);
    }

    public byte[] l() {
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        long[] jArr6 = new long[10];
        long[] jArr7 = new long[10];
        long[] jArr8 = new long[10];
        long[] jArr9 = new long[10];
        long[] jArr10 = new long[10];
        long[] jArr11 = new long[10];
        long[] jArr12 = new long[10];
        long[] jArr13 = new long[10];
        long[] jArr14 = (long[]) this.f7467e;
        rs.I(jArr4, jArr14);
        rs.I(jArr13, jArr4);
        rs.I(jArr12, jArr13);
        rs.D(jArr5, jArr12, jArr14);
        rs.D(jArr6, jArr5, jArr4);
        rs.I(jArr12, jArr6);
        rs.D(jArr7, jArr12, jArr5);
        rs.I(jArr12, jArr7);
        rs.I(jArr13, jArr12);
        rs.I(jArr12, jArr13);
        rs.I(jArr13, jArr12);
        rs.I(jArr12, jArr13);
        rs.D(jArr8, jArr12, jArr7);
        rs.I(jArr12, jArr8);
        rs.I(jArr13, jArr12);
        for (int i = 2; i < 10; i += 2) {
            rs.I(jArr12, jArr13);
            rs.I(jArr13, jArr12);
        }
        rs.D(jArr9, jArr13, jArr8);
        rs.I(jArr12, jArr9);
        rs.I(jArr13, jArr12);
        for (int i10 = 2; i10 < 20; i10 += 2) {
            rs.I(jArr12, jArr13);
            rs.I(jArr13, jArr12);
        }
        rs.D(jArr12, jArr13, jArr9);
        rs.I(jArr13, jArr12);
        rs.I(jArr12, jArr13);
        for (int i11 = 2; i11 < 10; i11 += 2) {
            rs.I(jArr13, jArr12);
            rs.I(jArr12, jArr13);
        }
        rs.D(jArr10, jArr12, jArr8);
        rs.I(jArr12, jArr10);
        rs.I(jArr13, jArr12);
        for (int i12 = 2; i12 < 50; i12 += 2) {
            rs.I(jArr12, jArr13);
            rs.I(jArr13, jArr12);
        }
        rs.D(jArr11, jArr13, jArr10);
        rs.I(jArr13, jArr11);
        rs.I(jArr12, jArr13);
        for (int i13 = 2; i13 < 100; i13 += 2) {
            rs.I(jArr13, jArr12);
            rs.I(jArr12, jArr13);
        }
        rs.D(jArr13, jArr12, jArr11);
        rs.I(jArr12, jArr13);
        rs.I(jArr13, jArr12);
        for (int i14 = 2; i14 < 50; i14 += 2) {
            rs.I(jArr12, jArr13);
            rs.I(jArr13, jArr12);
        }
        rs.D(jArr12, jArr13, jArr10);
        rs.I(jArr13, jArr12);
        rs.I(jArr12, jArr13);
        rs.I(jArr13, jArr12);
        rs.I(jArr12, jArr13);
        rs.I(jArr13, jArr12);
        rs.D(jArr, jArr13, jArr6);
        rs.D(jArr2, (long[]) this.f7465c, jArr);
        rs.D(jArr3, (long[]) this.f7466d, jArr);
        byte[] bArrM = rs.M(jArr3);
        bArrM[31] = (byte) (((rs.M(jArr2)[0] & 1) << 7) ^ bArrM[31]);
        return bArrM;
    }

    public k91 m() {
        for (k91 k91Var : (List) this.f7465c) {
            if (k91Var != null && k91Var.f7153d) {
                if (k91Var.f7151b == h91.f6058d) {
                    return k91Var;
                }
                throw new IllegalStateException("Keyset has primary which isn't enabled");
            }
        }
        throw new IllegalStateException("Keyset has no valid primary");
    }

    public long n() {
        v1 v1Var = (v1) this.f7467e;
        if (v1Var != null) {
            return v1Var.f11179e;
        }
        return -1L;
    }

    public ha1 o() throws GeneralSecurityException {
        xo0 xo0Var;
        sl1 sl1VarB;
        ka1 ka1Var = (ka1) this.f7465c;
        if (ka1Var == null || (xo0Var = (xo0) this.f7466d) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (ka1Var.f7166a != ((sl1) xo0Var.f12221c).f10334a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (ka1Var.a() && ((Integer) this.f7467e) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((ka1) this.f7465c).a() && ((Integer) this.f7467e) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        ja1 ja1Var = ((ka1) this.f7465c).f7168c;
        if (ja1Var == ja1.f6792e) {
            sl1VarB = kd1.f7203a;
        } else if (ja1Var == ja1.f6791d) {
            sl1VarB = kd1.a(((Integer) this.f7467e).intValue());
        } else {
            if (ja1Var != ja1.f6790c) {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(((ka1) this.f7465c).f7168c)));
            }
            sl1VarB = kd1.b(((Integer) this.f7467e).intValue());
        }
        return new ha1((ka1) this.f7465c, (xo0) this.f7466d, sl1VarB, (Integer) this.f7467e);
    }

    public la1 p() throws GeneralSecurityException {
        xo0 xo0Var;
        sl1 sl1VarB;
        oa1 oa1Var = (oa1) this.f7465c;
        if (oa1Var == null || (xo0Var = (xo0) this.f7466d) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (oa1Var.f8652a != ((sl1) xo0Var.f12221c).f10334a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (oa1Var.a() && ((Integer) this.f7467e) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((oa1) this.f7465c).a() && ((Integer) this.f7467e) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        h91 h91Var = ((oa1) this.f7465c).f8653b;
        if (h91Var == h91.i) {
            sl1VarB = kd1.f7203a;
        } else if (h91Var == h91.f6062h) {
            sl1VarB = kd1.a(((Integer) this.f7467e).intValue());
        } else {
            if (h91Var != h91.f6061g) {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(((oa1) this.f7465c).f8653b)));
            }
            sl1VarB = kd1.b(((Integer) this.f7467e).intValue());
        }
        return new la1((oa1) this.f7465c, (xo0) this.f7466d, sl1VarB, (Integer) this.f7467e);
    }

    public pa1 q() throws GeneralSecurityException {
        xo0 xo0Var;
        sl1 sl1VarB;
        ra1 ra1Var = (ra1) this.f7465c;
        if (ra1Var == null || (xo0Var = (xo0) this.f7466d) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (ra1Var.f9784a != ((sl1) xo0Var.f12221c).f10334a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (ra1Var.a() && ((Integer) this.f7467e) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((ra1) this.f7465c).a() && ((Integer) this.f7467e) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        ea1 ea1Var = ((ra1) this.f7465c).f9785b;
        if (ea1Var == ea1.f4901k) {
            sl1VarB = kd1.f7203a;
        } else if (ea1Var == ea1.f4900j) {
            sl1VarB = kd1.a(((Integer) this.f7467e).intValue());
        } else {
            if (ea1Var != ea1.i) {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(((ra1) this.f7465c).f9785b)));
            }
            sl1VarB = kd1.b(((Integer) this.f7467e).intValue());
        }
        return new pa1((ra1) this.f7465c, (xo0) this.f7466d, sl1VarB, (Integer) this.f7467e);
    }

    public he1 r() throws GeneralSecurityException {
        xo0 xo0Var;
        sl1 sl1VarA;
        je1 je1Var = (je1) this.f7465c;
        if (je1Var == null || (xo0Var = (xo0) this.f7466d) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (je1Var.f6836a != ((sl1) xo0Var.f12221c).f10334a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (je1Var.a() && ((Integer) this.f7467e) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((je1) this.f7465c).a() && ((Integer) this.f7467e) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        h91 h91Var = ((je1) this.f7465c).f6838c;
        if (h91Var == h91.f6072s) {
            sl1VarA = kd1.f7203a;
        } else if (h91Var == h91.f6071r || h91Var == h91.f6070q) {
            sl1VarA = kd1.a(((Integer) this.f7467e).intValue());
        } else {
            if (h91Var != h91.f6069p) {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(((je1) this.f7465c).f6838c)));
            }
            sl1VarA = kd1.b(((Integer) this.f7467e).intValue());
        }
        return new he1((je1) this.f7465c, (xo0) this.f7466d, sl1VarA, (Integer) this.f7467e);
    }

    public je1 s() throws GeneralSecurityException {
        Integer num = (Integer) this.f7465c;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (((Integer) this.f7466d) != null) {
            return new je1(num.intValue(), ((Integer) this.f7466d).intValue(), (h91) this.f7467e);
        }
        throw new GeneralSecurityException("tag size not set");
    }

    public ne1 t() throws GeneralSecurityException {
        xo0 xo0Var;
        sl1 sl1VarA;
        re1 re1Var = (re1) this.f7465c;
        if (re1Var == null || (xo0Var = (xo0) this.f7466d) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (re1Var.f9925a != ((sl1) xo0Var.f12221c).f10334a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (re1Var.a() && ((Integer) this.f7467e) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((re1) this.f7465c).a() && ((Integer) this.f7467e) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        qe1 qe1Var = ((re1) this.f7465c).f9927c;
        if (qe1Var == qe1.f9473e) {
            sl1VarA = kd1.f7203a;
        } else if (qe1Var == qe1.f9472d || qe1Var == qe1.f9471c) {
            sl1VarA = kd1.a(((Integer) this.f7467e).intValue());
        } else {
            if (qe1Var != qe1.f9470b) {
                throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(((re1) this.f7465c).f9927c)));
            }
            sl1VarA = kd1.b(((Integer) this.f7467e).intValue());
        }
        return new ne1((re1) this.f7465c, (xo0) this.f7466d, sl1VarA, (Integer) this.f7467e);
    }

    public String toString() {
        switch (this.f7464b) {
            case 0:
                rh1 rh1VarF = f();
                int i = r91.f9767a;
                sh1 sh1VarZ = vh1.z();
                int iZ = rh1VarF.z();
                sh1VarZ.b();
                ((vh1) sh1VarZ.f9560c).A(iZ);
                for (qh1 qh1Var : rh1VarF.A()) {
                    th1 th1VarZ = uh1.z();
                    String strZ = qh1Var.A().z();
                    th1VarZ.b();
                    ((uh1) th1VarZ.f9560c).A(strZ);
                    int iH = qh1Var.H();
                    th1VarZ.b();
                    ((uh1) th1VarZ.f9560c).D(iH);
                    ei1 ei1VarC = qh1Var.C();
                    th1VarZ.b();
                    ((uh1) th1VarZ.f9560c).C(ei1VarC);
                    int iB = qh1Var.B();
                    th1VarZ.b();
                    ((uh1) th1VarZ.f9560c).B(iB);
                    uh1 uh1Var = (uh1) th1VarZ.d();
                    sh1VarZ.b();
                    ((vh1) sh1VarZ.f9560c).B(uh1Var);
                }
                return ((vh1) sh1VarZ.d()).toString();
            default:
                return super.toString();
        }
    }

    public jj1 u() throws GeneralSecurityException {
        sl1 sl1VarA;
        hj1 hj1Var = (hj1) this.f7465c;
        if (hj1Var == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        ECPoint eCPoint = (ECPoint) this.f7466d;
        if (eCPoint == null) {
            throw new GeneralSecurityException("Cannot build without public point");
        }
        lc1.a(eCPoint, hj1Var.f6162b.f5833b.getCurve());
        if (((hj1) this.f7465c).a() && ((Integer) this.f7467e) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((hj1) this.f7465c).a() && ((Integer) this.f7467e) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        ja1 ja1Var = ((hj1) this.f7465c).f6164d;
        if (ja1Var == ja1.f6800n) {
            sl1VarA = kd1.f7203a;
        } else if (ja1Var == ja1.f6799m || ja1Var == ja1.f6798l) {
            sl1VarA = kd1.a(((Integer) this.f7467e).intValue());
        } else {
            if (ja1Var != ja1.f6797k) {
                throw new IllegalStateException("Unknown EcdsaParameters.Variant: ".concat(((hj1) this.f7465c).f6164d.f6802b));
            }
            sl1VarA = kd1.b(((Integer) this.f7467e).intValue());
        }
        return new jj1((hj1) this.f7465c, (ECPoint) this.f7466d, sl1VarA, (Integer) this.f7467e);
    }

    public bk1 v() throws GeneralSecurityException {
        sl1 sl1VarA;
        if (((yj1) this.f7465c) == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        BigInteger bigInteger = (BigInteger) this.f7466d;
        if (bigInteger == null) {
            throw new GeneralSecurityException("Cannot build without modulus");
        }
        int iBitLength = bigInteger.bitLength();
        yj1 yj1Var = (yj1) this.f7465c;
        int i = yj1Var.f12636a;
        if (iBitLength != i) {
            throw new GeneralSecurityException(pe.a.g(new StringBuilder(String.valueOf(iBitLength).length() + 56 + String.valueOf(i).length()), iBitLength, "Got modulus size ", i, ", but parameters requires modulus size "));
        }
        if (yj1Var.a() && ((Integer) this.f7467e) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((yj1) this.f7465c).a() && ((Integer) this.f7467e) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        xj1 xj1Var = ((yj1) this.f7465c).f12638c;
        if (xj1Var == xj1.f12173e) {
            sl1VarA = kd1.f7203a;
        } else if (xj1Var == xj1.f12172d || xj1Var == xj1.f12171c) {
            sl1VarA = kd1.a(((Integer) this.f7467e).intValue());
        } else {
            if (xj1Var != xj1.f12170b) {
                throw new IllegalStateException("Unknown RsaSsaPkcs1Parameters.Variant: ".concat(String.valueOf(((yj1) this.f7465c).f12638c)));
            }
            sl1VarA = kd1.b(((Integer) this.f7467e).intValue());
        }
        return new bk1((yj1) this.f7465c, (BigInteger) this.f7466d, sl1VarA, (Integer) this.f7467e);
    }

    public ik1 w() throws GeneralSecurityException {
        sl1 sl1VarA;
        if (((gk1) this.f7465c) == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        BigInteger bigInteger = (BigInteger) this.f7466d;
        if (bigInteger == null) {
            throw new GeneralSecurityException("Cannot build without modulus");
        }
        int iBitLength = bigInteger.bitLength();
        gk1 gk1Var = (gk1) this.f7465c;
        int i = gk1Var.f5839a;
        if (iBitLength != i) {
            throw new GeneralSecurityException(pe.a.g(new StringBuilder(String.valueOf(iBitLength).length() + 56 + String.valueOf(i).length()), iBitLength, "Got modulus size ", i, ", but parameters requires modulus size "));
        }
        if (gk1Var.a() && ((Integer) this.f7467e) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((gk1) this.f7465c).a() && ((Integer) this.f7467e) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        fk1 fk1Var = ((gk1) this.f7465c).f5841c;
        if (fk1Var == fk1.f5377e) {
            sl1VarA = kd1.f7203a;
        } else if (fk1Var == fk1.f5376d || fk1Var == fk1.f5375c) {
            sl1VarA = kd1.a(((Integer) this.f7467e).intValue());
        } else {
            if (fk1Var != fk1.f5374b) {
                throw new IllegalStateException("Unknown RsaSsaPssParameters.Variant: ".concat(String.valueOf(((gk1) this.f7465c).f5841c)));
            }
            sl1VarA = kd1.b(((Integer) this.f7467e).intValue());
        }
        return new ik1((gk1) this.f7465c, (BigInteger) this.f7466d, sl1VarA, (Integer) this.f7467e);
    }

    public k91 x(int i) {
        List list = (List) this.f7465c;
        if (i < 0 || i >= list.size()) {
            int size = list.size();
            throw new IndexOutOfBoundsException(pe.a.g(new StringBuilder(String.valueOf(i).length() + 34 + String.valueOf(size).length()), i, "Invalid index ", size, " for keyset of size "));
        }
        k91 k91Var = (k91) list.get(i);
        if (!C(k91Var.f7156g)) {
            throw new IllegalStateException(l7.o.l(new StringBuilder(String.valueOf(i).length() + 42), "Keyset-Entry at position ", i, " has wrong status"));
        }
        if (k91Var.f7154e) {
            throw new IllegalStateException(l7.o.l(new StringBuilder(String.valueOf(i).length() + 48), "Keyset-Entry at position ", i, " didn't parse correctly"));
        }
        return (k91) list.get(i);
    }

    public void y(h hVar) {
        fv1 fv1Var = (fv1) ((HashMap) this.f7465c).remove(hVar);
        fv1Var.getClass();
        ys1 ys1Var = (ys1) ((zs1) this.f7467e).f13115n.get(fv1Var);
        if (ys1Var != null) {
            synchronized (ys1Var) {
                ys1Var.f12736d--;
            }
        }
    }

    public l91(d2 d2Var) {
        this.f7464b = 17;
        this.f7465c = d2Var;
    }

    public /* synthetic */ l91(Object obj, Object obj2, Object obj3, int i) {
        this.f7464b = i;
        this.f7465c = obj;
        this.f7466d = obj2;
        this.f7467e = obj3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l91(int i) {
        this(new long[10], new long[10], new long[10], 4);
        this.f7464b = i;
        switch (i) {
            case 6:
                this.f7465c = null;
                this.f7466d = null;
                this.f7467e = h91.f6072s;
                break;
            default:
                break;
        }
    }

    public l91(Context context) {
        this.f7464b = 15;
        this.f7465c = context != null ? context.getApplicationContext() : null;
        if (context == null) {
            this.f7466d = hv1.f6270c;
        }
    }

    public l91(zs1 zs1Var, fv1 fv1Var) {
        this.f7464b = 12;
        this.f7467e = zs1Var;
        this.f7465c = new HashMap();
        this.f7466d = fv1Var;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.internal.ads.nt1, java.lang.Object] */
    public /* synthetic */ l91(ot1 ot1Var, Context context) {
        this.f7464b = 13;
        this.f7467e = ot1Var;
        this.f7465c = new WeakReference(context);
        ?? r02 = new IntConsumer() { // from class: com.google.android.gms.internal.ads.nt1
            @Override // java.util.function.IntConsumer
            public final /* synthetic */ void accept(int i) {
                ot1 ot1Var2 = (ot1) this.f8441a.f7467e;
                if (ot1Var2.Y) {
                    return;
                }
                ot1Var2.W1(1, 19, Integer.valueOf(i));
            }
        };
        this.f7466d = r02;
        context.registerDeviceIdChangeListener(new x(2, ot1Var.f8795w.y(ot1Var.f8793u, null)), r02);
    }

    public /* synthetic */ l91(ew1 ew1Var) {
        this.f7464b = 14;
        this.f7467e = ew1Var;
        Handler handlerN = cq0.n();
        this.f7465c = handlerN;
        dw1 dw1Var = new dw1(0, this);
        this.f7466d = dw1Var;
        ew1Var.f5109a.registerStreamEventCallback(new ja(handlerN, 1), dw1Var);
    }

    public l91(List list, bd1 bd1Var) throws GeneralSecurityException {
        this.f7464b = 0;
        this.f7465c = list;
        this.f7466d = bd1Var;
        if (((AtomicBoolean) fc1.f5328a.f6553c).get()) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            boolean z5 = false;
            while (it.hasNext()) {
                k91 k91Var = (k91) it.next();
                int i = k91Var.f7152c;
                if (!hashSet.contains(Integer.valueOf(i))) {
                    hashSet.add(Integer.valueOf(i));
                    z5 |= k91Var.f7153d;
                } else {
                    throw new GeneralSecurityException(l7.o.l(new StringBuilder(String.valueOf(i).length() + 121), "KeyID ", i, " is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing."));
                }
            }
            if (!z5) {
                throw new GeneralSecurityException("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
            }
        }
        this.f7467e = null;
    }

    public l91(t10[] t10VarArr) {
        this.f7464b = 16;
        qw1 qw1Var = new qw1();
        qw1Var.f9614m = 0;
        qw1Var.f9616o = 0;
        qw1Var.f9617p = 0;
        byte[] bArr = cq0.f4294b;
        qw1Var.f9615n = bArr;
        qw1Var.f9618q = bArr;
        w30 w30Var = new w30();
        w30Var.f11614c = 1.0f;
        w30Var.f11615d = 1.0f;
        l00 l00Var = l00.f7359e;
        w30Var.f11616e = l00Var;
        w30Var.f11617f = l00Var;
        w30Var.f11618g = l00Var;
        w30Var.f11619h = l00Var;
        ByteBuffer byteBuffer = t10.f10463a;
        w30Var.f11621k = byteBuffer;
        w30Var.f11622l = byteBuffer;
        w30Var.f11613b = -1;
        t10[] t10VarArr2 = {qw1Var, w30Var};
        this.f7465c = t10VarArr2;
        System.arraycopy(t10VarArr, 0, t10VarArr2, 0, 0);
        this.f7466d = qw1Var;
        this.f7467e = w30Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l91(zd1 zd1Var) {
        this(4);
        this.f7464b = 4;
        e(this, zd1Var);
    }

    public l91(l91 l91Var) {
        this.f7464b = 4;
        this.f7465c = Arrays.copyOf((long[]) l91Var.f7465c, 10);
        this.f7466d = Arrays.copyOf((long[]) l91Var.f7466d, 10);
        this.f7467e = Arrays.copyOf((long[]) l91Var.f7467e, 10);
    }
}
