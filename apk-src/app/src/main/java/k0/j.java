package k0;

import a0.b1;
import i0.o;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public static void a(ed.d dVar, c cVar, Executor executor) {
        cVar.getClass();
        dVar.a(new i(0, dVar, cVar), executor);
    }

    public static m b(List list) {
        return new m(new ArrayList(list), true, hl.d.j());
    }

    public static Object c(Future future) {
        f2.g.h("Future was expected to be done, " + future, future.isDone());
        return d(future);
    }

    public static Object d(Future future) {
        Object obj;
        boolean z5 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z5 = true;
            } catch (Throwable th2) {
                if (z5) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z5) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static l e(Object obj) {
        return obj == null ? l.f26777d : new l(0, obj);
    }

    public static ed.d f(ed.d dVar) {
        dVar.getClass();
        return dVar.isDone() ? dVar : o.w(new h(0, dVar));
    }

    public static void g(ed.d dVar, j1.h hVar) {
        h(true, dVar, hVar, hl.d.j());
    }

    public static void h(boolean z5, ed.d dVar, j1.h hVar, j0.b bVar) {
        dVar.getClass();
        hVar.getClass();
        bVar.getClass();
        a(dVar, new b1(23, hVar), bVar);
        if (z5) {
            hVar.a(new ac.g(13, dVar), hl.d.j());
        }
    }

    public static m i(ArrayList arrayList) {
        return new m(new ArrayList(arrayList), false, hl.d.j());
    }

    public static b j(ed.d dVar, a aVar, Executor executor) {
        b bVar = new b(aVar, dVar);
        dVar.a(bVar, executor);
        return bVar;
    }
}
