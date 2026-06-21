package ob;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.EnumMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class x1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x1 f30509c = new x1(100);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumMap f30510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f30511b;

    public x1(int i) {
        EnumMap enumMap = new EnumMap(w1.class);
        this.f30510a = enumMap;
        w1 w1Var = w1.AD_STORAGE;
        u1 u1Var = u1.UNINITIALIZED;
        enumMap.put(w1Var, u1Var);
        enumMap.put(w1.ANALYTICS_STORAGE, u1Var);
        this.f30511b = i;
    }

    public static String a(int i) {
        return i != -30 ? i != -20 ? i != -10 ? i != 0 ? i != 30 ? i != 90 ? i != 100 ? "OTHER" : "UNKNOWN" : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API" : "TCF";
    }

    public static x1 b(int i, Bundle bundle) {
        if (bundle == null) {
            return new x1(i);
        }
        EnumMap enumMap = new EnumMap(w1.class);
        for (w1 w1Var : v1.STORAGE.f30462b) {
            enumMap.put(w1Var, d(bundle.getString(w1Var.f30498b)));
        }
        return new x1(enumMap, i);
    }

    public static x1 c(int i, String str) {
        EnumMap enumMap = new EnumMap(w1.class);
        w1[] w1VarArr = v1.STORAGE.f30462b;
        for (int i10 = 0; i10 < w1VarArr.length; i10++) {
            String str2 = str == null ? "" : str;
            w1 w1Var = w1VarArr[i10];
            int i11 = i10 + 2;
            if (i11 < str2.length()) {
                enumMap.put(w1Var, e(str2.charAt(i11)));
            } else {
                enumMap.put(w1Var, u1.UNINITIALIZED);
            }
        }
        return new x1(enumMap, i);
    }

    public static u1 d(String str) {
        u1 u1Var = u1.UNINITIALIZED;
        return str == null ? u1Var : str.equals("granted") ? u1.GRANTED : str.equals("denied") ? u1.DENIED : u1Var;
    }

    public static u1 e(char c8) {
        return c8 != '+' ? c8 != '0' ? c8 != '1' ? u1.UNINITIALIZED : u1.GRANTED : u1.DENIED : u1.POLICY;
    }

    public static char h(u1 u1Var) {
        if (u1Var == null) {
            return '-';
        }
        int iOrdinal = u1Var.ordinal();
        if (iOrdinal == 1) {
            return '+';
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public static boolean l(int i, int i10) {
        int i11 = -30;
        if (i == -20) {
            if (i10 == -30) {
                return true;
            }
            i = -20;
        }
        if (i != -30) {
            i11 = i;
        } else if (i10 == -20) {
            return true;
        }
        return i11 == i10 || i < i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj;
        for (w1 w1Var : v1.STORAGE.f30462b) {
            if (this.f30510a.get(w1Var) != x1Var.f30510a.get(w1Var)) {
                return false;
            }
        }
        return this.f30511b == x1Var.f30511b;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String f() {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "G1"
            r0.<init>(r1)
            ob.v1 r1 = ob.v1.STORAGE
            ob.w1[] r1 = r1.f30462b
            int r2 = r1.length
            r3 = 0
        Ld:
            if (r3 >= r2) goto L38
            r4 = r1[r3]
            java.util.EnumMap r5 = r7.f30510a
            java.lang.Object r4 = r5.get(r4)
            ob.u1 r4 = (ob.u1) r4
            r5 = 45
            if (r4 == 0) goto L32
            int r4 = r4.ordinal()
            if (r4 == 0) goto L32
            r6 = 1
            if (r4 == r6) goto L30
            r6 = 2
            if (r4 == r6) goto L2d
            r6 = 3
            if (r4 == r6) goto L30
            goto L32
        L2d:
            r5 = 48
            goto L32
        L30:
            r5 = 49
        L32:
            r0.append(r5)
            int r3 = r3 + 1
            goto Ld
        L38:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.x1.f():java.lang.String");
    }

    public final String g() {
        StringBuilder sb2 = new StringBuilder("G1");
        for (w1 w1Var : v1.STORAGE.f30462b) {
            sb2.append(h((u1) this.f30510a.get(w1Var)));
        }
        return sb2.toString();
    }

    public final int hashCode() {
        Iterator it = this.f30510a.values().iterator();
        int iHashCode = this.f30511b * 17;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((u1) it.next()).hashCode();
        }
        return iHashCode;
    }

    public final boolean i(w1 w1Var) {
        return ((u1) this.f30510a.get(w1Var)) != u1.DENIED;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ob.x1 j(ob.x1 r9) {
        /*
            r8 = this;
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<ob.w1> r1 = ob.w1.class
            r0.<init>(r1)
            ob.v1 r1 = ob.v1.STORAGE
            ob.w1[] r1 = r1.f30462b
            int r2 = r1.length
            r3 = 0
        Ld:
            if (r3 >= r2) goto L48
            r4 = r1[r3]
            java.util.EnumMap r5 = r8.f30510a
            java.lang.Object r5 = r5.get(r4)
            ob.u1 r5 = (ob.u1) r5
            java.util.EnumMap r6 = r9.f30510a
            java.lang.Object r6 = r6.get(r4)
            ob.u1 r6 = (ob.u1) r6
            if (r5 != 0) goto L24
            goto L31
        L24:
            if (r6 == 0) goto L40
            ob.u1 r7 = ob.u1.UNINITIALIZED
            if (r5 != r7) goto L2b
            goto L31
        L2b:
            if (r6 == r7) goto L40
            ob.u1 r7 = ob.u1.POLICY
            if (r5 != r7) goto L33
        L31:
            r5 = r6
            goto L40
        L33:
            if (r6 == r7) goto L40
            ob.u1 r7 = ob.u1.DENIED
            if (r5 == r7) goto L3f
            if (r6 != r7) goto L3c
            goto L3f
        L3c:
            ob.u1 r5 = ob.u1.GRANTED
            goto L40
        L3f:
            r5 = r7
        L40:
            if (r5 == 0) goto L45
            r0.put(r4, r5)
        L45:
            int r3 = r3 + 1
            goto Ld
        L48:
            ob.x1 r9 = new ob.x1
            r1 = 100
            r9.<init>(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.x1.j(ob.x1):ob.x1");
    }

    public final x1 k(x1 x1Var) {
        EnumMap enumMap = new EnumMap(w1.class);
        for (w1 w1Var : v1.STORAGE.f30462b) {
            u1 u1Var = (u1) this.f30510a.get(w1Var);
            if (u1Var == u1.UNINITIALIZED) {
                u1Var = (u1) x1Var.f30510a.get(w1Var);
            }
            if (u1Var != null) {
                enumMap.put(w1Var, u1Var);
            }
        }
        return new x1(enumMap, this.f30511b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(a(this.f30511b));
        for (w1 w1Var : v1.STORAGE.f30462b) {
            sb2.append(StringUtils.COMMA);
            sb2.append(w1Var.f30498b);
            sb2.append("=");
            u1 u1Var = (u1) this.f30510a.get(w1Var);
            if (u1Var == null) {
                u1Var = u1.UNINITIALIZED;
            }
            sb2.append(u1Var);
        }
        return sb2.toString();
    }

    public x1(EnumMap enumMap, int i) {
        EnumMap enumMap2 = new EnumMap(w1.class);
        this.f30510a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f30511b = i;
    }
}
