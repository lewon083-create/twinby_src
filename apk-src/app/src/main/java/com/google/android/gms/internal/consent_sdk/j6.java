package com.google.android.gms.internal.consent_sdk;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j6 implements p6 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f13416g = new int[0];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Unsafe f13417h = a7.i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f13418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f13419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f5 f13420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f13421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f13422e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v6 f13423f;

    public j6(int[] iArr, Object[] objArr, f5 f5Var, int[] iArr2, int i, v6 v6Var, m4 m4Var) {
        this.f13418a = iArr;
        this.f13419b = objArr;
        this.f13421d = iArr2;
        this.f13422e = i;
        this.f13423f = v6Var;
        this.f13420c = f5Var;
    }

    public static boolean h(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof t5) {
            return ((t5) obj).e();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x038a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.consent_sdk.j6 j(com.google.android.gms.internal.consent_sdk.o6 r32, com.google.android.gms.internal.consent_sdk.v6 r33, com.google.android.gms.internal.consent_sdk.m4 r34) {
        /*
            Method dump skipped, instruction units count: 1005
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.j6.j(com.google.android.gms.internal.consent_sdk.o6, com.google.android.gms.internal.consent_sdk.v6, com.google.android.gms.internal.consent_sdk.m4):com.google.android.gms.internal.consent_sdk.j6");
    }

    public static int k(long j10, Object obj) {
        return ((Integer) a7.h(j10, obj)).intValue();
    }

    public static int m(int i) {
        return (i >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE;
    }

    public static long o(long j10, Object obj) {
        return ((Long) a7.h(j10, obj)).longValue();
    }

    public static Field q(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e3) {
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
            throw new RuntimeException(sbJ.toString(), e3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    @Override // com.google.android.gms.internal.consent_sdk.p6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.j6.a(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00db A[PHI: r1
      0x00db: PHI (r1v35 int) = (r1v11 int), (r1v36 int) binds: [B:85:0x01ea, B:43:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.consent_sdk.p6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(com.google.android.gms.internal.consent_sdk.t5 r11) {
        /*
            Method dump skipped, instruction units count: 728
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.j6.b(com.google.android.gms.internal.consent_sdk.t5):int");
    }

    @Override // com.google.android.gms.internal.consent_sdk.p6
    public final boolean c(t5 t5Var, t5 t5Var2) {
        boolean zE;
        int i = 0;
        while (true) {
            int[] iArr = this.f13418a;
            if (i < iArr.length) {
                int iN = n(i);
                long j10 = iN & 1048575;
                switch (m(iN)) {
                    case 0:
                        if (u(t5Var, t5Var2, i)) {
                            z6 z6Var = a7.f13327c;
                            if (Double.doubleToLongBits(z6Var.a(j10, t5Var)) == Double.doubleToLongBits(z6Var.a(j10, t5Var2))) {
                                continue;
                                i += 3;
                            }
                        }
                        break;
                    case 1:
                        if (u(t5Var, t5Var2, i)) {
                            z6 z6Var2 = a7.f13327c;
                            if (Float.floatToIntBits(z6Var2.b(j10, t5Var)) == Float.floatToIntBits(z6Var2.b(j10, t5Var2))) {
                                continue;
                                i += 3;
                            }
                        }
                        break;
                    case 2:
                        if (u(t5Var, t5Var2, i) && a7.f(j10, t5Var) == a7.f(j10, t5Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 3:
                        if (u(t5Var, t5Var2, i) && a7.f(j10, t5Var) == a7.f(j10, t5Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 4:
                        if (u(t5Var, t5Var2, i) && a7.e(j10, t5Var) == a7.e(j10, t5Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 5:
                        if (u(t5Var, t5Var2, i) && a7.f(j10, t5Var) == a7.f(j10, t5Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 6:
                        if (u(t5Var, t5Var2, i) && a7.e(j10, t5Var) == a7.e(j10, t5Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 7:
                        if (u(t5Var, t5Var2, i)) {
                            z6 z6Var3 = a7.f13327c;
                            if (z6Var3.g(j10, t5Var) == z6Var3.g(j10, t5Var2)) {
                                continue;
                                i += 3;
                            }
                        }
                        break;
                    case 8:
                        if (u(t5Var, t5Var2, i) && q6.e(a7.h(j10, t5Var), a7.h(j10, t5Var2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 9:
                        if (u(t5Var, t5Var2, i) && q6.e(a7.h(j10, t5Var), a7.h(j10, t5Var2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 10:
                        if (u(t5Var, t5Var2, i) && q6.e(a7.h(j10, t5Var), a7.h(j10, t5Var2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 11:
                        if (u(t5Var, t5Var2, i) && a7.e(j10, t5Var) == a7.e(j10, t5Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 12:
                        if (u(t5Var, t5Var2, i) && a7.e(j10, t5Var) == a7.e(j10, t5Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 13:
                        if (u(t5Var, t5Var2, i) && a7.e(j10, t5Var) == a7.e(j10, t5Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 14:
                        if (u(t5Var, t5Var2, i) && a7.f(j10, t5Var) == a7.f(j10, t5Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 15:
                        if (u(t5Var, t5Var2, i) && a7.e(j10, t5Var) == a7.e(j10, t5Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 16:
                        if (u(t5Var, t5Var2, i) && a7.f(j10, t5Var) == a7.f(j10, t5Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 17:
                        if (u(t5Var, t5Var2, i) && q6.e(a7.h(j10, t5Var), a7.h(j10, t5Var2))) {
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
                        zE = q6.e(a7.h(j10, t5Var), a7.h(j10, t5Var2));
                        break;
                    case 50:
                        zE = q6.e(a7.h(j10, t5Var), a7.h(j10, t5Var2));
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
                        if (a7.e(j11, t5Var) == a7.e(j11, t5Var2) && q6.e(a7.h(j10, t5Var), a7.h(j10, t5Var2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    default:
                        i += 3;
                        break;
                }
                if (zE) {
                    i += 3;
                }
            } else if (t5Var.zzc.equals(t5Var2.zzc)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x033e A[SYNTHETIC] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    @Override // com.google.android.gms.internal.consent_sdk.p6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(java.lang.Object r29, com.google.android.gms.internal.consent_sdk.d6 r30) {
        /*
            Method dump skipped, instruction units count: 2428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.j6.d(java.lang.Object, com.google.android.gms.internal.consent_sdk.d6):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // com.google.android.gms.internal.consent_sdk.p6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(java.lang.Object r13, java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 672
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.j6.e(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0642 A[PHI: r21 r22
      0x0642: PHI (r21v21 int) = (r21v3 int), (r21v4 int), (r21v10 int), (r21v12 int), (r21v13 int), (r21v14 int), (r21v18 int), (r21v22 int) binds: [B:273:0x080f, B:269:0x07ef, B:243:0x074a, B:229:0x06e1, B:225:0x06c1, B:221:0x06a3, B:214:0x0663, B:208:0x0640] A[DONT_GENERATE, DONT_INLINE]
      0x0642: PHI (r22v20 int) = (r22v3 int), (r22v4 int), (r22v10 int), (r22v12 int), (r22v13 int), (r22v14 int), (r22v17 int), (r22v21 int) binds: [B:273:0x080f, B:269:0x07ef, B:243:0x074a, B:229:0x06e1, B:225:0x06c1, B:221:0x06a3, B:214:0x0663, B:208:0x0640] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x07b1 A[PHI: r21 r22
      0x07b1: PHI (r21v8 int) = (r21v2 int), (r21v9 int) binds: [B:277:0x082f, B:262:0x07af] A[DONT_GENERATE, DONT_INLINE]
      0x07b1: PHI (r22v8 int) = (r22v2 int), (r22v9 int) binds: [B:277:0x082f, B:262:0x07af] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:349:0x035d A[SYNTHETIC] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    @Override // com.google.android.gms.internal.consent_sdk.p6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(com.google.android.gms.internal.consent_sdk.f5 r28) {
        /*
            Method dump skipped, instruction units count: 2816
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.j6.f(com.google.android.gms.internal.consent_sdk.f5):int");
    }

    @Override // com.google.android.gms.internal.consent_sdk.p6
    public final boolean g(Object obj) {
        int i;
        int i10;
        int i11;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (i13 < this.f13422e) {
            int i15 = this.f13421d[i13];
            int[] iArr = this.f13418a;
            int i16 = iArr[i15];
            int iN = n(i15);
            int i17 = iArr[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i14) {
                if (i18 != 1048575) {
                    i12 = f13417h.getInt(obj, i18);
                }
                i10 = i15;
                i11 = i12;
                i = i18;
            } else {
                int i20 = i12;
                i = i14;
                i10 = i15;
                i11 = i20;
            }
            if ((268435456 & iN) == 0 || w(obj, i10, i, i11, i19)) {
                int iM = m(iN);
                if (iM != 9 && iM != 17) {
                    if (iM != 27) {
                        if (iM == 60 || iM == 68) {
                            if (!i(i16, i10, obj) || p(i10).g(a7.h(iN & 1048575, obj))) {
                                i13++;
                                i14 = i;
                                i12 = i11;
                            }
                        } else if (iM != 49) {
                            if (iM != 50) {
                                continue;
                            } else {
                                f6 f6Var = (f6) a7.h(iN & 1048575, obj);
                                if (f6Var.isEmpty()) {
                                    continue;
                                } else {
                                    int i21 = i10 / 3;
                                    if (((d7) ((e6) this.f13419b[i21 + i21]).f13372a.f13493c).f13365b == e7.f13380j) {
                                        p6 p6VarA = null;
                                        for (Object obj2 : f6Var.values()) {
                                            if (p6VarA == null) {
                                                p6VarA = m6.f13489c.a(obj2.getClass());
                                            }
                                            if (!p6VarA.g(obj2)) {
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                            i13++;
                            i14 = i;
                            i12 = i11;
                        }
                    }
                    List list = (List) a7.h(iN & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        p6 p6VarP = p(i10);
                        for (int i22 = 0; i22 < list.size(); i22++) {
                            if (p6VarP.g(list.get(i22))) {
                            }
                        }
                    }
                    i13++;
                    i14 = i;
                    i12 = i11;
                } else if (!w(obj, i10, i, i11, i19) || p(i10).g(a7.h(iN & 1048575, obj))) {
                    i13++;
                    i14 = i;
                    i12 = i11;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean i(int i, int i10, Object obj) {
        return a7.e((long) (this.f13418a[i10 + 2] & 1048575), obj) == i;
    }

    @Override // com.google.android.gms.internal.consent_sdk.p6
    public final t5 l() {
        return (t5) ((t5) this.f13420c).f(4);
    }

    public final int n(int i) {
        return this.f13418a[i + 1];
    }

    public final p6 p(int i) {
        int i10 = i / 3;
        int i11 = i10 + i10;
        Object[] objArr = this.f13419b;
        p6 p6Var = (p6) objArr[i11];
        if (p6Var != null) {
            return p6Var;
        }
        p6 p6VarA = m6.f13489c.a((Class) objArr[i11 + 1]);
        objArr[i11] = p6VarA;
        return p6VarA;
    }

    public final void r(int i, Object obj, Object obj2) {
        if (v(i, obj2)) {
            int iN = n(i) & 1048575;
            Unsafe unsafe = f13417h;
            long j10 = iN;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f13418a[i] + " is present but null: " + obj2.toString());
            }
            p6 p6VarP = p(i);
            if (!v(i, obj)) {
                if (h(object)) {
                    t5 t5VarL = p6VarP.l();
                    p6VarP.e(t5VarL, object);
                    unsafe.putObject(obj, j10, t5VarL);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                t(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!h(object2)) {
                t5 t5VarL2 = p6VarP.l();
                p6VarP.e(t5VarL2, object2);
                unsafe.putObject(obj, j10, t5VarL2);
                object2 = t5VarL2;
            }
            p6VarP.e(object2, object);
        }
    }

    public final void s(int i, Object obj, Object obj2) {
        int[] iArr = this.f13418a;
        int i10 = iArr[i];
        if (i(i10, i, obj2)) {
            int iN = n(i) & 1048575;
            Unsafe unsafe = f13417h;
            long j10 = iN;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2.toString());
            }
            p6 p6VarP = p(i);
            if (!i(i10, i, obj)) {
                if (h(object)) {
                    t5 t5VarL = p6VarP.l();
                    p6VarP.e(t5VarL, object);
                    unsafe.putObject(obj, j10, t5VarL);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                a7.j(i10, iArr[i + 2] & 1048575, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!h(object2)) {
                t5 t5VarL2 = p6VarP.l();
                p6VarP.e(t5VarL2, object2);
                unsafe.putObject(obj, j10, t5VarL2);
                object2 = t5VarL2;
            }
            p6VarP.e(object2, object);
        }
    }

    public final void t(int i, Object obj) {
        int i10 = this.f13418a[i + 2];
        long j10 = 1048575 & i10;
        if (j10 == 1048575) {
            return;
        }
        a7.j((1 << (i10 >>> 20)) | a7.e(j10, obj), j10, obj);
    }

    public final boolean u(t5 t5Var, t5 t5Var2, int i) {
        return v(i, t5Var) == v(i, t5Var2);
    }

    public final boolean v(int i, Object obj) {
        int i10 = this.f13418a[i + 2];
        long j10 = i10 & 1048575;
        if (j10 == 1048575) {
            int iN = n(i);
            long j11 = iN & 1048575;
            switch (m(iN)) {
                case 0:
                    if (Double.doubleToRawLongBits(a7.f13327c.a(j11, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(a7.f13327c.b(j11, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (a7.f(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (a7.f(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (a7.e(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (a7.f(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (a7.e(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return a7.f13327c.g(j11, obj);
                case 8:
                    Object objH = a7.h(j11, obj);
                    if (objH instanceof String) {
                        if (((String) objH).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(objH instanceof k5)) {
                            throw new IllegalArgumentException();
                        }
                        if (k5.f13446d.equals(objH)) {
                            return false;
                        }
                    }
                case 9:
                    if (a7.h(j11, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (k5.f13446d.equals(a7.h(j11, obj))) {
                        return false;
                    }
                    break;
                case 11:
                    if (a7.e(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (a7.e(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (a7.e(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (a7.f(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (a7.e(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (a7.f(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (a7.h(j11, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i10 >>> 20)) & a7.e(j10, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean w(Object obj, int i, int i10, int i11, int i12) {
        return i10 == 1048575 ? v(i, obj) : (i11 & i12) != 0;
    }
}
