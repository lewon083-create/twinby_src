package r7;

import java.util.ArrayList;
import java.util.Iterator;
import l7.n;
import u7.j;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f32267a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f32268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s7.d f32269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f32270d;

    public c(s7.d dVar) {
        this.f32269c = dVar;
    }

    public abstract boolean a(j jVar);

    public abstract boolean b(Object obj);

    public final void c(Iterable iterable) {
        this.f32267a.clear();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            if (a(jVar)) {
                this.f32267a.add(jVar.f34330a);
            }
        }
        if (this.f32267a.isEmpty()) {
            this.f32269c.b(this);
        } else {
            s7.d dVar = this.f32269c;
            synchronized (dVar.f32789c) {
                try {
                    if (dVar.f32790d.add(this)) {
                        if (dVar.f32790d.size() == 1) {
                            dVar.f32791e = dVar.a();
                            n.g().e(s7.d.f32786f, String.format("%s: initial state = %s", dVar.getClass().getSimpleName(), dVar.f32791e), new Throwable[0]);
                            dVar.d();
                        }
                        Object obj = dVar.f32791e;
                        this.f32268b = obj;
                        d(this.f32270d, obj);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        d(this.f32270d, this.f32268b);
    }

    public final void d(b bVar, Object obj) {
        if (this.f32267a.isEmpty() || bVar == null) {
            return;
        }
        if (obj == null || b(obj)) {
            ArrayList arrayList = this.f32267a;
            q7.c cVar = (q7.c) bVar;
            synchronized (cVar.f31786c) {
                try {
                    q7.b bVar2 = cVar.f31784a;
                    if (bVar2 != null) {
                        bVar2.e(arrayList);
                    }
                } finally {
                }
            }
            return;
        }
        ArrayList<String> arrayList2 = this.f32267a;
        q7.c cVar2 = (q7.c) bVar;
        synchronized (cVar2.f31786c) {
            try {
                ArrayList arrayList3 = new ArrayList();
                for (String str : arrayList2) {
                    if (cVar2.a(str)) {
                        n.g().e(q7.c.f31783d, "Constraints met for " + str, new Throwable[0]);
                        arrayList3.add(str);
                    }
                }
                q7.b bVar3 = cVar2.f31784a;
                if (bVar3 != null) {
                    bVar3.f(arrayList3);
                }
            } finally {
            }
        }
    }
}
