package jj;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements ListIterator, xj.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26636b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26639e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kotlin.collections.h f26640f;

    public b(e list, int i) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f26640f = list;
        this.f26637c = i;
        this.f26638d = -1;
        this.f26639e = ((AbstractList) list).modCount;
    }

    public void a() {
        if (((AbstractList) ((c) this.f26640f).f26645f).modCount != this.f26639e) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f26636b) {
            case 0:
                a();
                c cVar = (c) this.f26640f;
                int i = this.f26637c;
                this.f26637c = i + 1;
                cVar.add(i, obj);
                this.f26638d = -1;
                this.f26639e = ((AbstractList) cVar).modCount;
                break;
            default:
                b();
                e eVar = (e) this.f26640f;
                int i10 = this.f26637c;
                this.f26637c = i10 + 1;
                eVar.add(i10, obj);
                this.f26638d = -1;
                this.f26639e = ((AbstractList) eVar).modCount;
                break;
        }
    }

    public void b() {
        if (((AbstractList) ((e) this.f26640f)).modCount != this.f26639e) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f26636b) {
            case 0:
                if (this.f26637c < ((c) this.f26640f).f26643d) {
                }
                break;
            default:
                if (this.f26637c < ((e) this.f26640f).f26649c) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f26636b) {
            case 0:
                if (this.f26637c > 0) {
                }
                break;
            default:
                if (this.f26637c > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f26636b) {
            case 0:
                a();
                int i = this.f26637c;
                c cVar = (c) this.f26640f;
                if (i >= cVar.f26643d) {
                    throw new NoSuchElementException();
                }
                this.f26637c = i + 1;
                this.f26638d = i;
                return cVar.f26641b[cVar.f26642c + i];
            default:
                b();
                int i10 = this.f26637c;
                e eVar = (e) this.f26640f;
                if (i10 >= eVar.f26649c) {
                    throw new NoSuchElementException();
                }
                this.f26637c = i10 + 1;
                this.f26638d = i10;
                return eVar.f26648b[i10];
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f26636b) {
        }
        return this.f26637c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f26636b) {
            case 0:
                a();
                int i = this.f26637c;
                if (i <= 0) {
                    throw new NoSuchElementException();
                }
                int i10 = i - 1;
                this.f26637c = i10;
                this.f26638d = i10;
                c cVar = (c) this.f26640f;
                return cVar.f26641b[cVar.f26642c + i10];
            default:
                b();
                int i11 = this.f26637c;
                if (i11 <= 0) {
                    throw new NoSuchElementException();
                }
                int i12 = i11 - 1;
                this.f26637c = i12;
                this.f26638d = i12;
                return ((e) this.f26640f).f26648b[i12];
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.f26636b) {
            case 0:
                i = this.f26637c;
                break;
            default:
                i = this.f26637c;
                break;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f26636b) {
            case 0:
                c cVar = (c) this.f26640f;
                a();
                int i = this.f26638d;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                cVar.c(i);
                this.f26637c = this.f26638d;
                this.f26638d = -1;
                this.f26639e = ((AbstractList) cVar).modCount;
                return;
            default:
                e eVar = (e) this.f26640f;
                b();
                int i10 = this.f26638d;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                eVar.c(i10);
                this.f26637c = this.f26638d;
                this.f26638d = -1;
                this.f26639e = ((AbstractList) eVar).modCount;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f26636b) {
            case 0:
                a();
                int i = this.f26638d;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((c) this.f26640f).set(i, obj);
                return;
            default:
                b();
                int i10 = this.f26638d;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((e) this.f26640f).set(i10, obj);
                return;
        }
    }

    public b(c list, int i) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f26640f = list;
        this.f26637c = i;
        this.f26638d = -1;
        this.f26639e = ((AbstractList) list).modCount;
    }
}
