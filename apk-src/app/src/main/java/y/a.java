package y;

import a0.t1;
import com.google.android.gms.internal.auth.g;
import g0.d0;
import g0.l1;
import g0.o0;
import i0.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import u.p;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements l1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f36292b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f36291a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashMap f36294d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public HashSet f36295e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f36296f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f36297g = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f36293c = new ArrayList();

    public a(p pVar) {
        this.f36292b = pVar;
        try {
            a(Arrays.asList(pVar.c()));
        } catch (o0 | u.a e3) {
            g.l("Camera2CameraCoordinator", "Failed to get concurrent camera ids", e3);
        }
    }

    @Override // g0.l1
    public final void a(List list) throws o0 {
        HashMap map = new HashMap();
        HashSet hashSet = new HashSet();
        try {
            for (Set set : this.f36292b.f33976a.x()) {
                if (list.containsAll(set)) {
                    ArrayList arrayList = new ArrayList(set);
                    if (arrayList.size() >= 2) {
                        String str = (String) arrayList.get(0);
                        String str2 = (String) arrayList.get(1);
                        try {
                            if (o.z(str, this.f36292b) && o.z(str2, this.f36292b)) {
                                hashSet.add(new HashSet(Arrays.asList(str, str2)));
                                if (!map.containsKey(str)) {
                                    map.put(str, new ArrayList());
                                }
                                ((List) map.get(str)).add(str2);
                                if (!map.containsKey(str2)) {
                                    map.put(str2, new ArrayList());
                                }
                                ((List) map.get(str2)).add(str);
                            }
                        } catch (t1 unused) {
                            g.e("Camera2CameraCoordinator", "Concurrent camera id pair: (" + str + ", " + str + ") is not backward compatible");
                        }
                    }
                }
            }
            synchronized (this.f36291a) {
                this.f36294d = map;
                this.f36295e = hashSet;
                g.e("Camera2CameraCoordinator", "Updated concurrent camera map: " + this.f36294d);
            }
        } catch (u.a e3) {
            throw new o0("Failed to retrieve concurrent camera id info.", e3);
        }
    }

    public final int b() {
        int i;
        synchronized (this.f36291a) {
            i = this.f36297g;
        }
        return i;
    }

    public final String c(String str) {
        synchronized (this.f36291a) {
            try {
                if (!this.f36294d.containsKey(str)) {
                    return null;
                }
                List<String> list = (List) this.f36294d.get(str);
                if (list == null) {
                    return null;
                }
                for (String str2 : list) {
                    Iterator it = this.f36296f.iterator();
                    while (it.hasNext()) {
                        d0 d0VarB = ((d0) it.next()).b();
                        f2.g.a("CameraInfo doesn't contain Camera2 implementation.", d0VarB instanceof t.d0);
                        if (str2.equals(((t.d0) d0VarB).f33004c.f45774a.f33002a)) {
                            return str2;
                        }
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
