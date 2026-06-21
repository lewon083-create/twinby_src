package xc;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f36074d = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile g f36075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Object f36076c;

    /* JADX WARN: Multi-variable type inference failed */
    public static f b(g gVar) {
        if (gVar instanceof f) {
            return (f) gVar;
        }
        f fVar = new f();
        fVar.f36076c = f36074d;
        fVar.f36075b = gVar;
        return fVar;
    }

    @Override // xc.h
    public final Object a() {
        Object objA;
        Object obj = this.f36076c;
        Object obj2 = f36074d;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objA = this.f36076c;
                if (objA == obj2) {
                    objA = this.f36075b.a();
                    Object obj3 = this.f36076c;
                    if (obj3 != obj2 && obj3 != objA) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objA + ". This is likely due to a circular dependency.");
                    }
                    this.f36076c = objA;
                    this.f36075b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return objA;
    }
}
