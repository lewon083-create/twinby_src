package s2;

import com.google.android.gms.internal.measurement.h5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.i0;
import kotlin.collections.j0;
import kotlin.collections.t;
import kotlin.jvm.internal.Intrinsics;
import wj.n;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends oj.i implements n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ r2.e f32427l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ t2.b f32428m;

    @Override // wj.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        j jVar = new j(3, (mj.a) obj3);
        jVar.f32427l = (r2.e) obj;
        jVar.f32428m = (t2.b) obj2;
        return jVar.invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        nj.a aVar = nj.a.f29512b;
        h5.E(obj);
        r2.e eVar = this.f32427l;
        t2.b bVar = this.f32428m;
        Set setKeySet = bVar.a().keySet();
        ArrayList arrayList = new ArrayList(t.j(setKeySet, 10));
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((t2.e) it.next()).f33403a);
        }
        Map<String, ?> all = eVar.f32185a.getAll();
        Intrinsics.checkNotNullExpressionValue(all, "prefs.all");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, ?>> it2 = all.entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next = it2.next();
            String key = next.getKey();
            Set set = eVar.f32186b;
            if (set != null ? set.contains(key) : true) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(i0.b(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key2 = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Set) {
                value = CollectionsKt.V((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            if (!arrayList.contains((String) entry2.getKey())) {
                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
            }
        }
        t2.b bVar2 = new t2.b(j0.m(bVar.a()), false);
        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
            String name = (String) entry3.getKey();
            Object value2 = entry3.getValue();
            if (value2 instanceof Boolean) {
                t2.e key3 = ya.e.b(name);
                Intrinsics.checkNotNullParameter(key3, "key");
                bVar2.f(key3, value2);
            } else if (value2 instanceof Float) {
                Intrinsics.checkNotNullParameter(name, "name");
                t2.e key4 = new t2.e(name);
                Intrinsics.checkNotNullParameter(key4, "key");
                bVar2.f(key4, value2);
            } else if (value2 instanceof Integer) {
                Intrinsics.checkNotNullParameter(name, "name");
                t2.e key5 = new t2.e(name);
                Intrinsics.checkNotNullParameter(key5, "key");
                bVar2.f(key5, value2);
            } else if (value2 instanceof Long) {
                t2.e key6 = ya.e.r(name);
                Intrinsics.checkNotNullParameter(key6, "key");
                bVar2.f(key6, value2);
            } else if (value2 instanceof String) {
                t2.e key7 = ya.e.A(name);
                Intrinsics.checkNotNullParameter(key7, "key");
                bVar2.f(key7, value2);
            } else if (value2 instanceof Set) {
                t2.e key8 = ya.e.B(name);
                Intrinsics.checkNotNullParameter(key8, "key");
                bVar2.f(key8, (Set) value2);
            }
        }
        return new t2.b(j0.m(bVar2.a()), true);
    }
}
