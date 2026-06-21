package f1;

import a0.i0;
import g0.j;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f16561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f16562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap f16563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap f16564d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashMap f16565e;

    static {
        HashMap map = new HashMap();
        f16561a = map;
        HashMap map2 = new HashMap();
        f16562b = map2;
        HashMap map3 = new HashMap();
        f16563c = map3;
        HashMap map4 = new HashMap();
        f16564d = map4;
        HashMap map5 = new HashMap();
        f16565e = map5;
        map.put(8, new HashSet(Collections.singletonList(8)));
        map.put(10, new HashSet(Collections.singletonList(10)));
        map.put(0, new HashSet(Arrays.asList(8, 10)));
        map2.put(0, new HashSet(Arrays.asList(0, 1, 2, 3, 4)));
        map2.put(1, new HashSet(Collections.singletonList(0)));
        map2.put(2, new HashSet(Arrays.asList(1, 2, 3, 4)));
        map2.put(3, new HashSet(Collections.singletonList(1)));
        map2.put(4, new HashSet(Collections.singletonList(2)));
        map2.put(5, new HashSet(Collections.singletonList(3)));
        map2.put(6, new HashSet(Collections.singletonList(4)));
        map3.put(8, 8);
        map3.put(10, 10);
        map4.put(0, 1);
        map4.put(1, 3);
        map4.put(2, 4);
        map4.put(3, 5);
        map4.put(4, 6);
        HashMap map6 = new HashMap();
        i0 i0Var = i0.f112d;
        map6.put(i0Var, 1);
        i0 i0Var2 = i0.f113e;
        map6.put(i0Var2, 2);
        i0 i0Var3 = i0.f114f;
        map6.put(i0Var3, 4096);
        i0 i0Var4 = i0.f115g;
        map6.put(i0Var4, 8192);
        HashMap map7 = new HashMap();
        map7.put(i0Var, 1);
        map7.put(i0Var2, 2);
        map7.put(i0Var3, 4096);
        map7.put(i0Var4, 8192);
        HashMap map8 = new HashMap();
        map8.put(i0Var, 1);
        map8.put(i0Var2, 4);
        map8.put(i0Var3, 4096);
        map8.put(i0Var4, 16384);
        HashMap map9 = new HashMap();
        map9.put(i0.f116h, 256);
        map9.put(i0.i, 512);
        map5.put("video/hevc", map6);
        map5.put("video/av01", map7);
        map5.put("video/x-vnd.on2.vp9", map8);
        map5.put("video/dolby-vision", map9);
    }

    public static boolean a(j jVar, i0 i0Var) {
        int i = jVar.f19621h;
        Set set = (Set) f16561a.get(Integer.valueOf(i0Var.f118b));
        if (set == null || !set.contains(Integer.valueOf(i))) {
            return false;
        }
        int i10 = jVar.f19622j;
        Set set2 = (Set) f16562b.get(Integer.valueOf(i0Var.f117a));
        return set2 != null && set2.contains(Integer.valueOf(i10));
    }
}
