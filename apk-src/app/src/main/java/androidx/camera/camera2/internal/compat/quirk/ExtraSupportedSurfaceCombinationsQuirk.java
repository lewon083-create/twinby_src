package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import g0.l2;
import g0.m2;
import g0.o2;
import g0.p2;
import g0.w1;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class ExtraSupportedSurfaceCombinationsQuirk implements w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l2 f1225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l2 f1226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashSet f1227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashSet f1228d;

    static {
        l2 l2Var = new l2();
        o2 o2Var = o2.f19706c;
        m2 m2Var = m2.f19659d;
        l2Var.a(p2.a(o2Var, m2Var));
        o2 o2Var2 = o2.f19705b;
        m2 m2Var2 = m2.f19662g;
        l2Var.a(p2.a(o2Var2, m2Var2));
        m2 m2Var3 = m2.f19668n;
        l2Var.a(p2.a(o2Var, m2Var3));
        f1225a = l2Var;
        l2 l2Var2 = new l2();
        z.k(o2Var2, m2Var2, l2Var2, o2Var2, m2Var);
        l2Var2.a(p2.a(o2Var, m2Var3));
        f1226b = l2Var2;
        f1227c = new HashSet(Arrays.asList("PIXEL 6", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO", "PIXEL 9", "PIXEL 9 PRO", "PIXEL 9 PRO XL", "PIXEL 9 PRO FOLD"));
        f1228d = new HashSet(Arrays.asList("SM-S921", "SC-51E", "SCG25", "SM-S926", "SM-S928", "SC-52E", "SCG26", "SM-S931", "SM-S936", "SM-S937", "SM-S938", "SCG31", "SCG32", "SC-51F", "SC-52F"));
    }

    public static boolean e() {
        if (!"samsung".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        String upperCase = Build.MODEL.toUpperCase(Locale.US);
        Iterator it = f1228d.iterator();
        while (it.hasNext()) {
            if (upperCase.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }
}
