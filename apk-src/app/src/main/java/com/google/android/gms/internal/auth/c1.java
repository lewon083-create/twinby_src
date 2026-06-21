package com.google.android.gms.internal.auth;

import java.lang.reflect.Field;
import java.util.Arrays;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 implements k1 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f13176k = new int[0];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Unsafe f13177l = w1.e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f13178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f13179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b0 f13182e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f13183f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f13184g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f13185h;
    public final u0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o1 f13186j;

    public c1(int[] iArr, Object[] objArr, int i, int i10, b0 b0Var, int[] iArr2, int i11, int i12, u0 u0Var, o1 o1Var) {
        this.f13178a = iArr;
        this.f13179b = objArr;
        this.f13180c = i;
        this.f13181d = i10;
        this.f13183f = iArr2;
        this.f13184g = i11;
        this.f13185h = i12;
        this.i = u0Var;
        this.f13186j = o1Var;
        this.f13182e = b0Var;
    }

    public static boolean l(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof l0) {
            return ((l0) obj).g();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:186:0x039b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.auth.c1 o(com.google.android.gms.internal.auth.j1 r35, com.google.android.gms.internal.auth.u0 r36, com.google.android.gms.internal.auth.o1 r37) {
        /*
            Method dump skipped, instruction units count: 1035
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.c1.o(com.google.android.gms.internal.auth.j1, com.google.android.gms.internal.auth.u0, com.google.android.gms.internal.auth.o1):com.google.android.gms.internal.auth.c1");
    }

    public static int p(l0 l0Var, long j10) {
        return ((Integer) w1.d(j10, l0Var)).intValue();
    }

    public static int r(int i) {
        return (i >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE;
    }

    public static Field x(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sbJ = t.z.j("Field ", str, " for ", name, " not found. Known fields are ");
            sbJ.append(string);
            throw new RuntimeException(sbJ.toString());
        }
    }

    public final void A(int i, Object obj) {
        int i10 = this.f13178a[i + 2];
        long j10 = 1048575 & i10;
        if (j10 == 1048575) {
            return;
        }
        w1.h((1 << (i10 >>> 20)) | w1.a(j10, obj), j10, obj);
    }

    @Override // com.google.android.gms.internal.auth.k1
    public final boolean a(l0 l0Var, l0 l0Var2) {
        boolean zB;
        int[] iArr = this.f13178a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                int iS = s(i);
                long j10 = iS & 1048575;
                switch (r(iS)) {
                    case 0:
                        if (j(l0Var, l0Var2, i)) {
                            v1 v1Var = w1.f13298c;
                            if (Double.doubleToLongBits(v1Var.a(j10, l0Var)) == Double.doubleToLongBits(v1Var.a(j10, l0Var2))) {
                                continue;
                                i += 3;
                            }
                        }
                        break;
                    case 1:
                        if (j(l0Var, l0Var2, i)) {
                            v1 v1Var2 = w1.f13298c;
                            if (Float.floatToIntBits(v1Var2.b(j10, l0Var)) == Float.floatToIntBits(v1Var2.b(j10, l0Var2))) {
                                continue;
                                i += 3;
                            }
                        }
                        break;
                    case 2:
                        if (j(l0Var, l0Var2, i) && w1.b(j10, l0Var) == w1.b(j10, l0Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 3:
                        if (j(l0Var, l0Var2, i) && w1.b(j10, l0Var) == w1.b(j10, l0Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 4:
                        if (j(l0Var, l0Var2, i) && w1.a(j10, l0Var) == w1.a(j10, l0Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 5:
                        if (j(l0Var, l0Var2, i) && w1.b(j10, l0Var) == w1.b(j10, l0Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 6:
                        if (j(l0Var, l0Var2, i) && w1.a(j10, l0Var) == w1.a(j10, l0Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 7:
                        if (j(l0Var, l0Var2, i)) {
                            v1 v1Var3 = w1.f13298c;
                            if (v1Var3.f(j10, l0Var) == v1Var3.f(j10, l0Var2)) {
                                continue;
                                i += 3;
                            }
                        }
                        break;
                    case 8:
                        if (j(l0Var, l0Var2, i) && l1.b(w1.d(j10, l0Var), w1.d(j10, l0Var2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 9:
                        if (j(l0Var, l0Var2, i) && l1.b(w1.d(j10, l0Var), w1.d(j10, l0Var2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 10:
                        if (j(l0Var, l0Var2, i) && l1.b(w1.d(j10, l0Var), w1.d(j10, l0Var2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 11:
                        if (j(l0Var, l0Var2, i) && w1.a(j10, l0Var) == w1.a(j10, l0Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 12:
                        if (j(l0Var, l0Var2, i) && w1.a(j10, l0Var) == w1.a(j10, l0Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 13:
                        if (j(l0Var, l0Var2, i) && w1.a(j10, l0Var) == w1.a(j10, l0Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 14:
                        if (j(l0Var, l0Var2, i) && w1.b(j10, l0Var) == w1.b(j10, l0Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 15:
                        if (j(l0Var, l0Var2, i) && w1.a(j10, l0Var) == w1.a(j10, l0Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 16:
                        if (j(l0Var, l0Var2, i) && w1.b(j10, l0Var) == w1.b(j10, l0Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 17:
                        if (j(l0Var, l0Var2, i) && l1.b(w1.d(j10, l0Var), w1.d(j10, l0Var2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        zB = l1.b(w1.d(j10, l0Var), w1.d(j10, l0Var2));
                        break;
                    case 50:
                        zB = l1.b(w1.d(j10, l0Var), w1.d(j10, l0Var2));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long j11 = iArr[i + 2] & 1048575;
                        if (w1.a(j11, l0Var) == w1.a(j11, l0Var2) && l1.b(w1.d(j10, l0Var), w1.d(j10, l0Var2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    default:
                        i += 3;
                        break;
                }
                if (zB) {
                    i += 3;
                }
            } else {
                this.f13186j.getClass();
                if (l0Var.zzc.equals(l0Var2.zzc)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.auth.k1
    public final void b(Object obj, byte[] bArr, int i, int i10, a4.g gVar) throws p0 {
        n(obj, bArr, i, i10, 0, gVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00e8 A[PHI: r3
      0x00e8: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:84:0x0207, B:42:0x00e6] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.auth.k1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c(com.google.android.gms.internal.auth.l0 r13) {
        /*
            Method dump skipped, instruction units count: 760
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.c1.c(com.google.android.gms.internal.auth.l0):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    @Override // com.google.android.gms.internal.auth.k1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.c1.d(java.lang.Object):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // com.google.android.gms.internal.auth.k1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(java.lang.Object r13, java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.c1.e(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    @Override // com.google.android.gms.internal.auth.k1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.c1.f(java.lang.Object):boolean");
    }

    @Override // com.google.android.gms.internal.auth.k1
    public final l0 g() {
        return ((l0) this.f13182e).b();
    }

    public final void h(int i, Object obj, Object obj2) {
        f13177l.putObject(obj, s(i) & 1048575, obj2);
        A(i, obj);
    }

    public final void i(int i, Object obj, Object obj2, int i10) {
        f13177l.putObject(obj, s(i10) & 1048575, obj2);
        w1.h(i, this.f13178a[i10 + 2] & 1048575, obj);
    }

    public final boolean j(l0 l0Var, l0 l0Var2, int i) {
        return k(i, l0Var) == k(i, l0Var2);
    }

    public final boolean k(int i, Object obj) {
        int i10 = this.f13178a[i + 2];
        long j10 = i10 & 1048575;
        if (j10 == 1048575) {
            int iS = s(i);
            long j11 = iS & 1048575;
            switch (r(iS)) {
                case 0:
                    if (Double.doubleToRawLongBits(w1.f13298c.a(j11, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(w1.f13298c.b(j11, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (w1.b(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (w1.b(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (w1.a(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (w1.b(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (w1.a(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return w1.f13298c.f(j11, obj);
                case 8:
                    Object objD = w1.d(j11, obj);
                    if (objD instanceof String) {
                        if (((String) objD).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(objD instanceof g0)) {
                            throw new IllegalArgumentException();
                        }
                        if (g0.f13222d.equals(objD)) {
                            return false;
                        }
                    }
                case 9:
                    if (w1.d(j11, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (g0.f13222d.equals(w1.d(j11, obj))) {
                        return false;
                    }
                    break;
                case 11:
                    if (w1.a(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (w1.a(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (w1.a(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (w1.b(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (w1.a(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (w1.b(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (w1.d(j11, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i10 >>> 20)) & w1.a(j10, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean m(int i, int i10, Object obj) {
        return w1.a((long) (this.f13178a[i10 + 2] & 1048575), obj) == i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x028f, code lost:
    
        throw com.google.android.gms.internal.auth.p0.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02e2, code lost:
    
        throw com.google.android.gms.internal.auth.p0.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0343, code lost:
    
        throw com.google.android.gms.internal.auth.p0.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0429, code lost:
    
        r9 = r36;
        r5 = r37;
        r3 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x042e, code lost:
    
        r8 = r11;
        r6 = r12;
        r7 = r13;
        r15 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e8, code lost:
    
        r8 = r11;
        r6 = r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:592:0x0c7c A[PHI: r10 r14 r19
      0x0c7c: PHI (r10v27 int) = 
      (r10v8 int)
      (r10v9 int)
      (r10v10 int)
      (r10v11 int)
      (r10v12 int)
      (r10v13 int)
      (r10v15 int)
      (r10v20 int)
      (r10v28 int)
     binds: [B:590:0x0c65, B:587:0x0c48, B:584:0x0c2e, B:581:0x0c16, B:578:0x0bfd, B:575:0x0be3, B:567:0x0bbe, B:539:0x0b0f, B:528:0x0ab8] A[DONT_GENERATE, DONT_INLINE]
      0x0c7c: PHI (r14v84 int) = 
      (r14v62 int)
      (r14v63 int)
      (r14v64 int)
      (r14v65 int)
      (r14v66 int)
      (r14v67 int)
      (r14v69 int)
      (r14v75 int)
      (r14v85 int)
     binds: [B:590:0x0c65, B:587:0x0c48, B:584:0x0c2e, B:581:0x0c16, B:578:0x0bfd, B:575:0x0be3, B:567:0x0bbe, B:539:0x0b0f, B:528:0x0ab8] A[DONT_GENERATE, DONT_INLINE]
      0x0c7c: PHI (r19v29 int) = 
      (r19v13 int)
      (r19v14 int)
      (r19v15 int)
      (r19v16 int)
      (r19v17 int)
      (r19v18 int)
      (r19v20 int)
      (r19v25 int)
      (r19v30 int)
     binds: [B:590:0x0c65, B:587:0x0c48, B:584:0x0c2e, B:581:0x0c16, B:578:0x0bfd, B:575:0x0be3, B:567:0x0bbe, B:539:0x0b0f, B:528:0x0ab8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:603:0x0cb4  */
    /* JADX WARN: Removed duplicated region for block: B:716:0x0c7f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:721:0x0a1b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:722:0x005b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:751:0x0a2e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:753:0x0c94 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0241  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int n(java.lang.Object r34, byte[] r35, int r36, int r37, int r38, a4.g r39) throws com.google.android.gms.internal.auth.p0 {
        /*
            Method dump skipped, instruction units count: 3520
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.c1.n(java.lang.Object, byte[], int, int, int, a4.g):int");
    }

    public final int q(int i, int i10) {
        int[] iArr = this.f13178a;
        int length = (iArr.length / 3) - 1;
        while (i10 <= length) {
            int i11 = (length + i10) >>> 1;
            int i12 = i11 * 3;
            int i13 = iArr[i12];
            if (i == i13) {
                return i12;
            }
            if (i < i13) {
                length = i11 - 1;
            } else {
                i10 = i11 + 1;
            }
        }
        return -1;
    }

    public final int s(int i) {
        return this.f13178a[i + 1];
    }

    public final void t(int i) {
        int i10 = i / 3;
        if (this.f13179b[i10 + i10 + 1] != null) {
            throw new ClassCastException();
        }
    }

    public final k1 u(int i) {
        int i10 = i / 3;
        int i11 = i10 + i10;
        Object[] objArr = this.f13179b;
        k1 k1Var = (k1) objArr[i11];
        if (k1Var != null) {
            return k1Var;
        }
        k1 k1VarA = h1.f13228c.a((Class) objArr[i11 + 1]);
        objArr[i11] = k1VarA;
        return k1VarA;
    }

    public final Object v(int i, Object obj) {
        k1 k1VarU = u(i);
        int iS = s(i) & 1048575;
        if (!k(i, obj)) {
            return k1VarU.g();
        }
        Object object = f13177l.getObject(obj, iS);
        if (l(object)) {
            return object;
        }
        l0 l0VarG = k1VarU.g();
        if (object != null) {
            k1VarU.e(l0VarG, object);
        }
        return l0VarG;
    }

    public final Object w(int i, int i10, Object obj) {
        k1 k1VarU = u(i10);
        if (!m(i, i10, obj)) {
            return k1VarU.g();
        }
        Object object = f13177l.getObject(obj, s(i10) & 1048575);
        if (l(object)) {
            return object;
        }
        l0 l0VarG = k1VarU.g();
        if (object != null) {
            k1VarU.e(l0VarG, object);
        }
        return l0VarG;
    }

    public final void y(int i, Object obj, Object obj2) {
        if (k(i, obj2)) {
            int iS = s(i) & 1048575;
            Unsafe unsafe = f13177l;
            long j10 = iS;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f13178a[i] + " is present but null: " + obj2.toString());
            }
            k1 k1VarU = u(i);
            if (!k(i, obj)) {
                if (l(object)) {
                    l0 l0VarG = k1VarU.g();
                    k1VarU.e(l0VarG, object);
                    unsafe.putObject(obj, j10, l0VarG);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                A(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!l(object2)) {
                l0 l0VarG2 = k1VarU.g();
                k1VarU.e(l0VarG2, object2);
                unsafe.putObject(obj, j10, l0VarG2);
                object2 = l0VarG2;
            }
            k1VarU.e(object2, object);
        }
    }

    public final void z(int i, Object obj, Object obj2) {
        int[] iArr = this.f13178a;
        int i10 = iArr[i];
        if (m(i10, i, obj2)) {
            int iS = s(i) & 1048575;
            Unsafe unsafe = f13177l;
            long j10 = iS;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2.toString());
            }
            k1 k1VarU = u(i);
            if (!m(i10, i, obj)) {
                if (l(object)) {
                    l0 l0VarG = k1VarU.g();
                    k1VarU.e(l0VarG, object);
                    unsafe.putObject(obj, j10, l0VarG);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                w1.h(i10, iArr[i + 2] & 1048575, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!l(object2)) {
                l0 l0VarG2 = k1VarU.g();
                k1VarU.e(l0VarG2, object2);
                unsafe.putObject(obj, j10, l0VarG2);
                object2 = l0VarG2;
            }
            k1VarU.e(object2, object);
        }
    }
}
