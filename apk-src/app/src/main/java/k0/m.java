package k0;

import i0.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements ed.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f26780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f26781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f26782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicInteger f26783e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j1.k f26784f = o.w(new a7.l(27, this));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public j1.h f26785g;

    public m(ArrayList arrayList, boolean z5, j0.b bVar) {
        this.f26780b = arrayList;
        this.f26781c = new ArrayList(arrayList.size());
        this.f26782d = z5;
        this.f26783e = new AtomicInteger(arrayList.size());
        a(new ac.g(14, this), hl.d.j());
        if (this.f26780b.isEmpty()) {
            this.f26785g.b(new ArrayList(this.f26781c));
            return;
        }
        for (int i = 0; i < this.f26780b.size(); i++) {
            this.f26781c.add(null);
        }
        ArrayList arrayList2 = this.f26780b;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            ed.d dVar = (ed.d) arrayList2.get(i10);
            dVar.a(new ac.a(this, i10, dVar, 1), bVar);
        }
    }

    @Override // ed.d
    public final void a(Runnable runnable, Executor executor) {
        this.f26784f.f26173c.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z5) {
        ArrayList arrayList = this.f26780b;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((ed.d) it.next()).cancel(z5);
            }
        }
        return this.f26784f.cancel(z5);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return (List) this.f26784f.f26173c.get(j10, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f26784f.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f26784f.f26173c.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        ArrayList<ed.d> arrayList = this.f26780b;
        if (arrayList != null && !isDone()) {
            loop0: for (ed.d dVar : arrayList) {
                while (!dVar.isDone()) {
                    try {
                        dVar.get();
                    } catch (Error e3) {
                        throw e3;
                    } catch (InterruptedException e7) {
                        throw e7;
                    } catch (Throwable unused) {
                        if (this.f26782d) {
                            return (List) this.f26784f.f26173c.get();
                        }
                    }
                }
            }
        }
        return (List) this.f26784f.f26173c.get();
    }
}
