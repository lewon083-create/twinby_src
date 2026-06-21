package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Comparable f1395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f1396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e1 f1397d;

    public f1(e1 e1Var, Comparable comparable, Object obj) {
        this.f1397d = e1Var;
        this.f1395b = comparable;
        this.f1396c = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f1395b.compareTo(((f1) obj).f1395b);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f1395b;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.f1396c;
                    Object value = entry.getValue();
                    if (obj2 == null ? value == null : obj2.equals(value)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f1395b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f1396c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f1395b;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f1396c;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f1397d.b();
        Object obj2 = this.f1396c;
        this.f1396c = obj;
        return obj2;
    }

    public final String toString() {
        return this.f1395b + "=" + this.f1396c;
    }
}
