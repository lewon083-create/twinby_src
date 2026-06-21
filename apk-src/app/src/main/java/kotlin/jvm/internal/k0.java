package kotlin.jvm.internal;

import java.util.HashMap;
import java.util.Map;
import kotlin.Function;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class k0 {
    public static Map a(HashMap map) {
        if (!(map instanceof xj.a) || (map instanceof xj.c)) {
            return map;
        }
        e(map, "kotlin.collections.MutableMap");
        throw null;
    }

    public static void b(int i, Object obj) {
        if (obj == null || c(i, obj)) {
            return;
        }
        e(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    public static boolean c(int i, Object obj) {
        if (obj instanceof Function) {
            if ((obj instanceof n ? ((n) obj).getArity() : obj instanceof Function0 ? 0 : obj instanceof Function1 ? 1 : obj instanceof Function2 ? 2 : obj instanceof wj.n ? 3 : obj instanceof wj.p ? 5 : -1) == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean d(Object obj) {
        if (obj instanceof Map) {
            return !(obj instanceof xj.a) || (obj instanceof xj.c);
        }
        return false;
    }

    public static void e(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(gf.a.k(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        Intrinsics.e(classCastException, k0.class.getName());
        throw classCastException;
    }
}
