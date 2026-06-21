package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.tasks.Task;
import com.vk.api.sdk.exceptions.VKApiCodes;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.ECParameterSpec;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gr {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static UiModeManager f5890c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5891b;

    public /* synthetic */ gr(int i) {
        this.f5891b = i;
    }

    public static ECParameterSpec D(el1 el1Var) throws NoSuchAlgorithmException {
        int iOrdinal = el1Var.ordinal();
        if (iOrdinal == 0) {
            return lc1.f7480a;
        }
        if (iOrdinal == 1) {
            return lc1.f7481b;
        }
        if (iOrdinal == 2) {
            return lc1.f7482c;
        }
        throw new NoSuchAlgorithmException("curve not implemented:".concat(el1Var.toString()));
    }

    public static void E(Context context, boolean z5) {
        if (z5) {
            u9.i.g("This request is sent from a test device.");
            return;
        }
        u9.d dVar = q9.r.f31959g.f31960a;
        String strC = u9.d.c(context);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strC).length() + 102);
        sb2.append("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"");
        sb2.append(strC);
        sb2.append("\")) to get test ads on this device.");
        u9.i.g(sb2.toString());
    }

    public static void F(ll1 ll1Var) throws GeneralSecurityException {
        int iOrdinal = ll1Var.ordinal();
        if (iOrdinal != 2 && iOrdinal != 3 && iOrdinal != 4) {
            throw new GeneralSecurityException("Unsupported hash: ".concat(String.valueOf(ll1Var.name())));
        }
    }

    public static void G(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static boolean H(double d10) {
        return Math.getExponent(d10) <= 1023;
    }

    public static boolean I(Object obj, Map map) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static int J(byte[] bArr, int i, um1 um1Var) {
        long j10 = bArr[i];
        int i10 = i + 1;
        if (j10 >= 0) {
            um1Var.f10991b = j10;
            return i10;
        }
        int i11 = i + 2;
        byte b2 = bArr[i10];
        long j11 = (j10 & 127) | (((long) (b2 & 127)) << 7);
        int i12 = 7;
        while (b2 < 0) {
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            i12 += 7;
            j11 |= ((long) (b10 & 127)) << i12;
            b2 = b10;
            i11 = i13;
        }
        um1Var.f10991b = j11;
        return i11;
    }

    public static void K(int i) throws GeneralSecurityException {
        if (i < 2048) {
            throw new GeneralSecurityException(String.format("Modulus size is %d; only modulus size >= 2048-bit is supported", Integer.valueOf(i)));
        }
        if (gc1.a() && i != 2048 && i != 3072) {
            throw new GeneralSecurityException(String.format("Modulus size is %d; only modulus size of 2048- or 3072-bit is supported in FIPS mode.", Integer.valueOf(i)));
        }
    }

    public static void L(Object obj, Class cls) {
        if (obj == null) {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }

    public static byte[] M(byte[] bArr) {
        int length;
        int i = 0;
        while (true) {
            length = bArr.length;
            if (i >= length || bArr[i] != 0) {
                break;
            }
            i++;
        }
        if (i == length) {
            i = length - 1;
        }
        int i10 = (bArr[i] & 128) == 128 ? 1 : 0;
        int i11 = length - i;
        byte[] bArr2 = new byte[i11 + i10];
        System.arraycopy(bArr, i, bArr2, i10, i11);
        return bArr2;
    }

    public static int N(int i, byte[] bArr) {
        int i10 = bArr[i] & 255;
        int i11 = bArr[i + 1] & 255;
        int i12 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public static String P(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb2 = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i10 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (iIndexOf = str.indexOf("%s", i10)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i10, iIndexOf);
            sb2.append(T(objArr[i]));
            i10 = iIndexOf + 2;
            i++;
        }
        sb2.append((CharSequence) str, i10, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb2.append(str2);
                sb2.append(T(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static void Q(BigInteger bigInteger) throws GeneralSecurityException {
        if (!bigInteger.testBit(0)) {
            throw new GeneralSecurityException("Public exponent must be odd.");
        }
        if (bigInteger.compareTo(BigInteger.valueOf(65536L)) <= 0) {
            throw new GeneralSecurityException("Public exponent must be greater than 65536.");
        }
    }

    public static int R(byte b2, byte b10, byte b11, byte b12) {
        return (b2 << 24) | ((b10 & 255) << 16) | ((b11 & 255) << 8) | (b12 & 255);
    }

    public static long S(int i, byte[] bArr) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public static String T(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e3) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String strG = t.z.g(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strG), (Throwable) e3);
            String name2 = e3.getClass().getName();
            StringBuilder sb2 = new StringBuilder(strG.length() + 8 + name2.length() + 1);
            l7.o.t(sb2, "<", strG, " threw ", name2);
            sb2.append(">");
            return sb2.toString();
        }
    }

    public static boolean U(byte b2) {
        return b2 > -65;
    }

    public static int V(byte[] bArr, int i, um1 um1Var) throws co1 {
        int iF = f(bArr, i, um1Var);
        int i10 = um1Var.f10990a;
        if (i10 < 0) {
            throw new co1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i10 == 0) {
            um1Var.f10992c = "";
            return iF;
        }
        um1Var.f10992c = lp1.d(bArr, iF, i10);
        return iF + i10;
    }

    public static int[] W(AbstractCollection abstractCollection) {
        if (abstractCollection instanceof u61) {
            u61 u61Var = (u61) abstractCollection;
            return Arrays.copyOfRange(u61Var.f10849b, u61Var.f10850c, u61Var.f10851d);
        }
        Object[] array = abstractCollection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static int X(byte[] bArr, int i, um1 um1Var) throws co1 {
        int iF = f(bArr, i, um1Var);
        int i10 = um1Var.f10990a;
        if (i10 < 0) {
            throw new co1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i10 > bArr.length - iF) {
            throw new co1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i10 == 0) {
            um1Var.f10992c = bn1.f3837c;
            return iF;
        }
        um1Var.f10992c = bn1.A(bArr, iF, i10);
        return iF + i10;
    }

    public static List Y(int... iArr) {
        int length = iArr.length;
        return length == 0 ? Collections.EMPTY_LIST : new u61(0, length, iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Integer Z(java.lang.String r14) {
        /*
            r14.getClass()
            boolean r0 = r14.isEmpty()
            r1 = 0
            if (r0 == 0) goto Ld
        La:
            r14 = r1
            goto L7e
        Ld:
            r0 = 0
            char r2 = r14.charAt(r0)
            r3 = 45
            if (r2 != r3) goto L17
            r0 = 1
        L17:
            int r4 = r14.length()
            if (r0 != r4) goto L1e
            goto La
        L1e:
            int r4 = r0 + 1
            char r0 = r14.charAt(r0)
            r5 = -1
            r6 = 128(0x80, float:1.8E-43)
            if (r0 >= r6) goto L2e
            byte[] r7 = com.google.android.gms.internal.ads.w61.f11680a
            r0 = r7[r0]
            goto L31
        L2e:
            byte[] r0 = com.google.android.gms.internal.ads.w61.f11680a
            r0 = r5
        L31:
            if (r0 < 0) goto La
            r7 = 10
            if (r0 < r7) goto L38
            goto La
        L38:
            int r0 = -r0
            long r8 = (long) r0
        L3a:
            int r0 = r14.length()
            r10 = -9223372036854775808
            if (r4 >= r0) goto L6d
            int r0 = r4 + 1
            char r4 = r14.charAt(r4)
            if (r4 >= r6) goto L4f
            byte[] r12 = com.google.android.gms.internal.ads.w61.f11680a
            r4 = r12[r4]
            goto L52
        L4f:
            byte[] r4 = com.google.android.gms.internal.ads.w61.f11680a
            r4 = r5
        L52:
            if (r4 < 0) goto La
            if (r4 >= r7) goto La
            r12 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r12 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r12 >= 0) goto L60
            goto La
        L60:
            r12 = 10
            long r8 = r8 * r12
            long r12 = (long) r4
            long r10 = r10 + r12
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r4 >= 0) goto L6a
            goto La
        L6a:
            long r8 = r8 - r12
            r4 = r0
            goto L3a
        L6d:
            if (r2 != r3) goto L74
            java.lang.Long r14 = java.lang.Long.valueOf(r8)
            goto L7e
        L74:
            int r14 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r14 != 0) goto L79
            goto La
        L79:
            long r2 = -r8
            java.lang.Long r14 = java.lang.Long.valueOf(r2)
        L7e:
            if (r14 == 0) goto L97
            long r2 = r14.longValue()
            int r0 = r14.intValue()
            long r4 = (long) r0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L8e
            goto L97
        L8e:
            int r14 = r14.intValue()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            return r14
        L97:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gr.Z(java.lang.String):java.lang.Integer");
    }

    public static int a0(Object obj, yo1 yo1Var, byte[] bArr, int i, int i10, um1 um1Var) throws co1 {
        int iY = i + 1;
        int i11 = bArr[i];
        if (i11 < 0) {
            iY = y(i11, bArr, iY, um1Var);
            i11 = um1Var.f10990a;
        }
        int i12 = iY;
        if (i11 < 0 || i11 > i10 - i12) {
            throw new co1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i13 = um1Var.f10993d + 1;
        um1Var.f10993d = i13;
        if (i13 >= 100) {
            throw new co1("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i14 = i12 + i11;
        yo1Var.j(obj, bArr, i12, i14, um1Var);
        um1Var.f10993d--;
        um1Var.f10992c = obj;
        return i14;
    }

    public static int b0(Object obj, yo1 yo1Var, byte[] bArr, int i, int i10, int i11, um1 um1Var) throws co1 {
        no1 no1Var = (no1) yo1Var;
        int i12 = um1Var.f10993d + 1;
        um1Var.f10993d = i12;
        if (i12 >= 100) {
            throw new co1("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iY = no1Var.y(obj, bArr, i, i10, i11, um1Var);
        um1Var.f10993d--;
        um1Var.f10992c = obj;
        return iY;
    }

    public static int c0(int i, byte[] bArr, int i10, int i11, zn1 zn1Var, um1 um1Var) {
        tn1 tn1Var = (tn1) zn1Var;
        int iF = f(bArr, i10, um1Var);
        tn1Var.f(um1Var.f10990a);
        while (iF < i11) {
            int iF2 = f(bArr, iF, um1Var);
            if (i != um1Var.f10990a) {
                break;
            }
            iF = f(bArr, iF2, um1Var);
            tn1Var.f(um1Var.f10990a);
        }
        return iF;
    }

    public static int d0(byte[] bArr, int i, zn1 zn1Var, um1 um1Var) throws co1 {
        tn1 tn1Var = (tn1) zn1Var;
        int iF = f(bArr, i, um1Var);
        int i10 = um1Var.f10990a + iF;
        while (iF < i10) {
            iF = f(bArr, iF, um1Var);
            tn1Var.f(um1Var.f10990a);
        }
        if (iF == i10) {
            return iF;
        }
        throw new co1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int e(long j10) {
        int i = (int) j10;
        ix.Z("Out of range: %s", j10, ((long) i) == j10);
        return i;
    }

    public static int e0(yo1 yo1Var, int i, byte[] bArr, int i10, int i11, zn1 zn1Var, um1 um1Var) throws co1 {
        sn1 sn1VarH = yo1Var.h();
        yo1 yo1Var2 = yo1Var;
        byte[] bArr2 = bArr;
        int i12 = i11;
        um1 um1Var2 = um1Var;
        int iA0 = a0(sn1VarH, yo1Var2, bArr2, i10, i12, um1Var2);
        yo1Var2.a(sn1VarH);
        um1Var2.f10992c = sn1VarH;
        zn1Var.add(sn1VarH);
        while (iA0 < i12) {
            um1 um1Var3 = um1Var2;
            int i13 = i12;
            int iF = f(bArr2, iA0, um1Var3);
            if (i != um1Var3.f10990a) {
                break;
            }
            byte[] bArr3 = bArr2;
            yo1 yo1Var3 = yo1Var2;
            sn1 sn1VarH2 = yo1Var3.h();
            iA0 = a0(sn1VarH2, yo1Var3, bArr3, iF, i13, um1Var3);
            yo1Var2 = yo1Var3;
            bArr2 = bArr3;
            i12 = i13;
            um1Var2 = um1Var3;
            yo1Var2.a(sn1VarH2);
            um1Var2.f10992c = sn1VarH2;
            zn1Var.add(sn1VarH2);
        }
        return iA0;
    }

    public static int f(byte[] bArr, int i, um1 um1Var) {
        int i10 = i + 1;
        byte b2 = bArr[i];
        if (b2 < 0) {
            return y(b2, bArr, i10, um1Var);
        }
        um1Var.f10990a = b2;
        return i10;
    }

    public static int f0(int i, byte[] bArr, int i10, int i11, ep1 ep1Var, um1 um1Var) throws co1 {
        if ((i >>> 3) == 0) {
            throw new co1("Protocol message contained an invalid tag (zero).");
        }
        int i12 = i & 7;
        if (i12 == 0) {
            int iJ = J(bArr, i10, um1Var);
            ep1Var.d(i, Long.valueOf(um1Var.f10991b));
            return iJ;
        }
        if (i12 == 1) {
            ep1Var.d(i, Long.valueOf(S(i10, bArr)));
            return i10 + 8;
        }
        if (i12 == 2) {
            int iF = f(bArr, i10, um1Var);
            int i13 = um1Var.f10990a;
            if (i13 < 0) {
                throw new co1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i13 > bArr.length - iF) {
                throw new co1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i13 == 0) {
                ep1Var.d(i, bn1.f3837c);
            } else {
                ep1Var.d(i, bn1.A(bArr, iF, i13));
            }
            return iF + i13;
        }
        if (i12 != 3) {
            if (i12 != 5) {
                throw new co1("Protocol message contained an invalid tag (zero).");
            }
            ep1Var.d(i, Integer.valueOf(N(i10, bArr)));
            return i10 + 4;
        }
        int i14 = (i & (-8)) | 4;
        ep1 ep1VarA = ep1.a();
        int i15 = um1Var.f10993d + 1;
        um1Var.f10993d = i15;
        if (i15 >= 100) {
            throw new co1("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i16 = 0;
        while (true) {
            if (i10 >= i11) {
                break;
            }
            int iF2 = f(bArr, i10, um1Var);
            int i17 = um1Var.f10990a;
            if (i17 == i14) {
                i16 = i17;
                i10 = iF2;
                break;
            }
            i10 = f0(i17, bArr, iF2, i11, ep1VarA, um1Var);
            i16 = i17;
        }
        um1Var.f10993d--;
        if (i10 > i11 || i16 != i14) {
            throw new co1("Failed to parse the message.");
        }
        ep1Var.d(i, ep1VarA);
        return i10;
    }

    public static long g(double d10) {
        ix.A("not a normal value", H(d10));
        int exponent = Math.getExponent(d10);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d10) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits + jDoubleToRawLongBits : jDoubleToRawLongBits | 4503599627370496L;
    }

    public static int g0(int i, byte[] bArr, int i10, int i11, um1 um1Var) throws co1 {
        if ((i >>> 3) == 0) {
            throw new co1("Protocol message contained an invalid tag (zero).");
        }
        int i12 = i & 7;
        if (i12 == 0) {
            return J(bArr, i10, um1Var);
        }
        if (i12 == 1) {
            return i10 + 8;
        }
        if (i12 == 2) {
            return f(bArr, i10, um1Var) + um1Var.f10990a;
        }
        if (i12 != 3) {
            if (i12 == 5) {
                return i10 + 4;
            }
            throw new co1("Protocol message contained an invalid tag (zero).");
        }
        int i13 = (i & (-8)) | 4;
        int i14 = 0;
        while (i10 < i11) {
            i10 = f(bArr, i10, um1Var);
            i14 = um1Var.f10990a;
            if (i14 == i13) {
                break;
            }
            i10 = g0(i14, bArr, i10, i11, um1Var);
        }
        if (i10 > i11 || i14 != i13) {
            throw new co1("Failed to parse the message.");
        }
        return i10;
    }

    public static Bundle n(Pair... pairArr) {
        Bundle bundle = new Bundle();
        if (((Boolean) q9.s.f31967e.f31970c.a(al.B2)).booleanValue()) {
            for (int i = 0; i < 2; i++) {
                Pair pair = pairArr[i];
                if (!TextUtils.isEmpty((CharSequence) pair.first) && ((Long) pair.second).longValue() > 0) {
                    bundle.putLong((String) pair.first, ((Long) pair.second).longValue());
                }
            }
        }
        return bundle;
    }

    public static wd o(Context context, String str, String str2) {
        wd wdVar;
        try {
            wdVar = (wd) ((LinkedBlockingQueue) new z7(context, str, str2).f12904f).poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            wdVar = null;
        }
        return wdVar == null ? z7.d() : wdVar;
    }

    public static qx0 p(Task task) {
        qx0 qx0Var = new qx0();
        qx0Var.i = task;
        task.b(f81.f5272b, new pp0(4, qx0Var));
        return qx0Var;
    }

    public static void t(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
        }
    }

    public static void v(String str, Throwable th2, int i) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 20);
        sb2.append("Ad failed to load : ");
        sb2.append(i);
        u9.i.g(sb2.toString());
        t9.c0.n(str, th2);
        if (i == 3) {
            return;
        }
        p9.k.C.f31302h.e(str, th2);
    }

    public static void w(xa.a aVar, Throwable th2, String str) {
        xt.a((Context) xa.b.X1(aVar)).d(th2, str, ((Double) km.f7262f.r()).floatValue());
    }

    public static boolean x(int i) {
        Boolean bool;
        if (i - 1 == 0) {
            return !gc1.a();
        }
        if (!gc1.a()) {
            return true;
        }
        try {
            bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
        } catch (Exception unused) {
            gc1.f5779a.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
            bool = Boolean.FALSE;
        }
        return bool.booleanValue();
    }

    public static int y(int i, byte[] bArr, int i10, um1 um1Var) {
        byte b2 = bArr[i10];
        int i11 = i10 + 1;
        int i12 = i & 127;
        if (b2 >= 0) {
            um1Var.f10990a = i12 | (b2 << 7);
            return i11;
        }
        int i13 = i12 | ((b2 & 127) << 7);
        int i14 = i10 + 2;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            um1Var.f10990a = i13 | (b10 << 14);
            return i14;
        }
        int i15 = i13 | ((b10 & 127) << 14);
        int i16 = i10 + 3;
        byte b11 = bArr[i14];
        if (b11 >= 0) {
            um1Var.f10990a = i15 | (b11 << 21);
            return i16;
        }
        int i17 = i15 | ((b11 & 127) << 21);
        int i18 = i10 + 4;
        byte b12 = bArr[i16];
        if (b12 >= 0) {
            um1Var.f10990a = i17 | (b12 << 28);
            return i18;
        }
        int i19 = i17 | ((b12 & 127) << 28);
        while (true) {
            int i20 = i18 + 1;
            if (bArr[i18] >= 0) {
                um1Var.f10990a = i19;
                return i20;
            }
            i18 = i20;
        }
    }

    public static int z(long j10) {
        if (j10 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return j10 < -2147483648L ? VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR : (int) j10;
    }

    public abstract int A(u71 u71Var);

    public abstract Integer B();

    public abstract Object C();

    public abstract o91 q();

    public abstract Object r(l91 l91Var, bd1 bd1Var, Class cls);

    public String toString() {
        switch (this.f5891b) {
            case 10:
                return C().toString();
            default:
                return super.toString();
        }
    }

    public abstract void u(u71 u71Var, Set set);

    public /* synthetic */ gr(boolean z5) {
        this.f5891b = 8;
    }
}
