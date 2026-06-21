package jj;

import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class h implements Map.Entry, xj.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f26652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f26654d;

    public h(i map, int i) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.f26652b = map;
        this.f26653c = i;
        this.f26654d = map.i;
    }

    public final void a() {
        if (this.f26652b.i != this.f26654d) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return Intrinsics.a(entry.getKey(), getKey()) && Intrinsics.a(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.f26652b.f26657b[this.f26653c];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.f26652b.f26658c;
        Intrinsics.b(objArr);
        return objArr[this.f26653c];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        i iVar = this.f26652b;
        iVar.c();
        Object[] objArr = iVar.f26658c;
        if (objArr == null) {
            int length = iVar.f26657b.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            iVar.f26658c = objArr;
        }
        int i = this.f26653c;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getKey());
        sb2.append('=');
        sb2.append(getValue());
        return sb2.toString();
    }
}
