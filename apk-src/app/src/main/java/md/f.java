package md;

import android.util.Log;
import com.google.android.gms.internal.measurement.d4;
import com.google.android.gms.internal.measurement.j4;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import m3.c0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final com.google.firebase.messaging.k f28840h = new com.google.firebase.messaging.k(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f28841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f28842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f28843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f28844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k f28845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReference f28846f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final le.a f28847g;

    public f(ArrayList arrayList, ArrayList arrayList2, le.a aVar) {
        nd.k kVar = nd.k.f29327b;
        this.f28841a = new HashMap();
        this.f28842b = new HashMap();
        this.f28843c = new HashMap();
        this.f28844d = new HashSet();
        this.f28846f = new AtomicReference();
        k kVar2 = new k();
        this.f28845e = kVar2;
        this.f28847g = aVar;
        ArrayList<b> arrayList3 = new ArrayList();
        arrayList3.add(b.c(kVar2, k.class, vd.d.class, vd.c.class));
        arrayList3.add(b.c(this, f.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar != null) {
                arrayList3.add(bVar);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next());
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((yd.a) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.f28847g.i(componentRegistrar));
                        it3.remove();
                    }
                } catch (l e3) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e3);
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                Object[] array = ((b) it4.next()).f28832b.toArray();
                int length = array.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        Object obj = array[i];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f28844d.contains(obj.toString())) {
                                it4.remove();
                                break;
                            }
                            this.f28844d.add(obj.toString());
                        }
                        i++;
                    }
                }
            }
            if (this.f28841a.isEmpty()) {
                d4.f(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f28841a.keySet());
                arrayList6.addAll(arrayList3);
                d4.f(arrayList6);
            }
            for (b bVar2 : arrayList3) {
                this.f28841a.put(bVar2, new m(new fd.c(1, this, bVar2)));
            }
            arrayList5.addAll(i(arrayList3));
            arrayList5.addAll(j());
            h();
        }
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            ((Runnable) it5.next()).run();
        }
        Boolean bool = (Boolean) this.f28846f.get();
        if (bool != null) {
            g(this.f28841a, bool.booleanValue());
        }
    }

    @Override // md.c
    public final synchronized yd.a c(q qVar) {
        n nVar = (n) this.f28843c.get(qVar);
        if (nVar != null) {
            return nVar;
        }
        return f28840h;
    }

    @Override // md.c
    public final synchronized yd.a f(q qVar) {
        j4.e(qVar, "Null interface requested.");
        return (yd.a) this.f28842b.get(qVar);
    }

    public final void g(HashMap map, boolean z5) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : map.entrySet()) {
            b bVar = (b) entry.getKey();
            yd.a aVar = (yd.a) entry.getValue();
            int i = bVar.f28834d;
            if (i == 1 || (i == 2 && z5)) {
                aVar.get();
            }
        }
        k kVar = this.f28845e;
        synchronized (kVar) {
            try {
                arrayDeque = kVar.f28857b;
                if (arrayDeque != null) {
                    kVar.f28857b = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                kVar.a((vd.a) it.next());
            }
        }
    }

    public final void h() {
        for (b bVar : this.f28841a.keySet()) {
            for (i iVar : bVar.f28833c) {
                if (iVar.f28854b == 2 && !this.f28843c.containsKey(iVar.f28853a)) {
                    HashMap map = this.f28843c;
                    q qVar = iVar.f28853a;
                    Set set = Collections.EMPTY_SET;
                    n nVar = new n();
                    nVar.f28863b = null;
                    nVar.f28862a = Collections.newSetFromMap(new ConcurrentHashMap());
                    nVar.f28862a.addAll(set);
                    map.put(qVar, nVar);
                } else if (this.f28842b.containsKey(iVar.f28853a)) {
                    continue;
                } else {
                    int i = iVar.f28854b;
                    if (i == 1) {
                        throw new j("Unsatisfied dependency for component " + bVar + ": " + iVar.f28853a);
                    }
                    if (i != 2) {
                        HashMap map2 = this.f28842b;
                        q qVar2 = iVar.f28853a;
                        kf.a aVar = o.f28864c;
                        com.google.firebase.messaging.k kVar = o.f28865d;
                        o oVar = new o();
                        oVar.f28866a = aVar;
                        oVar.f28867b = kVar;
                        map2.put(qVar2, oVar);
                    }
                }
            }
        }
    }

    public final ArrayList i(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f28835e == 0) {
                yd.a aVar = (yd.a) this.f28841a.get(bVar);
                for (q qVar : bVar.f28832b) {
                    HashMap map = this.f28842b;
                    if (map.containsKey(qVar)) {
                        arrayList2.add(new c0(1, (o) ((yd.a) map.get(qVar)), aVar));
                    } else {
                        map.put(qVar, aVar);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList j() {
        HashMap map = this.f28843c;
        ArrayList arrayList = new ArrayList();
        HashMap map2 = new HashMap();
        for (Map.Entry entry : this.f28841a.entrySet()) {
            b bVar = (b) entry.getKey();
            if (bVar.f28835e != 0) {
                yd.a aVar = (yd.a) entry.getValue();
                for (q qVar : bVar.f28832b) {
                    if (!map2.containsKey(qVar)) {
                        map2.put(qVar, new HashSet());
                    }
                    ((Set) map2.get(qVar)).add(aVar);
                }
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (map.containsKey(entry2.getKey())) {
                n nVar = (n) map.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new c0(2, nVar, (yd.a) it.next()));
                }
            } else {
                q qVar2 = (q) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                n nVar2 = new n();
                nVar2.f28863b = null;
                nVar2.f28862a = Collections.newSetFromMap(new ConcurrentHashMap());
                nVar2.f28862a.addAll(set);
                map.put(qVar2, nVar2);
            }
        }
        return arrayList;
    }
}
