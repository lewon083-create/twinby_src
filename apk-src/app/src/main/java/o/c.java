package o;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Map.Entry {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f29586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f29587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f29588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f29589e;

    public c(Object obj, Object obj2) {
        this.f29586b = obj;
        this.f29587c = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f29586b.equals(cVar.f29586b) && this.f29587c.equals(cVar.f29587c);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f29586b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f29587c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f29586b.hashCode() ^ this.f29587c.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f29586b + "=" + this.f29587c;
    }
}
