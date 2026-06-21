package t;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f33326a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65};

    public static /* synthetic */ boolean a(int i, int i10) {
        if (i != 0) {
            return i == i10;
        }
        throw null;
    }

    public static g0.l2 b(g0.o2 o2Var, g0.m2 m2Var, g0.l2 l2Var, ArrayList arrayList, g0.l2 l2Var2) {
        l2Var.a(g0.p2.a(o2Var, m2Var));
        arrayList.add(l2Var2);
        return new g0.l2();
    }

    public static g0.l2 c(ArrayList arrayList, g0.l2 l2Var) {
        arrayList.add(l2Var);
        return new g0.l2();
    }

    public static String d(int i, String str, StringBuilder sb2) {
        sb2.append(i);
        sb2.append(str);
        return sb2.toString();
    }

    public static String e(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String f(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String g(StringBuilder sb2, String str, String str2, String str3) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2.toString();
    }

    public static String h(StringBuilder sb2, List list, String str) {
        sb2.append(list);
        sb2.append(str);
        return sb2.toString();
    }

    public static StringBuilder i(String str, int i, String str2, int i10, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i);
        sb2.append(str2);
        sb2.append(i10);
        sb2.append(str3);
        return sb2;
    }

    public static StringBuilder j(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        sb2.append(str5);
        return sb2;
    }

    public static void k(g0.o2 o2Var, g0.m2 m2Var, g0.l2 l2Var, g0.o2 o2Var2, g0.m2 m2Var2) {
        l2Var.a(g0.p2.a(o2Var, m2Var));
        l2Var.a(g0.p2.a(o2Var2, m2Var2));
    }

    public static /* synthetic */ String l(int i) {
        switch (i) {
            case 1:
                return "RELEASED";
            case 2:
                return "RELEASING";
            case 3:
                return "INITIALIZED";
            case 4:
                return "PENDING_OPEN";
            case 5:
                return "OPENING_WITH_ERROR";
            case 6:
                return "CLOSING";
            case 7:
                return "REOPENING_QUIRK";
            case 8:
                return "REOPENING";
            case 9:
                return "OPENING";
            case 10:
                return "OPENED";
            case 11:
                return "CONFIGURED";
            default:
                throw null;
        }
    }

    public static /* synthetic */ int m(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static /* synthetic */ String n(int i) {
        switch (i) {
            case 1:
                return "RELEASED";
            case 2:
                return "RELEASING";
            case 3:
                return "INITIALIZED";
            case 4:
                return "PENDING_OPEN";
            case 5:
                return "OPENING_WITH_ERROR";
            case 6:
                return "CLOSING";
            case 7:
                return "REOPENING_QUIRK";
            case 8:
                return "REOPENING";
            case 9:
                return "OPENING";
            case 10:
                return "OPENED";
            case 11:
                return "CONFIGURED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String o(int i) {
        switch (i) {
            case 1:
                return "UNINITIALIZED";
            case 2:
                return "RELEASED";
            case 3:
                return "INITIALIZED";
            case 4:
                return "GET_SURFACE";
            case 5:
                return "RELEASING";
            case 6:
                return "CLOSED";
            case 7:
                return "OPENING";
            case 8:
                return "OPENED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ int[] p(int i) {
        int[] iArr = new int[i];
        System.arraycopy(f33326a, 0, iArr, 0, i);
        return iArr;
    }
}
