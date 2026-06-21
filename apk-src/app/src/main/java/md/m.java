package md;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements yd.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f28859c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f28860a = f28859c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile yd.a f28861b;

    public m(yd.a aVar) {
        this.f28861b = aVar;
    }

    @Override // yd.a
    public final Object get() {
        Object obj;
        Object obj2 = this.f28860a;
        Object obj3 = f28859c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f28860a;
                if (obj == obj3) {
                    obj = this.f28861b.get();
                    this.f28860a = obj;
                    this.f28861b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }
}
