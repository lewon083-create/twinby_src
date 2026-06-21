package zc;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o4.l f46239e = new o4.l(3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f46240b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile p f46241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f46242d;

    public r(p pVar) {
        this.f46241c = pVar;
    }

    @Override // zc.p
    public final Object get() {
        p pVar = this.f46241c;
        o4.l lVar = f46239e;
        if (pVar != lVar) {
            synchronized (this.f46240b) {
                try {
                    if (this.f46241c != lVar) {
                        Object obj = this.f46241c.get();
                        this.f46242d = obj;
                        this.f46241c = lVar;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f46242d;
    }

    public final String toString() {
        Object obj = this.f46241c;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (obj == f46239e) {
            obj = "<supplier that returned " + this.f46242d + ">";
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
