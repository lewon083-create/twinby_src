package androidx.lifecycle;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f1546b;

    public d(int i, Method method) {
        this.f1545a = i;
        this.f1546b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f1545a == dVar.f1545a && this.f1546b.getName().equals(dVar.f1546b.getName());
    }

    public final int hashCode() {
        return this.f1546b.getName().hashCode() + (this.f1545a * 31);
    }
}
