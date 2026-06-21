package zc;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements p, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient Object f46235b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f46236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile transient boolean f46237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient Object f46238e;

    public q(p pVar) {
        this.f46236c = pVar;
    }

    @Override // zc.p
    public final Object get() {
        if (!this.f46237d) {
            synchronized (this.f46235b) {
                try {
                    if (!this.f46237d) {
                        Object obj = this.f46236c.get();
                        this.f46238e = obj;
                        this.f46237d = true;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f46238e;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (this.f46237d) {
            obj = "<supplier that returned " + this.f46238e + ">";
        } else {
            obj = this.f46236c;
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
