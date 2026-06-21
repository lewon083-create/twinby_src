package i9;

import android.util.SparseArray;
import java.util.HashMap;
import l7.o;
import v8.d;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseArray f21222a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f21223b;

    static {
        HashMap map = new HashMap();
        f21223b = map;
        map.put(d.f34806b, 0);
        map.put(d.f34807c, 1);
        map.put(d.f34808d, 2);
        for (d dVar : map.keySet()) {
            f21222a.append(((Integer) f21223b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f21223b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i) {
        d dVar = (d) f21222a.get(i);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(o.i(i, "Unknown Priority for value "));
    }
}
