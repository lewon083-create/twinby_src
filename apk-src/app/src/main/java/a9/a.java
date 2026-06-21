package a9;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements hj.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f532c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile b f533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f534b;

    public static hj.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        a aVar = new a();
        aVar.f534b = f532c;
        aVar.f533a = bVar;
        return aVar;
    }

    @Override // hj.a
    public final Object get() {
        Object obj;
        Object obj2 = this.f534b;
        Object obj3 = f532c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f534b;
                if (obj == obj3) {
                    obj = this.f533a.get();
                    Object obj4 = this.f534b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f534b = obj;
                    this.f533a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }
}
