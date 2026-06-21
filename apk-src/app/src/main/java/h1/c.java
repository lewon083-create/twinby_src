package h1;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Iterator, Map.Entry {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20322c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f20323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f20324e;

    public c(e eVar) {
        this.f20324e = eVar;
        this.f20321b = eVar.f20340d - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f20323d) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i = this.f20322c;
        e eVar = this.f20324e;
        return Intrinsics.a(key, eVar.f(i)) && Intrinsics.a(entry.getValue(), eVar.i(this.f20322c));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f20323d) {
            return this.f20324e.f(this.f20322c);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f20323d) {
            return this.f20324e.i(this.f20322c);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f20322c < this.f20321b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f20323d) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i = this.f20322c;
        e eVar = this.f20324e;
        Object objF = eVar.f(i);
        Object objI = eVar.i(this.f20322c);
        return (objF == null ? 0 : objF.hashCode()) ^ (objI != null ? objI.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f20322c++;
        this.f20323d = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f20323d) {
            throw new IllegalStateException();
        }
        this.f20324e.g(this.f20322c);
        this.f20322c--;
        this.f20321b--;
        this.f20323d = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f20323d) {
            return this.f20324e.h(this.f20322c, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
