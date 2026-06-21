package v;

import a0.i0;
import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f34612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f34613b;

    static {
        i0 i0Var;
        HashMap map = new HashMap();
        f34612a = map;
        HashMap map2 = new HashMap();
        f34613b = map2;
        i0 i0Var2 = i0.f112d;
        map.put(1L, i0Var2);
        map2.put(i0Var2, Collections.singletonList(1L));
        map.put(2L, i0.f113e);
        map2.put((i0) map.get(2L), Collections.singletonList(2L));
        i0 i0Var3 = i0.f114f;
        map.put(4L, i0Var3);
        map2.put(i0Var3, Collections.singletonList(4L));
        i0 i0Var4 = i0.f115g;
        map.put(8L, i0Var4);
        map2.put(i0Var4, Collections.singletonList(8L));
        List listAsList = Arrays.asList(64L, 128L, 16L, 32L);
        Iterator it = listAsList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            i0Var = i0.f116h;
            if (!zHasNext) {
                break;
            }
            f34612a.put((Long) it.next(), i0Var);
        }
        f34613b.put(i0Var, listAsList);
        List listAsList2 = Arrays.asList(1024L, 2048L, 256L, 512L);
        Iterator it2 = listAsList2.iterator();
        while (true) {
            boolean zHasNext2 = it2.hasNext();
            i0 i0Var5 = i0.i;
            if (!zHasNext2) {
                f34613b.put(i0Var5, listAsList2);
                return;
            } else {
                f34612a.put((Long) it2.next(), i0Var5);
            }
        }
    }

    public static Long a(i0 i0Var, DynamicRangeProfiles dynamicRangeProfiles) {
        List<Long> list = (List) f34613b.get(i0Var);
        if (list == null) {
            return null;
        }
        Set supportedProfiles = dynamicRangeProfiles.getSupportedProfiles();
        for (Long l10 : list) {
            if (supportedProfiles.contains(l10)) {
                return l10;
            }
        }
        return null;
    }
}
