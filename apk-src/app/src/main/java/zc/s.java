package zc;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements p, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f46243b;

    public s(Object obj) {
        this.f46243b = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            return Objects.equals(this.f46243b, ((s) obj).f46243b);
        }
        return false;
    }

    @Override // zc.p
    public final Object get() {
        return this.f46243b;
    }

    public final int hashCode() {
        return Objects.hash(this.f46243b);
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.f46243b + ")";
    }
}
