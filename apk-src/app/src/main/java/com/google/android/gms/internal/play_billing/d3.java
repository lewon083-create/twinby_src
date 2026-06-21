package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.ads.um1;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.SortedSet;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14159b;

    public /* synthetic */ d3(int i) {
        this.f14159b = i;
    }

    public static int C(byte[] bArr, int i, k3 k3Var, um1 um1Var) throws n3 {
        h3 h3Var = (h3) k3Var;
        int iH = H(bArr, i, um1Var);
        int i10 = um1Var.f10990a + iH;
        while (iH < i10) {
            iH = H(bArr, iH, um1Var);
            h3Var.e(um1Var.f10990a);
        }
        if (iH == i10) {
            return iH;
        }
        throw new n3("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static String D(int i, int i10, String str) {
        if (i < 0) {
            return g("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i10 >= 0) {
            return g("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(l7.o.i(i10, "negative size: "));
    }

    public static int F(int i, byte[] bArr, int i10, int i11, j4 j4Var, um1 um1Var) throws n3 {
        if ((i >>> 3) == 0) {
            throw new n3("Protocol message contained an invalid tag (zero).");
        }
        int i12 = i & 7;
        if (i12 == 0) {
            int iK = K(bArr, i10, um1Var);
            j4Var.c(i, Long.valueOf(um1Var.f10991b));
            return iK;
        }
        if (i12 == 1) {
            j4Var.c(i, Long.valueOf(N(i10, bArr)));
            return i10 + 8;
        }
        if (i12 == 2) {
            int iH = H(bArr, i10, um1Var);
            int i13 = um1Var.f10990a;
            if (i13 < 0) {
                throw new n3("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i13 > bArr.length - iH) {
                throw new n3("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i13 == 0) {
                j4Var.c(i, w2.f14351d);
            } else {
                j4Var.c(i, w2.g(bArr, iH, i13));
            }
            return iH + i13;
        }
        if (i12 != 3) {
            if (i12 != 5) {
                throw new n3("Protocol message contained an invalid tag (zero).");
            }
            j4Var.c(i, Integer.valueOf(o(i10, bArr)));
            return i10 + 4;
        }
        int i14 = (i & (-8)) | 4;
        j4 j4VarB = j4.b();
        int i15 = um1Var.f10993d + 1;
        um1Var.f10993d = i15;
        if (i15 >= 100) {
            throw new n3("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
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
            i10 = F(i17, bArr, iH2, i11, j4VarB, um1Var);
            i16 = i17;
        }
        um1Var.f10993d--;
        if (i10 > i11 || i16 != i14) {
            throw new n3("Failed to parse the message.");
        }
        j4Var.c(i, j4VarB);
        return i10;
    }

    public static int H(byte[] bArr, int i, um1 um1Var) {
        int i10 = i + 1;
        byte b2 = bArr[i];
        if (b2 < 0) {
            return I(b2, bArr, i10, um1Var);
        }
        um1Var.f10990a = b2;
        return i10;
    }

    public static int I(int i, byte[] bArr, int i10, um1 um1Var) {
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

    public static int J(int i, byte[] bArr, int i10, int i11, k3 k3Var, um1 um1Var) {
        h3 h3Var = (h3) k3Var;
        int iH = H(bArr, i10, um1Var);
        h3Var.e(um1Var.f10990a);
        while (iH < i11) {
            int iH2 = H(bArr, iH, um1Var);
            if (i != um1Var.f10990a) {
                break;
            }
            iH = H(bArr, iH2, um1Var);
            h3Var.e(um1Var.f10990a);
        }
        return iH;
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

    public static int L(Object obj, f4 f4Var, byte[] bArr, int i, int i10, int i11, um1 um1Var) throws n3 {
        y3 y3Var = (y3) f4Var;
        int i12 = um1Var.f10993d + 1;
        um1Var.f10993d = i12;
        if (i12 >= 100) {
            throw new n3("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iT = y3Var.t(obj, bArr, i, i10, i11, um1Var);
        um1Var.f10993d--;
        um1Var.f10992c = obj;
        return iT;
    }

    public static int M(Object obj, f4 f4Var, byte[] bArr, int i, int i10, um1 um1Var) throws n3 {
        int I = i + 1;
        int i11 = bArr[i];
        if (i11 < 0) {
            I = I(i11, bArr, I, um1Var);
            i11 = um1Var.f10990a;
        }
        int i12 = I;
        if (i11 < 0 || i11 > i10 - i12) {
            throw new n3("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i13 = um1Var.f10993d + 1;
        um1Var.f10993d = i13;
        if (i13 >= 100) {
            throw new n3("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i14 = i12 + i11;
        f4Var.e(obj, bArr, i12, i14, um1Var);
        um1Var.f10993d--;
        um1Var.f10992c = obj;
        return i14;
    }

    public static long N(int i, byte[] bArr) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public static int b(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }

    public static int d(byte[] bArr, int i, um1 um1Var) throws n3 {
        int iH = H(bArr, i, um1Var);
        int i10 = um1Var.f10990a;
        if (i10 < 0) {
            throw new n3("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i10 > bArr.length - iH) {
            throw new n3("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i10 == 0) {
            um1Var.f10992c = w2.f14351d;
            return iH;
        }
        um1Var.f10992c = w2.g(bArr, iH, i10);
        return iH + i10;
    }

    public static String f(w2 w2Var) {
        StringBuilder sb2 = new StringBuilder(w2Var.e());
        for (int i = 0; i < w2Var.e(); i++) {
            byte bA = w2Var.a(i);
            if (bA == 34) {
                sb2.append("\\\"");
            } else if (bA == 39) {
                sb2.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((bA >>> 6) & 3) + 48));
                            sb2.append((char) (((bA >>> 3) & 7) + 48));
                            sb2.append((char) ((bA & 7) + 48));
                        } else {
                            sb2.append((char) bA);
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    public static String g(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String strF;
        int i = 0;
        int i10 = 0;
        while (true) {
            length = objArr.length;
            if (i10 >= length) {
                break;
            }
            Object obj = objArr[i10];
            if (obj == null) {
                strF = "null";
            } else {
                try {
                    strF = obj.toString();
                } catch (Exception e3) {
                    String strK = gf.a.k(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strK), (Throwable) e3);
                    strF = t.z.f("<", strK, " threw ", e3.getClass().getName(), ">");
                }
            }
            objArr[i10] = strF;
            i10++;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + (length * 16));
        int i11 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (iIndexOf = str.indexOf("%s", i11)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i11, iIndexOf);
            sb2.append(objArr[i]);
            i++;
            i11 = iIndexOf + 2;
        }
        sb2.append((CharSequence) str, i11, str.length());
        if (i < length2) {
            sb2.append(" [");
            sb2.append(objArr[i]);
            for (int i12 = i + 1; i12 < objArr.length; i12++) {
                sb2.append(", ");
                sb2.append(objArr[i12]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static void h(int i, int i10) {
        String strG;
        if (i < 0 || i >= i10) {
            if (i < 0) {
                strG = g("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i10 < 0) {
                    throw new IllegalArgumentException(l7.o.i(i10, "negative size: "));
                }
                strG = g("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(strG);
        }
    }

    public static void i(int i, String str) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    public static boolean k(Comparator comparator, Collection collection) {
        Object objComparator;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            objComparator = ((SortedSet) collection).comparator();
            if (objComparator == null) {
                objComparator = n0.f14245c;
            }
        } else {
            if (!(collection instanceof a1)) {
                return false;
            }
            objComparator = ((i0) ((a1) collection)).f14214d;
        }
        return comparator.equals(objComparator);
    }

    public static /* synthetic */ boolean l(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, n1 n1Var, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(n1Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(n1Var) != obj && atomicReferenceFieldUpdater.get(n1Var) != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean m(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, t5 t5Var, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(t5Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(t5Var) != obj && atomicReferenceFieldUpdater.get(t5Var) != obj) {
                return false;
            }
        }
        return true;
    }

    public static int n(int i) {
        if (i == 90) {
            return 91;
        }
        if (i == 91) {
            return 92;
        }
        if (i == 93) {
            return 94;
        }
        if (i == 94) {
            return 95;
        }
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
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case 28:
                return 29;
            case 29:
                return 30;
            case 30:
                return 31;
            case 31:
                return 32;
            case 32:
                return 33;
            case 33:
                return 34;
            case 34:
                return 35;
            case 35:
                return 36;
            case 36:
                return 37;
            case 37:
                return 38;
            case 38:
                return 39;
            case 39:
                return 40;
            case 40:
                return 41;
            case 41:
                return 42;
            case 42:
                return 43;
            case 43:
                return 44;
            case 44:
                return 45;
            case 45:
                return 46;
            case 46:
                return 47;
            case 47:
                return 48;
            case 48:
                return 49;
            case 49:
                return 50;
            case 50:
                return 51;
            case 51:
                return 52;
            case 52:
                return 53;
            case 53:
                return 54;
            case 54:
                return 55;
            case 55:
                return 56;
            case 56:
                return 57;
            case 57:
                return 58;
            case 58:
                return 59;
            case 59:
                return 60;
            case 60:
                return 61;
            case 61:
                return 62;
            case 62:
                return 63;
            case 63:
                return 64;
            case 64:
                return 65;
            case 65:
                return 66;
            case 66:
                return 67;
            case 67:
                return 68;
            case 68:
                return 69;
            case 69:
                return 70;
            case 70:
                return 71;
            case 71:
                return 72;
            case 72:
                return 73;
            case 73:
                return 74;
            case 74:
                return 75;
            case 75:
                return 76;
            case 76:
                return 77;
            case 77:
                return 78;
            case 78:
                return 79;
            case 79:
                return 80;
            default:
                switch (i) {
                    case 96:
                        return 97;
                    case 97:
                        return 98;
                    case 98:
                        return 99;
                    case 99:
                        return 100;
                    case 100:
                        return 101;
                    case 101:
                        return 102;
                    case 102:
                        return 103;
                    case 103:
                        return 104;
                    case 104:
                        return 105;
                    case 105:
                        return 106;
                    case 106:
                        return 107;
                    case 107:
                        return 108;
                    case 108:
                        return 109;
                    case 109:
                        return 110;
                    case 110:
                        return 111;
                    case 111:
                        return 112;
                    case 112:
                        return 113;
                    case 113:
                        return 114;
                    case 114:
                        return 115;
                    case 115:
                        return 116;
                    case 116:
                        return 117;
                    case 117:
                        return 118;
                    case 118:
                        return 119;
                    case 119:
                        return 120;
                    case 120:
                        return 121;
                    case 121:
                        return 122;
                    default:
                        return 0;
                }
        }
    }

    public static int o(int i, byte[] bArr) {
        int i10 = bArr[i] & 255;
        int i11 = bArr[i + 1] & 255;
        int i12 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public static z2 q() {
        String str;
        ClassLoader classLoader = d3.class.getClassLoader();
        if (z2.class.equals(z2.class)) {
            str = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else {
            if (!z2.class.getPackage().equals(d3.class.getPackage())) {
                throw new IllegalArgumentException(z2.class.getName());
            }
            str = z2.class.getPackage().getName() + ".BlazeGenerated" + z2.class.getSimpleName() + "Loader";
        }
        try {
            try {
                try {
                    a0.u.q(Class.forName(str, true, classLoader).getConstructor(null).newInstance(null));
                    throw null;
                } catch (InstantiationException e3) {
                    throw new IllegalStateException(e3);
                } catch (NoSuchMethodException e7) {
                    throw new IllegalStateException(e7);
                }
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException(e10);
            } catch (InvocationTargetException e11) {
                throw new IllegalStateException(e11);
            }
        } catch (ClassNotFoundException unused) {
            try {
                Iterator it = Arrays.asList(new d3[0]).iterator();
                ArrayList arrayList = new ArrayList();
                while (it.hasNext()) {
                    try {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    } catch (ServiceConfigurationError e12) {
                        Logger.getLogger(x2.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(z2.class.getSimpleName()), (Throwable) e12);
                    }
                }
                if (arrayList.size() == 1) {
                    return (z2) arrayList.get(0);
                }
                if (arrayList.size() == 0) {
                    return null;
                }
                try {
                    return (z2) z2.class.getMethod("combine", Collection.class).invoke(null, arrayList);
                } catch (IllegalAccessException e13) {
                    throw new IllegalStateException(e13);
                } catch (NoSuchMethodException e14) {
                    throw new IllegalStateException(e14);
                } catch (InvocationTargetException e15) {
                    throw new IllegalStateException(e15);
                }
            } catch (Throwable th2) {
                throw new ServiceConfigurationError(th2.getMessage(), th2);
            }
        }
    }

    public static void r(int i, int i10) {
        if (i < 0 || i > i10) {
            throw new IndexOutOfBoundsException(D(i, i10, "index"));
        }
    }

    public static int x(f4 f4Var, int i, byte[] bArr, int i10, int i11, k3 k3Var, um1 um1Var) throws n3 {
        g3 g3VarI = f4Var.i();
        f4 f4Var2 = f4Var;
        byte[] bArr2 = bArr;
        int i12 = i11;
        um1 um1Var2 = um1Var;
        int iM = M(g3VarI, f4Var2, bArr2, i10, i12, um1Var2);
        f4Var2.b(g3VarI);
        um1Var2.f10992c = g3VarI;
        k3Var.add(g3VarI);
        while (iM < i12) {
            um1 um1Var3 = um1Var2;
            int i13 = i12;
            int iH = H(bArr2, iM, um1Var3);
            if (i != um1Var3.f10990a) {
                break;
            }
            byte[] bArr3 = bArr2;
            f4 f4Var3 = f4Var2;
            g3 g3VarI2 = f4Var3.i();
            iM = M(g3VarI2, f4Var3, bArr3, iH, i13, um1Var3);
            f4Var2 = f4Var3;
            bArr2 = bArr3;
            i12 = i13;
            um1Var2 = um1Var3;
            f4Var2.b(g3VarI2);
            um1Var2.f10992c = g3VarI2;
            k3Var.add(g3VarI2);
        }
        return iM;
    }

    public static void y(int i, int i10, int i11) {
        if (i < 0 || i10 < i || i10 > i11) {
            throw new IndexOutOfBoundsException((i < 0 || i > i11) ? D(i, i11, "start index") : (i10 < 0 || i10 > i11) ? D(i10, i11, "end index") : g("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i)));
        }
    }

    public static boolean z(byte b2) {
        return b2 > -65;
    }

    public abstract boolean A(n1 n1Var, f1 f1Var, f1 f1Var2);

    public abstract boolean B(t5 t5Var, s5 s5Var, s5 s5Var2);

    public abstract boolean E(n1 n1Var, Object obj, Object obj2);

    public abstract boolean G(n1 n1Var, m1 m1Var, m1 m1Var2);

    public abstract f1 e(n1 n1Var);

    public abstract void j(s5 s5Var, s5 s5Var2);

    public abstract m1 p(n1 n1Var);

    public abstract void s(s5 s5Var, Thread thread);

    public abstract void t(m1 m1Var, m1 m1Var2);

    public String toString() {
        switch (this.f14159b) {
            case 4:
                return ((b2) this).f14138c.toString();
            default:
                return super.toString();
        }
    }

    public abstract boolean u(t5 t5Var, h4 h4Var, h4 h4Var2);

    public abstract void v(m1 m1Var, Thread thread);

    public abstract boolean w(t5 t5Var, Object obj, Object obj2);
}
