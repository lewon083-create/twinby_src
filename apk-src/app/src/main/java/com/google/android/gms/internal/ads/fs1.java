package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Mac;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class fs1 implements df1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f5425d = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f5427c;

    public fs1(String str, int i) {
        this.f5426b = i;
        switch (i) {
            case 1:
                this.f5427c = Logger.getLogger(str);
                break;
            default:
                this.f5427c = str;
                break;
        }
    }

    public static final void A(bn1 bn1Var, ArrayDeque arrayDeque) {
        if (!bn1Var.y()) {
            if (!(bn1Var instanceof xo1)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(bn1Var.getClass())));
            }
            xo1 xo1Var = (xo1) bn1Var;
            A(xo1Var.f12223e, arrayDeque);
            A(xo1Var.f12224f, arrayDeque);
            return;
        }
        int iBinarySearch = Arrays.binarySearch(xo1.i, bn1Var.n());
        if (iBinarySearch < 0) {
            iBinarySearch = (-(iBinarySearch + 1)) - 1;
        }
        int iE = xo1.E(iBinarySearch + 1);
        if (arrayDeque.isEmpty() || ((bn1) arrayDeque.peek()).n() >= iE) {
            arrayDeque.push(bn1Var);
            return;
        }
        int iE2 = xo1.E(iBinarySearch);
        bn1 xo1Var2 = (bn1) arrayDeque.pop();
        while (!arrayDeque.isEmpty() && ((bn1) arrayDeque.peek()).n() < iE2) {
            xo1Var2 = new xo1((bn1) arrayDeque.pop(), xo1Var2);
        }
        xo1 xo1Var3 = new xo1(xo1Var2, bn1Var);
        while (!arrayDeque.isEmpty()) {
            int iBinarySearch2 = Arrays.binarySearch(xo1.i, xo1Var3.f12222d);
            if (iBinarySearch2 < 0) {
                iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
            }
            if (((bn1) arrayDeque.peek()).n() >= xo1.E(iBinarySearch2 + 1)) {
                break;
            } else {
                xo1Var3 = new xo1((bn1) arrayDeque.pop(), xo1Var3);
            }
        }
        arrayDeque.push(xo1Var3);
    }

    public static void B(ed.d dVar, xr0 xr0Var) {
        if (((Boolean) vl.f11414c.r()).booleanValue()) {
            i81 i81VarS = i81.s(dVar);
            in0 in0Var = new in0(4, xr0Var);
            i81VarS.a(new l81(0, i81VarS, in0Var), hx.f6285g);
        }
    }

    public static byte[] C(BigInteger bigInteger, int i) throws GeneralSecurityException {
        if (bigInteger.signum() == -1) {
            throw new IllegalArgumentException("integer must be nonnegative");
        }
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        if (length == i) {
            return byteArray;
        }
        int i10 = i + 1;
        if (length > i10) {
            throw new GeneralSecurityException("integer too large");
        }
        if (length == i10) {
            if (byteArray[0] == 0) {
                return Arrays.copyOfRange(byteArray, 1, length);
            }
            throw new GeneralSecurityException("integer too large");
        }
        byte[] bArr = new byte[i];
        System.arraycopy(byteArray, 0, bArr, i - length, length);
        return bArr;
    }

    public static int D(Set set) {
        Iterator it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    public static long E(long j10, long j11) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j11) + Long.numberOfLeadingZeros(j11) + Long.numberOfLeadingZeros(~j10) + Long.numberOfLeadingZeros(j10);
        if (iNumberOfLeadingZeros > 65) {
            return j10 * j11;
        }
        long j12 = j10 ^ j11;
        long j13 = (j12 >>> 63) + Long.MAX_VALUE;
        if (!((iNumberOfLeadingZeros < 64) | ((j11 == Long.MIN_VALUE) & (j10 < 0)))) {
            long j14 = j10 * j11;
            if (j10 == 0 || j14 / j10 == j11) {
                return j14;
            }
        }
        return j13;
    }

    public static Uri F(String str, String str2, String str3) {
        int iIndexOf = str.indexOf("&adurl");
        if (iIndexOf == -1) {
            iIndexOf = str.indexOf("?adurl");
        }
        if (iIndexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i = iIndexOf + 1;
        StringBuilder sb2 = new StringBuilder(str.substring(0, i));
        l7.o.t(sb2, str2, "=", str3, "&");
        sb2.append(str.substring(i));
        return Uri.parse(sb2.toString());
    }

    public static void G(String str) {
        if (str.length() <= 10000) {
            return;
        }
        String strSubstring = str.substring(0, 30);
        throw new NumberFormatException(t.z.g(new StringBuilder(String.valueOf(strSubstring).length() + 28), "Number string too large: ", strSubstring, "..."));
    }

    public static final void H(byte[] bArr, String str, dv0 dv0Var) {
        if (dv0Var == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("os.arch:");
        sb2.append(System.getProperty("os.arch"));
        sb2.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb2.append("supported_abis:");
                sb2.append(Arrays.toString(strArr));
                sb2.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb2.append("CPU_ABI:");
        sb2.append(Build.CPU_ABI);
        sb2.append(";CPU_ABI2:");
        sb2.append(Build.CPU_ABI2);
        sb2.append(";");
        if (bArr != null) {
            sb2.append("ELF:");
            sb2.append(Arrays.toString(bArr));
            sb2.append(";");
        }
        if (str != null) {
            sb2.append("dbg:");
            sb2.append(str);
            sb2.append(";");
        }
        dv0Var.d(4007, sb2.toString());
    }

    public static String I(Context context, String str) {
        p9.k kVar = p9.k.C;
        String strB = kVar.f31318y.b(context);
        String strC = kVar.f31318y.c(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(strB)) {
            str = F(str, "gmp_app_id", strB).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(strC)) ? str : F(str, "fbs_aiid", strC).toString();
    }

    public static Executor J(final Executor executor, final h81 h81Var) {
        executor.getClass();
        return executor == f81.f5272b ? executor : new Executor() { // from class: com.google.android.gms.internal.ads.u81
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(Runnable runnable) {
                try {
                    executor.execute(runnable);
                } catch (RejectedExecutionException e3) {
                    h81Var.f(e3);
                }
            }
        };
    }

    public static void K(List list, g31 g31Var, int i, int i10) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i10) {
                break;
            } else if (g31Var.a(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i10--;
            if (i10 < i) {
                return;
            } else {
                list.remove(i10);
            }
        }
    }

    public static boolean L(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size()) {
                return set.containsAll(set2);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static void M() throws rc0 {
        StringBuilder sb2 = new StringBuilder();
        y(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        boolean z5 = false;
        int i = 0;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z5) {
                sb2.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x".concat(String.valueOf(Integer.toHexString(iGlGetError)));
            }
            sb2.append("glError: ");
            sb2.append(strGluErrorString);
            Integer numValueOf = Integer.valueOf(iGlGetError);
            int length = objArrCopyOf.length;
            int i10 = i + 1;
            int iD = s41.d(length, i10);
            if (iD > length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
            }
            objArrCopyOf[i] = numValueOf;
            z5 = true;
            i = i10;
        }
        if (z5) {
            throw new rc0(sb2.toString(), x41.x(i, objArrCopyOf));
        }
    }

    public static void N(String str, boolean z5) throws rc0 {
        if (z5) {
            return;
        }
        v41 v41Var = x41.f12018c;
        throw new rc0(str, r51.f9713f);
    }

    public static boolean O(ad.n1 n1Var, Collection collection) {
        collection.getClass();
        if (collection instanceof n51) {
            collection = ((n51) collection).h();
        }
        boolean zRemove = false;
        if (!(collection instanceof Set) || collection.size() <= n1Var.size()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                zRemove |= n1Var.remove(it.next());
            }
            return zRemove;
        }
        Iterator<E> it2 = n1Var.iterator();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                zRemove = true;
            }
        }
        return zRemove;
    }

    public static int P(iq0 iq0Var) {
        int iA = hl.l.A(iq0Var) - 1;
        return (iA == 0 || iA == 1) ? 7 : 23;
    }

    public static boolean Q(String str) throws rc0 {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        N("No EGL display.", !eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY));
        N("Error in eglInitialize.", EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0));
        M();
        String strEglQueryString = EGL14.eglQueryString(eGLDisplayEglGetDisplay, 12373);
        return strEglQueryString != null && strEglQueryString.contains(str);
    }

    public static void R(ed.d dVar, as0 as0Var, xr0 xr0Var, boolean z5) {
        if (((Boolean) vl.f11414c.r()).booleanValue()) {
            i81 i81VarS = i81.s(dVar);
            com.google.android.gms.internal.measurement.i4 i4Var = new com.google.android.gms.internal.measurement.i4();
            i4Var.f13782c = as0Var;
            i4Var.f13783d = xr0Var;
            i4Var.f13781b = z5;
            i81VarS.a(new l81(0, i81VarS, i4Var), hx.f6285g);
        }
    }

    public static byte a(long j10) {
        ix.Z("out of range: %s", j10, (j10 >> 8) == 0);
        return (byte) j10;
    }

    public static int c(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            default:
                return 0;
        }
    }

    public static long d(long j10, long j11, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j12 = j10 / j11;
        long j13 = j10 - (j11 * j12);
        if (j13 == 0) {
            return j12;
        }
        int i = ((int) ((j10 ^ j11) >> 63)) | 1;
        switch (s61.f10188a[roundingMode.ordinal()]) {
            case 1:
                ix.B(false);
                return j12;
            case 2:
                return j12;
            case 3:
                if (i >= 0) {
                    return j12;
                }
                break;
            case 4:
                break;
            case 5:
                if (i <= 0) {
                    return j12;
                }
                break;
            case 6:
            case 7:
            case 8:
                long jAbs = Math.abs(j13);
                long jAbs2 = jAbs - (Math.abs(j11) - jAbs);
                if (jAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j12) == 0)) {
                        return j12;
                    }
                } else if (jAbs2 <= 0) {
                    return j12;
                }
            default:
                throw new AssertionError();
        }
        return j12 + ((long) i);
    }

    public static z51 e(Set set, d51 d51Var) {
        ix.m0(set, "set1");
        ix.m0(d51Var, "set2");
        return new z51(set, d51Var);
    }

    public static String f(String str, Context context, boolean z5, HashMap map) {
        String strD;
        wk wkVar = al.O0;
        q9.s sVar = q9.s.f31967e;
        yk ykVar = sVar.f31970c;
        yk ykVar2 = sVar.f31970c;
        if (((Boolean) ykVar.a(wkVar)).booleanValue() && !z5) {
            return str;
        }
        p9.k kVar = p9.k.C;
        fw fwVar = kVar.f31318y;
        t9.g0 g0Var = kVar.f31297c;
        fw fwVar2 = kVar.f31318y;
        if (!fwVar.a(context) || TextUtils.isEmpty(str) || (strD = fwVar2.d(context)) == null) {
            return str;
        }
        String str2 = (String) ykVar2.a(al.H0);
        if (((Boolean) ykVar2.a(al.G0)).booleanValue() && str.contains(str2)) {
            if (g0Var.G(str)) {
                Map map2 = (Map) map.get("_ac");
                fwVar2.getClass();
                fwVar2.h(context, "_ac", strD, fw.f(map2));
                return I(context, str).replace(str2, strD);
            }
            if (!g0Var.H(str)) {
                return str;
            }
            Map map3 = (Map) map.get("_ai");
            fwVar2.getClass();
            fwVar2.h(context, "_ai", strD, fw.f(map3));
            return I(context, str).replace(str2, strD);
        }
        if (str.contains("fbs_aeid") || ((Boolean) ykVar2.a(al.F0)).booleanValue()) {
            return str;
        }
        if (g0Var.G(str)) {
            Map map4 = (Map) map.get("_ac");
            fwVar2.getClass();
            fwVar2.h(context, "_ac", strD, fw.f(map4));
            return F(I(context, str), "fbs_aeid", strD).toString();
        }
        if (!g0Var.H(str)) {
            return str;
        }
        Map map5 = (Map) map.get("_ai");
        fwVar2.getClass();
        fwVar2.h(context, "_ai", strD, fw.f(map5));
        return F(I(context, str), "fbs_aeid", strD).toString();
    }

    public static BigDecimal g(String str) {
        G(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs(bigDecimal.scale()) < 10000) {
            return bigDecimal;
        }
        throw new NumberFormatException("Number has unsupported scale: ".concat(str));
    }

    public static q9.g3 h(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            yp0 yp0Var = (yp0) it.next();
            if (yp0Var.f12681c) {
                arrayList.add(k9.h.f27261k);
            } else {
                arrayList.add(new k9.h(yp0Var.f12679a, yp0Var.f12680b));
            }
        }
        return new q9.g3(context, (k9.h[]) arrayList.toArray(new k9.h[arrayList.size()]));
    }

    public static void i(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(l7.o.j(i, "csd-", new StringBuilder(String.valueOf(i).length() + 4)), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }

    public static void j(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 != null) {
            return;
        }
        String string = obj.toString();
        throw new NullPointerException(t.z.g(new StringBuilder(string.length() + 26), "null value in entry: ", string, "=null"));
    }

    public static boolean l(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26 && ("samsung".equals(Build.MANUFACTURER) || "XT1650".equals(Build.MODEL))) {
            return false;
        }
        if (i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
            return Q("EGL_EXT_protected_content");
        }
        return false;
    }

    public static boolean m(ng ngVar) {
        int iOrdinal = ngVar.ordinal();
        return iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5;
    }

    public static boolean n(String str) {
        return str == null || str.isEmpty();
    }

    public static byte[] o(BigInteger bigInteger) {
        if (bigInteger.signum() != -1) {
            return bigInteger.toByteArray();
        }
        throw new IllegalArgumentException("n must not be negative");
    }

    public static byte[] p(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        int i = 0;
        while (i < 16) {
            int i10 = i + 1;
            byte b2 = bArr[i];
            byte b10 = (byte) ((b2 + b2) & 254);
            bArr2[i] = b10;
            if (i < 15) {
                bArr2[i] = (byte) (((bArr[i10] >> 7) & 1) | b10);
            }
            i = i10;
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }

    public static int q(boolean z5) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        List supportedPerformancePoints;
        try {
            ow1 ow1Var = new ow1();
            ow1Var.e("video/avc");
            jx1 jx1Var = new jx1(ow1Var);
            if (jx1Var.f6975m != null) {
                r51 r51VarB = mx1.b(bw1.f3936f, jx1Var, z5, false);
                for (int i = 0; i < r51VarB.f9715e; i++) {
                    if (((dx1) r51VarB.get(i)).f4715d != null && (videoCapabilities = ((dx1) r51VarB.get(i)).f4715d.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        androidx.lifecycle.j0.m();
                        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePointC = androidx.lifecycle.j0.c();
                        for (int i10 = 0; i10 < supportedPerformancePoints.size(); i10++) {
                            if (androidx.lifecycle.j0.e(supportedPerformancePoints.get(i10)).covers(performancePointC)) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
        } catch (ix1 unused) {
        }
        return 0;
    }

    public static long r(long j10, long j11) {
        ix.k(j10, "a");
        ix.k(j11, "b");
        if (j10 == 0) {
            return j11;
        }
        if (j11 == 0) {
            return j10;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j10);
        long jNumberOfTrailingZeros = j10 >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j11);
        long j12 = j11 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j12) {
            long j13 = jNumberOfTrailingZeros - j12;
            long j14 = (j13 >> 63) & j13;
            long j15 = (j13 - j14) - j14;
            jNumberOfTrailingZeros = j15 >> Long.numberOfTrailingZeros(j15);
            j12 += j14;
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.google.android.gms.internal.ads.ng s(android.content.Context r14, com.google.android.gms.internal.ads.dv0 r15) {
        /*
            Method dump skipped, instruction units count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fs1.s(android.content.Context, com.google.android.gms.internal.ads.dv0):com.google.android.gms.internal.ads.ng");
    }

    public static a61 t(Set set, g31 g31Var) {
        if (set instanceof SortedSet) {
            Set set2 = (SortedSet) set;
            if (!(set2 instanceof a61)) {
                return new b61(set2, g31Var);
            }
            a61 a61Var = (a61) set2;
            g31 g31Var2 = a61Var.f2794c;
            g31Var2.getClass();
            return new b61((SortedSet) a61Var.f2793b, new h31(Arrays.asList(g31Var2, g31Var)));
        }
        if (!(set instanceof a61)) {
            set.getClass();
            return new a61(set, g31Var);
        }
        a61 a61Var2 = (a61) set;
        g31 g31Var3 = a61Var2.f2794c;
        g31Var3.getClass();
        return new a61(a61Var2.f2793b, new h31(Arrays.asList(g31Var3, g31Var)));
    }

    public static o91 u(byte[] bArr) throws GeneralSecurityException {
        try {
            kn1 kn1Var = kn1.f7271a;
            int i = tm1.f10663a;
            mh1 mh1VarC = mh1.C(bArr, kn1.f7272b);
            jd1 jd1Var = jd1.f6829b;
            sl1 sl1VarB = ge1.b(mh1VarC.z());
            zd1 zd1Var = new zd1(0, mh1VarC, sl1VarB);
            fe1 fe1Var = (fe1) jd1Var.f6830a.get();
            fe1Var.getClass();
            return !fe1Var.f5333d.containsKey(new de1(zd1.class, sl1VarB)) ? new ad1(zd1Var) : jd1Var.g(zd1Var);
        } catch (IOException e3) {
            throw new GeneralSecurityException("Failed to parse proto", e3);
        }
    }

    public static df1 v(bf1 bf1Var) {
        xo0 xo0Var = bf1Var.f3775e;
        ef1 ef1Var = new ef1(((sl1) xo0Var.f12221c).b());
        try {
            Provider providerE = c80.e();
            if (providerE == null) {
                throw new GeneralSecurityException("Conscrypt not available");
            }
            Mac.getInstance("AESCMAC", providerE);
            return new zd1(27, (Object) ef1Var, (Object) new zd1(((sl1) xo0Var.f12221c).b(), providerE), false);
        } catch (GeneralSecurityException unused) {
            return ef1Var;
        }
    }

    public static fs1 w(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new fs1(cls.getSimpleName(), 0) : new fs1(cls.getSimpleName(), 1);
    }

    public static Object x(z51 z51Var, String str) {
        g51 g51Var = new g51(z51Var, z51Var.f12895b, z51Var.f12896c);
        return g51Var.hasNext() ? g51Var.next() : str;
    }

    public static void y(int i, String str) {
        if (i >= 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 29 + String.valueOf(i).length());
        sb2.append(str);
        sb2.append(" cannot be negative but was: ");
        sb2.append(i);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static void z(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public final void k(String str) {
        switch (this.f5426b) {
            case 0:
                String str2 = (String) this.f5427c;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + String.valueOf(str2).length() + 1);
                sb2.append(str2);
                sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
                sb2.append(str);
                Log.d("isoparser", sb2.toString());
                break;
            default:
                ((Logger) this.f5427c).logp(Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", str);
                break;
        }
    }
}
