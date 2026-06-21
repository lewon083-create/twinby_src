package jj;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class j extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f26669b;

    public j(i backing) {
        Intrinsics.checkNotNullParameter(backing, "backing");
        this.f26669b = backing;
    }

    @Override // kotlin.collections.i
    public final int a() {
        return this.f26669b.f26664j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Map.Entry element = (Map.Entry) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // jj.a
    public final boolean c(Map.Entry element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f26669b.f(element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f26669b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.f26669b.e(elements);
    }

    @Override // jj.a
    public final boolean e(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "element");
        i iVar = this.f26669b;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(entry, "entry");
        iVar.c();
        int iH = iVar.h(entry.getKey());
        if (iH < 0) {
            return false;
        }
        Object[] objArr = iVar.f26658c;
        Intrinsics.b(objArr);
        if (!Intrinsics.a(objArr[iH], entry.getValue())) {
            return false;
        }
        iVar.l(iH);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f26669b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        i map = this.f26669b;
        map.getClass();
        Intrinsics.checkNotNullParameter(map, "map");
        return new g(map, 0);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f26669b.c();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f26669b.c();
        return super.retainAll(elements);
    }
}
