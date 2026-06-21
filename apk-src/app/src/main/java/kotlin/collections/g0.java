package kotlin.collections;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class g0 implements Map, xj.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f27482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f27483c;

    public g0(LinkedHashMap map, Function1 function1) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(function1, "default");
        this.f27482b = map;
        this.f27483c = function1;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f27482b.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f27482b.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.f27482b.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return this.f27482b.equals(obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f27482b.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f27482b.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f27482b.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f27482b.keySet();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f27482b.size();
    }

    public final String toString() {
        return this.f27482b.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f27482b.values();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
