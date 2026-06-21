package x0;

import android.util.Range;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f35659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap f35660c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f35661a = new HashMap();

    static {
        HashMap map = new HashMap();
        f35659b = map;
        map.put(g.f35587h, Range.create(2160, 4319));
        map.put(g.f35586g, Range.create(1080, 1439));
        map.put(g.f35585f, Range.create(720, 1079));
        map.put(g.f35584e, Range.create(241, 719));
        HashMap map2 = new HashMap();
        f35660c = map2;
        map2.put(0, i0.b.f20759a);
        map2.put(1, i0.b.f20761c);
    }

    public o(List list, HashMap map) {
        HashMap map2;
        Integer num;
        g gVar;
        HashMap map3 = f35659b;
        Iterator it = map3.keySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            map2 = f35660c;
            if (!zHasNext) {
                break;
            }
            g gVar2 = (g) it.next();
            this.f35661a.put(new f(gVar2, -1), new ArrayList());
            Iterator it2 = map2.keySet().iterator();
            while (it2.hasNext()) {
                this.f35661a.put(new f(gVar2, ((Integer) it2.next()).intValue()), new ArrayList());
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list2 = (List) this.f35661a.get(new f((g) entry.getKey(), -1));
            Objects.requireNonNull(list2);
            list2.add((Size) entry.getValue());
        }
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            Size size = (Size) it3.next();
            Iterator it4 = map3.entrySet().iterator();
            while (true) {
                num = null;
                if (!it4.hasNext()) {
                    gVar = null;
                    break;
                }
                Map.Entry entry2 = (Map.Entry) it4.next();
                if (((Range) entry2.getValue()).contains(Integer.valueOf(size.getHeight()))) {
                    gVar = (g) entry2.getKey();
                    break;
                }
            }
            if (gVar != null) {
                Iterator it5 = map2.entrySet().iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        break;
                    }
                    Map.Entry entry3 = (Map.Entry) it5.next();
                    if (i0.b.a(size, (Rational) entry3.getValue(), p0.b.f30755b)) {
                        num = (Integer) entry3.getKey();
                        break;
                    }
                }
                if (num != null) {
                    List list3 = (List) this.f35661a.get(new f(gVar, num.intValue()));
                    Objects.requireNonNull(list3);
                    list3.add(size);
                }
            }
        }
        for (Map.Entry entry4 : this.f35661a.entrySet()) {
            Size size2 = (Size) map.get(((f) entry4.getKey()).f35581a);
            if (size2 != null) {
                Size size3 = p0.b.f30754a;
                Collections.sort((List) entry4.getValue(), new d1.a(size2.getHeight() * size2.getWidth(), 1));
            }
        }
    }
}
