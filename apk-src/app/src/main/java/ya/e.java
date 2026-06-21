package ya;

import a0.b1;
import a0.q2;
import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import cj.n;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.internal.ads.um1;
import com.google.android.gms.internal.ads.zz;
import com.google.android.gms.internal.auth.m;
import com.google.android.gms.internal.measurement.f6;
import com.google.android.gms.internal.measurement.k5;
import com.google.android.gms.internal.measurement.l5;
import com.google.android.gms.internal.measurement.m6;
import com.google.android.gms.internal.measurement.q5;
import com.google.android.gms.internal.measurement.q6;
import com.google.android.gms.internal.measurement.t5;
import com.google.android.gms.internal.measurement.x6;
import com.google.android.gms.internal.measurement.z4;
import com.google.firebase.messaging.y;
import d8.j;
import g0.k2;
import g0.m2;
import g0.o2;
import g0.p2;
import io.sentry.clientreport.DiscardedEvent;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;
import yi.k;
import yi.l;
import yi.o;
import yi.t;
import yi.u;
import yi.x;
import yi.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ClassLoader f36587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Thread f36588b;

    public static final t2.e A(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new t2.e(name);
    }

    public static final t2.e B(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new t2.e(name);
    }

    public static t C(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != 3541555) {
            if (iHashCode == 100343516) {
                str.equals("inapp");
            }
        } else if (str.equals("subs")) {
            return t.SUBS;
        }
        return t.INAPP;
    }

    public static ArrayList D(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            z zVar = (z) it.next();
            d8.a aVar = new d8.a(1);
            aVar.f15576b = zVar.f45748a;
            aVar.f15577c = E(zVar.f45749b);
            arrayList.add(aVar.a());
        }
        return arrayList;
    }

    public static String E(t tVar) {
        int iOrdinal = tVar.ordinal();
        if (iOrdinal == 0) {
            return "inapp";
        }
        if (iOrdinal == 1) {
            return "subs";
        }
        throw new yi.b("UNKNOWN_TYPE", "Unknown product type: " + tVar, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static g0.p2 F(int r4, android.util.Size r5, g0.o r6, int r7, g0.n2 r8, g0.k2 r9) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ya.e.F(int, android.util.Size, g0.o, int, g0.n2, g0.k2):g0.p2");
    }

    public static ArrayList G(DisplayManager displayManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new ArrayList();
        }
        try {
            Field declaredField = DisplayManager.class.getDeclaredField("mGlobal");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(displayManager);
            Field declaredField2 = obj.getClass().getDeclaredField("mDisplayListeners");
            declaredField2.setAccessible(true);
            ArrayList arrayList = (ArrayList) declaredField2.get(obj);
            ArrayList arrayList2 = new ArrayList();
            Field field = null;
            for (Object obj2 : arrayList) {
                if (field == null) {
                    field = obj2.getClass().getField("mListener");
                    field.setAccessible(true);
                }
                arrayList2.add((DisplayManager.DisplayListener) field.get(obj2));
            }
            return arrayList2;
        } catch (IllegalAccessException | NoSuchFieldException e3) {
            Log.w("DisplayListenerProxy", "Could not extract WebView's display listeners. " + e3);
            return new ArrayList();
        }
    }

    public static int H(byte[] bArr, int i, um1 um1Var) {
        int i10 = i + 1;
        byte b2 = bArr[i];
        if (b2 < 0) {
            return J(b2, bArr, i10, um1Var);
        }
        um1Var.f10990a = b2;
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00b7 A[Catch: all -> 0x00b3, PHI: r2
      0x00b7: PHI (r2v1 java.lang.Thread) = (r2v0 java.lang.Thread), (r2v11 java.lang.Thread) binds: [B:7:0x000c, B:47:0x00b0] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000e, B:46:0x00ae, B:61:0x00e5, B:12:0x0023, B:52:0x00b6, B:53:0x00b7, B:64:0x00e9, B:65:0x00ea, B:13:0x0024, B:15:0x0031, B:25:0x004b, B:26:0x0052, B:28:0x005d, B:34:0x0072, B:35:0x0079, B:43:0x008a, B:44:0x00ac, B:18:0x0040, B:54:0x00b8, B:60:0x00e4, B:59:0x00c2), top: B:76:0x0003, inners: #2, #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized java.lang.ClassLoader I() {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ya.e.I():java.lang.ClassLoader");
    }

    public static int J(int i, byte[] bArr, int i10, um1 um1Var) {
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

    public static int K(byte[] bArr, int i, um1 um1Var) {
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

    public static int L(int i, byte[] bArr) {
        int i10 = bArr[i] & 255;
        int i11 = bArr[i + 1] & 255;
        int i12 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public static long M(int i, byte[] bArr) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public static int N(byte[] bArr, int i, um1 um1Var) throws t5 {
        int iH = H(bArr, i, um1Var);
        int i10 = um1Var.f10990a;
        if (i10 < 0) {
            throw new t5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i10 == 0) {
            um1Var.f10992c = "";
            return iH;
        }
        int i11 = x6.f14084a;
        int length = bArr.length;
        if ((((length - iH) - i10) | iH | i10) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iH), Integer.valueOf(i10)));
        }
        int i12 = iH + i10;
        char[] cArr = new char[i10];
        int i13 = 0;
        while (iH < i12) {
            byte b2 = bArr[iH];
            if (b2 < 0) {
                break;
            }
            iH++;
            cArr[i13] = (char) b2;
            i13++;
        }
        while (iH < i12) {
            int i14 = iH + 1;
            byte b10 = bArr[iH];
            if (b10 >= 0) {
                cArr[i13] = (char) b10;
                i13++;
                iH = i14;
                while (iH < i12) {
                    byte b11 = bArr[iH];
                    if (b11 >= 0) {
                        iH++;
                        cArr[i13] = (char) b11;
                        i13++;
                    }
                }
            } else {
                if (b10 >= -32) {
                    if (b10 >= -16) {
                        if (i14 >= i12 - 2) {
                            throw new t5("Protocol message had invalid UTF-8.");
                        }
                        byte b12 = bArr[i14];
                        int i15 = iH + 3;
                        byte b13 = bArr[iH + 2];
                        iH += 4;
                        byte b14 = bArr[i15];
                        if (!m.F(b12)) {
                            if ((((b12 + 112) + (b10 << 28)) >> 30) == 0 && !m.F(b13) && !m.F(b14)) {
                                int i16 = ((b12 & 63) << 12) | ((b10 & 7) << 18) | ((b13 & 63) << 6) | (b14 & 63);
                                cArr[i13] = (char) ((i16 >>> 10) + 55232);
                                cArr[i13 + 1] = (char) ((i16 & 1023) + 56320);
                                i13 += 2;
                            }
                        }
                        throw new t5("Protocol message had invalid UTF-8.");
                    }
                    if (i14 >= i12 - 1) {
                        throw new t5("Protocol message had invalid UTF-8.");
                    }
                    int i17 = i13 + 1;
                    int i18 = iH + 2;
                    byte b15 = bArr[i14];
                    iH += 3;
                    byte b16 = bArr[i18];
                    if (!m.F(b15)) {
                        if (b10 == -32) {
                            if (b15 >= -96) {
                                b10 = -32;
                            }
                        }
                        if (b10 == -19) {
                            if (b15 < -96) {
                                b10 = -19;
                            }
                        }
                        if (!m.F(b16)) {
                            cArr[i13] = (char) (((b15 & 63) << 6) | ((b10 & 15) << 12) | (b16 & 63));
                            i13 = i17;
                        }
                    }
                    throw new t5("Protocol message had invalid UTF-8.");
                }
                if (i14 >= i12) {
                    throw new t5("Protocol message had invalid UTF-8.");
                }
                int i19 = i13 + 1;
                iH += 2;
                byte b17 = bArr[i14];
                if (b10 < -62 || m.F(b17)) {
                    throw new t5("Protocol message had invalid UTF-8.");
                }
                cArr[i13] = (char) ((b17 & 63) | ((b10 & 31) << 6));
                i13 = i19;
            }
        }
        um1Var.f10992c = new String(cArr, 0, i13);
        return i12;
    }

    public static int O(byte[] bArr, int i, um1 um1Var) throws t5 {
        int iH = H(bArr, i, um1Var);
        int i10 = um1Var.f10990a;
        if (i10 < 0) {
            throw new t5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i10 > bArr.length - iH) {
            throw new t5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i10 == 0) {
            um1Var.f10992c = z4.f14114d;
            return iH;
        }
        um1Var.f10992c = z4.f(bArr, iH, i10);
        return iH + i10;
    }

    public static int P(Object obj, m6 m6Var, byte[] bArr, int i, int i10, um1 um1Var) throws t5 {
        int iJ = i + 1;
        int i11 = bArr[i];
        if (i11 < 0) {
            iJ = J(i11, bArr, iJ, um1Var);
            i11 = um1Var.f10990a;
        }
        int i12 = iJ;
        if (i11 < 0 || i11 > i10 - i12) {
            throw new t5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i13 = um1Var.f10993d + 1;
        um1Var.f10993d = i13;
        if (i13 >= 100) {
            throw new t5("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i14 = i12 + i11;
        m6Var.g(obj, bArr, i12, i14, um1Var);
        um1Var.f10993d--;
        um1Var.f10992c = obj;
        return i14;
    }

    public static int Q(Object obj, m6 m6Var, byte[] bArr, int i, int i10, int i11, um1 um1Var) throws t5 {
        f6 f6Var = (f6) m6Var;
        int i12 = um1Var.f10993d + 1;
        um1Var.f10993d = i12;
        if (i12 >= 100) {
            throw new t5("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iT = f6Var.t(obj, bArr, i, i10, i11, um1Var);
        um1Var.f10993d--;
        um1Var.f10992c = obj;
        return iT;
    }

    public static int R(int i, byte[] bArr, int i10, int i11, q5 q5Var, um1 um1Var) {
        l5 l5Var = (l5) q5Var;
        int iH = H(bArr, i10, um1Var);
        l5Var.f(um1Var.f10990a);
        while (iH < i11) {
            int iH2 = H(bArr, iH, um1Var);
            if (i != um1Var.f10990a) {
                break;
            }
            iH = H(bArr, iH2, um1Var);
            l5Var.f(um1Var.f10990a);
        }
        return iH;
    }

    public static int S(byte[] bArr, int i, q5 q5Var, um1 um1Var) throws t5 {
        l5 l5Var = (l5) q5Var;
        int iH = H(bArr, i, um1Var);
        int i10 = um1Var.f10990a + iH;
        while (iH < i10) {
            iH = H(bArr, iH, um1Var);
            l5Var.f(um1Var.f10990a);
        }
        if (iH == i10) {
            return iH;
        }
        throw new t5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int T(m6 m6Var, int i, byte[] bArr, int i10, int i11, q5 q5Var, um1 um1Var) throws t5 {
        k5 k5VarH = m6Var.h();
        m6 m6Var2 = m6Var;
        byte[] bArr2 = bArr;
        int i12 = i11;
        um1 um1Var2 = um1Var;
        int iP = P(k5VarH, m6Var2, bArr2, i10, i12, um1Var2);
        m6Var2.f(k5VarH);
        um1Var2.f10992c = k5VarH;
        q5Var.add(k5VarH);
        while (iP < i12) {
            um1 um1Var3 = um1Var2;
            int i13 = i12;
            int iH = H(bArr2, iP, um1Var3);
            if (i != um1Var3.f10990a) {
                break;
            }
            byte[] bArr3 = bArr2;
            m6 m6Var3 = m6Var2;
            k5 k5VarH2 = m6Var3.h();
            iP = P(k5VarH2, m6Var3, bArr3, iH, i13, um1Var3);
            m6Var2 = m6Var3;
            bArr2 = bArr3;
            i12 = i13;
            um1Var2 = um1Var3;
            m6Var2.f(k5VarH2);
            um1Var2.f10992c = k5VarH2;
            q5Var.add(k5VarH2);
        }
        return iP;
    }

    public static int U(int i, byte[] bArr, int i10, int i11, q6 q6Var, um1 um1Var) throws t5 {
        if ((i >>> 3) == 0) {
            throw new t5("Protocol message contained an invalid tag (zero).");
        }
        int i12 = i & 7;
        if (i12 == 0) {
            int iK = K(bArr, i10, um1Var);
            q6Var.d(i, Long.valueOf(um1Var.f10991b));
            return iK;
        }
        if (i12 == 1) {
            q6Var.d(i, Long.valueOf(M(i10, bArr)));
            return i10 + 8;
        }
        if (i12 == 2) {
            int iH = H(bArr, i10, um1Var);
            int i13 = um1Var.f10990a;
            if (i13 < 0) {
                throw new t5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i13 > bArr.length - iH) {
                throw new t5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i13 == 0) {
                q6Var.d(i, z4.f14114d);
            } else {
                q6Var.d(i, z4.f(bArr, iH, i13));
            }
            return iH + i13;
        }
        if (i12 != 3) {
            if (i12 != 5) {
                throw new t5("Protocol message contained an invalid tag (zero).");
            }
            q6Var.d(i, Integer.valueOf(L(i10, bArr)));
            return i10 + 4;
        }
        int i14 = (i & (-8)) | 4;
        q6 q6VarA = q6.a();
        int i15 = um1Var.f10993d + 1;
        um1Var.f10993d = i15;
        if (i15 >= 100) {
            throw new t5("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i16 = 0;
        while (true) {
            if (i10 >= i11) {
                break;
            }
            int iH2 = H(bArr, i10, um1Var);
            int i17 = um1Var.f10990a;
            if (i17 == i14) {
                i16 = i17;
                i10 = iH2;
                break;
            }
            i10 = U(i17, bArr, iH2, i11, q6VarA, um1Var);
            i16 = i17;
        }
        um1Var.f10993d--;
        if (i10 > i11 || i16 != i14) {
            throw new t5("Failed to parse the message.");
        }
        q6Var.d(i, q6VarA);
        return i10;
    }

    public static int V(int i, byte[] bArr, int i10, int i11, um1 um1Var) throws t5 {
        if ((i >>> 3) == 0) {
            throw new t5("Protocol message contained an invalid tag (zero).");
        }
        int i12 = i & 7;
        if (i12 == 0) {
            return K(bArr, i10, um1Var);
        }
        if (i12 == 1) {
            return i10 + 8;
        }
        if (i12 == 2) {
            return H(bArr, i10, um1Var) + um1Var.f10990a;
        }
        if (i12 != 3) {
            if (i12 == 5) {
                return i10 + 4;
            }
            throw new t5("Protocol message contained an invalid tag (zero).");
        }
        int i13 = (i & (-8)) | 4;
        int i14 = 0;
        while (i10 < i11) {
            i10 = H(bArr, i10, um1Var);
            i14 = um1Var.f10990a;
            if (i14 == i13) {
                break;
            }
            i10 = V(i14, bArr, i10, i11, um1Var);
        }
        if (i10 > i11 || i14 != i13) {
            throw new t5("Failed to parse the message.");
        }
        return i10;
    }

    public static final String a(String str) {
        String string;
        if (str == null || (string = StringsKt.P(str).toString()) == null || string.length() <= 0) {
            return null;
        }
        return string;
    }

    public static final t2.e b(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new t2.e(name);
    }

    public static void c(String str) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ('!' > cCharAt || cCharAt >= 127) {
                throw new IllegalArgumentException(al.b.g("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str).toString());
            }
        }
    }

    public static void d(String str, String str2) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(al.b.g("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i), str2));
                sb2.append(al.b.o(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb2.toString().toString());
            }
        }
    }

    public static p2 e(o2 type, m2 size, k2 streamUseCase) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(streamUseCase, "streamUseCase");
        return new p2(type, size, streamUseCase);
    }

    public static void f(String str, String str2, Object obj) {
        String strM = m(str);
        if (Log.isLoggable(strM, 3)) {
            Log.d(strM, String.format(str2, obj));
        }
    }

    public static void g(String str, String str2, Exception exc) {
        String strM = m(str);
        if (Log.isLoggable(strM, 6)) {
            Log.e(strM, str2, exc);
        }
    }

    public static l h(j jVar) {
        k kVar;
        int i = jVar.f15636a;
        if (i != 12) {
            switch (i) {
                case -2:
                    kVar = k.FEATURE_NOT_SUPPORTED;
                    break;
                case -1:
                    kVar = k.SERVICE_DISCONNECTED;
                    break;
                case 0:
                    kVar = k.OK;
                    break;
                case 1:
                    kVar = k.USER_CANCELED;
                    break;
                case 2:
                    kVar = k.SERVICE_UNAVAILABLE;
                    break;
                case 3:
                    kVar = k.BILLING_UNAVAILABLE;
                    break;
                case 4:
                    kVar = k.ITEM_UNAVAILABLE;
                    break;
                case 5:
                    kVar = k.DEVELOPER_ERROR;
                    break;
                case 6:
                default:
                    kVar = k.ERROR;
                    break;
                case 7:
                    kVar = k.ITEM_ALREADY_OWNED;
                    break;
                case 8:
                    kVar = k.ITEM_NOT_OWNED;
                    break;
            }
        } else {
            kVar = k.NETWORK_ERROR;
        }
        String str = jVar.f15637b;
        l lVar = new l();
        lVar.f45690a = kVar;
        if (str == null) {
            throw new IllegalStateException("Nonnull field \"debugMessage\" is null.");
        }
        lVar.f45691b = str;
        return lVar;
    }

    public static List i(List list) {
        ArrayList arrayList;
        d8.a aVar;
        x xVar;
        yi.e eVar;
        Long l10;
        yi.e eVar2;
        o oVar;
        JSONArray jSONArrayOptJSONArray;
        if (list == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Purchase purchase = (Purchase) it.next();
            JSONObject jSONObject = purchase.f2427c;
            JSONObject jSONObject2 = purchase.f2427c;
            String strOptString = jSONObject.optString("orderId");
            if (TextUtils.isEmpty(strOptString)) {
                strOptString = null;
            }
            String strOptString2 = jSONObject.optString("packageName");
            Long lValueOf = Long.valueOf(jSONObject2.optLong("purchaseTime"));
            String strB = purchase.b();
            String str = purchase.f2426b;
            ArrayList arrayListA = purchase.a();
            Boolean boolValueOf = Boolean.valueOf(jSONObject2.optBoolean("autoRenewing"));
            String str2 = purchase.f2425a;
            String strOptString3 = jSONObject.optString("developerPayload");
            Boolean boolValueOf2 = Boolean.valueOf(jSONObject.optBoolean("acknowledged", true));
            Iterator it2 = it;
            char c8 = jSONObject.optInt("purchaseState", 1) != 4 ? (char) 1 : (char) 2;
            x xVar2 = c8 != 1 ? c8 != 2 ? x.UNSPECIFIED : x.PENDING : x.PURCHASED;
            ArrayList arrayList3 = arrayList2;
            x xVar3 = xVar2;
            Long lValueOf2 = Long.valueOf(jSONObject2.optInt(DiscardedEvent.JsonKeys.QUANTITY, 1));
            String strOptString4 = jSONObject.optString("obfuscatedAccountId");
            String strOptString5 = jSONObject.optString("obfuscatedProfileId");
            if (strOptString4 == null && strOptString5 == null) {
                arrayList = arrayList3;
                xVar = xVar3;
                aVar = null;
            } else {
                arrayList = arrayList3;
                xVar = xVar3;
                aVar = new d8.a(strOptString4, strOptString5, 0);
            }
            if (aVar != null) {
                String str3 = aVar.f15576b;
                String str4 = aVar.f15577c;
                eVar = new yi.e();
                eVar.f45649a = str3;
                eVar.f45650b = str4;
            } else {
                eVar = null;
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("pendingPurchaseUpdate");
            b1 b1Var = jSONObjectOptJSONObject == null ? null : new b1(7, jSONObjectOptJSONObject);
            if (b1Var != null) {
                JSONObject jSONObject3 = (JSONObject) b1Var.f45c;
                String strOptString6 = jSONObject3.optString("purchaseToken");
                ArrayList arrayList4 = new ArrayList();
                eVar2 = eVar;
                if (!jSONObject3.has("productIds") || (jSONArrayOptJSONArray = jSONObject3.optJSONArray("productIds")) == null) {
                    l10 = lValueOf2;
                } else {
                    l10 = lValueOf2;
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        arrayList4.add(jSONArrayOptJSONArray.optString(i));
                    }
                }
                oVar = new o();
                oVar.f45697a = arrayList4;
                if (strOptString6 == null) {
                    throw new IllegalStateException("Nonnull field \"purchaseToken\" is null.");
                }
                oVar.f45698b = strOptString6;
            } else {
                l10 = lValueOf2;
                eVar2 = eVar;
                oVar = null;
            }
            u uVar = new u();
            uVar.f45719a = strOptString;
            if (strOptString2 == null) {
                throw new IllegalStateException("Nonnull field \"packageName\" is null.");
            }
            uVar.f45720b = strOptString2;
            uVar.f45721c = lValueOf;
            if (strB == null) {
                throw new IllegalStateException("Nonnull field \"purchaseToken\" is null.");
            }
            uVar.f45722d = strB;
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"signature\" is null.");
            }
            uVar.f45723e = str;
            uVar.f45724f = arrayListA;
            uVar.f45725g = boolValueOf;
            if (str2 == null) {
                throw new IllegalStateException("Nonnull field \"originalJson\" is null.");
            }
            uVar.f45726h = str2;
            if (strOptString3 == null) {
                throw new IllegalStateException("Nonnull field \"developerPayload\" is null.");
            }
            uVar.i = strOptString3;
            uVar.f45727j = boolValueOf2;
            uVar.f45728k = l10;
            uVar.f45729l = xVar;
            uVar.f45730m = eVar2;
            uVar.f45731n = oVar;
            ArrayList arrayList5 = arrayList;
            arrayList5.add(uVar);
            arrayList2 = arrayList5;
            it = it2;
        }
        return arrayList2;
    }

    public static float k(int i, String[] strArr) {
        float f10 = Float.parseFloat(strArr[i]);
        if (f10 >= 0.0f && f10 <= 1.0f) {
            return f10;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f10);
    }

    public static final Bundle l(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle bundle2 = bundle.getBundle(key);
        if (bundle2 != null) {
            return bundle2;
        }
        Intrinsics.checkNotNullParameter(key, "key");
        throw new IllegalArgumentException(pe.a.f("No valid saved state was found for the key '", key, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    public static String m(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String strConcat = "TRuntime.".concat(str);
        return strConcat.length() > 23 ? strConcat.substring(0, 23) : strConcat;
    }

    public static boolean n(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            String[] strArr = (Build.VERSION.SDK_INT < 33 ? packageManager.getPackageInfo(packageName, 4096) : packageManager.getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(4096L))).requestedPermissions;
            if (strArr != null) {
                for (String str2 : strArr) {
                    if (str2.equals(str)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception e3) {
            e3.printStackTrace();
            return false;
        }
    }

    public static boolean o(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static boolean p(byte b2) {
        return b2 > -65;
    }

    public static final void q(String str) {
        String string;
        if (j8.a.f26576d) {
            if (str == null || (string = str.toString()) == null) {
                string = "null";
            }
            Log.i("flutter_image_compress", string);
        }
    }

    public static final t2.e r(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new t2.e(name);
    }

    public static String s(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb2 = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb2.append(str.charAt(i));
            if (str2.length() > i) {
                sb2.append(str2.charAt(i));
            }
        }
        return sb2.toString();
    }

    public static zk.k t(String... namesAndValues) {
        Intrinsics.checkNotNullParameter(namesAndValues, "namesAndValues");
        if (namesAndValues.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr = (String[]) namesAndValues.clone();
        int length = strArr.length;
        int i = 0;
        for (int i10 = 0; i10 < length; i10++) {
            String str = strArr[i10];
            if (str == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr[i10] = StringsKt.P(str).toString();
        }
        int iA = qj.c.a(0, strArr.length - 1, 2);
        if (iA >= 0) {
            while (true) {
                String str2 = strArr[i];
                String str3 = strArr[i + 1];
                c(str2);
                d(str3, str2);
                if (i == iA) {
                    break;
                }
                i += 2;
            }
        }
        return new zk.k(strArr);
    }

    public static void u(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static int x(Context context, int i, int i10) {
        TypedValue typedValueT = m.t(context, i);
        return (typedValueT == null || typedValueT.type != 16) ? i10 : typedValueT.data;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0183 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x012b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012c A[Catch: NumberFormatException -> 0x0140, LOOP:3: B:47:0x00fc->B:66:0x012c, LOOP_END, TryCatch #1 {NumberFormatException -> 0x0140, blocks: (B:44:0x00e7, B:47:0x00fc, B:49:0x0102, B:53:0x010e, B:66:0x012c, B:68:0x0132, B:74:0x0147, B:76:0x014c, B:78:0x014f, B:79:0x015b, B:80:0x0160, B:81:0x0161, B:82:0x0166), top: B:107:0x00e7 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0132 A[Catch: NumberFormatException -> 0x0140, TryCatch #1 {NumberFormatException -> 0x0140, blocks: (B:44:0x00e7, B:47:0x00fc, B:49:0x0102, B:53:0x010e, B:66:0x012c, B:68:0x0132, B:74:0x0147, B:76:0x014c, B:78:0x014f, B:79:0x015b, B:80:0x0160, B:81:0x0161, B:82:0x0166), top: B:107:0x00e7 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0147 A[Catch: NumberFormatException -> 0x0140, TryCatch #1 {NumberFormatException -> 0x0140, blocks: (B:44:0x00e7, B:47:0x00fc, B:49:0x0102, B:53:0x010e, B:66:0x012c, B:68:0x0132, B:74:0x0147, B:76:0x014c, B:78:0x014f, B:79:0x015b, B:80:0x0160, B:81:0x0161, B:82:0x0166), top: B:107:0x00e7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.animation.TimeInterpolator y(android.content.Context r18, int r19, android.animation.TimeInterpolator r20) {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ya.e.y(android.content.Context, int, android.animation.TimeInterpolator):android.animation.TimeInterpolator");
    }

    public static void z(ii.f binaryMessenger, final ni.g gVar) {
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        ii.m mVarA = gVar != null ? gVar.f29394a.a() : new n(2);
        Object obj = null;
        s7.g gVar2 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.ProcessCameraProvider.getInstance", mVarA, obj);
        if (gVar != null) {
            final int i = 0;
            gVar2.L(new ii.b() { // from class: ni.z0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    ed.d dVarF;
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    List listF5;
                    boolean z5 = true;
                    boolean z10 = true;
                    switch (i) {
                        case 0:
                            g gVar3 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            fj.z zVar = new fj.z(reply, 9);
                            Context context = (Context) gVar3.f29394a.f6857h;
                            w0.f fVar = w0.f.f34958b;
                            Intrinsics.checkNotNullParameter(context, "context");
                            context.getClass();
                            zz zzVar = w0.f.f34958b.f34959a;
                            Intrinsics.checkNotNullParameter(context, "context");
                            synchronized (zzVar.f13152c) {
                                dVarF = (k0.d) zzVar.f13153d;
                                if (dVarF == null) {
                                    a0.b0 b0Var = new a0.b0(context, null);
                                    k0.b bVarJ = k0.j.j(k0.d.b((ed.d) zzVar.f13154e), new s3.q(18, new ek.o(8, b0Var)), hl.d.j());
                                    Intrinsics.checkNotNullExpressionValue(bVarJ, "transformAsync(...)");
                                    zzVar.f13153d = bVarJ;
                                    k0.j.a(bVarJ, new u7.f(zzVar, b0Var, context, z10 ? 1 : 0), hl.d.j());
                                    dVarF = k0.j.f(bVarJ);
                                    Intrinsics.checkNotNullExpressionValue(dVarF, "nonCancellationPropagating(...)");
                                }
                            }
                            k0.b bVarJ2 = k0.j.j(dVarF, new v7.f(25, new vg.a(new ch.a(19))), hl.d.j());
                            Intrinsics.checkNotNullExpressionValue(bVarJ2, "transform(...)");
                            bVarJ2.a(new m3.c0(7, bVarJ2, zVar), t1.b.c((Context) gVar3.f29394a.f6857h));
                            return;
                        case 1:
                            g gVar4 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type androidx.camera.lifecycle.ProcessCameraProvider");
                            w0.f fVar2 = (w0.f) obj3;
                            try {
                                gVar4.getClass();
                                listF = kotlin.collections.r.c(g.c(fVar2));
                                break;
                            } catch (Throwable exception) {
                                Intrinsics.checkNotNullParameter(exception, "exception");
                                if (exception instanceof p) {
                                    p pVar = exception;
                                    listF = kotlin.collections.s.f(pVar.f29468b, pVar.f29469c, pVar.f29470d);
                                } else {
                                    listF = kotlin.collections.s.f(exception.getClass().getSimpleName(), exception.toString(), l7.o.k("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
                                }
                            }
                            reply.i(listF);
                            return;
                        case 2:
                            g gVar5 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type androidx.camera.lifecycle.ProcessCameraProvider");
                            w0.f fVar3 = (w0.f) obj4;
                            Object obj5 = list.get(1);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type androidx.camera.core.CameraSelector");
                            a0.w wVar = (a0.w) obj5;
                            Object obj6 = list.get(2);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<androidx.camera.core.UseCase>");
                            try {
                                listF2 = kotlin.collections.r.c(gVar5.a(fVar3, wVar, (List) obj6));
                                break;
                            } catch (Throwable exception2) {
                                Intrinsics.checkNotNullParameter(exception2, "exception");
                                if (exception2 instanceof p) {
                                    p pVar2 = exception2;
                                    listF2 = kotlin.collections.s.f(pVar2.f29468b, pVar2.f29469c, pVar2.f29470d);
                                } else {
                                    listF2 = kotlin.collections.s.f(exception2.getClass().getSimpleName(), exception2.toString(), l7.o.k("Cause: ", exception2.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception2)));
                                }
                            }
                            reply.i(listF2);
                            return;
                        case 3:
                            g gVar6 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj7 = list2.get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type androidx.camera.lifecycle.ProcessCameraProvider");
                            w0.f fVar4 = (w0.f) obj7;
                            Object obj8 = list2.get(1);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type androidx.camera.core.UseCase");
                            q2 useCase = (q2) obj8;
                            try {
                                gVar6.getClass();
                                Intrinsics.checkNotNullParameter(useCase, "useCase");
                                zz zzVar2 = fVar4.f34959a;
                                Intrinsics.checkNotNullParameter(useCase, "useCase");
                                Iterator it = ((w0.e) zzVar2.f13155f).d().iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        Object next = it.next();
                                        Intrinsics.checkNotNullExpressionValue(next, "next(...)");
                                        if (((w0.b) next).r(useCase)) {
                                        }
                                    } else {
                                        z5 = false;
                                    }
                                }
                                listF3 = kotlin.collections.r.c(Boolean.valueOf(z5));
                                break;
                            } catch (Throwable exception3) {
                                Intrinsics.checkNotNullParameter(exception3, "exception");
                                if (exception3 instanceof p) {
                                    p pVar3 = exception3;
                                    listF3 = kotlin.collections.s.f(pVar3.f29468b, pVar3.f29469c, pVar3.f29470d);
                                } else {
                                    listF3 = kotlin.collections.s.f(exception3.getClass().getSimpleName(), exception3.toString(), l7.o.k("Cause: ", exception3.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception3)));
                                }
                            }
                            reply.i(listF3);
                            return;
                        case 4:
                            g gVar7 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj9 = list3.get(0);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type androidx.camera.lifecycle.ProcessCameraProvider");
                            w0.f fVar5 = (w0.f) obj9;
                            Object obj10 = list3.get(1);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type kotlin.collections.List<androidx.camera.core.UseCase>");
                            List list4 = (List) obj10;
                            try {
                                gVar7.getClass();
                                g.p(fVar5, list4);
                                listF4 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception4) {
                                Intrinsics.checkNotNullParameter(exception4, "exception");
                                if (exception4 instanceof p) {
                                    p pVar4 = exception4;
                                    listF4 = kotlin.collections.s.f(pVar4.f29468b, pVar4.f29469c, pVar4.f29470d);
                                } else {
                                    listF4 = kotlin.collections.s.f(exception4.getClass().getSimpleName(), exception4.toString(), l7.o.k("Cause: ", exception4.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception4)));
                                }
                            }
                            reply.i(listF4);
                            return;
                        default:
                            g gVar8 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj11 = ((List) obj2).get(0);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type androidx.camera.lifecycle.ProcessCameraProvider");
                            w0.f fVar6 = (w0.f) obj11;
                            try {
                                gVar8.getClass();
                                fVar6.f34959a.f();
                                listF5 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception5) {
                                Intrinsics.checkNotNullParameter(exception5, "exception");
                                if (exception5 instanceof p) {
                                    p pVar5 = exception5;
                                    listF5 = kotlin.collections.s.f(pVar5.f29468b, pVar5.f29469c, pVar5.f29470d);
                                } else {
                                    listF5 = kotlin.collections.s.f(exception5.getClass().getSimpleName(), exception5.toString(), l7.o.k("Cause: ", exception5.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception5)));
                                }
                            }
                            reply.i(listF5);
                            return;
                    }
                }
            });
        } else {
            gVar2.L(null);
        }
        s7.g gVar3 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.ProcessCameraProvider.getAvailableCameraInfos", mVarA, obj);
        if (gVar != null) {
            final int i10 = 1;
            gVar3.L(new ii.b() { // from class: ni.z0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    ed.d dVarF;
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    List listF5;
                    boolean z5 = true;
                    boolean z10 = true;
                    switch (i10) {
                        case 0:
                            g gVar32 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            fj.z zVar = new fj.z(reply, 9);
                            Context context = (Context) gVar32.f29394a.f6857h;
                            w0.f fVar = w0.f.f34958b;
                            Intrinsics.checkNotNullParameter(context, "context");
                            context.getClass();
                            zz zzVar = w0.f.f34958b.f34959a;
                            Intrinsics.checkNotNullParameter(context, "context");
                            synchronized (zzVar.f13152c) {
                                dVarF = (k0.d) zzVar.f13153d;
                                if (dVarF == null) {
                                    a0.b0 b0Var = new a0.b0(context, null);
                                    k0.b bVarJ = k0.j.j(k0.d.b((ed.d) zzVar.f13154e), new s3.q(18, new ek.o(8, b0Var)), hl.d.j());
                                    Intrinsics.checkNotNullExpressionValue(bVarJ, "transformAsync(...)");
                                    zzVar.f13153d = bVarJ;
                                    k0.j.a(bVarJ, new u7.f(zzVar, b0Var, context, z10 ? 1 : 0), hl.d.j());
                                    dVarF = k0.j.f(bVarJ);
                                    Intrinsics.checkNotNullExpressionValue(dVarF, "nonCancellationPropagating(...)");
                                }
                            }
                            k0.b bVarJ2 = k0.j.j(dVarF, new v7.f(25, new vg.a(new ch.a(19))), hl.d.j());
                            Intrinsics.checkNotNullExpressionValue(bVarJ2, "transform(...)");
                            bVarJ2.a(new m3.c0(7, bVarJ2, zVar), t1.b.c((Context) gVar32.f29394a.f6857h));
                            return;
                        case 1:
                            g gVar4 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type androidx.camera.lifecycle.ProcessCameraProvider");
                            w0.f fVar2 = (w0.f) obj3;
                            try {
                                gVar4.getClass();
                                listF = kotlin.collections.r.c(g.c(fVar2));
                                break;
                            } catch (Throwable exception) {
                                Intrinsics.checkNotNullParameter(exception, "exception");
                                if (exception instanceof p) {
                                    p pVar = exception;
                                    listF = kotlin.collections.s.f(pVar.f29468b, pVar.f29469c, pVar.f29470d);
                                } else {
                                    listF = kotlin.collections.s.f(exception.getClass().getSimpleName(), exception.toString(), l7.o.k("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
                                }
                            }
                            reply.i(listF);
                            return;
                        case 2:
                            g gVar5 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type androidx.camera.lifecycle.ProcessCameraProvider");
                            w0.f fVar3 = (w0.f) obj4;
                            Object obj5 = list.get(1);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type androidx.camera.core.CameraSelector");
                            a0.w wVar = (a0.w) obj5;
                            Object obj6 = list.get(2);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<androidx.camera.core.UseCase>");
                            try {
                                listF2 = kotlin.collections.r.c(gVar5.a(fVar3, wVar, (List) obj6));
                                break;
                            } catch (Throwable exception2) {
                                Intrinsics.checkNotNullParameter(exception2, "exception");
                                if (exception2 instanceof p) {
                                    p pVar2 = exception2;
                                    listF2 = kotlin.collections.s.f(pVar2.f29468b, pVar2.f29469c, pVar2.f29470d);
                                } else {
                                    listF2 = kotlin.collections.s.f(exception2.getClass().getSimpleName(), exception2.toString(), l7.o.k("Cause: ", exception2.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception2)));
                                }
                            }
                            reply.i(listF2);
                            return;
                        case 3:
                            g gVar6 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj7 = list2.get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type androidx.camera.lifecycle.ProcessCameraProvider");
                            w0.f fVar4 = (w0.f) obj7;
                            Object obj8 = list2.get(1);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type androidx.camera.core.UseCase");
                            q2 useCase = (q2) obj8;
                            try {
                                gVar6.getClass();
                                Intrinsics.checkNotNullParameter(useCase, "useCase");
                                zz zzVar2 = fVar4.f34959a;
                                Intrinsics.checkNotNullParameter(useCase, "useCase");
                                Iterator it = ((w0.e) zzVar2.f13155f).d().iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        Object next = it.next();
                                        Intrinsics.checkNotNullExpressionValue(next, "next(...)");
                                        if (((w0.b) next).r(useCase)) {
                                        }
                                    } else {
                                        z5 = false;
                                    }
                                }
                                listF3 = kotlin.collections.r.c(Boolean.valueOf(z5));
                                break;
                            } catch (Throwable exception3) {
                                Intrinsics.checkNotNullParameter(exception3, "exception");
                                if (exception3 instanceof p) {
                                    p pVar3 = exception3;
                                    listF3 = kotlin.collections.s.f(pVar3.f29468b, pVar3.f29469c, pVar3.f29470d);
                                } else {
                                    listF3 = kotlin.collections.s.f(exception3.getClass().getSimpleName(), exception3.toString(), l7.o.k("Cause: ", exception3.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception3)));
                                }
                            }
                            reply.i(listF3);
                            return;
                        case 4:
                            g gVar7 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj9 = list3.get(0);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type androidx.camera.lifecycle.ProcessCameraProvider");
                            w0.f fVar5 = (w0.f) obj9;
                            Object obj10 = list3.get(1);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type kotlin.collections.List<androidx.camera.core.UseCase>");
                            List list4 = (List) obj10;
                            try {
                                gVar7.getClass();
                                g.p(fVar5, list4);
                                listF4 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception4) {
                                Intrinsics.checkNotNullParameter(exception4, "exception");
                                if (exception4 instanceof p) {
                                    p pVar4 = exception4;
                                    listF4 = kotlin.collections.s.f(pVar4.f29468b, pVar4.f29469c, pVar4.f29470d);
                                } else {
                                    listF4 = kotlin.collections.s.f(exception4.getClass().getSimpleName(), exception4.toString(), l7.o.k("Cause: ", exception4.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception4)));
                                }
                            }
                            reply.i(listF4);
                            return;
                        default:
                            g gVar8 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj11 = ((List) obj2).get(0);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type androidx.camera.lifecycle.ProcessCameraProvider");
                            w0.f fVar6 = (w0.f) obj11;
                            try {
                                gVar8.getClass();
                                fVar6.f34959a.f();
                                listF5 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception5) {
                                Intrinsics.checkNotNullParameter(exception5, "exception");
                                if (exception5 instanceof p) {
                                    p pVar5 = exception5;
                                    listF5 = kotlin.collections.s.f(pVar5.f29468b, pVar5.f29469c, pVar5.f29470d);
                                } else {
                                    listF5 = kotlin.collections.s.f(exception5.getClass().getSimpleName(), exception5.toString(), l7.o.k("Cause: ", exception5.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception5)));
                                }
                            }
                            reply.i(listF5);
                            return;
                    }
                }
            });
        } else {
            gVar3.L(null);
        }
        s7.g gVar4 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.ProcessCameraProvider.bindToLifecycle", mVarA, obj);
        if (gVar != null) {
            final int i11 = 2;
            gVar4.L(new ii.b() { // from class: ni.z0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    ed.d dVarF;
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    List listF5;
                    boolean z5 = true;
                    boolean z10 = true;
                    switch (i11) {
                        case 0:
                            g gVar32 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            fj.z zVar = new fj.z(reply, 9);
                            Context context = (Context) gVar32.f29394a.f6857h;
                            w0.f fVar = w0.f.f34958b;
                            Intrinsics.checkNotNullParameter(context, "context");
                            context.getClass();
                            zz zzVar = w0.f.f34958b.f34959a;
                            Intrinsics.checkNotNullParameter(context, "context");
                            synchronized (zzVar.f13152c) {
                                dVarF = (k0.d) zzVar.f13153d;
                                if (dVarF == null) {
                                    a0.b0 b0Var = new a0.b0(context, null);
                                    k0.b bVarJ = k0.j.j(k0.d.b((ed.d) zzVar.f13154e), new s3.q(18, new ek.o(8, b0Var)), hl.d.j());
                                    Intrinsics.checkNotNullExpressionValue(bVarJ, "transformAsync(...)");
                                    zzVar.f13153d = bVarJ;
                                    k0.j.a(bVarJ, new u7.f(zzVar, b0Var, context, z10 ? 1 : 0), hl.d.j());
                                    dVarF = k0.j.f(bVarJ);
                                    Intrinsics.checkNotNullExpressionValue(dVarF, "nonCancellationPropagating(...)");
                                }
                            }
                            k0.b bVarJ2 = k0.j.j(dVarF, new v7.f(25, new vg.a(new ch.a(19))), hl.d.j());
                            Intrinsics.checkNotNullExpressionValue(bVarJ2, "transform(...)");
                            bVarJ2.a(new m3.c0(7, bVarJ2, zVar), t1.b.c((Context) gVar32.f29394a.f6857h));
                            return;
                        case 1:
                            g gVar42 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type androidx.camera.lifecycle.ProcessCameraProvider");
                            w0.f fVar2 = (w0.f) obj3;
                            try {
                                gVar42.getClass();
                                listF = kotlin.collections.r.c(g.c(fVar2));
                                break;
                            } catch (Throwable exception) {
                                Intrinsics.checkNotNullParameter(exception, "exception");
                                if (exception instanceof p) {
                                    p pVar = exception;
                                    listF = kotlin.collections.s.f(pVar.f29468b, pVar.f29469c, pVar.f29470d);
                                } else {
                                    listF = kotlin.collections.s.f(exception.getClass().getSimpleName(), exception.toString(), l7.o.k("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
                                }
                            }
                            reply.i(listF);
                            return;
                        case 2:
                            g gVar5 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type androidx.camera.lifecycle.ProcessCameraProvider");
                            w0.f fVar3 = (w0.f) obj4;
                            Object obj5 = list.get(1);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type androidx.camera.core.CameraSelector");
                            a0.w wVar = (a0.w) obj5;
                            Object obj6 = list.get(2);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<androidx.camera.core.UseCase>");
                            try {
                                listF2 = kotlin.collections.r.c(gVar5.a(fVar3, wVar, (List) obj6));
                                break;
                            } catch (Throwable exception2) {
                                Intrinsics.checkNotNullParameter(exception2, "exception");
                                if (exception2 instanceof p) {
                                    p pVar2 = exception2;
                                    listF2 = kotlin.collections.s.f(pVar2.f29468b, pVar2.f29469c, pVar2.f29470d);
                                } else {
                                    listF2 = kotlin.collections.s.f(exception2.getClass().getSimpleName(), exception2.toString(), l7.o.k("Cause: ", exception2.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception2)));
                                }
                            }
                            reply.i(listF2);
                            return;
                        case 3:
                            g gVar6 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj7 = list2.get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type androidx.camera.lifecycle.ProcessCameraProvider");
                            w0.f fVar4 = (w0.f) obj7;
                            Object obj8 = list2.get(1);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type androidx.camera.core.UseCase");
                            q2 useCase = (q2) obj8;
                            try {
                                gVar6.getClass();
                                Intrinsics.checkNotNullParameter(useCase, "useCase");
                                zz zzVar2 = fVar4.f34959a;
                                Intrinsics.checkNotNullParameter(useCase, "useCase");
                                Iterator it = ((w0.e) zzVar2.f13155f).d().iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        Object next = it.next();
                                        Intrinsics.checkNotNullExpressionValue(next, "next(...)");
                                        if (((w0.b) next).r(useCase)) {
                                        }
                                    } else {
                                        z5 = false;
                                    }
                                }
                                listF3 = kotlin.collections.r.c(Boolean.valueOf(z5));
                                break;
                            } catch (Throwable exception3) {
                                Intrinsics.checkNotNullParameter(exception3, "exception");
                                if (exception3 instanceof p) {
                                    p pVar3 = exception3;
                                    listF3 = kotlin.collections.s.f(pVar3.f29468b, pVar3.f29469c, pVar3.f29470d);
                                } else {
                                    listF3 = kotlin.collections.s.f(exception3.getClass().getSimpleName(), exception3.toString(), l7.o.k("Cause: ", exception3.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception3)));
                                }
                            }
                            reply.i(listF3);
                            return;
                        case 4:
                            g gVar7 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj9 = list3.get(0);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type androidx.camera.lifecycle.ProcessCameraProvider");
                            w0.f fVar5 = (w0.f) obj9;
                            Object obj10 = list3.get(1);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type kotlin.collections.List<androidx.camera.core.UseCase>");
                            List list4 = (List) obj10;
                            try {
                                gVar7.getClass();
                                g.p(fVar5, list4);
                                listF4 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception4) {
                                Intrinsics.checkNotNullParameter(exception4, "exception");
                                if (exception4 instanceof p) {
                                    p pVar4 = exception4;
                                    listF4 = kotlin.collections.s.f(pVar4.f29468b, pVar4.f29469c, pVar4.f29470d);
                                } else {
                                    listF4 = kotlin.collections.s.f(exception4.getClass().getSimpleName(), exception4.toString(), l7.o.k("Cause: ", exception4.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception4)));
                                }
                            }
                            reply.i(listF4);
                            return;
                        default:
                            g gVar8 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj11 = ((List) obj2).get(0);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type androidx.camera.lifecycle.ProcessCameraProvider");
                            w0.f fVar6 = (w0.f) obj11;
                            try {
                                gVar8.getClass();
                                fVar6.f34959a.f();
                                listF5 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception5) {
                                Intrinsics.checkNotNullParameter(exception5, "exception");
                                if (exception5 instanceof p) {
                                    p pVar5 = exception5;
                                    listF5 = kotlin.collections.s.f(pVar5.f29468b, pVar5.f29469c, pVar5.f29470d);
                                } else {
                                    listF5 = kotlin.collections.s.f(exception5.getClass().getSimpleName(), exception5.toString(), l7.o.k("Cause: ", exception5.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception5)));
                                }
                            }
                            reply.i(listF5);
                            return;
                    }
                }
            });
        } else {
            gVar4.L(null);
        }
        s7.g gVar5 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.ProcessCameraProvider.isBound", mVarA, obj);
        if (gVar != null) {
            final int i12 = 3;
            gVar5.L(new ii.b() { // from class: ni.z0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    ed.d dVarF;
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    List listF5;
                    boolean z5 = true;
                    boolean z10 = true;
                    switch (i12) {
                        case 0:
                            g gVar32 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            fj.z zVar = new fj.z(reply, 9);
                            Context context = (Context) gVar32.f29394a.f6857h;
                            w0.f fVar = w0.f.f34958b;
                            Intrinsics.checkNotNullParameter(context, "context");
                            context.getClass();
                            zz zzVar = w0.f.f34958b.f34959a;
                            Intrinsics.checkNotNullParameter(context, "context");
                            synchronized (zzVar.f13152c) {
                                dVarF = (k0.d) zzVar.f13153d;
                                if (dVarF == null) {
                                    a0.b0 b0Var = new a0.b0(context, null);
                                    k0.b bVarJ = k0.j.j(k0.d.b((ed.d) zzVar.f13154e), new s3.q(18, new ek.o(8, b0Var)), hl.d.j());
                                    Intrinsics.checkNotNullExpressionValue(bVarJ, "transformAsync(...)");
                                    zzVar.f13153d = bVarJ;
                                    k0.j.a(bVarJ, new u7.f(zzVar, b0Var, context, z10 ? 1 : 0), hl.d.j());
                                    dVarF = k0.j.f(bVarJ);
                                    Intrinsics.checkNotNullExpressionValue(dVarF, "nonCancellationPropagating(...)");
                                }
                            }
                            k0.b bVarJ2 = k0.j.j(dVarF, new v7.f(25, new vg.a(new ch.a(19))), hl.d.j());
                            Intrinsics.checkNotNullExpressionValue(bVarJ2, "transform(...)");
                            bVarJ2.a(new m3.c0(7, bVarJ2, zVar), t1.b.c((Context) gVar32.f29394a.f6857h));
                            return;
                        case 1:
                            g gVar42 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type androidx.camera.lifecycle.ProcessCameraProvider");
                            w0.f fVar2 = (w0.f) obj3;
                            try {
                                gVar42.getClass();
                                listF = kotlin.collections.r.c(g.c(fVar2));
                                break;
                            } catch (Throwable exception) {
                                Intrinsics.checkNotNullParameter(exception, "exception");
                                if (exception instanceof p) {
                                    p pVar = exception;
                                    listF = kotlin.collections.s.f(pVar.f29468b, pVar.f29469c, pVar.f29470d);
                                } else {
                                    listF = kotlin.collections.s.f(exception.getClass().getSimpleName(), exception.toString(), l7.o.k("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
                                }
                            }
                            reply.i(listF);
                            return;
                        case 2:
                            g gVar52 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type androidx.camera.lifecycle.ProcessCameraProvider");
                            w0.f fVar3 = (w0.f) obj4;
                            Object obj5 = list.get(1);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type androidx.camera.core.CameraSelector");
                            a0.w wVar = (a0.w) obj5;
                            Object obj6 = list.get(2);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<androidx.camera.core.UseCase>");
                            try {
                                listF2 = kotlin.collections.r.c(gVar52.a(fVar3, wVar, (List) obj6));
                                break;
                            } catch (Throwable exception2) {
                                Intrinsics.checkNotNullParameter(exception2, "exception");
                                if (exception2 instanceof p) {
                                    p pVar2 = exception2;
                                    listF2 = kotlin.collections.s.f(pVar2.f29468b, pVar2.f29469c, pVar2.f29470d);
                                } else {
                                    listF2 = kotlin.collections.s.f(exception2.getClass().getSimpleName(), exception2.toString(), l7.o.k("Cause: ", exception2.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception2)));
                                }
                            }
                            reply.i(listF2);
                            return;
                        case 3:
                            g gVar6 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj7 = list2.get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type androidx.camera.lifecycle.ProcessCameraProvider");
                            w0.f fVar4 = (w0.f) obj7;
                            Object obj8 = list2.get(1);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type androidx.camera.core.UseCase");
                            q2 useCase = (q2) obj8;
                            try {
                                gVar6.getClass();
                                Intrinsics.checkNotNullParameter(useCase, "useCase");
                                zz zzVar2 = fVar4.f34959a;
                                Intrinsics.checkNotNullParameter(useCase, "useCase");
                                Iterator it = ((w0.e) zzVar2.f13155f).d().iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        Object next = it.next();
                                        Intrinsics.checkNotNullExpressionValue(next, "next(...)");
                                        if (((w0.b) next).r(useCase)) {
                                        }
                                    } else {
                                        z5 = false;
                                    }
                                }
                                listF3 = kotlin.collections.r.c(Boolean.valueOf(z5));
                                break;
                            } catch (Throwable exception3) {
                                Intrinsics.checkNotNullParameter(exception3, "exception");
                                if (exception3 instanceof p) {
                                    p pVar3 = exception3;
                                    listF3 = kotlin.collections.s.f(pVar3.f29468b, pVar3.f29469c, pVar3.f29470d);
                                } else {
                                    listF3 = kotlin.collections.s.f(exception3.getClass().getSimpleName(), exception3.toString(), l7.o.k("Cause: ", exception3.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception3)));
                                }
                            }
                            reply.i(listF3);
                            return;
                        case 4:
                            g gVar7 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj9 = list3.get(0);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type androidx.camera.lifecycle.ProcessCameraProvider");
                            w0.f fVar5 = (w0.f) obj9;
                            Object obj10 = list3.get(1);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type kotlin.collections.List<androidx.camera.core.UseCase>");
                            List list4 = (List) obj10;
                            try {
                                gVar7.getClass();
                                g.p(fVar5, list4);
                                listF4 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception4) {
                                Intrinsics.checkNotNullParameter(exception4, "exception");
                                if (exception4 instanceof p) {
                                    p pVar4 = exception4;
                                    listF4 = kotlin.collections.s.f(pVar4.f29468b, pVar4.f29469c, pVar4.f29470d);
                                } else {
                                    listF4 = kotlin.collections.s.f(exception4.getClass().getSimpleName(), exception4.toString(), l7.o.k("Cause: ", exception4.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception4)));
                                }
                            }
                            reply.i(listF4);
                            return;
                        default:
                            g gVar8 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj11 = ((List) obj2).get(0);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type androidx.camera.lifecycle.ProcessCameraProvider");
                            w0.f fVar6 = (w0.f) obj11;
                            try {
                                gVar8.getClass();
                                fVar6.f34959a.f();
                                listF5 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception5) {
                                Intrinsics.checkNotNullParameter(exception5, "exception");
                                if (exception5 instanceof p) {
                                    p pVar5 = exception5;
                                    listF5 = kotlin.collections.s.f(pVar5.f29468b, pVar5.f29469c, pVar5.f29470d);
                                } else {
                                    listF5 = kotlin.collections.s.f(exception5.getClass().getSimpleName(), exception5.toString(), l7.o.k("Cause: ", exception5.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception5)));
                                }
                            }
                            reply.i(listF5);
                            return;
                    }
                }
            });
        } else {
            gVar5.L(null);
        }
        s7.g gVar6 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.ProcessCameraProvider.unbind", mVarA, obj);
        if (gVar != null) {
            final int i13 = 4;
            gVar6.L(new ii.b() { // from class: ni.z0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    ed.d dVarF;
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    List listF5;
                    boolean z5 = true;
                    boolean z10 = true;
                    switch (i13) {
                        case 0:
                            g gVar32 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            fj.z zVar = new fj.z(reply, 9);
                            Context context = (Context) gVar32.f29394a.f6857h;
                            w0.f fVar = w0.f.f34958b;
                            Intrinsics.checkNotNullParameter(context, "context");
                            context.getClass();
                            zz zzVar = w0.f.f34958b.f34959a;
                            Intrinsics.checkNotNullParameter(context, "context");
                            synchronized (zzVar.f13152c) {
                                dVarF = (k0.d) zzVar.f13153d;
                                if (dVarF == null) {
                                    a0.b0 b0Var = new a0.b0(context, null);
                                    k0.b bVarJ = k0.j.j(k0.d.b((ed.d) zzVar.f13154e), new s3.q(18, new ek.o(8, b0Var)), hl.d.j());
                                    Intrinsics.checkNotNullExpressionValue(bVarJ, "transformAsync(...)");
                                    zzVar.f13153d = bVarJ;
                                    k0.j.a(bVarJ, new u7.f(zzVar, b0Var, context, z10 ? 1 : 0), hl.d.j());
                                    dVarF = k0.j.f(bVarJ);
                                    Intrinsics.checkNotNullExpressionValue(dVarF, "nonCancellationPropagating(...)");
                                }
                            }
                            k0.b bVarJ2 = k0.j.j(dVarF, new v7.f(25, new vg.a(new ch.a(19))), hl.d.j());
                            Intrinsics.checkNotNullExpressionValue(bVarJ2, "transform(...)");
                            bVarJ2.a(new m3.c0(7, bVarJ2, zVar), t1.b.c((Context) gVar32.f29394a.f6857h));
                            return;
                        case 1:
                            g gVar42 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type androidx.camera.lifecycle.ProcessCameraProvider");
                            w0.f fVar2 = (w0.f) obj3;
                            try {
                                gVar42.getClass();
                                listF = kotlin.collections.r.c(g.c(fVar2));
                                break;
                            } catch (Throwable exception) {
                                Intrinsics.checkNotNullParameter(exception, "exception");
                                if (exception instanceof p) {
                                    p pVar = exception;
                                    listF = kotlin.collections.s.f(pVar.f29468b, pVar.f29469c, pVar.f29470d);
                                } else {
                                    listF = kotlin.collections.s.f(exception.getClass().getSimpleName(), exception.toString(), l7.o.k("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
                                }
                            }
                            reply.i(listF);
                            return;
                        case 2:
                            g gVar52 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type androidx.camera.lifecycle.ProcessCameraProvider");
                            w0.f fVar3 = (w0.f) obj4;
                            Object obj5 = list.get(1);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type androidx.camera.core.CameraSelector");
                            a0.w wVar = (a0.w) obj5;
                            Object obj6 = list.get(2);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<androidx.camera.core.UseCase>");
                            try {
                                listF2 = kotlin.collections.r.c(gVar52.a(fVar3, wVar, (List) obj6));
                                break;
                            } catch (Throwable exception2) {
                                Intrinsics.checkNotNullParameter(exception2, "exception");
                                if (exception2 instanceof p) {
                                    p pVar2 = exception2;
                                    listF2 = kotlin.collections.s.f(pVar2.f29468b, pVar2.f29469c, pVar2.f29470d);
                                } else {
                                    listF2 = kotlin.collections.s.f(exception2.getClass().getSimpleName(), exception2.toString(), l7.o.k("Cause: ", exception2.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception2)));
                                }
                            }
                            reply.i(listF2);
                            return;
                        case 3:
                            g gVar62 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj7 = list2.get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type androidx.camera.lifecycle.ProcessCameraProvider");
                            w0.f fVar4 = (w0.f) obj7;
                            Object obj8 = list2.get(1);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type androidx.camera.core.UseCase");
                            q2 useCase = (q2) obj8;
                            try {
                                gVar62.getClass();
                                Intrinsics.checkNotNullParameter(useCase, "useCase");
                                zz zzVar2 = fVar4.f34959a;
                                Intrinsics.checkNotNullParameter(useCase, "useCase");
                                Iterator it = ((w0.e) zzVar2.f13155f).d().iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        Object next = it.next();
                                        Intrinsics.checkNotNullExpressionValue(next, "next(...)");
                                        if (((w0.b) next).r(useCase)) {
                                        }
                                    } else {
                                        z5 = false;
                                    }
                                }
                                listF3 = kotlin.collections.r.c(Boolean.valueOf(z5));
                                break;
                            } catch (Throwable exception3) {
                                Intrinsics.checkNotNullParameter(exception3, "exception");
                                if (exception3 instanceof p) {
                                    p pVar3 = exception3;
                                    listF3 = kotlin.collections.s.f(pVar3.f29468b, pVar3.f29469c, pVar3.f29470d);
                                } else {
                                    listF3 = kotlin.collections.s.f(exception3.getClass().getSimpleName(), exception3.toString(), l7.o.k("Cause: ", exception3.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception3)));
                                }
                            }
                            reply.i(listF3);
                            return;
                        case 4:
                            g gVar7 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj9 = list3.get(0);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type androidx.camera.lifecycle.ProcessCameraProvider");
                            w0.f fVar5 = (w0.f) obj9;
                            Object obj10 = list3.get(1);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type kotlin.collections.List<androidx.camera.core.UseCase>");
                            List list4 = (List) obj10;
                            try {
                                gVar7.getClass();
                                g.p(fVar5, list4);
                                listF4 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception4) {
                                Intrinsics.checkNotNullParameter(exception4, "exception");
                                if (exception4 instanceof p) {
                                    p pVar4 = exception4;
                                    listF4 = kotlin.collections.s.f(pVar4.f29468b, pVar4.f29469c, pVar4.f29470d);
                                } else {
                                    listF4 = kotlin.collections.s.f(exception4.getClass().getSimpleName(), exception4.toString(), l7.o.k("Cause: ", exception4.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception4)));
                                }
                            }
                            reply.i(listF4);
                            return;
                        default:
                            g gVar8 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj11 = ((List) obj2).get(0);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type androidx.camera.lifecycle.ProcessCameraProvider");
                            w0.f fVar6 = (w0.f) obj11;
                            try {
                                gVar8.getClass();
                                fVar6.f34959a.f();
                                listF5 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception5) {
                                Intrinsics.checkNotNullParameter(exception5, "exception");
                                if (exception5 instanceof p) {
                                    p pVar5 = exception5;
                                    listF5 = kotlin.collections.s.f(pVar5.f29468b, pVar5.f29469c, pVar5.f29470d);
                                } else {
                                    listF5 = kotlin.collections.s.f(exception5.getClass().getSimpleName(), exception5.toString(), l7.o.k("Cause: ", exception5.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception5)));
                                }
                            }
                            reply.i(listF5);
                            return;
                    }
                }
            });
        } else {
            gVar6.L(null);
        }
        s7.g gVar7 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.ProcessCameraProvider.unbindAll", mVarA, obj);
        if (gVar == null) {
            gVar7.L(null);
        } else {
            final int i14 = 5;
            gVar7.L(new ii.b() { // from class: ni.z0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    ed.d dVarF;
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    List listF5;
                    boolean z5 = true;
                    boolean z10 = true;
                    switch (i14) {
                        case 0:
                            g gVar32 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            fj.z zVar = new fj.z(reply, 9);
                            Context context = (Context) gVar32.f29394a.f6857h;
                            w0.f fVar = w0.f.f34958b;
                            Intrinsics.checkNotNullParameter(context, "context");
                            context.getClass();
                            zz zzVar = w0.f.f34958b.f34959a;
                            Intrinsics.checkNotNullParameter(context, "context");
                            synchronized (zzVar.f13152c) {
                                dVarF = (k0.d) zzVar.f13153d;
                                if (dVarF == null) {
                                    a0.b0 b0Var = new a0.b0(context, null);
                                    k0.b bVarJ = k0.j.j(k0.d.b((ed.d) zzVar.f13154e), new s3.q(18, new ek.o(8, b0Var)), hl.d.j());
                                    Intrinsics.checkNotNullExpressionValue(bVarJ, "transformAsync(...)");
                                    zzVar.f13153d = bVarJ;
                                    k0.j.a(bVarJ, new u7.f(zzVar, b0Var, context, z10 ? 1 : 0), hl.d.j());
                                    dVarF = k0.j.f(bVarJ);
                                    Intrinsics.checkNotNullExpressionValue(dVarF, "nonCancellationPropagating(...)");
                                }
                            }
                            k0.b bVarJ2 = k0.j.j(dVarF, new v7.f(25, new vg.a(new ch.a(19))), hl.d.j());
                            Intrinsics.checkNotNullExpressionValue(bVarJ2, "transform(...)");
                            bVarJ2.a(new m3.c0(7, bVarJ2, zVar), t1.b.c((Context) gVar32.f29394a.f6857h));
                            return;
                        case 1:
                            g gVar42 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type androidx.camera.lifecycle.ProcessCameraProvider");
                            w0.f fVar2 = (w0.f) obj3;
                            try {
                                gVar42.getClass();
                                listF = kotlin.collections.r.c(g.c(fVar2));
                                break;
                            } catch (Throwable exception) {
                                Intrinsics.checkNotNullParameter(exception, "exception");
                                if (exception instanceof p) {
                                    p pVar = exception;
                                    listF = kotlin.collections.s.f(pVar.f29468b, pVar.f29469c, pVar.f29470d);
                                } else {
                                    listF = kotlin.collections.s.f(exception.getClass().getSimpleName(), exception.toString(), l7.o.k("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
                                }
                            }
                            reply.i(listF);
                            return;
                        case 2:
                            g gVar52 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type androidx.camera.lifecycle.ProcessCameraProvider");
                            w0.f fVar3 = (w0.f) obj4;
                            Object obj5 = list.get(1);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type androidx.camera.core.CameraSelector");
                            a0.w wVar = (a0.w) obj5;
                            Object obj6 = list.get(2);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<androidx.camera.core.UseCase>");
                            try {
                                listF2 = kotlin.collections.r.c(gVar52.a(fVar3, wVar, (List) obj6));
                                break;
                            } catch (Throwable exception2) {
                                Intrinsics.checkNotNullParameter(exception2, "exception");
                                if (exception2 instanceof p) {
                                    p pVar2 = exception2;
                                    listF2 = kotlin.collections.s.f(pVar2.f29468b, pVar2.f29469c, pVar2.f29470d);
                                } else {
                                    listF2 = kotlin.collections.s.f(exception2.getClass().getSimpleName(), exception2.toString(), l7.o.k("Cause: ", exception2.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception2)));
                                }
                            }
                            reply.i(listF2);
                            return;
                        case 3:
                            g gVar62 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj7 = list2.get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type androidx.camera.lifecycle.ProcessCameraProvider");
                            w0.f fVar4 = (w0.f) obj7;
                            Object obj8 = list2.get(1);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type androidx.camera.core.UseCase");
                            q2 useCase = (q2) obj8;
                            try {
                                gVar62.getClass();
                                Intrinsics.checkNotNullParameter(useCase, "useCase");
                                zz zzVar2 = fVar4.f34959a;
                                Intrinsics.checkNotNullParameter(useCase, "useCase");
                                Iterator it = ((w0.e) zzVar2.f13155f).d().iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        Object next = it.next();
                                        Intrinsics.checkNotNullExpressionValue(next, "next(...)");
                                        if (((w0.b) next).r(useCase)) {
                                        }
                                    } else {
                                        z5 = false;
                                    }
                                }
                                listF3 = kotlin.collections.r.c(Boolean.valueOf(z5));
                                break;
                            } catch (Throwable exception3) {
                                Intrinsics.checkNotNullParameter(exception3, "exception");
                                if (exception3 instanceof p) {
                                    p pVar3 = exception3;
                                    listF3 = kotlin.collections.s.f(pVar3.f29468b, pVar3.f29469c, pVar3.f29470d);
                                } else {
                                    listF3 = kotlin.collections.s.f(exception3.getClass().getSimpleName(), exception3.toString(), l7.o.k("Cause: ", exception3.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception3)));
                                }
                            }
                            reply.i(listF3);
                            return;
                        case 4:
                            g gVar72 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj9 = list3.get(0);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type androidx.camera.lifecycle.ProcessCameraProvider");
                            w0.f fVar5 = (w0.f) obj9;
                            Object obj10 = list3.get(1);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type kotlin.collections.List<androidx.camera.core.UseCase>");
                            List list4 = (List) obj10;
                            try {
                                gVar72.getClass();
                                g.p(fVar5, list4);
                                listF4 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception4) {
                                Intrinsics.checkNotNullParameter(exception4, "exception");
                                if (exception4 instanceof p) {
                                    p pVar4 = exception4;
                                    listF4 = kotlin.collections.s.f(pVar4.f29468b, pVar4.f29469c, pVar4.f29470d);
                                } else {
                                    listF4 = kotlin.collections.s.f(exception4.getClass().getSimpleName(), exception4.toString(), l7.o.k("Cause: ", exception4.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception4)));
                                }
                            }
                            reply.i(listF4);
                            return;
                        default:
                            g gVar8 = gVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj11 = ((List) obj2).get(0);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type androidx.camera.lifecycle.ProcessCameraProvider");
                            w0.f fVar6 = (w0.f) obj11;
                            try {
                                gVar8.getClass();
                                fVar6.f34959a.f();
                                listF5 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception5) {
                                Intrinsics.checkNotNullParameter(exception5, "exception");
                                if (exception5 instanceof p) {
                                    p pVar5 = exception5;
                                    listF5 = kotlin.collections.s.f(pVar5.f29468b, pVar5.f29469c, pVar5.f29470d);
                                } else {
                                    listF5 = kotlin.collections.s.f(exception5.getClass().getSimpleName(), exception5.toString(), l7.o.k("Cause: ", exception5.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception5)));
                                }
                            }
                            reply.i(listF5);
                            return;
                    }
                }
            });
        }
    }

    public abstract void j(nc.t tVar, float f10, float f11);

    public abstract void v(Throwable th2);

    public abstract void w(y yVar);
}
