package g0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f19646a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f19647b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f19648c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j1.k f19649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j1.h f19650e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t.p f19651f;

    @Override // g0.l1
    public final void a(List list) {
        HashSet<String> hashSet;
        HashMap map = new HashMap();
        synchronized (this.f19646a) {
            hashSet = new HashSet(list);
            hashSet.removeAll(this.f19647b.keySet());
        }
        try {
            for (String str : hashSet) {
                map.put(str, this.f19651f.c(str));
            }
            synchronized (this.f19646a) {
                try {
                    HashSet hashSet2 = new HashSet(this.f19647b.keySet());
                    hashSet2.removeAll(list);
                    ArrayList<f0> arrayList = new ArrayList();
                    Iterator it = hashSet2.iterator();
                    while (it.hasNext()) {
                        arrayList.add((f0) this.f19647b.get((String) it.next()));
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (String str2 : (ArrayList) list) {
                        if (this.f19647b.containsKey(str2)) {
                            linkedHashMap.put(str2, (f0) this.f19647b.get(str2));
                        } else {
                            linkedHashMap.put(str2, (f0) map.get(str2));
                        }
                    }
                    this.f19647b.clear();
                    this.f19647b.putAll(linkedHashMap);
                    for (f0 f0Var : arrayList) {
                        if (f0Var != null) {
                            f0Var.m();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (a0.x e3) {
            throw new o0("Failed to create CameraInternal", e3);
        }
    }

    public final f0 b(String str) {
        f0 f0Var;
        synchronized (this.f19646a) {
            try {
                f0Var = (f0) this.f19647b.get(str);
                if (f0Var == null) {
                    throw new IllegalArgumentException("Invalid camera: " + str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f0Var;
    }

    public final LinkedHashSet c() {
        LinkedHashSet linkedHashSet;
        synchronized (this.f19646a) {
            linkedHashSet = new LinkedHashSet(this.f19647b.values());
        }
        return linkedHashSet;
    }

    public final void d(t.p pVar) {
        this.f19651f = pVar;
        synchronized (this.f19646a) {
            try {
                for (String str : pVar.a()) {
                    com.google.android.gms.internal.auth.g.e("CameraRepository", "Added camera: " + str);
                    f0 f0Var = (f0) this.f19647b.put(str, pVar.c(str));
                    if (f0Var != null) {
                        f0Var.release();
                    }
                }
            } catch (a0.x e3) {
                throw new a0.t1(e3);
            }
        }
    }
}
