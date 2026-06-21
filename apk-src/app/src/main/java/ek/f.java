package ek;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements Iterator, xj.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Iterator f16397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f16399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Sequence f16400f;

    public f(g gVar) {
        this.f16396b = 0;
        this.f16400f = gVar;
        this.f16397c = gVar.f16401a.iterator();
        this.f16398d = -1;
    }

    public void a() {
        Object next;
        g gVar = (g) this.f16400f;
        do {
            Iterator it = this.f16397c;
            if (!it.hasNext()) {
                this.f16398d = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) gVar.f16403c.invoke(next)).booleanValue() != gVar.f16402b);
        this.f16399e = next;
        this.f16398d = 1;
    }

    public boolean b() {
        Iterator it;
        Iterator it2 = (Iterator) this.f16399e;
        if (it2 != null && it2.hasNext()) {
            this.f16398d = 1;
            return true;
        }
        do {
            Iterator it3 = this.f16397c;
            if (!it3.hasNext()) {
                this.f16398d = 2;
                this.f16399e = null;
                return false;
            }
            Object next = it3.next();
            h hVar = (h) this.f16400f;
            it = (Iterator) hVar.f16406c.invoke(hVar.f16405b.invoke(next));
        } while (!it.hasNext());
        this.f16399e = it;
        this.f16398d = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f16396b) {
            case 0:
                if (this.f16398d == -1) {
                    a();
                }
                return this.f16398d == 1;
            default:
                int i = this.f16398d;
                if (i == 1) {
                    return true;
                }
                if (i == 2) {
                    return false;
                }
                return b();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f16396b) {
            case 0:
                if (this.f16398d == -1) {
                    a();
                }
                if (this.f16398d == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f16399e;
                this.f16399e = null;
                this.f16398d = -1;
                return obj;
            default:
                int i = this.f16398d;
                if (i == 2) {
                    throw new NoSuchElementException();
                }
                if (i == 0 && !b()) {
                    throw new NoSuchElementException();
                }
                this.f16398d = 0;
                Iterator it = (Iterator) this.f16399e;
                Intrinsics.b(it);
                return it.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f16396b) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public f(h hVar) {
        this.f16396b = 1;
        this.f16400f = hVar;
        this.f16397c = hVar.f16404a.iterator();
    }
}
